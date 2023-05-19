package com.bridglabz.EmployeeWageProblem;

public class EmployeeWageComputationProblem {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;
    public static void main(String[] args) {
        int empHour = 0;
        int empWage = 0;
        int totalEmpWage=0;
        for(int day=0;day<NUM_OF_WORKING_DAYS;day++){
        double empCheck = Math.floor(Math.random() * 10) % 3;
        switch((int)empCheck){
            case IS_FULL_TIME:
                empHour=8;
                break;
            case IS_PART_TIME:
                empHour=4;
                break;
            default:
                empHour=0;
    }
        empWage=empHour*EMP_RATE_PER_HOUR;
            totalEmpWage+=empWage;
        System.out.println("Employee Wage: "+empWage);
    }
        System.out.println("Total emp wage :"+totalEmpWage);
    }
}