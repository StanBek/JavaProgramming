package Day_41_Exceptions;

import Day_39_Recap.CydeoTask.Employee;

public class MultiCatchBlocks {

    public static void main(String[] args) {

        Employee employee = null;

       try {
           System.out.println(employee.getSalary());

       }catch (IndexOutOfBoundsException e) {
           System.out.println("java".charAt(9));
           System.out.println("First catch block");
           e.printStackTrace();
       }catch (ArithmeticException e){
           System.out.println("second catch block");
           e.printStackTrace();
       }catch(RuntimeException e){
           System.out.println("Third catch block");
           e.printStackTrace();
       }
       }
}
