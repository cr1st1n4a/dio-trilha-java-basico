public class Operadores5 {
    public static void main(String[] args) {
        String nome1 = "CRISTINA";
        String nome2 = new String("CRISTINA");

        System.out.println(nome1.equals(nome2));


        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 == numero2) {
            System.out.println("A nossa condição é verdadeira");
        }

        System.out.println("numero1 é igual a numero2? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numero1 é diferente do numero2? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numero1 é maior que o numero2? " + simNao);
    }
}