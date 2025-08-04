#include <stdio.h>
#include <stdlib.h>
#include <stddef.h>

int* count_positives_sum_negatives(
  int *values, size_t count, int *positivesCount, int *negativesSum) 
{
  // Please store the positives count in the memory, pointed to
  // by the positivesCount parameter.
  
  // Please store the negatives sum in the memory, pointed to
  // by the negativesSum parameter.
  
*positivesCount = 0;
*negativesSum = 0;

  for(int i = 0; i < count; i++){
    if(values[i] > 0){
      (*positivesCount)++;}
    else if (values[i] < 0) {
      (*negativesSum) += values[i];
        } 
  }
  
  int *array = malloc(2 * sizeof(int));

  array[0] = *positivesCount;
  array[1] = *negativesSum;

  return array;

}


