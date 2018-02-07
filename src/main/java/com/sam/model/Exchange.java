/**
 * Exchange
 *
 * v1.0
 *
 * 2018-02-06
 * 
 * This code is copyright (c) sandeep.
 */
package com.sam.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author sandeep.
 *
 */
@Entity
public class Exchange extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 942335082576057707L;

	@Column(nullable = false, length = 50, unique = true)
	@Size(min = 1, max = 50)
	@NotNull
	private String name;

	@Column(length = 300)
	@Size(min = 0, max = 300)
	private String comments;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "exchange", orphanRemoval = true)
	private List<Buy> buys;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "exchange", orphanRemoval = true)
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
		Exchange other = (Exchange) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
