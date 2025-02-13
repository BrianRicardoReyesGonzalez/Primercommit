package cuentas;

public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    public CCuenta() {
    }

    public CCuenta(String nom, String cue, double sal, double tipo) {
        this.nombre = nom;
        this.cuenta = cue;
        this.saldo = sal;
        this.tipoInteres = tipo;
    }

    public double estado() {
        return saldo;
    }

    public void retirar(double cantidad) {
        try {
            System.out.println("Retiro en cuenta: " + cantidad);
            if (cantidad <= 0) {
                throw new Exception("No se puede retirar una cantidad negativa");
            }
            if (estado() < cantidad) {
                throw new Exception("No hay suficiente saldo");
            }
            saldo -= cantidad;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void ingresar(double cantidad) {
        try {
            System.out.println("Ingreso en cuenta: " + cantidad);
            if (cantidad < 0) {
                throw new Exception("No se puede ingresar una cantidad negativa");
            }
            saldo += cantidad;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
