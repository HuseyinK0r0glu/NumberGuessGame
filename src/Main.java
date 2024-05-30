import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int tahmin,can=5,i=0;
        int sayi = rand.nextInt(100);
        int[]tahminler=new int [5];
        boolean oyunDurum = false,hata=false;


        System.out.println("Sayı tahmin oyununa hoşgeldiniz");
        System.out.println("sıfırdan yüze kadar bir sayı tuttum");

        while(can>0){
            System.out.println("Tahmininiz:");
            tahmin = scan.nextInt();


            if(tahmin<0 || tahmin>99){
                if(hata){
                    can--;
                    System.out.println("çok fazla hatalı giriş yaptınız 1 can kaybettiniz");
                    System.out.println("kalan canınız = "+ can);

                }else{
                    hata = true;
                }
                System.out.println("lütfen sıfırla yüz arasında bir sayı giriniz");
                continue;
            }
            tahminler[i++]=tahmin;
            if(sayi==tahmin){
                oyunDurum = true;
                break;
            }else{
                can--;
                System.out.println("Yanlış tahmin ettiniz tekrar deneyiniz ");
                System.out.println("kalan can: "+ can);

            }


        }

        if(oyunDurum){
            System.out.println("tebrikler doğru tahmin");
            System.out.println("sayımız."+sayi);
            System.out.println("kalan can:"+can);
        }else{
            System.out.println("başaramadınız"+ sayi);

        }
        for(int value :tahminler ){
            if(value!=0){
                System.out.println(value);
            }

        }


    }
}