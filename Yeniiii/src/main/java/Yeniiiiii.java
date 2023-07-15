import java.util.Scanner;
public class Yeniiiiii {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int sayi1,sayi2;
        System.out.print("İlk Sayıyı Giriniz : ");
        sayi1=inp.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        sayi2=inp.nextInt();
        int i=1,ebob=1,ekok;
        while(i<=sayi1){
            if (sayi1%i==0){
                if(sayi2%i==0){
                    ebob=i;
                }
            }
            i++;
        }
        System.out.println("Ebob: "+ebob);
        ekok=(sayi1*sayi2)/ebob;
        System.out.println("Ekok :"+ekok);



      }

    }


