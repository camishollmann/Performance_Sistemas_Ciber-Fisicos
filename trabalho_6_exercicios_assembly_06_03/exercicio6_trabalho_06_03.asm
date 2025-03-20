inicio:
mov eax, 6
mov ebx, 1
mov ecx, 0


repeticao:
mov eax, 6
cmp ebx, eax
jge condicao2
mov edx, 0
div ebx

condicao:
mov eax, 0
cmp edx, eax
jz adiciona
inc ebx
jmp repeticao


adiciona:
add ecx, ebx
inc ebx
jmp repeticao


condicao2:
cmp eax, ecx
jz fim1
jmp fim2

fim1:
mov edi, 1

fim2:
