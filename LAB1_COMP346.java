public class LAB1_COMP346 extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
    public static void main(String[] args) {
        //Create object
        LAB1_COMP346 thread1 = new LAB1_COMP346();
        //Start thread
        thread1.start();
        //Set priority to 1
        thread1.setPriority(1);
        //
        int priority = thread1.getPriority();
        System.out.println("Thread priority: " + priority);
        //Thread sleep: pause the execution of the current thread for a specified time in milliseconds.
        try {
            thread1.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted Exception.");
        }
        finally {
            //If not interrupted print final message
            System.out.println("Program terminating.");
        }
    }
}
