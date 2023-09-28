import java.text.SimpleDateFormat;
import java.util.Date;

public class Figurinha {
    protected String nomeDoJogador;
    protected float altura;
    protected float peso;
    protected String posicao;
    protected String pais;
    protected Date dataNascimento;

    public Figurinha(String nomeDoJogador,float altura,float peso,String posicao,String pais,int dia,int mes,int ano){
        setNomeDoJogador(nomeDoJogador);
        setAltura(altura);
        setPeso(peso);
        setPosicao(posicao);
        setPais(pais);
        setDataNascimento(dia,mes,ano);
    }

    public void setNomeDoJogador(String nomeDoJogador){
        if(nomeDoJogador==null){
            this.nomeDoJogador = "Jogador sem nome";
        }
        else{
            this.nomeDoJogador = nomeDoJogador;
        }
    }

    public void setAltura(float altura){
        if(altura <=0){
            System.out.println("Altura inválida");
            return;
        }
        else if(altura<1.65f){
            System.out.println("O jogdador é baixo demais para jogar em qualquer time respeitável");
        }
        this.altura = altura;
    }

    public void setPeso(float peso){
        if(altura <=0){
            System.out.println("Peso inválidd");
            return;
        }

        this.peso = peso;
    }

    public void setPosicao(String posicao){
        if(posicao==null){
            this.posicao = "Banco";
        }
        else{
            this.posicao = posicao;
        }
    }

    public void setPais(String pais){
        if(pais==null){
            this.pais = "Jogador sem nacionalidade";
        }
        else{
            this.pais = pais;
        }
    }

    public void  setDataNascimento(int dia,int mes,int ano){
        if(dia<=0){
            dia = 1;
        }
        if(mes<0){
            mes = 0;
        }
        if(ano<1900){
            ano = 1900;
        }

        dataNascimento = new Date(ano-1900,mes-1,dia,0,0);
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

