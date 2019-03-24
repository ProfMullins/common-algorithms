<?php
/**
 * Created by PhpStorm.
 * User: mullins
 * Date: 3/24/19
 * Time: 7:07 PM
 */

function sort_arr($arr)
{
    $len = sizeof($arr);

    for($i = 0; $i < $len; $i++)
    {
        for ($j = 0; $j < $len - $i - 1; $j++)
        {
            if ($arr[$j] > $arr[$j+1])
            {
                $temp = $arr[$j];
                $arr[$j] = $arr[$j+1];
                $arr[$j+1] = $temp;
            }
        }
    }

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
