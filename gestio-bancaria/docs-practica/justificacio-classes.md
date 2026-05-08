# Justificació de Classes i Relacions

## 1. Justificació de cada classe

### 1.1 `Persona` (classe abstracta)
**Per què existeix:** S'ha identificat que `Client` i `Empleat` comparteixen els mateixos atributs bàsics (DNI, nom, adreça i telèfon). Seguint el principi DRY (*Don't Repeat Yourself*) i el mecanisme d'herència de la POO, s'ha creat `Persona` com a superclasse abstracta per factoritzar aquests atributs comuns. No es pot instanciar directament perquè no té sentit crear una "persona" genèrica dins el sistema bancari.

### 1.2 `Client`
**Per què existeix:** Representa la persona física o jurídica que contracta productes bancaris. Hereta de `Persona` i afegeix la relació amb els comptes. És una entitat fonamental del domini bancari, ja que sense clients no hi ha negoci.

### 1.3 `Empleat`
**Per què existeix:** Representa el treballador del banc. Hereta de `Persona` i afegeix la relació amb la sucursal on treballa. L'enunciat explicita que els empleats tenen DNI, nom, adreça, telèfon i sucursal, cosa que justifica una classe pròpia.

### 1.4 `Sucursal`
**Per què existeix:** Representa una oficina física del banc. L'enunciat indica que cada sucursal té un identificador i una adreça, i que els empleats hi treballen. Modela la unitat organitzativa del banc.

### 1.5 `Producte` (classe abstracta)
**Per què existeix:** L'enunciat parla de "productes associats als clients": comptes, fons d'inversió i carteres de valors. `Producte` és la generalització abstracta d'aquests tres conceptes. Permet tractar-los polimòrficament si cal.

### 1.6 `Compte` (classe abstracta)
**Per què existeix:** L'enunciat defineix atributs comuns per a tots els comptes (número, data d'obertura, saldo, tipus d'interès, clients). Com que hi ha "dos tipus de comptes" (corrents i a termini), `Compte` és abstracta i defineix el comportament comú. Hereta de `Producte`.

### 1.7 `CompteCorrent`
**Per què existeix:** És un dels dos subtipus de compte. La seva particularitat és que pot tenir targetes de crèdit, fons d'inversió i carteres de valors associats. Hereta de `Compte`.

### 1.8 `CompteTermini`
**Per què existeix:** És l'altre subtipus de compte. La seva particularitat és que té un nombre de mesos durant els quals estarà obert. Hereta de `Compte`.

### 1.9 `TargetaCredit`
**Per què existeix:** L'enunciat la defineix com una entitat amb atributs propis (tipus, número, titular, data de caducitat) associada als comptes corrents. Té prou entitat i atributs per ser una classe independent.

### 1.10 `FonsInversio`
**Per què existeix:** És un producte bancari amb atributs propis (nom, import, rendibilitat, dates). L'enunciat el diferencia clarament dels comptes i les carteres. Hereta de `Producte`.

### 1.11 `CarteraValors`
**Per què existeix:** És un producte bancari que està "compost" per valors. Aquesta composició justifica una classe pròpia que gestiona la col·lecció de valors. Hereta de `Producte`.

### 1.12 `Valor`
**Per què existeix:** L'enunciat descriu els valors amb atributs propis (nom, nombre de títols, preu de cotització). Són les unitats que componen una cartera de valors.

### 1.13 `Banc`
**Per què existeix:** És l'entitat principal i arrel del sistema. Gestiona les sucursals i els clients. Representa el punt d'entrada del model de domini.

---

## 2. Justificació de cada relació

### 2.1 Relacions d'HERÈNCIA (Generalització/Especialització)

#### `Persona` → `Client`, `Empleat`
- **Tipus:** Herència (generalització)
- **Justificació:** L'enunciat diu "De clients i empleats: DNI, nom, adreça i telèfon", cosa que indica que comparteixen els mateixos atributs. La factorització en una superclasse abstracta `Persona` evita la duplicació de codi i permet el polimorfisme.
- **Cardinalitat:** No aplica (és una relació "és un")

#### `Producte` → `Compte`, `FonsInversio`, `CarteraValors`
- **Tipus:** Herència (generalització)
- **Justificació:** L'enunciat parla genèricament de "productes associats als clients". Comptes, fons i carteres són tots productes bancaris, cosa que justifica una superclasse comuna.
- **Cardinalitat:** No aplica (és una relació "és un")

