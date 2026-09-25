import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//		//		香水AAART
		//		String pbottle1 = """
		//				      ( () )
		//				     ／)   (＼
		//				  .------------.
		//				 /              \\
		//				|                |
		//				|                |
		//				\\\\______________// """;

		//		各種類概要　メモ：\n = 改行
		Perfume p1 = new Perfume("ウッディノート", "落ち着いた・知的な \n奥深く落ち着いた温かみを感じる香り。木々の頼もしくリラックス感のある香り");
		Perfume p2 = new Perfume("シトラスノート", "フレッシュ・若々しい \n柑橘系が中心の香り。万人受けしやすいためどんなシーンでも使える");
		Perfume p3 = new Perfume("グリーンノート", "みずみずしい・青々しい \n草木の水々しいアクティブな印象の香り。万人受けしやすいためどんなシーンでも使える");
		Perfume p4 = new Perfume("スパイシーノート", "異国情緒な・辛みがある \n薬味や辛味を感じる香り。個性的な香りの中では挑戦しやすく、秋や冬におすすめ");
		Perfume p5 = new Perfume("オリエンタルノート", "異国情緒な・エキゾチックな \nクセのある甘さを軸にした香り。寝香水やアロマなど、お家で楽しむのも良い");
		Perfume p6 = new Perfume("アクアティックノート", "みずみずしい・透明感がある \nみずみずしい、ま他は湿り気を感じさせる海のような香り");
		Perfume p7 = new Perfume("フゼアノート", "包容力のある・メンズっぽい \nナチュラルなハーブや、クマリンが配合された香り");
		Perfume p8 = new Perfume("レザーノート", "落ち着いた・渋みのある \n大人っぽく、レザージャケットなどの革製品のような香り");
		Perfume p9 = new Perfume("ハーバルノート", "・ \n");
		Perfume p10 = new Perfume("アニマルノート", "・ \n");
		Perfume p11 = new Perfume("バルサムノート", "・ \n");
		Perfume p12 = new Perfume("アンバーノート", "・ \n");
		Perfume p13 = new Perfume("シプレノート", "・ \n");
		Perfume p14 = new Perfume("パウダリーノート", "・ \n");
		Perfume p15 = new Perfume("ムスキーノート", "・ \n");
		Perfume p16 = new Perfume("ムスキーノート", "・ \n");

		//		各種類スコア
		int w_score = 0;
		int s_scoer = 0;
		int g_score = 0;
		int sp_scoer = 0;
		int o_score = 0;
		int a_scoer = 0;
		int f_score = 0;
		int l_scoer = 0;
		int h_score = 0;
		int ani_scoer = 0;
		int b_score = 0;
		int an_score = 0;
		int c_score = 0;
		int p_scoer = 0;
		int m_scoer = 0;

		//		結果
		System.out.println("【貴方に合う香水診断】");
		System.out.println("数字で答えてください(1 or 2)");
		System.out.println(" ");

		System.out.println("Q1:香水は、特に誰と会う時につけたい?"); //1：
		System.out.println("1 友人や同僚  2 恋人やパートナー");
		int ans1 = scan.nextInt();

		System.out.println("Q2:普段の服装やファッションの系統は？");
		System.out.println("1 フォーマル  2 カジュアル");
		int ans2 = scan.nextInt();

		System.out.println("Q3:香水をつけることで、どんな印象を与えたい？");
		System.out.println("1 大人っぽさ･ミステリアス  2 親しみやすさ･清潔感");
		int ans3 = scan.nextInt();

		System.out.println("Q4:割と強い匂いが好き？");
		System.out.println("1 強いほうが好き  2 酔うから程々が好き");
		int ans4 = scan.nextInt();

		System.out.println("Q5:自分が落ち着く時間帯は？");
		System.out.println("1 昼  2 夜");
		int ans5 = scan.nextInt();

		System.out.println("Q6:休日の過ごし方は？");
		System.out.println("1 インドアが多い  2 アウトドアが多い");
		int ans6 = scan.nextInt();

		System.out.println("Q7:ほっと一息つくなら？");
		System.out.println("1 ほのかな甘みと深みのある温かいお茶  2 鼻に抜ける清涼感とスッキリしたお茶");
		int ans7 = scan.nextInt();

		System.out.println("Q8:好きな季節は");
		System.out.println("1 春・夏  2 秋・冬");
		int ans8 = scan.nextInt();

		System.out.println("Q9:香水に一番求めている効果は");
		System.out.println("1 リフレッシュ・安心感  2 アピール・印象上げ");
		int ans9 = scan.nextInt();

		System.out.println("Q10:思わず深呼吸したくなる景色は？");
		System.out.println("1 澄んだ潮風を感じる海  2 木の香りが漂う森");
		int ans10 = scan.nextInt();

		//		結果
	}
}
