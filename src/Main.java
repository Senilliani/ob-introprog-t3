public class Main {
    public static void main(String[] args) {

        suma( 2, 2, 2);

        coche micoche = new coche();
        micoche.sumar_puertas();
        System.out.println(micoche.puertas);
    }


    public static void suma(int num1, int num2, int num3) {
        int resultado;
        resultado = num1 + num2 + num3;
        System.out.println(resultado);
    }

}


class coche {

    public int puertas = 2;

    public void sumar_puertas() {
        this.puertas++;
    }
}





