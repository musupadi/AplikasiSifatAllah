package com.destinyaplikasisifatallah.Model;

import java.util.ArrayList;

public class ModelSifatWajib {
    public static String[][] data = new String[][]{
            {"Wujud",
                    "Ada",
                    "Sifat Allah Ta’ala yang pertama adalah wujud yang berarti Ada. Maksudnya Allah itu zat yang pasti ada. Dia berdiri sendiri, tidak diciptakan oleh siapapun. Dan tidak ada Tuhan selain Allah Ta’ala. Bukti adanya Allah adalah terciptanya alam semesta dan juga makhluk hidup. Hal ini juga dijelaskan dalam ayat-ayat di Al-Quran:\n" +
                            "“Allah-lah yang menciptakan langit dan bumi dan apa yang ada di antara keduanya dalam enam masa, kemudian Dia bersemayam di atas ‘Arsy. Tidak ada bagi kamu selain daripada-Nya seorang penolongpun dan tidak (pula) seorang pemberi syafa’at 1190. Maka apakah kamu tidak memperhatikan?” (QS. As-Sajdah: 4).\n" +
                            "“Sesungguhnya Aku ini adalah Allah, tidak ada Tuhan selain Aku, maka sembahlah Aku dan dirikanlah shalat untuk mengingat Aku“. (QS. Thaha: 14).\n"
            },
            {
                "Qidam",
                    "Terdahulu",
                    "Allah Ta’ala juga memiliki sifat Qidam yang berarti terdahulu. Dialah Sang Pencipta yang menciptakan alam semesta berserta isinya. Sebagai pencipta tentunya Allah telah ada lebih dahulu dari apapun yang diciptakannya. Tidak ada pendahulu atau permulaan bagi Allah Ta’ala. Dalam Al-Quran dijelaskan:\n" +
                            "“Dialah Yang Awal dan Yang Akhir, Yang Zhahir dan Yang Bathin, dan Dia Maha Mengetahui segala sesuatu.” (QS.Al-Hadid: 3).\n"
            },
            {
                "Baqa"
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
