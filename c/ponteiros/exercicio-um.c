#include <stdio.h>
#include <stdlib.h>

int main()
{
    int a, b, *p1, *p2;

    a = 4;
    b = 3;
    p1 = &a;
    p2 = p1;

    *p2 = *p1 + 3;
    b = b * (*p1);
    (*p2)++;
    p1 = &b;

    printf("&a = %p, &b = %p\n", &a, &b);
    printf("&p1 = %p, &p2 = %p\n\n", &p1, &p2);

    printf("a = %d, b = %d\n", a, b);
    printf("p1 = %p, p2 = %p\n", p1, p2);
    printf("*p1 = %d *p2 = %d\n", *p1, *p2);

    return 0;
}