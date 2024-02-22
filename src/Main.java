import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month, day;
        String horos = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz ayı giriniz :");
        month = input.nextInt();
        System.out.print("Doğduğunuz günü giriniz :");
        day = input.nextInt();

        if (month == 1){
            if (day>=1 && day<=31){
                if (day<22){
                    horos = "Oğlak";

                }else {
                    horos = "Kova";
                }
            }else {
                isError = true;
            }
        }else if (month == 2) {
            if (day>=1 && day<=28){
                if (day<20){
                    horos = "Kova";

                }else {
                    horos = "Balık";
                }
            }else {
                isError = true;
            }
        }else if (month == 3) {
            if (day>=1 && day<=31){
                if (day<21){
                    horos = "Balık";

                }else {
                    horos = "Koç";
                }
            }else {
                isError = true;
            }
        }else if (month == 4) {
            if (day>=1 && day<=30){
                if (day<21){
                    horos = "Koç";

                }else {
                    horos = "Boğa";
                }
            }else {
                isError = true;
            }
        }else if (month == 5) {
            if (day>=1 && day<=31){
                if (day<22){
                    horos = "Boğa";

                }else {
                    horos = "İkizler";
                }
            }else {
                isError = true;
            }
        }else if (month == 6) {
            if (day>=1 && day<=30){
                if (day<23){
                    horos = "İkizler";
                }else {
                    horos = "Yengeç";
                }
            }else {
                isError = true;
            }
        }else if (month == 7) {
            if (day>=1 && day<=31){
                if (day<23){
                    horos = "Yengeç";

                }else {
                    horos = "Aslan";
                }
            }else {
                isError = true;
            }
        }else if (month == 8) {
            if (day>=1 && day<=30){
                if (day<23){
                    horos = "Aslan";
                }else {
                    horos = "Başak";
                }
            }else {
                isError = true;
            }
        }else if (month == 9) {
            if (day>=1 && day<=31){
                if (day<23){
                    horos = "Başak";
                }else {
                    horos = "Terazi";
                }
            }else {
                isError = true;
            }
        }else if (month == 10) {
            if (day>=1 && day<=30){
                if (day<23){
                    horos = "Terazi";
                }else {
                    horos = "Akrep";
                }
            }else {
                isError = true;
            }
        }else if (month == 11) {
            if (day>=1 && day<=31){
                if (day<22){
                    horos = "Akrep";
                }else {
                    horos = "Yay";
                }
            }else {
                isError = true;
            }
        }else if (month == 12) {
            if (day<=21){
                    horos = "Yay";
                }else if (day>=21 && day<=30){
                    horos = "Oğlak";
                }else {
                isError = true;
            }
        }else {
            isError = true;
        }
        if (isError) {
            System.out.print("Hatalı giriş yaptınız.");
        }else {
            System.out.print("Burcunuz :" + horos);

        }
    }
}