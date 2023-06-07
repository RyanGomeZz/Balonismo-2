public class Main {
    public static void main(String[] args) {
        //Construir balão
        Balao b1 = new Balao();
        //Acionar voo do balão
        //Chamada do método voar()
        String resposta = b1.voar(new Combustível());
        // Apresente do retorno
        System.out.println(resposta);
        Balao b2= new Balao();
        Combustível alcool = new Combustível();
        System.out.println(b2.voar(alcool));

    }
}




