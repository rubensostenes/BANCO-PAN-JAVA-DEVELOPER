import java.io.IOException;
import java.util.Scanner;

public class Imprimindo_Positivos_e_Média{
	
  public static void main(String[] args) throws IOException {
     Scanner leitor = new Scanner(System.in);
     int cont = 0;
     double media = 0;
     double x;
     int i;
    double num = 0, numero;
     //TODO: Implemente as condições adequadas para obter a quantidade 
    //de valores positivos e a média dos valores positivos:
    
    
    for (i = 1;i <= 6;i++) {
        numero = leitor.nextDouble();
        	if(numero > 0){
        	 cont++;
        	 num += numero;
        	}
        
      
    }
      media = num / cont;  
      
        
        System.out.println(cont + " valores positivos");
        System.out.println(String.format("%.1f", media));
    }
	
}