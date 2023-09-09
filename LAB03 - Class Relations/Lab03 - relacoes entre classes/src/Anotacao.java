public class Anotacao {
    private int dd,mm,aaaa;
    private String conteudo;
    private String nome;


    public Anotacao(int dd,int mm,int aaaa,String conteudo,String nome){
        this.dd = dd;
        this.mm = mm;
        this.aaaa = aaaa;
        setConteudo(conteudo);
        setNome(nome);
    }
    public int setNome(String nome){
        if(nome != null){
            this.nome = nome;
            return 0;
        }
        return 1;
    }

    public String getNome(){
        return nome;
    }

    public int setConteudo(String conteudo){
        if(conteudo == null) return 1;
        this.conteudo = conteudo;
        return 0;
    }

    public String getConteudo(){
        return conteudo;
    }
}
