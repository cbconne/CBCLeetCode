import os
import requests
import json
import random
import time

base_url = "https://leetcode.cn"


def get_daily_problem_title():
    response = requests.post(
        base_url + "/graphql",
        json={
            "operationName": "questionOfToday",
            "variables": {},
            "query": """
        query questionOfToday {
            todayRecord {
                question {
                    questionFrontendId
                    questionTitleSlug
                    __typename
                }
                lastSubmission {
                    id     __typename
                }
                date
                userStatus
                __typename
            }
        }
        """,
        },
    )
    leetcodeTitle = (
        json.loads(response.text)
        .get("data")
        .get("todayRecord")[0]
        .get("question")
        .get("questionTitleSlug")
    )

    return leetcodeTitle


def get_daily_problem_info(leetcodeTitle):
    # url = base_url + "/problems/" + leetcodeTitle
    response = requests.post(
        base_url + "/graphql",
        json={
            "operationName": "questionData",
            "variables": {"titleSlug": leetcodeTitle},
            "query": "query questionData($titleSlug: String!) {  question(titleSlug: $titleSlug) {    questionId    questionFrontendId    boundTopicId    title    titleSlug    content    translatedTitle    translatedContent    isPaidOnly    difficulty    likes    dislikes    isLiked    similarQuestions    contributors {      username      profileUrl      avatarUrl      __typename    }    langToValidPlayground    topicTags {      name      slug      translatedName      __typename    }    companyTagStats    codeSnippets {      lang      langSlug      code      __typename    }    stats    hints    solution {      id      canSeeDetail      __typename    }    status    sampleTestCase    metaData    judgerAvailable    judgeType    mysqlSchemas    enableRunCode    envInfo    book {      id      bookName      pressName      source      shortDescription      fullDescription      bookImgUrl      pressImgUrl      productUrl      __typename    }    isSubscribed    isDailyQuestion    dailyRecordStatus    editorType    ugcQuestionId    style    __typename  }}",
        },
    )
    # 转化成json格式
    jsonText = json.loads(response.text).get("data").get("question")
    return jsonText


def create_file(problem_name, problem_info, language="Go"):
    # 获取代码模板（codeSnippets == language）, get('code')
    codeSnippets = list(
        filter(lambda x: x.get("lang") == language, problem_info.get("codeSnippets"))
    )[0].get("code")
    folder_name: str = time.strftime("%Y_%m")

    if language == "Go":
        folder_name = f"go_{folder_name}"
        if not os.path.exists(folder_name):
            os.makedirs(folder_name)
        file_name = os.path.join(folder_name, problem_name + ".go")
        with open(file_name, "w") as f:
            f.write("package " + folder_name + "\n")
            f.write("\n")
            f.write(codeSnippets)
            f.write("\n")
            # end
    elif language == "Java":
        folder_name = f"java_{folder_name}"
        if not os.path.exists(folder_name):
            os.makedirs(folder_name)
        # problem_name transform to PascalCase
        problem_name = "".join([word.capitalize() for word in problem_name.split("-")])
        file_name = os.path.join(folder_name, problem_name + ".java")
        with open(file_name, "w") as f:
            # change codeSnippets "Solution" to file_name
            codeSnippets = codeSnippets.replace("Solution", problem_name)
            f.write(codeSnippets)
            # remove last line
            f.seek(0, 2)
            f.seek(f.tell() - 1, os.SEEK_SET)
            f.truncate()
            f.write("\n")
            f.write("    public static void main(String[] args) {")
            f.write("\n")
            f.write("\n")
            f.write("    }")
            f.write("\n")
            f.write("}")
            # end
    elif language == "Python3":
        folder_name = f"python_{folder_name}"
        if not os.path.exists(folder_name):
            os.makedirs(folder_name)
        file_name = os.path.join(folder_name, problem_name + ".py")
        with open(file_name, "w") as f:
            f.write(codeSnippets)
            f.write("\n")
            f.write("\n")
            f.write("if __name__ == '__main__':")
            f.write("\n")
            f.write("    solution = Solution()")
            f.write("\n")
            # end
    else:
        print("Language not supported!")


if __name__ == "__main__":
    # 使用的开发语言列表：
    languages = ["Go", "Java", "Python3"]
    # 从以上列表中随机抽取一个语言作为今天的开发语言，随机数种子使用今天的日期（yyyymmdd)
    seed = int(time.strftime("%Y%m%d"))
    random.seed(seed)
    today_language = random.choice(languages)
    print(f"Today's development language is : {today_language}")
    problem_name = get_daily_problem_title()
    problem_info = get_daily_problem_info(problem_name)
    create_file(problem_name, problem_info, today_language)
