package com.destinyaplikasisifatallah.Model;

import java.util.ArrayList;

public class ModelKuis10 {
    public static String[][] data = new String[][]{
            {"1",
                    "Berapakah Sifat Wajib Diketahui...",
                    "A",
                    "A. 20",
                    "B. 50",
                    "C. 10",
                    "D. 30",
            },
            {"2",
                    "Qadiran sifat Wajib Allah Yang berarti...",
                    "C",
                    "A. Berkehendak",
                    "B. Ada",
                    "C. Berkuasa",
                    "D. Mengetahui",
            },
            {"3",
                    "Ajzun Sifat Mustahil yang berarti...",
                    "B",
                    "A. Mati",
                    "B. Lemah",
                    "C. Terpaksa",
                    "D. Ada yang Menyamai",
            },
            {"4",
                    "Mayyitan Sifat Wajib Diketahui...",
                    "D",
                    "A. Zat yang Buta",
                    "B. Zat yang Terpaksa",
                    "C. Zat yang Tuli",
                    "D. Zat yang Mati",
            },
            {"5",
                    "Hayyan sifat Wajib Allah Yang berarti...",
                    "A",
                    "A. Hidup",
                    "B. Ada",
                    "C. Berkuasa",
                    "D. Melihat",
            },
            {"6",
                    "Wujud sifat Wajib Allah yang berarti ...",
                    "A",
                    "A. Ada",
                    "B. Terdahulu",
                    "C. Kekal",
                    "D. Berdiri Sendiri",
            },
            {"7",
                    "Berapakah Sifat Mustahil yang Diketahui...",
                    "D",
                    "A. 25",
                    "B. 5",
                    "C. 15",
                    "D. 20",
            },
            {"8",
                    "Adam Sifat Mustahil yang berarti ...",
                    "B",
                    "A. Berbilang",
                    "B. Tiada",
                    "C. Musnah",
                    "D. Lemah",
            },
            {"9",
                    "Umyun Sifat Mustahil yang berarti...",
                    "C",
                    "A. Musnah",
                    "B. Bisu",
                    "C. Buta",
                    "D. Mati",
            },
            {"10",
                    "Sami'an sifat Wajib Allah Yang berarti...",
                    "D",
                    "A. Mengetahui",
                    "B. Ada",
                    "C. Hidup",
                    "D. Mendengar",
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
