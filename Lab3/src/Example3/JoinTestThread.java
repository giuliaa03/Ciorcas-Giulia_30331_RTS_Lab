package Example3;
import java.util.Random;

class JoinTestThread extends Thread {
    Thread t;
    private static final Object lock = new Object();
    private static int divisorSum;
    int startNr;

    JoinTestThread(String n, Thread t, int startNr) {
        this.setName(n);
        this.t = t;
        this.startNr = startNr;
    }

    public void run() {
        System.out.println("Thread " + this.getName() + " has entered the run() method");
        try {
            if (t != null) t.join();
            System.out.println("Thread " + this.getName() + " executing operation.");
            int sum = calcDivSum(genRandomNr(this.startNr));

            if (getName().equals("Thread 2")) {
                synchronized (lock) {
                    while (divisorSum == 0) {
                        try {
                            lock.wait(); // Wait until divisorSum is set by Thread 1
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    divisorSum += sum;
                }
            } else {
                synchronized (lock) {
                    divisorSum += sum;
                    lock.notify(); // Notify Thread 2 that divisorSum is set
                }
            }
            System.out.println("Thread " + this.getName() + " has terminated operation.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int calcDivSum(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    private int genRandomNr(int min) {
        int max = 1000000;
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static int getDivSum() {
        return divisorSum;
    }
}