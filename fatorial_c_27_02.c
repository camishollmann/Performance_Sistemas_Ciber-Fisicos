/* factorial. */
#include <stdio.h>

int main(){
    int n = 5;
    int factorial = 1;

    for (int i = 1; i <= n; i++){
        factorial = factorial * i;
    }

    /* Prints the factorial of the int n. */
    printf("%d\n", factorial);
}