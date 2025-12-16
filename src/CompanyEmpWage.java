import java.util.ArrayList;

public class CompanyEmpWage {

    // Stores company-specific details
    public String company;
    public int wagePerHour;
    public int maxDays;
    public int maxHours;

    //Stores total wage for the company
    public int totalWage;

    public CompanyEmpWage(String company, int wagePerHour, int maxDays, int maxHours) {
        this.company = company;
        this.wagePerHour = wagePerHour;
        this.maxDays = maxDays;
        this.maxHours = maxHours;
        this.totalWage = 0;
    }
}
