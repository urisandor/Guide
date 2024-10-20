import java.util.Random;

public class DiceRoller {


    DiceRoller(){

        Random random = new Random();
        int number = 0;
        generator(random, number);
    }

    public void generator(Random random, int number){
        number = random.nextInt(10)+1;
        System.out.println(number);
    }
}
