#include <stdio.h>
int main() 
{
  int n;
  scanf("%d",&n);
  int r,sum=0;
  while(n!=0)
  {
    r=n%10;
    n=n/10;
    sum=sum+r;
  }
  printf("%d",sum);
	//Type your code
	return 0;
}