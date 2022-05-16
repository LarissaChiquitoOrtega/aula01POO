package package01;

import package02.Carro;
import package02.Pessoa;
import package02.SexoEnum;

import java.util.Scanner;

public class Main {

    private static String VERSION = "1.0";  //exemplo de private static
    //exemplo da classe Math - classe utilitária por padrão (observar que é a classe de FINAL e seu construtor é private

    public static void main(String[] args) {

        System.out.println(VERSION); //exemplo de private static
        Scanner s = new Scanner(System.in);
        System.out.println("Digite as informações requeridas: ");

        System.out.println("Nome: ");
        String nome = s.next();
        System.out.println("Idade: ");
        int idade = s.nextInt();
        System.out.println("Sobrenome: ");
        String sobrenome = s.next();
        System.out.println("Sexo: ");
        String sexoStr = s.next();
        SexoEnum sexo = SexoEnum.valueOf(sexoStr.toUpperCase());
        System.out.println("Tipo do carro: ");
        String tipo = s.next();
        System.out.println("Cor do carro: ");
        String cor = s.next();

        Pessoa p = new Pessoa(nome, idade, sobrenome, sexo, true);
        Carro carro = new Carro(tipo, cor);

        //carro.motorista; - dá erro pq não tá no mesmo pacote

        Pessoa lari = new Pessoa("Larissa", 27, "Ortega",SexoEnum.FEMININO , false);
        Pessoa marcelo = new Pessoa("Marcelo", 30, "Pastana",SexoEnum.MASCULINO, true);
        Pessoa bia = new Pessoa("Beatriz", 22, "Costa",SexoEnum.FEMININO, true);

        p.adicionarCarro(carro);
        p.listarCarros();
        //Pessoa.quemSou();
        lari.quemSou();
        marcelo.quemSou();
        bia.quemSou();

        lari.andar();
        marcelo.correr();
        bia.nadar();

        System.out.println(lari.toString());
        System.out.println(marcelo.toString());
        System.out.println(bia.toString());


    }

}