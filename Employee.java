public class Employee {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Employee(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int calculateAge() {
        int currentYear = 2025; 
        return currentYear - birthYear;
    }

    public int CalculateRetirement() {
        return 0;
    }
}
