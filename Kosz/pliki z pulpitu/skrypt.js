function skrypt()
{
    let rodzaj = document.getElementById("rodzaj").value
    let waga = document.getElementById("waga").value
    console.log(rodzaj, waga)

 if  (rodzaj==1)
 {
    cena=5
    wynik=(cena*waga)
 }
 else if (rodzaj==2)
 {
    cena=7
    wynik=(cena*waga)
 }
 else if (rodzaj==3)
 {
   cena=6
   wynik=(cena*waga)
 }
 else
 {
 wynik = 0
 }
 document.getElementById("wynik").innerHTML = "koszt zamownienia" + wynik + "zł"
}