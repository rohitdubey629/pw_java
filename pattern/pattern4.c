#include <conio.h>
#include <stdio.h>
// pattern is d
int main()
{
    int i, j, n = 10;
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < n; j++)
        {
            if (i == 0 && j < (n - 1) / 2 || j == 0 || j == (n - 1) / 2 && i > 0 && i < n - 1 || i == n - 1 && j < (n - 1) / 2)
            {
                printf(" * ");
            }
            else
            {
                printf("   ");
            }
        }
        printf("\n");
    }
}