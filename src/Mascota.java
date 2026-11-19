    public class Mascota {
        private String especie;
        private String nombre;
        private int edad;


        public Mascota(String especie, String nombre, int edad){
        this.edad = edad;
        this.nombre = nombre;
        this.especie = especie;


        }

        public void mostrarFicha(){

        System.out.println("Mascota: " + " edad: " + edad + " | nombre: " + nombre +  " | especie : " + especie);

        }

        public int cumplirAnios(){

         edad= edad + 1;
         return edad;
        }
    }