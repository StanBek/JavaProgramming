package Day_35_Encapsulation;

public class CydeoStudents {

    public String name;
    public char gender;
    public int age;
    public int bathNumber;
    public int groupNumber;
    public static String schoolName;
    public String fieldOfStudy;
    public static String programmingLanguage;
    public static String secretCode;

    public CydeoStudents(String name, char gender, int age, int bathNumber, int groupNumber, String fieldOfStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.bathNumber = bathNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }

    static{
        schoolName="Cydeo";
        programmingLanguage="Java";
        secretCode="WS";

    }

    public static void printSchoolName(){
        System.out.println(schoolName);
    }

    public void attendClass(){
        System.out.println(name);
    }

    public String toString() {
        return "CydeoStudents{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", bathNumber=" + bathNumber +
                ", groupNumber=" + groupNumber +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", school is '" + schoolName + '\'' +
                '}';
    }
}


/*
create a class named CydeoStudent
            Variables:
                name, gender, age, batchNumber, groupNumber,
                schoolName, fieldOfStudy, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()
 */