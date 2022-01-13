package Day_30_CustomClass;

import java.util.ArrayList;

public class StudentsObjects {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Stan",'M',39,2210,'C');
        System.out.println(student1);

        Student student2 = new Student();
        student2.setInfo("Meerimn",'F',30,2219,'A');
        System.out.println(student2);

        Student student3=new Student();
        student3.setInfo("Adika",'M',27,2211,'C');

        Student student4=new Student();
        student4.setInfo("Tim",'M',22,2209,'B');

        Student student5=new Student();
        student5.setInfo("Nurdin",'M',27,2207,'C');

        Student[] students={student1,student2,student3,student4,student5};

        for (Student student : students) {
            System.out.println(student);

            System.out.println("====================================");


            ArrayList<Student> earlyBirds=new ArrayList<>();
            ArrayList<Student> angryBirds=new ArrayList<>();

            for (Student each : students) {
                if(each.grade=='A'){
                    earlyBirds.add(each);
                }else{
                    angryBirds.add(each);
                }
            }

            System.out.println(earlyBirds);
            System.out.println(angryBirds);



        }
    }
}
