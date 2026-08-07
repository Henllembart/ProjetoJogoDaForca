package ProjetoJogoDaForca;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class ProjetoJogoDaForca {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> palavras = new ArrayList<>();
        ArrayList<Character> testes = new ArrayList<>();
        ArrayList<Character> letrasDescobertas = new ArrayList<>();

        palavras.add("java");
        palavras.add("python");
        palavras.add("golang");
        palavras.add("rust");
        palavras.add("javascript");
        palavras.add("typescript");
        palavras.add("json");
        int tentativas = 6;

        Random aleatorio = new Random();
        int indiceAleatorio = aleatorio.nextInt(palavras.size());
        String palavraPega = palavras.get(indiceAleatorio);

        boolean palavraAcertada = false;

        for (int i = 0; i < palavraPega.length(); i++) {
            testes.add(i, '_');
        }



        while (!palavraAcertada) {
            boolean caractereAcertada = false;
            System.out.println(testes);
            System.out.println("\nDigite uma letra:");
            String tentav = scan.next().toLowerCase();

            if (tentav.length() != 1) {
                System.out.println("Tente apenas UMA letra");
                continue;
            }

            char tentav1 = tentav.charAt(0);
        if (letrasDescobertas.contains(tentav1)) {
            System.out.println("Voce ja tentou essa letra");
            continue;
        }
            for (int i = 0; i < testes.size(); i++) {
                if (tentav1 == palavraPega.charAt(i)) {
                    testes.set(i, palavraPega.charAt(i));

                    caractereAcertada = true;
                }
            }
            letrasDescobertas.add(tentav1);

            if (!caractereAcertada) {
                tentativas--;
                System.out.println("Voce errou, agora tem " + tentativas + " tentativa(s)");
                if (tentativas == 0) {
                    System.out.println("Tentativas esgotaram, voce perdeu!, a palavra era: " + palavraPega);
                    return;
                }
            }

            if (!testes.contains('_')) {
                palavraAcertada = true;
                System.out.println("Parabens, voce acertou a palavra");

            }

        }

    }
}









