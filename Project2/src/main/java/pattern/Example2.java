package pattern;

public class Example2 {
    public static void main(String[] args) {
        String no="1234679856";

        System.out.println(no.matches("[0-9]+"));
        System.out.println(no.matches("[\\d]+"));

        //mob number must be 10 digit
        System.out.println(no.matches("[\\d]{10}"));

        String empId="ram23454321CTS";  //alphanumeric has a-z A-Z 0-9 and _
        //[a-zA-Z0-9_] equivalent is \w

        System.out.println(empId.matches("[a-zA-Z0-9_]+"));
        System.out.println(empId.matches("\\w+"));

        System.out.println("ram kumar".matches("[a-z]+\\s[a-z]+"));

        System.out.println(empId.matches("ram.*")); //ram word in start then anything
        System.out.println(empId.matches(".*CTS$")); //CTS word in last

        System.out.println("hello123hello".matches("^.*(123).*$"));

    }
}
