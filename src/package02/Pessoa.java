package package02;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
// encapsulamento são as formas de acesso de uma classe
//public - permite que qlqr outra classe acese o método ou atributo
//friendly ou pacote = só é visível pq os dois estão no mesmo pacote.
//private - só dentro da classe.
//static - é só da classe
public class Pessoa {
    //private String nome; - tiramos para exemplificação de encapsulamento
    String nome; // nome não tem nenhum modificador de acesso, isso seria o "friendly"
    private int idade;
    private String sobrenome;
    private SexoEnum sexo;
    private boolean sabeNadar;

    //private Carro[] carros; // poderia guardar meus objetos em um array, mas podemos usar o ArrayList
    //private int indice;
    private ArrayList<Carro> carros; //lista ordenada (por ordem de inserção)

    // generics é onde eu informo que tipo de list ele representa, onde não preciso mais informar os valores.


    public Pessoa(String nome, int idade, String sobrenome, SexoEnum sexo, boolean sabeNadar) {
        this.nome = nome;
        this.idade = idade;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.sabeNadar = sabeNadar;
        //this.carros = new Carro[20];
        this.carros = new ArrayList<>();
        //this.indice = 0;
    }


    public void andar() {
        System.out.println(this.nome + " está andando");
    }
    public void correr() {
        System.out.println(this.nome + " está correndo");
    }
    public void nadar() {
        System.out.printf("%s esta %s %n",this.nome, (this.sabeNadar?" nadando" : "afogando"));
    }


    public void quemSou() {
        System.out.println("Eu sou uma Pessoa de nome " + this.nome);
    }

    public int anoNascimento() {
        int ano = LocalDate.now().getYear();
        return ano - this.idade;
    }

    public void adicionarCarro(Carro carro){
        //carros[indice] = carro;
        //indice++; //usando ArrayList não preciso mais do
        System.out.printf("Novo carro de tipo adicionado %n" );
        carro.motorista = this; // o this é o proprio objeto.
        carros.add(carro);
        System.out.println(carro.toString());
    }

    public void listarCarros(){
        for (Carro carro: this.carros) {
            if(Objects.nonNull(carro)){
                System.out.println(carro.toString());
            }
        }
    }

    public boolean temCarro(Carro carro){
        //retorna se tem ou não um carro
        return this.carros.contains(carro);
    }

    public void removerCarro(Carro carro){
        this.carros.remove(carro); //não temos mais o problema da posição
    }

    public String toString() {
        return "Pessoa{" +
                "nome ='" + this.nome + '\'' +
                ", idade =" + this.idade +
                ", sobrenome =" + this.sobrenome +
                ", sexo=" + this.sexo +
                ", ano de Nascimento=" + anoNascimento() +
                '}';
    }
}
