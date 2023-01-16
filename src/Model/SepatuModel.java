package Model;

import Entity.Sepatu;

import java.util.ArrayList;

public class SepatuModel implements InterfaceModel {

    private static ArrayList<Sepatu> ListSepatu = new ArrayList<>();


    public ArrayList<Sepatu> getDataSepatu(){return ListSepatu;}

    public static void initialData(){
        Sepatu sepatu = new Sepatu(1,"Kyrie","Nike","Hitam","Basket","Unisex");

        ListSepatu.add(sepatu);
    }

    @Override
    public void insert(Object x){ListSepatu.add((Sepatu) x);
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
