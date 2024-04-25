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

int main()
{
    int rows = 100000;
    int cols = 10000;

    int **m = create_int_matrix(rows, cols);

    for (int j = 0; j < cols; j++)
    {
        for (int i = 0; i < rows; i++)
        {
            m[i][j] = (i + j) % 2;
        }
    }

    return 0;
}