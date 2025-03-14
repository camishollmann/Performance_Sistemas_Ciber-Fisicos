inicio:
mov eax, 2005
mov edx, 2025
sub edx, eax

verificames:
mov eax, 3
mov ebx, 1
cmp ebx, eax
jle condicaodois
dec ebx
jmp fim

condicaodois:
mov eax, 3
cmp eax, ebx
jnz fim
mov eax, 7
mov ebx, 6
cmp eax, ebx
jl fim
dec edx


fim:
Exercício dois de assembly
boa obrigada!