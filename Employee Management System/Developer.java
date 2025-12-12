class Developer extends Employee {
    private double pAllowance;
    public double total ;

    public Developer(int empid, String name, double basicSalary, double pAllowance) {
        super(empid, name, basicSalary);
        this.pAllowance = pAllowance;
    }

    @Override
    public double calculateSal() {
        total = getBasePay() + pAllowance;
        System.out.println("Dev's Salary : " + total);
        return total;
    }
}