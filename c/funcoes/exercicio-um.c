#include <stdio.h>
#include <stdlib.h>

int troca(int *x, int *y)
{
    printf("x = %d, &x = %p\n", *x, &x);
    printf("y = %d, &y = %p\n\n", *y, &y);

    int aux = *x;
    *x = *y;
    *y = aux;

    printf("x = %d, &x = %p\n", *x, &x);
    printf("y = %d, &y = %p\n\n", *y, &y);
}

int main()
{
    int a = 10;
    int b = 20;

    printf("a = %d, &a = %p\n", a, &a);
    printf("b = %d, &b = %p\n\n", b, &b);

    troca(&a, &b);

    printf("a = %d, &a = %p\n", a, &a);
    printf("b = %d, &b = %p\n", b, &b);

    return 0;
}