public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        //Constants
        int IS_FULL_TIME=1;
        int IS_PART_TIME=2;
        int WAGE_PER_HOUR=20;
        int FULL_DAY_HOURS=8;
        int PART_TIME_HOURS=8;

        //Generates 0,1,2 to replicate absent,present,part-time
        int empCheck=(int)(Math.floor(Math.random()*10)%3);

        int empHours = 0;

        //Applying condition check to mark attendance
        if (empCheck==IS_FULL_TIME) {
            System.out.println("Employee is Present Full Time");
            empHours=FULL_DAY_HOURS;
        } else if(empCheck==IS_PART_TIME){
            System.out.println("Employee is Present Part-time");
            empHours=PART_TIME_HOURS;
        }
        else{
            System.out.println("Employee is Absent");
        }
        // Calculating daily wage
        int dailyWage=WAGE_PER_HOUR*empHours;
        System.out.println("Daily Employee Wage: "+dailyWage);
    }
}
