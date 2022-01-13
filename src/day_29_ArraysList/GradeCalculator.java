package day_29_ArraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeCalculator {

    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));


        ArrayList<Integer> gradeOfA = new ArrayList<>(scores); // 90 ~ 100
        gradeOfA.removeIf(n-> !(n<=100&&n>=90));

        System.out.println(gradeOfA);

        ArrayList<Integer> gradeOfB = new ArrayList<>(scores); // 80 ~ 89
        gradeOfB.removeIf(n-> !(n<90&&n<=80));
        System.out.println(gradeOfB);

        ArrayList<Integer> gradeOfC = new ArrayList<>(scores); // 70 ~ 79
        gradeOfC.removeIf(n-> !(n<80&&n>=70));
        System.out.println(gradeOfC);

        ArrayList<Integer> gradeOfD = new ArrayList<>(scores); // 60 ~ 69
        gradeOfD.removeIf(n-> !(n<70&&n>=60));
        System.out.println(gradeOfD);

        ArrayList<Integer> gradeOfF = new ArrayList<>(scores); // 0 ~ 59
        gradeOfF.removeIf(n-> !(n<60));
        System.out.println(gradeOfF);

        System.out.println("Total number of A = " + gradeOfA.size());
        System.out.println("Total number of B = " + gradeOfB.size());
        System.out.println("Total number of C = " + gradeOfC.size());
        System.out.println("Total number of D = " + gradeOfD.size());
        System.out.println("Total number of F = " + gradeOfF.size());
    }
}
