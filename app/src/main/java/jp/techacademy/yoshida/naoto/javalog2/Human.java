package jp.techacademy.yoshida.naoto.javalog2;

import android.util.Log;

class Human extends Animal implements thinkable {

    static String to_jp = "人";    //クラス変数 変数の定義

    String hobby;//メンバ変数

    public Human(String name, int age, String hobby)  {    //コンストラクタは内容の初期化を行うメソッド　sayメソッドを持っている
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    public void say() {
        Log.d("javatest", "「私の名前は" + this.name + "です。年は" + this.age + "歳です。」");
    }

    @Override
    public void think() {    //thinkメソッドを実装
            Log.d("javatest", "私は" + this.hobby + "について考える」");
    }
}