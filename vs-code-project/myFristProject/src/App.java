import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu apelledo: ");
        String apellido = sc.nextLine();
        
        System.out.println("Hello, "+args[0]+" "+apellido+"!");
    }
}
