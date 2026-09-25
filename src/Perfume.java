
public class Perfume {
	private String name;
	private String detail;

	public Perfume(String n, String d) {
		super();
		this.name = n;
		this.detail = d;
	}

	//	AAアート内に診断結果を表示
	//メモ：『%s』とは･･･指定した場所に文字を埋め込むためのもの
	//何故ここに『\n』が必要なのか･･･%sは自動改行ができないため
	public void resultArt() {
		System.out.println("           [=====]           ");
		System.out.println("         .---------.         ");
		System.out.println("        /  診断結果  \\        ");
		System.out.println("     .-'-------------'-.     ");
		System.out.println("    /                   \\    ");
		System.out.printf("   |     %s    |\n", this.name); // 結果を枠内に表示
		System.out.println("   |                     |   ");
		System.out.println("   '---------------------'   ");
	}

	public String getName() {
		return name;
	}

	public String getDetail() {
		return detail;
	}

}
