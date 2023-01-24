#include <stdio.h>
#include <stdlib.h>

void ini_matrix(int **matrix)
{
    printf("input the matrix:\n");
    for (int i = 0; i < 4; i++)
        scanf("%d %d %d %d", &matrix[i][0], &matrix[i][1], &matrix[i][2], &matrix[i][3]);
    printf("\n");
    return ;
}

void print_matrix(int **matrix)
{
    for (int i = 0; i < 4; i++)
    {
        for (int j = 0; j < 4; j++)
            printf("%d\t", matrix[i][j]);
        printf("\n");
    }
    printf("\n");
    return ;
}

void transpose_matrix(int **matrix, int **matrix_t)
{
    for (int i = 0; i < 4; i++)
    {
        for (int j = 0; j < 4; j++)
        {
            matrix_t[i][j] = matrix[j][i];
        }
    }
    return ;
}

void add_matrix(int **matrix, int **matrix_t)
{
    for (int i = 0; i < 4; i++)
        for (int j = 0; j < 4; j++)
            matrix[i][j] += matrix_t[i][j];
    return ;
}

int main()
{
    int **matrix;
    int **matrix_t;

    matrix = (int **)malloc(4);
    matrix_t = (int **)malloc(4);

    for (int i = 0; i < 4; i++)
        matrix[i] = (int *)malloc(4);
    for (int i = 0; i < 4; i++)
        matrix_t[i] = (int *)malloc(4);

    ini_matrix(matrix);
    printf("matrix:\n");
    print_matrix(matrix);

    printf("transpose matrix:\n");
    transpose_matrix(matrix, matrix_t);
    print_matrix(matrix_t);
    
    printf("sum of matrix:\n");
    add_matrix(matrix, matrix_t);
    print_matrix(matrix);

    return (0);
}