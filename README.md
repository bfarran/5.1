# 🏦 Pràctica DOO - Aplicació de Gestió Bancària

Projecte Java complet per a la pràctica de **Disseny Orientat a Objectes (DOO)** del Mòdul 5 - Entorns de Desenvolupament.

## 📋 Descripció

Modelatge d'un sistema de gestió bancària aplicant els principis de la Programació Orientada a Objectes: herència, polimorfisme, encapsulament, agregació i composició. El projecte inclou l'anàlisi gramatical, la justificació de classes, la implementació Java, diagrames UML i l'estudi de patrons de disseny.

## 👤 Autor

- **Nom:** B. Farran
- **Centre:** INS Mollerussa
- **Curs:** 2025-2026

## 📁 Estructura del repositori

```
5.1/
├── gestio-bancaria/
│   ├── src/model/                  ← 13 classes Java amb JavaDoc
│   │   ├── Persona.java           (abstracta)
│   │   ├── Client.java
│   │   ├── Empleat.java
│   │   ├── Sucursal.java
│   │   ├── Producte.java          (abstracta)
│   │   ├── Compte.java            (abstracta)
│   │   ├── CompteCorrent.java
│   │   ├── CompteTermini.java
│   │   ├── TargetaCredit.java
│   │   ├── FonsInversio.java
│   │   ├── CarteraValors.java
│   │   ├── Valor.java
│   │   └── Banc.java
│   ├── diagrames/                  ← 5 diagrames UML (PlantUML)
│   │   ├── diagrama-classes.puml
│   │   ├── casos-us.puml
│   │   ├── sequencia.puml
│   │   ├── comunicacio.puml
│   │   └── activitat.puml
│   ├── documentacio/               ← JavaDoc HTML generat
│   ├── docs-practica/              ← Documentació de la pràctica
│   │   ├── analisi-gramatical.md
│   │   ├── justificacio-classes.md
│   │   ├── patrons-disseny.md
│   │   └── practica-DOO-completa.html
│   ├── README.md
│   └── generar-javadoc.sh
├── imatges/                        ← Captures de pantalla
└── README.md                       ← Aquest fitxer
```

## 🛠️ Tecnologies

| Tecnologia | Ús |
|---|---|
| **Java 17+** | Implementació del model de classes |
| **JavaDoc** | Generació de documentació HTML |
| **PlantUML** | Creació de diagrames UML |
| **Markdown** | Documentació del projecte |

## 📐 Diagrama de Classes

![Diagrama de Classes](gestio-bancaria/diagrames/diagrama-classes.png)

## 🔗 Relacions del model

| Relació | Tipus | Cardinalitat |
|---|---|---|
| Persona → Client, Empleat | Herència | — |
| Producte → Compte, FonsInversio, CarteraValors | Herència | — |
| Compte → CompteCorrent, CompteTermini | Herència | — |
| Banc — Sucursal | Agregació | 1 a 1..* |
| Sucursal — Empleat | Agregació | 1 a 1..* |
| CompteCorrent — TargetaCredit | Agregació | 1 a 0..* |
| CompteCorrent — FonsInversio | Agregació | 1 a 0..* |
| CompteCorrent — CarteraValors | Agregació | 1 a 0..* |
| CarteraValors — Valor | Composició | 1 a 1..* |
| Client — Compte | Associació | 1..* a 1..* |

## ⚙️ Compilació i execució

```bash
# Compilar totes les classes
cd gestio-bancaria
mkdir -p bin
javac -d bin src/model/*.java

# Generar JavaDoc
javadoc -d documentacio -sourcepath src -subpackages model -encoding UTF-8 -charset UTF-8 -author -version
```

## 📚 Apartats de la pràctica

| # | Apartat | Document |
|---|---|---|
| 1 | Anàlisi gramatical (Mètode Booch) | [analisi-gramatical.md](gestio-bancaria/docs-practica/analisi-gramatical.md) |
| 2 | Justificació de classes i relacions | [justificacio-classes.md](gestio-bancaria/docs-practica/justificacio-classes.md) |
| 3 | Codi Java amb JavaDoc | [src/model/](gestio-bancaria/src/model/) |
| 4 | Diagrames UML (PlantUML) | [diagrames/](gestio-bancaria/diagrames/) |
| 5 | Patrons de disseny | [patrons-disseny.md](gestio-bancaria/docs-practica/patrons-disseny.md) |
| 6 | Document complet (PDF/HTML) | [practica-DOO-completa.html](gestio-bancaria/docs-practica/practica-DOO-completa.html) |

## 📄 Llicència

Projecte acadèmic amb finalitats educatives — Curs 2025-2026.
