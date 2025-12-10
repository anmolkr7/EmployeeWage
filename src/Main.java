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

        int empHours;

        //Implementing wage calculation using switch case
        switch(empCheck){
            case 1:
                System.out.println("Employee is Present Full-Time");
                empHours=FULL_DAY_HOURS;
                break;

            case 2:
                System.out.println("Employee is Present Part-Time");
                empHours=PART_TIME_HOURS;
                break;

            default:
                System.out.println("Employee is Absent");
                empHours=0;
        }
        //Calculating daily wage
        int dailyWage=empHours*WAGE_PER_HOUR;
        System.out.println("Daily Employee Wage: "+dailyWage);
    }
}
