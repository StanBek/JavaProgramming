package Day_21_ForEachLoop;

public class Initials {
    public static void main(String[] args) {

        String [] classMates={"Stan Bek","Adilet Bek","Tim Arstanbek","Meerim Alimbekova"};
        for (String each:classMates){
            String intials=each.charAt(0)+"."+each.charAt(each.indexOf(" ")+1);
            System.out.println(intials);
        }




    }
}
