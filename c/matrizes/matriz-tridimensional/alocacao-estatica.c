#include <stdio.h>
#include <stdlib.h> // NULL, malloc, calloc, free

int main()
{
    int slices = 2;
    int rows = 2;
    int cols = 3;

    // 2 slices, 2 rows and 3 cols
    int m[2][2][3] = {
        {{0, 1, 2},
         {3, 4, 5}},
        {{6, 7, 8},
         {9, 0, 1}}};

    printf("&m = %p, m = %p \n\n", &m, m);

    for (int s = 0; s < slices; s++)
    {
        for (int r = 0; r < rows; r++)
        {
            for (int c = 0; c < cols; c++)
            {
                printf("&m[%d][%d][%d] = %p | m[%d][%d][%d] = %d \n",
                       s, r, c, &m[s][r][c],
                       s, r, c, m[s][r][c]);
            }
        }
    }

    return 0;
}