def atm_app():
	pin=-1
	account_name = ""
	select=0
	balance =0.0
	while select !=8:
		print("""
                 ~~Welcome to an ATM machine app~~
                   1)Account Name
                   2)Create your pin
                   3)Deposite money
                   4)Withdraw money
                   5)Check Balance
                   6)Change pin
                   7)Transfer to another account
                   8)Close Account 
                 """)
		select =int(input("Select one option dear customer:"))
		match(select):
			case 1:
				account_name=input("Enter your first and last name :")
				print(f"Account name set to {account_name}")
			case 2:
				pin=int(input("Enter your pin:"))
				print("Pin set successfully..")
			case 3:
				deposite_amount=float(input("Enter amount to deposite:"))
				if deposite_amount > 0:
					balance+=deposite_amount
					print(f"Deposite: ${deposite_amount}")
				else:
					print("Please enter a valid amount")
			case 4:
					
				withdraw_amount=float(input("Enter amout to withdraw:"))
				if withdraw_amount > 0 and withdraw_amount <= balance:
					balance -=withdraw_amount
					print(f"Withdraw: ${withdraw_amount}")
				else:
					print("Invalid withdraw amount..")
			case 5:
				print(f"Current balance: ${balance}")
			case 6:
				old_pin=int(input("Enter your old pin:"))
				if old_pin == pin:
					new_pin = int(input("Enter your new pin:"))
					pin = new_pin
					print("Pin changed successfully")
				else:
					print("Incorrect old pin. Please try again.")
			case 7:
				input_pin = int(input("Enter your pin:"))
				if input_pin == pin:
					transfer_amount = float(input("Enter amount you want to transfer:"))
					if transfer_amount > 0 and  transfer_amount<=balance:
						balance -= transfer_amount
						print(f"Transferred: ${transfer_amount} ")
					else:
						print("Transfer failed: Insufficient funds or invalid amount. ")
				else:
					print("Incorrect pin. Transfer not possible.")
			case 8:
				print("THANKS FOR USING THE ATM , HAVE A NICE DAY!!")
			case _:
				print("INVALID SELECTION. PLSS TRY AGAIN.")			
				
atm_app()
	

