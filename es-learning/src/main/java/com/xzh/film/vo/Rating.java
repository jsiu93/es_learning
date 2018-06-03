package com.xzh.film.vo;

/**
 * Auto-generated: 2018-01-22 17:28:37
 *
 * @author www.jsons.cn
 * @website http://www.jsons.cn/json2java/
 */
public class Rating {

	private int max;
	private int value;
	private int min;
	private Double average;

	private String stars;

	public String getStars() {
		return stars;
	}

	public void setStars(String stars) {
		this.stars = stars;
	}

	public Double getAverage() {
		return average;
	}

	public void setAverage(Double average) {
		this.average = average;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getMax() {
		return max;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMin() {
		return min;
	}

}