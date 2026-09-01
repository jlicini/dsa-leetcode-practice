package main

func lengthOfLongestSubstring(s string) int {
	characters := make(map[byte]bool)

	maxLen := 0
	left := 0

	for i := range s {

		character := s[i]

		for characters[character] {
			delete(characters, s[left])
			left++
		}

		characters[character] = true
		maxLen = max(maxLen, i-left+1)
	}

	return maxLen
}
