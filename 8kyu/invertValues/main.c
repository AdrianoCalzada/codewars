/*
Given a set of numbers, return the additive inverse of each. 
Each positive becomes negatives, and the negatives become positives.*/

#include <stdio.h>
#include <stdlib.h>
#include <stddef.h>

void invert(int *values, size_t values_size)
{

  for(size_t i = 0; i < values_size; i++)
    values[i] *= -1;
}

int main(){

  return 0;
}
