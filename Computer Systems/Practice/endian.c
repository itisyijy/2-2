#include <stdio.h>

void byteOrder(unsigned char *p, unsigned int size) {
    for (unsigned int i = 0; i < size; i++) {
        printf("==%p %x\n", p+i, p[i]);
    }
    printf("\n");
}

int main(int argc, char *argv[]) {
    int arr[] = {1, 2, 3};
    
    for (int i = 0; i < 3; i++) {
        printf("%p %x\n", &arr[i], arr[i]);
        byteOrder((unsigned char *) &arr[i], sizeof(int));
    }
}

// Little-endian in ION2.
// No effects on order of array elements.
// Only for each integers' byye order