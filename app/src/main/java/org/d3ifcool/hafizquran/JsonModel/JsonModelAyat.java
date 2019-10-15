package org.d3ifcool.hafizquran.JsonModel;

import com.google.gson.annotations.SerializedName;

import org.d3ifcool.hafizquran.ItemModel.ItemModelAyat;

import java.util.List;

public class JsonModelAyat {
    @SerializedName("quran")
    private List<ItemModelAyat> itemssurah;

    public List<ItemModelAyat> getItemssurah() {
        return itemssurah;
    }
}
