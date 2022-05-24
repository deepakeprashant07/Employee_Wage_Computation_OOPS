public class EmployeeWage {
    public static final int PRESENT = 1;

    public void display() {
        System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM");
    }

    public void attendence(int x) {
        if (PRESENT == x) {
            System.out.println("EMPLOYEE PRESENT");
        } else {
            System.out.println("EMPLOYEE ABSENT");
        }

    }

    public static void main(String[] args) {
        EmployeeWage EW = new EmployeeWage();
        double randomNumber = Math.floor(Math.random() * 10) % 2;
        EW.display();
        EW.attendence((int) randomNumber);
    }
}
