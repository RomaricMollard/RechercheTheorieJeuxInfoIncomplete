package game;

/**
 * Stoque une probabilité avec quelques options sup
 */
public class Proba {

	private double proba = 0.0;
	private boolean trivial = false;
	private String debugName = "<unknown>";
	
	public double getProba(){
		return proba;
	}
	
	public void setProba(double proba){
		this.proba = proba;
	}
	
	public boolean isTrivial(){
		return this.trivial;
	}
	
	public void setTrivial(boolean trivial){
		this.trivial = trivial;
	}
	
	public void setDebugName(String debugName){
		this.debugName = debugName;
	}
	
	@Override
	public String toString(){
		return debugName+"="+proba+((trivial)?"(trivial)":"");
	}
	
}
