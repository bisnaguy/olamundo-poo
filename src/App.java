public class App {
    public static void main(String[] args) throws Exception {
        Veiculo ka  = new Veiculo();
        ka.capacidadeTanque = 40;
        // System.out.println(ka.capacidadeTanque);
        ka.velocidade = 20;
        ka.acelerar();
        ka.acelerar();
        ka.acelerar();
        ka.acelerar();
        ka.acelerar();
        ka.acelerar();
        ka.acelerar();
        ka.acelerar();
        System.out.println(ka.velocidade);
        
        ka.frear();
        System.out.println(ka.velocidade);

        Veiculo kaka = new Veiculo();
        System.out.println(kaka.velocidade); 

        System.out.println(ka.buzina());
    }
}
