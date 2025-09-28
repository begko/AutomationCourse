package homeworks;

public class Employees {
    public static void main(String[] args){

        Department employe1 = new Department();
        Department employe2 = new Department();
        Department employe3 = new Department();

        employe1.name = "Ahmet";
        employe1.surname = "Kartal";
        employe1.age = 35;

        employe2.name = "Ayşe";
        employe2.surname = "Sönmez";
        employe2.age = 26;

        employe3.name = "Aylin";
        employe3.surname = "Balcı";
        employe3.age = 26;

        employe1.showInfo();
        employe2.showInfo();
        employe3.showInfo();

    }
}
