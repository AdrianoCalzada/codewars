#include <stdio.h>
#include <string.h>

void stupidBinary(const char *a, char *buffer){
  int size = strlen(a);

  for(int i = 0; i < size; i++){
    if(a[i] >= '5')
      buffer[i] = '1';
    else
      buffer[i] = '0';
  }

  buffer[size] = '\0';

}

int main(){
  
  char a[] = "1234567";
  char b[] = "";

  printf("%s\n\n", a);
  stupidBinary(a, b); 
  printf("%s\n\n", b);

  return 0;
}
