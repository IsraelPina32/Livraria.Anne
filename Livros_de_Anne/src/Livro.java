
public class Livro {
   
    private String titulo;
    private int numpags;
    private int ano;
    private double preco;


public String gettitulo(){
    return titulo;
}
  public int getano(){
     return ano;
}

public int getnumpags(){
    return numpags;
}
public double getpreco(){
    return preco;
}

 public void settitulo( String titulo) {
    this.titulo = titulo;

 }
 public void setnumpags (int numpags) {
    this.numpags = numpags;

}
public void setano (int ano) {
    this.ano = ano;

 }
 public void setpreco ( double preco) {
    this.preco = preco;

  }

}
