package afternoon.collection.map;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("사과",10000);
        hashMap.put("바나나",2000);
        hashMap.put("토마토",500);
        hashMap.put("수박",20000);

        System.out.println(hashMap);

        //특정 키의 값
        int applePrice = hashMap.get("사과");
        System.out.println("applePrice = " + applePrice);

        //키 존재 확인
        boolean hasBanana = hashMap.containsKey("바나나");
        System.out.println("바나나 존재 여부 확인 = " + hasBanana);

        //값이 존재하는지 확인
        boolean hasValue20000 = hashMap.containsValue(20000);
        System.out.println("20000 value = " + hasValue20000);

        //삭제
        int removeValue = hashMap.remove("수박");
        System.out.println("removeValue = " + removeValue);
        System.out.println(hashMap);
    }
}
