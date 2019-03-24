#!/usr/bin/python3


def sort_array(arr):
    size = len(arr)

    # Loop through unsorted array
    for i in range(size):
        for j in range(0, size - i - 1):
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]

    print_sorted_array(arr)


def print_sorted_array(sorted_arr):
    print('Sorted Array:')
    print(sorted_arr),


unsortedNum = [4, 6, 3, 2, 6, 8, 1, 5, 9, 5, 2, 3, 8, 1, 2, 5, 0, 9]
unsortedAlpha = ['a', 'n', 'e', 't', 'u', 'h', 'e', 's', 'x', 'h', 'i', 'o', 'j', 'g', 'f', 'd', 'e', 'g', 'z', 'a',
                 'e', 'w', 'f', 'h', 'k', 'h', 'f', 'l', 'a', 'q', 'w', 'r', 'y', 'h',
                 'f']

print('Unsorted Integer Array:')
print(unsortedNum)
sort_array(unsortedNum)

print("\n")
print('Unsorted Alpha Array:')
print(unsortedAlpha)
sort_array(unsortedAlpha)
