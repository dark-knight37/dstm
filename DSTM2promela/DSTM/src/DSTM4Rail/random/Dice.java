package DSTM4Rail.random;

/**
 * @author Stefano Marrone
 */
public class Dice extends RandomGenerator {
	
	protected int faces;
	
	public Dice() {
		this.faces = 6;
	}
	
	public Dice(int f) {
		this.faces = f;
	}

	public int roll() {		
		int result = super.engine.nextInt(this.faces);
		return result;
	}
}