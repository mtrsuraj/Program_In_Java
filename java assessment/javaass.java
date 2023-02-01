public class javaass {
    public static void main(String[] args) {
        

		
		
		// TODO Auto-generated method stub
		
		
		        int num, x, y, n, temp = 0, temp1, temp2 = 0;
		        int count=0;
		        int [] arr = new int[1000];
		        
		        for(int i=1; i<arr.length;i++){
		            if(i%2==0){
		                continue;
		            }else{
		                num = i*7;
		                arr[i]=num;
		                count+=1;
		                if(count<=100){
		                    System.out.println("multiple of seven (100number) "+num);
		                }
		                
		               if(num<100 && num>7) {
		                	y=num;
		                	x=y/10;
		                	if(x%2==0) {
		                		System.out.println(y);
		                		count+=1;
		                	}
		               }
//		                	
		                	else if(num>=100 && num<1000) {
		                		y=num;
		                		x=y/100;
		                		if(x%2==0) {
		                			System.out.println(y);
		                			count+=1;
		                			
		                		}
		                	}
		                	else if(num>=1000 && num<10000) {
		                		y=num;
		                		x=y/1000;
		                		if(x%2==0) {
		                			System.out.println(y);
		                			count+=1;
		                		}
		                	}
		               
		                	
		                
		                
		            }
		                
		        }
		        System.out.println("total such number"+count);
		        System.out.println("I have print 100 number multiple of seven");
		        System.out.println("Now i'm going to print 1000 number");
		        for(int i=0; i<arr.length; i++){
		            if(arr[i]==0){
		                continue;
		            }
		            else
		            System.out.println("array store 1000 number"+ arr[i]);
		            	temp2=0;
		            if(arr[i]/100==1) {
		            	n=arr[i];
//		            	System.out.println(n);
		            	while(n>0) {
//		            		temp=n;
			            	temp=n%10;
			            	temp2=temp2*10+temp;
			            	n/=10;
//			            	n=temp1;
		            		
		            	}
		            	System.out.println("reverse number"+temp2);
		            	
		            	
		            }
		        }
		    }
}
  