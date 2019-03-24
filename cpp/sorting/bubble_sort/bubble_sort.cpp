//
// Created by mullins on 3/22/19.
//
// C++ Bubble Sort
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

void BubbleSort(int arr[], int len) {
    int i, j;

    for (i = 0; i < len - 1; i++) {
        // Last i elements are already in place
        for (j = 0; j < len - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                Swap(&arr[j], &arr[j + 1]);
            }
        }
    }
}

void BubbleSort(char arr[], int len) {
    int i, j;

    for (i = 0; i < len - 1; i++) {
        // Last i elements are already in place
        for (j = 0; j < len - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                Swap(&arr[j], &arr[j + 1]);
            }
        }
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
    BubbleSort(intArr, intLen);
    printf("Sorted Array: \n");
    PrintArray(intArr, intLen);

    printf("\n");

    char charArr[] = {'a', 'n', 'e', 't', 'u', 'h', 'e', 's', 'x', 'h', 'i', 'o', 'j', 'g', 'f', 'd', 'e', 'g', 'z',
                      'a', 'e', 'w', 'f', 'h', 'k', 'h', 'f', 'l', 'a', 'q', 'w', 'r', 'y', 'h', 'f'};
    int charLen = sizeof(charArr) / sizeof(charArr[0]);
    printf("Unsorted Array: \n");
    PrintArray(charArr, charLen);
    BubbleSort(charArr, charLen);
    printf("Sorted Array: \n");
    PrintArray(charArr, charLen);
    return 0;
}

