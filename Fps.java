
public class Fps {

	public static void main(String[] args) {

		// 説明1 継承とコンストラクタ
		HoliController holiCont = new HoliController();
		// そのままコントローラーを呼び出し、操作してみる
		System.out.println("---任天堂から持ってきたのそのまま利用---");
		System.out.println(holiCont.getUpControl());
		System.out.println(holiCont.getDownControl());
		System.out.println(holiCont.getLeftControl());
		System.out.println(holiCont.getRightControl());

		System.out.println(holiCont.getaButton());
		System.out.println(holiCont.getbButton());

		// Holi用の操作も含む
		System.out.println("---ホリのを利用---");
		System.out.println(holiCont.getUpCrensha());
		System.out.println(holiCont.getDownCrensha());
		System.out.println(holiCont.getLeftCrensha());
		System.out.println(holiCont.getRightCrensha());

		System.out.println(holiCont.getaBrensha());
		System.out.println(holiCont.getbBrensha());

		// 各操作を設定
		System.out.println("---FPS用---");
		holiCont.setUpCaction("Wキー押下");
		holiCont.setDownCaction("Sキー押下");
		holiCont.setLeftCaction("Aキー押下");
		holiCont.setRightCaction("Dキー押下");
		holiCont.setaBaction("アクション");
		holiCont.setbBaction("リロード");

		System.out.println(holiCont.getUpCaction());
		System.out.println(holiCont.getDownCaction());
		System.out.println(holiCont.getLeftCaction());
		System.out.println(holiCont.getRightCaction());

		System.out.println(holiCont.getaBaction());
		System.out.println(holiCont.getbBaction());

		HoliController holiCont2 = new HoliController("Wキー押下","Sキー押下","Aキー押下","Dキー押下","アクション","リロード");
		System.out.println("---FPS用 コンストラクタVer---");
		System.out.println(holiCont2.getUpCaction());
		System.out.println(holiCont2.getDownCaction());
		System.out.println(holiCont2.getLeftCaction());
		System.out.println(holiCont2.getRightCaction());

		System.out.println(holiCont2.getaBaction());
		System.out.println(holiCont2.getbBaction());

		// セリーグ・パリーグの勝率結果出力処理(2019年度)
		// http://npb.jp/bis/2019/stats/
		// 前提：セリーグとパリーグ両方の結果を出力して欲しい
		// ただし、BaseBallTeamクラスを拡張してコンストラクタ対応にすること
		// ---BaseBallTeamExtというクラスを作成---
		// BaseBallTeamクラスを継承する
		// デフォルトコンストラクタを作成する
		// ・下記の値を拡張元のBaseBallTeamクラスへ格納するコンストラクタを作成する。
		// name(String)
		// win(int)
		// lose(int)
		// ※上記はBaseBallTeamExtクラスで宣言しないこと！
		// ---メインメソッドがあるクラスを修正---
		// 拡張を行ったクラスへクラス名を変更
		// セッターを全てコンストラクタへ変更
		// 結果を確認する

	}

}
