#ifndef ALUNO_H
#define ALUNO_H

#include "livro.h"

typedef struct _aluno
{
    char Nome[100];
    int Idade;
    Livro *Livro;

} Aluno;

Aluno *criar_aluno(const char *nome, int idade, Livro *livro);
void imprimir_aluno(const Aluno *aluno);
void atualizar_aluno(Aluno *aluno, char *nome, int idade);
void excluir_aluno(Aluno **aluno);

#endif
