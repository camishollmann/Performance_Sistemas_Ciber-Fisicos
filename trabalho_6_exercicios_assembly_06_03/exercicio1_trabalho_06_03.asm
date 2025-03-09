inicio:
mov eax, 5

condicaum:
mov ebx, 10
cmp eax, ebx
jnz condicaodois
mov edi, 1
jmp fim

condicaodois:
mov ebx, 9
cmp eax, ebx
jnz condicaotres
mov edi, 2
jmp fim

condicaotres:
mov ebx, 8
cmp eax, ebx
jnz
mov edi, 3
jmp fim

senao:
mov edi, 4

fim:
