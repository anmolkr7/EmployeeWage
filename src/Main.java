public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        //Constants
        int IS_FULL_TIME=1;
        int IS_PART_TIME=2;
        int WAGE_PER_HOUR=20;

        //To track total working hours,days and accumulated wage
        int totalHours=0;
        int totalDays=0;
        int totalWage=0;

        // Continue calculating wages until 100 hours OR 20 days limit is reached
        while(totalHours<100 && totalDays<20){
            totalDays++;
            // Generate attendance: 0 = Absent, 1 = Full-time, 2 = Part-time
            int empCheck=(int)(Math.floor(Math.random()*10)%3);
            int empHours;
            // Determines working hours based on attendance
            switch(empCheck){
                case 1:
                    empHours=8;
                    break;

                case 2:
                    empHours=8;
                    break;

                default:
                    empHours=0;
            }
            // Update total hours and total wage
            totalHours+=empHours;
            totalWage+=empHours*WAGE_PER_HOUR;
        }
        //Displaying output
        System.out.println("Total Days="+totalDays);
        System.out.println("Total Hours="+totalHours);
        System.out.println("Total Wage="+totalWage);
    }
}
