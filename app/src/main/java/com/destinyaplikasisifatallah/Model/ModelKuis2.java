package com.destinyaplikasisifatallah.Model;

import java.util.ArrayList;

public class ModelKuis2 {
    public static String[][] data = new String[][]{
            {"1",
                    "Qadiran sifat Wajib Allah Yang berarti...",
                    "C",
                    "A. Berkehendak",
                    "B. Ada",
                    "C. Berkuasa",
                    "D. Mengetahui",
            },
            {"2",
                    "Berapakah Sifat Wajib Diketahui...",
                    "A",
                    "A. 20",
                    "B. 50",
                    "C. 10",
                    "D. 30",
            },
            {"3",
                    "Berapakah Sifat Mustahil yang Diketahui...",
                    "D",
                    "A. 25",
                    "B. 5",
                    "C. 15",
                    "D. 20",
            },
            {"4",
                    "Wujud sifat Wajib Allah yang berarti ...",
                    "A",
                    "A. Ada",
                    "B. Terdahulu",
                    "C. Kekal",
                    "D. Berdiri Sendiri",
            },
            {"5",
                    "Umyun Sifat Mustahil yang berarti...",
                    "C",
                    "A. Musnah",
                    "B. Bisu",
                    "C. Buta",
                    "D. Mati",
            },
            {"6",
                    "Sami'an sifat Wajib Allah Yang berarti...",
                    "D",
                    "A. Mengetahui",
                    "B. Ada",
                    "C. Hidup",
                    "D. Mendengar",
            },
            {"7",
                    "Hayyan sifat Wajib Allah Yang berarti...",
                    "A",
                    "A. Hidup",
                    "B. Ada",
                    "C. Berkuasa",
                    "D. Melihat",
            },
            {"8",
                    "Umyun Sifat Mustahil yang berarti...",
                    "C",
                    "A. Musnah",
                    "B. Bisu",
                    "C. Buta",
                    "D. Mati",
            },
            {"9",
                    "Mayyitan Sifat Wajib Diketahui...",
                    "D",
                    "A. Zat yang Buta",
                    "B. Zat yang Terpaksa",
                    "C. Zat yang Tuli",
                    "D. Zat yang Mati",
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
