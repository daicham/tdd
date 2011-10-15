import java.util.Hashtable;

public class Bank {
	private Hashtable<Pair, Integer> rates = new Hashtable<Pair, Integer>();

	Money reduce(Expression source, String to) {
		return source.reduce(this, to);
	}

	public void addRate(String from, String to, int rate) {
		rates.put(new Pair(from, to), rate);
	}

	public int rate(String from, String to) {
		return rates.get(new Pair(from, to));
	}

	private class Pair {
		private String from;
		private String to;

		Pair(String from, String to) {
			this.from = from;
			this.to = to;
		}

		@Override
		public boolean equals(Object obj) {
			Pair pair = (Pair) obj;
			return from.equals(pair.from) && to.equals(pair.to);
		}
		@Override
		public int hashCode() {
			return 0;
		}
	}
}
