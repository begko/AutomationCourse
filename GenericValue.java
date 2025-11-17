public class GenericValue<T> {

    private T value; 

    public GenericValue(T value) {   
        this.value = value;
    }

    public void printValue() {
        if (value instanceof String) {
            System.out.println("String değer: " + value);
        } else if (value instanceof Integer) {
            System.out.println("Integer değer: " + value);
        } else {
            System.out.println("Genel değer: " + value);
        }
    }


    public static void main(String[] args) {

        GenericValue<String> gc1 = new GenericValue<>("Merhaba");
        gc1.printValue();

        GenericValue<Integer> gc2 = new GenericValue<>(42);
        gc2.printValue();

        GenericValue<Double> gc3 = new GenericValue<>(3.14);
        gc3.printValue();

        GenericValue<Boolean> gc4 = new GenericValue<>(true);
        gc4.printValue();
    }
}
