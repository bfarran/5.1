package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe abstracta que representa un compte bancari genèric dins el sistema de gestió bancària.
 * <p>
 * {@code Compte} és un {@link Producte} bancari que modela els atributs i operacions
 * comuns a tots els tipus de comptes: número de compte, data d'obertura, saldo,
 * tipus d'interès i la llista de clients titulars.
 * </p>
 * <p>
 * Hi ha dos subtipus de comptes:
 * </p>
 * <ul>
 *   <li>{@link CompteCorrent}: compte amb targetes de crèdit, fons i carteres associats.</li>
 *   <li>{@link CompteTermini}: compte amb una durada fixada en mesos.</li>
 * </ul>
 * <p>
 * La relació amb {@link Client} és una associació bidireccional N:M: un compte
 * pot tenir múltiples titulars i un client pot tenir múltiples comptes.
 * </p>
 *
 * @author Alumne
 * @version 1.0
 * @see Producte
 * @see CompteCorrent
 * @see CompteTermini
 * @see Client
 */
public abstract class Compte extends Producte {

    /** Número identificador únic del compte bancari. */
    private String numeroCompte;

    /** Data d'obertura del compte. */
    private LocalDate dataObertura;

    /** Saldo actual del compte en euros. */
    private double saldo;

    /** Tipus d'interès anual aplicat al compte (en percentatge). */
    private double tipusInteres;

    /** Llista de clients titulars del compte. */
    private List<Client> clients;

    /**
     * Constructor de la classe Compte amb tots els paràmetres.
     * Inicialitza la llista de clients com una llista buida.
     *
     * @param numeroCompte el número identificador del compte
     * @param dataObertura la data d'obertura del compte
     * @param saldo        el saldo inicial del compte
     * @param tipusInteres el tipus d'interès anual (en percentatge)
     */
    public Compte(String numeroCompte, LocalDate dataObertura, double saldo, double tipusInteres) {
        super();
        this.numeroCompte = numeroCompte;
        this.dataObertura = dataObertura;
        this.saldo = saldo;
        this.tipusInteres = tipusInteres;
        this.clients = new ArrayList<>();
    }

    /**
     * Retorna el número de compte.
     *
     * @return el número de compte
     */
    public String getNumeroCompte() {
        return numeroCompte;
    }

    /**
     * Estableix el número de compte.
     *
     * @param numeroCompte el nou número de compte
     */
    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    /**
     * Retorna la data d'obertura del compte.
     *
     * @return la data d'obertura
     */
    public LocalDate getDataObertura() {
        return dataObertura;
    }

    /**
     * Estableix la data d'obertura del compte.
     *
     * @param dataObertura la nova data d'obertura
     */
    public void setDataObertura(LocalDate dataObertura) {
        this.dataObertura = dataObertura;
    }

    /**
     * Retorna el saldo actual del compte.
     *
     * @return el saldo en euros
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Estableix el saldo del compte.
     *
     * @param saldo el nou saldo del compte
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Retorna el tipus d'interès del compte.
     *
     * @return el tipus d'interès en percentatge
     */
    public double getTipusInteres() {
        return tipusInteres;
    }

    /**
     * Estableix el tipus d'interès del compte.
     *
     * @param tipusInteres el nou tipus d'interès en percentatge
     */
    public void setTipusInteres(double tipusInteres) {
        this.tipusInteres = tipusInteres;
    }

    /**
     * Retorna la llista de clients titulars del compte.
     *
     * @return la llista de clients
     */
    public List<Client> getClients() {
        return clients;
    }

    /**
     * Estableix la llista de clients titulars del compte.
     *
     * @param clients la nova llista de clients
     */
    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    /**
     * Afegeix un client com a titular del compte.
     *
     * @param client el client a afegir com a titular
     * @see Client
     */
    public void afegirClient(Client client) {
        this.clients.add(client);
    }

    /**
     * Elimina un client de la llista de titulars del compte.
     *
     * @param client el client a eliminar
     * @see Client
     */
    public void eliminarClient(Client client) {
        this.clients.remove(client);
    }

    /**
     * Realitza un ingrés al compte, augmentant el saldo.
     *
     * @param quantitat la quantitat a ingressar (ha de ser positiva)
     */
    public void ingressar(double quantitat) {
        // Implementació pendent
    }

    /**
     * Realitza una retirada del compte, disminuint el saldo.
     *
     * @param quantitat la quantitat a retirar (ha de ser positiva i menor o igual al saldo)
     */
    public void retirar(double quantitat) {
        // Implementació pendent
    }

    /**
     * Consulta i retorna el saldo actual del compte.
     *
     * @return el saldo actual del compte en euros
     */
    public double consultarSaldo() {
        return this.saldo;
    }
}
