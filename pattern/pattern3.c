#include <conio.h>
#include <stdio.h>

int main()
{
    int i, j, n = 10;
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < n; j++)
        {
            if (j == 0 || j == n - 1 || i == (n - 1) / 2)
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }
        printf("\n");
    }
}