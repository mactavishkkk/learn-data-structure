#include "float_vector.h"
#include <stdlib.h>
#include <stdio.h>

typedef struct float_vector
{
    int capacity;
    int size;
    float *data;
} FloatVector;

FloatVector *create(int capacity)
{
    FloatVector *vector = (FloatVector *)calloc(1, sizeof(FloatVector));
    vector->size = 0;
    vector->capacity = capacity;
    vector->data = (float *)calloc(capacity, sizeof(float));

    return vector;
}

void destroy(FloatVector **vector_reference)
{
    FloatVector *aux = *vector_reference;

    free(aux->data);
    free(aux);
    *vector_reference = NULL;
}

void append(FloatVector *vector, float val)
{
    if (vector->size == vector->capacity)
    {
        fprintf(stderr, "ERROR in 'append' - Vector is full\n");
        exit(EXIT_FAILURE);
    }

    vector->data[vector->size] = val;
    vector->size++;
}

void print(const FloatVector *vector)
{
    puts("----------");
    printf("Size: %d\n", vector->size);
    printf("Capacity: %d\n", vector->capacity);
    puts("");

    for (int i = 0; i < vector->size; i++)
    {
        printf("[%d] = %f\n", i, vector->data[i]);
    }
    puts("----------\n");
}