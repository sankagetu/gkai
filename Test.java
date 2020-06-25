
public class Test {

	public static void main(String[] args) {

		// 説明1 変数について
		int a = 10;
		String b = "Test";
		double c = 20.01;
		System.out.println("a="+a+" b="+b+" c="+c);

		// 説明2 キャスト
		int d = (int)c;
		System.out.println("d="+d);

		// 説明3 変数の使いまわし
		int e = 20;
		System.out.println("e="+e);
		e = 20 + 10;
		System.out.println("e="+e);
		e = 20 - 10;
		System.out.println("e="+e);
		e = 20 * 10;
		System.out.println("e="+e);
		e = 20 / 10;
		System.out.println("e="+e);
		e = 20 % 10;
		System.out.println("e="+e);

		// 説明4 メソッドの使用
		Test test = new Test();
		test.sample4_1();

		int h = test.sample4_2(5);
		System.out.println("h="+h);

		// 説明5 別クラスを使用
		Other other = new Other();
		other.i = 30;
		other.Sample5();

		// 宿題 消費税計算
		// 「1500円の商品の税込み価格は1650円（消費税は150円）です。」
		// ・Taxクラスを作成する
		// 　・原価を設定する変数を宣言する
		// 　・消費税を計算するメソッドを作成する(例：result)
		// ・原価と消費税を設定、出力するクラスを作成する(例：ExecTaxクラス)
		// 　・Taxクラスを宣言する
		// 　・宣言したTaxクラスへ原価を設定する
		// 　・Taxクラスにある消費税計算メソッドを呼び出し、消費税を受け取る
		// 　・「【原価】円の商品の税込み価格は【原価+消費税】円（消費税は【消費税】円）です。」を出力する文を作成する
		// 　※【】は変数

	}

	public void sample4_1() {
		System.out.println("f=20");
	}

	public int sample4_2(int g) {
		g++;
		g++;
		g--;
		return g;
	}

}
