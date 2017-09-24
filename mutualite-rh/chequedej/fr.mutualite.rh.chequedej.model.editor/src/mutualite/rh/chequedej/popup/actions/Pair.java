package mutualite.rh.chequedej.popup.actions;

public class Pair<T, U> {
	private T t;
	private U u;

	public Pair(T t, U u) {
		super();
		this.t = t;
		this.u = u;
	}

	public T get1() {
		return t;
	}

	public U get2() {
		return u;
	}

}