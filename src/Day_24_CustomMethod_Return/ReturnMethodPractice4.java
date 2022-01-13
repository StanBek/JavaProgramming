package Day_24_CustomMethod_Return;

public class ReturnMethodPractice4 {

    public static void main(String[]args){

        String str = "cccccccccdddaaafffbbb";
        str = removeDublicates(str);

        System.out.println(str);
    }
    //create a method that can remove dublicated characters from a string and returns the new value

    public static String removeDublicates(String str){//"aaabbcc"=="abc"

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if(!result.contains(""+each)){
                result+=each;
            }
        }
        return result;
    }


}
