package paintpack;

public class PaintBrush {
	private Paint paint;
	public Paint getPaint() {
		return paint;
	}
	public void setPaint(Paint paint) {
		this.paint = paint;
	}
	public void doPaint(){
		System.out.println(paint);
	}
}
abstract class Paint{}
class BluePaint extends Paint{}