#!/bin/bash

# =============================================================================
# Script per generar la documentació JavaDoc del projecte de Gestió Bancària
# =============================================================================
# Autor: Alumne
# Data: Maig 2026
# Descripció: Genera la documentació JavaDoc en format HTML a la carpeta
#             'documentacio/' a partir del codi font del paquet 'model'.
# =============================================================================

# Colors per als missatges
GREEN='\033[0;32m'
RED='\033[0;31m'
YELLOW='\033[1;33m'
NC='\033[0m' # Sense color

echo "======================================"
echo " Generació de JavaDoc - Gestió Bancària"
echo "======================================"
echo ""

# Crear la carpeta de documentació si no existeix
if [ ! -d "documentacio" ]; then
    echo -e "${YELLOW}Creant la carpeta 'documentacio/'...${NC}"
    mkdir -p documentacio
    echo -e "${GREEN}Carpeta creada correctament.${NC}"
else
    echo -e "${YELLOW}La carpeta 'documentacio/' ja existeix. Es sobreescriurà el contingut.${NC}"
fi

echo ""
echo "Generant documentació JavaDoc..."
echo ""

# Executar javadoc amb codificació UTF-8
javadoc \
    -d documentacio \
    -sourcepath src \
    -subpackages model \
    -encoding UTF-8 \
    -charset UTF-8 \
    -docencoding UTF-8 \
    -author \
    -version \
    -private \
    -windowtitle "Gestió Bancària - Documentació API" \
    -doctitle "Aplicació de Gestió Bancària" \
    -header "Gestió Bancària" \
    -footer "Pràctica DOO - Curs 2025-2026" \
    -quiet

# Comprovar si s'ha generat correctament
if [ $? -eq 0 ]; then
    echo ""
    echo -e "${GREEN}======================================"
    echo " ✓ JavaDoc generat correctament!"
    echo "======================================"
    echo ""
    echo " Ruta del fitxer principal:"
    echo " → documentacio/index.html"
    echo ""
    echo " Per obrir-lo al navegador:"
    echo "   open documentacio/index.html      (macOS)"
    echo "   xdg-open documentacio/index.html  (Linux)"
    echo "   start documentacio/index.html     (Windows)"
    echo -e "======================================${NC}"
else
    echo ""
    echo -e "${RED}======================================"
    echo " ✗ Error en generar el JavaDoc!"
    echo " Comprova que el JDK estigui instal·lat"
    echo " i que el codi font no tingui errors."
    echo -e "======================================${NC}"
    exit 1
fi
