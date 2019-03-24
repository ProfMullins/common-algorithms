<?php

function sort_arr($arr)
{
    # Loop through unsorted array
    for ($i = 0; $i < count($arr) - 1; $i++) {
        # Find min in unsorted array
        $min = $i;
        for ($j = $i + 1; $j < count($arr); $j++) {
            if ($arr[$j] < $arr[$min]) {
                $min = $j;
            }
        }

        # Swap min element with first element
        $arr = swap($arr, $i, $min);
    }
    return $arr;
}

function swap($arr, $left, $right)
{
    $temp = $arr[$right];
    $arr[$right] = $arr[$left];
    $arr[$left] = $temp;
    return $arr;
}

$int_array = array(4, 6, 3, 2, 6, 8, 1, 5, 9, 5, 2, 3, 8, 1, 2, 5, 0, 9);
echo "Unsorted Int Array:\n";
echo implode(', ', $int_array);
echo "\nSorted Int Array:\n";
echo implode(', ', sort_arr($int_array)) . PHP_EOL;

echo "\n";

$char_array = array('a', 'n', 'e', 't', 'u', 'h', 'e', 's', 'x', 'h', 'i', 'o', 'j', 'g', 'f', 'd', 'e', 'g', 'z', 'a',
    'e', 'w', 'f', 'h', 'k', 'h', 'f', 'l', 'a', 'q', 'w', 'r', 'y', 'h', 'f');
echo "Unsorted Char Array:\n";
echo implode(', ', $char_array);
echo "\nSorted Char Array:\n";
echo implode(', ', sort_arr($char_array)) . PHP_EOL;
?>