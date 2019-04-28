public class Example {
    public static void main(String[] args) throws InterruptedException {
        int value = 0;
        while (true) {
            System.out.println(value);
            value++;
            value++;
            value++;
            value++;
            value = increaseValue(value);
            Thread.sleep(4000);
        }
    }

    private static int increaseValue(int value) {
        return value + 10000;

    }
}

