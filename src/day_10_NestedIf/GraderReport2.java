package day_10_NestedIf;

public class GraderReport2 {

    public static void main(String[] args) {
        int s =120;
        String result = (s>=0&&s<=100)? (s>=90)? "Excellent" :(s>=80)?"Great" :(s>=70)?"Good"
                :(s>=60)?"Passed":"Failed":"Invalid score";
        System.out.println(result);
    }
}
