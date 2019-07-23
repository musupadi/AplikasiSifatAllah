package com.destinyaplikasisifatallah.Model;

import java.util.ArrayList;

public class ModelSifatMustahil {
    public static String[][] data = new String[][]{
            {"Wujud",
                    "Ada"
            }
    };
    public static ArrayList<Model> getListData(){
        Model models = null;
        ArrayList<Model> list = new ArrayList<>();
        for (String[] aData : data) {
            models = new Model();
            models.setSifat(aData[0]);
            models.setArti(aData[1]);
            list.add(models);
        }
        return list;
    }
}
