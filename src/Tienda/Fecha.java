package Tienda;


public class Fecha {
    private int dia;
    private int mes;
    private int a�o;

    public Fecha() {
    }
    
    
    public Fecha(int dia, int mes, int a�o) {
        this.dia = dia;
        this.mes = mes;
        this.a�o = a�o;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getA�o() {
        return a�o;
    }

    public void setAnio(int a�o) {
        this.a�o = a�o;
    }
    
    
    
}