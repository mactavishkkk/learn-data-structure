#include "livro.h"
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

Livro *criar_livro(char *titulo, int paginas, float preco)
{
    Livro *livro = (Livro *)calloc(1, sizeof(Livro));

    strcpy(livro->Titulo, titulo);
    livro->Paginas = paginas;
    livro->Preco = preco;

    return livro;
}

void imprimir_livro(const Livro *livro)
{
    printf("Titulo: %s\n", livro->Titulo);
    printf("N° de Páginas: %d\n", livro->Paginas);
    printf("Preço: R$ %.2f\n\n", livro->Preco);
}

void atualizar_livro(Livro *livro, char *titulo, int paginas, float preco)
{
    strcpy(livro->Titulo, titulo);
    livro->Paginas = paginas;
    livro->Preco = preco;
}

void excluir_livro(Livro **livro)
{
    Livro *aux = *livro;
    free(aux);
    *livro = NULL;

    int deleted = *livro == NULL;
    if (deleted == 1)
    {
        printf("\nLivro deletado com sucesso!\n");
    }
    else
    {
        printf("\nFalha ao deletar o livro.\n");
    }
}

Livro *copiar_livro(Livro *livro)
{
    return criar_livro(livro->Titulo, livro->Paginas, livro->Preco);
}