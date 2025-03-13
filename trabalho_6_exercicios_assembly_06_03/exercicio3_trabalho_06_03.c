/* Numero primo ou nao primo. */
#include <stdio.h>

int main(){
    int numero_primo = 7;
    int divisor = 2;

    int eh_primo = 1;

    while (eh_primo && divisor < numero_primo){
        if (numero_primo % divisor == 0)
            eh_primo = 0;
        divisor++;
    }
    // printf("%d\n", eh_primo);
}