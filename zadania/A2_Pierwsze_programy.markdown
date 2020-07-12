# 1. Pierwszy program live (5 min)

1. Stwórz projekt java - zrobimy wspólnie
2. Razem stworzymy pierwszą klasę i pustą metodę main
3. Razem dodamy również wyświetlanie lini: "Witaj programie" przy pomocy
   System.out.println
4. Samodzielnie każdy uczestnik wykona pierwszy program, który wypisze
   na ekran tekst "Witaj" oraz imię i nazwisko uczestnika/uczestniczki
5. Po wyświetleniu tekstu z punktu 4. proszę wyświetlić "Koniec"
6. Każdy uczestnik uruchomi program obiema znanymi metodami

# 2. Pobieranie parametru (10 min)

1.  Utworzymy kolejny program w tym samym projekcie
2.  Napiszemy razem prosty program z metodą main
3.  Zmodyfikujemy program tak aby wyświetlić pierwszy argument przy
    pomocy Stystem.out.println
4.  Następnie dodamy obsługę drugiego parametru
5.  Wyświetlimy konkatenację (złączenie) dwóch ciągów zmiennych
    rozdzielonych przecinkiem
6.  Wywołamy program dwiema metodami - IntelliJ oraz przy pomocy
    kompilacji i komendy java
7.  Dodamy obsługę ograniczenie mówiące o tym, że program powinien
    przyjmować 2 i tylko 2 parametry przy pomocy konstrukcji assert
8.  Uruchomimy program z parametrem -ea umożliwiającym obsługę asercji
9.  Zobaczymy jaki to dało efekt

# 3. Pobranie parametru args i wydruk na ekran (15 min)

Zadanie zostanie wykonane wspólnie. Nauczymy się obsługiwać parametry
wejściowe.

1. W utworzonym projekcie dodamy nową klasę - uczestnicy spróbują już
   samodzielnie.
2. W utworzonej klasie tworzymy metodę main - tym razem znowu
   samodzielnie
3. Wzorując się na zadaniach [1](#1-pierwszy-program-live-5-min) oraz
   [2](#2-pobieranie-parametru-10-min) proszę napisać program, który
   przy podaniu "imię" i "nazwisko" jako parametry, na ekran wypisze
   następujący tekst:

   ```
   Witaj w programie!
   > Witaj jestem args[0] args[1]
   Miło mi! Do zobaczenia!
   ```
4. Proszę wywołać program dowolną metodą

# 4. Wyświetlanie podanego znaku w tekście (15 min)

1. Tworzymy nowy program z metodą main
2. W metodzie main razem inicjalizujemy obiekt skanera
3. Wypisujemy tekst "Witaj w programie wpisz dowolny tekst"
4. Po wypisaniu tekstu program będzie oczekiwał na wpisanie tekstu
5. Następnie pokarze tekst "Podałeś tekst: " + wpisanyTekst
6. Po wypisaniu tekstu prośba o sformułowanie prośby "Proszę podać
   indeks znaku, który chesz wybrać. Od 0 do + (--wpisanyTekst.length())
   wykonaliśmy tu operację, której nie musisz rozumieć. Dowiemy się co o
   tym w sekcji o operatorach.
7. Ponownie wykorzystamy Scanner do pobrania wartości tym razem wywołamy
   nextInt()
8. Otrzymaną wartość od razu wykorzystamy do wykonania metody charAt
9. Wywołamy program kila razy.
10. Co jeśli nie zastosujemy się do zalecenia podanego przez prośbę o
    wartości od 0 do x (gdzie x to ilość znaków pomniejszona o 1)?


# Co dalej?

Po tej liście będziemy kontynuować część teoretyczną.  
[Wróć do agendy](../README.md)
