#include <stdio.h>
int main()
{
    int n, m;
    scanf("%d", &n);
    scanf("%d", &m);
    int pos = 0;
    int neg = 0;
    int x, a, b;
    for(int i = 0; i < n; i++)
    {
        scanf("%d", &x);
        if(x == 1)
        {
            pos++;
        }
        else
        {
            neg++;
        }
    }
    for(int i = 0; i < m; i++)
    {
        scanf("%d", &a);
        scanf("%d", &b);
        int range = b - a + 1;
        if(range % 2 != 0)
        {
            printf("0\n");
        }
        else
        {
            int r = range / 2;
            if(pos >= r && neg >= r)
            {
                printf("1\n");
            }
            else
            {
                printf("0\n");
            }
        }
    }
    return 0;
}