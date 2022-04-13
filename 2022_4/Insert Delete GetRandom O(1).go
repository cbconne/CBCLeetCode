package study2022_4

import "math/rand"

type RandomizedSet struct {
	nums  []int
	index map[int]int
}

func Constructor() RandomizedSet {
	return RandomizedSet{[]int{}, map[int]int{}}
}

func (this *RandomizedSet) Insert(val int) bool {
	_, ok := this.index[val]
	if ok {
		return false
	}
	this.nums = append(this.nums, val)
	this.index[val] = len(this.nums) - 1
	return true
}

func (this *RandomizedSet) Remove(val int) bool {
	i, ok := this.index[val]
	if !ok {
		return false
	}
	this.nums[i] = this.nums[len(this.nums)-1]
	this.index[this.nums[i]] = i
	this.nums = this.nums[:len(this.nums)-1]
	delete(this.index, val)
	return true
}

func (this *RandomizedSet) GetRandom() int {
	return this.nums[rand.Intn(len(this.nums))]
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * obj := Constructor();
 * param_1 := obj.Insert(val);
 * param_2 := obj.Remove(val);
 * param_3 := obj.GetRandom();
 */
