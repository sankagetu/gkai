
public class Camcom {

	public static void main(String[] args) {

		// 説明1 カプセル化とgetterとsetter
		NintendoController nCont = new NintendoController();
		// そのままコントローラーを呼び出し、操作してみる
		System.out.println("---任天堂から持ってきたのそのまま利用---");
		System.out.println(nCont.getUpControl());
		System.out.println(nCont.getDownControl());
		System.out.println(nCont.getLeftControl());
		System.out.println(nCont.getRightControl());

		System.out.println(nCont.getaButton());
		System.out.println(nCont.getbButton());

		// 本来変更できない処理を変更する。できちゃうのがダメ！
//		nCont.upControl = "左に行ったり右に行ったり";
//		System.out.println(nCont.getUpControl());

		// ストリートファイター用にカスタマイズする
		System.out.println("---ストリートファイター用---");
		nCont.setUpCaction("ジャンプする");
		nCont.setDownCaction("しゃがむ");
		nCont.setLeftCaction("左に動く");
		nCont.setRightCaction("右に動く");
		nCont.setaBaction("パンチする");
		nCont.setbBaction("キックする");

		System.out.println(nCont.getUpCaction());
		System.out.println(nCont.getDownCaction());
		System.out.println(nCont.getLeftCaction());
		System.out.println(nCont.getRightCaction());

		System.out.println(nCont.getaBaction());
		System.out.println(nCont.getbBaction());

		nCont.urawaza();

		// セリーグの勝率結果出力処理(2019年度)
		// http://npb.jp/bis/2019/stats/std_c.html
		// ---BaseBallTeamというクラスを作成---
		// ・下記の値のセッターとゲッターを作成する
		// name(String)
		// win(int)
		// lose(int)
		//・getRateというメソッドを作成して、勝率を算出してそれを返却する。
		// 勝率：勝ち数 ÷ (勝ち数 + 負け数)
		// ・reportというメソッドを作成して、下記のように結果を表示する。なお、勝率はgetRateメソッドをそのまま利用すること
		// 「【name】の勝ち数は【win】、負け数は【lose】、勝率は【getRateメソッド】です。」
		// 例：読売ジャンアンツの勝ち数は77、負け数は64、勝率は0.5460992907801419です。
		//
		// メインメソッドが入っているクラスを作成(名前はなんでもOK)
		// ・セリーグのサイトに記載している６チーム分の名前、勝ち数、負け数を設定する。
		// ・reportメソッドを呼び出して結果を出力する。

	}

}
