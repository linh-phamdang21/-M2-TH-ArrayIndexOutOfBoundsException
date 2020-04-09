import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] myArray = arrayExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter index of a random element:  ");
        int index = scanner.nextInt();

        try {
            System.out.println("Value of element[ " + index + "]: " + myArray[index]);

        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Index not found");
        }
    }
}
