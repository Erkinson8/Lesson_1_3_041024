//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(" Hello World");
        double[] numbers = {6.3, 5.2, -3.2, -8.6, -6.1, 9.1, 7.4, 3.7, 4.1, -9.3, -8.8, -5.5, -9.5, -5.5, -8.9};
    boolean negativeEncountered = false;

    double sum = 0;
    int count = 0;

     for (double number : numbers ) {
         if (negativeEncountered && number > 0){
             sum += number;
             count++;
         }
         if (number < 0){
         negativeEncountered = true;
         }
    }
     if (count > 0) {
         double average = sum / count;
         System.out.println("Среднее арифметическое число: " +  sum + "/" + count + '=' + average);
     }else {
         System.out.println("После первого отрицательного числа нет положительных чисел");
         }
       }
     }