number =int(input("Enter a number between 0 and 1000:"))
firstInteger = int(number%10)
secondInteger  = int(number%100/10)
thirdInteger = int(number/100)
sum = firstInteger + secondInteger+thirdInteger
print(f"The sum of the numbers is:{sum}") 









