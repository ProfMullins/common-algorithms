package main

import (
	"fmt"
	"strings"
)

func sortIntArr(arr []int) {
	var size = len(arr)

	// Loop through unsorted array
	for i := 0; i < size; i++ {
		var min = i

		// Find min in remaining unsorted array
		for j := i; j < size; j++ {
			if arr[j] < arr[min] {
				min = j
			}
		}

		// Swap min element with first element
		arr[i], arr[min] = arr[min], arr[i]
	}
}

func sortStrArr(arr []string) {
	var size = len(arr)

	// Loop through unsorted array
	for i := 0; i < size; i++ {
		var min = i

		// Find min in remaining unsorted array
		for j := i; j < size; j++ {
			if arr[j] < arr[min] {
				min = j
			}
		}

		// Swap min element with first element
		arr[i], arr[min] = arr[min], arr[i]
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
