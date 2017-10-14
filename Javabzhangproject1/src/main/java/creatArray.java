import java.util.*;

public class creatArray {

    public static void main(String[] args){
        getIntArray();
    }

    private static void getIntArray(){
        int number = -1;
        int lastNumber = -1;
        int tempValue = 101;

        List<Integer> listInt = new ArrayList<Integer>();
        Random rand = new Random();
        long start = System.currentTimeMillis();
        do{
            // 如果集合为空，则添加新元素
            if(listInt.isEmpty()) {
                listInt.add(0);
            }
            else{
                // 取集合最后一个元素
                lastNumber = listInt.get(listInt.size() - 1);
                // 取[0,n]区间整数，并加上
                number = Math.abs(rand.nextInt()) % tempValue + lastNumber;
                System.out.println(number);

                if(number > (lastNumber + 1)){
                    listInt.add(number);
                }
            }

        }while(listInt.size() < 1000);
        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }

    // 检查重复数据  --- 待完善
    private static <T> boolean checkDuplicateData(List<T> list){
        boolean isHave = false;
        Set<T> set = new HashSet<T>();
        for (T integer : list)
        {
            set.add(integer);
        }
        if((set.size() == list.size())){
            isHave = true;
        }
        return isHave;
    }
}