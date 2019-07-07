#include <stdio.h>
int main() 
{
  int n,i,j,s=0,m=1,r,f;
  scanf("%d",&n);
  f=n;
  for(i=0;n!=0;i++)
  {
    r=n%10;
    m=1;
    for(j=1;j<=r;j++)
    {
      m=m*j;
    }
    n=n/10;
    s=s+m;
  }
  if(s==f)
    printf("Yes");
  else
    printf("No");
	//Type your code
	return 0;
}