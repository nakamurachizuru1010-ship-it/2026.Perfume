
public class Perfume {
	private String name;
	private String detail;

	public Perfume(String n, String d) {
		super();
		this.name = n;
		this.detail = d;
	}

	//	AAアート内に診断結果を表示
	public void printResultCard() {
		// 名前（文字数に応じた余白調整を自動で行う例）
		System.out.println("           [===]           ");
		System.out.println("         .-------.         ");
		System.out.println("        / 診断結果 \\        ");
		System.out.println("     .-'-----------'-.     ");
		System.out.println("    /                 \\    ");
		System.out.printf("   |  %-12s |\n", this.name); // 結果を枠内に表示
		System.out.println("   '-------------------'   ");
	}

	public String getName() {
		return name;
	}

	public String getDetail() {
		return detail;
	}

}
