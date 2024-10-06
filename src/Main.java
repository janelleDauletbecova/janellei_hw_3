import javax.xml.transform.SourceLocator;

public class Main {
    public static void main(String[] args) {
        double[] numbers = {8, 2, -4, -2, 3, 6, -7, 1.5, -2.5, 3.5, -6, 8.5, -9.5, 4.5, 6.5};
        boolean foundNegative = false;
        double sum = 0;
        int count = 0;


        for (double number : numbers) {
            if (!foundNegative && number < 0) {
                foundNegative = true;
            } else if (foundNegative && number > 0) {
                sum += number;
                count++;
            }
        }
        double totalAmount = sum / count;
        if (foundNegative = false) {
            System.out.println("в массиве нет отрицательных чисел");
        } else {
            System.out.println("среднее арифмитическое: " + totalAmount);
            System.out.println("сумма: " + sum);
            System.out.println("количество чисел: " + count);
        }
    }
}
