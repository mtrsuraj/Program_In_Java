// Level 1 (30mins)Generate the first 100 multiples of 7 which are positive numbers and also odd numbers. 
// Store these 1000 numbers in an array.Example of such numbers: 7, 21, 35, 63, 77, 105 
// Store these 1000 numbers in an array.Display these 100 numbers.
// Level 2 (30mins)1. Print all such numbers to which starts with an even digit.2. Print how many such numbers are found.Example of such numbers: 21,49,63……
// Level 3 (30mins)Display how many of the numbers stored in the array have the digit 1. Replace the numbers with reverse of the numbers.Examples of such numbers: 21In this case the reverse of 21 is 12. 
// Hence, 21 should be replaced with 12 in the array. Similarly, 105 will be replaced with 501.
public class javas {
    public static void main(String[] args) {
        int [] arr = new int [1000];
        for(int i = 1; i < arr.length; i++){
            if(i%2==0){
                continue;
            }else {
                arr[i] = 7*i;
                //hold 1000 number
                    // System.out.println(arr[i]);
            }
        }
        for(int i=0; i<=100; i++){
            //print only 100 element of array
            if(arr[i]==0){
                continue;
            }
            // System.out.println(arr[i]);

        }
        for(int i=0; i<=100; i++){
            int x = arr[i];
            if(x>10 && x<100){
                int y = x/10;
                if(y%2==0){
                    // System.out.println(arr[i]);
                }
            }else if(x>100 && x<1000){
                int z=x/100;
                if(z%2==0){
                    // System.out.println(arr[i]);
                }
            }else if(x>1000){
                int z=x/1000;
                if(z%2==0){
                    // System.out.println(arr[i]);
                }
            }
        }
        int rev=0;
        
        for(int i=0;i<100; i++){
            if(arr[i]==0){
                continue;
            }
            int x=arr[i];
            int y = x%10;
            // System.out.println(y);
            if(y==1){
                int temp=arr[i];
                 rev=0;
                System.out.println(temp);
                while(temp>=1){
                 int z = temp%10;
                rev = rev *10+z;
                temp=temp/10;
                // System.out.println(rev);

                }
                System.out.println(rev);
                
            }
            // System.out.println(rev);
        }
        
    }
    
}
