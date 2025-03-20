inicio:
mov eax, 5
mov ebx, 2
mov ecx, 0

divisao:
div ebx
cmp edx, ecx
jz par

impar:
mov edi, 1
jmp fim

par:
mov edi, 0


fim:
