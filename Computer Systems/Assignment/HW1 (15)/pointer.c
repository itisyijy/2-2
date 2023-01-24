#include <stdio.h>

#define MAX 4

int main()
{
    printf("\n\n\t\tStudytonight - Best place to learn\n\n\n");
    int var[MAX];
    int i, *ptr;

    *(var) = 100;
    *(var + 1) = 200;
    *(var + 2) = 300;
    *(var + 3) = 21102052;
    ptr = var;
    for (i = 0; i < MAX; i++)
    {
        printf("\n\n\nAddress of var[%d] = %x ", i, ptr);
        printf("\nValue of var[%d] = %d ", i, *ptr);
        ptr++;
    }
    printf("\n\n\t\tCoding is Fun !\n\n\n");
    return (0);
}