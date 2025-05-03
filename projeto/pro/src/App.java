public class App {
    public static void main(String[] args) throws Exception {
        double livroJava8;
        double livroTDD;

        livroJava8 = 59.90;
        livroTDD = 59.90;

        double soma = livroJava8 + livroTDD;
        if(soma < 150){
            System.out.println("Seu estoque está muito baixo!");
        }else if(soma >=2000){
            System.out.println("Seu estoque está muito alto!");
        }else{
            System.out.println("Seu estoque está bom!");
        }
     
        System.out.println("O total em estoque é: $"+soma);
    }
}