package com.destinyaplikasisifatallah.Model;

import java.util.ArrayList;

public class ModelKuis6 {
    public static String[][] data = new String[][]{
            {"1",
                    "Berapakah Sifat Mustahil yang Diketahui...",
                    "D",
                    "A. 25",
                    "B. 5",
                    "C. 15",
                    "D. 20",
            },
            {"2",
                    "Sami'an sifat Wajib Allah Yang berarti...",
                    "D",
                    "A. Mengetahui",
                    "B. Ada",
                    "C. Hidup",
                    "D. Mendengar",
            },
            {"3",
                    "Wujud sifat Wajib Allah yang berarti ...",
                    "A",
                    "A. Ada",
                    "B. Terdahulu",
                    "C. Kekal",
                    "D. Berdiri Sendiri",
            },
            {"4",
                    "Qadiran sifat Wajib Allah Yang berarti...",
                    "C",
                    "A. Berkehendak",
                    "B. Ada",
                    "C. Berkuasa",
                    "D. Mengetahui",
            },
            {"5",
                    "Berapakah Sifat Wajib Diketahui...",
                    "A",
                    "A. 20",
                    "B. 50",
                    "C. 10",
                    "D. 30",
            },
            {"6",
                    "Adam Sifat Mustahil yang berarti ...",
                    "B",
                    "A. Berbilang",
                    "B. Tiada",
                    "C. Musnah",
                    "D. Lemah",
            },
            {"7",
                    "Umyun Sifat Mustahil yang berarti...",
                    "C",
                    "A. Musnah",
                    "B. Bisu",
                    "C. Buta",
                    "D. Mati",
            },
            {"8",
                    "Sami'an sifat Wajib Allah Yang berarti...",
                    "D",
                    "A. Mengetahui",
                    "B. Ada",
                    "C. Hidup",
                    "D. Mendengar",
            },
            {"9",
                    "Hayyan sifat Wajib Allah Yang berarti...",
                    "A",
                    "A. Hidup",
                    "B. Ada",
                    "C. Berkuasa",
                    "D. Melihat",
            },
            {"10",
                    "Ajzun Sifat Mustahil yang berarti...",
                    "B",
                    "A. Mati",
                    "B. Lemah",
                    "C. Terpaksa",
                    "D. Ada yang Menyamai",
            },
    };
    public static ArrayList<Model> getListData(){
        Model models = null;
        ArrayList<Model> list = new ArrayList<>();
        for (String[] aData : data) {
            models = new Model();
            models.setNo(aData[0]);
            models.setSoal(aData[1]);
            models.setJawaban(aData[2]);
            models.setJawabana(aData[3]);
            models.setJawabanb(aData[4]);
            models.setJawabanc(aData[5]);
            models.setJawaband(aData[6]);
            list.add(models);
        }
        return list;
    }
}
