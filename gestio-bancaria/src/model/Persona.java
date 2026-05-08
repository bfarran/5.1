package model;

/**
 * Classe abstracta que representa una persona dins el sistema bancari.
 * <p>
 * {@code Persona} és la superclasse comuna de {@link Client} i {@link Empleat},
 * i factoritza els atributs compartits per ambdues entitats: DNI, nom, adreça i telèfon.
 * Seguint el principi DRY (Don't Repeat Yourself), s'ha creat aquesta classe abstracta
 * per evitar la duplicació d'atributs i mètodes comuns entre clients i empleats del banc.
 * </p>
 * <p>
 * No es pot instanciar directament, ja que dins el sistema bancari no existeix
 * el concepte de "persona genèrica" sense un rol específic (client o empleat).
 * </p>
 *
 * @author Alumne
 * @version 1.0
 * @see Client
 * @see Empleat
 */
public abstract class Persona {

    /** Document Nacional d'Identitat de la persona. */
    private String dni;

    /** Nom complet de la persona. */
    private String nom;

    /** Adreça postal de la persona. */
    private String adreca;

    /** Número de telèfon de contacte de la persona. */
    private String telefon;

    /**
     * Constructor de la classe Persona amb tots els paràmetres.
     *
     * @param dni     el DNI de la persona
     * @param nom     el nom complet de la persona
     * @param adreca  l'adreça postal de la persona
     * @param telefon el número de telèfon de la persona
     */
    public Persona(String dni, String nom, String adreca, String telefon) {
        this.dni = dni;
        this.nom = nom;
        this.adreca = adreca;
        this.telefon = telefon;
    }

    /**
     * Retorna el DNI de la persona.
     *
     * @return el DNI de la persona
     */
    public String getDni() {
        return dni;
    }

    /**
     * Estableix el DNI de la persona.
     *
     * @param dni el nou DNI de la persona
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Retorna el nom complet de la persona.
     *
     * @return el nom de la persona
     */
    public String getNom() {
        return nom;
    }

    /**
     * Estableix el nom de la persona.
     *
     * @param nom el nou nom de la persona
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Retorna l'adreça postal de la persona.
     *
     * @return l'adreça de la persona
     */
    public String getAdreca() {
        return adreca;
    }

    /**
     * Estableix l'adreça postal de la persona.
     *
     * @param adreca la nova adreça de la persona
     */
    public void setAdreca(String adreca) {
        this.adreca = adreca;
    }

    /**
     * Retorna el telèfon de contacte de la persona.
     *
     * @return el telèfon de la persona
     */
    public String getTelefon() {
        return telefon;
    }

    /**
     * Estableix el telèfon de contacte de la persona.
     *
     * @param telefon el nou telèfon de la persona
     */
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
}
