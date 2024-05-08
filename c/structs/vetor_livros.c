#include <stdio.h>
#include <stdlib.h>
#include "include/livro.c"

int main()
{
    Livro **vet = (Livro **) calloc(3, sizeof(Livro *));
    vet[0] = criar_livro("Harry Potter e a Pedra Filosofal", 223, 47.42f);
    vet[1] = criar_livro("Harry Potter e a Câmara Secreta", 251, 24.9f);
    vet[2] = criar_livro("Harry Potter e a Pedra Filosofal", 317, 120.85f);
    
    for (int i = 0; i < 3; i++)
    {
        imprimir_livro(vet[i]);
        excluir_livro(&vet[i]);
    }
    free(vet);
    vet = NULL;

    return 0;
}