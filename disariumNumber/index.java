// Special Numbers
// Given a number “n”, find if sum of its digits powered with their respective
// positions is equal to the number itself.Examples: 
// Input   : n = 135
// 1^1 + 3^2 + 5^3 = 135
// Input   : n = 89
// 8^1+9^2 = 89
// Input   : n = 80
// 8^1 + 0^2 = 8
// Display all such special numbers between 1 to 10,000.
// Display out of these special numbers how many are 2 digit, 3 digit and 4
// digit numbers between 1 to 10,000. 
// Display the total count of such special numbers.

public class index {

    public static void main(String[] args) {
        SpecialNumber sp = new SpecialNumber();
        sp.special(10000);
    }

}

class SpecialNumber {

    public void special(int x) {
        int[] numbers = new int[x];
        for (int i = 1; i < numbers.length; i++) {
            // numbers[i] = i;
            // int n = numbers[i];
            dCount(i);

        }
        System.out.println("Total count of disarium :" + spCount);

    }

    int spCount = 0;

    public void dCount(int dnum) {
        int sNumber = 0;
        int fnumber;

        // System.out.println(dnum);
        int count = dnum;
        String s = Integer.toString(dnum);
        // System.out.println(s);
        int len = s.length();

        while (count > 0) {
            fnumber = count % 10;
            sNumber = sNumber + (int) Math.pow(fnumber, len);
            len--;
            count = count / 10;
        }

        if (sNumber == dnum) {
            System.out.println("Disarium Number :" + sNumber);
            spCount += 1;
        } else
            System.out.println("Not Disarium Number :" + sNumber);

        // System.out.println(dnumber);
    }

}
