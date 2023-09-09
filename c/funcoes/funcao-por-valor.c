#include <stdio.h>
#include <stdlib.h>

int soma(int x, int y)
{
    printf("x = %d, &x = %p\n", x, &x);
    printf("y = %d, &y = %p\n\n", y, &y);

    int z = x + y;

    printf("x = %d, &x = %p\n", x, &x);
    printf("y = %d, &y = %p\n", y, &y);
    printf("z = %d, &z = %p\n\n", z, &z);

    return z;
}

int main()
{
    int a = 10;
    int b = 20;
    int c;

    printf("a = %d, &a = %p\n", a, &a);
    printf("b = %d, &b = %p\n", b, &b);
    printf("c = %d, &c = %p\n\n", c, &c);

    c = soma(a, b);

    printf("a = %d, &a = %p\n", a, &a);
    printf("b = %d, &b = %p\n", b, &b);
    printf("c = %d, &c = %p\n", c, &c);

    return 0;
}