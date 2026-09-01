package main

func twoSum(nums []int, target int) []int {

	indices := make([]int, 2)

	numberIndexMap := make(map[int]int)

	for i := range nums {
		complement := target - nums[i]

		if index, exist := numberIndexMap[complement]; exist {
			return []int{index, i}
		}
		numberIndexMap[nums[i]] = i
	}

	return indices
}
