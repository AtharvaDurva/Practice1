package javaPractice;

public class ReverseString {
    // 1. using for loop way to print reverse the string
    //interview que
    //1.reverse a string
    //2.different between string and string buffer
    //3.do we have reverse function is string ? ans NO
    public static void main(String[] args) {
        String s = "Margi";
        int lenghth = s.length();
        String rev = " ";
        for (int i = lenghth - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);

            System.out.println(rev);
            // 2. using a string buffer
            StringBuffer sb = new StringBuffer(s);
            System.out.println(sb.reverse());


        }

    }
}