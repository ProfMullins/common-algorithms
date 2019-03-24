#!/usr/bin/python3

def sort_array(arr):
    # Loop through unsorted array
    for i in range(len(arr)):
        # Find min in unsorted array
        min_index = i;
        for j in range(i + 1, len(arr)):
            if arr[min_index] > arr[j]:
                min_index = j

        # Swap min element with first element
        arr[i], arr[min_index] = arr[min_index], arr[i]

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

print('------------------------------------')
print('Unsorted Alpha Array:')
print(unsortedAlpha)
sort_array(unsortedAlpha)
