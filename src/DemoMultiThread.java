public class DemoMultiThread {

    public static void main(String[] args) {

        System.out.println("""
                If you see the same value, then singleton was reused (yay!)\s
                If you see differrent values, then 2 singletons were created (booo!!)\s
                RESULT:\s
                """);
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();

        Thread threadFood = new Thread(new ThreadFood());
        Thread threadBars = new Thread(new ThreadBars());
        threadFood.start();
        threadBars.start();

    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }

    static class ThreadFood implements Runnable {
        @Override
        public void run() {
            SingletonMultiThread singleton = SingletonMultiThread.getInstance("FOOD");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBars implements Runnable {
        @Override
        public void run() {
            SingletonMultiThread singleton = SingletonMultiThread.getInstance("BARS");
            System.out.println(singleton.value);
        }
    }

}
