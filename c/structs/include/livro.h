#ifndef LIVRO_H
#define LIVRO_H

typedef struct _livro
{
    char Titulo[100];
    int Paginas;
    float Preco;

} Livro;

Livro *criar_livro(char *titulo, int paginas, float preco);
void imprimir_livro(const Livro *livro);
void atualizar_livro(Livro *livro, char *titulo, int paginas, float preco);
void excluir_livro(Livro **livro);
Livro *copiar_livro(Livro *livro);

#endif
