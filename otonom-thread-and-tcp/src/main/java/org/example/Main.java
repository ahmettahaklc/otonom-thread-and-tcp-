
public class Main {

    public static void main(String[] args){
        //Thread
        //Thread (new Runnable)

        Server i1 = new Server("ilk");
        Thread t1 = new Thread(i1);

        Server i2 = new Server("İki");
        Thread t2 = new Thread(i2);

        t1.start();
        t2.start();

    }
}