#### `Compte` → `CompteCorrent`, `CompteTermini`
- **Tipus:** Herència (generalització)
- **Justificació:** L'enunciat explícitament diu "Hi ha dos tipus de comptes: corrents i a termini". Comparteixen atributs comuns (número, saldo, interès...) però tenen característiques diferenciades.
- **Cardinalitat:** No aplica (és una relació "és un")

### 2.2 Relacions d'AGREGACIÓ

#### `Banc` ◇—— `Sucursal` (1 a 1..*)
- **Tipus:** Agregació
- **Justificació:** Un banc "té" sucursals, però les sucursals poden existir conceptualment de manera independent (podrien tancar-se o transferir-se). La sucursal no deixa d'existir si el banc es reorganitza; pot reassignar-se.
- **Cardinalitat:** Un banc té **1 o més** sucursals (1..*), ja que un banc sense cap oficina no tindria sentit operatiu. Cada sucursal pertany a **1** banc.

#### `Sucursal` ◇—— `Empleat` (1 a 1..*)
- **Tipus:** Agregació
- **Justificació:** Una sucursal "té" empleats que hi treballen. L'empleat existeix independentment de la sucursal (pot ser traslladat a una altra). L'enunciat diu "en quina sucursal treballen", indicant una relació de pertinença no exclusiva.
- **Cardinalitat:** Una sucursal té **1 o més** empleats (1..*), ja que una oficina necessita mínim un treballador. Cada empleat treballa a **1** sucursal.

#### `CompteCorrent` ◇—— `TargetaCredit` (1 a 0..*)
- **Tipus:** Agregació
- **Justificació:** Un compte corrent "pot tenir" targetes de crèdit. La targeta existeix independentment del compte (té el seu propi número, titular, data de caducitat). Es pot cancel·lar la targeta sense tancar el compte.
- **Cardinalitat:** Un compte corrent pot tenir **0 o més** targetes (0..*), ja que és opcional. Cada targeta pertany a **1** compte corrent.

#### `CompteCorrent` ◇—— `FonsInversio` (1 a 0..*)
- **Tipus:** Agregació
- **Justificació:** "Només els comptes corrents poden tenir la resta de productes associats (fons i carteres)". El fons d'inversió és un producte independent que s'associa al compte corrent.
- **Cardinalitat:** Un compte corrent pot tenir **0 o més** fons (0..*), ja que és opcional. Cada fons està associat a **1** compte corrent.

#### `CompteCorrent` ◇—— `CarteraValors` (1 a 0..*)
- **Tipus:** Agregació
- **Justificació:** Mateixa justificació que els fons d'inversió. La cartera de valors és un producte independent associat al compte corrent.
- **Cardinalitat:** Un compte corrent pot tenir **0 o més** carteres (0..*), ja que és opcional. Cada cartera està associada a **1** compte corrent.

### 2.3 Relacions de COMPOSICIÓ

#### `CarteraValors` ◆—— `Valor` (1 a 1..*)
- **Tipus:** Composició
- **Justificació:** L'enunciat diu que "les carteres de valors estan **compostes** per valors". El verb "compost" indica explícitament composició. Els valors no tenen sentit fora de la seva cartera: si s'elimina la cartera, s'eliminen els seus valors. El cicle de vida del `Valor` depèn completament de la `CarteraValors`.
- **Cardinalitat:** Una cartera té **1 o més** valors (1..*), ja que una cartera buida no té sentit. Cada valor pertany a **1** cartera (exclusivitat).

### 2.4 Relacions d'ASSOCIACIÓ

#### `Client` —— `Compte` (1..* a 1..*)
- **Tipus:** Associació bidireccional
- **Justificació:** L'enunciat indica que els comptes tenen "dades dels clients", cosa que implica que un compte pot tenir múltiples titulars (compte conjunt) i un client pot tenir múltiples comptes. No és ni composició ni agregació perquè tant client com compte tenen existència independent.
- **Cardinalitat:** Un client pot tenir **1 o més** comptes (1..*), ja que un client sense cap compte no seria client. Un compte pot tenir **1 o més** titulars (1..*).

---

## 3. Resum de relacions amb cardinalitats

