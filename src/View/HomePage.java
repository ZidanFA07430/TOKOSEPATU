//package View;
//
//import java.util.Scanner;
//
//public class HomePage {
//
//    Scanner input = new Scanner(System.in);
//    PetugasPage petugas = new PetugasPage();
//    SepatuPage sepatu = new SepatuPage();
//
//    public void menuUtama(){
//        int pilih;
//        do{
//            System.out.println("\n"
//                    +" == Menu Utama == "+"\n"
//                    +"1. DATA SEPATU"+"\n"
//                    +"2. DATA PETUGAS"+"\n"
//                    +"0.Exit"+"\n"
//                    +"Pilih : ");
//            pilih = input.nextInt();
//
//            switch(pilih){
//                case 1:
//                    sepatu.menu();
//                    break;
//                case 2:
//                    petugas.menu();
//                    break;
//                default:
//                    System.out.println("pilihan tidak ada!!");
//
//            }
//        }while(pilih != 0);
//    }
//}
