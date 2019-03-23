class SelectionSort {
    void sort(int arr[]) {
        int len = arr.length;

        // Loop through the unsorted subarray
        for (int i = 0; i < len - 1; i++) {
            // Find the min element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < len; j++)
                if (arr[j] < arr[minIndex])
                    minIndex = j;

            // Swap min element with the first
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    void sort(char arr[]) {
        int len = arr.length;

        // Loop through unsorted subarray
        for (int i = 0; i < len - 1; i++) {
            // Find min element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < len; j++)
                if (arr[j] < arr[minIndex])
                    minIndex = j;

            // Swap min element with the first
            char temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
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
        SelectionSort ob = new SelectionSort();
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