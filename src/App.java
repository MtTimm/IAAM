import java.io.IOException;

public class App{
    public static void main(String[] args) {
        try {
            String arquivo = ".\\teste.csv";
            Leitor ler = new Leitor();
            Dado[] dados = ler.importar(arquivo);

            for (int i = 0; i < dados.length; i++) {
                System.out.println(dados[i].toString());
            }

            dados = Normalizador.normalizar(dados);

            for (int i = 0; i < dados.length; i++) {
                System.out.println(dados[i].toString());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}