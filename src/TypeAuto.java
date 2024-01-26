public enum TypeAuto {
    SEDAN("Sedan", 4, "Normal car"),
    STATION_WAGON("Station wagon", 2, "Big car"),
    CONVERTIBLE("Convertible", 2, "Big car"),
    FURGON("Furgon", 8, "Big car"),
    COUPE("Coupe", 2, "Normal car"),
    SPORTS_CAR("Sports car", 2, "Big car"),
    HATCH_BACK("Hatchback", 4, "Normal car"),
    PICKUP("Pickup", 4, "Normal car");

    private final String nombre;
    private final Integer number_gates;
    private final String description;

    TypeAuto(String nombre, Integer number_gates, String description){
        this.nombre = nombre;
        this.number_gates = number_gates;
        this.description = description;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getNumber_gates() {
        return number_gates;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "TypeAuto{" +
                "nombre='" + nombre + '\'' +
                ", number_gates=" + number_gates +
                ", description='" + description + '\'' +
                '}';
    }
}
