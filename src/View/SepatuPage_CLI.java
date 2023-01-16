package View;

import Controller.SepatuController;

import java.util.Scanner;

public class SepatuPage_CLI {
    Scanner input = new Scanner(System.in);
    public SepatuController sepatu = new SepatuController();

    public void menu(){
        int pilih;
        do{
            System.out.println("\n"
                    +" == Menu Utama == "+"\n"
                    +"1. VIEW SEPATU"+"\n"
                    +"2. INSERT SEPATU"+"\n"
                    +"3. UPDATE Sepatu"+"\n"
                    +"4. DELETE SEPATU"+"\n"
                    +"0.Exit"+"\n"
                    +"Pilih : ");
            pilih = input.nextInt();

            switch(pilih){
                case 1:
                    view();
                    break;
                case 2:
                    insert();
                    break;
                case 3:
                    Update();
                    break;
                case 4:
                    Delete();
                    break;
                default:
                    System.out.println("pilihan tidak ada!!");

            }
        }while(pilih != 0);
    }

    public void insert(){
        System.out.print("Kode Barang : ");
        int kode = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan Tipe Sepatu : ");
        String nama = input.nextLine();
        System.out.print("Masukkan Merk : ");
        String merk = input.nextLine();
        System.out.print("Masukkan Warna : ");
        String warna = input.nextLine();
        System.out.print("Masukkan jenis : ");
        String jenis = input.nextLine();
        System.out.print("Masukkan Gender : ");
        String gender = input.nextLine();
        sepatu.insert(kode,nama,merk,warna,jenis,gender);
    }
    public void Update(){
        System.out.print("index barang ke - : ");
        int index = input.nextInt();
        System.out.print("Kode Barang : ");
        int kode = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan Tipe Sepatu : ");
        String nama = input.nextLine();
        System.out.print("Masukkan Merk : ");
        String merk = input.nextLine();
        System.out.print("Masukkan Warna : ");
        String warna = input.nextLine();
        System.out.print("Masukkan jenis : ");
        String jenis = input.nextLine();
        System.out.print("Masukkan Gender : ");
        String gender = input.nextLine();
        sepatu.update(index,kode,nama,merk,warna,jenis,gender);
    }

    public void Delete(){
        int kodebarang;
        System.out.print("index yang akan dihapus ? : ");
        kodebarang = input.nextInt();
        sepatu.delete(kodebarang);
    }

    public void view(){
        for(int i = 0; i<sepatu.sepatu_model.getDataSepatu().size(); i++){
            System.out.println("========================");
            System.out.println("kode : "+sepatu.sepatu_model.getDataSepatu().get(i).getKodeBarang());
            System.out.println("Tipe : "+sepatu.sepatu_model.getDataSepatu().get(i).getNama());
            System.out.println("Merk : "+sepatu.sepatu_model.getDataSepatu().get(i).getMerk());
            System.out.println("Warna : "+sepatu.sepatu_model.getDataSepatu().get(i).getWarna());
            System.out.println("Jenis : "+sepatu.sepatu_model.getDataSepatu().get(i).getJenis());
            System.out.println("Gender : "+sepatu.sepatu_model.getDataSepatu().get(i).getGender());

        }
        System.out.println("========================");
    }




//        public void UpdateTas(int KodeBarang, String nama, String merk, String warna, String gender, String jenis){
//        Sepatu carisepatu = FindByID(KodeBarang);
//
//        if(carisepatu != null){
//            int index = indexData(caritas);
//            objeksepatu.get(index).setKodebarang(KodeBarang);;
//            objeksepatu.get(index).setNama(nama);
//            objeksepatu.get(index).setMerk(merk);
//            objeksepatu.get(index).setWarna(warna);
//            objeksepatu.get(index).setJenis(jenis);
//            objeksepatu.get(index).setGender(gender);
//        }
//    }
//
//
//    public Tas FindByID(int kode){
//        for (Entity.Sepatu sepatu:objeksepatu){
//            if(Sepatu.kodeBarang == kode){
//                System.out.println("========================");
//                System.out.println("kode : "+Sepatu.kodeBarang);
//                System.out.println("Tipe : "+Sepatu.nama);
//                System.out.println("Merk : "+Sepatu.merk);
//                System.out.println("Warna : "+Sepatu.warna);
//                System.out.println("Jenis : "+Sepatu.jenis);
//                System.out.println("Gender : "+Sepatu.gender);
//                return Tas;
//            }
//        }
//        return null;
//    }
//
//    public void MainCari(){
//        int kodebarang;
//        System.out.print("Masukkan kode : ");
//        kodebarang = input.nextInt();
//        FindByID(kodebarang);
//    }
//
//    public void DeletebyID(int kode){
//        Tas caritas = FindByID(kode);
//        if(caritas!=null){
//            objeksepatu.remove(carisepatu);
//        }
//    }
//

//
//    public int indexData(Tas Tas){
//        int index = objeksepatu.indexOf(Sepatu);
//        return index;
//    }
//
//

}
