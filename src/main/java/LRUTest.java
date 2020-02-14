public class LRUTest {

    public static void main(String[] args) {
        LRUCacheLinkedHashMapImpl<Integer, Integer> lru =
                new LRUCacheLinkedHashMapImpl(4);

        lru.put(1, 1);
        lru.put(2, 2);
        lru.put(3, 3);
        lru.put(4, 4);

        System.out.println(lru.get(1));
        System.out.println(lru);
        lru.put(5, 5);
        System.out.println(lru);
    }
}
