import java.util.ArrayList;

public class Professor {
    private String nome;
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private ArrayList<Formacao> formacoes = new ArrayList<>();

    public Professor(String nome,ArrayList<Formacao> formacoes){
        this.nome = nome;
        this.formacoes = formacoes;
    }

    public int setNome(String nome){
        if(nome != null){
            this.nome = nome;
            return 0;
        }
        return 1;
    }
    public int addFormacao(Formacao a){
        if(a==null) return 1;
        formacoes.add(a);
        return 0;
    }
    public int addAluno(Aluno  a){
        if ( a == null) return 1;
        alunos.add(a);
        return 0;
    }

    public int removeAluno(Aluno a){
        if(a==null) return 2;

        int i;
        Aluno b;

        for(i=0;i<alunos.size();i++){
            b = alunos.get(i);

            if(b.getNome().equals(a.getNome())){
                alunos.remove(i);
                return 0;
            }
        }

        return 1;
    }

    public String getNome(){
        return nome;
    }
}
