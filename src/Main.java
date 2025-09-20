public class Main {
    public static void main(String[] args) {
        enum TipoDePonto{
            VITORIA(100),
            ABATE(20),
            ITEM_ESPECIAL(5);

            private final int valor;

            TipoDePonto(int valor) {
                this.valor = valor;
            }

            public int getValor() {
                return valor;
            }

            public double getPontuacao(){
                return this.getPontuacao();
            }
        }
        class Jogador{
            private double totalDePontos;

            public void adicionarPonto(TipoDePonto... p){
                double soma = 0;
                for (TipoDePonto ponto : p){
                    soma+=ponto.getPontuacao();
                }
            }
        }

    }
}