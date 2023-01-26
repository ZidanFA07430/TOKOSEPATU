package View;

import Controller.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;

public class HomeFrame_GUI extends MainFrame_GUI {

    public JLabel namaLabel,merkLabel,warnaLabel,jenisLabel,genderLabel,kodeLabel,iconLabel;
    public  JTextField namaField,merkField,warnaField,jenisField,genderField,kodeField;
    public JButton tambahBtn,updateBtn,hapusBtn;
    public JTable tabel = new JTable();
    public JScrollPane scroll = new JScrollPane(tabel);
    int index;
    private static SepatuController sepatu_c = new SepatuController();

    public HomeFrame_GUI(){
        super("Home",900,600);

    }

    @Override
    protected void component(){

        tabel.setModel(sepatu_c.listbuku());
        tabel.setBackground(color("#AFEEEE"));
        setFontSize(scroll,14);
        setFontSize(tabel,12);
        boundedAdd(scroll,150,200,700,300);

        ImageIcon imgLoad = loadImage("src/assets/p2.png", 800, 800);
        iconLabel = new JLabel(imgLoad);
        boundedAdd(iconLabel, 10, 100, 150, 500);

        namaLabel = new JLabel("Nama : ");
        setFontSize(namaLabel,14);
        boundedAdd(namaLabel,30,50,80,20);
        namaField = new JTextField();
        setFontSize(namaField,12);
        boundedAdd(namaField,30,80,100,25);

        merkLabel = new JLabel("Merk");
        setFontSize(merkLabel,14);
        boundedAdd(merkLabel,150,50,80,20);
        merkField = new JTextField();
        setFontSize(merkField,12);
        boundedAdd(merkField,150,80,100,25);

        warnaLabel = new JLabel("Warna");
        setFontSize(warnaLabel,14);
        boundedAdd(warnaLabel,270,50,80,20);
        warnaField = new JTextField();
        setFontSize(warnaField,12);
        boundedAdd(warnaField,270,80,100,25);

        jenisLabel = new JLabel("Jenis");
        setFontSize(jenisLabel,14);
        boundedAdd(jenisLabel,390,50,80,20);
        jenisField = new JTextField();
        setFontSize(jenisField,12);
        boundedAdd(jenisField,390,80,100,25);

        genderLabel = new JLabel("Gender");
        setFontSize(genderLabel,14);
        boundedAdd(genderLabel,510,50,80,20);
        genderField = new JTextField();
        setFontSize(genderField,12);
        boundedAdd(genderField,510,80,100,25);

        kodeLabel = new JLabel("kode");
        setFontSize(kodeLabel,14);
        boundedAdd(kodeLabel,630,50,80,20);
        kodeField = new JTextField();
        setFontSize(kodeField,12);
        boundedAdd(kodeField,630,80,100,25);

        tambahBtn = new JButton();
        tambahBtn.setText("Tambah");
        tambahBtn.setBackground(color("#00000"));
        tambahBtn.setForeground(color("#FFFFFF"));
        tambahBtn.setHorizontalTextPosition(JButton.CENTER);
        tambahBtn.setVerticalTextPosition(JButton.CENTER);
        setFontSize(tambahBtn,14);
        boundedAdd(tambahBtn,30,120,100,30);

        updateBtn = new JButton();
        updateBtn.setText("Update");
        updateBtn.setBackground(color("#00000"));
        updateBtn.setForeground(color("#FFFFFF"));
        updateBtn.setHorizontalTextPosition(JButton.CENTER);
        updateBtn.setVerticalTextPosition(JButton.CENTER);
        setFontSize(updateBtn,14);
        boundedAdd(updateBtn,150,120,100,30);

        hapusBtn = new JButton();
        hapusBtn.setText("Hapus");
        hapusBtn.setBackground(color("#00000"));
        hapusBtn.setForeground(color("#FFFFFF"));
        hapusBtn.setHorizontalTextPosition(JButton.CENTER);
        hapusBtn.setVerticalTextPosition(JButton.CENTER);
        setFontSize(hapusBtn,14);
        boundedAdd(hapusBtn,270,120,100,30);


    }



