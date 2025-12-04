/**
 * Extiende ComponenteVehicular, añadiendo atributos y un comportamiento específico
 * para la especialización Transmision.
 */
public class Transmision extends ComponenteVehicular {
    // Atributos específicos de la Transmisión
    String tipo;
    int marchas;

    /**
     * Constructor para la clase Transmision. Llama al constructor de la clase base.
     * @param codigo Código de la transmisión.
     * @param fabricante Fabricante de la transmisión.
     * @param tipo Tipo de transmisión (e.g., "Manual", "Automática").
     * @param marchas Número total de marchas.
     */
    public Transmision(String codigo, String fabricante, String tipo, int marchas) {
        super(codigo, fabricante);
        this.tipo = tipo;
        this.marchas = marchas;
    }

    /**
     * Sobrescribe el método de la clase base para incluir información de la transmisión.
     */
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: " + tipo);
        System.out.println("Número de marchas: " + marchas);
    }

    /**
     * Comportamiento particular: cambia la marcha si es válida.
     * @param marcha La marcha a la que se desea cambiar.
     */
    public void cambiarMarcha(int marcha) {
        if (marcha > 0 && marcha <= marchas) {
            System.out.println("Cambiando a la marcha " + marcha + "...");
        } else {
            System.out.println("Marcha inválida. Máximo " + marchas + " marchas.");
        }
    }
}