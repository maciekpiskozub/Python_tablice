public class Lancuchy {
    public Integer wysztkieSamogloski(String zdanie){
        int powtorzenia = 0;
        char[] samogloski = {'a', 'ą','e','ę','i','o','u','ó','y','A','Ą','E','Ę','I','O','U','Ó','Y'};
        for (char i: zdanie.toCharArray()){
            for(char s: samogloski){
                if(i==s){
                    powtorzenia++;
                }
            }
        }
        if (powtorzenia == 0){
            return null;
        }
        else {
            return powtorzenia;
        }
    }
    public void usuwaniePowtorzeń(){

    }
}
