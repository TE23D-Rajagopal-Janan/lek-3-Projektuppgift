import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);
        int[] bokningar = new int[20];
        double pris = 299.90; 
        
        System.out.println("1. Vill du boka en plats");
        System.out.println("2. Antal lediga platser");
        System.out.println("3. Stäng ner (Avsluta)");
        int val = input.nextInt();   

        if (val == 1) {
            System.out.println("Ange personnummer");
        }
        
        


    }
}
