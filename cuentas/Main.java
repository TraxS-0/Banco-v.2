package cuentas;
public class Main {

    public static void main(String[] args) {
        Cuenta cuentaAlejo;
        cuentaAlejo = new Cuenta("Antonio López", "1000-2365-85-1230456789", 2500);
        System.out.println(cuentaAlejo.toString());
        System.out.println("\nEl saldo actual es: "+ cuentaAlejo.getSaldo());

        try {
        	int valor1 = 2000;
            System.out.println("Retiramos " + valor1 + " en cuenta");
            cuentaAlejo.retirar(valor1);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            int valor2 = 600;
            System.out.println("Ingresamos " + valor2 + " en cuenta");
            cuentaAlejo.ingresar(valor2);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }

        System.out.println("El saldo actual es: "+ cuentaAlejo.getSaldo());
    }
}
