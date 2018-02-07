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
	 * @param buys the buys to set
	 */
	public void setBuys(List<Buy> buys) {
		this.buys = buys;
	}
	
}
