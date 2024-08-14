package randomnjumb;

public class TotalObtainedMarks {
    private int hindi;
    private int English;
    private int Maths;
    private int Science;
    private int Computer;
    private int sum;
    private int percentag;
    public TotalObtainedMarks(int hindi, int English, int Maths, int Science, int Computer)
    {
        this.hindi=hindi;
        this.English=English;
        this.Maths=Maths;
        this.Science=Science;
        this.Computer=Computer;
    }

    public int TotalMarks(){
        sum=hindi+English+Maths+Science+Computer;
        return sum;
    }
    public double Percentage(){
        percentag= sum/5;
        return percentag;
    }
    public void grade(){
        if(percentag>=90 && percentag<=100)
        {
            System.out.println("A+");
        }
        else if(percentag>=60 && percentag<90)
        {
            System.out.println("A");
        }

        else if(percentag>=45 && percentag<60)
        {
            System.out.println("B");
        }

        else if(percentag>=33 && percentag<45)
        {
            System.out.println("C");
        }
        else
        {
            System.out.println("fail");
        }

    }
}
