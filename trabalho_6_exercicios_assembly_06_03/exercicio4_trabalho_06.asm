inicio:
eax = 10
ebx = 3
edi = 1

repeticao:
cmp ebx, 0
je fim

imul edi, eax
dec ebx 

fim: