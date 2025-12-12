public class EmployeeMain {
    public static void main(String[] args) {
         System.out.println("Employee created at " + Employee.company_name);
        Employee[] employees = new Employee[3];
        employees[0] = new Manager(013, "SADAT", 1700000, 6000);
        employees[1] = new Developer(066, "Gecko", 69000, 5000);
        employees[2] = new Employee(103, "Dager1_3", 800000);        
        
        System.out.println("Details : ");
        for (Employee emp : employees) {
            double salary = emp.calculateSal(); 
            System.out.println("ID: " + emp.getEmpid() + "  Name: " + emp.getName() + "  Company: " + Employee.company_name +
            "  Salary: " + salary);
        }

        System.out.println("Total Employees: " + Employee.getTotalEmp());

    }
}

