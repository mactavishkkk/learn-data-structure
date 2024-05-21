typedef struct float_vector FloatVector;

FloatVector *create(int capacity);
void destroy(FloatVector **vector_reference);

int size(const FloatVector *vector);
int capacity(const FloatVector *vector);
float at(const FloatVector *vector, int index);
float get(const FloatVector *vector, int index);
void append(const FloatVector *vector, float val);
void set(const FloatVector *vector, int index, float val);
void print(const FloatVector *vector);