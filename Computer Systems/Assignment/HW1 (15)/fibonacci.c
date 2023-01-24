#include <stdio.h>

void fibonacci(int num);

int main()
{
	int num = 0;

	printf("Enter number of terms: ");
	scanf("%d", &num);
	fibonacci(num);
}

void fibonacci(int num)
{
	int a = 0;
	int b = 1;
	int c;

	if (num == 1)
		printf("%d", a);
	if (num >= 2)
		printf("%d\t%d", a, b);
	for (int i = 3; i <= num; i++)
	{
		c = a + b;
		printf("\t%d", c);
		a = b;
		b = c;
	}

}