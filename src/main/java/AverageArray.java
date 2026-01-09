public class AverageArray {
    public static void main(String[] args) {
        int a[] = {14, 17, 11, 19, 20, 21, 25, 28, 22};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        double average = (double) sum / a.length;
        System.out.println("Average: " + average);
    }
}
