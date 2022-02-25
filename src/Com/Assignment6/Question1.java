package Com.Assignment6;

public class Question1 implements Runnable{


    @Override
    public void run() {
        for(int i=0;i<10;i++)
        {
            System.out.println("First Thread "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

    public static void main(String[] args) throws InterruptedException {
        Question1 q1=new Question1();
        Mythread m1=new Mythread();
        Thread t1=new Thread(q1);
        Thread t2=new Thread(m1);
        t1.start();
        t2.start();
    }
}
class Mythread extends Thread{


    public void run(){
        for(int i=0;i<10;i++) {
            System.out.println("Second Thread   "+i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}

