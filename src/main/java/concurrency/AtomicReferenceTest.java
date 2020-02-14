package concurrency;

import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceTest {

    public static void main(String[] args) {
        String initialReference = "initial value referenced";

        AtomicReference<String> atomicStringReference = new AtomicReference(initialReference);

        String newReference = "new value referenced";
        boolean exchanged = atomicStringReference.compareAndSet(initialReference, newReference);
        System.out.println("exchanged: " + exchanged);

        exchanged = atomicStringReference.compareAndSet(initialReference, newReference);
        System.out.println("exchanged: " + exchanged);

    }
}
