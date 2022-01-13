package Day_24_CustomMethod_Return;

public class ReturnStatementTwo {

    public static void main(String[]args){
        nameOfMonth(30);
    }

    //3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth ( int number){

        if(number<1||number>12){
            System.out.println("Invalid");
            return;
        }

        String name="";
            if(number>=1&&number<=12){
                name=(number==1)?"Jan":(number==2)?"Feb":(number==3)?"Mar":(number==4)?"Apr":
                        (number==5)?"May":(number==6)?"June":(number==7)?"July":(number==8)?"August":(number==9)?"September":(number==10)?"October":(number==11)?"November":"December";
            }else{
                name = "Invalid";
            }
            System.out.println(name);
            }
}
