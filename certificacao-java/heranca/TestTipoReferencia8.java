interface Veiculo {
    int getMarcha();
    void liga();
}

abstract class Carro implements Veiculo {
    public void liga()  {
        System.out.println("ligado!");
    }
}

class CarroConcreto extends Carro implements Veiculo { // implements Veiculo (é desnecessário), pois Carro já implementa essa interface
    public int getMarcha() {
        return 1;
    }
}
// código compila!