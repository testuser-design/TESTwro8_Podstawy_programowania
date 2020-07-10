# Instalacja środowiska

  W tej sekcji upewnimy się, że wszyscy mają poprawnie zainstalowane
  środowisko. W przypadku braku zainstalowanego środowiska prośba o
  wykonanie zadań [1. Instalacja JDK](#1-instalacja-jdk) oraz
  [2. Instalacja Intellij](#2-instalacaja-intellij)

   Jeśli posiadasz już obie instalacje zacznij od zadania:
   [3. Fork repozytorium](#3-fork-repozytorium)
# 1. Instalacja JDK

Podążaj za instrukcją zamieszczoną na stronie:
https://sdacademy.pl/vs-assets/uploads/2019/11/Tester-Instrukcja-Instalacji-Windows-pl.pdf
Zaczynamy od strony 33

# 2. Instalacaja IntelliJ

Podążaj za instrukcją zamieszoną na stronie:
https://sdacademy.pl/vs-assets/uploads/2019/11/Tester-Instrukcja-Instalacji-Windows-pl.pdf
Zaczynamy od strony 45

# 3. Fork repozytorium

# 4. Pobranie repozytorium

# 5. Pierwsza kompilacja

Włącz dowolny z terminali:
- terminal bezpośrednio z intelliJ - lewy dolny róg intelliJ ![Terminal
  IntelliJ](../obrazy/terminal.png)
- wiersz polecenia windows
  ![Wiersz polecenia](../obrazy/wiersz_polecenia.png)
- git bash ![Gith bash](../obrazy/git_bash.png)

Wykonaj następujące polecenia:
- cd $HOME/workspace/TESTwro8_podstawy_programowania/pierwszy-program/src/
- ls

Jeśli nie działa komenda ls, wykonaj komendę dir.

Powinien wiświetlić się następujący plik:
PierwszyProgram.java

Następnie wywołaj dwie komendy:
- javac PierwszyProgram.java
- ls

Teraz w katalogu powinny być widoczne dwa pliki:  
PierwszyProgram.class PierwszyProgram.java

Wykonaliśmy właśnie pierwszą udaną kompilację. Plik z rozszerzeniem
.class to właśnie program compiloany do bytecode.

Aby uruchomić program proszę wykonać komendę:
java PierwszyProgram

Jaki jest wynik?