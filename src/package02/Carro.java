package package02;
/*
    ESCOPO
    ou é de classe ou não é de classe!
    STATIC - é a representação de que o método ou variável é de escopo de classe
     */
public class Carro {

    //características = atributos da classe;
    private String tipo;
    private String cor;
    private int numeroPortas;
    // private Pessoa motorista;
    Pessoa motorista;

    // método construtor - sem construtor definido, ela cria para você!
    // a partir do momento que defino um construtor

    public Carro(String tipo, String cor){
        this.tipo = tipo;
        this.cor = cor;
    }

    //comportamentos = métodos da classe
    public void acelerar() {
        //carro consegue enxergar atributo da classe pessoa!
        System.out.printf("O %s acelerou e o carro de tipo %s Velocidade aumentou %n", motorista.nome, this.tipo);
    }


    public void frear() {
        System.out.println("velocidade aumenta");
    }

    // metodo to .toString existe implicitanmente aqui, podemos chamá-lo
    // o .equals() tbm

    //posso sobrescrever o método toString por exemplo:
    // usar o CTRL + F12 para que possamos visualizar inclusive estes métodos ocultos herdados da classe object.
    @Override
    public String toString(){
        return String.format("Eu sou um carro de tipo %s e cor %s e pertenço a %s", this.tipo, this.cor, this.motorista.nome);
    }
}
