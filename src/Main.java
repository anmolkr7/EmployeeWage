public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

        EmployeeWage tcs = new EmployeeWage("TCS", 20, 20, 100);
        tcs.computeWage();
        System.out.println(tcs);

        EmployeeWage infosys = new EmployeeWage("Infosys", 25, 22, 120);
        infosys.computeWage();
        System.out.println(infosys);

        EmployeeWage dmart = new EmployeeWage("Dmart", 18, 26, 140);
        dmart.computeWage();
        System.out.println(dmart);
    }
}
