public class Main {
        public static void main(String[] args) {
            // Crear objeto persona
            Persona persona = new Persona();
    
            // Establecer valores usando setters
            persona.setEdad(20);
            persona.setNombre("Juan");
            persona.setTelefono("+56923456789");
    
            // Mostrar valores usando getters
            System.out.println("Edad: " + persona.getEdad());
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Telefono: " + persona.getTelefono());
        }
    }
