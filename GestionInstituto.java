package Persona;

public class GestionInstituto {
    public static void main(String[] args) {
        // 1. Instanciamos un Docente
        Docente profeJuan = new Docente("Juan Pérez", 42, "Arquitectura de Software");

        // 2. Instanciamos Estudiantes
        Estudiante alumno1 = new Estudiante("Sofía García", 21, "Sistemas");
        Estudiante alumno2 = new Estudiante("Lucas Torres", 23, "Sistemas");

        // --- DEMOSTRACIÓN DE INFORMACIÓN ---

        System.out.println("=== REPORTE DEL INSTITUTO ===");

        // Información del Docente
        profeJuan.saludar(); // Método heredado
        profeJuan.dictarClase(); // Método propio

        System.out.println("--------------------------------------------");

        // Información de los Estudiantes
        // Usamos los getters para demostrar el encapsulamiento
        System.out.println("Alumno registrado: " + alumno1.getNombre());
        alumno1.estudiar();

        System.out.println(); // Espacio en blanco

        System.out.println("Alumno registrado: " + alumno2.getNombre());
        alumno2.saludar(); // Método sobrescrito en Estudiante
        alumno2.estudiar();

        System.out.println("============================================");
    }
}
