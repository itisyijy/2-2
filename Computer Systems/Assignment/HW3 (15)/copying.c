#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main()
{
    char *str1;
    char str2[100];

    /* 1. allocate memory for st1 - use malloc() */
    size_t ID_len = 8 + 1;
    str1 = (char *)malloc(ID_len);

    /* 2. copy student ID into str1 - use strcpy() */
    strcpy(str1, "21102052");

    /* 3. print contents of str1 and address of str1 */
    printf("str1: %s, %p\n", str1, str1);

    /* 4. copy student ID into str2 - use strcpy() */
    strcpy(str2, "21102052");

    /* 5. print contents of str2 and address of str2 */
    printf("str2: %s, %p\n", str2, str2);

    /* 6. deallocate memory for str1 - use free() */
    free(str1);
    str1 = NULL;
    
    return (0);
}