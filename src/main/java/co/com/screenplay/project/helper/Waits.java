package co.com.screenplay.project.helper;

public class Waits {

    private Waits (){}

    public static void waiting(int waiting){
        try {
            Thread.sleep(waiting * 1000l);
        }catch (InterruptedException e){
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
