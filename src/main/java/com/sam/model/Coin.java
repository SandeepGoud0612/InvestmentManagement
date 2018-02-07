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

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "coin")
	private List<Sell> sells;

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

	/**
	 * @return the sells
	 */
	public List<Sell> getSells() {
		return sells;
	}

	/**
	 * @param sells the sells to set
	 */
	public void setSells(List<Sell> sells) {
		this.sells = sells;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((comments == null) ? 0 : comments.hashCode());
		result = prime * result + ((currentPrice == null) ? 0 : currentPrice.hashCode());
		result = prime * result + ((marketCap == null) ? 0 : marketCap.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coin other = (Coin) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (comments == null) {
			if (other.comments != null)
				return false;
		} else if (!comments.equals(other.comments))
			return false;
		if (currentPrice == null) {
			if (other.currentPrice != null)
				return false;
		} else if (!currentPrice.equals(other.currentPrice))
			return false;
		if (marketCap == null) {
			if (other.marketCap != null)
				return false;
		} else if (!marketCap.equals(other.marketCap))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
