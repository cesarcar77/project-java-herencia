/**
 * Extiende ComponenteVehicular, añadiendo atributos y un comportamiento específico
 * para la especialización Motor.
 */
public class Motor extends ComponenteVehicular {
    // Atributos específicos del Motor
    int cilindros;
    int potencia;

    /**
     * Constructor para la clase Motor. Llama al constructor de la clase base.
     * @param codigo Código del motor.
     * @param fabricante Fabricante del motor.
     * @param cilindros Número de cilindros.
     * @param potencia Potencia en HP.
     */
    public Motor(String codigo, String fabricante, int cilindros, int potencia) {
        super(codigo, fabricante);
        this.cilindros = cilindros;
        this.potencia = potencia;
    }

    /**
     * Sobrescribe el método de la clase base para incluir información del motor.
     */
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Llama al método de la clase padre
        System.out.println("Cilindros: " + cilindros);
        System.out.println("Potencia: " + potencia + " HP");
    }

    /**
     * Comportamiento particular: simula el encendido del motor.
     */
    public void encenderMotor() {
        System.out.println("Motor encendido con " + cilindros + " cilindros y " + potencia + " HP.");
    }
}