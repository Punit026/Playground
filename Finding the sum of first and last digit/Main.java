#include <stdio.h>
int main() 
{
  int f,l,n,m;
  scanf("%d",&n);
  m=n;
  while(n>0)
  {
    l=m%10;
    f=n%10;
    n=n/10;
  }
  printf("%d",f+l);
	//Type your code
	return 0;
}