package vektoren;


public class Dreieck {
	
	private Point eckeA;
	private Point eckeB;
	private Point eckeC;
	private double seiteA;
	private double seiteB;
	private double seiteC;
	private double alpha;
	private double beta;
	private double gamma;
	
	public Dreieck() {
		
	}

	public Point getEckeA() {
		return eckeA;
	}

	public void setEckeA(Point eckeA) {
		this.eckeA = eckeA;
	}

	public Point getEckeB() {
		return eckeB;
	}

	public void setEckeB(Point eckeB) {
		System.out.println(eckeB.getY());
		this.eckeB = eckeB;
		System.out.println(this.eckeB.getY());
	}

	public Point getEckeC() {
		return eckeC;
	}

	public void setEckeC(Point eckeC) {
		this.eckeC = eckeC;
	}

	public double getSeiteA() {
		return seiteA;
	}

	public void setSeiteA(double seiteA) {
		this.seiteA = seiteA;
	}

	public double getSeiteB() {
		return seiteB;
	}

	public void setSeiteB(double seiteB) {
		this.seiteB = seiteB;
	}

	public double getSeiteC() {
		return seiteC;
	}

	public void setSeiteC(double seiteC) {
		this.seiteC = seiteC;
	}

	public double getAlpha() {
		return alpha;
	}

	public void setAlpha(double alpha) {
		this.alpha = alpha;
	}

	public double getBeta() {
		return beta;
	}

	public void setBeta(double beta) {
		this.beta = beta;
	}

	public double getGamma() {
		return gamma;
	}

	public void setGamma(double gamma) {
		this.gamma = gamma;
	}
	
	
	
}
