//
// Created by mullins on 3/23/19.
//
// C++ Selection Sort
#include <stdio.h>

void Swap(int *xp, int *yp) {
    int temp = *xp;
    *xp = *yp;
    *yp = temp;
}

void Swap(char *xp, char *yp) {
    char temp = *xp;
    *xp = *yp;
    *yp = temp;
}

void SelectionSort(int arr[], int len) {
    int i, j, min_index;

    // One by one move boundary of unsorted subarray
    for (i = 0; i < len - 1; i++) {
        // Find min element in unsorted array
        min_index = i;
        for (j = i + 1; j < len; j++)
            if (arr[j] < arr[min_index])
                min_index = j;

        // Swap min element with first element
        Swap(&arr[min_index], &arr[i]);
    }
}

void SelectionSort(char arr[], int len) {
    int i, j, min_index;

    // One by one move boundary of unsorted subarray
    for (i = 0; i < len - 1; i++) {
        // Find min element in unsorted array
        min_index = i;
        for (j = i + 1; j < len; j++)
            if (arr[j] < arr[min_index])
                min_index = j;

        // Swap min element with first element
        Swap(&arr[min_index], &arr[i]);
    }
}

/* Functions to print array */
void PrintArray(int arr[], int len) {
    int i;
    for (i = 0; i < len; i++)
        printf("%d, ", arr[i]);
    printf("\n");
}

void PrintArray(char arr[], int len) {
    int i;
    for (i = 0; i < len; i++)
        printf("%c, ", arr[i]);
    printf("\n");
}

int main() {
    int intArr[] = {4, 6, 3, 2, 6, 8, 1, 5, 9, 5, 2, 3, 8, 1, 2, 5, 0, 9};
    int intLen = sizeof(intArr) / sizeof(intArr[0]);
    printf("Unsorted Array: \n");
    PrintArray(intArr, intLen);
    SelectionSort(intArr, intLen);
    printf("Sorted Array: \n");
    PrintArray(intArr, intLen);

    printf("\n");

    char charArr[] = {'a', 'n', 'e', 't', 'u', 'h', 'e', 's', 'x', 'h', 'i', 'o', 'j', 'g', 'f', 'd', 'e', 'g', 'z',
                      'a', 'e', 'w', 'f', 'h', 'k', 'h', 'f', 'l', 'a', 'q', 'w', 'r', 'y', 'h', 'f'};
    int charLen = sizeof(charArr) / sizeof(charArr[0]);
    printf("Unsorted Array: \n");
    PrintArray(charArr, charLen);
    SelectionSort(charArr, charLen);
    printf("Sorted Array: \n");
    PrintArray(charArr, charLen);
    return 0;
}

