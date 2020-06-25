
public class superMario implements GameController {

	public static void main(String[] args) {

		// 説明2 インターフェース
		upCaction();
		downCaction();
		rightCaction();
		leftCaction();
		aBaction();
		bBaction();

	}

	// ---上ボタン時のアクションを設定---
	public static void upCaction() {
		System.out.println("上ボタン：ジャンプ");
	}

	public static void downCaction() {
		System.out.println("下ボタン：しゃがむ");
	}

	public static void rightCaction() {
		System.out.println("右ボタン：右へ進む");
	}

	public static void leftCaction() {
		System.out.println("左ボタン：左へ進む");
	}

	public static void aBaction() {
		System.out.println("Aボタン：ジャンプ");
	}

	public static void bBaction() {
		System.out.println("Bボタン：ダッシュ");
	}

}
