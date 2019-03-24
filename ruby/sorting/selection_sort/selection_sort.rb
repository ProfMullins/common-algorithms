def selection_sort(array)
  len = array.length - 1
  # Loop through unsorted arrays
  len.times do |i|
    min_index = i
    # Find min in unsorted array
    for j in (i + 1)..len
      min_index = j if array[j] < array[min_index]
    end
    # Swap min element with first element
    array[i], array[min_index] = array[min_index], array[i] if min_index != i
  end
  array
end

intArr = [4, 6, 3, 2, 6, 8, 1, 5, 9, 5, 2, 3, 8, 1, 2, 5, 0, 9]
puts('Unsorted Int Array:')
puts(intArr.join(', '))
selection_sort(intArr)
puts('Sorted Int Array:')
puts(intArr.join(', '))

puts("\n")

strArr = %w(a n e t u h e s x h i o j g f d e g z a e w f h k h f l a q w r y h f)
puts('Unsorted String Array:')
puts(strArr.join(', '))
selection_sort(strArr)
puts('Sorted String Array:')
puts(strArr.join(', '))