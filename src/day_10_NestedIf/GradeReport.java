package day_10_NestedIf;

import org.w3c.dom.ls.LSOutput;

public class GradeReport {
    public static void main(String[] args) {

        /*
        90~100 = execlent
        80~89 = great
        70~79 = food
        60~69 = passed
        0~59 = failed
         */
        int score = 95;
        if (score >=0 && score<=100) { // if the score is valid
            // 5 possibilities
        if (score>=90){
            System.out.println("Exelent");
        }else if (score >= 80){
            System.out.println("Great");
        }else if (score >= 70){
            System.out.println("Good");

        }else if(score>=60){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }

        }else{// if the score not valid
            System.out.println("invalid score");
    }
        System.out.println("------------------------");

    }

}
