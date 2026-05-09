import java.util.ArrayList;

public class SistemaEldoria {
    public static void main(String[] args) {
        // Criando uma lista de personagens
        ArrayList<Personagem> personagens = new ArrayList<>();

        // Adicionando um Mago e um Guerreiro (usando a classe Guerreiro que criaremos abaixo)
        personagens.add(new Mago("Gandalf", 10, 80, 50.5));
        personagens.add(new Guerreiro("Aragorn", 12, 150, 40.0));

        System.out.println("=== Bem-vindo ao Sistema Eldoria ===");

        // Rodando o loop para mostrar os status e habilidades
        for (Personagem p : personagens) {
            p.exibirStatus();
            p.usarHabilidade();
        }
    }
}

// Transformei o que era "SistemaEldoria" antes em uma classe "Guerreiro"
class Guerreiro extends Personagem {
    public Guerreiro(String nome, int nivel, int pontosDeVida, double poderBase) {
        super(nome, "Guerreiro", nivel, pontosDeVida, poderBase);
    }

    @Override
    public void usarHabilidade() {
        System.out.println("Habilidade: " + getNome() + " desfere um golpe esmagador com seu machado!");
    }
}