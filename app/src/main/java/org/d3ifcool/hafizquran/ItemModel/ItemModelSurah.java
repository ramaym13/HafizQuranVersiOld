package org.d3ifcool.hafizquran.ItemModel;

import com.google.gson.annotations.SerializedName;

public class ItemModelSurah {
    @SerializedName("nomor")
    private String Nomor;

    @SerializedName("nama")
    private String Nama;

    @SerializedName("arti")
    private String Arti;

    @SerializedName("asma")
    private String Asma;

    @SerializedName("ayat")
    private String Jumlah_Ayat;

    @SerializedName("type")
    private String DiturunkanDI;

    public String getDiturunkanDI() {
        return DiturunkanDI;
    }

    public String getJumlah_Ayat() {
        return Jumlah_Ayat;
    }

    public String getNomor() {
        return Nomor;
    }

    public String getNama() {
        return Nama;
    }

    public String getArti() {
        return Arti;
    }

    public String getAsma() {
        return Asma;
    }
}
