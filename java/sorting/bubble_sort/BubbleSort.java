class BubbleSort {
    void sort(int arr[]) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    void sort(char arr[]) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Prints the array
    void printArray(int arr[]) {
        int len = arr.length;
        for (int i = 0; i < len; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Prints the array
    void printArray(char arr[]) {
        int len = arr.length;
        for (int i = 0; i < len; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        BubbleSort ob = new BubbleSort();
        int intArr[] = {4, 6, 3, 2, 6, 8, 1, 5, 9, 5, 2, 3, 8, 1, 2, 5, 0, 9};
        System.out.println("Unsorted Int array");
        ob.printArray(intArr);
        ob.sort(intArr);
        System.out.println("Sorted Int array");
        ob.printArray(intArr);

        System.out.println();

        char charArr[] = {'a', 'n', 'e', 't', 'u', 'h', 'e', 's', 'x', 'h', 'i', 'o', 'j', 'g', 'f', 'd', 'e', 'g', 'z', 'a',
                'e', 'w', 'f', 'h', 'k', 'h', 'f', 'l', 'a', 'q', 'w', 'r', 'y', 'h',
                'f'};
        System.out.println("Unsorted Char Array");
        ob.printArray(charArr);
        ob.sort(charArr);
        System.out.println("Sorted Char Array");
        ob.printArray(charArr);
    }
}