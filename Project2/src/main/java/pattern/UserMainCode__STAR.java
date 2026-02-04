package pattern;

import java.util.Scanner;

public class UserMainCode__STAR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();

        int result=validNumber(input);

        if(result==1){
            System.out.println("Valid number");
        }
        else{
            System.out.println("Invalid number");
        }
    }
    static int validNumber(String s){
        if(s.matches("\\d{3}-\\d{3}-[0-9]{4}")){
            return 1;
        }
        else
            return -1;
    }

}
