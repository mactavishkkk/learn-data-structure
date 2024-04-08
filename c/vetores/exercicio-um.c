#include <stdio.h>
#include <stdlib.h> // NULL, malloc, calloc, free

void soma_vetor_escalar(int v[], int n, int escalar)
{
    for (int i = 0; i < n; i++)
    {
        v[i] += escalar;
    }
}

void imprimir_vetor(const int *v, int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("&v[%d] = %p, v[%d] = %d\n", i, &v[i], i, v[i]);
    }
    printf("\n");
}

void desalocar_vetor(int **v)
{
    free(*v);
    *v = NULL;
}

int main()
{
    // alocacao estatica
    int vs[5] = {0, 10, 20, 30, 40};

    imprimir_vetor(vs, 5);
    soma_vetor_escalar(vs, 5, 5);
    imprimir_vetor(vs, 5);

    // alocacao dinâmica
    int *vh = (int *)calloc(5, sizeof(int));
    for (int i = 0; i < 5; i++)
    {
        vh[i] = i * 100;
    }

    imprimir_vetor(vh, 5);
    soma_vetor_escalar(vh, 5, 5);
    imprimir_vetor(vh, 5);

    desalocar_vetor(&vh);

    return 0;
}