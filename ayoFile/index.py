numbers = [7,6,9,2,6]
print('\n Creating a bar chart from numbers:')
print(f'Index{"Value":>8} Bar')
for index, value in enumerate(numbers):
   print(f'{index:>5}{value:>8}  {"*" * value} ')