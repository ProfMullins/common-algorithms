// C# Bubble Sort 
using System; 
  
class BubbleSort 
{ 
    // Bubble Sort for integer array
    static void Sort(int[] arr) 
    { 
        int len = arr.Length;
        for (int i = 0; i < len - 1; i++)
        {
            for (int j = 0; j < len - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    // swap temp and arr[i] 
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    // Overloaded Sort funtion for bubble sort of char array
    static void Sort(char[] arr) 
    { 
        int len = arr.Length;
        for (int i = 0; i < len - 1; i++)
        {
            for (int j = 0; j < len - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    // swap temp and arr[i] 
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
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