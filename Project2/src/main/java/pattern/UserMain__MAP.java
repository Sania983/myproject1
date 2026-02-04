package pattern;

import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class UserMain__MAP{
    static int sizeOfResultantHashMap(HashMap<Integer,String> hashMap){
        ConcurrentHashMap<Integer,String> hashMap1=new ConcurrentHashMap<>(hashMap);
        for (int i:hashMap.keySet()){
            if(i%4==0)
                hashMap.remove(i);
        }
        return hashMap.size();
    }
}
class Main{
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<>();
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        scanner.nextLine();
        int key1;
        String value1;
        for(int i=0;i<n;i++){
            key1=scanner.nextInt();
            scanner.nextLine();
            value1=scanner.nextLine();
            hashMap.put(key1,value1);
        }
//        System.out.println(hashMap);
        System.out.println(UserMain__MAP.sizeOfResultantHashMap(hashMap));
    }
}
