public class Main {
    public static void main(String[] args) {

        Female f1 = new Female("Ayşe", "Yılmaz", 1990);
        Male m1 = new Male("Ali", "Demir", 1985);
        Female f2 = new Female("Elif", "Kara", 1995);

        System.out.println(f1.getFullName() + " years until retirement: " + f1.CalculateRetirement());
        System.out.println(m1.getFullName() + " years until retirement: " + m1.CalculateRetirement());
        System.out.println(f2.getFullName() + " years until retirement: " + f2.CalculateRetirement());

        Department dept = new Department("Software", m1);

        dept.addEmployee(f1);
        dept.addEmployee(f2);

        dept.addTask("Project Planning");
        dept.addTask("Code Review");

        dept.completeTask("Project Planning");

        dept.printInfo();
    }
}
