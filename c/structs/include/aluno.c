#include "aluno.h"
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

Aluno *criar_aluno(const char *nome, int idade, Livro *livro)
{
    Aluno *aluno = (Aluno *)calloc(1, sizeof(Aluno));

    strcpy(aluno->Nome, nome);
    aluno->Idade = idade;
    aluno->Livro = copiar_livro(livro);

    return aluno;
}

void imprimir_aluno(const Aluno *aluno)
{
    puts("Aluno: ");
    printf("Nome: %s, Idade: %d\n", aluno->Nome, aluno->Idade);
    printf("\nLivro: \n");
    imprimir_livro(aluno->Livro);
}

void atualizar_aluno(Aluno *aluno, char *nome, int idade)
{
    strcpy(aluno->Nome, nome);
    aluno->Idade = idade;
}

void excluir_aluno(Aluno **aluno)
{
    Aluno *aux = *aluno;

    excluir_livro(&aux->Livro);

    free(aux);
    *aluno = NULL;

    int deleted = *aluno == NULL;
    if (deleted == 1)
    {
        printf("Aluno deletado com sucesso!\n");
    }
    else
    {
        printf("Falha ao deletar o aluno.\n");
    }
}