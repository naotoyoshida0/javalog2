package jp.techacademy.yoshida.naoto.javalog2; //メインアクティビティークラスがパッケージjp.techacademy.yoshida.naoto.javalog2に属している。

        import android.support.v7.app.AppCompatActivity;  //インポートandroid.support.v7パッケージのapp～クラスをここにインポートする為に書く。
        import android.os.Bundle;
        import android.util.Log;

public class MainActivity2 extends AppCompatActivity {  //アクセスコントロール classキーワード 新規クラス名 extendsキーワード 継承元のクラス
    // {...}というルールで記述。MainActivityというクラスがどんな機能を持つかここで定義
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Human human = new Human("a", 2,"hobby");  //名前と年齢を入力

        human.think();

        human.say();







    }
}
