package day_09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 12;
        boolean aIsMedian = (a>b && a<c) || (a>c && a<b);
        boolean bIsMedian = (b>c && b<a) || (b>a && b<c);
        boolean cIsMedian = (c>b && c<a) || (c>a && c<b);


        if (aIsMedian){
            System.out.println(a+" is Median number");
        }
        if (bIsMedian){
            System.out.println(b+" is Median number");
        }
        if (cIsMedian){
            System.out.println(c+" is Median number");
        }
    }
}
