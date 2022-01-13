package Day_20_Arrays;

public class UniqElements {

    public static void main(String[] args) {

        String[] words = {"Java", "Java", "C#","Phython","Phython"};


        for (int k = 0; k < words.length; k++) {

            String element=words[k];//Java
            int frequency = 0;
            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(element)){
                    frequency++;
                }
            }
        if (frequency==1){
            System.out.println(element);
        }
        }
    }
}
