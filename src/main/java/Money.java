abstract class Money {

	protected int amount;
	protected String currency;

	@Override
	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount && getClass().equals(money.getClass());
	}

	abstract Money times(int multiplier);

	static Dollar dollar(int amount) {
		return new Dollar(amount);
	}

	static Franc franc(int amount) {
		return new Franc(amount);
	}

	protected String currency() {
		return currency;
	}

}
