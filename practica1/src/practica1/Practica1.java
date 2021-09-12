package practica1;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Practica1 {
    public static void main(String[] args) {
        String cadena;
        int num1,num2, suma, resta, multiplicacion, division;
        Scanner entrada=new Scanner(System.in);
        
        cadena=JOptionPane.showInputDialog("cual es su nombre");
        JOptionPane.showMessageDialog (null, cadena + " Gracias por utilizar el software para realizar las operaciones matematicas");
        JOptionPane.showMessageDialog(null, "COMENCEMOS");
        System.out.println("por favor digite los dos numeros con los que quiere realizar las 4 operaciones matematicas");
        num1=entrada.nextInt();
        num2=entrada.nextInt();
        
        suma = num1+num2;
        resta = num1-num2;        
        multiplicacion= num1*num2;                 
        division=num1/num2;
        System.out.println("la suma es igual a:  "+suma);
        System.out.println("la resta es igual a: "+resta);
        System.out.println("la multiplicacion es igual a: "+multiplicacion);
        System.out.println("la division es igual a: "+division);
       
    }
    
}
