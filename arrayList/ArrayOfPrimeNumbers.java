package arrayList;
import java.util.ArrayList;
public class ArrayOfPrimeNumbers {

    public static ArrayList<Integer> getPrimeNumbers(ArrayList<Integer> numbers) {
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (isPrime(numbers.get(i))) {
                primeNumbers.add(numbers.get(i));
            }
        }
        return primeNumbers;
    }


    public static boolean isPrime (int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;

    }

}
