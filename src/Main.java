import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> colors = new ArrayList<>();

        colors.add("red");
        colors.add("yellow");
        colors.add("blue");

        System.out.println(colors);

        System.out.println("Value at Index 1: "+colors.get(1));

        String c="";
        while(true){

            if(c.equalsIgnoreCase("Q")){
                break;
            } else {
                System.out.print("Enter a new color: ");
                c=sc.nextLine();
                colors.add(c);
                System.out.println("(Q) Quit?  Or press any key to continue");
                c=sc.nextLine();

            }
        }
        System.out.println(colors);


    }
}
