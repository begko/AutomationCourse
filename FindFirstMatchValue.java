import java.util.Arrays;
import java.util.List;

public class FindFirstMatchValue {

    public static int findFirstMatch(List<Integer> list) {
        for (int item : list) {     
            if (item > 17) {        
                return item;        
            }
        }
        return -1;                   
    }

    
    public static void main(String[] args) {

        List<Integer> sayilar = Arrays.asList(10, 15, 17, 20, 25, 30);

        int result = findFirstMatch(sayilar);

        System.out.println("The first number greater than 17: " + result);
    }
}

