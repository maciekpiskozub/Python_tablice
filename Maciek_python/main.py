import random

class Tablica:
    def __init__(self, N):
        self.tablica = [0] * N

    def wypelnij(self, a ,b):
        for i in range(len(self.tablica)):
            self.tablica[i] = random.randint(a,b)

    def maksimum(self):
        maks = self.tablica[0]
        for i in range(1, len(self.tablica)):
            if self.tablica[i] > maks:
                maks = self.tablica[i]
        return maks

    def minimum(self):
        min = self.tablica[0]
        for i in range(1, len(self.tablica)):
            if self.tablica[i] < min:
                mini = self.tablica[i]
        return min


    def maksimum2(self):
        maks1 = self.maksimum()

        maks2 = 0

        for i in range(1, len(self.tablica)):
            if self.tablica[i] != maks1:
                if self.tablica[i] > maks2:
                    maks2 = self.tablica[i]
        return maks2

    def znajdz(self, a):
        for i in range(len(self.tablica)):
            if self.tablica[i] == a:
                return i
        return -1

tablica = Tablica(10)
tablica.wypelnij(1,100)
print("Tablica: ", tablica.tablica)
print("Maksimum: ", tablica.maksimum())
print("Minimum: ", tablica.minimum())
print("Drugie maksimum: ", tablica.maksimum2())
print("szukamy indeks a: ", tablica.znajdz(45))
