// C# Selection Sort 
using System; 
  
class SelectionSort 
{ 
    // Selection Sort for integer array
    static void Sort(int[] arr) 
    { 
        int len = arr.Length; 
  
        // Loop through unsorted array 
        for (int i = 0; i < len - 1; i++) 
        { 
            // Find min element in unsorted array 
            int minIndex = i;
            for (int j = i + 1; j < len; j++)
            {
                if (arr[j] < arr[minIndex])
                {
                    minIndex = j;
                }
            }

            // Swap minimum element with first element 
            int temp = arr[minIndex]; 
            arr[minIndex] = arr[i]; 
            arr[i] = temp; 
        } 
    }
    
    // Overloaded Sort funtion for selection sort of char array
    static void Sort(char[] arr) 
    { 
        int len = arr.Length;
  
        // Loop through unsorted array 
        for (int i = 0; i < len - 1; i++) 
        { 
            // Find min element in unsorted array 
            int minIndex = i;
            for (int j = i + 1; j < len; j++)
            {
                if (arr[j] < arr[minIndex])
                {
                    minIndex = j;
                }
            }

            // Swap min element with first element 
            char temp = arr[minIndex]; 
            arr[minIndex] = arr[i]; 
            arr[i] = temp; 
        } 
    }
  
    // Prints array 
    static void PrintArray(int[] arr) 
    { 
        int len = arr.Length;
        for (int i = 0; i < len; ++i)
        {
            Console.Write(arr[i] + ", ");
        }

        Console.WriteLine(); 
    }
    
    static void PrintArray(char[] arr) 
    { 
        int len = arr.Length;
        for (int i = 0; i < len; ++i)
        {
            Console.Write(arr[i] + ", ");
        }

        Console.WriteLine(); 
    }
  
    public static void Main() 
    { 
        int[] intArr = {4, 6, 3, 2, 6, 8, 1, 5, 9, 5, 2, 3, 8, 1, 2, 5, 0, 9}; 
        Console.WriteLine("Unsorted Int Array:"); 
        PrintArray(intArr);
        Sort(intArr); 
        Console.WriteLine("Sorted Int Array:"); 
        PrintArray(intArr);

        Console.WriteLine("\n");
        
        char[] charArr = {'a', 'n', 'e', 't', 'u', 'h', 'e', 's', 'x', 'h', 'i', 'o', 'j', 'g', 'f', 'd', 'e', 'g', 'z', 'a',
            'e', 'w', 'f', 'h', 'k', 'h', 'f', 'l', 'a', 'q', 'w', 'r', 'y', 'h','f'};
        Console.WriteLine("Unsorted Char Array:"); 
        PrintArray(charArr);
        Sort(charArr); 
        Console.WriteLine("Sorted Char Array:"); 
        PrintArray(charArr);
    } 
  
} 