//This is just a mold

public class Livro {
    String nome;
    String descricao;
    String isbn;
    double valor;
    String nomeDoAutor;
    String emailDoAutor;
    String cpfDoAutor;
    public Autor autor;

    void mostrarDetalhes(){
        String mensagem = "Mostrando detalhes do livro\n";
        System.out.println(mensagem);
        System.out.println("Nome: "+nome);
        System.out.println("Descrição: "+descricao);
        System.out.println("ISBN: "+isbn);
        System.out.println("Valor: $"+valor+" BRL");
        System.out.println("____________________________________\n");
        System.out.println("Details author: \n");
        autor.mostrarDetalhes();
        System.out.println("___________________________________\n");
    }
}

