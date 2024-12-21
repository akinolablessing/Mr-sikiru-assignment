def ger_largest(numbers:list):
	largest = numbers[0]
	for count in numbers:
		if count > largest:
			largest = count
		return largest
num=[22,45,11,89]
ger_largest(num)

