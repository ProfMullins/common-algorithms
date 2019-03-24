def bubble_sort(arr)
  for i in 0...arr.length
    for j in 0..(arr.length - i - 2)
      arr[j], arr[j + 1] = arr[j + 1], arr[j] if arr[j + 1] < arr[j]
    end
  end

  return arr
end

intArr = [4, 6, 3, 2, 6, 8, 1, 5, 9, 5, 2, 3, 8, 1, 2, 5, 0, 9]
puts('Unsorted Int Array:')
puts(intArr.join(', '))
bubble_sort(intArr)
puts('Sorted Int Array:')
puts(intArr.join(', '))

puts("\n")

strArr = %w(a n e t u h e s x h i o j g f d e g z a e w f h k h f l a q w r y h f)
puts('Unsorted String Array:')
puts(strArr.join(', '))
bubble_sort(strArr)
puts('Sorted String Array:')
puts(strArr.join(', '))