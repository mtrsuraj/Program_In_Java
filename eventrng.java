public class eventrng
{    
public static void main(String args[])   
{    
//i for rows and j for columns      
//row denotes the number of rows you want to print  
int i, j, row = 6; 
 int p=1;   
//Outer loop work for rows  
for (i=1; i<row; i++)   
{  
//inner loop work for space      
//for (j=2*(row-i); j>=0; j--) 
for(j =1; j<=i; j++)	
{
	if(p%2==0){
	System.out.print(-p*p);
	}
	else
	{
		System.out.print(" "+p*p);
	}
	p++;
}//else System.out.print("*");   
//inner loop for columns  
//for (j=0; j<=i; j++ )   
//{   
//prints star      
//System.out.print("* ");   
//}   
//throws the cursor in a new line after printing each line  
//System.out.println(); 
System.out.println();   
}  
} 
}  
