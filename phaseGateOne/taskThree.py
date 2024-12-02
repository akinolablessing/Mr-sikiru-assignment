firstNumber = int(input("Enter a number:"))
secondNumber = int(input("Enter a number:"))
thirdNumber = int(input("Enter a number:"))

if firstNumber > secondNumber or firstNumber > thirdNumber:
	print(firstNumber)
if secondNumber > firstNumber or secondNumber > thirdNumber:
	print(secondNumber )
if thirdNumber> firstNumber or thirdNumber > secondNumber:
	print(thirdNumber)


