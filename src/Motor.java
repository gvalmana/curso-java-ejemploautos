public class Motor {
    private TypeMotor typeMotor;
    private Integer cilindros;

    public Motor(TypeMotor typeMotor, Integer cilindros) {
        this.typeMotor = typeMotor;
        this.cilindros = cilindros;
    }

    public TypeMotor getTypeMotor() {
        return typeMotor;
    }

    public void setTypeMotor(TypeMotor typeMotor) {
        this.typeMotor = typeMotor;
    }

    public Integer getCilindros() {
        return cilindros;
    }

    public void setCilindros(Integer cilindros) {
        this.cilindros = cilindros;
    }
}
