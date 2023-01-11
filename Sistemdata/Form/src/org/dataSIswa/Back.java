package org.dataSIswa;

import java.time.LocalDate;
import java.time.Period;

public class Back {
    private String Nama;
    private LocalDate Tanggallahir;

    public Long getUKT() {
        return UKT;
    }

    public Long setUKT(Long UKT) {
        this.UKT = UKT;
        return UKT;
    }

    private Long UKT;

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public LocalDate getTanggallahir() {
        return Tanggallahir;
    }

    public void setTanggallahir(LocalDate tanggallahir) {
        Tanggallahir = tanggallahir;
    }
    //hitung umur
    public String Umurnya(){
         Period period = Period.between(LocalDate.now(), Tanggallahir);
         int tahun = period.getYears();
         int bulan = period.getMonths();
         int day = period.getDays();
         String usia;
         usia = tahun + "TAHUN" + bulan + "BULAN"+ day + "HARI";

         return usia;
    }
    //jenis ukt
    public String JenisUkt(){

        if(UKT<=500000){
            return "UKT 1";
        } else if (UKT>500000 && UKT <=1500000){
            return "UKT 2";
        } else if (UKT>1500000 && UKT <=3000000){
            return "UKT 3";
        } else if (UKT>3000000 && UKT <=4500000){
            return "UKT 4";
        } else if (UKT>4500000 && UKT <=5000000){
            return "UKT 5";
        } else if (UKT>5000000 && UKT <=6000000){
            return "UKT 6";
        } else if (UKT>6000000 && UKT <=7000000){
            return "UKT 7";
        } else {
            return "UKT Tidak Terkategori";
        }

    }
    public String kategoriusia(){
        int kate = Integer.parseInt(Umurnya());
        if(kate <= 5){
            return "BALITA";
        }else if(kate >= 5 && kate <= 15){
            return "REMAJA";
        }else {
            return "DEWASA";
        }
    }

}
