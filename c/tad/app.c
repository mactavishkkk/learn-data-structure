#include "float_vector.h"
#include <stdio.h>

int main()
{
    FloatVector *obj = create(10);
    printf("FloatVector criado\n");

    puts("...");

    printf("FloatVector destuído.\n");
    destroy(&obj);

    return 0;
}