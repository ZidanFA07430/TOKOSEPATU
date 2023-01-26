package Controller;
import Entity.*;
import Model.SepatuModel;
import View.AllObjekController;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class SepatuController {
    public SepatuModel sepatu_model = new SepatuModel();

    public SepatuController(){

    }

    public ArrayList<Sepatu> view(){
        return sepatu_model.getDataSepatu();

    }

    public void insert( int KodeBarang, String nama, String merk,String warna, String Gender, String Jenis){
        Sepatu sepatu = new Sepatu();
        sepatu.setKodebarang(KodeBarang);
        sepatu.setNama(nama);
        sepatu.setMerk(merk);
        sepatu.setWarna(warna);
        sepatu.setJenis(Jenis);
        sepatu.setGender(Gender);
        sepatu_model.insert(sepatu);
    }

    public void update(int index, int KodeBarang, String nama, String merk,String warna, String Gender, String Jenis){
        Sepatu sepatu = new Sepatu();
        sepatu.setKodebarang(KodeBarang);
        sepatu.setNama(nama);
        sepatu.setMerk(merk);
        sepatu.setWarna(warna);
        sepatu.setJenis(Jenis);
        sepatu.setGender(Gender);
        sepatu_model.update(index,sepatu);
    }

    public DefaultTableModel listbuku(){
        DefaultTableModel dtmlisttas = new DefaultTableModel();
        Object[] kolom ={"Kode","Nama","Merk","Warna","Jenis","Gender"};
        dtmlisttas.setColumnIdentifiers(kolom);
        int size = AllObjekController.sepatu_c.view().size();
        for (int i=0; i<size; i++){
            Object [] tas = new Object[6];
            tas[0] = AllObjekController.sepatu_c.sepatu_model.getDataSepatu().get(i).getKodeBarang();
            tas[1] = AllObjekController.sepatu_c.view().get(i).getNama();
            tas[2] = AllObjekController.sepatu_c.view().get(i).getMerk();
            tas[3] = AllObjekController.sepatu_c.view().get(i).getWarna();
            tas[4] = AllObjekController.sepatu_c.view().get(i).getJenis();
            tas[5] = AllObjekController.sepatu_c.view().get(i).getGender();
            dtmlisttas.addRow(tas);
        }
        return dtmlisttas;
    }

    public void delete(int index){
        sepatu_model.delete(index);
    }

//    public int cekBuku(String KodeBarang){
//        int keterangan = -1;
//        if(tas_model.getDataTas().size()>0){
//            for(int i=0;i<tas_model.getDataTas().size();i++){
//                if(KodeBarang.equals(tas_model.getDataTas().get(i).getKodeBarang())){
//                    keterangan = i;
//                    break;
//                }else{
//                    keterangan = -1;
//                }
//            }
//        }
//        return keterangan;
//    }

    public Sepatu lihatDaftarSepatu(int index){
        return sepatu_model.getDataSepatu().get(index);
    }



}