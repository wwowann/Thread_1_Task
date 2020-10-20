public class MyThread extends Thread {
    private final String nameThread;
    private final ThreadGroup threadGroup;

    public MyThread(String nameThread, ThreadGroup threadGroup) {
        this.nameThread = nameThread;
        this.threadGroup = threadGroup;
    }

    @Override
    public void run() {
        try {
            while (!threadGroup.isDestroyed()) {
                Thread.sleep(1000);
                System.out.printf("Я %s Всем привет!\n", nameThread);
            }
        } catch (InterruptedException err) {

        } finally {
            System.out.printf("Я %s завершен\n", nameThread);
        }
    }
}
