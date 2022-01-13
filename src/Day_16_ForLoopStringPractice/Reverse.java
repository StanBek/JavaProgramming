package Day_16_ForLoopStringPractice;

public class Reverse {

    public static void main(String[] args) {
        String name = "Wooden Spoon";
        //index:       0123456789
        //name.charAt(name.length()-1)==>n
        String result = ""; // contain the reverse version of str
       /*
        result+=name.charAt(11);//n
        result+=name.charAt(10);//o
        result+=name.charAt(9);//o
        result+=name.charAt(8);//p
        result+=name.charAt(7);
        result+=name.charAt(6);
        result+=name.charAt(5);
        result+=name.charAt(4);
        result+=name.charAt(3);
        result+=name.charAt(2);
        result+=name.charAt(1);
        result+=name.charAt(0);

        System.out.println(result);
*/

        for (int i = name.length()-1; i >=0 ; i--) {//i:index numbers of name (starting from last index to index 0)
            result+=name.charAt(i);// adding each character to result
        }
        System.out.println(result);

    }
}
