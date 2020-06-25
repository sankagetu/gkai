
// 任天堂コントローラーを継承(オーバーライド)
public class HoliController extends NintendoController {

	// デフォルトコンストラクタ
	public HoliController() {

	}

	// 引数付きコンストラクタ(オーバーロード)
	public HoliController(String upCaction,String downCaction,String rightCaction,String leftCaction,String aBaction,String bBaction) {
		super.setUpCaction(upCaction);
		super.setDownCaction(downCaction);
		super.setRightCaction(rightCaction);
		super.setLeftCaction(leftCaction);
		super.setaBaction(aBaction);
		super.setbBaction(bBaction);

	}

	private final String upCrensha = "上ボタン連射";
	private final String downCrensha = "下ボタン連射";
	private final String rightCrensha = "右ボタン連射";
	private final String leftCrensha = "左ボタン連射";

	private final String aBrensha = "Aボタン連射";
	private final String bBrensha = "Bボタン連射";

	public String getUpCrensha() {
		return upCrensha;
	}
	public String getDownCrensha() {
		return downCrensha;
	}
	public String getRightCrensha() {
		return rightCrensha;
	}
	public String getLeftCrensha() {
		return leftCrensha;
	}
	public String getaBrensha() {
		return aBrensha;
	}
	public String getbBrensha() {
		return bBrensha;
	}

}
