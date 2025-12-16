import java.util.ArrayList;

public class EmployeeWage implements IEmployeeWage {

    // ArrayList to store multiple CompanyEmpWage objects
    private ArrayList<CompanyEmpWage> companies;

    // Constructor to initialize new array list
    public EmployeeWage() {
        companies = new ArrayList<>();
    }

    //Add company details into the array list
    @Override
    public void addCompany(String company, int wagePerHour, int maxDays, int maxHours) {
        companies.add(new CompanyEmpWage(company, wagePerHour, maxDays, maxHours));
    }

    //Compute wages for all companies
    @Override
    public void computeWages() {
        for (CompanyEmpWage company : companies) {
            computeWage(company);
            System.out.println("Total Wage for " + company.company + " = " + company.totalWage);
            System.out.println("Daily Wages: " + company.dailyWages);
        }
    }

    //Wage computation logic reused for each company
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
            int dailyWage = empHours * company.wagePerHour;

            //Store daily wage
            company.dailyWages.add(dailyWage);

            // Update total hours and total wage
            totalHours += empHours;
            company.totalWage += dailyWage;
        }
    }

    //Query total wage by company using ArrayList
    @Override
    public int getTotalWageByCompany(String companyName) {
        for (CompanyEmpWage company : companies) {
            if (company.company.equals(companyName)) {
                return company.totalWage;
            }
        }
        return 0; // company not found
    }
}
