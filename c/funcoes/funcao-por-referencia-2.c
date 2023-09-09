#include <stdio.h>
#include <stdlib.h>

int somaESubtrai(int x, int y, int *soma, int *subtracao)
{
    *soma = x + y;
    *subtracao = x - y;
}

int main()
{
    int a = 10;
    int b = 20;
    int soma, subtracao;

    printf("a = %d, &a = %p\n", a, &a);
    printf("b = %d, &b = %p\n", b, &b);
    printf("soma = %d, &soma = %p\n", soma, &soma);
    printf("subtracao = %d, &subtracao = %p\n\n", subtracao, &subtracao);

    somaESubtrai(a, b, &soma, &subtracao);

    printf("a = %d, &a = %p\n", a, &a);
    printf("b = %d, &b = %p\n", b, &b);
    printf("soma = %d, &soma = %p\n", soma, &soma);
    printf("subtracao = %d, &subtracao = %p\n\n", subtracao, &subtracao);

    return 0;
}