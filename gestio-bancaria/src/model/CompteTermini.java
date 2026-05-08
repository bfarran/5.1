package model;

import java.time.LocalDate;

/**
 * Classe que representa un compte a termini dins el sistema de gestió bancària.
 * <p>
 * Un {@code CompteTermini} és un subtipus de {@link Compte} que té una durada
 * fixada en mesos. A diferència del {@link CompteCorrent}, no pot tenir
 * targetes de crèdit, fons d'inversió ni carteres de valors associats.
 * </p>
 * <p>
 * El compte a termini està pensat per a estalvi a llarg termini, on el client
 * diposita una quantitat durant un nombre determinat de mesos i rep interessos
 * al venciment del termini.
 * </p>
 *
 * @author Alumne
 * @version 1.0
 * @see Compte
 * @see CompteCorrent
 */
public class CompteTermini extends Compte {

    /** Nombre de mesos durant els quals el compte estarà obert. */
    private int nombreMesos;

    /**
     * Constructor de la classe CompteTermini amb tots els paràmetres.
     *
     * @param numeroCompte el número identificador del compte
     * @param dataObertura la data d'obertura del compte
     * @param saldo        el saldo inicial del compte
     * @param tipusInteres el tipus d'interès anual (en percentatge)
     * @param nombreMesos  el nombre de mesos de durada del termini
     */
    public CompteTermini(String numeroCompte, LocalDate dataObertura, double saldo,
                         double tipusInteres, int nombreMesos) {
        super(numeroCompte, dataObertura, saldo, tipusInteres);
        this.nombreMesos = nombreMesos;
    }

    /**
     * Retorna el nombre de mesos de durada del termini.
     *
     * @return el nombre de mesos
     */
    public int getNombreMesos() {
        return nombreMesos;
    }

    /**
     * Estableix el nombre de mesos de durada del termini.
     *
     * @param nombreMesos el nou nombre de mesos
     */
    public void setNombreMesos(int nombreMesos) {
        this.nombreMesos = nombreMesos;
    }

    /**
     * Calcula els interessos generats pel compte a termini.
     * <p>
     * El càlcul es basa en el saldo, el tipus d'interès i el nombre de mesos.
     * </p>
     *
     * @return l'import dels interessos generats
     */
    public double calcularInteressos() {
        // Implementació pendent
        return 0.0;
    }
}
