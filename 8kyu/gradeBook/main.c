#include <stdio.h>

char getGrade(int a, int b, int c){
  int average;
  average = (a + b + c) / 3;
  
  if (average >= 90)
    return 'A';
  else if (average >= 80 && average < 90)
    return 'B';
  else if (average >= 70 && average < 80)
    return 'C';
  else if (average >= 60 && average < 70)
    return 'D';
  else
    return 'F';
}

int main(){

char a;
a = getGrade(70, 70, 100);

printf("%c\n\n", a);

}
