//Samira Emilly Sena de Aguiar
public class Main{
    public static void main(String[] args){
        Aluno Aluno1 = new Aluno();
        Aluno1.alterarnome("Samira");
        Aluno1.alterarid(1);
        Aluno1.nota1 = 3.5;
        Aluno1.nota2 = 6.5;
        Aluno1.RetornarMedia();
        if(Aluno1.Passou() == true){
            System.out.println("Passou");
        }else{
            System.out.println("Não Passou");
        }
    }
}