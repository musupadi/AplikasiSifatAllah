package com.destinyaplikasisifatallah.Model;

import java.util.ArrayList;

public class ModelKuis5 {
    public static String[][] data = new String[][]{
            {"1",
                    "Sami'an sifat Wajib Allah Yang berarti...",
                    "D",
                    "A. Mengetahui",
                    "B. Ada",
                    "C. Hidup",
                    "D. Mendengar",
            },
            {"2",
                    "Hayyan sifat Wajib Allah Yang berarti...",
                    "A",
                    "A. Hidup",
                    "B. Ada",
                    "C. Berkuasa",
                    "D. Melihat",
            },
            {"3",
                    "Umyun Sifat Mustahil yang berarti...",
                    "C",
                    "A. Musnah",
                    "B. Bisu",
                    "C. Buta",
                    "D. Mati",
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
                    "Ajzun Sifat Mustahil yang berarti...",
                    "B",
                    "A. Mati",
                    "B. Lemah",
                    "C. Terpaksa",
                    "D. Ada yang Menyamai",
            },
            {"6",
                    "Qadiran sifat Wajib Allah Yang berarti...",
                    "C",
                    "A. Berkehendak",
                    "B. Ada",
                    "C. Berkuasa",
                    "D. Mengetahui",
            },
            {"7",
                    "Berapakah Sifat Wajib Diketahui...",
                    "A",
                    "A. 20",
                    "B. 50",
                    "C. 10",
                    "D. 30",
            },
            {"8",
                    "Berapakah Sifat Mustahil yang Diketahui...",
                    "D",
                    "A. 25",
                    "B. 5",
                    "C. 15",
                    "D. 20",
            },
            {"9",
                    "Wujud sifat Wajib Allah yang berarti ...",
                    "A",
                    "A. Ada",
                    "B. Terdahulu",
                    "C. Kekal",
                    "D. Berdiri Sendiri",
            },
            {"10",
                    "Umyun Sifat Mustahil yang berarti...",
                    "C",
                    "A. Musnah",
                    "B. Bisu",
                    "C. Buta",
                    "D. Mati",
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
