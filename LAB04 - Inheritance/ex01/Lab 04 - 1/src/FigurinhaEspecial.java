import java.text.SimpleDateFormat;
import java.util.Date;

public class FigurinhaEspecial {
    private String nomeDoJogador;
    private float altura;
    private float peso;
    private String posicao;
    private String pais;
    private Date dataNascimento;
    private String categoria;
    private String cor;

    public FigurinhaEspecial(String nomeDoJogador,float altura,float peso,String posicao,String pais,int dia,int mes,int ano,String categoria,String cor){
        setNomeDoJogador(nomeDoJogador);
        setAltura(altura);
        setPeso(peso);
        setPosicao(posicao);
        setPais(pais);
        setDataNascimento(dia,mes,ano);
        setCategoria(categoria);
        setCor(cor);
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

    public void setCategoria(String categoria){
        if(categoria != null){
            this.categoria = categoria;
        }
    }

    public String getCategoria(){
        return categoria;
    }

    public void setCor(String cor){
        if(cor != null){
            this.cor = cor;
        }
    }

    public String getCor(){
        return cor;
    }
    public void imprimeFigurinha(){
        System.out.printf("Nome: %s\n",nomeDoJogador);
        System.out.printf("Altura: %f\n",altura);
        System.out.printf("Peso: %f\n",peso);
        System.out.printf("Posicao: %s\n",posicao);
        System.out.printf("País: %s\n",pais);
        System.out.printf("Cor : %s\n",cor);
        System.out.printf("Categoria: %s\n",categoria);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(sdf.format(dataNascimento)+"\n");
    }
}

