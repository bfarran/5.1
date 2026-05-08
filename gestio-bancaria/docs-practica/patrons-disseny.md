# Patrons de Disseny

## 1. Què són els patrons de disseny?

### 1.1 Definició

Els **patrons de disseny** (*design patterns*) són solucions generals i reutilitzables a problemes comuns que apareixen repetidament en el disseny de programari orientat a objectes. No són codi concret ni biblioteques que es puguin instal·lar, sinó **descripcions o plantilles** que indiquen com resoldre un problema de disseny en un context particular.

### 1.2 Origen

El concepte de patrons de disseny en programari va ser popularitzat pel llibre **"Design Patterns: Elements of Reusable Object-Oriented Software"** (1994), escrit per Erich Gamma, Richard Helm, Ralph Johnson i John Vlissides, coneguts col·lectivament com el **Gang of Four (GoF)**. En aquest llibre, els autors van catalogar **23 patrons de disseny** classificats en tres categories:

- **Creacionals**: gestionen la creació d'objectes.
- **Estructurals**: gestionen la composició de classes i objectes.
- **De comportament**: gestionen la comunicació entre objectes.

### 1.3 Context històric

La idea dels patrons va ser inspirada pel treball de l'arquitecte **Christopher Alexander**, que als anys 70 va proposar un "llenguatge de patrons" per al disseny arquitectònic urbà. El GoF va adaptar aquesta idea al món del programari, creant un vocabulari comú que els desenvolupadors poden utilitzar per comunicar solucions de disseny de manera precisa i eficient.

---

## 2. Objectiu dels patrons de disseny

Els patrons de disseny persegueixen els objectius següents:

1. **Solucions reutilitzables**: proporcionar respostes provades a problemes recurrents, evitant "reinventar la roda" cada vegada.

2. **Vocabulari comú**: establir un llenguatge compartit entre desenvolupadors. Quan algú diu "aquí fem servir un Singleton" o "apliquem l'Strategy", tot l'equip entén immediatament l'estructura i el propòsit del disseny.

3. **Bones pràctiques**: encapsular l'experiència i el coneixement acumulat de desenvolupadors experts en solucions elegants i eficients.

4. **Flexibilitat i mantenibilitat**: promoure dissenys que siguin fàcils de modificar, estendre i mantenir a llarg termini.

5. **Desacoblament**: reduir les dependències entre components del sistema, facilitant els canvis i les proves.

---

## 3. Avantatges i inconvenients

### 3.1 Avantatges

| Avantatge | Descripció |
|---|---|
| **Reutilització** | Les solucions estan provades i validades per la comunitat. No cal reinventar solucions a problemes ja resolts. |
| **Mantenibilitat** | El codi que segueix patrons és més fàcil de mantenir, ja que l'estructura és previsible i ben organitzada. |
| **Comunicació** | Els patrons proporcionen un vocabulari comú entre desenvolupadors. Dir "Singleton" és més ràpid que explicar tota l'estructura. |
| **Bones pràctiques provades** | Representen l'experiència acumulada de molts desenvolupadors durant dècades. Són solucions que han demostrat la seva eficàcia. |
| **Flexibilitat** | Faciliten l'extensió del codi sense modificar l'estructura existent (principi Open/Closed). |
| **Desacoblament** | Promouen la separació de responsabilitats i redueixen les dependències entre classes. |
| **Documentació implícita** | Un codi que segueix patrons coneguts és autodocumentat en gran mesura. |

### 3.2 Inconvenients

| Inconvenient | Descripció |
|---|---|
| **Complexitat afegida** | Aplicar patrons pot afegir capes d'abstracció innecessàries en projectes petits o senzills. |
| **Corba d'aprenentatge** | Cal temps per entendre i saber aplicar correctament cada patró. Un mal ús pot empitjorar el disseny. |
| **Sobreenginyeria** | El risc d'aplicar patrons "per si de cas" sense que el problema ho justifiqui. Això complica el codi sense benefici real. |
| **Rigidesa prematura** | Aplicar un patró massa aviat pot limitar l'evolució natural del disseny quan els requisits encara no estan clars. |
| **Dificultat de refactorització** | Un cop un patró està implementat, canviar-lo per un altre pot requerir canvis significatius al codi. |

---

## 4. Patrons més usats actualment

### 4.1 Patrons Creacionals

