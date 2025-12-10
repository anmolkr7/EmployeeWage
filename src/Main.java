public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        //Constants
        int IS_FULL_TIME=1;
        //Generates 0,1 to replicate present or absent
        int empCheck=(int)(Math.floor(Math.random()*10)%2);
        //Applying condition check to mark attendance
        if(empCheck==IS_FULL_TIME)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
    }
}
