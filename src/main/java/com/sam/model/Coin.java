/**
 * Coin
 *
 * v1.0
 *
 * 2018-02-06
 * 
 * This code is copyright (c) sandeep.
 */
package com.sam.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author sandeep
 *
 */
@Entity
public class Coin extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 2980602781144882343L;

	@Column(nullable = false, length = 50, unique = true)
	@Size(min = 1, max = 50)
	@NotNull
	private String name;

	@Column(nullable = false, length = 10, unique = true)
	@Size(min = 1, max = 10)
	@NotNull
	private String code;

	@Column(nullable = false, precision = 10, scale = 5)
	@Digits(integer = 5, fraction = 5)
	@NotNull
	private BigDecimal currentPrice;

	private Long marketCap;

	@Column(length = 300)
	@Size(min = 0, max = 300)
	private String comments;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "coin")
	private List<Buy> buys;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the currentPrice
	 */
	public BigDecimal getCurrentPrice() {
		return currentPrice;
	}

	/**
	 * @param currentPrice
	 *            the currentPrice to set
	 */
	public void setCurrentPrice(BigDecimal currentPrice) {
		this.currentPrice = currentPrice;
	}

	/**
	 * @return the marketCap
	 */
	public Long getMarketCap() {
		return marketCap;
	}

	/**
	 * @param marketCap
	 *            the marketCap to set
	 */
	public void setMarketCap(Long marketCap) {
		this.marketCap = marketCap;
	}

	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * @param comments
	 *            the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}

	/**
	 * @return the buys
	 */
	public List<Buy> getBuys() {
		return buys;
	}

	/**
	 * @param buys
	 *            the buys to set
	 */
	public void setBuys(List<Buy> buys) {
		this.buys = buys;
	}

}
