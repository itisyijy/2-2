#include <stdio.h>
#include <stdlib.h>

struct rec
{
    int i;
    float PI;
    char A;
};

int main()
{
    struct rec *ptr_one;
    
    /* 1. allocate memory - use malloc() */
    size_t rec_size = sizeof(struct rec);
    ptr_one = malloc(rec_size);

    /* 2. assign arbitrary values to member in struct rec */
    ptr_one->i = 10;
    ptr_one->PI = 3.14f;
    ptr_one->A = 'a';

    /* 3. print the values of members in struct rec */
    printf("-------------------------------------------------------\n");
    printf("Memory is allocated at %p (size : %ld)\n", ptr_one, rec_size);
    printf("-------------------------------------------------------\n");
    printf("First value: %d\n", ptr_one->i);
    printf("First value: %f\n", ptr_one->PI);
    printf("First value: %c\n", ptr_one->A);
    printf("-------------------------------------------------------\n");

    /* 4. deallocate memory - use free() */
    void *address = ptr_one;
    free(ptr_one);
    printf("Memory is deallocated at %p\n", address);
    ptr_one = NULL;
    address = NULL;
    printf("-------------------------------------------------------\n");
    
    return (0);
}
