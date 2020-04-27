class Director extends Employee {
    private double bonus;

    public Director(String firstName, String lastName, String address, double salary) {
        super(firstName, lastName, address, salary);
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double totalPayment(){
        return getSalary() + bonus;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + "; premia: " + bonus;

    }
}
