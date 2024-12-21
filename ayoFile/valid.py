validator = 1
largest = 0
while validator <= 10:
   score = input(f"Enter a number:")
 if score > largest:
           largest = score
          validator = validator +1
          validator+=1
 else:
     print("Invalid input!")
     validator -=1
print("largest is",largest)
     else:
        a+=1
        print("Score is >100 or <0")
print (f"largest is{largest}")