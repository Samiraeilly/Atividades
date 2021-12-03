public class  Aluno{
        private String nome;
        private int id;
        private double media;
        protected double nota1,nota2;

public void alterarnome(String nome){
        this.nome = nome;
    }
public void alterarid(int id){
        this.id = id;
    }
public void imprimirnome(){
        System.out.println(this.nome);
    }
public void imprimirid(){
        System.out.println(this.id);
    }
private double CalculaMedia () {
    double s = this.media = (this.nota1+this.nota2)/2;
    this.media = s;
    return this.media;
}
public double RetornarMedia (){
    return CalculaMedia();
}
public boolean Passou(){
    if(this.media>7){
        return true;
    }else{
        return false;
    }
}
}
    
    
    
    
    