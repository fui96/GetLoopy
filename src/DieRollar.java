import java.util.Random;
import java.util.Scanner;
public class DieRollar {
    public static void main(String[] args) {
        Random gen = new Random();
        Scanner input = new Scanner(System.in);
        boolean valid = true;
        int Die1,Die2,Die3;
        int RollCount = 0;
        String Cont;


        do{
            System.out.printf("%5s %10s %10s %10s %10s\n","Roll","Die1","Die2","Die3","Sum");
            System.out.println("---------------------------------------------------");
            do{
                Die1 = gen.nextInt(6)+1;
                Die2 = gen.nextInt(6)+1;
                Die3 = gen.nextInt(6)+1;
                int Sum = Die1 + Die2 + Die3;
                RollCount ++;
                System.out.printf("%5d %10d %10d %10d %10d\n",RollCount,Die1,Die2,Die3,Sum);
            }while(Die1 != Die2 || Die2 != Die3);

            System.out.println("Would you like to roll again? (y/n)");
            Cont = input.next();
            if(Cont.equalsIgnoreCase("Y")){
                //don't know if you want the rollcount reset after each run or keep it consistent
                valid = true;
                RollCount = 0;
            }
            //I am assuming that we don't need to do input validation for this input?
            else if(Cont.equalsIgnoreCase("n")){
                valid = false;

            }
        }while(valid);
    }
}