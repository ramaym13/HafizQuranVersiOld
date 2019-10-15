package org.d3ifcool.hafizquran.JsonModel;

import org.d3ifcool.hafizquran.ItemModel.Tajwid;

import java.util.ArrayList;

public class DataTajwid {
    private static String[] JudulTajwid = {
            "Hukum Qalqalah",
            "Hukum Alif Lam",
            "Hukum Lam Fi’il",
            "Hukum Lam Jalalah",
            "Ro’ Tarqiq",
            "Hukum Mad",
            "Idzhar halqi",
            "Idhgham Bighunnah",
            "Idhgham Bilaghunnah",
            "Iqlab"
    };
    private static String[] DeskripsiTajwid = {
            "Pengertian qalqalah adalah menekan bunyi huruf mati pada makhrojnya sehingga menghasilkan bunyi pantulan. Terdapat lima huruf Qolqolah yang terangkum dalam lafadz قطب جد. Jika huruf mati pada Qolqolah tersebut karena waqof, maka dibaca Qolqolah Qubro. Sedang bila huruf mati tersebut karena berharokat sukun, maka dibaca Qolqolah Shugro.",
            "Alif lam atau ditulis ال pada awal kata dalam Bahasa Arab memiliki dua cara baca. Cara pertama dengan membaca idzhar atau disebut idzhar qomariyyah. Hukum ini jika setelah ال berupa salah satu huruf dalam kalimat أَبْغِ حَجَّكَ وَخَفْ عَقِيْمَة. Sedang ketika bertemu dengan huruf selain itu, maka wajib dibaca Idghom Syamsiyyah.  Selengkapnya, baca; Hukum Bacaan Alif Lam Syamsiyah dan Alif Lam Qomariyah",
            "Macam Macam Hukum Tajwid berikutnya adalah tentang Lam Fi’il. Lam Fi’il yang mati karena sukun wajib dibaca idzhar. Contohnya Lam Fi’il yang dibaca idzhar adalah فَلْيَعْمَلْ. Tetapi, jika setelah Lam Fi’il tersebut ada huruf ل atau ر, maka Lam Fi’il tidak lagi dibaca idzhar, melainkan idghom seperti lafadz قُلْ رَبِّ.",
            "Lam Jalalah yang berada setelah harokat fathah atau dlummah harus dibaca tebal. Sedang ketika Lam Jalalah tersebut berada setelah harokat kasroh, maka Lam Jalalah dibaca tipis. Pada contoh عَبْدُ الله, Lam Jalalah dibaca tebal. Sedang pada contoh لِله, Lam Jalalah dibaca tipis. Selengkapnya, baca; Hukum Lam Jalalah (اللة) dalam Ilmu Tajwid",
            "Huruf ر yang dibaca tipis atau Tarqiq adalah ro’ yang menyandang harokat kasroh. Ro’ mati yang sebelumnya adalah harokat kasroh juga harus dibaca tipis, kecuali jika setelah ro’ adalah huruf isti’la’. Karena ro’ yang demikian harus dibaca tebal atau Tafkhim.",
            "Mad menjadi salah satu bahasa hukum yang sangat panjang jika di jabarkan dalam satu persatu. Hukum mad ini sendiri misalnya adalah mad tobi'i, mad arid lisukun, mad tamkin, mad layyin, ataupun hukum mad yang lainnya. Untuk membahasanya anda perlu membaca artikel dalalam rangkuman Hukum Mad dalam Ilmu Tajwid",
            "Idzhar halqi adalah apabila ada nun mati/tanwin bertemu huruf halqi. Huruf halqi ada enam, yaitu ا , ح , خ , ع , غ ,ها    cara membacanya harus jelas, tidak mendengung, dan tidak samar-samar.",
            "Idhgham Bighunnah adalah apabila ada nun mati/tanwin bertemu dengan salah satu dari empat huruf, yaitu  ي ن , م , و. Adapun cara membacanya suara nun mati/tanwin dimasukkan kedalam suara huruf tersebut dengan mendengung.",
            "Idhgham Bilaghunnah adalah apabils ada nun mati/tanwin bertemu dengan salah satu dari huruf dua, yaitu ل  dan ر. Cara membacanya suara nun mati/tanwin dimasukkan kedalam huruf  tersebut  tanpa mendengung.",
            "Iqlab adalah apabila ada nun mati/tanwin bertemu dengan ba’ (ب). Cara membacanya yaitu suara nun mati/tanwin diganti dengan suara mim mati ( م) dengan merapatkan bibir dan mendengung."
    };

    public static ArrayList<Tajwid> getListData() {
        ArrayList<Tajwid> listtajwid = new ArrayList<>();
        for (int position = 0; position< JudulTajwid.length; position++){
            Tajwid tajwid = new Tajwid();
            tajwid.setJudul_tajwid(JudulTajwid[position]);
            tajwid.setDeskripsi_tajwid(DeskripsiTajwid[position]);
            listtajwid.add(tajwid);
        }
        return listtajwid;
    }

}
