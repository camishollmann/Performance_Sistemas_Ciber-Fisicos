inicio:
    mov eax, 20
    mov ebx, 2
    xor edx, edx

    div ebx

    cmp edx, 0
    je numeroimpar

    mov edi, 0
    jmp fim

numeroimpar:
    mov edi, 1

fim:
