package java17;

public class TextBlock {
//    String htmlprog="<html>"+"<body>";
   static String htmlprog= """
        <html>
        <head>
        <title>First page</title>
        <body>
        <h1>Hello World</h1>
        </body>
        </head>
        </html>
        """;

    public static void main(String[] args) {
        System.out.println(htmlprog);
    }
}
