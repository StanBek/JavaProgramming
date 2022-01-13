package Day_21_ForEachLoop;

public class UniqElements {

    public static void main(String[] args) {

        String [] words = {"Java", "Java", "C#","Phython","Phython","Stan"};

        for (String each:words){
            int count = 0;
            for (String uniq:words){
                if (uniq.equals(each)){
                    count++;
                }
            }
                if(count==1){
                    System.out.println(each);
            }
        }






    }



}
