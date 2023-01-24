#include <stdio.h>
#include <limits.h>

int main()
{
    int intMin = INT_MIN;
    float tmp = (float) INT_MIN;
    while (tmp - intMin == 0)
    {
        intMin++;
        tmp = (float)intMin;
    }
    printf("%d\n%f", intMin, tmp);
    return 0;
}