public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        //Constants
        int IS_FULL_TIME=1;
        int WAGE_PER_HOUR=20;
        int FULL_DAY_HOURS=8;

        //Generates 0,1 to replicate present or absent
        int empCheck=(int)(Math.floor(Math.random()*10)%2);

        //Applying condition check to mark attendance
        if (empCheck==IS_FULL_TIME) {
            System.out.println("Employee is Present");
            // Calculating daily wage
            int dailyWage=WAGE_PER_HOUR*FULL_DAY_HOURS;
            System.out.println("Daily Employee Wage: "+dailyWage);

        } else {
            System.out.println("Employee is Absent");
            System.out.println("Daily Employee Wage: 0");
        }
    }
}
