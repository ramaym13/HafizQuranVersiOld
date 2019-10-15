package org.d3ifcool.hafizquran.JsonModel;

import org.d3ifcool.hafizquran.ItemModel.Doa;
import org.d3ifcool.hafizquran.ItemModel.Tajwid;

import java.util.ArrayList;

public class DataDoa {
    private static String[] nmr_doa = {
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
            "10",
            "11",
            "12",
            "13",
            "14",
            "15",
            "16",
            "17",
            "18",
            "19",
            "20",
            "21",
            "22",
            "23",
            "24",
            "25",
    };

    private static String[] judul_doa = {
            "Doa Sebelum Makan",
            "Doa Sesudah Makan",
            "Doa Sesudah  Minum",
            "Doa Ketika Makan Lupa Membaca Doa",
            "Doa Sebelum Tidur",
            "Doa Bangun Tidur",
            "Doa Ketika Mimpi Buruk",
            "Doa Ketika Mendapat Mimpi Baik",
            "Doa Masuk Kamar Mandi Atau Toilet",
            "Doa Keluar Kamar Mandi Atau Toilet",
            "Doa Istinja",
            "Doa Masuk Rumah",
            "Doa Keluar Rumah",
            "Doa Memohon Ilmu Yang Bermanfaat",
            "Doa Sebelum Belajar",
            "Doa Sesudah Belajar",
            "Doa Naik Kendaraan",
            "Doa Ketika Sampai di Tempat Tujuan",
            "Doa Masuk Masjid",
            "Doa Keluar Masjid",
            "Doa Akan Membaca Al-Qur'an",
            "Doa Setelah Membaca Al-Qur'an",
            "Doa Niat Wudhu",
            "Doa Setelah Wudhu",
            "Doa Mohon Terlepas Dari Kesulitan",
    };
    private static String[] ayat = {
            "اَللّٰهُمَّ بَارِكْ لَنَا فِيْمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّارِ",
            "اَلْحَمْدُ ِللهِ الَّذِىْ اَطْعَمَنَا وَسَقَانَا وَجَعَلَنَا مُسْلِمِيْنَ",
            "اَلْحَمْدُ ِللهِ الَّذِىْ جَعَلَهُ عَذْبًا فُرَاتًا بِرَحْمَتِهِ وَلَمْ يَجْعَلْهُ مِلْحًا اُجَاجًا بِذُنُوْبِنَا",
            "بِسْمِ اللهِ فِىِ أَوَّلِهِ وَآخِرِهِ",
            "بِسْمِكَ االلّٰهُمَّ اَحْيَا وَبِاسْمِكَ اَمُوْتُ",
            "اَلْحَمْدُ ِللهِ الَّذِىْ اَحْيَانَا بَعْدَمَآ اَمَاتَنَا وَاِلَيْهِ النُّشُوْرُ",
            "اَللّٰهُمَّ إِنّىِ أَعُوْذُ بِكَ مِنْ عَمَلِ الشَّيْطَانِ وَسَيِّئاَتِ اْلأَحْلاَمِ",
            "اَلْحَمْدُ ِللهِ الَّذِيْ قَطْلَ الْحَاجَتِ",
            "اَللّٰهُمَّ اِنّىْ اَعُوْذُبِكَ مِنَ الْخُبُثِ وَالْخَبَآئِثِ",
            "غُفْرَانَكَ الْحَمْدُ ِللهِ الَّذِىْ اَذْهَبَ عَنّى اْلاَذَى وَعَافَانِىْ",
            "اَللّٰهُمَّ حَسِّنْ فَرْجِىْ مِنَ الْفَوَاخِشِ وَظَهِّرْ قَلْبِيْ مِنَ النِّفَاقِ",
            "اَللّٰهُمَّ اِنّىْ اَسْأَلُكَ خَيْرَالْمَوْلِجِ وَخَيْرَالْمَخْرَجِ بِسْمِ اللهِ وَلَجْنَا وَبِسْمِ اللهِ خَرَجْنَاوَعَلَى اللهِ رَبّنَا تَوَكَّلْنَا",
            "بِسْمِ اللهِ تَوَكَّلْتُ عَلَى اللهِ لاَحَوْلَ وَلاَقُوَّةَ اِلاَّ بِالله",
            "اَللّٰهُمَّ اِنِّى اَسْأَلُكَ عِلْمًا نَافِعًا وَرِزْقًا طَيِّبًا وَعَمَلاً مُتَقَبَّلاً",
            "يَارَبِّ زِدْنِىْ عِلْمًا وَارْزُقْنِىْ فَهْمًا",
            "اَللّٰهُمَّ اِنِّى اِسْتَوْدِعُكَ مَاعَلَّمْتَنِيْهِ فَارْدُدْهُ اِلَىَّ عِنْدَ حَاجَتِىْ وَلاَ تَنْسَنِيْهِ يَارَبَّ الْعَالَمِيْنَ",
            "بِسْمِ اللهِ مَجْرَهَا وَمُرْسَهَآاِنَّ رَبِّىْ لَغَفُوْرٌرَّحِيْمٌ",
            "اَلْحَمْدُ ِللهِ الَّذِى سَلَمَنِى وَالَّذِى اَوَنِى وَالَّذِى جَمَعَ الشَّمْلَ بِ",
            "اَللّٰهُمَّ افْتَحْ لِيْ اَبْوَابَ رَحْمَتِكَ",
            "اَللّٰهُمَّ اِنِّى اَسْأَلُكَ مِنْ فَضْلِكَ",
            "اَللّٰهُمَّ افْتَحْ عَلَىَّ حِكْمَتَكَ وَانْشُرْ عَلَىَّ رَحْمَتَكَ وَذَكِّرْنِىْ مَانَسِيْتُ يَاذَاالْجَلاَلِ وَاْلاِكْرَامِ",
            "اَللّٰهُمَّ ارْحَمْنِىْ بِالْقُرْآنِ. وَاجْعَلْهُ لِىْ اِمَامًا وَنُوْرًا وَّهُدًى وَّرَحْمَةً. اَللّٰهُمَّ ذَكِّرْنِىْ مِنْهُ مَانَسِيْتُ وَعَلِّمْنِىْ مِنْهُ مَاجَهِلْتُ. وَارْزُقْنِىْ تِلاَ وَتَهُ آنَآءَ اللَّيْلِ وَاَطْرَافَ النَّهَارٍ. وَاجْعَلْهُ لِىْ حُجَّةً يَارَبَّ الْعَالَمِيْنَ",
            "نَوَيْتُ الْوُضُوْءَ لِرَفْعِ الْحَدَثِ اْلاَصْغَرِ فَرْضًا لِلّٰهِ تَعَالَى",
            "اَشْهَدُ اَنْ لاَّاِلَهَ اِلاَّاللهُ وَحْدَهُ لاَشَرِيْكَ لَهُ وَاَشْهَدُ اَنَّ مُحَمَّدًاعَبْدُهُ وَرَسُوْلُهُ. اَللّٰهُمَّ اجْعَلْنِىْ مِنَ التَّوَّابِيْنَ وَاجْعَلْنِىْ مِنَ الْمُتَطَهِّرِيْنَ، وَجْعَلْنِيْ مِنْ عِبَادِكَ الصَّالِحِيْنَ",
            "لَاإِلَٰهَ إِلَّا أَنْتَ سُبْحَانَكَ إِنِّي كُنْتُ مِنَ الظَّالِمِينَ",
    };

