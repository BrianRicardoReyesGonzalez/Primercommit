package cuentas;

public class Main {
    public static void main(String[] args) {
        CCuenta cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        double saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);

        operaciones(cuenta1);

        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);
    }

    public static void operaciones(CCuenta cuenta1) {
        cuenta1.retirar(2300);
        cuenta1.ingresar(685);
    }
}