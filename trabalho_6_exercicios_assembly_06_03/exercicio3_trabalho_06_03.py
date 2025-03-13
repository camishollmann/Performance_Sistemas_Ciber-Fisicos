numero_primo = 10
divisor = 2

eh_primo = True

while (eh_primo and divisor < numero_primo):
    if numero_primo % divisor == 0:
        eh_primo = False
    divisor += 1

# print(eh_primo)