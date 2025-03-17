inicio:
mov eax, 2 ; resultado deve ser 8
mov ebx, 3
mov ecx, eax

repeticao:
sub ebx, 1
cmp ebx, 0
jz fim

mul ecx

jmp repeticao

fim:
mov edi, eax
