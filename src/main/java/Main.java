public class Main {
    public static void main(String[] args) {
        ThreadGroup myGroup = new ThreadGroup("mainGroup");
        String nameThread1 = "поток 1.";
        String nameThread2 = "поток 2.";
        String nameThread3 = "поток 3.";
        String nameThread4 = "поток 4.";

        new MyThread(nameThread1, myGroup).start();
        new MyThread(nameThread2, myGroup).start();
        new MyThread(nameThread3, myGroup).start();
        new MyThread(nameThread4, myGroup).start();
        try {
            MyThread.sleep(5000);
        } catch (InterruptedException err) {
            System.out.println("Время работы потока закончилось");
        }
        myGroup.destroy();
    }
}
