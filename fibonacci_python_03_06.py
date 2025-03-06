numero_fibonnaci = 10

num_1 = 0
num_2 = 1

for i in range(numero_fibonnaci - 2):
    num_3 = num_1 + num_2
    num_1 = num_2
    num_2 = num_3
    
print(f"O décimo número da sequência é {num_3}")