| Relació | Tipus | Cardinalitat | Notació UML |
|---|---|---|---|
| Persona → Client | Herència | — | `Persona <|-- Client` |
| Persona → Empleat | Herència | — | `Persona <|-- Empleat` |
| Producte → Compte | Herència | — | `Producte <|-- Compte` |
| Producte → FonsInversio | Herència | — | `Producte <|-- FonsInversio` |
| Producte → CarteraValors | Herència | — | `Producte <|-- CarteraValors` |
| Compte → CompteCorrent | Herència | — | `Compte <|-- CompteCorrent` |
| Compte → CompteTermini | Herència | — | `Compte <|-- CompteTermini` |
| Banc — Sucursal | Agregació | 1 a 1..* | `Banc o-- "1..*" Sucursal` |
| Sucursal — Empleat | Agregació | 1 a 1..* | `Sucursal o-- "1..*" Empleat` |
| Client — Compte | Associació | 1..* a 1..* | `Client "1..*" -- "1..*" Compte` |
| CompteCorrent — TargetaCredit | Agregació | 1 a 0..* | `CompteCorrent o-- "0..*" TargetaCredit` |
| CompteCorrent — FonsInversio | Agregació | 1 a 0..* | `CompteCorrent o-- "0..*" FonsInversio` |
| CompteCorrent — CarteraValors | Agregació | 1 a 0..* | `CompteCorrent o-- "0..*" CarteraValors` |
| CarteraValors — Valor | Composició | 1 a 1..* | `CarteraValors *-- "1..*" Valor` |

---

## 4. Relacions que NO apareixen al diagrama

### 4.1 Dependència (<<use>>)
**Definició:** Una relació on una classe utilitza puntualment una altra (per exemple, com a paràmetre d'un mètode o variable local) sense mantenir-la com a atribut.

**Per què no apareix:** En el nostre model, totes les relacions entre classes impliquen una referència persistent (atribut). No hi ha cap cas on una classe utilitzi temporalment una altra només dins un mètode sense mantenir-ne referència. Per exemple, `Banc` manté una llista de `Sucursal` (agregació), no la utilitza puntualment.

### 4.2 Interfície (<<interface>>)
**Definició:** Un contracte que defineix un conjunt de mètodes que una classe ha d'implementar, sense proporcionar implementació.

**Per què no apareix:** L'enunciat no descriu cap comportament que hagi de ser implementat obligatòriament per classes no relacionades jeràrquicament. No hi ha cap "contracte abstracte" que diferents jerarquies de classes hagin de complir. Les classes abstractes (`Persona`, `Producte`, `Compte`) ja cobreixen la necessitat de definir comportament comú dins cada jerarquia.

**Nota:** En una implementació real, podria ser útil crear interfícies com `Operable` (per a operacions de saldo) o `Serializable` (per a persistència), però l'enunciat no ho requereix.

---

## 5. Diagrama de relacions (resum visual textual)

```
                    ┌──────────┐
                    │  Persona │ (abstracta)
                    │  {A}     │
                    └────┬─────┘
                    ┌────┴─────┐
              ┌─────┴──┐  ┌───┴────┐
              │ Client  │  │Empleat │
              └────┬────┘  └───┬────┘
                   │           │
              1..* │      1..* │
                   │           │
              1..* │       1   │
              ┌────┴────┐ ┌───┴──────┐    1   ┌──────┐
              │ Compte  │ │ Sucursal │◇───────│ Banc │
              │  {A}    │ └──────────┘   1..* └──────┘
              └────┬────┘
         ┌─────────┴──────────┐
    ┌────┴────────┐    ┌──────┴──────┐
    │CompteCorrent│    │CompteTermini│
    └──┬──┬──┬────┘    └─────────────┘
       │  │  │
  0..* │  │  │ 0..*
 ┌─────┴┐ │ ┌┴────────────┐
 │Targeta│ │ │CarteraValors│
 │Credit │ │ └──────┬──────┘
 └───────┘ │        │ 1..*
      0..* │   ┌────┴───┐
    ┌──────┴┐  │ Valor  │
    │ Fons  │  └────────┘
    │Inversio│
    └────────┘

    ┌──────────┐
    │ Producte │ (abstracta) - superclasse de Compte, FonsInversio, CarteraValors
    │   {A}    │
    └──────────┘
```
