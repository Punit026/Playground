#include <stdio.h>
int main() 
{
  int m,n,i,j,c=0,s=0,r;
  scanf("%d",&n);
  m=n;
  for(i=0;n!=0;i++)
  {
    n=n/10;
    c++;
  }
  n=m;
  for(i=0;n!=0;i++)
  {
    r=n%10;
      r=r*r*r;
      s=s+r;
    n=n/10;
  }
  if(s==m)
    printf("Armstrong Number");
  else
      printf("Not an Armstrong Number");
	//Type your code
	return 0;
}