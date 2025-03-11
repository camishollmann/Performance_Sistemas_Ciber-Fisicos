numero_primo = 13
divisor = 2

eh_primo = True

while (divisor < numero_primo):
    if numero_primo % divisor == 0:
        eh_primo = False
        exit()
    divisor += 1