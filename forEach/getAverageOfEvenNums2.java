package forEach;

public class getAverageOfEvenNums2 {

    public static void main(String[] args) {
        getAverageOfEvenNums();
    }
    public static void getAverageOfEvenNums() {
        int sum = 0;
        int count = 1;
        int i = 0;
        while (count <= 10){
            if (i % 2 == 0){
                System.out.print(i + ", " );
                count++;
                sum = sum + i;

            }
            i++;
        }
        System.out.println("Average is: " +(double) sum / count);
    }
}
