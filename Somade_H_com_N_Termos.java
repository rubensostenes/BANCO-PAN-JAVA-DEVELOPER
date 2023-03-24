import java.util.Scanner;

public class Somade_H_com_N_Termos{

    public static void main(String[] Args) {

    double h = 0;
    Scanner sc = new Scanner(System.in);
    double n = sc.nextDouble();
     

    for (int i = 1; i <= n; i++) {

    //TODO: Calcule o valor de H de forma que resulte na soma dos termos:

          h += (double) 1/i;

    }

    //TODO: Imprima a soma dos termos, considerando um resultado com duas casas decimais:
h += 0.5;
    System.out.println((int)h);
   }
}