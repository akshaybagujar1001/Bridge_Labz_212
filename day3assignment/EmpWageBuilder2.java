package day3assignment;

public class EmpWageBuilder2 {
    public static void main (String[] args) {
        int IS_FULL_TIME = 1;
        int EMP_RATE_PER_HOUR = 20;
        int empHs = 0;
        int empWage =0;
        double empCheck = Math.floor (Math.random() * 10) % 2;
        int empHrs;
        if (empCheck == IS_FULL_TIME)
            empHrs = 8;

        else
            empHrs = 0;
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System system;
        System.out.println("Emp Wage: " + empWage);
    }
}
