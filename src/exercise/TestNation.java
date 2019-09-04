package exercise;

public class TestNation {

	public static void main(String[] args) {
			SpeakingLanguage speakLang;

			Nation aNation = new American();
			speakLang = new SpeakingLanguage(aNation);
			speakLang.determineLanguage();

			Nation sNation = new Spaniard();
			speakLang = new SpeakingLanguage(sNation);
			speakLang.determineLanguage();

			Nation cNation = new Chinese();
			speakLang = new SpeakingLanguage(cNation);
			speakLang.determineLanguage();
		}
}


/*class American implements Nation {
	public void speak() {
		System.out.println("Americans speak in English");
	}
}

class Spaniard implements Nation {
	public void speak() {
		System.out.println("Spaniards speak in Spanish");
	}
}

class Chinese implements Nation {
	public void speak() {
		System.out.println("Chinese people speak in Mandarin, ...");
	}
}

class SpeakingLanguage {
	public void determineLanguage(Nation nation) {
		nation.speak();
	}
}
*/