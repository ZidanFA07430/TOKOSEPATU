package Model;

import Entity.Sepatu;

import java.util.ArrayList;

public class SepatuModel implements InterfaceModel {

    private static ArrayList<Sepatu> ListSepatu = new ArrayList<>();


    public ArrayList<Sepatu> getDataSepatu(){
        return ListSepatu;
    }

//    public static void initialData(){
//        Tas tas = new Tas(1,"Dior","Gucci","merah","Backpack","Unisex");
//
//        ListTas.add(tas);
//    }

    @Override
    public void insert(Object x){
        ListSepatu.add((Sepatu) x);
    }

    @Override
    public void update(int index, Object x) {
        ListSepatu.set(index,(Sepatu) x);
    }

    @Override
    public void delete(int index) {
        ListSepatu.remove(index);
    }

    @Override
    public void view() {

    }




}