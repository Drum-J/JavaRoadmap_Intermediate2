package collection.set;

public class MyHashSetMainV0 {
    public static void main(String[] args) {
        MyHashSetV0 hashSet = new MyHashSetV0();

        hashSet.add(1); //O(1)
        hashSet.add(2); //O(n)
        hashSet.add(3); //O(n)
        hashSet.add(4); //O(n)
        hashSet.add(5); //O(n)

        System.out.println(hashSet);

        boolean result = hashSet.add(4);//중복 데이터 저장
        System.out.println("중복 데이터 저장 결과 = " + result);
        System.out.println(hashSet);

        System.out.println("hashSet.contains(3) = " + hashSet.contains(3)); // O(n)
        System.out.println("hashSet.contains(99) = " + hashSet.contains(99)); // O(n)
    }
}