    private static  String[] latin = {
            "Alloohumma barik lanaa fiimaa razatanaa waqinaa 'adzaa bannar",
            "Alhamdu lillaahil ladzii ath'amanaa wa saqoonaa wa ja'alnaa muslimiin",
            "Alhamdu lillaahil ladzi ja'alahuu 'adzbam furootam birohmatihii wa lamyaj'alhu milhan ujaajam bidzunuubinaa",
            "Bismillaahi fii awwalihi wa aakhirihi",
            "Bismikallaahuma ahyaa wa bismika amuutu",
            "Alhamdu lillahil ladzii ahyaanaa ba'da maa amaa tanaa wa ilahin nusyuuru",
            "Allaahumma innii a'uudzubika min 'amalisy syaithaani wa sayyiaatil ahlami",
            "Alhamdulillahil ladzii qodzoo haajaati",
            "Alloohumma Innii a'uudzubika minal khubutsi wal khoaaitsi",
            "Ghufraanaka. Alhamdulillaahil ladzii adzhaba ‘annjil adzaa wa’aafaanii.",
            "Alloohumma thahhir qolbii minan nifaaqi wa hashshin fajrii minal fawaahisyi",
            "Allahumma innii as-aluka khoirol mauliji wa khoirol makhroji bismillaahi wa lajnaa wa bismillaahi khorojnaa wa'alallohi robbina tawakkalnaa",
            "Bismillaahi tawakkaltu 'alalloohi laa hawlaa walaa quwwata illaa bilaahi",
            "Alloohumma innii as-aluka 'ilmaan naafi'aan wa rizqoon thoyyibaan wa 'amalaan mutaqobbalaan",
            "Yaa robbi zidnii 'ilman warzuqnii fahmaa",
            "Allaahumma innii astaudi'uka maa 'allamtaniihi fardud-hu ilayya 'inda haajatii wa laa tansaniihi yaa robbal 'alamiin",
            "Bismillaahi majrahaa wa mursaahaa inna robbii laghofuurur rohiim",
            "Alhamdulillahil ladzi sallamani wal ladzi awani wal ladzi jama’asy syamla bi.",
            "Allahummaf tahlii abwaaba rohmatik",
            "Allahumma innii asaluka min fadlik",
            "Alloohummaftah 'alayya hikmataka wansyur 'alayya rohmataka wa dzakkirnii maanasiitu yaa dzal jalaali wal ikhroomi",
            "Allahummarhamnii bil qur'aani. waj'alhu lii imaaman wa nuuran wa hudan wa rohman. Allahumma dzakkirnii minhu maa nasiitu wa'allimnii minhu maa jahiltu. wazuqnii tilaa watahu aanaa-al laili wa athroofan nahaari. waj'alhu lii hujjatan yaa robbal 'aalamiina.",
            "Nawaitul whudu-a lirof'il hadatsii ashghori fardhon lillaahi ta'aalaa",
            "Asyhadu allaa ilaaha illalloohu wahdahuu laa syariika lahu wa asyhadu anna muhammadan ‘abduhuuwa rosuuluhuu, alloohummaj’alnii minat tawwaabiina waj’alnii minal mutathohhiriina, waj'alnii min 'ibadikash shaalihiina.",
            "Laa ilaha illa anta subhanaka inni kuntu minadz dzolimin",
    };

