/**
 * Extiende ComponenteVehicular, añadiendo atributos y un comportamiento específico
 * para la especialización SistemaFrenos.
 */
public class SistemaFrenos extends ComponenteVehicular {
    // Atributos específicos del Sistema de Frenos
    boolean tieneABS;
    String tipoDiscos;

    /**
     * Constructor para la clase SistemaFrenos. Llama al constructor de la clase base.
     * @param codigo Código del sistema de frenos.
     * @param fabricante Fabricante del sistema de frenos.
     * @param tieneABS Indica si tiene sistema antibloqueo (ABS).
     * @param tipoDiscos Descripción del tipo de discos (e.g., "Ventilados", "Sólidos").
     */
    public SistemaFrenos(String codigo, String fabricante, boolean tieneABS, String tipoDiscos) {
        super(codigo, fabricante);
        this.tieneABS = tieneABS;
        this.tipoDiscos = tipoDiscos;
    }

    /**
     * Sobrescribe el método de la clase base para incluir información del sistema de frenos.
     */
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Sistema ABS: " + (tieneABS ? "Sí" : "No"));
        System.out.println("Tipo de discos: " + tipoDiscos);
    }

    /**
     * Comportamiento particular: verifica el estado del sistema ABS.
     */
    public void verificarABS() {
        if (tieneABS) {
            System.out.println("Sistema ABS operativo.");
        } else {
            System.out.println("Este vehículo no tiene ABS. Frenado convencional.");
        }
    }
}