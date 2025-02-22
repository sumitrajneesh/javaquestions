import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicate {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int result = numbers
                .stream()
                .reduce(9, (subtotal, element) -> subtotal + element);
        System.out.println("Total number : " + result);

    }

//    static int[] findDuplicate(int[] arr) {
//        int n = arr.length;
//        int[] freqArr = new int[n];
//        List<Integer> result = new ArrayList<>();
//
//
//    }
}
