//Write a program that finds the summation of every number from 1 to num.
//The number will always be a positive integer greater than 0. 
//Your function only needs to return the result, 
//what is shown between parentheses in the example below 
//is how you reach that result and it's not part of it, see the sample tests.

#include <stdio.h>

int summation(int num){
  int total = 0;

  while(num > 0){
    total += num;
    num--;
  }

  return total;
}


int main(){
  
  int a = summation(10);

  printf("%d\n\n", a);

  return 0;
t
