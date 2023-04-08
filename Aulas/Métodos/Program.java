package Aulas.Métodos;

public class Program {
    public static void main(String[] args) {
                    
        // Contructor Vazio 
        Carro carro = new Carro();
                    
        carro.setCor("Azul");
        carro.setModelo("BMW Serie 3");
        carro.setCapacidadeTanque(43);
        
        System.out.println(carro.getModelo());
        System.out.println(carro.getCor());
        System.out.println(carro.getCapacidadeTanque());
        System.out.println(carro.totalValorTanque(6.45));
        
        // Constructor com Atributos
        Carro carro2 = new Carro("Cinza", "Mercedes", 76);

        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(9.6));
        
        
    }
}
