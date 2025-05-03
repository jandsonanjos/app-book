public class CadastroDeLivros {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.nome = "Java 8 Prático";
        livro.descricao = "Novos recursos livro Java!";
        livro.isbn = "324-42-32444-42-6";
        livro.valor = 59.90;

        System.out.println(livro.nome);
        System.out.println(livro.descricao);
        System.out.println(livro.isbn);
        System.out.println("$"+livro.valor);
    }

}
