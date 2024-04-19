#include <stdio.h>
#include <stdlib.h>

int main()
{
    int m[2][3] = {
        {1, 2, 3},
        {4, 5, 6}};

    for (int i = 0; i < 2; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            printf("m[%d][%d] = %d | &m[%d][%d] = %p", i, j, m[i][j], i, j, &m[i][j]);
            puts("");
        }
        }

    return 0;
}