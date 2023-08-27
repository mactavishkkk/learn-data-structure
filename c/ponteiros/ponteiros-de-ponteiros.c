#include <stdio.h>
#include <stdlib.h>

int main()
{
    float z = 2.5;
    float *fp1;

    fp1 = &z;

    printf("&z = %p, z = %f\n", &z, z);
    printf("&fp1 = %p, fp1 = %p, *fp1 = %f\n\n", &fp1, fp1, *fp1);

    printf("*&z = %f\n", *&z);
    printf("*fp1 = %f\n", *fp1);
    printf("**&fp1 = %f\n", **&fp1);

    return 0;
}