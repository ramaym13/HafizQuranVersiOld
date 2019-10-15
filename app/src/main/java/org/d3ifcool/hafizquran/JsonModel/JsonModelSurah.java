package org.d3ifcool.hafizquran.JsonModel;

import com.google.gson.annotations.SerializedName;

import org.d3ifcool.hafizquran.ItemModel.ItemModelSurah;

import java.util.ArrayList;
import java.util.List;

public class JsonModelSurah {
    @SerializedName("list_surah")
    private ArrayList<ItemModelSurah> itemModelSurahs;

    public List<ItemModelSurah> getItemModelSurahs() {
        return itemModelSurahs;
    }


}
