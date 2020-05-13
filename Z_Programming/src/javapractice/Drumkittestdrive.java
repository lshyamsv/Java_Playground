package javapractice;

class drumkit {
	boolean topHat = true;
	boolean snare = true;
	
	void playSnare(){
		System.out.println("Bang Bang");
	}
	void palyTopHat(){
		System.out.println("Ding ging");
	}
}

public class Drumkittestdrive {

	public static void main(String[] args) {
		drumkit d = new drumkit();
		d.playSnare();
		d.snare =false;
		if(d.snare==true){
			d.playSnare();
		}
		d.palyTopHat();

	}

}
