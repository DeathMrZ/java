public class EntryPoint {

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        CreateArray arrayGenerate = new CreateArray();
        int[] result = arrayGenerate.ParallelArrayGenerate();
        long endTime = System.nanoTime();
        System.out.println("\r执行时间 : " + ((endTime - startTime) / 1000000)  + "ms");
        arrayGenerate.PrintResult(result);
    }
}