week=int(input("Enter today's day : "))
futureDays =int(input("Enter the number of day's elapsed since today: "))
addDays = futureDays + week - 1
match(week):
	case 0:
		print("Today is Sunday")
	case 1:
		print("Today is Monday")
	case 2:
		print("Today is Tuesday")
	case 3:
		print("Today is Wednesday")
	case 4:
		print("Today is Thursday")
	case 5:
		print("Today is Friday")
	case 6:
		print("Today is Saturday")
	case _:
		print("Invalid input")
match(addDays  ):
	case 0 :
       		
		print("The future day is Monday")
	case 1 :
		print("The future day is Tuesday ")
	case 2:
		print("The future day is Wednesday")
	case 3:
		print("The future day is Thursday")
	case 4:
		print("The future day is Friday")
	case 5:
		print("The future day is Saturday")
	case 6:
		print("The future day is Sunday")
	case 7:
       		
		print("The future day is Monday")
	case 8 :
		print("The future day is Tuesday ")
	case 9:
		print("The future day is Wednesday")
	case 10:
		print("The future day is Thursday")
	case 11:
		print("The future day is Friday")
	case 12:
		print("The future day is Saturday")
	case 13:
		print("The future day is Sunday")
	case 14 :
		print("The future day is Tuesday ")
	case 15:
		print("The future day is Wednesday")
	case 16:
		print("The future day is Thursday")
	case 17:
		print("The future day is Friday")
	case 18:
		print("The future day is Saturday")
	case 19:
		print("The future day is Sunday")
	case 20:
       		
		print("The future day is Monday")
	case 21:
		print("The future day is Tuesday ")
	case 22:
		print("The future day is Wednesday")
	case 23:
		print("The future day is Thursday")
	case 24:
		print("The future day is Friday")
	case 25:
		print("The future day is Saturday")
	case 26:
		print("The future day is Sunday")
	case 27:
		print("The future day is Tuesday ")
	case 28:
		print("The future day is Wednesday")
	case 29:
		print("The future day is Thursday")
	case 30:
		print("The future day is Friday")
	case 31:
		print("The future day is Saturday")
	case _:
		print("Invalid input")
	