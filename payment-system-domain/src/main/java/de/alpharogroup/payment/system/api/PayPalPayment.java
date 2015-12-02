package de.alpharogroup.payment.system.api;

/**
 * The interface {@link PayPalPayment}.
 */
public interface PayPalPayment extends Payment {
	
	/**
	 * Gets the username of the paypal account
	 *
	 * @return the username
	 */
	String getUsername();
	
	/**
	 * Sets the username of the paypal account
	 *
	 * @param username the new username
	 */
	void setUsername(String username);
}