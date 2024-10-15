# ********************************************************
# nazwa funkcji:  plec
# opis funkcji: funkcja sprawdza czy ostatnia liczba w peselu jest parzysta
# jesli tak to wyswietla w konsoli "K" w innym wypadku "M"
# parametry: pesel - podany pesel przez uzytkownika w formie tablicy
# zwracany typ i opis: funkcja zwraca typ void znak "K" lub "M"

# nazwa funkcji:  sumaKontrolna
# opis funkcji: funkcja sprawdza sume kontrolna podanego peselu
# parametry: pesel - podany pesel przez uzytkownika w formie tablicy
# zwracany typ i opis: funkcja zwraca typ boolean true jesli pesel jest poprawny false w przypadku blednego peselu

# autor: szymon szymanski
# **************************************************


peselString = input('podaj pesel: ')
pesel = []

for p in peselString:
    pesel.append(int(p))


def plec(pesel):
    if pesel[-1]%2==0:
        return 'K'
    else:
        return 'M'

def sumaKontrolna(pesel):
    mnoznik = [1, 3, 7, 9, 1, 3, 7, 9, 1, 3]
    s = 0
    i =0
    m=0
    r =0

    for p in pesel:
        s += p*mnoznik[i]
        i+=1
        if i == 10:
            break
    m = s%10
    if m == 0:
        r=0
    else:
        r = 10-m

    if r == pesel[10]:
        return True
    else: return False


if __name__ == "__main__":

    print(sumaKontrolna(pesel))
    print(plec(pesel))
