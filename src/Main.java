public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

        //Programming to interface, not implementation
        IEmployeeWage employeeWage = new EmployeeWage(5);

        employeeWage.addCompany("TCS", 20, 20, 100);
        employeeWage.addCompany("Infosys", 25, 22, 120);
        employeeWage.addCompany("Dmart", 18, 26, 140);

        employeeWage.computeWages();
    }
}
