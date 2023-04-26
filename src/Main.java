import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to our Employee Directory.");
        System.out.println("What employee type would you like to choose? " +
                "1 for Employee, Select 2 for Employee Territory, or select 3 for Hybrid Employee.");
        int employType = input.nextInt();

        if(employType == 1){
            System.out.println("What is your Employee id?");
            int idNum = input.nextInt();
            System.out.println("What is your salary?");
            double salary = input.nextDouble();
            Employee Emp1 = new Employee();
            Emp1.setId(idNum);
            Emp1.setSalary(salary);
            System.out.println("Your employee id is " + Emp1.getId());
            System.out.println("Your salary in $" + Emp1.getSalary());


        }
        if(employType == 2){
            System.out.println("What is your Employee id?");
            int idNum = input.nextInt();
            System.out.println("What is your salary?");
            double salary = input.nextDouble();
            System.out.println("Where are you located?");
            int terr = input.nextInt();
            System.out.println("You are located in " + terr);
            //hybEmploy.setId(idNum);
            //hybEmploy.setSalary(salary);
        }

        if(employType == 3){
            System.out.println("What is your Employee id?");
            int idNum = input.nextInt();
            System.out.println("What is your salary?");
            double salary = input.nextDouble();
            System.out.println("How many days will you come to work?");
            int daWork = input.nextInt();
            System.out.println("How many days will you work from home?");
            int daHome = input.nextInt();
            System.out.println("What is your hourly pay rate?");
            double hrSal = input.nextDouble();
            System.out.println("In MegaBits what is your wifi speed from home?");
            int wifi = input.nextInt();
            HybridEmployee hybEmploy = new HybridEmployee();
            hybEmploy.setId(idNum);
            hybEmploy.setSalary(salary);
            hybEmploy.setDaysAtWork(daWork);
            hybEmploy.displayHybridSalary();
            System.out.println("You have chosen the Hybrid employee!");
            System.out.println("You will have " + hybEmploy.getDaysAtHome() + " at work.");
            System.out.println("You will have " + daHome + " at home working.");
            System.out.println("Your hourly pay will be $"+ hrSal);
            System.out.println("You have " + wifi + " megabits from home which qualifies you to work from home.");
        }





    }
}