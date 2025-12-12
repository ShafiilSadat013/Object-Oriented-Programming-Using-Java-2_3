public class Employee {

    private int empid;
    private String name;
    private double basicSalary;

    public static int totalEmployees = 0;
    public static final String company_name = "TechNova Pvt. Ltd.";

    public Employee(int empid, String name, double basicSalary) {
        this.empid = empid;
        this.name =  name;
        this.basicSalary =  basicSalary;
        totalEmployees++;
    }

    public void setBasicSalary(double salary) {
        if (salary < 10000) 
        {
            System.out.println("Base Salary is 10000 ");
            this.basicSalary = 10000;
        } else 
        {
            this.basicSalary = salary;
        }
    }

    public int getEmpid() 
    {
        return empid;
    }

    public String getName() 
    {
        return name;
    }

    public double getBasePay() 
    {
        return basicSalary;
    }

    public static int getTotalEmp() 
    {
        return totalEmployees;
    }

    public double calculateSal()
    {
        return basicSalary;
    }

    public final void showCompName() 
    {
        System.out.println("Company: " + company_name);
    }
}