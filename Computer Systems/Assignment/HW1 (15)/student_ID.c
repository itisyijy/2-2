#include <stdio.h>

int main()
{
	printf("\n\n\t\tStudytonight - Best place to learn\n\n\n");
	int array[100], position, c, n, value;

	printf("\n\nEnter number of elements in array: ");
	scanf("%d", &n);

	printf("\n\nEnter %d elements\n", n);
	for (c = 0; c < n; c++)
	{
		scanf("%d", &array[c]);
		scanf("");
	}

	printf("\n\nEnter the location where you want to insert new element: ");
	scanf("%d", &position);

	printf("\n\nEnter the value to insert: ");
	scanf("%d", &value);

	for (c = n - 1; c >= position - 1; c--)
		array[c + 1] = array[c];

	array[position - 1] = value;

	printf("\n\nResultant array is: ");
	for (c = 0; c <= n; c++)
		printf("%d ", array[c]);

	printf("\n\n\t\tCoding is Fun !\n\n\n");
	return (0);
}
