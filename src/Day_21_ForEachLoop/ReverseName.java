package Day_21_ForEachLoop;

public class ReverseName {

    public static void main(String[] args) {

        String [] classMates={"Stan Bek","Adilet Bek","Tim Arstanbek","Meerim Alimbekova"};

        for(String each:classMates){

            String reversed="";

            for (int i = each.length()-1; i >=0 ; i--) {
                reversed+=each.charAt(i);
            }
            System.out.println(reversed);
        }



    }
}
