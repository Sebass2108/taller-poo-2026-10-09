package Main;

class Mascota {
    private String nombre;
    private String especie;
    private double peso;
    private int edad;

    Mascota(String nombre, String especie, double peso, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.peso = peso;
        this.edad = edad;
    }

    String getNombre() {
        return nombre;
    }
    String getEspecie() {
        return especie;
    }
    double getPeso() {
        return peso;
    }
    int getEdad() {
        return edad;
    }

    void setPeso(double nuevoPeso) {
        if (nuevoPeso <= 0) {
            System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
            System.out.println("Incorrecto:Una mascota no puede pesar " + nuevoPeso + " Kg");
            return;
        }
        this.peso = nuevoPeso;
    }
    void setEdad(int nuevaEdad) {
        if (nuevaEdad < 0) {
            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
            System.out.println("Incorrecto:Una mascota no puede tener"+ nuevaEdad + "años");
        }
    }
    int valorConsulta() {
        int valor = 35000;
        if (peso > 25) {
            valor = 55000;
            if (edad > 8) {
                valor = valor + 12000;
            }
        } else if (peso > 10) {
            valor = 45000;
        }
        return valor;
    }
    String descripcion() {
        return nombre + " ( " + especie + "," + peso + "kg" + "," + edad + " años )";
    }
}
