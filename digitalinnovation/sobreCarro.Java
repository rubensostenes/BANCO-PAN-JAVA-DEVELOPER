package digitalinnovation;

public class sobreCarro{

    public static void main(String[] args) {
        
        Carro carro = new Carro();
        
        carro.setCor("Azul");
        carro.setModelo("BMW Serie 3");
        carro.setCapacidadeTanque(43);

        System.out.println(carro.getModelo());
        System.out.println(carro.getCor());
        System.out.println(carro.getCapacidadeTanque());
        System.out.println(carro.totalValorTanque(6.45));

        
    }
}