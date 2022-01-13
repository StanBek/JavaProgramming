package practice_12_01_21;

public class SwithExCat {
    public static void main(String[] args) {
      String animal = "CAT";
      String result = "";

      switch(animal){
          case "DOG":
              result="domestic animal";
              break;
          case "CAT":
              result="domestic animal";
              break;
          case "TIGER":
              result="wild animal";
              break;
          default:
              result="unkown animal";
      }

        System.out.println(result);

    }

}
/*
DOG - domestic animal
CAT - domestic animal
TIGER - wild  animal
For other animal - unknown animal
 */