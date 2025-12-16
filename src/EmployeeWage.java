public class EmployeeWage {
    // Keeps track of number of companies added
    private int companyCount = 0;

    // Array to store multiple CompanyEmpWage objects
    private CompanyEmpWage[] companies;

    // Constructor to initialize company array size
    public EmployeeWage(int size) {
        companies = new CompanyEmpWage[size];
    }

    //Add company details into the array
    public void addCompany(String company, int wagePerHour, int maxDays, int maxHours) {
        companies[companyCount++] =
                new CompanyEmpWage(company, wagePerHour, maxDays, maxHours);
    }

    //Compute wages for all companies
    public void computeWages() {
        for (int i = 0; i < companyCount; i++) {
            computeWage(companies[i]);
            System.out.println("Total Wage for " + companies[i].company + " = " + companies[i].totalWage);
        }
    }

    private void computeWage(CompanyEmpWage company) {

        // To track total working hours,days and accumulated wage
        int totalHours = 0;
        int totalDays = 0;

        // Continue calculating wages until 100 hours OR 20 days limit is reached
        while (totalHours < company.maxHours && totalDays < company.maxDays) {
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
            company.totalWage += empHours * company.wagePerHour;
        }
    }
}
