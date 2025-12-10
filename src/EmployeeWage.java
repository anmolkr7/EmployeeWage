
public class EmployeeWage {
    // Constants
    private static final int IS_FULL_TIME = 1;
    private static final int IS_PART_TIME = 2;
    private static final int WAGE_PER_HOUR = 20;

    // Limits
    private static final int MAX_HOURS = 100;
    private static final int MAX_DAYS = 20;

    // UC7: Class Method to compute wage
    public static void computeWage() {
        // To track total working hours,days and accumulated wage
        int totalHours = 0;
        int totalDays = 0;
        int totalWage = 0;

        // Continue calculating wages until 100 hours OR 20 days limit is reached
        while (totalHours < MAX_HOURS && totalDays < MAX_DAYS) {
            totalDays++;

            // Generate attendance: 0 = Absent, 1 = Full-time, 2 = Part-time
            int empCheck = (int)(Math.floor(Math.random() * 10) % 3);

            int empHours;

            // Determines working hours based on attendance
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHours = 8;
                    break;

                case IS_PART_TIME:
                    empHours = 8;
                    break;

                default:
                    empHours = 0;
            }

            // Update total hours and total wage
            totalHours += empHours;
            totalWage += empHours * WAGE_PER_HOUR;
        }

        // Displaying output
        System.out.println("Total Days=" + totalDays);
        System.out.println("Total Hours=" + totalHours);
        System.out.println("Total Wage=" + totalWage);
    }
}
