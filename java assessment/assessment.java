// Level 1 Auto-generate and fill an array of 100 integers based on the below rules. Each number has to be a multiple of 9 starting from 9 (9, 18, 27, 36, ….)Take the last two digits of each number. If the difference between the last two digits is 3, make the number a negative value. Ex. 36. The difference between 3 and 6 is 3. Hence it should be stored as -3663. The difference between 6 and 3 is 3. Hence it should be stored as -63.Another example is 225. The last two digits are 2 and 5. The difference is 3. The number should be stored as -225. Display all 100 such numbers.
// Level 2 Print all those numbers which are negative values and contain the digit 3 in them.Print the count of such numbers.
// Level 3 Given that a is the array and { a[k], a[k+1] } represent a pair, display all such pairs of numbers where a[k] - a[k+1]  is a prime number. Display the count of such pairs. Guidelines for rating: If Level 1 is correct, then the rating is C3.If in addition to Level 1, either Level 2 or Level 3 is correct then the rating is C2If all the 3 levels are correct, then the rating is C1. If Level 1 is not correctly executing, but the logic is fine then C4.Otherwise C5.
public class assessment {
    public static void main(String[] args) {
        int [] arr= new int[100];
        int count = 0;
       for(int i=1; i<arr.length; i++) {
            arr[i] = i* 9;
       }
       for(int i=1; i<arr.length;i++){
        int x = arr[i];
        int y = x%10;
        int z = x/10;
        if(z>10){
            int temp = z%10;
            if(y-temp==3 || temp-y==3 ){
                System.out.println("-"+arr[i]);
                count+=1;
            }
        }
        else if(y-z==3||z-y==3){
            
            System.out.println("-"+arr[i]);
            count+=1;
        }
        else{
            System.out.println(arr[i]);
        }
        
        
       
       }  
    //    level-2
       System.out.println("total count of such type of number: " + count); 
    //    System.out.println("level-3"); 
       int flag = 0;
       for(int i=1; i<arr.length; i++){
        int a = arr[i+1]-arr[i];
            if(a>=2){
                // flag=0;
                for(int j=2; j<=a/2; j++){
                    if(a%j==0){
                        System.out.println("");
                        flag=1;
                    }else{
                        // System.out.println("prime number"+"{"+arr[i]+":"+arr[i+1]+"}");
                        flag=0;
                    
    
                    }

                }
                if(flag==0){
                    System.out.println("{"+arr[i]+":"+arr[i+1]+"}");
                }
                
            }
       }

    }
}
    
    

