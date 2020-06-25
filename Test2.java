import java.util.ArrayList;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {

		// 説明１ 分岐文
		int a = 10;
		if(a == 10) {
			System.out.println("aは"+a+"です");
		}

		if(a != 10) {
			System.out.println("aは10ではありません");
		}else {
			System.out.println("aは10です");
		}

		if(a != 10) {
			System.out.println("aは10ではありません");
		}else if(a == 10){
			System.out.println("aは10です");
		}else {
			System.out.println("以外");
		}

		int b = 5;
		if(b > 5) {
			System.out.println("aは5より大きい");
		}

		if(b < 5) {
			System.out.println("aは5より小さい");
		}

		if(b >= 5) {
			System.out.println("aは5より大きい");
		}

		if(b <= 5) {
			System.out.println("bは5より小さい");
		}

		if(b > 2 && b < 6) {
			System.out.println("bは2より大きい、かつ6より小さい");
		}

		if(b >= 5 || b <= 3) {
			System.out.println("bは5より大きい、または3より小さい");
		}

		if((b > 2 && b < 6) ||  b >= 5) {
			System.out.println("(bは2より大きい、かつ6より小さい) またはbは5より大きい");
		}

		switch(b) {

		case 0:
			System.out.println("0です");
			break;

		case 1:
			System.out.println("1です");
			break;

		case 2:
			System.out.println("2です");
			break;

		default:
			System.out.println("デフォルトです");
			break;

		}

		// 説明２ 配列、List
		int test[] = {1,2,3,4,5};
		System.out.println(test[0]);
		System.out.println(test[1]);
		System.out.println(test[2]);
		System.out.println(test[3]);
		System.out.println(test[4]);

		List<String> testList = new ArrayList<String>();
		testList.add("1");
		testList.add("2");
		testList.add("3");
		testList.add("4");
		testList.add("5");
		System.out.println(testList.get(0));
		System.out.println(testList.get(1));
		System.out.println(testList.get(2));
		System.out.println(testList.get(3));
		System.out.println(testList.get(4));

		// 説明3 ループ文
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}

		for(int i=0;i<5;i++) {
			System.out.println(test[i]);
		}

		for(int i=0;i<5;i++) {
			System.out.println(testList.get(i));
		}

		int c = 0;
		while(c == 10) {
			System.out.println(c);
			c++;
		}

		// 合計出力用プログラム
		// 前の宿題で作成したメインクラス側へ追記する
		// int型の配列を宣言する 5個分
		// Taxクラスへ配列を設定する
		// Taxクラスのresult2メソッドを呼び出し、結果を受け取る
		// 「合計価格は【合計金額】円です。」を表示する

		// Taxクラスへ追記する
		// 合計用の変数を作成する
		// 配列分繰り返す int a = 0; a = a + 配列;
		// 2つ目の配列の場合、100をたしこむ
		// 4つ目の配列の場合、300をたしこむ
		// それ以外は、配列の値をたしこむ

	}
}
