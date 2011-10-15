class Money implements Expression {

	protected int amount;
	protected String currency;

	Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	@Override
	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount && currency().equals(money.currency());
	}

	Expression times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}

	static Money dollar(int amount) {
		return new Money(amount, "USD");
	}

	static Money franc(int amount) {
		return new Money(amount, "CHF");
	}

	protected String currency() {
		return currency;
	}

	@Override
	public String toString() {
		return amount + " " + currency;
	}

	public Expression plus(Expression addend) {
		return new Sum(this, addend);
	}

	@Override
	public Money reduce(Bank bank, String to) {
		int rate = bank.rate(currency, to);
		return new Money(amount / rate, to);
	}
}
