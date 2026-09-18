public class Calculadora {
    public int somar(int a, int b) {
        //adicionado a Multiply
        return a * b;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("Resultado: " + calc.somar(2, 3));
    }
}
