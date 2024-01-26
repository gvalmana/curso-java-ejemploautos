public class Rueda {
    private String fabricante;
    private int radio;
    private double size;

    public Rueda() {
    }

    public Rueda(String fabricante, int radio, double size) {
        this.fabricante = fabricante;
        this.radio = radio;
        this.size = size;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
