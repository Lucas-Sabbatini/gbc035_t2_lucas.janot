import java.text.SimpleDateFormat;

public class FigurinhaEspecial extends Figurinha{
    private String cor;
    private String categoria;

    public FigurinhaEspecial(String nome,float altura,float peso,String posicao,String pais,int dia,int mes,int ano,String cor,String categoria){
        super(nome,altura,peso,posicao,pais,dia,mes,ano);
        this.cor = cor;
        this.categoria = categoria;

    }

    public String getCategoria() {
        return categoria;
    }

    public String getCor() {
        return cor;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void imprimeFigurinha(){
        super.imprimeFigurinha();
        System.out.printf("Categoria: %s\n",categoria);
        System.out.printf("Cor: %s\n",cor);
    }
}
