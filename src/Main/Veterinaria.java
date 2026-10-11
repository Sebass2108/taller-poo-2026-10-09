package Main;

public class Veterinaria {
    public static void main(String[] args) {
        Mascota[] pacientes = new Mascota[4];
        pacientes[0] = new Mascota("Luna", "Perro", 28.5, 9);
        pacientes[1] = new Mascota("Michi", "Gato", 4.2, 3);
        pacientes[2] = new Mascota("Rocky", "Perro", 12.0, 5);
        pacientes[3] = new Mascota("Pepa", "Conejo", 2.1, 1);

        int total = 0;
        for (int i = 0; i < pacientes.length; i++) {
            System.out.println(pacientes[i].descripcion()
            + " -> Consulta:" + pacientes[i].valorConsulta());
            total = total + pacientes[i].valorConsulta();
        }
        System.out.println("Total recaudado:" + total);

        pacientes[1].setPeso(-3);
        System.out.println(pacientes[1].descripcion());
    }
}
