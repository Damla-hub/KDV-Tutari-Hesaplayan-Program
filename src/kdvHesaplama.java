import java.util.Scanner;

public class kdvHesaplama {
    public static void main(String[] args) {
        double fiyat,kdvFiyat,kdvHesap;
        Scanner input=new Scanner(System.in);
        System.out.print("Fiyat değerini giriniz: ");
        fiyat=input.nextDouble();
        double kdv =fiyat<1000 ? 0.18 : 0.08;
        kdvHesap=fiyat*kdv;
        kdvFiyat=kdvHesap+fiyat;
        System.out.print("KDV'siz Fiyat: "+fiyat+"\nKDV'li Fiyat: "+kdvFiyat+"\nKDV tutarı: "+kdvHesap);

    }

}
