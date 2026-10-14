package rpg;

public class Mago extends Personagem {

    private String tipoMagia;

    public Mago(String nome, int nivel, int vida, String tipoMagia) {
            
    }

    }

    public String getTipoMagia() {
        return tipoMagia;
    }

    @Override
    public void exibirInformacoes() {

        super.exibirInformacoes();

        System.out.println("Tipo de magia: " + tipoMagia);
    }

    @Override
    public void atacar(Personagem alvo) {
        
            System.out.println(
                    getNome() + " está derrotado e não pode atacar."
            );
            return;
        }

        if (alvo == null || !alvo.estaVivo()) {
            System.out.println("O alvo não pode receber o ataque.");
            return;
        }

        int dano = 12 + getNivel();

        System.out.println(
                getNome()
                        + " atacou usando magia do tipo: "
                        + tipoMagia
        );

        alvo.receberDano(dano);
    }

