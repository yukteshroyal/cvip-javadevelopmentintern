import java.util.Scanner;
public class Bmi_Calculator{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.print("enter weight in kg:");
        double weight_in_kg=obj.nextDouble(); 
        System.out.print("enter height in inches:");
        double height_in_inches=obj.nextDouble(); 
        double height_in_meters=height_in_inches*0.0254; //to convert height into meters
        double BMI=weight_in_kg/(height_in_meters*height_in_meters);
        System.out.println("your weight="+weight_in_kg); //print weight
        System.out.println("your height="+height_in_meters); //print height
        System.out.println("BMI is:"+BMI); //print bmi
        if(BMI<18)
        System.out.println("underweight");
        else if(BMI<25)
        System.out.println("normal");
        else if(BMI<30)
        System.out.println("overweight");
        else
        System.out.println("obseity");
    }
}