#import <stdio.h>

int main(){
    int numero = 10;
    int potencia = 3;
    int resultado = 1;
    
    while (potencia > 0){
        resultado *= numero;
        potencia -= 1;
    }
    printf("%d\n"resultado);
}