public class TestaOperacao {
    public static void main(String[] args) throws Exception {
        //testando com a operação ADD
        double resultado = calcular(Enumeracoes.ADD, 4, 5, 6, 7);
        System.out.println("Resultado da operação ADD: " + resultado);

        //testando com a operação MUL
        resultado = calcular(Enumeracoes.MUL, 2, 3, 4);
        System.out.println("Resultado da operação MUL: " + resultado);
    }

    public static double calcular(Enumeracoes op, double... numeros) throws Exception {
        if (numeros.length == 0) {
            throw new IllegalArgumentException("É necessário passar pelo menos um número.");
        }

        double n1 = numeros[0];
        double resultado = n1;

        //aplica a operação entre os números
        for (int i = 1; i < numeros.length; i++) {
            double n2 = numeros[i];
            resultado = op.executar(resultado, n2);
        }

        return resultado;
    }
}
