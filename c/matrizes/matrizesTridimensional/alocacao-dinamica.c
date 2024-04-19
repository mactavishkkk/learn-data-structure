#include <stdio.h>
#include <stdlib.h> // NULL, malloc, calloc, free

int main()
{
    int slices = 2;
    int rows = 2;
    int cols = 3;

    int ***m = (int ***)calloc(slices, sizeof(int **));

    for (int k = 0; k < slices; k++)
    {
        m[k] = (int **)calloc(rows, sizeof(int *));

        for (int i = 0; i < rows; i++)
        {
            m[k][i] = (int *)calloc(cols, sizeof(int));
        }
    }

    printf("&m = %p, m = %p \n\n", &m, m);

    for (int s = 0; s < slices; s++)
    {
        printf("&m[%d] = %p | m[%d] = %p \n", s, &m[s], s, m[s]);

        for (int r = 0; r < rows; r++)
        {
            printf("&m[%d][%d] = %p | m[%d][%d] = %p \n",
                   s, r, &m[s][r],
                   s, r, m[s][r]);

            for (int c = 0; c < cols; c++)
            {
                printf("&m[%d][%d][%d] = %p | m[%d][%d][%d] = %d \n",
                       s, r, c, &m[s][r][c],
                       s, r, c, m[s][r][c]);
            }
            puts("");
        }
        puts("");
    }
    puts("");

    for (int s = 0; s < slices; s++)
    {
        for (int r = 0; r < rows; r++)
        {
            free(m[s][r]);
        }
        free(m[s]);
    }
    free(m);
    m = NULL;

    return 0;
}