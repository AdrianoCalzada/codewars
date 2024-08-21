#include <stdio.h>

int past(int hours, int minutes, int seconds){
  int time;
  return time = (hours * 60 * 60 * 1000) + (minutes * 60 * 1000) + (seconds * 1000);
}

int main(){
int a = past(1, 0, 0);

printf("%d\n\n", a);
}
