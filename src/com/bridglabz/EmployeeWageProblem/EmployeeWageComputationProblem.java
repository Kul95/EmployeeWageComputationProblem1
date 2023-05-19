package com.bridglabz.EmployeeWageProblem;

public class EmployeeWageComputationProblem {
    public static void main(String[] args) {
        System.out.println("Welcome to employee wage computation program");
        isEmployee();
    }
    public static void isEmployee() {
        int IS_PART_TIME=1;
        int IS_FULL_TIME = 2;
        int EMP_RATE_PER_HOUR=20;
        int empHour=0;
        int empWage=0;
        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == IS_FULL_TIME)
            empHour = 8;
            else if(empCheck==IS_PART_TIME)
            empHour=4;
           empWage=empHour * EMP_RATE_PER_HOUR;
            System.out.println("Emp wage:"+empWage);
        }
    }
