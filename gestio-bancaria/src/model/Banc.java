package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa el banc dins el sistema de gestió bancària.
 * <p>
 * {@code Banc} és l'entitat principal i arrel del sistema. Gestiona les
 * {@link Sucursal sucursals} i els {@link Client clients} del banc.
 * Actua com a punt d'entrada del model de domini.
 * </p>
 * <p>
 * La relació amb {@link Sucursal} és d'agregació (1..*): el banc posseeix
 * les sucursals, però aquestes tenen existència pròpia. La relació amb
 * {@link Client} permet al banc mantenir un registre de tots els seus clients.
 * </p>
 *
 * @author Alumne
 * @version 1.0
 * @see Sucursal
 * @see Client
 */
public class Banc {

    /** Nom del banc. */
    private String nom;

    /** Llista de sucursals del banc. */
    private List<Sucursal> sucursals;

    /** Llista de clients del banc. */
    private List<Client> clients;

    /**
     * Constructor de la classe Banc amb el nom.
     * Inicialitza les llistes de sucursals i clients com a llistes buides.
     *
     * @param nom el nom del banc
     */
    public Banc(String nom) {
        this.nom = nom;
        this.sucursals = new ArrayList<>();
        this.clients = new ArrayList<>();
    }

    /**
     * Retorna el nom del banc.
     *
     * @return el nom del banc
     */
    public String getNom() {
        return nom;
    }

    /**
     * Estableix el nom del banc.
     *
     * @param nom el nou nom del banc
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Retorna la llista de sucursals del banc.
     *
     * @return la llista de sucursals
     */
    public List<Sucursal> getSucursals() {
        return sucursals;
    }

    /**
     * Estableix la llista de sucursals del banc.
     *
     * @param sucursals la nova llista de sucursals
     */
    public void setSucursals(List<Sucursal> sucursals) {
        this.sucursals = sucursals;
    }

    /**
     * Retorna la llista de clients del banc.
     *
     * @return la llista de clients
     */
    public List<Client> getClients() {
        return clients;
    }

    /**
     * Estableix la llista de clients del banc.
     *
     * @param clients la nova llista de clients
     */
    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    /**
     * Afegeix una sucursal al banc.
     *
     * @param sucursal la sucursal a afegir
     * @see Sucursal
     */
    public void afegirSucursal(Sucursal sucursal) {
        this.sucursals.add(sucursal);
    }

    /**
     * Elimina una sucursal del banc.
     *
     * @param sucursal la sucursal a eliminar
     * @see Sucursal
     */
    public void eliminarSucursal(Sucursal sucursal) {
        this.sucursals.remove(sucursal);
    }

    /**
     * Afegeix un client al banc.
     *
     * @param client el client a afegir
     * @see Client
     */
    public void afegirClient(Client client) {
        this.clients.add(client);
    }

    /**
     * Elimina un client del banc.
     *
     * @param client el client a eliminar
     * @see Client
     */
    public void eliminarClient(Client client) {
        this.clients.remove(client);
    }

    /**
     * Cerca un client pel seu DNI dins la llista de clients del banc.
     *
     * @param dni el DNI del client a cercar
     * @return el {@link Client} trobat, o {@code null} si no existeix cap client amb aquest DNI
     * @see Client
     */
    public Client cercarClient(String dni) {
        // Implementació pendent
        return null;
    }
}
