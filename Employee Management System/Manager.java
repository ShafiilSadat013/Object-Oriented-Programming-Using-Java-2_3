public class Manager extends Employee {
    private double pBonus;
    public double total; 

    public Manager(int empid, String name, double basicSalary, double pBonus) {
        super(empid, name, basicSalary);
        this.pBonus = pBonus;
    }

    @Override
    public double calculateSal() {
        total = getBasePay() + pBonus;
        System.out.println("Manager : " + total);
        return total;
    }
}
