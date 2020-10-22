public class Main {
    public static void main(String[] args) {
        ThreadGroup myGroup = new ThreadGroup("mainGroup");
        for (int i = 1; i < 11; i++) {
            System.out.println("Запускаю поток");
            String nameThread = "поток " + i;
            int country = 0;
            new MyThread(nameThread, myGroup, country).start();
            try {
                MyThread.sleep(2000);
            } catch (InterruptedException err) {
                System.out.println("Произошла ошибка");
            }
        }
        System.out.println("Завершаю все потоки");

        myGroup.destroy();
    }
}
