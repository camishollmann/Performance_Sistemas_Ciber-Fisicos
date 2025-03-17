inicio:
mov eax, 10 
mov ebx, 2
mov edx, 0

div ebx

cmp edx, 0
jz ehpar

ehimpar:
mov edi, 1
jmp fim

ehpar:
mov edi, 0
jmp fim


fim:

