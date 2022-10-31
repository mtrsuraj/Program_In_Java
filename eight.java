import java.util.*;
class eight
{
public static void main(String arg[])
{
int row,i,col=1,f,j,l,m;
int xyz=800;
Scanner sc=new Scanner(System.in);
row=sc.nextInt();
for(i=0;i<=row;i++)
{
	int ans=xyz+i*col;
	f=ans%10;
	j=ans/10;
	m=j%10;
	l=ans/100;
	System.out.println(ans);
	System.out.println(f+l+m);
	col++;
}
}
}