
public class Perfume {
	private int id;
	private String name;
	private String detail;
	private String art;

	public Perfume(int i, String n, String d, String a) {
		super();
		this.id = i;
		this.name = n;
		this.detail = d;
		this.art = a;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDetail() {
		return detail;
	}

	public String getArt() {
		return art;
	}

}
