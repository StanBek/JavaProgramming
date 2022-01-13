package Day_30_CustomClass;

public class capitalOne {

    public static void main(String[] args) {


        Employee employee1=new Employee();
        Employee employee2=new Employee();
        Employee employee3=new Employee();
        Employee employee4=new Employee();
        Employee employee5=new Employee();

        employee1.setInfo("John",'M',25,2237,"Developer",100000,true);
        employee2.setInfo("Anna",'F',28,2287,"QA",85000,true);
        employee3.setInfo("David",'M',35,2256,"QA",45000,false);
        employee4.setInfo("Lina",'F',45,2290,"Manager",80000,true);
        employee5.setInfo("Kevin",'M',35,2298,"Senior QA", 110000,true);

        Employee[] employees = {employee1,employee2,employee3,employee4,employee5};

        int countFullTime = 0;
        int countPartTime = 0;
        double maxSalary = employees[0].salary;
        double minSalary= employees[0].salary;
        for (Employee each : employees) {
            if(each.isFullTime){
                countFullTime++;
            }else{
                countPartTime++;
            }
            if(each.salary>maxSalary){
                maxSalary=each.salary;
            }
            if(each.salary<minSalary){
                minSalary=each.salary;
            }

        }
        System.out.println("countFullTime = " + countFullTime);
        System.out.println("countPartTime = " + countPartTime);
        System.out.println("maxSalary = " + maxSalary);
        System.out.println("minSalary = " + minSalary);

    }
}
/*1. create 5 Employee objects
    2. store those 5 employee objects into an array
    3. how many employees are full time employees?
    4. What's the minimum salary
    5. what's the maximum salary

 */