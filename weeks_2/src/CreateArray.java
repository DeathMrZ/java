import java.util.Arrays;
import java.util.Random;

public class CreateArray {

    public int[] ParallelArrayGenerate(){
        int[] container = new int[1000];
        Random random = new Random();
        for(int i = 0; i < 1000; i++){
            container[i] = i * 10 + random.nextInt(9);
        }
        return container;
    }

    public void PrintResult(int[] container){
        System.out.println("数组长度 ：" +  container.length);
        System.out.println("数组元素 ：" );
        System.out.println(Arrays.toString(container));
    }
}
