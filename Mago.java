class Mago extends Personagem {
    public Mago(String nome, int nivel, int pontosDeVida, double poderBase) {
        super(nome, "Mago", nivel, pontosDeVida, poderBase);
    }

    @Override
    public void usarHabilidade() {
        System.out.println("Habilidade: " + getNome() + " conjura uma bola de fogo arcana!");
    }
}