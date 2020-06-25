
public class NintendoController {

	// コントローラー部分なので外部からの変更はできない
	// finalを追加する
	// privateを追加する
	private final String upControl = "上ボタンが押された";
	private final String downControl = "下ボタンが押された";
	private final String rightControl = "右ボタンが押された";
	private final String leftControl = "左ボタンが押された";

	private final String aButton = "Aボタンが押された";
	private final String bButton = "Bボタンが押された";

	// 各コントロールにアクションを追加する
	private String upCaction;
	private String downCaction;
	private String rightCaction;
	private String leftCaction;

	private String aBaction;
	private String bBaction;

	public String getUpControl() {
		return upControl;
	}
	public String getDownControl() {
		return downControl;
	}
	public String getRightControl() {
		return rightControl;
	}
	public String getLeftControl() {
		return leftControl;
	}
	public String getaButton() {
		return aButton;
	}
	public String getbButton() {
		return bButton;
	}
	public String getUpCaction() {
		System.out.print(upControl+":");
		return upCaction;
	}
	public void setUpCaction(String upCaction) {
		this.upCaction = upCaction;
	}
	public String getDownCaction() {
		System.out.print(downControl+":");
		return downCaction;
	}
	public void setDownCaction(String downCaction) {
		this.downCaction = downCaction;
	}
	public String getRightCaction() {
		System.out.print(rightControl+":");
		return rightCaction;
	}
	public void setRightCaction(String rightCaction) {
		this.rightCaction = rightCaction;
	}
	public String getLeftCaction() {
		System.out.print(leftControl+":");
		return leftCaction;
	}
	public void setLeftCaction(String leftCaction) {
		this.leftCaction = leftCaction;
	}
	public String getaBaction() {
		System.out.print(aButton+":");
		return aBaction;
	}
	public void setaBaction(String aBaction) {
		this.aBaction = aBaction;
	}
	public String getbBaction() {
		System.out.print(bButton+":");
		return bBaction;
	}
	public void setbBaction(String bBaction) {
		this.bBaction = bBaction;
	}

	public void urawaza() {
		System.out.println("裏技使用！");
		System.out.println(getUpControl()+getDownControl()+getLeftControl()+getRightControl()+getaButton()+getbButton());
	}


}
