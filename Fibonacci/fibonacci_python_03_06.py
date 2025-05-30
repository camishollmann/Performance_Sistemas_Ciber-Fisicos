num_1 = 0
num_2 = 1

# O erro aqui eh usar "for" (para assembly preferir "while").

for i in range(8):
    num_3 = num_1 + num_2
    num_1 = num_2
    num_2 = num_3
    
print(f"O décimo número da sequência é {num_3}")