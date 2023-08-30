import java.text.SimpleDateFormat;
import java.util.*;

public class Figurinha {
    String nomeDoJogador;
    float altura;
    float peso;
    String posicao;
    String pais;
    Date dataNascimento;

    public Figurinha(String nomeDoJogador,float altura,float peso,String posicao,String pais,int ano,int mes,int dia){
        this.nomeDoJogador = nomeDoJogador;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.pais = pais;

        dataNascimento = new Date(ano-1900,mes,dia,0,0);
    }

    public void imprimeFigurinha(){
        System.out.printf("Nome: %s\n",nomeDoJogador);
        System.out.printf("Altura: %f\n",altura);
        System.out.printf("Peso: %f\n",peso);
        System.out.printf("Posicao: %s\n",posicao);
        System.out.printf("País: %s\n",pais);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(sdf.format(dataNascimento)+"\n");
    }
}