    private static String[] arti = {
            "Artinya: Ya Allah, berkahilah kami dalam rezeki yang telah Engkau berikan kepada kami dan peliharalah kami dari siksa api neraka.",
            "Artinya: Segala puji bagi Allah yang telah memberi makan kami dan minuman kami, serta menjadikan kami sebagai orang-orang islam.",
            "Artinya: Segala puji bagi Allah yang telah menjadikan air ini (minuman) segar dan menggiatkan dengan rahmat-Nya dan tidak menjadikan air ini (minuman) asin lagi pahit karena dosa-dosa kami.",
            "Artinya: Dengan menyebut nama Allah pada awal dan akhirnya.",
            "Artinya: Dengan menyebut nama-Mu, Ya Allah, aku hidup dan dengan menyebut nama-Mu aku mati.",
            "Artinya: Segala puji bagi Allah yang telah menghidupkan kami sesudah kami mati (membangunkan dari tidur) dan hanya kepada-Nya kami dikembalikan.",
            "Artinya: Ya Allah, sesungguhnya aku mohon perlindungan kepada Engkau dari perbuatan setan dan dari mimpi-mimpi yang buruk.",
            "Artinya: Segala puji bagi Allah yang telah memberi hajatku.",
            "Artinya: Ya Allah, aku berlindung pada-Mu dari godaan syetan  laki-laki dan setan perempuan.",
            "Artinya: Dengan mengharap ampunanMu, segala puji milik Allah yang telah menghilangkan kotoran dari badanku dan yang telah menyejahterakan.",
            "Artinya: Wahai Tuhanku, sucikanlah hatiku dari sifat kepura-puraan (munafiq) serta peliharalah kemaluanku dari perbuatan keji.",
            "Artinya: Ya Allah, sesungguhnya aku mohon kepada-Mu baiknya tempat masuk dan baiknya tempat keluar dengan menyebut nama Allah kami masuk, dan dengan menyebut nama Allah kami keluar dan kepada Allah Tuhan kami, kami bertawakkal",
            "Artinya: Dengan menyebut nama Allah aku bertawakal kepada Allah, tiada daya kekuatan melainkan dengan pertologan Allah.",
            "Artinya: Ya Allah, sesungguhnya aku mohon kepada-Mu ilmu yang berguna, rezki yang baik dan amal yang baik Diterima. (H.R. Ibnu Majah)",
            "Artinya: Ya Allah, tambahkanlah aku ilmu dan berikanlah aku rizqi akan kepahaman.",
            "Artinya: Ya Allah, sesungguhnya aku menitipkan kepada Engkau ilmu-ilmu yang telah Engkau ajarkan kepadaku, dan kembalikanlah kepadaku sewaktu aku butuh kembali dan janganlah Engkau lupakan aku kepada ilmu itu wahai Tuhan seru sekalian alam.",
            "Artinya: Dengan nama Allah yang menjalankan kendaraan ini berlayar dan berlabuh, sesungguhnya Tuhanku benar-benar Maha Pengampun lagi Maha Penyayang.",
            "Artinya: Segala puji bagi Allah, yang telah menyelamatkan akau dan yang telah melindungiku dan yang mengumpulkanku dengan keluargaku.",
            "Artinya: Ya Allah, bukalah untukku pintu-pintu rahmat-Mu",
            "Artinya: Ya Allah, sesungguhnya aku memohon keutamaan dari-Mu",
            "Artinya: Ya Allah bukakanlah hikmahMu padaku, bentangkanlah rahmatMu padaku dan ingatkanlah aku terhadap apa yang aku lupa, wahai Dzat yang memiliki keagungan dan kemuliaan.",
            "Artinya: Ya Allah, rahmatilah aku dengan Al-Quran yang agung, jadikanlah ia bagiku ikutan cahaya petunjuk rahmat. Ya Allah, ingatkanlah apa yang telah aku lupa dan ajarkan kepadaku apa yang tidak aku ketahui darinya, anugerahkanlah padaku kesempatan membacanya pada sebagian malam dan siang, jadikanlah ia hujjah yang kuat bagiku, wahai Tuhan seru sekalian alam.",
            "Artinya: Saya niat berwudhu untuk menghilangkan hadast kecil fardu (wajib) karena Allah ta'ala",
            "Artinya: Aku bersaksi, tidak ada Tuhan selain Allah Yang Maha Esa, tidak ada sekutu bagi-Nya, dan aku mengaku bahwa Nabi Muhammad itu adalah hamba dan Utusan Allah. Ya Allah, jadikanlah aku dari golongan orang-orang yang bertaubat dan jadikanlah aku dari golongan orang-orang yang suci dan jadikanlah aku dari golongan hamba-hamba Mu yang shaleh",
            "Artinya: Bahwa tidak ada Tuhan selain Engkau. Maha Suci Engkau, sesungguhnya aku adalah termasuk orang-orang yang zalim."
    };
    public static ArrayList<Doa> getListData() {
        ArrayList<Doa> list_doa = new ArrayList<>();
        for (int position = 0; position < judul_doa.length; position++){
            Doa doa = new Doa();
            doa.setNmr_doa(nmr_doa[position]);
            doa.setJudul_doa(judul_doa[position]);
            doa.setDoa(ayat[position]);
            doa.setLatin(latin[position]);
            doa.setArti(arti[position]);
            list_doa.add(doa);
        }
        return list_doa;
    }
}
