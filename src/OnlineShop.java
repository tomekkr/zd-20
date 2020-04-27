class OnlineShop {
    public static void main(String[] args) {
        Customer customer = new Customer("Adam", "Kowalski", "Warszawa");
        System.out.println(customer.printInfo());

        Employee employee = new Employee("Katarzyna", "Markowska", "Sopot", 3750);
        System.out.println(employee.printInfo());

        Director director = new Director("Marian", "Kowalewski", "Gdańsk", 7500);
        director.setBonus(1250);

        System.out.println(director.printInfo() + "; wypłata: " + director.totalPayment());
    }
}
