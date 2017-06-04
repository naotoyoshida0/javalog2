package jp.techacademy.yoshida.naoto.javalog2;

import android.util.Log;

class BigDog extends Dog {
    static String to_jp = "大型犬";

    public  BigDog(String name, int age) {
        super(name, age);
    }

    public static void introduce() {
        Log.d("javatest" , "これは大型犬クラスです。");
    }
}

