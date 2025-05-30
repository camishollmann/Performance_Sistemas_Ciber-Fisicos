n = int(input("Enter an integer: "))
factorial = 1

for i in range(1, n + 1):
    factorial = factorial * i

print(f"The factorial for this number is: {factorial}")