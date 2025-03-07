numero_primo = 13
divisor = 2

while (divisor < numero_primo):
    if numero_primo % divisor == 0:
        print("Não é primo!")
        exit()

    divisor += 1

print("É primo!")