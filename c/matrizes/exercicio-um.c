#include <stdio.h>
#include <stdlib.h> // NULL, malloc, calloc, free

int **create_int_matrix(int rows, int cols)
{
    int **m = (int **)calloc(rows, sizeof(int *));

    for (int i = 0; i < rows; i++)
    {
        m[i] = (int *)calloc(cols, sizeof(int));
    }

    return m;
}

void print_int_matrix(int **m, int rows, int cols)
{
    int count = 0;
    printf("&m = %p | m = %p \n", &m, m);

    for (int i = 0; i < rows; i++)
    {
        for (int j = 0; j < cols; j++)
        {
            m[i][j] = count;

            printf("&m[%d][%d] = %p | m[%d][%d] = %d \n",
                   i, j, &m[i][j],
                   i, j, m[i][j]);
            count++;
        }
        puts("");
    }
}

void desaloc_int_matrix(int ***mat, int rows)
{
    int **m = *mat;

    for (int i = 0; i < rows; i++)
    {
        free(m[i]);
    }
    free(m);
    m = NULL;
}

int main(int argc, char *argv[])
{
    if (argc != 3)
    {
        printf("Erro: número de argumentos incorreto. \n");
        printf("Exemplo: ./program rows(3) cols(5). \n");
        exit(-1);
    }

    int rows = atoi(argv[1]), cols = atoi(argv[2]), count = 0;

    int **m = create_int_matrix(rows, cols);
    print_int_matrix(m, rows, cols);
    desaloc_int_matrix(&m, rows);

    return 0;
}