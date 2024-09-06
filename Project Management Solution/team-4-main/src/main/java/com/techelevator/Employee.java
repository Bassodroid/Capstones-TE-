package com.techelevator;

public class Employee {
    private long employeeId;

    private String firstName;

    private  String lastName;

    private  String email;

    private double salary;

    private Department department;

    private String hireDate;

    private static final double DEFAULT_STARTING_SALARY = 60000;

    public Employee (long employeeId, String firstName,String lastName,String email,Department department,String hireDate ){

        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
        this.hireDate = hireDate;


    }
    public Employee(){
        
    }
    public String getFullName() {

        return lastName + "," + firstName;
    }
    public double raiseSalary(double percent){
        return DEFAULT_STARTING_SALARY * percent;
    }


}
