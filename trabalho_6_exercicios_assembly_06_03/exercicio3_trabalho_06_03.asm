inicio:
mov eax, 13
mov ebx, 2

mov ecx, 1
loop:
cmp ebx, eax
jge fim

mov edx, 0
div ebx

cmp edx, 0
je naoprimo

inc ebx
jmp loop

naoprimo:
mov ecx, 0
jmp fim

fim:
