#include <stdio.h>

int main(){
    int numero = 20;
    int divisores = 0;
    int i = 1;

    while (i <= 20) {
        if(20 % i == 0)
            divisores++;
        i++;
    }

    printf("%d\t", divisores);
}
