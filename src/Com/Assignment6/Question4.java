package Com.Assignment6;

 import java.util.Random;
import java.util.concurrent.Callable;

    public class Question4 implements Callable{

        public static void main(String[] args) throws Exception {

            Question4 q=new Question4();
            System.out.println("Callable Method: "+q.call());
        }

        @Override
        public Object call() throws Exception {
            Random generator = new Random();

            Integer randomNumber = generator.nextInt(5);
            Thread.sleep(randomNumber * 1000);
            return randomNumber;
        }

    }
