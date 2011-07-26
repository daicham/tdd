class Dollar extends Money {

	Dollar(int amount) {
		this.amount = amount;
	}

	Money times(int multiplier) {
		return new Dollar(amount * multiplier);
	}

	@Override
	public boolean equals(Object object) {
		Money dollar = (Money) object;
		return amount == dollar.amount;
	}
}
