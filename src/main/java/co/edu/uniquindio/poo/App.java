package co.edu.uniquindio.poo;
import java.util.Random;
/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i ++){
            numbers[i] = rand.nextInt(100000);
        }

        System.out.println("Before: ");
        printArray(numbers);


        boolean algunCambio = true;

        while(algunCambio){
            algunCambio = false;
            for(int i = 0; i < numbers.length - 1; i ++){
                if(numbers[i] > numbers[i + 1]){
                    algunCambio = true;
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    System.out.println(numbers[1]);
                }
            }
        }
        

        System.out.println("\nAfter: ");
        printArray(numbers);
    }



    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i ++){
            System.out.println(array[i]);
        }

    }
}
