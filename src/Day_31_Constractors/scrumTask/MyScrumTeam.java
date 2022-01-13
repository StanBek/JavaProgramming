package Day_31_Constractors.scrumTask;

public class MyScrumTeam {
    public static void main(String[] args) {


        Tester tester1 = new Tester("Bek", 11, "QA", 112000);
        Tester tester2 = new Tester("ADIKA", 14, "QA", 132000);
        Tester tester3 = new Tester("Stan", 17, "SDET", 152000);
        Tester tester4 = new Tester("TIM", 19, "SE", 142000);

        Tester[]testers={tester1,tester3,tester2,tester4};

        Developer developer1 = new Developer("Meery", 23, "Java Developer", 145000);
        Developer developer2 = new Developer("Aygun", 33, "Java Master", 105000);
        Developer developer3 = new Developer("Olga", 13, "Software Developer", 115000);
        Developer developer4 = new Developer("Sinem", 22, "Senior Developer", 125000);

        Developer[]developers={developer1,developer2,developer3,developer4};

        ScrumTeam scrum = new ScrumTeam("Nigara", "Husein", "Abdulla", 14);
        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);

        scrum.addTesters(testers);
        scrum.addDevelopers(developers);

        System.out.println(scrum);

        System.out.println("------------------------------------------------------");

        for(Tester eachTester : scrum.testersList ){
            System.out.println(eachTester.name + " : "+ eachTester.salary);
        }

        System.out.println("------------------------------------------------------");

        for (Developer eachDeveloper : scrum.devopsList) {
            System.out.println(eachDeveloper.name +" : "+ eachDeveloper.salary);
        }

        System.out.println("================================");

        scrum.removeTester(14);
        scrum.removeDeveloper(22);

        System.out.println(scrum);

    }
}
/*
1. create an array of Testers and add the testers from your group
2. create an array of developers add the developers from your group
3. create an object of ScrumTeam and store the testers & developers above to the scrum team

 */