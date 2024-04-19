#include <stdio.h>
#include <stdlib.h> // NULL, malloc, calloc, free

int main()
{
  // alocacao estatica
  int vs[5] = {0, 10, 20, 30, 40};

  puts("### VETOR ESTATICO ###");
  printf("&vs[] = %p vs[] = %p\n", &vs, vs);

  for (int i = 0; i < 5; i++)
  {
    printf("&vs[%d] = %p, vs[%d] = %d\n", i, &vs[i], i, vs[i]);
  }
  puts("\n");

  // alocacao dinamica
  int *vhm = (int *)malloc(5 * sizeof(int));

  puts("### VETOR DINAMICO ###");
  puts("--- malloc");
  printf("&vhm[] = %p vhm[] = %p\n", &vhm, vhm);

  for (int i = 0; i < 5; i++)
  {
    printf("&vhm[%d] = %p, vhm[%d] = %d\n", i, &vhm[i], i, vhm[i]);
  }
  puts("\n");

  int *vhc = (int *)calloc(5, sizeof(int));

  puts("--- calloc");
  printf("&vhc[] = %p vhc[] = %p\n", &vhc, vhc);

  for (int i = 0; i < 5; i++)
  {
    printf("&vhc[%d] = %p, vhc[%d] = %d\n", i, &vhc[i], i, vhc[i]);
  }
  puts("\n");

  return 0;
}