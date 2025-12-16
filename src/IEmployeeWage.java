public interface IEmployeeWage {

    void addCompany(String company, int wagePerHour, int maxDays, int maxHours);

    void computeWages();
}
