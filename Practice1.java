package javaPractice;

public class Practice1 {
    public static void main(String[] args) {
        int percentage = 35;


        if (percentage>=90)
        {System.out.println("Result = First Class");}
        else if (percentage<90 && percentage>75) {
            System.out.println("Result = Second Class");}
        else if (percentage<75 && percentage>50){
            System.out.println("Result = Pass Class");
        } else {
            System.out.println("Result = Failed");

        }

    }
}
