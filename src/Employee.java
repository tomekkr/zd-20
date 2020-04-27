class Employee extends Person {
    private double salary;

    public Employee(String firstName, String lastName, String address, double salary) {
        super(firstName, lastName, address);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + "; pensja: " + salary;
    }
}
