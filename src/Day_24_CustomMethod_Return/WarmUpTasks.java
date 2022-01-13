package Day_24_CustomMethod_Return;

public class WarmUpTasks {
    public static void main(String[] args) {

        domain("Cydeo.School@amazon.com");
        System.out.println("---------------------------------------");

        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulshen@gmail.com"};

        for (String email : emails) {
            domain(email);
        }
        System.out.println("------------------------------------");
        nameOfMonth(4);
    }

    //1. Create a method that can display the initials of the person. Initials (String firstName, String lastName)

    //2. Create a method that can display the domain of the email
        public static void domain(String email){/*String domain = email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
                System.out.println(domain);
            }
            ...
         */}
        //3. Create a method that can display the name of the month based on the given number to the method
        public static void nameOfMonth ( int number){/*String name="";
            if(number>=1&&number<=12){
                name=(number==1)?"Jan":(number==2)?"Feb":(number==3)?"Mar":(number==4)?"Apr":
                        (number==5)?"May":(number==6)?"June":(number==7)?"July":(number==8)?"August":(number==9)?"September":(number==10)?"October":(number==11)?"November":"December";
            }else{
                name = "Invalid";
            }
            System.out.println(name);
            ...
             */}
        //4. Create a method that can print the name of the day based on the given number to the method
        public static void daysInMonth(int number){}
        //5. Create a method that can print how many days a month has
        // 6.age groups

    }

