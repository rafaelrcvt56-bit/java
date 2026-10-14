package rpg;

public class Guerreiro extends Personagem {

    private String arma;

    public Guerreiro(String nome, int nivel, int vida, String arma) {

        super(nome, nivel, vida);

        if (arma == null || arma.trim(){
        "O guerreiro precisa possuir uma arma."
            );
        }

        this.arma = arma;
    }

    public String getArma() {
        return arma;
    }

    @Override
    public void exibirInformacoes() {

        super.exibirInformacoes();

        System.out.println("Arma: " + arma);
    }

    @Override
    public void atacar(Personagem alvo) {

        if (!estaVivo()) {
            System.out.println(
                    getNome() + " está derrotado e não pode atacar."
            );
            return;
        }

        if (alvo == null || !alvo.estaVivo()) {
            System.out.println("O alvo não pode receber o ataque.");
            return;
        }

        int dano = 10 + getNivel();

        System.out.println(
                getNome() + " atacou usando sua arma: " + arma
        );

        alvo.receberDano(dano);
    }
}
    

