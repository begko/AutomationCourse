public class Female extends Employee {

    public Female(String firstName, String lastName, int birthYear) {
        super(firstName, lastName, birthYear);
    }

    @Override
    public int CalculateRetirement() {
        int retirementAge = 60;
        return retirementAge - calculateAge();
    }
}
