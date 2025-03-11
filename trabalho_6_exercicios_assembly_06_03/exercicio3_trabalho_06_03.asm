Inicio:
mov eax, 13
mov ebx, 2

Loop:
cmp ebx, eax
jge Fim

mov edx, 
div ebx

cmp edx, 0
je NaoPrimo

inc ebx
jmp Loop

NaoPrimo:

jmp Fim

Fim:
