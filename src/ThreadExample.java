import java.util.concurrent.atomic.AtomicInteger;

//executer servise
class Counter {
         AtomicInteger count = new AtomicInteger();

        public  void increment() {
            count.incrementAndGet();
        }
    }
    public class ThreadExample  {

            public static void  main(String[] args) throws InterruptedException {
                Counter c = new Counter();

                Thread t1 = new Thread(new Runnable() {
                    public void run() {
                        for (int i = 0; i < 10000; i++) {
                            c.increment();
                        }
                    }
                });

                Thread t2 = new Thread(new Runnable() {
                    public void run() {
                        for (int i = 0; i < 10000; i++) {
                            c.increment();
                        }
                    }
                });

                t1.start();
                t2.start();

                t1.join();
                t2.join();
                System.out.printf(c.count + " \n");


            }




    }




