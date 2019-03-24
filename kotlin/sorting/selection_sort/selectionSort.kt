fun int_selection_sort(arr: Array<Int>) {
    var len = arr.size
    var temp: Int
    for (i in len - 1 downTo 0) {
        var max = i
        for (j in 0 until i) {
            if (arr[j] > arr[max])
                max = j
        }
        if (i != max) {
            temp = arr[i]
            arr[i] = arr[max]
            arr[max] = temp
        }
    }
}

fun char_selection_sort(arr: Array<Char>) {
    var len = arr.size
    var temp: Char
    for (i in len - 1 downTo 0) {
        var max = i
        for (j in 0 until i) {
            if (arr[j] > arr[max])
                max = j
        }
        if (i != max) {
            temp = arr[i]
            arr[i] = arr[max]
            arr[max] = temp
        }
    }
}

fun main(arg: Array<String>) {
    val intArr = arrayOf(4, 6, 3, 2, 6, 8, 1, 5, 9, 5, 2, 3, 8, 1, 2, 5, 0, 9)

    val charArr = arrayOf('a', 'n', 'e', 't', 'u', 'h', 'e', 's', 'x', 'h', 'i', 'o', 'j', 'g', 'f', 'd', 'e', 'g', 'z', 'a',
            'e', 'w', 'f', 'h', 'k', 'h', 'f', 'l', 'a', 'q', 'w', 'r', 'y', 'h', 'f')

    println("Unsorted Int Array: ")
    for (i in 0 until intArr.size)
        print("${intArr[i]},  ")
    println("\n")
    int_selection_sort(intArr)
    println("Sorted Int Array: ")
    for (i in 0 until intArr.size)
        print("${intArr[i]},  ")

    println("\n\n")

    println("Unsorted Char Array: ")
    for (i in 0 until charArr.size)
        print("${charArr[i]},  ")
    println("\n")
    char_selection_sort(charArr)
    println("Sorted Char Array: ")
    for (i in 0 until charArr.size)
        print("${charArr[i]},  ")
}
