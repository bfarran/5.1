package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa un compte corrent dins el sistema de gestió bancària.
 * <p>
 * Un {@code CompteCorrent} és un subtipus de {@link Compte} que permet tenir
 * associats altres productes bancaris: {@link TargetaCredit targetes de crèdit},
 * {@link FonsInversio fons d'inversió} i {@link CarteraValors carteres de valors}.
 * </p>
 * <p>
 * Segons l'enunciat, "només els comptes corrents poden tenir la resta de productes
 * associats", cosa que diferencia aquesta classe del {@link CompteTermini}.
 * </p>
 * <p>
 * Les relacions amb targetes, fons i carteres són d'agregació (0..*): el compte
 * corrent pot existir sense cap d'aquests productes, i els productes tenen
 * existència independent del compte.
 * </p>
 *
 * @author Alumne
 * @version 1.0
 * @see Compte
 * @see TargetaCredit
 * @see FonsInversio
 * @see CarteraValors
 */
public class CompteCorrent extends Compte {

    /** Llista de targetes de crèdit associades al compte corrent. */
    private List<TargetaCredit> targetes;

    /** Llista de fons d'inversió associats al compte corrent. */
    private List<FonsInversio> fonsInversio;

    /** Llista de carteres de valors associades al compte corrent. */
    private List<CarteraValors> carteres;

    /**
     * Constructor de la classe CompteCorrent amb tots els paràmetres.
     * Inicialitza les llistes de targetes, fons i carteres com a llistes buides.
     *
     * @param numeroCompte el número identificador del compte
     * @param dataObertura la data d'obertura del compte
     * @param saldo        el saldo inicial del compte
     * @param tipusInteres el tipus d'interès anual (en percentatge)
     */
    public CompteCorrent(String numeroCompte, LocalDate dataObertura, double saldo, double tipusInteres) {
        super(numeroCompte, dataObertura, saldo, tipusInteres);
        this.targetes = new ArrayList<>();
        this.fonsInversio = new ArrayList<>();
        this.carteres = new ArrayList<>();
    }

    /**
     * Retorna la llista de targetes de crèdit associades.
     *
     * @return la llista de targetes de crèdit
     */
    public List<TargetaCredit> getTargetes() {
        return targetes;
    }

    /**
     * Estableix la llista de targetes de crèdit.
     *
     * @param targetes la nova llista de targetes
     */
    public void setTargetes(List<TargetaCredit> targetes) {
        this.targetes = targetes;
    }

    /**
     * Retorna la llista de fons d'inversió associats.
     *
     * @return la llista de fons d'inversió
     */
    public List<FonsInversio> getFonsInversio() {
        return fonsInversio;
    }

    /**
     * Estableix la llista de fons d'inversió.
     *
     * @param fonsInversio la nova llista de fons d'inversió
     */
    public void setFonsInversio(List<FonsInversio> fonsInversio) {
        this.fonsInversio = fonsInversio;
    }

    /**
     * Retorna la llista de carteres de valors associades.
     *
     * @return la llista de carteres de valors
     */
    public List<CarteraValors> getCarteres() {
        return carteres;
    }

    /**
     * Estableix la llista de carteres de valors.
     *
     * @param carteres la nova llista de carteres
     */
    public void setCarteres(List<CarteraValors> carteres) {
        this.carteres = carteres;
    }

    /**
     * Afegeix una targeta de crèdit al compte corrent.
     *
     * @param targeta la targeta de crèdit a afegir
     * @see TargetaCredit
     */
    public void afegirTargeta(TargetaCredit targeta) {
        this.targetes.add(targeta);
    }

    /**
     * Elimina una targeta de crèdit del compte corrent.
     *
     * @param targeta la targeta de crèdit a eliminar
     * @see TargetaCredit
     */
    public void eliminarTargeta(TargetaCredit targeta) {
        this.targetes.remove(targeta);
    }

    /**
     * Afegeix un fons d'inversió al compte corrent.
     *
     * @param fons el fons d'inversió a afegir
     * @see FonsInversio
     */
    public void afegirFons(FonsInversio fons) {
        this.fonsInversio.add(fons);
    }

    /**
     * Elimina un fons d'inversió del compte corrent.
     *
     * @param fons el fons d'inversió a eliminar
     * @see FonsInversio
     */
    public void eliminarFons(FonsInversio fons) {
        this.fonsInversio.remove(fons);
    }

    /**
     * Afegeix una cartera de valors al compte corrent.
     *
     * @param cartera la cartera de valors a afegir
     * @see CarteraValors
     */
    public void afegirCartera(CarteraValors cartera) {
        this.carteres.add(cartera);
    }

    /**
     * Elimina una cartera de valors del compte corrent.
     *
     * @param cartera la cartera de valors a eliminar
     * @see CarteraValors
     */
    public void eliminarCartera(CarteraValors cartera) {
        this.carteres.remove(cartera);
    }
}
