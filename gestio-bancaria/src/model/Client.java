package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa un client del banc dins el sistema de gestió bancària.
 * <p>
 * Un {@code Client} és una {@link Persona} que contracta productes bancaris.
 * Hereta els atributs comuns de {@link Persona} (DNI, nom, adreça, telèfon)
 * i afegeix la relació amb els comptes bancaris que posseeix.
 * </p>
 * <p>
 * Un client pot tenir un o més comptes bancaris (corrents o a termini),
 * i un compte pot tenir múltiples titulars (relació N:M amb {@link Compte}).
 * </p>
 *
 * @author Alumne
 * @version 1.0
 * @see Persona
 * @see Compte
 * @see CompteCorrent
 * @see CompteTermini
 */
public class Client extends Persona {

    /** Llista de comptes bancaris associats al client. */
    private List<Compte> comptes;

    /**
     * Constructor de la classe Client amb tots els paràmetres.
     * Inicialitza la llista de comptes com una llista buida.
     *
     * @param dni     el DNI del client
     * @param nom     el nom complet del client
     * @param adreca  l'adreça postal del client
     * @param telefon el número de telèfon del client
     */
    public Client(String dni, String nom, String adreca, String telefon) {
        super(dni, nom, adreca, telefon);
        this.comptes = new ArrayList<>();
    }

    /**
     * Retorna la llista de comptes bancaris del client.
     *
     * @return la llista de comptes del client
     */
    public List<Compte> getComptes() {
        return comptes;
    }

    /**
     * Estableix la llista de comptes bancaris del client.
     *
     * @param comptes la nova llista de comptes
     */
    public void setComptes(List<Compte> comptes) {
        this.comptes = comptes;
    }

    /**
     * Afegeix un compte bancari a la llista de comptes del client.
     *
     * @param compte el compte a afegir
     * @see Compte
     */
    public void afegirCompte(Compte compte) {
        this.comptes.add(compte);
    }

    /**
     * Elimina un compte bancari de la llista de comptes del client.
     *
     * @param compte el compte a eliminar
     * @see Compte
     */
    public void eliminarCompte(Compte compte) {
        this.comptes.remove(compte);
    }
}
