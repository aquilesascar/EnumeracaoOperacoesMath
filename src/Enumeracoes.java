public enum Enumeracoes {
    ADD('+'), SUB('-'), MUL('x'), DIV('/');

    private char simboloOP;

    // Construtor da enumeração
    private Enumeracoes(char simbolo) {
        this.simboloOP = simbolo;
    }

    public double executar(double n1, double n2) throws ArithmeticException {
        switch(this.simboloOP){
            case '+':
                return (n1 + n2);
            case '-':
                return (n1 - n2);
            case 'x':
                return (n1 * n2);
            case '/':
                if(n2 != 0) {
                    return (n1 / n2);
                } else {
                    throw new ArithmeticException("Divisão por 0");
                }
            default:
                throw new IllegalArgumentException("Opção inválida");
        }
    }
}
