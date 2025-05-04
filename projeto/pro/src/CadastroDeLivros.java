public class CadastroDeLivros {
    public static void main(String[] args) {
        Livro livro = new Livro();

        Autor autor = new Autor();
        autor.nome = "Jandao Lindo";
        autor.email = "jandsonlindo@hotmail.com";
        autor.cpf = "123-434-345-46";

        livro.nome = "Java 8 Prático";
        livro.descricao = "Novos recursos livro Java!";
        livro.isbn = "324-42-32444-42-6";
        livro.valor = 59.90;

        livro.autor = autor;

        livro.mostrarDetalhes();

        Livro outroLivro = new Livro();

        outroLivro.nome = "Lógica de programação";
        outroLivro.descricao = "Orientado a objetos";
        outroLivro.isbn = "234-323-3213-3232-23";
        outroLivro.valor = 59.90;

        Autor outroAutor = new Autor();
        outroAutor.nome = "Jander123";
        outroAutor.email = "jandsonanjo@yahoo.com";
        outroAutor.cpf = "234-323-332-21";

        outroLivro.autor = outroAutor;
        
        outroLivro.mostrarDetalhes();



    }

}
