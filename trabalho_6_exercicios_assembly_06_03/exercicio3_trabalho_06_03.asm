inicio:
mov eax, 5
mov ebx, 2
mov ecx, 0

repeticao:
cmp ebx, eax
jge ehprimo

condicao:
mov edx, 0   
div ebx

cmp edx, ecx
jz naoehprimo

mov eax, 5
inc ebx
jmp repeticao

naoehprimo:
mov edi, 0
jmp fim

ehprimo:
mov edi, 1

fim:
