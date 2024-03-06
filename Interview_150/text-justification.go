package Interview_150

func fullJustify(words []string, maxWidth int) []string {
	// 1. 初始化结果集
	res := make([]string, 0)

	// 2. 初始化当前行的单词集合
	curWords := make([]string, 0)

	// 3. 初始化当前行的长度
	curLen := 0

	// 4. 记录当前访问到的单词索引
	i := 0

	// 5. 遍历单词集合
	for i < len(words) {
		// 如果当前行的长度加上当前单词的长度加上单词之间的空格长度小于等于最大长度
		if curLen+len(curWords)+len(words[i]) <= maxWidth {
			// 将当前单词加入当前行的单词集合
			curWords = append(curWords, words[i])
			// 更新当前行的长度
			curLen += len(words[i])
			// 更新当前访问到的单词索引
			i++
			// 若当前已经访问到了最后一个单词
			if i == len(words) {
				// 说明当前为最后一行，进行最后一行的排版
				curLine := ""
				for j := 0; j < len(curWords); j++ {
					curLine += curWords[j]
					if j != len(curWords)-1 {
						curLine += " "
					}
				}
				for len(curLine) < maxWidth {
					curLine += " "
				}
				res = append(res, curLine)
			}
		} else {
			// 如果当前行的长度加上当前单词的长度加上单词之间的空格长度大于最大长度
			// 本行的单词集合已经确定，进行排版
			// 若当前行只有一个单词，左对齐
			if len(curWords) == 1 {
				curLine := curWords[0]
				for len(curLine) < maxWidth {
					curLine += " "
				}
				res = append(res, curLine)
			} else {
				// 若当前行有多个单词，进行排版
				// 当前行应当有的空格数
				spaceCount := maxWidth - curLen
				// 当前行的单词间隔
				spaceInterval := len(curWords) - 1
				// 当前行的空格字符串：空格数除以间隔数向下取整
				spaceLen := spaceCount / spaceInterval
				spaceStr := ""
				for j := 0; j < spaceLen; j++ {
					spaceStr += " "
				}
				// 当前行的空格余数：空格数除以间隔数取余
				spaceRemain := spaceCount % spaceInterval
				curSpaceLine := make([]string, len(curWords))
				for j := 0; j < len(curWords)-1; j++ {
					if spaceRemain > 0 {
						curSpaceLine[j] = spaceStr + " "
						spaceRemain--
					} else {
						curSpaceLine[j] = spaceStr
					}
				}
				curSpaceLine = append(curSpaceLine, "")
				curLine := ""
				for j := 0; j < len(curWords); j++ {
					curLine = curLine + curWords[j] + curSpaceLine[j]
				}
				res = append(res, curLine)
			}
			// 清空当前行的单词集合
			curWords = make([]string, 0)
			// 清空当前行的长度
			curLen = 0
		}
	}
	// 返回结果集
	return res
}

func FullJustifyTest() {
	words := []string{"This", "is", "an", "example", "of", "text", "justification."}
	maxWidth := 16
	res := fullJustify(words, maxWidth)
	for _, v := range res {
		println(v)
	}
}
