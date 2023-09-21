#include <stdio.h>

int main()
{
    int v[5] = {0, 1, 2, 3, 4};

    for (int i = 0; i < 7; i++)
    {
        printf("&v[%d] = %p, v[%d] = %d\n", i, &v[i], i, v[i]);
    }

    return 0;
}
