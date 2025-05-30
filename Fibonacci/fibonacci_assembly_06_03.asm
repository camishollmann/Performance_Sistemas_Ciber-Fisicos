inicio:
mov eax, 0 
mov ebx, 1
mov ecx, 2

repeticao:
mov edx, 10
cmp ecx,edx
jz fim
mov edx, eax
add edx, ebx
mov eax, ebx
mov ebx, edx
inc ecx
jmp repeticao

fim:


