package model;

import java.time.LocalDate;

/**
 * Classe que representa un fons d'inversió dins el sistema de gestió bancària.
 * <p>
 * Un {@code FonsInversio} és un {@link Producte} bancari que permet als clients
 * invertir diners amb l'objectiu d'obtenir rendibilitat. Cada fons té un nom,
 * un import invertit, una rendibilitat esperada, i dates d'obertura i venciment.
 * </p>
 * <p>
 * Els fons d'inversió només poden estar associats a {@link CompteCorrent comptes corrents},
 * segons les especificacions de l'enunciat. La relació és d'agregació (0..*):
 * el fons existeix independentment del compte.
 * </p>
 *
 * @author Alumne
 * @version 1.0
 * @see Producte
 * @see CompteCorrent
 */
public class FonsInversio extends Producte {

    /** Nom identificatiu del fons d'inversió. */
    private String nom;

    /** Import invertit en el fons (en euros). */
    private double importFons;

    /** Rendibilitat esperada del fons (en percentatge). */
    private double rendibilitat;

    /** Data d'obertura del fons d'inversió. */
    private LocalDate dataObertura;

    /** Data de venciment del fons d'inversió. */
    private LocalDate dataVenciment;

    /**
     * Constructor de la classe FonsInversio amb tots els paràmetres.
     *
     * @param nom           el nom del fons d'inversió
     * @param importFons    l'import invertit en el fons
     * @param rendibilitat  la rendibilitat esperada (en percentatge)
     * @param dataObertura  la data d'obertura del fons
     * @param dataVenciment la data de venciment del fons
     */
    public FonsInversio(String nom, double importFons, double rendibilitat,
                        LocalDate dataObertura, LocalDate dataVenciment) {
        super();
        this.nom = nom;
        this.importFons = importFons;
        this.rendibilitat = rendibilitat;
        this.dataObertura = dataObertura;
        this.dataVenciment = dataVenciment;
    }

    /**
     * Retorna el nom del fons d'inversió.
     *
     * @return el nom del fons
     */
    public String getNom() {
        return nom;
    }

    /**
     * Estableix el nom del fons d'inversió.
     *
     * @param nom el nou nom del fons
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Retorna l'import invertit en el fons.
     *
     * @return l'import en euros
     */
    public double getImportFons() {
        return importFons;
    }

    /**
     * Estableix l'import invertit en el fons.
     *
     * @param importFons el nou import en euros
     */
    public void setImportFons(double importFons) {
        this.importFons = importFons;
    }

    /**
     * Retorna la rendibilitat esperada del fons.
     *
     * @return la rendibilitat en percentatge
     */
    public double getRendibilitat() {
        return rendibilitat;
    }

    /**
     * Estableix la rendibilitat esperada del fons.
     *
     * @param rendibilitat la nova rendibilitat en percentatge
     */
    public void setRendibilitat(double rendibilitat) {
        this.rendibilitat = rendibilitat;
    }

    /**
     * Retorna la data d'obertura del fons.
     *
     * @return la data d'obertura
     */
    public LocalDate getDataObertura() {
        return dataObertura;
    }

    /**
     * Estableix la data d'obertura del fons.
     *
     * @param dataObertura la nova data d'obertura
     */
    public void setDataObertura(LocalDate dataObertura) {
        this.dataObertura = dataObertura;
    }

    /**
     * Retorna la data de venciment del fons.
     *
     * @return la data de venciment
     */
    public LocalDate getDataVenciment() {
        return dataVenciment;
    }

    /**
     * Estableix la data de venciment del fons.
     *
     * @param dataVenciment la nova data de venciment
     */
    public void setDataVenciment(LocalDate dataVenciment) {
        this.dataVenciment = dataVenciment;
    }
}
