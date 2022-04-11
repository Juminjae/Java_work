package ex01;

public class Word {
	private String word, mean;
	
	public Word (String word, String mean){
		this.word=word;
		this.mean=mean;
	}

	public String getword() {
		return word;
	}
	
	public String getmean() {
		return mean;
	}

	@Override
	public String toString() {
		return word + ":" + mean;
	}
}
