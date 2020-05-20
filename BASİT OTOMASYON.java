//MATEMATİK NETİNE GÖRE KAYNAK ÖNERSİ OTOMASYONU.
// YUSUF SALIK 190541088
package pkgif.pkgelse.learning;


// TOPLAM 6 YAYIN MEVCUT.
// NETE ORANLI YAZILACAKTIR...

import java.util.Scanner;

//KAREKOK
// ÇAP
//3-4-5 YAYINLARI...
//
/**
 *
 * @author YUSUF
 */
public class IfElseLearning {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("LÜTFEN YAPTIĞINIZ ORTALAMA NETİ GİRİNİZ")
        int i = s.nextInt();
        
if(i>30){
    System.out.println("SONUÇ : MATEMATİK NETİNİZ İYİ SEVİYEDEDİR , KAREKÖK YAYINI İLE DESTEKLEYİNİZ")
}        
else if(i>20 && i<30){
     System.out.println("SONUÇ : MATEMATİK ORTALAMA NETLERİNİZ ; YETERLİ SEVİYEDE DEĞİLDİR. ÇAP YAYINI VE SONUÇ YAYINLARIYLA DESTEKLENMELİDİR. ")
}
else{
     System.out.println("SONUÇ : MALESEF ÇABUK OLMALISINIZ... SONUC , ANTREMAN VE PALME YAYINIYLA DENEME COZUM VE TAKİBİ YAPILARAK NET ARTTIRILMALIDIR !!!")
}
   
        
                
}
    
        
    }
       