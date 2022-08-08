import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi :");
        String input = sc.nextLine();
        String[] arr = input.toLowerCase().split(" ");
//        String key = "";
        for (int i = 0; i< arr.length; i++){
            if (treeMap.containsKey(arr[i])){
                int value = treeMap.get(arr[i]);
                treeMap.remove(arr[i]);
                treeMap.put(arr[i],value+ 1);
            }else {
                treeMap.put(arr[i],i);
            }
        }
        System.out.println("Số lần xuất hiện trong chuỗi :" + treeMap);

    }
}
