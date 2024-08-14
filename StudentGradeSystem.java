package randomnjumb;
import java.util.*;
public class StudentGradeSystem {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Obtained Marjs Out of 100");
        System.out.println("Obtained Marks in Hindi ");
        int hindi=sc.nextInt();
        System.out.println("Obtained Marks in English");
        int English=sc.nextInt();
        System.out.println("Obtained Marks in Science");
        int Science=sc.nextInt();
        System.out.println("Obtained Marks in Math");
        int Maths =sc.nextInt();
        System.out.println("Obtained Marks in Computer");
        int Computer=sc.nextInt();

        TotalObtainedMarks T=new TotalObtainedMarks(hindi,English,Maths,Science,Computer);
        System.out.println( "Taotal_Obtained_Marks="+T.TotalMarks());
        System.out.println("Percentege="+T.Percentage()+"%");
        System.out.print(
                "Result="
        );
        T.grade();



    }
}
