package exercise;

class SpeakingLanguage {
	Nation nation;
	
	public SpeakingLanguage(Nation nt){
		nation = nt;
	}
	
	public void determineLanguage() {
		nation.speak();
	}
}