class Person {
    private String firstName;
    private String lastName;
    private String address;

    public Person(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String printInfo() {
        return "imię: " + firstName + "; nazwisko: " + lastName + "; adres: " + address;
    }
}
