package baseball;

public class BaseBallTeam {
//フィールド
	private String name;//チーム
	private int win;    //勝利
	private int lose;   //敗北
	private int draw;   //引分

	//引数なしのコンストラクタ（念のため記述し、中身は空）
	public BaseBallTeam() {
	}

	//引数ありコンストラクタ
	public BaseBallTeam(String name,int win, int lose,int draw) {
		this.name = name;
		this.win = win;
		this.lose = lose;
		this.draw = draw;
	}

	//勝率を計算するメソッド
	public double getRate() {
		return (double) this.win/(this.win + this.lose);
	}

	//成績を表示するメソッド(○○ の2022年の成績は △△勝 □□敗 ☆☆分、勝率は 0.▽▽▽▽▽▽です)
	public void report() {
		System.out.println(name + "　の2022年の成績は　" + win +"勝　" + lose +"敗　" + draw + "分、　"
				+ "勝率は　" + getRate() + "です。");
		}

	}