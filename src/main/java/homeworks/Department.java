package homeworks;

public class Department {

    String name;
    String surname;
    int age;

    void showInfo(){
            System.out.println("Kullanıcı Bilgileri:\n" +
                "İsim      : " + name + "\n" +
                "Soyisim   : " + surname + "\n" +
                "Yaş       : " + age + "\n");
        }
}