#### Singleton
- **Descripció**: Garanteix que una classe tingui **una única instància** i proporciona un punt d'accés global a aquesta instància.
- **Exemple d'ús real**: Gestors de connexions a base de dades, gestors de configuració, loggers. En una aplicació web, el pool de connexions a la BD és habitualment un Singleton.
- **Estructura clau**: Constructor privat + mètode estàtic `getInstance()`.

#### Factory Method
- **Descripció**: Defineix una interfície per a la creació d'objectes, però **delega a les subclasses** la decisió de quina classe concreta instanciar.
- **Exemple d'ús real**: Frameworks UI que creen botons segons el sistema operatiu (WindowsButton, MacButton). `Calendar.getInstance()` de Java.
- **Estructura clau**: Mètode abstracte a la superclasse que les subclasses sobreescriuen.

#### Abstract Factory
- **Descripció**: Proporciona una interfície per crear **famílies d'objectes relacionats** sense especificar les classes concretes.
- **Exemple d'ús real**: Toolkits gràfics (Swing, GTK) que creen conjunts coherents de widgets per a cada plataforma.
- **Estructura clau**: Fàbrica abstracta amb mètodes per crear cada tipus d'objecte de la família.

#### Builder
- **Descripció**: Separa la **construcció d'un objecte complex** de la seva representació, permetent el mateix procés de construcció per crear diferents representacions.
- **Exemple d'ús real**: `StringBuilder` de Java, construcció d'objectes HTTP Request, configuració de documents PDF.
- **Estructura clau**: Classe Builder amb mètodes encadenables (fluent API) i un mètode `build()` final.

### 4.2 Patrons Estructurals

#### Decorator
- **Descripció**: Afegeix **responsabilitats addicionals** a un objecte de manera dinàmica, sense modificar la classe original.
- **Exemple d'ús real**: `BufferedInputStream` que decora `FileInputStream` a Java. Middlewares en frameworks web.
- **Estructura clau**: Classe decoradora que implementa la mateixa interfície que l'objecte decorat i l'envolta.

#### Adapter
- **Descripció**: Converteix la **interfície d'una classe** en una altra interfície que el client espera, permetent que classes incompatibles treballin juntes.
- **Exemple d'ús real**: Adaptadors de corrent (110V a 220V), `Arrays.asList()` que adapta un array a una List.
- **Estructura clau**: Classe adaptadora que tradueix les crides d'una interfície a una altra.

### 4.3 Patrons de Comportament

#### Observer
- **Descripció**: Defineix una dependència **un-a-molts** entre objectes, de manera que quan un objecte canvia d'estat, tots els seus dependents en són notificats automàticament.
- **Exemple d'ús real**: Sistemes d'events en interfícies gràfiques (listeners), notificacions push, publicació/subscripció en sistemes distribuïts.
- **Estructura clau**: Subject (observable) que manté una llista d'observers i els notifica els canvis.

#### Strategy
- **Descripció**: Defineix una **família d'algorismes**, els encapsula per separat i els fa intercanviables. Permet variar l'algorisme independentment dels clients que l'utilitzen.
- **Exemple d'ús real**: Algorismes d'ordenació, càlcul d'impostos segons el país, estratègies de validació.
- **Estructura clau**: Interfície d'estratègia amb múltiples implementacions concretes.

### 4.4 Patrons Arquitectònics

#### MVC (Model-View-Controller)
- **Descripció**: Separa l'aplicació en tres capes: **Model** (dades i lògica de negoci), **Vista** (presentació) i **Controlador** (gestió d'events i comunicació).
- **Exemple d'ús real**: Spring MVC, Ruby on Rails, Django, la majoria de frameworks web moderns.
- **Estructura clau**: Tres capes independents amb responsabilitats clarament definides.

#### Repository
- **Descripció**: Encapsula la **lògica d'accés a dades** proporcionant una interfície de col·lecció per accedir als objectes del domini.
- **Exemple d'ús real**: Spring Data JPA, capa d'accés a dades en aplicacions empresarials.
- **Estructura clau**: Interfície amb mètodes CRUD que oculta els detalls de persistència.

#### Dependency Injection (DI)
- **Descripció**: Les **dependències** d'un objecte li són proporcionades externament en lloc de ser creades internament, invertint el control de la creació.
- **Exemple d'ús real**: Spring Framework, Angular, Dagger (Android). Facilita enormement les proves unitàries.
- **Estructura clau**: Constructor o setters que reben les dependències com a paràmetres.

