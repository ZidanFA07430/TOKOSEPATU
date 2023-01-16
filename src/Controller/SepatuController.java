package Controller;
import Entity.*;
import Model.*;

import java.util.ArrayList;

public class SepatuController {
    public SepatuModel sepatu_model = new SepatuModel();

    public SepatuController(){

    }

    public ArrayList<Sepatu> view(){
        return sepatu_model.getDataSepatu();

    }

    public void insert(int KodeBarang, String nama, String merk,String warna, String Gender, String Jenis){
        Sepatu sepatu = new Sepatu();
        sepatu.setKodebarang(KodeBarang);
        sepatu.setNama(nama);
        sepatu.setMerk(merk);
        sepatu.setWarna(warna);
        sepatu.setJenis(Jenis);
        sepatu.setGender(Gender);
        sepatu_model.insert(sepatu);
    }

    public void update(int index,int KodeBarang, String nama, String merk,String warna, String Gender, String Jenis){
        Sepatu sepatu = new Sepatu();
        sepatu.setKodebarang(KodeBarang);
        sepatu.setNama(nama);
        sepatu.setMerk(merk);
        sepatu.setWarna(warna);
        sepatu.setJenis(Jenis);
        sepatu.setGender(Gender);
        sepatu_model.update(index,sepatu);
    }

    public void delete(int index){sepatu_model.delete(index);
    }

    public int cekBuku(String KodeBarang){
        int keterangan = -1;
        if(sepatu_model.getDataSepatu().size()>0){
            for(int i=0;i<sepatu_model.getDataSepatu().size();i++){
                if(KodeBarang.equals(sepatu_model.getDataSepatu().get(i).getKodeBarang())){
                    keterangan = i;
                    break;
                }else{
                    keterangan = -1;
                }
            }
        }
        return keterangan;
    }

    public Sepatu lihatDaftarSepatu(int index){
        return sepatu_model.getDataSepatu().get(index);
    }



}
