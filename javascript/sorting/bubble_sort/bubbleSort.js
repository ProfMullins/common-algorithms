// arrays to sort
let intArr = [4, 6, 3, 2, 6, 8, 1, 5, 9, 5, 2, 3, 8, 1, 2, 5, 0, 9];
let charArr = ['a', 'n', 'e', 't', 'u', 'h', 'e', 's', 'x', 'h', 'i', 'o', 'j', 'g', 'f', 'd', 'e', 'g', 'z', 'a',
    'e', 'w', 'f', 'h', 'k', 'h', 'f', 'l', 'a', 'q', 'w', 'r', 'y', 'h', 'f'];

// swap function helper
function swap(arr, i, j) {
    let temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

// correct implementation: this is the usual implementation of the bubble sort algorithm. Some loops execution are avoided if not they are not needed
function bubbleSort(arr) {
    let isSwapped;
    do {
        isSwapped = false;

        for (let i = 0; i < arr.length; i++) {
            if (arr[i] && arr[i + 1] && arr[i] > arr[i + 1]) {
                swap(arr, i, i + 1);
                isSwapped = true;
            }
        }
    } while (isSwapped);
    return arr;
}

console.log("Unsorted Int Array:");
console.log(intArr.join(', '));
console.log(bubbleSort(intArr).join(', '));

console.log("\nUnsorted Char Array:");
console.log(charArr.join(', '));
console.log(bubbleSort(charArr).join(', '));

