import java.util.ArrayList;

public class Aluno {
    private String nome;
    private ArrayList<Professor> professors = new ArrayList<Professor>();
    private ArrayList<Anotacao> anotacoes = new ArrayList<Anotacao>();

    public Aluno(String nome){
        this.nome = nome;
    }

    public int addProfessor(Professor  a){
        if ( a == null) return 1;
        professors.add(a);
        return 0;
    }

    public int removeProfessor(Professor a){
        if(a==null) return 2;

        int i;
        Professor b;

        for(i=0;i<professors.size();i++){
            b = professors.get(i);

            if(b.getNome().equals(a.getNome())){
                professors.remove(i);
                return 0;
            }
        }

        return 1;
    }

    public int addAnotacao(){
        Anotacao a = new Anotacao(11,22,33,"Estudei muito hoje","Aula01");
        anotacoes.add(a);
        return 0;
    }

    public int removeAnotacao(Anotacao a){
        if(a==null) return 2;

        int i;
        Anotacao b;

        for(i=0;i<anotacoes.size();i++){
            b = anotacoes.get(i);

            if(b.getNome().equals(a.getNome())){
                anotacoes.remove(i);
                return 0;
            }
        }

        return 1;
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
}
