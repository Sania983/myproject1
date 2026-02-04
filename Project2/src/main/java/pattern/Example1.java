package pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {
    public static void main(String[] args) {
      //  String s="hello world";
       // String pattern="[a-z]+";

//        Pattern pattern1=Pattern.compile(pattern);
//        Matcher matcher=pattern1.matcher(s);
//
//        System.out.println(matcher.find());


        String name="ramkumar";
        System.out.println(name.matches("[a-z]+"));

        String age="123";
        System.out.println(age.matches("[0-9]+"));

        String text="cizrPV123";
        System.out.println(age.matches("[a-zA-Z0-9]+"));

        //string match anything other than hello
        System.out.println("morning".matches("[^hello]"));
        System.out.println("hello".matches("[^hello]"));

        //System.out.println("abg".matches("[a.g]"));

        System.out.println("aza".matches("[a-z]{3}"));
        System.out.println("azeyu".matches("[a-z]{3,8}"));
    }
}
