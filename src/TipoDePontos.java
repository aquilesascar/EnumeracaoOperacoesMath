public class TipoDePontos {
        enum TipoDePonto {
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
        }

        class Jogador {
            private double totalDePontos;

            public void adicionarPonto(TipoDePonto... pontos) {
                for (TipoDePonto ponto : pontos) {
                    this.totalDePontos += ponto.getValor();
                }
            }

            public double getTotalDePontos() {
                return totalDePontos;
            }
        }
}