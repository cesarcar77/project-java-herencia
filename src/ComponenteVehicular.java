/**
 * Clase base que define los atributos y comportamientos comunes
 * para todos los componentes vehiculares.
 */
public class ComponenteVehicular {
    // Atributos base
    String codigo;
    String fabricante;

    /**
     * Constructor para inicializar un ComponenteVehicular.
     * @param codigo El código único del componente.
     * @param fabricante El fabricante del componente.
     */
    public ComponenteVehicular(String codigo, String fabricante) {
        this.codigo = codigo;
        this.fabricante = fabricante;
    }

    /**
     * Muestra la información básica del componente.
     */
    public void mostrarInformacion() {
        System.out.println("Código: " + codigo);
        System.out.println("Fabricante: " + fabricante);
    }
}