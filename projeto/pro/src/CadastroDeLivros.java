public class CadastroDeLivros {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.nome = "Java 8 Prático";
        livro.descricao = "Novos recursos livro Java!";
        livro.isbn = "324-42-32444-42-6";
        livro.valor = 59.90;

        livro.mostrarDetalhes();

        Livro outroLivro = new Livro();

        outroLivro.nome = "Lógica de programação";
        outroLivro.descricao = "Orientado a objetos";
        outroLivro.isbn = "234-323-3213-3232-23";
        outroLivro.valor = 59.90;

        outroLivro.mostrarDetalhes();

    }

}
