package day_09_IfStatements;

public class SchoolLevel {

    public static void main(String[] args) {
        byte age = 9;
        String name;
        if (age==1||age==2||age==3||age==4||age==5){

            name = " Elementary School";
        }else if(age==6||age==7||age==8){
            name= " Middle School";
        }else if(age==9||age==10||age==11||age==12){
            name=" High School";
        }else if(age==13||age==14||age==15||age==16){
            name= " College";
        }else{
            name=" Grad School";

    }
        System.out.println(name +" "+ age);

    }
}
/*
Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

            Assume that the given number is 1 ~ 18

public static void main(String[] args) {
        byte age = 9;;
        if (age==1||age==2||age==3||age==4||age==5){
            System.out.println(age+" Elementary School");
        }else if(age==6||age==7||age==8){
            System.out.println(age+ " Middle School");
        }else if(age==9||age==10||age==11||age==12){
            System.out.println(age+ " High School");
        }else if(age==13||age==14||age==15||age==16){
            System.out.println(age+ " College");
        }else{
            System.out.println(age+ " Crad School");

    }


    }
}
 */