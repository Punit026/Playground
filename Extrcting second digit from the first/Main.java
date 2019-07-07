#include <stdio.h>
int main() 
{
  int n,s,rev,r;
  scanf("%d",&n);
  while(n>0)
  {
     r=n%10;
    n=n/10;
    rev=rev*10+r;
  }
    rev=rev/10;
    s=rev%10;
  printf("%d",s);        
	//Type your code
	return 0;
}