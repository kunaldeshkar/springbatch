package com.kdr;

public class CurrencyConversion {

	private Long id;
	private String from;
	private String to;
	private Long conversionMultiple;
	private Long quantity;
	private Long totalAmount;
	private int port;
	
	public CurrencyConversion() {
		// TODO Auto-generated constructor stub
	}

	public CurrencyConversion(Long id, String from, String to, Long conversionMultiple, Long quantity, Long totalAmount,
			int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.quantity = quantity;
		this.totalAmount = totalAmount;
		this.port = port;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public Long getconversionMultiple() {
		return conversionMultiple;
	}

	public void setconversionMultiple(Long conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Long getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	
	
}
