// Conteúdo para o arquivo TestaOperacao.java
public class TestaOperacao {
    public static void main(String[] args) throws Exception {
        //testando com a operação SOMA
        double resultado = calcular(Enumeracoes.SOMA, 4, 5, 6, 7);
        System.out.println("Resultado da operação SOMA: " + resultado);

        //testando com a operação MULTIPLICACAO
        resultado = calcular(Enumeracoes.MULTIPLICACAO, 2, 3, 4);
        System.out.println("Resultado da operação MULTIPLICACAO: " + resultado);
    }

    public static double calcular(Enumeracoes op, double... numeros) throws Exception {
        if (numeros.length == 0) {
            throw new IllegalArgumentException("É necessário passar pelo menos um número.");
        }

        double n1 = numeros[0];
        double resultado = n1;

        for (int i = 1; i < numeros.length; i++) {
            double n2 = numeros[i];
            resultado = op.executar(resultado, n2);
        }

        return resultado;
    }
}