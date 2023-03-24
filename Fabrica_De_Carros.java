import java.util.*;

public class Fabrica_De_Carros{

	public static void main(String[] args) {

	    Scanner scan = new Scanner(System.in);
        int custoFabrica = scan.nextInt();
	    int porcentagemDistribuidor = scan.nextInt();
	    int PercentualImpostos = scan.nextInt();

            int custoConsumidor;
     
            int Distribuidor;
            int ValorImpostos;
 
        // TODO: Implemente uma condição que calcule a porcentagem do distribuidor e dos impostos:
        
        ValorImpostos = porcentagemDistribuidor + PercentualImpostos;
        
        custoConsumidor = (ValorImpostos * custoFabrica) /100;
        
        Distribuidor = custoConsumidor + custoFabrica;
 
        System.out.println(Distribuidor);
	}
}