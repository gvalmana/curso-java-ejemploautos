public class Automobile implements Comparable<Automobile> {

    private static Integer id = 1;
    private String manufacturer;
    private Motor motor;
    private Estanque estanque;
    private Rueda[] ruedas;
    private Persona propietario;

    private TypeAuto typeAuto;

    private Color color;

    private int indiceRuedas = 0;
    Automobile() {
        this.ruedas = new Rueda[4];
    }

    public static Integer getId() {
        return id;
    }

    public static void setId(Integer id) {
        Automobile.id = id;
    }

    Automobile(String manufacturer){
        this();
        this.manufacturer = manufacturer;
    }

    Automobile(String manufacturer, Motor motor) {
        this(manufacturer);
        this.motor = motor;
    }

    Automobile(String manufacturer, Motor motor, Estanque estanque) {
        this(manufacturer, motor);
        this.estanque = estanque;
    }

    Automobile(String manufacturer, Motor motor, Estanque estanque, Rueda[] ruedas) {
        this(manufacturer, motor, estanque);
        this.ruedas = ruedas;
    }

    Automobile(String manufacturer, Motor motor, Estanque estanque, Rueda[] ruedas, Persona propietario) {
        this(manufacturer, motor, estanque, ruedas);
        this.propietario = propietario;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public TypeAuto getTypeAuto() {
        return typeAuto;
    }

    public void setTypeAuto(TypeAuto typeAuto) {
        this.typeAuto = typeAuto;
    }

    public Automobile addRueda(Rueda rueda){
        this.ruedas[indiceRuedas++] = rueda;
        return this;
    }

    public String getDetalles(){
        StringBuilder sb = new StringBuilder();
        sb.append("Automobile {\n");
        sb.append("id=");
        sb.append(", manufacturer='" + this.getManufacturer() + '\'');
        if (this.getPropietario() != null) {
            sb.append(", propietario='" + this.getPropietario().getName() + " " + this.getPropietario().getLastName() + '\'');
        }
        if (this.getRuedas() != null) {
            sb.append(", ruedas=" + this.getRuedas().length);
        }
        if (this.getEstanque() != null) {
            sb.append(", estanque=" + this.getEstanque().getVolumen());
        }
        if (this.getMotor() != null) {
            sb.append(", motor=" + this.getMotor().getCilindros());
        }
        if (this.getTypeAuto() != null) {
            sb.append(", typeAuto=" + this.getTypeAuto().getNombre());
        }
        if (this.getColor() != null) {
            sb.append(", color=" + this.getColor().getColor() + "\n");
        }
        if (this.getRuedas() != null) {
            for (Rueda rueda : this.getRuedas())
                sb.append(rueda.getFabricante() + " " + rueda.getRadio() + " " + rueda.getSize()+ "\n") ;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Automobile automobile) {
        return this.manufacturer.compareTo(automobile.manufacturer);
    }
}
