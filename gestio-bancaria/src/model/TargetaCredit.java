package model;

import java.time.LocalDate;

/**
 * Classe que representa una targeta de crèdit dins el sistema de gestió bancària.
 * <p>
 * Una {@code TargetaCredit} és un instrument de pagament associat a un
 * {@link CompteCorrent}. Cada targeta té un tipus (Visa, MasterCard, etc.),
 * un número únic, el nom del titular i una data de caducitat.
 * </p>
 * <p>
 * La relació amb {@link CompteCorrent} és d'agregació: la targeta existeix
 * independentment del compte (pot ser cancel·lada sense tancar el compte),
 * i un compte corrent pot tenir zero o més targetes associades.
 * </p>
 *
 * @author Alumne
 * @version 1.0
 * @see CompteCorrent
 */
public class TargetaCredit {

    /** Tipus de targeta (Visa, MasterCard, American Express, etc.). */
    private String tipus;

    /** Número únic de la targeta de crèdit. */
    private String numero;

    /** Nom del titular de la targeta. */
    private String titular;

    /** Data de caducitat de la targeta. */
    private LocalDate dataCaducitat;

    /**
     * Constructor de la classe TargetaCredit amb tots els paràmetres.
     *
     * @param tipus         el tipus de targeta (Visa, MasterCard, etc.)
     * @param numero        el número únic de la targeta
     * @param titular       el nom del titular de la targeta
     * @param dataCaducitat la data de caducitat de la targeta
     */
    public TargetaCredit(String tipus, String numero, String titular, LocalDate dataCaducitat) {
        this.tipus = tipus;
        this.numero = numero;
        this.titular = titular;
        this.dataCaducitat = dataCaducitat;
    }

    /**
     * Retorna el tipus de targeta.
     *
     * @return el tipus de targeta (Visa, MasterCard, etc.)
     */
    public String getTipus() {
        return tipus;
    }

    /**
     * Estableix el tipus de targeta.
     *
     * @param tipus el nou tipus de targeta
     */
    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    /**
     * Retorna el número de la targeta.
     *
     * @return el número de la targeta
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Estableix el número de la targeta.
     *
     * @param numero el nou número de la targeta
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Retorna el nom del titular de la targeta.
     *
     * @return el nom del titular
     */
    public String getTitular() {
        return titular;
    }

    /**
     * Estableix el nom del titular de la targeta.
     *
     * @param titular el nou nom del titular
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }

    /**
     * Retorna la data de caducitat de la targeta.
     *
     * @return la data de caducitat
     */
    public LocalDate getDataCaducitat() {
        return dataCaducitat;
    }

    /**
     * Estableix la data de caducitat de la targeta.
     *
     * @param dataCaducitat la nova data de caducitat
     */
    public void setDataCaducitat(LocalDate dataCaducitat) {
        this.dataCaducitat = dataCaducitat;
    }
}
