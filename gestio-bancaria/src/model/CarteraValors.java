package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa una cartera de valors dins el sistema de gestió bancària.
 * <p>
 * Una {@code CarteraValors} és un {@link Producte} bancari compost per un conjunt
 * de {@link Valor valors} (títols borsaris). La relació amb {@code Valor} és de
 * composició: els valors no tenen sentit fora de la cartera i el seu cicle de vida
 * depèn completament d'ella.
 * </p>
 * <p>
 * Les carteres de valors només poden estar associades a {@link CompteCorrent comptes corrents},
 * segons les especificacions de l'enunciat. La relació amb el compte és d'agregació (0..*).
 * </p>
 * <p>
 * Una cartera ha de contenir com a mínim un valor (cardinalitat 1..*).
 * </p>
 *
 * @author Alumne
 * @version 1.0
 * @see Producte
 * @see Valor
 * @see CompteCorrent
 */
public class CarteraValors extends Producte {

    /** Llista de valors que componen la cartera. */
    private List<Valor> valors;

    /**
     * Constructor de la classe CarteraValors.
     * Inicialitza la llista de valors com una llista buida.
     */
    public CarteraValors() {
        super();
        this.valors = new ArrayList<>();
    }

    /**
     * Retorna la llista de valors de la cartera.
     *
     * @return la llista de valors
     */
    public List<Valor> getValors() {
        return valors;
    }

    /**
     * Estableix la llista de valors de la cartera.
     *
     * @param valors la nova llista de valors
     */
    public void setValors(List<Valor> valors) {
        this.valors = valors;
    }

    /**
     * Afegeix un valor a la cartera.
     *
     * @param valor el valor (títol borsari) a afegir
     * @see Valor
     */
    public void afegirValor(Valor valor) {
        this.valors.add(valor);
    }

    /**
     * Elimina un valor de la cartera.
     *
     * @param valor el valor a eliminar
     * @see Valor
     */
    public void eliminarValor(Valor valor) {
        this.valors.remove(valor);
    }

    /**
     * Calcula el valor total de la cartera sumant el valor de tots els títols.
     * <p>
     * Per cada {@link Valor}, el càlcul és: nombre de títols × preu de cotització.
     * El valor total de la cartera és la suma de tots aquests imports.
     * </p>
     *
     * @return el valor total de la cartera en euros
     * @see Valor
     */
    public double valorTotal() {
        // Implementació pendent
        return 0.0;
    }
}
