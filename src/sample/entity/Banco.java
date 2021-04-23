package sample.entity;

public class Banco {
    private String nombreCuentBanco;
    private String mes;
    private String categoria;
    private String clasificacion;
    private int anio;
    private int idCuentaBanco;
    private double semana1;
    private double semana2;
    private double semana3;
    private double semana4;
    private double semana5;


    public Banco() {
    }

    public Banco(String nombreCuentBanco, String mes, int anio,int semana, double valor) {
        this.nombreCuentBanco = nombreCuentBanco;
        this.mes = mes;
        this.anio = anio;
        switch (semana) {
            case 1:
                semana1 = valor;
                break;
            case 2:
                semana2 = valor;
                break;
            case 3:
                semana3 = valor;
                break;
            case 4:
                semana4 = valor;
                break;
            case 5:
                semana5 = valor;
                break;
        }
    }

    public String getNombreCuentBanco() {
        return nombreCuentBanco;
    }

    public void setNombreCuentBanco(String nombreCuentBanco) {
        this.nombreCuentBanco = nombreCuentBanco;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getIdCuentaBanco() {
        return idCuentaBanco;
    }

    public void setIdCuentaBanco(int idCuentaBanco) {
        this.idCuentaBanco = idCuentaBanco;
    }

    public double getSemana1() {
        return semana1;
    }

    public void setSemana1(double semana1) {
        this.semana1 = semana1;
    }

    public double getSemana2() {
        return semana2;
    }

    public void setSemana2(double semana2) {
        this.semana2 = semana2;
    }

    public double getSemana3() {
        return semana3;
    }

    public void setSemana3(double semana3) {
        this.semana3 = semana3;
    }

    public double getSemana4() {
        return semana4;
    }

    public void setSemana4(double semana4) {
        this.semana4 = semana4;
    }

    public double getSemana5() {
        return semana5;
    }

    public void setSemana5(double semana5) {
        this.semana5 = semana5;
    }
}
