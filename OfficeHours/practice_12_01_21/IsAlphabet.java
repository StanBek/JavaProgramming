package practice_12_01_21;

public class IsAlphabet {
    public static void main(String[] args) {

        char ch = ')';

        if (ch>='A'&&ch<='Z'||ch>='a'&&ch<='z'){
            System.out.println("Your letter is in alphabet");
        }else{
            System.out.println("Your letter is not in alphabet");
        }
    }
}
