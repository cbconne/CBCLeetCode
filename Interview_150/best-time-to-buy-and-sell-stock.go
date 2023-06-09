package Interview_150

func maxProfit(prices []int) int {
	max := 0
	min := prices[0]
	for _, price := range prices {
		if price < min {
			min = price
		} else if price-min > max {
			max = price - min
		}
	}
	return max
}

func MaxProfitTest() {
	prices := []int{7, 1, 5, 3, 6, 4}
	println(maxProfit(prices))
}
