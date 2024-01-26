public class EjemploAutomobile {
    public static void main(String[] args) {

        Persona propietarioSubaru = new Persona("Juan", "Perez");
        Motor motor = new Motor(TypeMotor.GASOIL, 250);
        Automobile subaru = new Automobile("Subaru");
        subaru.setMotor(motor);
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.RED);
        subaru.setPropietario(propietarioSubaru);
        Rueda[] ruedas = new Rueda[4];
        for (int i = 0; i < ruedas.length; i++)
            subaru.addRueda(new Rueda("Michelin", 15, 17.5));

        //subaru.setRuedas(ruedas);

        Persona propietarioMazda = new Persona("Pedro", "Lopez");
        Motor motorMazada = new Motor(TypeMotor.DIESEL, 200);
        Automobile mazda = new Automobile("Mazda", motorMazada);
        mazda.setEstanque(new Estanque(50));
        mazda.setTypeAuto(TypeAuto.SEDAN);
        mazda.setPropietario(propietarioMazda);
        for (int i = 0; i < ruedas.length; i++) {
            mazda.addRueda(new Rueda("Michelin", 15, 17.5));
        }
        Persona propietarioNissan = new Persona("Maria", "Garcia");
        Automobile nissan = new Automobile("Nissan", new Motor(TypeMotor.GASOIL, 250), new Estanque(50));
        nissan.setTypeAuto(TypeAuto.COUPE);
        nissan.setColor(Color.BLUE);
        nissan.setPropietario(propietarioNissan);
        nissan.addRueda(new Rueda("Michelin", 15, 17.5))
                .addRueda(new Rueda("Michelin", 15, 17.5))
                .addRueda(new Rueda("Michelin", 15, 17.5))
                .addRueda(new Rueda("Michelin", 15, 17.5));
        System.out.println(subaru.getDetalles());
        System.out.println(mazda.getDetalles());
        System.out.println(nissan.getDetalles());
        System.out.println(subaru.compareTo(mazda));
    }
}
