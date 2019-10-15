package org.d3ifcool.hafizquran.ItemModel;

import com.google.gson.annotations.SerializedName;

public class ItemModelAyat {
    @SerializedName("surah_number")
    private String NomorSurah;

    @SerializedName("verse_number")
    private String NomorAyat;

    @SerializedName("text")
    private String TextAyat;

    @SerializedName("translation")
    private String Translation;

    public String getNomorSurah() {
        return NomorSurah;
    }

    public String getNomorAyat() {
        return NomorAyat;
    }

    public String getTextAyat() {
        return TextAyat;
    }

    public String getTranslation() {
        return Translation;
    }
}