    public void event() {

        tambahBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try{
                    int kode = Integer.valueOf(kodeField.getText());
                    String nama = namaField.getText();
                    String merk = merkField.getText();
                    String warna =  warnaField.getText();
                    String jenis = jenisField.getText();
                    String gender = genderField.getText();

                    AllObjekController.sepatu_c.insert(kode,nama,merk,warna,gender,jenis);

                    JOptionPane.showMessageDialog(null,"input sukses",
                            "information",JOptionPane.INFORMATION_MESSAGE);
                    reset();
                    tabel.setModel(AllObjekController.sepatu_c.listbuku());

                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null,"salah"+exception,
                            "information",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } );


//        tambahBtn.addActionListener(e -> {
//
//
//            int kode = Integer.valueOf(kodeField.getText());
//            String nama = namaField.getText();
//            String merk = merkField.getText();
//            String warna =  warnaField.getText();
//            String jenis = jenisField.getText();
//            String gender = genderField.getText();
//
//
//            try{
//                AllObjekController.tas_c.insert(kode,nama,merk,warna,gender,jenis);
//                JOptionPane.showMessageDialog(null,"input sukses",
//                        "information",JOptionPane.INFORMATION_MESSAGE);
//                tabel.setModel(AllObjekController.tas_c.listbuku());
//                reset();
//
//            }catch (Exception exception){
//                JOptionPane.showMessageDialog(null,"salah"+exception,
//                        "information",JOptionPane.INFORMATION_MESSAGE);
//            }
//
//        });

        tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = tabel.getSelectedRow();
                index = i;
                kodeField.setText(AllObjekController.sepatu_c.listbuku().getValueAt(i,0).toString());
                namaField.setText(AllObjekController.sepatu_c.listbuku().getValueAt(i,1).toString());
                merkField.setText(AllObjekController.sepatu_c.listbuku().getValueAt(i,2).toString());
                warnaField.setText(AllObjekController.sepatu_c.listbuku().getValueAt(i,3).toString());
                jenisField.setText(AllObjekController.sepatu_c.listbuku().getValueAt(i,4).toString());
                genderField.setText(AllObjekController.sepatu_c.listbuku().getValueAt(i,5).toString());

            }
        });

        updateBtn.addActionListener(e -> {

            try{
                String nama = namaField.getText();
                String merk = merkField.getText();
                String warna =  warnaField.getText();
                String jenis = jenisField.getText();
                String gender = genderField.getText();
                int kode = Integer.valueOf(kodeField.getText());


                AllObjekController.sepatu_c.update(index,kode,nama,merk,warna,gender,jenis);
                JOptionPane.showMessageDialog(null,"input sukses",
                        "information",JOptionPane.INFORMATION_MESSAGE);
                tabel.setModel(AllObjekController.sepatu_c.listbuku());
                reset();
            }catch (Exception exception){
                JOptionPane.showMessageDialog(null,"inputan salah"+exception,
                        "information",JOptionPane.INFORMATION_MESSAGE);
            }

        });

        hapusBtn.addActionListener(e -> {
            try{
                AllObjekController.sepatu_c.delete(index);
                JOptionPane.showMessageDialog(null,"input sukses",
                        "information",JOptionPane.INFORMATION_MESSAGE);
                tabel.setModel(AllObjekController.sepatu_c.listbuku());
                reset();
            }catch (Exception exception){
                JOptionPane.showMessageDialog(null,"inputan salah",
                        "information",JOptionPane.INFORMATION_MESSAGE);
            }

        });





    }

    public void reset(){
        namaField.setText(null);
        merkField.setText(null);
        warnaField.setText(null);
        jenisField.setText(null);
        genderField.setText(null);
        kodeField.setText(null);
    }
}