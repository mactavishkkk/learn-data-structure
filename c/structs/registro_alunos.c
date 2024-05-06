#include <stdio.h>
#include <stdlib.h>
#include "include/livro.c"
#include "include/aluno.c"

int main()
{
    // C
    Livro *livro = criar_livro("Harry Potter e a Pedra Filosofal", 223, 47.42f);
    Aluno *aluno = criar_aluno("Emilly", 24, livro);

    // R
    imprimir_aluno(aluno);

    // U
    atualizar_aluno(aluno, "Emilly Aquino", 23);
    atualizar_livro(aluno->Livro, "HP - a Pedra Filosofal", 309, 32.50f);
    imprimir_aluno(aluno);

    // D
    excluir_aluno(&aluno);

    return 0;
}