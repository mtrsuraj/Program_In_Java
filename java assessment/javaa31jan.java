
// Level 1 
// Auto-generate and fill an array of 100 integers with 3-digit Random numbers. Display the numbers. 
// Level 2 
// Given that { a[k], a[k+1] } represent a pair, display all such pairs of numbers where a[k] - a[k+1] is a prime number. 
// Display the count of such pairs. 
// Display the sub-arrays within the array, where a[k],a[k+1],a[k+2],a[k+3],a[k+4]…a[k+n] are in the ascending order. 

public class javaa31jan {
    public static void main(String[] args) {
        int arr[] = new int[100];
        int flag = 0;
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 1000);
        }
        for (int i = 0; i < arr.length; i++){
            if(arr[i]>100){
                // System.out.println(arr[i]);
                
                System.out.println(arr[i]);
            }
            
        }
        for(int i = 0; i < arr.length; i++){
            int x = arr[i]-arr[i+1];
            // System.out.println(arr[i]);
            for(int j = 2; j < x/2; j++){
                if(x%j==0){
                    // System.out.println("not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                // if(arr[i]%2==0){
                //     continue;
                // }else
                System.out.println(arr[i]);
                flag=1;
            }
           
        }
       
        for(int i = 0; i < arr.length; i++){
            int temp = arr[i];
            int temp1 = arr[i+1];
            if(temp>temp1){
                int temp2 = temp;
                temp = temp1;
                temp1 = temp2;
                System.out.println(temp2);
            }
        }
        
    }
}
