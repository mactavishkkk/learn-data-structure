#include "float_vector.h"
#include <stdio.h>

int main()
{
    FloatVector *obj = create(5);
    print(obj);

    append(obj, 1.5);
    append(obj, 2);
    append(obj, 5);

    print(obj);

    printf("FloatVector destuído.\n");
    destroy(&obj);

    return 0;
}