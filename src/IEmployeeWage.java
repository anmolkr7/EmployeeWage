public interface IEmployeeWage {

    void addCompany(String company, int wagePerHour, int maxDays, int maxHours);

    void computeWages();

    //Query total wage by company
    int getTotalWageByCompany(String company);
}
