package randomnjumb;

import java.util.Random;
import java.util.Scanner;

public class RandomNo {
    public static void main(String[] args) {
        int count=0;
        int Rand,num=0;
        Random r=new Random();
        System.out.println("Random No.:");
        Rand=r.nextInt(100);
        System.out.println(Rand);
        while (Rand!=num){

            Scanner s=new Scanner(System.in);
            System.out.println("guass an Integer between 1 to 100");
            num =s.nextInt();

            if(num==Rand) {
                System.out.println("Matched");
                if (count > 0) {
                    System.out.println("Total attempt:" + (count+1));
                }
            }
            else{
                count++;
            }
        }
        }
    }

