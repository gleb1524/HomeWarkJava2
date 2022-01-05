public class Main {
    public static void main(String[] args) {
        nonTread();
        onTread();
    }
    public static void nonTread(){
        final int size = 10000000;
        final int h = size/2;
        float[] arr = new float[size];
        for (int i = 0; i < size; i++) {
            arr[i]=1;
        }
        long a = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long b = System.currentTimeMillis();
        System.out.println(b-a);
        System.out.println(arr[3]);
    }

    public static void onTread(){
        final int size = 10000000;
        final int h = size/2;
        float[] arr = new float[size];
        for (int i = 0; i < size; i++) {
            arr[i]=1;
        }
        long a = System.currentTimeMillis();
        float[] a1 = new float[h];
        float[] a2 = new float[h];
        System.arraycopy(arr, 0, a1, 0, 5000000);
        System.arraycopy(arr, 5000000, a2, 0, 5000000);

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < h; i++) {
                a1[i] = (float)(a1[i] * Math.sin(0.2f + i/ 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 1; i < h; i++) {
                a2[i] = (float)((a2[i]+h) * Math.sin(0.2f + (i+h) / 5) * Math.cos(0.2f + (i+h) / 5) * Math.cos(0.4f + (i+h) / 2));
            }
        });
//        thread1.setDaemon(true);
//        thread2.setDaemon(true);
        thread1.start();
        thread2.start();
        System.arraycopy(a1, 0, arr, 0, 5000000);
        System.arraycopy(a2, 0, arr, 5000000, 5000000);
        long b = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(arr[4]);
        System.out.println(b-a);
    }
}
