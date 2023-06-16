import os
import requests
import json

base_url = 'https://leetcode-cn.com'


def get_daily_problem_title():
    response = requests.post(base_url + "/graphql", json={
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
        """
    })
    leetcodeTitle = json.loads(response.text).get('data').get('todayRecord')[
        0].get("question").get('questionTitleSlug')

    return leetcodeTitle


def get_daily_problem_info(leetcodeTitle):
    # url = base_url + "/problems/" + leetcodeTitle
    response = requests.post(base_url + "/graphql",
                             json={"operationName": "questionData",
                                   "variables":
                                   {
                                       "titleSlug": leetcodeTitle
                                   },
                                   "query": "query questionData($titleSlug: String!) {  question(titleSlug: $titleSlug) {    questionId    questionFrontendId    boundTopicId    title    titleSlug    content    translatedTitle    translatedContent    isPaidOnly    difficulty    likes    dislikes    isLiked    similarQuestions    contributors {      username      profileUrl      avatarUrl      __typename    }    langToValidPlayground    topicTags {      name      slug      translatedName      __typename    }    companyTagStats    codeSnippets {      lang      langSlug      code      __typename    }    stats    hints    solution {      id      canSeeDetail      __typename    }    status    sampleTestCase    metaData    judgerAvailable    judgeType    mysqlSchemas    enableRunCode    envInfo    book {      id      bookName      pressName      source      shortDescription      fullDescription      bookImgUrl      pressImgUrl      productUrl      __typename    }    isSubscribed    isDailyQuestion    dailyRecordStatus    editorType    ugcQuestionId    style    __typename  }}"})
    # 转化成json格式
    jsonText = json.loads(response.text).get('data').get("question")
    return jsonText


def create_folder():
    import time
    folder_name = time.strftime("%Y_%m")
    if not os.path.exists(folder_name):
        os.makedirs(folder_name)
    return folder_name


def create_file(file_name, folder_name, problem_info, language='Go'):
    # 获取代码模板（codeSnippets == language）, get('code')
    codeSnippets = list(filter(lambda x: x.get('lang') == language,
                               problem_info.get('codeSnippets'))
                        )[0].get('code')
    with open(file_name, 'w') as f:
        # package, name = study{yyyy}_{mm}
        f.write('package study' + folder_name + '\n')
        f.write('\n')
        f.write(codeSnippets)
        f.write('\n')
        # end


if __name__ == '__main__':
    problem_name = get_daily_problem_title()
    problem_info = get_daily_problem_info(problem_name)
    folder_name = create_folder()
    file_name = os.path.join(folder_name, problem_name + ".go")
    create_file(file_name, folder_name, problem_info)
