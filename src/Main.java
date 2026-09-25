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
		Perfume p6 = new Perfume("アクアティックノート", "みずみずしい・透明感がある \nみずみずしい、または湿り気を感じさせる海のような香り");
		Perfume p7 = new Perfume("フゼアノート", "包容力のある・メンズっぽい \nナチュラルなハーブや、クマリンが配合された香り");
		Perfume p8 = new Perfume("レザーノート", "落ち着いた・渋みのある \n大人っぽく、レザージャケットなどの革製品のような香り");
		Perfume p9 = new Perfume("ハーバルノート", "植物的なナチュラルさ・すっきりとした \nスパイシーさや薬っぽさも感じるハーブのすっきりとした爽快な香り。春や夏におすすめ");
		Perfume p10 = new Perfume("アニマルノート", "野生っぽさ・野生っぽさ \n獣感のある動物性の香調やなめし革などを思わせる力強く個性的な香り");
		Perfume p11 = new Perfume("バルサムノート", "包容力のある・重厚感のある \n樹脂の重みがあるほのかに甘い香り。ミステリアスですが穏やかな気持ちになる、アロマに多い");
		Perfume p12 = new Perfume("アンバーノート", "上品な色気・穏やかな \nバニラ香料を思わせる温かみがあり甘く複雑な香り。お香らしさがある");
		Perfume p13 = new Perfume("シプレノート", "包容力のある・大地を感じる \nシトラス・樫の木に生えるコケであるオークモス(パチョリ)・アンバーを軸にした格調高くエレガントな香り。");
		Perfume p14 = new Perfume("パウダリーノート", "フェミニンな・優しい \n白粉を思わせるほのかに甘くふんわりと優しい香り。さりげない華やかさをまといたい時に");
		Perfume p15 = new Perfume("ムスキーノート", "あたたかい・ほっこりとした \n温かみのある人肌のような、石鹸を思わせる清潔感のあるソフトな香り。");
		Perfume p16 = new Perfume("アロマティックノート", "植物的なナチュラルさ・穏やか \nのどかな田園風景を連想させるような香り。普段使い向き");

		//		各種類スコア
		int resultPerfume = 0;
		int w_score = 0;
		int s_score = 0;
		int g_score = 0;
		int sp_score = 0;
		int o_score = 0;
		int a_score = 0;
		int f_score = 0;
		int l_score = 0;
		int h_score = 0;
		int ani_score = 0;
		int b_score = 0;
		int an_score = 0;
		int c_score = 0;
		int p_score = 0;
		int m_score = 0;
		int arma_score = 0;

		//		診断 
		//メモ：【while文を使う】←条件が満たされるまで繰り返し処理されるのがwhile(if文のみ=入力を間違えた時にループできない。for文は繰り返す回数が予め決まっている）
		while (true) {
			System.out.println("【貴方に合う香水診断】");
			System.out.println("数字で答えてください 1 or 2 (半角)");
			System.out.println(" ");

			System.out.println("Q1:香水は、特に誰と会う時につけたい?");
			System.out.println("1 友人や同僚  2 恋人やパートナー");
			int ans1 = scan.nextInt();
			if (ans1 == 1) {
				s_score += 1;
				g_score += 1;
				a_score += 1;
				h_score += 1;
				ani_score += 1;
				arma_score += 1;
				break;
			} else if (ans1 == 2) {
				w_score += 1;
				sp_score += 1;
				o_score += 1;
				f_score += 1;
				l_score += 1;
				b_score += 1;
				an_score += 1;
				c_score += 1;
				p_score += 1;
				m_score += 1;
				break;
			} else {
				System.out.println("※ 1 または 2 で入力してください。");
			}
		}

		while (true) {
			System.out.println("Q2:普段の服装やファッションの系統は？");
			System.out.println("1 フォーマル  2 カジュアル");
			int ans2 = scan.nextInt();
			if (ans2 == 1) {
				arma_score += 1;
				w_score += 1;
				o_score += 1;
				f_score += 1;
				b_score += 1;
				an_score += 1;
				c_score += 1;
				p_score += 1;
				m_score += 1;
				break;
			} else if (ans2 == 2) {
				s_score += 2;
				g_score += 2;
				a_score += 1;
				h_score += 1;
				ani_score += 1;
				l_score += 1;
				sp_score += 1;
				break;
			} else {
				System.out.println("※ 1 または 2 で入力してください。");
			}
		}

		System.out.println("Q3:香水をつけることで、どんな印象を与えたい？");
		System.out.println("1 大人っぽさ･ミステリアス  2 親しみやすさ･清潔感");
		int ans3 = scan.nextInt();
		if (ans3 == 1) {
			w_score += 1;
			sp_score += 1;
			o_score += 1;
			f_score += 1;
			l_score += 1;
			b_score += 1;
			p_score += 1;
			c_score += 1;
			break;
		} else if (ans3 == 2) {
			w_score += 1;
			s_score += 1;
			g_score += 1;
			h_score += 1;
			arma_score += 1;
			a_score += 1;
			break;
		} else {
			System.out.println("※ 1 または 2 で入力してください。️");
		}

		System.out.println("Q4:割と強い匂いが好き？");
		System.out.println("1 強いほうが好き  2 弱い方が好き");
		int ans4 = scan.nextInt();
		if (ans4 == 1) {
			sp_score += 2;
			o_score += 1;
			f_score += 1;
			l_score += 2;
			ani_score += 2;
			break;
		} else if (ans4 == 2) {
			w_score += 2;
			s_score += 1;
			g_score += 1;
			a_score += 1;
			arma_score += 1;
			m_score += 2;
			break;
		} else {
			System.out.println("※ 1 または 2 で入力してください。");
		}

		System.out.println("Q5:自分が落ち着く時間帯は？");
		System.out.println("1 昼  2 夜");
		int ans5 = scan.nextInt();
		if (ans5 == 1) {
			s_score += 1;
			g_score += 1;
			a_score += 1;
			h_score += 1;
			break;
		} else if (ans5 == 2) {
			o_score += 2;
			l_score += 2;
			an_score += 2;
			m_score += 1;
			b_score += 1;
			break;
		} else {
			System.out.println("※ 1 または 2 で入力してください。");
		}

		System.out.println("Q6:休日の過ごし方は？");
		System.out.println("1 インドアが多い  2 アウトドアが多い");
		int ans6 = scan.nextInt();
		if (ans6 == 1) {
			p_score += 1;
			m_score += 1;
			b_score += 1;
			w_score += 1;
			break;
		} else if (ans6 == 2) {
			g_score += 2;
			a_score += 2;
			h_score += 2;
			s_score += 1;
			break;
		} else {
			System.out.println("※ 1 または 2 で入力してください。");
		}

		System.out.println("Q7:ほっと一息つくなら？");
		System.out.println("1 ほのかな甘みと深みのある温かいお茶  2 鼻に抜ける清涼感とスッキリしたお茶");
		int ans7 = scan.nextInt();
		if (ans7 == 1) {
			b_score += 2;
			an_score += 2;
			o_score += 1;
			c_score += 1;
			break;
		} else if (ans7 == 2) {
			h_score += 2;
			g_score += 1;
			s_score += 1;
			arma_score += 2;
			break;
		} else {
			System.out.println("※ 1 または 2 で入力してください。");
		}

		System.out.println("Q8:好きな季節は");
		System.out.println("1 春・夏  2 秋・冬");
		int ans8 = scan.nextInt();
		if (ans8 == 1) {
			s_score += 2;
			a_score += 2;
			g_score += 1;
			h_score += 1;
			break;
		} else if (ans8 == 2) {
			w_score += 1;
			sp_score += 2;
			o_score += 1;
			l_score += 1;
			m_score += 1;
			break;
		} else {
			System.out.println("※ 1 または 2 で入力してください。");
		}

		System.out.println("Q9:香水に一番求めている効果は");
		System.out.println("1 リフレッシュ・安心感  2 アピール・印象上げ");
		int ans9 = scan.nextInt();
		if (ans9 == 1) {
			arma_score += 2;
			m_score += 2;
			g_score += 1;
			s_score += 1;
			break;
		} else if (ans9 == 2) {
			sp_score += 2;
			ani_score += 2;
			f_score += 1;
			c_score += 1;
			p_score += 1;
			break;
		} else {
			System.out.println("※ 1 または 2 で入力してください。");
		}

		System.out.println("Q10:思わず深呼吸したくなる景色は？");
		System.out.println("1 澄んだ潮風を感じる海  2 木の香りが漂う森");
		int ans10 = scan.nextInt();
		if (ans10 == 1) {
			a_score += 3;
			break;
		} else if (ans10 == 2) {
			w_score += 3;
			g_score += 1;
			break;
		} else {
			System.out.println("※ 1 または 2 で入力してください。");
		}
		//		結果
	}
}
