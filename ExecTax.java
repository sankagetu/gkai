
public class ExecTax {

	public static void main(String[] args) {

		Tax tax = new Tax();
		tax.price = 1500;
		int taxPrice = tax.result(10);
		int totalPrice = tax.price + taxPrice;
        System.out.println(tax.price + "円の商品の税込み価格は" + totalPrice + "円（消費税は" + taxPrice + "円）です。");

        // int型の配列を宣言する
        int[] price = {10,20,30,40,50};

        // Taxクラスへ配列を設定する
        tax.totalPrice = price;

        // Taxクラスのresult2メソッドを呼び出し、結果を受け取る
        int totalPrice2 = tax.result2();

        // 合計価格は【合計金額】円です。
        System.out.println("合計価格は" + totalPrice2 + "円です。");

	}

}
