public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        //Constants
        int IS_FULL_TIME=1;
        int IS_PART_TIME=2;
        int WAGE_PER_HOUR=20;
        int FULL_DAY_HOURS=8;
        int PART_TIME_HOURS=8;
        int WORKING_DAYS=20;

        int monthlyWage=0;

        for (int day=1;day<=WORKING_DAYS;day++){
            //Generates 0,1,2 to replicate absent,present,part-time
            int empCheck = (int) (Math.floor(Math.random() * 10) % 3);

            int empHours;

            //Implementing wage calculation using switch case
            switch(empCheck){
                case 1:
                    empHours = FULL_DAY_HOURS;
                    break;

                case 2:
                    empHours = PART_TIME_HOURS;
                    break;

                default:
                    empHours = 0;
            }
            //Calculating daily wage
            int dailyWage=empHours*WAGE_PER_HOUR;
            //Calculating monthly wage
            monthlyWage+=dailyWage;
        }
        System.out.println("Monthly Employee Wage: " +monthlyWage);
    }
}
