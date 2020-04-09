import java.util.Random;

public class ArrayExample {
    public Integer[] createRandom(){
        Random rd = new Random();
        Integer[] array = new Integer[30];
        System.out.println("Elements in array: ");
        for (int i = 0; i < 30; i++){
            array[i] = rd.nextInt(100);
            System.out.print(array[i] + " ");
        }
        return array;
    }
}
