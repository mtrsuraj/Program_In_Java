public class StringInbuildMethod {
    public static void main(String[] args) {
        String str = "github mtrsuraj ";
        String[] s = str.trim().split("");
        System.out.println(s.length);
        for (String p : s) {
            System.out.print(p);
        }
    }

}