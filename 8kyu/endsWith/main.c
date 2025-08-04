#include <stdio.h>

// Função para calcular o tamanho de uma string
int stringSize(char *string) {
    int size = 0;
    char *ptr = string;

    while (*ptr != '\0') { // Usar '\0' para o caractere nulo
        size++;
        ptr++;
    }

    return size;
}

// Função para verificar se uma string termina com outra string
int endsWith(char *string, char *ending) {
    int stringLen = stringSize(string);
    int endingLen = stringSize(ending);

    if (endingLen > stringLen || endingLen < 0) {
        return 0; // Se a terminação for maior que a string ou menor que 1, retorna falso
    }

    // Comparar os últimos caracteres das duas strings
    for (int i = 0; i < endingLen; i++) {
        if (string[stringLen - endingLen + i] != ending[i]) {
            return 0;
        }
    }

    return 1;
}

int main() {

    int a = endsWith("Adriano", "ano");
    int b = endsWith("Adriano", "pano");
    int c = endsWith("Adriano", "");

    printf("%d\t%d\t%d\n", a, b, c);

    printf("\nTamanho de nada: %d\n", stringSize(""));

    return 0;
}

