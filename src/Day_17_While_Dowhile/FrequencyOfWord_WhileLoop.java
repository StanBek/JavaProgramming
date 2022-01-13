package Day_17_While_Dowhile;

public class FrequencyOfWord_WhileLoop {

    public static void main(String[] args) {

        String str = "Java Java Python Python";

        int frequency = 0;

        while (str.contains("Java")){
            str=str.replaceFirst("Java", "");
            frequency++;
        }
        System.out.println(frequency);


        System.out.println("------------------------------");

        String sentence = "Cat Cat Cat Cat Cat Nat Mat";

        int countCat = 0;
        while (sentence.contains("Cat")){
            sentence=sentence.replaceFirst("Cat", "");
            countCat++;
        }
        System.out.println(countCat);

        System.out.println("------------------------------------");

        String s = "java kava java java python python python";
        int java = 0;
        int python = 0;
        while (s.contains("java")||s.contains("python")){
            if (s.contains("java")){
                s=s.replaceFirst("java","");
            java++;
            }
            if (s.contains("python")){
                s=s.replaceFirst("python","");
                python++;
            }

        }

        System.out.println(java);
        System.out.println(python);



    }
}
