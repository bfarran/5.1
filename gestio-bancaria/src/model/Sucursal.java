package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa una sucursal (oficina) del banc dins el sistema de gestió bancària.
 * <p>
 * Una {@code Sucursal} és una unitat organitzativa del banc que disposa d'un
 * identificador únic i una adreça física. Cada sucursal té assignats un o més
 * {@link Empleat}s que hi treballen.
 * </p>
 * <p>
 * La relació entre {@link Banc} i {@code Sucursal} és d'agregació: el banc
 * posseeix les sucursals, però aquestes tenen existència pròpia i podrien
 * ser reassignades o tancades de manera independent.
 * </p>
 *
 * @author Alumne
 * @version 1.0
 * @see Banc
 * @see Empleat
 */
public class Sucursal {

    /** Identificador únic de la sucursal. */
    private String identificador;

    /** Adreça física de la sucursal. */
    private String adreca;

    /** Llista d'empleats que treballen a la sucursal. */
    private List<Empleat> empleats;

    /**
     * Constructor de la classe Sucursal amb tots els paràmetres.
     * Inicialitza la llista d'empleats com una llista buida.
     *
     * @param identificador l'identificador únic de la sucursal
     * @param adreca        l'adreça física de la sucursal
     */
    public Sucursal(String identificador, String adreca) {
        this.identificador = identificador;
        this.adreca = adreca;
        this.empleats = new ArrayList<>();
    }

    /**
     * Retorna l'identificador de la sucursal.
     *
     * @return l'identificador de la sucursal
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * Estableix l'identificador de la sucursal.
     *
     * @param identificador el nou identificador de la sucursal
     */
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    /**
     * Retorna l'adreça de la sucursal.
     *
     * @return l'adreça de la sucursal
     */
    public String getAdreca() {
        return adreca;
    }

    /**
     * Estableix l'adreça de la sucursal.
     *
     * @param adreca la nova adreça de la sucursal
     */
    public void setAdreca(String adreca) {
        this.adreca = adreca;
    }

    /**
     * Retorna la llista d'empleats de la sucursal.
     *
     * @return la llista d'empleats
     */
    public List<Empleat> getEmpleats() {
        return empleats;
    }

    /**
     * Estableix la llista d'empleats de la sucursal.
     *
     * @param empleats la nova llista d'empleats
     */
    public void setEmpleats(List<Empleat> empleats) {
        this.empleats = empleats;
    }

    /**
     * Afegeix un empleat a la sucursal.
     *
     * @param empleat l'empleat a afegir a la sucursal
     * @see Empleat
     */
    public void afegirEmpleat(Empleat empleat) {
        this.empleats.add(empleat);
    }

    /**
     * Elimina un empleat de la sucursal.
     *
     * @param empleat l'empleat a eliminar de la sucursal
     * @see Empleat
     */
    public void eliminarEmpleat(Empleat empleat) {
        this.empleats.remove(empleat);
    }
}
