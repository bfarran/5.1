package model;

/**
 * Classe que representa un valor (títol borsari) dins el sistema de gestió bancària.
 * <p>
 * Un {@code Valor} és un títol borsari que forma part d'una {@link CarteraValors}.
 * Cada valor té un nom (empresa o actiu), un nombre de títols posseïts i un preu
 * de cotització actual.
 * </p>
 * <p>
 * La relació amb {@link CarteraValors} és de composició: el valor no existeix
 * fora de la seva cartera. Si s'elimina la cartera, s'eliminen tots els seus valors.
 * El cicle de vida del {@code Valor} depèn completament de la {@code CarteraValors}.
 * </p>
 *
 * @author Alumne
 * @version 1.0
 * @see CarteraValors
 */
public class Valor {

    /** Nom del valor (empresa o actiu borsari). */
    private String nom;

    /** Nombre de títols posseïts d'aquest valor. */
    private int nombreTitols;

    /** Preu actual de cotització del valor (en euros per títol). */
    private double preuCotitzacio;

    /**
     * Constructor de la classe Valor amb tots els paràmetres.
     *
     * @param nom            el nom del valor (empresa o actiu)
     * @param nombreTitols   el nombre de títols posseïts
     * @param preuCotitzacio el preu de cotització per títol (en euros)
     */
    public Valor(String nom, int nombreTitols, double preuCotitzacio) {
        this.nom = nom;
        this.nombreTitols = nombreTitols;
        this.preuCotitzacio = preuCotitzacio;
    }

    /**
     * Retorna el nom del valor.
     *
     * @return el nom del valor
     */
    public String getNom() {
        return nom;
    }

    /**
     * Estableix el nom del valor.
     *
     * @param nom el nou nom del valor
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Retorna el nombre de títols posseïts.
     *
     * @return el nombre de títols
     */
    public int getNombreTitols() {
        return nombreTitols;
    }

    /**
     * Estableix el nombre de títols posseïts.
     *
     * @param nombreTitols el nou nombre de títols
     */
    public void setNombreTitols(int nombreTitols) {
        this.nombreTitols = nombreTitols;
    }

    /**
     * Retorna el preu de cotització del valor.
     *
     * @return el preu de cotització en euros
     */
    public double getPreuCotitzacio() {
        return preuCotitzacio;
    }

    /**
     * Estableix el preu de cotització del valor.
     *
     * @param preuCotitzacio el nou preu de cotització en euros
     */
    public void setPreuCotitzacio(double preuCotitzacio) {
        this.preuCotitzacio = preuCotitzacio;
    }
}