---

## 5. Aplicació de patrons al projecte de gestió bancària

### 5.1 Singleton per a `Banc`

**Justificació**: En el nostre sistema, el `Banc` és l'entitat principal i arrel. En un escenari real, només hauria d'existir una única instància del banc dins l'aplicació. Aplicar el patró Singleton garantiria que no es creïn múltiples instàncies inconsistents.

```java
public class Banc {
    private static Banc instancia;
    
    private Banc(String nom) {
        this.nom = nom;
        this.sucursals = new ArrayList<>();
        this.clients = new ArrayList<>();
    }
    
    public static Banc getInstance(String nom) {
        if (instancia == null) {
            instancia = new Banc(nom);
        }
        return instancia;
    }
}
```

### 5.2 Factory Method per a la creació de productes

**Justificació**: El sistema necessita crear diferents tipus de productes (CompteCorrent, CompteTermini, FonsInversio, CarteraValors). Un Factory Method permetria centralitzar la creació i afegir nous tipus de productes sense modificar el codi existent.

```java
public abstract class ProducteFactory {
    public abstract Producte crearProducte(String tipus, Map<String, Object> parametres);
}

public class CompteFactory extends ProducteFactory {
    @Override
    public Producte crearProducte(String tipus, Map<String, Object> parametres) {
        if ("corrent".equals(tipus)) {
            return new CompteCorrent(...);
        } else if ("termini".equals(tipus)) {
            return new CompteTermini(...);
        }
        return null;
    }
}
```

### 5.3 Strategy per al càlcul d'interessos

**Justificació**: Els comptes corrents i els comptes a termini calculen els interessos de manera diferent. Encapsular l'algorisme de càlcul en una estratègia permetria canviar-lo dinàmicament o afegir nous tipus de càlcul sense modificar les classes de comptes.

```java
public interface EstrategiaInteres {
    double calcularInteres(double saldo, double tipusInteres, int mesos);
}

public class InteresSimple implements EstrategiaInteres {
    @Override
    public double calcularInteres(double saldo, double tipusInteres, int mesos) {
        return saldo * (tipusInteres / 100) * (mesos / 12.0);
    }
}

public class InteresCompost implements EstrategiaInteres {
    @Override
    public double calcularInteres(double saldo, double tipusInteres, int mesos) {
        return saldo * Math.pow(1 + (tipusInteres / 100) / 12, mesos) - saldo;
    }
}
```

### 5.4 Observer per a notificacions de moviments

**Justificació**: En un sistema bancari real, quan es produeix un moviment en un compte (ingrés, retirada, transferència), caldria notificar diversos sistemes: el client (SMS, email), el sistema d'auditoria, el sistema de detecció de frau, etc. El patró Observer permetria desacoblar el compte dels sistemes de notificació.

```java
public interface ObservadorCompte {
    void notificarMoviment(String numeroCompte, String tipus, double import);
}

// El Compte seria el Subject que notifica els observers
```

### 5.5 Resum de patrons aplicables

| Patró | On s'aplicaria | Benefici principal |
|---|---|---|
| Singleton | `Banc` | Garantir una única instància del banc |
| Factory Method | Creació de `Producte` | Centralitzar i flexibilitzar la creació de productes |
| Strategy | Càlcul d'interessos | Intercanviar algorismes de càlcul dinàmicament |
| Observer | Moviments de `Compte` | Desacoblar notificacions dels moviments |
| Builder | Creació de `CompteCorrent` | Simplificar la construcció d'objectes amb molts paràmetres |
| Repository | Accés a dades de `Client` | Encapsular la persistència de dades |

---

## 6. Conclusió

Els patrons de disseny són eines fonamentals per a qualsevol desenvolupador de programari orientat a objectes. Tot i que el nostre projecte de gestió bancària no els implementa explícitament (per mantenir la senzillesa acadèmica), la seva estructura ja reflecteix principis que els patrons formalitzen: herència per a la reutilització, composició per a la flexibilitat, i abstracció per al desacoblament.

L'important és conèixer els patrons, entendre quan són apropiats i, sobretot, **no forçar-ne l'ús** quan el problema no ho requereix. Com diu el principi KISS (*Keep It Simple, Stupid*): la solució més senzilla que funcioni és sovint la millor.
