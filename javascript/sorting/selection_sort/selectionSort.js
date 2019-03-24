// array to sort
let intArr = [4, 6, 3, 2, 6, 8, 1, 5, 9, 5, 2, 3, 8, 1, 2, 5, 0, 9];
let charArr = ['a', 'n', 'e', 't', 'u', 'h', 'e', 's', 'x', 'h', 'i', 'o', 'j', 'g', 'f', 'd', 'e', 'g', 'z', 'a',
    'e', 'w', 'f', 'h', 'k', 'h', 'f', 'l', 'a', 'q', 'w', 'r', 'y', 'h', 'f'];

// swap function helper
function swap(arr, i, j) {
    let temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

function selectionSort(arr) {
    // Loop through unsorted array
    for (let i = 0; i < arr.length; i++) {
        // Find min in unsorted array
        let min = i;
        for (let j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[min]) {
                min = j;
            }
        }
        if (i !== min) {
            // Swap min element with first element
            swap(arr, i, min);
        }
    }
    return arr;
}
console.log("Unsorted Int Array:");
console.log(intArr.join(', '));
console.log(selectionSort(intArr).join(', '));

console.log("\nUnsorted Char Array:");
console.log(charArr.join(', '));
console.log(selectionSort(charArr).join(', '));
