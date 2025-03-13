inicio:
mov eax,7
mov ebx,2
mov ecx,1
mov edx,0

repeticao:
cmp ecx,edx
je fim
cmp ebx,eax
jge fim

div ebx
cmp edx,ecx
je naoprimo
inc ebx
jmp repeticao

naoprimo:
mov ecx,0
fim:
