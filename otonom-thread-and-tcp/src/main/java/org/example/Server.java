package org.example;

public class Server implements Runnable{
    String name;
    public Server(String name){
        this.name = name;
        System.out.println("hello world");
    }

    @Override
    public void run(){
        try{
            for(int i = 5; i > 0; i--){
                System.out.println(this.name + " : " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(this.name + "hata ile karşılaşıldı !");

        }
      System.out.println(name + "işlem bitti");
    }

}
