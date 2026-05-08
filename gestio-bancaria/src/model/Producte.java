package model;

/**
 * Classe abstracta que representa un producte bancari genèric dins el sistema de gestió bancària.
 * <p>
 * {@code Producte} és la superclasse abstracta de tots els productes que el banc
 * ofereix als seus clients: {@link Compte} (comptes bancaris), {@link FonsInversio}
 * (fons d'inversió) i {@link CarteraValors} (carteres de valors).
 * </p>
 * <p>
 * Aquesta classe permet tractar tots els productes de manera polimòrfica quan
 * calgui operar amb productes bancaris de manera genèrica. No es pot instanciar
 * directament, ja que cada producte concret té les seves pròpies característiques.
 * </p>
 *
 * @author Alumne
 * @version 1.0
 * @see Compte
 * @see FonsInversio
 * @see CarteraValors
 */
public abstract class Producte {

    /**
     * Constructor per defecte de la classe Producte.
     * Cridat pels constructors de les subclasses.
     */
    public Producte() {
        // Constructor buit - les subclasses definiran els seus propis atributs
    }
}
