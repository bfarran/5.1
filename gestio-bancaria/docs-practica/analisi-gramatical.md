# Anàlisi Gramatical - Mètode Booch

## 1. Enunciat amb paraules clau classificades

A continuació es presenta l'enunciat original amb les paraules clau identificades i classificades segons el mètode de Grady Booch:

> El **banc** [NOM COMÚ → classe] **gestiona** [VERB D'ACCIÓ → mètode] **productes** [NOM COMÚ → classe] **associats** [VERB DE POSSESSIÓ → relació] als **clients** [NOM COMÚ → classe]: **comptes bancaris** [NOM COMÚ → classe], **fons d'inversió** [NOM COMÚ → classe] i **carteres de valors** [NOM COMÚ → classe].
>
> Els **comptes** [NOM COMÚ → classe] **tenen** [VERB DE POSSESSIÓ → atributs/composició]: **número de compte** [ADJECTIU/NOM → atribut], **data d'obertura** [ADJECTIU/NOM → atribut], **saldo** [NOM → atribut], **tipus d'interès** [ADJECTIU/NOM → atribut] i **dades dels clients** [NOM → relació].
>
> **Hi ha** [VERB D'EXISTÈNCIA → herència] **dos tipus** de comptes: **corrents** [ADJECTIU → subclasse] i **a termini** [ADJECTIU → subclasse].
>
> Els **comptes corrents** [NOM COMÚ → classe] **poden tenir** [VERB DE POSSESSIÓ → agregació] **targetes de crèdit** [NOM COMÚ → classe] **associades** [VERB DE POSSESSIÓ → relació].
>
> **Només** els **comptes corrents** **poden tenir** [VERB DE POSSESSIÓ → agregació] la resta de **productes** associats (**fons** i **carteres**).
>
> Els **comptes a termini** [NOM COMÚ → classe] **tenen** [VERB DE POSSESSIÓ → atribut] el **nombre de mesos** [NOM → atribut] que estarà oberta.
>
> De **clients** [NOM COMÚ → classe] i **empleats** [NOM COMÚ → classe]: **DNI** [NOM → atribut], **nom** [NOM → atribut], **adreça** [NOM → atribut] i **telèfon** [NOM → atribut].
>
> Dels **empleats**: en quina **sucursal** [NOM COMÚ → classe] **treballen** [VERB DE POSSESSIÓ → relació].
>
> Cada **sucursal** **té** [VERB DE POSSESSIÓ → atributs] **identificador** [NOM → atribut] i **adreça** [NOM → atribut].
>
> Els **fons d'inversió** [NOM COMÚ → classe]: **nom** [NOM → atribut], **import** [NOM → atribut], **rendibilitat** [NOM → atribut], **data d'obertura** [NOM → atribut] i **venciment** [NOM → atribut].
>
> Les **carteres de valors** [NOM COMÚ → classe] **estan compostes** [VERB DE POSSESSIÓ → composició] per **valors** [NOM COMÚ → classe] (**nom** [NOM → atribut], **nombre de títols** [NOM → atribut], **preu de cotització** [NOM → atribut]).
>
> Les **targetes de crèdit** [NOM COMÚ → classe]: **tipus** [NOM → atribut] (Visa, MasterCard...), **número** [NOM → atribut], **titular** [NOM → atribut] i **data de caducitat** [NOM → atribut].

---

## 2. Classificació de paraules clau

### 2.1 Noms comuns → Classes candidates

| # | Paraula clau | Classe candidata | Justificació |
|---|---|---|---|
| 1 | Banc | `Banc` | Entitat principal del sistema que gestiona tot |
| 2 | Producte | `Producte` | Concepte genèric que agrupa comptes, fons i carteres |
| 3 | Client | `Client` | Persona que contracta productes bancaris |
| 4 | Empleat | `Empleat` | Persona que treballa al banc |
| 5 | Compte bancari | `Compte` | Producte bancari amb saldo i operacions |
| 6 | Compte corrent | `CompteCorrent` | Subtipus de compte amb targetes i productes associats |
| 7 | Compte a termini | `CompteTermini` | Subtipus de compte amb durada fixada en mesos |
| 8 | Targeta de crèdit | `TargetaCredit` | Element associat als comptes corrents |
| 9 | Fons d'inversió | `FonsInversio` | Producte d'inversió amb rendibilitat |
| 10 | Cartera de valors | `CarteraValors` | Producte compost per diversos valors |
| 11 | Valor | `Valor` | Element que forma part d'una cartera de valors |
| 12 | Sucursal | `Sucursal` | Oficina on treballen els empleats |
| 13 | Persona | `Persona` | Superclasse abstracta comuna a Client i Empleat |

### 2.2 Verbs d'acció → Mètodes

| Verb | Mètode candidat | Classe |
|---|---|---|
| Gestiona | `gestionar()` | `Banc` |
| Ingressar | `ingressar(double)` | `Compte` |
| Retirar | `retirar(double)` | `Compte` |
| Consultar saldo | `consultarSaldo()` | `Compte` |
| Afegir targeta | `afegirTargeta(TargetaCredit)` | `CompteCorrent` |
| Afegir fons | `afegirFons(FonsInversio)` | `CompteCorrent` |
| Afegir cartera | `afegirCartera(CarteraValors)` | `CompteCorrent` |
| Calcular interessos | `calcularInteressos()` | `CompteTermini` |
| Afegir valor | `afegirValor(Valor)` | `CarteraValors` |
| Eliminar valor | `eliminarValor(Valor)` | `CarteraValors` |
| Calcular valor total | `valorTotal()` | `CarteraValors` |
| Afegir sucursal | `afegirSucursal(Sucursal)` | `Banc` |
| Cercar client | `cercarClient(String)` | `Banc` |
| Afegir empleat | `afegirEmpleat(Empleat)` | `Sucursal` |

### 2.3 Verbs d'existència → Herència

| Expressió | Relació |
|---|---|
| "Hi ha dos tipus de comptes: corrents i a termini" | `Compte` → `CompteCorrent`, `CompteTermini` |
| "De clients i empleats: DNI, nom..." (atributs comuns) | `Persona` → `Client`, `Empleat` |
| Productes: comptes, fons, carteres | `Producte` → `Compte`, `FonsInversio`, `CarteraValors` |

### 2.4 Verbs de possessió → Composició / Agregació

| Expressió | Relació |
|---|---|
| "El banc gestiona [...] associats als clients" | `Banc` ◇— `Sucursal` (agregació) |
| "Els comptes corrents poden tenir targetes" | `CompteCorrent` ◇— `TargetaCredit` (agregació) |
| "Comptes corrents poden tenir fons i carteres" | `CompteCorrent` ◇— `FonsInversio`, `CarteraValors` (agregació) |
| "Les carteres estan compostes per valors" | `CarteraValors` ◆— `Valor` (composició) |
| "En quina sucursal treballen" | `Sucursal` ◇— `Empleat` (agregació) |

### 2.5 Adjectius / Noms descriptius → Atributs

| Paraula | Atribut | Classe |
|---|---|---|
| DNI | `dni: String` | `Persona` |
| Nom | `nom: String` | `Persona`, `FonsInversio`, `Valor` |
| Adreça | `adreca: String` | `Persona`, `Sucursal` |
| Telèfon | `telefon: String` | `Persona` |
| Número de compte | `numeroCompte: String` | `Compte` |
| Data d'obertura | `dataObertura: LocalDate` | `Compte`, `FonsInversio` |
| Saldo | `saldo: double` | `Compte` |
| Tipus d'interès | `tipusInteres: double` | `Compte` |
| Nombre de mesos | `nombreMesos: int` | `CompteTermini` |
| Identificador | `identificador: String` | `Sucursal` |
| Import | `importFons: double` | `FonsInversio` |
| Rendibilitat | `rendibilitat: double` | `FonsInversio` |
| Data de venciment | `dataVenciment: LocalDate` | `FonsInversio` |
| Nombre de títols | `nombreTitols: int` | `Valor` |
| Preu de cotització | `preuCotitzacio: double` | `Valor` |
| Tipus (Visa, MC...) | `tipus: String` | `TargetaCredit` |
| Número | `numero: String` | `TargetaCredit` |
| Titular | `titular: String` | `TargetaCredit` |
| Data de caducitat | `dataCaducitat: LocalDate` | `TargetaCredit` |

---

## 3. Taula resum: Classes candidates

| Classe | Tipus | Justificació |
|---|---|---|
| `Persona` | Abstracta | Agrupa atributs comuns de Client i Empleat (DNI, nom, adreça, telèfon) |
| `Client` | Concreta | Persona que contracta productes bancaris |
| `Empleat` | Concreta | Persona que treballa en una sucursal del banc |
| `Sucursal` | Concreta | Oficina bancària amb empleats |
| `Producte` | Abstracta | Concepte genèric per a tots els productes bancaris |
| `Compte` | Abstracta | Producte bancari amb operacions de saldo (superclasse de CompteCorrent i CompteTermini) |
| `CompteCorrent` | Concreta | Compte amb targetes i productes associats |
| `CompteTermini` | Concreta | Compte amb durada fixa en mesos |
| `TargetaCredit` | Concreta | Targeta associada a un compte corrent |
| `FonsInversio` | Concreta | Producte d'inversió amb rendibilitat |
| `CarteraValors` | Concreta | Producte compost per valors borsaris |
| `Valor` | Concreta | Títol borsari dins una cartera |
| `Banc` | Concreta | Entitat principal que gestiona sucursals i clients |

---

## 4. Taula resum: Atributs per classe

| Classe | Atributs |
|---|---|
| `Persona` | `dni: String`, `nom: String`, `adreca: String`, `telefon: String` |
| `Client` | *(hereta de Persona)* + `comptes: List<Compte>` |
| `Empleat` | *(hereta de Persona)* + `sucursal: Sucursal` |
| `Sucursal` | `identificador: String`, `adreca: String`, `empleats: List<Empleat>` |
| `Producte` | *(classe abstracta sense atributs propis addicionals)* |
| `Compte` | `numeroCompte: String`, `dataObertura: LocalDate`, `saldo: double`, `tipusInteres: double`, `clients: List<Client>` |
| `CompteCorrent` | *(hereta de Compte)* + `targetes: List<TargetaCredit>`, `fonsInversio: List<FonsInversio>`, `carteres: List<CarteraValors>` |
| `CompteTermini` | *(hereta de Compte)* + `nombreMesos: int` |
| `TargetaCredit` | `tipus: String`, `numero: String`, `titular: String`, `dataCaducitat: LocalDate` |
| `FonsInversio` | `nom: String`, `importFons: double`, `rendibilitat: double`, `dataObertura: LocalDate`, `dataVenciment: LocalDate` |
| `CarteraValors` | `valors: List<Valor>` |
| `Valor` | `nom: String`, `nombreTitols: int`, `preuCotitzacio: double` |
| `Banc` | `nom: String`, `sucursals: List<Sucursal>`, `clients: List<Client>` |

---

## 5. Taula resum: Mètodes principals per classe

| Classe | Mètodes |
|---|---|
| `Persona` | Getters/Setters de tots els atributs |
| `Client` | `afegirCompte(Compte)`, `eliminarCompte(Compte)`, Getters/Setters |
| `Empleat` | Getters/Setters |
| `Sucursal` | `afegirEmpleat(Empleat)`, `eliminarEmpleat(Empleat)`, Getters/Setters |
| `Compte` | `ingressar(double)`, `retirar(double)`, `consultarSaldo()`, `afegirClient(Client)`, Getters/Setters |
| `CompteCorrent` | `afegirTargeta(TargetaCredit)`, `eliminarTargeta(TargetaCredit)`, `afegirFons(FonsInversio)`, `eliminarFons(FonsInversio)`, `afegirCartera(CarteraValors)`, `eliminarCartera(CarteraValors)` |
| `CompteTermini` | `calcularInteressos()` |
| `TargetaCredit` | Getters/Setters |
| `FonsInversio` | Getters/Setters |
| `CarteraValors` | `afegirValor(Valor)`, `eliminarValor(Valor)`, `valorTotal()` |
| `Valor` | Getters/Setters |
| `Banc` | `afegirSucursal(Sucursal)`, `eliminarSucursal(Sucursal)`, `cercarClient(String)`, `afegirClient(Client)` |
