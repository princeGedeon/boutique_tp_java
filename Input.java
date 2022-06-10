import java.util.Scanner;

public class Input{
    public static int input_number(){
        Scanner val;
        val=new Scanner(System.in);
        return val.nextInt();
    }
    public static String input_string(){
        Scanner val;
        val=new Scanner(System.in);
        return val.nextLine();
    }

    public static double input_double(){
        Scanner val;
        val=new Scanner(System.in);
        return val.nextDouble();
    }

    public static double input_with_label_double(String label)
    {
        System.out.print(label+" :");
        double tmp=input_double();
        return tmp;

    }

    public static String input_with_label_string(String label)
    {
        System.out.print(label+" :");
        String tmp=input_string();
        return tmp;

    }
    public static int input_with_label_int(String label)
    {
        System.out.print(label+" :");
        int tmp=input_number();
        return tmp;

    }

    public static void patienter(){
        input_number();
    }

   
}
