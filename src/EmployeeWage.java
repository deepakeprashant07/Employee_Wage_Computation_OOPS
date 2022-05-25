public class EmployeeWage {
    public static final int PRESENT = 1;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    public void display() {
        System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM");
    }

    public void attendence(int x) {
        if (PRESENT == x) {
            System.out.println("EMPLOYEE PRESENT");
            dailyWageCalculate();
        } else {
            System.out.println("EMPLOYEE ABSENT");
        }

    }

    public void dailyWageCalculate() {
        int time = partTimeCheck();
        int dailyWage = time * EMP_RATE_PER_HOUR;
        System.out.println("EMPLOYEE " + time + " HOURS WAGE = " + dailyWage);
    }

    public int partTimeCheck() {
        double empcheck = Math.floor(Math.random() * 10) % 3;
        if ((int) empcheck == IS_PART_TIME) {
            int partTime = 8;
            return partTime;
        } else if ((int) empcheck == IS_FULL_TIME) {
            int fullTime = 12;
            return fullTime;
        }
        return 8;
    }

    public static void main(String[] args) {
        EmployeeWage EW = new EmployeeWage();
        double randomNumber = Math.floor(Math.random() * 10) % 2;
        EW.display();
        EW.attendence((int) randomNumber);
    }
}
