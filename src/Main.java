
public class Main {
    public static void main(String[] args) {

        Veiculo carro = new Veiculo();

        carro.setCor("Azul");
        carro.setModelo("FIAT");
        carro.setCapacidadeTanque(59);

        System.out.println(carro.getCor());
        System.out.println(carro.getModelo());
        System.out.println(carro.getCapacidadeTanque());
        System.out.println(carro.totalValorTanque(6.39));

        Veiculo moto = new Veiculo("Cinza","BMW", 66);

        System.out.println(moto.getCor());
        System.out.println(moto.getModelo());
        System.out.println(moto.getCapacidadeTanque());
        System.out.println(moto.totalValorTanque(6.46));


        Veiculo caminhao = new Veiculo("Preto", "Volvo", 15);

        System.out.println(caminhao.getCor());
        System.out.println(caminhao.getModelo());
        System.out.println(caminhao.getCapacidadeTanque());
        System.out.println(caminhao.totalValorTanque(12.33));

        Caminhao caminhao1 = new Caminhao(150);
    }
}