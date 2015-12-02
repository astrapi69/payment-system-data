package de.alpharogroup.payment.system.api;

/**
 * The interface {@link CreditCardPayment}.
 */
public interface CreditCardPayment extends Payment {
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	String getName();
	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	void setName(String name);
	
	/**
	 * Gets the card.
	 *
	 * @return the card
	 */
	String getCard();
	
	/**
	 * Sets the card.
	 *
	 * @param card the new card
	 */
	void setCard(String card);
	
	/**
	 * Gets the ccv.
	 *
	 * @return the ccv
	 */
	String getCcv();
	
	/**
	 * Sets the ccv.
	 *
	 * @param ccv the new ccv
	 */
	void setCcv(String ccv);

}