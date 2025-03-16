# Averiguar essa bizarrice (procurar codigo de verdade)...
ano_nasc = 2005
ano_atual = 2025
idade = ano_atual - ano_nasc  # Subtrai diretamente como no Assembly

valor_teste = 1  # Simulando o uso de ebx no Assembly

if valor_teste <= 3:  # Simula "cmp ebx, eax" seguido de "jle"
    if valor_teste != 3:  # Simula "cmp eax, ebx" seguido de "jnz"
        pass  # Apenas mantém a idade original
    else:
        if 7 < 6:  # Simula "cmp eax, ebx" seguido de "jl"
            pass
        else:
            idade -= 1  # Simula "dec edx"

print(idade)
