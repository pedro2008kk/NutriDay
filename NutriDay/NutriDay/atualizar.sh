#!/bin/bash
#código de automação para atualizar automaticamente quando haver alteração no código do app enquanto está conectado via depuração USB
cd ~/ProjetosAndroid/NutriDay || exit

echo "Observando alterações no NutriDay..."

inotifywait -m -e close_write app/src/main/res/layout/activity_main.xml |
while read -r diretorio evento arquivo; do
    echo "Alteração detectada! Atualizando aplicativo..."

    ./gradlew installDebug

    if [ $? -eq 0 ]; then
        echo "NutriDay atualizado!"
    else
        echo "Erro na atualização. Confira o terminal."
    fi
done
