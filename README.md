# Wyszukiwarka Wzorca w Plikach Tekstowych

## Spis treści
1. [Opis projektu](#opis-projektu)
2. [Funkcjonalności](#funkcjonalności)
3. [Instrukcje obsługi](#instrukcje-obsługi)
    1. [Wymagania](#wymagania)
    2. [Uruchomienie aplikacji](#uruchomienie-aplikacji)
4. [Przykładowe dane wejściowe](#przykładowe-dane-wejściowe)

## Opis projektu
Program przeszukuje wszystkie pliki o rozszerzeniu `.txt` z bieżącego katalogu w poszukiwaniu wzorca podanego z klawiatury. Wzorzec może zawierać `*` jako oznaczenie ciągu dowolnych znaków (również ciągu pustego) lub `?` jako oznaczenie dokładnie jednego dowolnego znaku. Efektem działania programu jest wypisanie na ekranie listy z nazwą pliku, numerem linii w której znaleziono spełniający wzorzec fragment oraz faktycznie znaleziony fragment, spełniający wzorzec.

## Funkcjonalności
1. Wyszukiwanie wzorca w plikach tekstowych z bieżącego katalogu.
2. Obsługa wzorca zawierającego `*` i `?`.
3. Wyświetlanie wyników w formacie: nazwa pliku, numer linii, znaleziony fragment.

## Instrukcje obsługi

### Wymagania
- Java 8 lub nowsza
- Maven 

### Uruchomienie aplikacji
1. Sklonuj repozytorium:
```bash
git clone https://github.com/MrRav3n/5.-Wyszukiwanie-tekstu
```
2. Skonfiguruj środowisko:
Upewnij się, że masz zainstalowaną Javę. Możesz sprawdzić wersję, używając:
```bash
java -version
```
3. Zainstaluj Maven:
```bash
sudo apt-get install maven
```
4. Uruchom aplikację:
```bash
   mvn clean compile exec:java -Dexec.mainClass="com.example.Main"
```

### Przykłady wzorców
- `test*file` - dopasowuje się do ciągu zaczynającego się od "test" i kończącego się na "file" z dowolnymi znakami pomiędzy, np. "test file", "test123file".
- `?est` - dopasowuje się do ciągu, gdzie na pierwszym miejscu jest dowolny znak, a kolejne trzy znaki to "est", np. "test", "best".
- `*pattern*` - dopasowuje się do ciągu zawierającego "pattern" gdziekolwiek w środku, np. "this is a pattern", "pattern matching is fun!".

### Przykładowe dane wejściowe
Do repozytorium dołączony jest plik `sample-input.txt`, który może być użyty do testowania programu.

#### Zawartość pliku `sample-input.txt`:
```plaintext
This is a test file.
It contains several lines of text.
Feel free to use it for testing purposes.
Pattern matching is fun!
