package Burc;
import java.util.Scanner;
public class BurcProgramı {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int ay,gun;
        System.out.println("Doğduğunuz günü yazın:");
        gun=input.nextInt();
        System.out.println("Doğduğunuz ayı yazın:");
        ay=input.nextInt();

        if((gun>=21 && ay==3)||((gun>=1&&gun<21)&&(ay==4))){
            System.out.println("Koç burcusunuz");
        }
        else if((gun>=21 && ay==5)||((gun>=1&&gun<22)&&(ay==6))){
            System.out.println("ikizler burcusunuz");
        }
        else if((gun>=22 && ay==6)||((gun>=1&&gun<23)&&(ay==7))){
            System.out.println("Yengeç burcusnuz");
        }

        else if((gun>=23 && ay==7)||((gun>=1&&gun<23)&&(ay==8))){
            System.out.println("Aslan burcusunuz");
        }

        else if((gun>=23 && ay==8)||((gun>=1&&gun<23)&&(ay==9))){
            System.out.println("Başak burcusunuz");
        }

        else if((gun>=23 && ay==9)||((gun>=1&&gun<24)&&(ay==10))){
            System.out.println("Terazi burcusunuz");
        }

        else if((gun>=24 && ay==10)||((gun>=1&&gun<23)&&(ay==11))){
            System.out.println("Akrep burcusunuz");
        }
        else if((gun>=23 && ay==11)||((gun>=1&&gun<22)&&(ay==12))){
            System.out.println("Yay burcusunuz");
        }
        else if((gun>=22 && ay==12)||((gun>=1&&gun<21)&&(ay==1))){
            System.out.println("Oğlak burcusunuz");
        }
        else if((gun>=21 && ay==1)||((gun>=1&&gun<19)&&(ay==2))){
            System.out.println("Kova burcusunuz");
        }
        else if((gun>=19 && ay==2)||((gun>=1&&gun<21)&&(ay==3))){
            System.out.println("Balık burcusunuz");
        }
        else{
            System.out.println("geçerli olmayan tarih girdiniz..");
        }
    }
}
