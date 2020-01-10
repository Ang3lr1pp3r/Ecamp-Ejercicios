package resistencias;
import java.util.Scanner;
public class Resistencias {
	public static void main (String args[]) {
		Scanner lee = new Scanner(System.in);
		System.out.println("Este programa Calcula la resistencia total dentro de un circuito paralelo de 3 resistencias");
		System.out.println("Valor R1");
		float R1=lee.nextFloat();
		System.out.println("Valor de R2");
		float R2=lee.nextFloat();
		System.out.println("Valor R3");
		float R3=lee.nextFloat();
		
		if( R1 !=0) {
			if( R2 !=0) 
				if( R3 !=0) 
						System.out.print("La Resistencia Total es: ");
						System.out.print( R1+R2+R3 );}
						else System.out.print( "Las resistencias no son distintas a cero");
						
	
			
		
	
	
	}
}