#include "float_vector.h"
#include <stdlib.h>

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