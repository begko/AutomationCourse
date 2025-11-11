public class Male extends Employee {

    public Male(String firstName, String lastName, int birthYear) {
        super(firstName, lastName, birthYear);
    }

    @Override
    public int CalculateRetirement() {
        int retirementAge = 65;
        return retirementAge - calculateAge();
    }
}
