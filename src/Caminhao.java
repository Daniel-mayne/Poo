public class Caminhao extends Veiculo{
    int carga;

    Caminhao(){

    }

    Caminhao(int carga){
        this.carga = carga;
    }


    void setCarga(int carga){
        this.carga = carga;
    }

    int getCarga (int carga){
        return carga;
    }

}
