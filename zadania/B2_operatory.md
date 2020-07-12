# 1. Prosta arytmetyka (5 min)

Zadanie ma na celu zaznajomienie z typami int, short oraz rzutowaniem.
Do zadania wykorzystamy też klasę Scanner. Te zadanie wykonamy razem.

Proszę:
1. Pobrać wartość ze strumienia wejściowego
2. Przypisać wartość do zmiennej "a" typu int nazwanej
3. Przypisać wartość zmiennej "a" do zmiennej "b" typu short
4. Proszę wyświetlić wartość zmiennej "b" na ekranie przy pomocy
   System.out.println(b)
5. Wykonamy prostą kalkulację: a - b i przypiszemy ją do zmiennej typu
   int
6. Wypiszemy na ekran tekst "Różnica pomiędzy wartością a i b wynosi %"
   za znak '%' podstawimy zmienną c

# 2. Porównanie obiektów String (5 min)

Stworzymy kolejny program, który:
1. Przypisze zmiennej a wartość ""
2. Przypisze zmiennej b wartość new String("")
3. Przypisze zmiennej c wartość operacji a == b
4. Przypisze zmiennej d wartość operacji a.eqauls(b)
5. Wypisze wyniki c i d na ekran
6. Następnie stworzy zmienną e i przypisze jej wartość null
7. Spróbujemy wykonać i wypisać na ekran wynik porównania a.equals(e)
8. Spróbujemy wykonać i wypisać na ekran wynik porównania e.equals(a)
9. Jakie wnioski?

# 3. Porównanie typów numerycznych (10 min)

Spróbujemy samodzielnie napisać program, który:
1. Przy pomocy obiektu Scanner pobierze wartość float i przypisze do zmiennej a
2. Następnie pobierze wartość int i przypisze do zmiennej b
3. Po czym pobierze wartość char i przypisze do zmiennej c
4. Wykona kilka porównań pobranych zmiennych spośród:
   !=
   <=
   <
   >
   ==
5. Wszystkie wyniki porównań wypisze na ekran

# 4. Kredyt (20 min)

Tym razem określimy warunki zadania i razem spróbujemy rozwiązać problem:
1. Kredyt składa się z **5 rat** każda rata składa się z części odsetkowej  
i z częsci stałej.
2. Część odsetkowa wynosi 5% w skali roku. Ale raty naliczane są miesięcznie
3. Część stała to ubezpieczenie, które co miesiąc wynosi 5 zł,
   a co drugi miesiąc dodatkowe 10 zł
4. W ostatniej racie Klient dostaje promocję i jego wartość ubezpieczenia
   wyniesie 20% mniej niż zwykle
5. Zakładamy, że każda rata ma taką samą część kapitałową

Proszę napisać program który:
1. Pobierze w dowolny sposób wartość kredytu (jaki typ danych zaproponujecie?)
2. Wykona kalkulację każdej z 5 rat i przypisze je do zmiennych - osobno
   ze zniżką osobno bez
3. Wypisze wartości raty z uwzględnieniem zniżki i bez
4. Będziemy chcieli zmodyfikować program tak aby ilość rat była zwiększona do 12 rat
5. Jakie wnioski?

# 5. Refaktoring (20 min)
Podczas refaktoringu warto rozpatrywać sensowny podział na metody.  
Oczywiście dobrze napisany system nigdy nie będzie zawierał wszystkich  
operacji w metodzie main. Do tej pory tak robiliśmy ponieważ operacje,  
które wykonywaliśmy były stosunkowo proste. Zadanie [4](#4-kredyt-20-min)
pokazało jak mogą wyglądać bardziej skomplikowane algorytmy.

W ramach zadania:
1. Zastanowimy się wspólnie jakie metody można by wydzielić
2. Dla przykładu prowadzący zaproponuje pierwszą metodę i zaimplementujemy
  ją razem
3. Do tej pory skupiamy się na podstawach składniowych języka (operatorach,
 i typach), nie skupialiśmy się jeszcze na tworzeniu własnych instacji klas,
 dlatego w tym zadaniu rozpatrzymy jeszcze problem wewnątrz jednej klasy
 programu.
4. Po wydzieleniu metod zastanowimy się jak ich użyć tak aby ilość rat
  wyniosła 12 i zastosowane były wszystkie prawidłowości opisane w
  wymaganiach do programu z zadania [4](#4-kredyt-20-min)
5. Przetestujemy program dla kilku wartości

# Co dalej?

Zapraszam spowrotem do [Powrotu do agendy](../README.md)
Omówimy sobie co to są instrukcje strujące
