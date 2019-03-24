package main

import (
"fmt"
"strings"
)

func sortIntArr(arr []int) {
	var size = len(arr)

	isSwapped := true

	for isSwapped {
		isSwapped = false

		// Loop through unsorted array
		for i := 1; i < size; i++ {
			if arr[i-1] > arr[i] {
				arr[i], arr[i-1] = arr[i-1], arr[i]

				isSwapped = true
			}
		}
	}
}

func sortStrArr(arr []string) {
	var size = len(arr)

	isSwapped := true

	for isSwapped {
		isSwapped = false

		// Loop through unsorted array
		for i := 1; i < size; i++ {
			if arr[i-1] > arr[i] {
				arr[i], arr[i-1] = arr[i-1], arr[i]

				isSwapped = true
			}
		}
	}
}

func main() {
	var intArr = []int{4, 6, 3, 2, 6, 8, 1, 5, 9, 5, 2, 3, 8, 1, 2, 5, 0, 9}

	fmt.Println("Unsorted Int Array: ")
	fmt.Println(intArr)
	fmt.Println("Sorted Int Array: ")
	sortIntArr(intArr)
	fmt.Println(intArr)

	fmt.Println()

	var strArr = []string{"a", "n", "e", "t", "u", "h", "e", "s", "x", "h", "i", "o", "j", "g", "f", "d", "e", "g", "z", "a",
		"e", "w", "f", "h", "k", "h", "f", "l", "a", "q", "w", "r", "y", "h", "f"}

	fmt.Println("Unsorted String Array: ")
	fmt.Println(strings.Join(strArr, ", "))
	fmt.Println("Sorted String Array: ")
	sortStrArr(strArr)
	fmt.Println(strings.Join(strArr, ", "))
}
