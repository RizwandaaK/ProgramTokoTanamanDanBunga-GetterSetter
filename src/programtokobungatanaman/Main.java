/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programtokobungatanaman;

/**
 *
 * @author rizwa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TanamandanBunga toko = new TanamandanBunga();
        toko.setPemesan("Rizwanda Keysha Cahya P");
        toko.setAlamat("Lumajang, Jawa Timur");
        toko.setJenistanaman("Rumput");
        toko.setJumlahtanaman(2);
        
        System.out.println("        MALANG/012  (021)234567        ");
        System.out.println("======================================");
        System.out.println("     TOKO TANAMAN DAN BUNGA PAK YE    ");
        System.out.println("======================================");
        System.out.println("");
        System.out.println("Nama Pemesan    : "+toko.getPemesan());
        System.out.println("Alamat          : "+toko.getAlamat());
        System.out.println("Jenis Tanaman   : "+toko.getJenistanaman());
        System.out.println("Jumlah          : "+toko.getJumlahtanaman()+" buah");
    } 
}
