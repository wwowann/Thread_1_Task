public class MyThread extends Thread {
    private final String nameThread;
    private final ThreadGroup threadGroup;
    private int country;

    public MyThread(String nameThread, ThreadGroup threadGroup, int country) {
        this.nameThread = nameThread;
        this.threadGroup = threadGroup;
        this.country = country;
    }

    @Override
    public void run() {
        try {
            while (!threadGroup.isDestroyed()) {
                country ++;
                Thread.sleep(300);
                System.out.printf("Я %s Всем привет! Я запущен " + country + " раз\n", nameThread);
            }
        } catch (InterruptedException err) {

        } finally {
            System.out.printf("Я %s завершен\n", nameThread);
        }

    }
}
