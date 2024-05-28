#include "float_vector.h"
#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>

typedef struct float_vector
{
    int capacity;
    int size;
    float *data;
} FloatVector;


bool _isFull(const FloatVector *vector)
{
    return vector->size == vector->capacity;
}

int size(const FloatVector *vector)
{
    return vector->size;
}

int capacity(const FloatVector *vector)
{
    return vector->capacity;
}

float at(const FloatVector *vector, int index)
{
    if (index < 0 || index >= vector->size)
    {
        fprintf(stderr, "ERROR in 'at' - Index is out of bounds\n");
        exit(EXIT_FAILURE);
    }

    return vector->data[index];
}

float get(const FloatVector *vector, int index)
{
    return vector->data[index];
}

void set(const FloatVector *vector, int index, float val)
{
    if (index < 0 || index >= vector->size)
    {
        fprintf(stderr, "ERROR in 'set' - Index is out of bounds\n");
        exit(EXIT_FAILURE);
    }

    vector->data[index] = val;
}

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
    if (_isFull(vector))
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