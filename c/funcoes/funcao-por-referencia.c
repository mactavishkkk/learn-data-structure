#include <stdio.h>
#include <stdlib.h>

int soma(int x, int y, int *c)
{
    printf("\n===========FUNCAO===========\n");
    printf("x = %d, &x = %p\n", x, &x);
    printf("y = %d, &y = %p\n", y, &y);
    printf("c = %d, &c = %p\n\n", *c, &c);

    *c = x + y;

    printf("\n===========FUNCAO===========\n");
    printf("x = %d, &x = %p\n", x, &x);
    printf("y = %d, &y = %p\n", y, &y);
    printf("c = %d, &c = %p\n\n", *c, &c);
}

int main()
{
    int a = 10;
    int b = 20;
    int c;

    printf("\n===========EXECUÇÃO===========\n");
    printf("a = %d, &a = %p\n", a, &a);
    printf("b = %d, &b = %p\n", b, &b);
    printf("c = %d, &c = %p\n\n", c, &c);

    soma(a, b, &c);

    printf("\n===========EXECUÇÃO===========\n");
    printf("a = %d, &a = %p\n", a, &a);
    printf("b = %d, &b = %p\n", b, &b);
    printf("c = %d, &c = %p\n\n", c, &c);

    return 0;
}