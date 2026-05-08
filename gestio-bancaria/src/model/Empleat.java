package model;

/**
 * Classe que representa un empleat del banc dins el sistema de gestió bancària.
 * <p>
 * Un {@code Empleat} és una {@link Persona} que treballa en una {@link Sucursal}
 * del banc. Hereta els atributs comuns de {@link Persona} (DNI, nom, adreça, telèfon)
 * i afegeix la referència a la sucursal on està assignat.
 * </p>
 * <p>
 * La relació entre empleat i sucursal és d'agregació: l'empleat pot ser
 * traslladat a una altra sucursal sense que això impliqui la seva eliminació.
 * </p>
 *
 * @author Alumne
 * @version 1.0
 * @see Persona
 * @see Sucursal
 */
public class Empleat extends Persona {

    /** Sucursal on treballa l'empleat. */
    private Sucursal sucursal;

    /**
     * Constructor de la classe Empleat amb tots els paràmetres.
     *
     * @param dni      el DNI de l'empleat
     * @param nom      el nom complet de l'empleat
     * @param adreca   l'adreça postal de l'empleat
     * @param telefon  el número de telèfon de l'empleat
     * @param sucursal la sucursal on treballa l'empleat
     */
    public Empleat(String dni, String nom, String adreca, String telefon, Sucursal sucursal) {
        super(dni, nom, adreca, telefon);
        this.sucursal = sucursal;
    }

    /**
     * Retorna la sucursal on treballa l'empleat.
     *
     * @return la sucursal de l'empleat
     */
    public Sucursal getSucursal() {
        return sucursal;
    }

    /**
     * Estableix la sucursal on treballa l'empleat.
     *
     * @param sucursal la nova sucursal de l'empleat
     */
    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
}
