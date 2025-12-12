public class EmployeeWage {

    public static void computeWage(String company, int wagePerHour, int maxDays, int maxHours) {

        System.out.println("\nCompany: "+company);

        // To track total working hours,days and accumulated wage
        int totalHours = 0;
        int totalDays = 0;
        int totalWage = 0;

        // Continue calculating wages until 100 hours OR 20 days limit is reached
        while (totalHours < maxHours && totalDays < maxDays) {
            totalDays++;

            // Generate attendance: 0 = Absent, 1 = Full-time, 2 = Part-time
            int empCheck = (int)(Math.floor(Math.random() * 10) % 3);

            int empHours;

            // Determines working hours based on attendance
            switch (empCheck) {
                case 1:
                    empHours = 8;
                    break;

                case 2:
                    empHours = 4;
                    break;

                default:
                    empHours = 0;
            }

            // Update total hours and total wage
            totalHours += empHours;
            totalWage += empHours * wagePerHour;
        }

        // Displaying output
        System.out.println("Total Days=" + totalDays);
        System.out.println("Total Hours=" + totalHours);
        System.out.println("Total Wage=" + totalWage);
    }
}
