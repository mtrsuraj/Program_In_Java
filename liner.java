class liner
{
public static void main(String arg[])
{
int a[]={1,2,3,4,8,6,7};
int n=6;	int pos=-1;
for(int i=0;i<a.length;i++)
{
	if(a[i]==n)
	{
			pos=a[i];
			break;
	}
}
	if(pos==-1)
	{
			System.out.println("the value is not found");
	}
	else
	{
		System.out.println("the value is="+pos);
	}
}	
}