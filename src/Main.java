public class Main {
    public static void main(String[] args) {
        int aliquot = 0;

        System.out.print("1-100 arasındaki bütün asal sayılar: ");
        // 1-100 arasındaki bütün tamsayılar dönülür
        for (int i = 2; i <= 100; i++) {

            // her sayı için o sayıya kadarki bütün sayılar döbülür ve tam bölünüp bölünmediği kontrol edilir
            for (int j = 1; j < i; j++) {
                //tam bölünüyor ise bölen sayısı bir artırılır
                if (i % j == 0) {
                    aliquot++;
                }
            }
            // sadeec 1 ve kendisine bölünen sayı bölen sayısı 2 den küçük olan sayılar ekrana yazdırılır
            if (aliquot < 2) {
                System.out.print(i + " ");
            }
            // her değer için bölen sayısı sıfırlanır
            aliquot = 0;

        }
    }
}