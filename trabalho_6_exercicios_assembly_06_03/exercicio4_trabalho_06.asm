inicio:
mov eax, 2
mov ebx, 4
mov edx, 1 

loop:
dec ebx
jz fim 
imul edx, eax
jmp loop

fim:
mov eax, 1 
int 0x80
