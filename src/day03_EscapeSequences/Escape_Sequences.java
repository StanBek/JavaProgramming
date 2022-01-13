package day03_EscapeSequences;
/*
escape sequences: MUST be given with double code
\n: start a new line
\t: paragraph space (tab)
\\: one back slash, if need 2 back slash, need put 4 back slash
\": double quote
 */
public class Escape_Sequences {

    public static void main(String[] args) {

        System.out.println("Java Python C#");

        System.out.println("Java \nPython \nC#");

        System.out.println("------------------");

        System.out.println("\tJava is Cool Programming language");// in order to print double code

        System.out.println("/ \\"); // in order to print 1 back slash we need to give two backword slash

        System.out.println("My favorite TV show is \"Game of Thrones\"");

    }
}
