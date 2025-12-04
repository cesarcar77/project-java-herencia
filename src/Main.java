/**
 * Clase principal para demostrar la jerarquía de herencia y el polimorfismo.
 * Instancia cada tipo de componente y llama a sus métodos, incluyendo los heredados
 * (mostrarInformacion) y los específicos.
 */
public class Main {
    public static void main(String[] args) {
        // 1. Instanciación de componentes
        Motor motor = new Motor("M001", "Bosch", 4, 120);
        Transmision transmision = new Transmision("T001", "ZF", "Automática", 6);
        Neumatico neumatico = new Neumatico("N001", "Michelin", 17, 32.5);
        Chasis chasis = new Chasis("C001", "Toyota", "Monocasco", 250.0);
        SistemaFrenos frenos = new SistemaFrenos("F001", "Brembo", true, "Discos ventilados");

        // 2. Demostración de Motor
        System.out.println("==== MOTOR ====");
        motor.mostrarInformacion(); // Método heredado y sobrescrito
        motor.encenderMotor(); // Método particular

        // 3. Demostración de Transmisión
        System.out.println("\n==== TRANSMISIÓN ====");
        transmision.mostrarInformacion();
        transmision.cambiarMarcha(3); // Método particular

        // 4. Demostración de Neumático
        System.out.println("\n==== NEUMÁTICO ====");
        neumatico.mostrarInformacion();
        neumatico.verificarPresion(); // Método particular

        // 5. Demostración de Chasis
        System.out.println("\n==== CHASIS ====");
        chasis.mostrarInformacion();
        chasis.calcularCargaMaxima(); // Método particular

        // 6. Demostración de Sistema de Frenos
        System.out.println("\n==== SISTEMA DE FRENOS ====");
        frenos.mostrarInformacion();
        frenos.verificarABS(); // Método particular
    }
}