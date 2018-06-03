package com.xzh.entity;

import java.util.Date;

import javax.persistence.Id;

public class Film {
	@Id
	private String id;

	private String itemId;

	private String title;

	private String originalTitle;

	private String aka;

	private String tags;

	private String alt;

	private Integer min;

	private Integer max;

	private Double average;

	private String stars;

	private String pubdate;

	private String mainlandPubdate;

	private Integer commentsCount;

	private Integer reviewsCount;

	private Integer ratingsCount;

	private Integer wishCount;

	private Integer collectCount;

	private Integer doCount;

	private String subtype;

	private String writers;

	private String year;

	private String languages;

	private String durations;

	private String genres;

	private String countries;

	private Date ctime;

	private Date utime;

	private String casts;

	private String directors;

	private String summary;

	private String popularComments;

	public String getId() {
		return id;
	}

	public String getMainlandPubdate() {
		return mainlandPubdate;
	}

	public void setMainlandPubdate(String mainlandPubdate) {
		this.mainlandPubdate = mainlandPubdate;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId == null ? null : itemId.trim();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}

	public String getOriginalTitle() {
		return originalTitle;
	}

	public void setOriginalTitle(String originalTitle) {
		this.originalTitle = originalTitle == null ? null : originalTitle.trim();
	}

	public String getAka() {
		return aka;
	}

	public void setAka(String aka) {
		this.aka = aka == null ? null : aka.trim();
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags == null ? null : tags.trim();
	}

	public String getAlt() {
		return alt;
	}

	public void setAlt(String alt) {
		this.alt = alt == null ? null : alt.trim();
	}

	public Integer getMin() {
		return min;
	}

	public void setMin(Integer min) {
		this.min = min;
	}

	public Integer getMax() {
		return max;
	}

	public void setMax(Integer max) {
		this.max = max;
	}

	public Double getAverage() {
		return average;
	}

	public void setAverage(Double average) {
		this.average = average;
	}

	public String getStars() {
		return stars;
	}

	public void setStars(String stars) {
		this.stars = stars == null ? null : stars.trim();
	}

	public String getPubdate() {
		return pubdate;
	}

	public void setPubdate(String pubdate) {
		this.pubdate = pubdate == null ? null : pubdate.trim();
	}

	public Integer getCommentsCount() {
		return commentsCount;
	}

	public void setCommentsCount(Integer commentsCount) {
		this.commentsCount = commentsCount;
	}

	public Integer getReviewsCount() {
		return reviewsCount;
	}

	public void setReviewsCount(Integer reviewsCount) {
		this.reviewsCount = reviewsCount;
	}

	public Integer getRatingsCount() {
		return ratingsCount;
	}

	public void setRatingsCount(Integer ratingsCount) {
		this.ratingsCount = ratingsCount;
	}

	public Integer getWishCount() {
		return wishCount;
	}

	public void setWishCount(Integer wishCount) {
		this.wishCount = wishCount;
	}

	public Integer getCollectCount() {
		return collectCount;
	}

	public void setCollectCount(Integer collectCount) {
		this.collectCount = collectCount;
	}

	public Integer getDoCount() {
		return doCount;
	}

	public void setDoCount(Integer doCount) {
		this.doCount = doCount;
	}

	public String getSubtype() {
		return subtype;
	}

	public void setSubtype(String subtype) {
		this.subtype = subtype == null ? null : subtype.trim();
	}

	public String getWriters() {
		return writers;
	}

	public void setWriters(String writers) {
		this.writers = writers == null ? null : writers.trim();
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year == null ? null : year.trim();
	}

	public String getLanguages() {
		return languages;
	}

	public void setLanguages(String languages) {
		this.languages = languages == null ? null : languages.trim();
	}

	public String getDurations() {
		return durations;
	}

	public void setDurations(String durations) {
		this.durations = durations == null ? null : durations.trim();
	}

	public String getGenres() {
		return genres;
	}

	public void setGenres(String genres) {
		this.genres = genres == null ? null : genres.trim();
	}

	public String getCountries() {
		return countries;
	}

	public void setCountries(String countries) {
		this.countries = countries == null ? null : countries.trim();
	}

	public Date getCtime() {
		return ctime;
	}

	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}

	public Date getUtime() {
		return utime;
	}

	public void setUtime(Date utime) {
		this.utime = utime;
	}

	public String getCasts() {
		return casts;
	}

	public void setCasts(String casts) {
		this.casts = casts == null ? null : casts.trim();
	}

	public String getDirectors() {
		return directors;
	}

	public void setDirectors(String directors) {
		this.directors = directors == null ? null : directors.trim();
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary == null ? null : summary.trim();
	}

	public String getPopularComments() {
		return popularComments;
	}

	public void setPopularComments(String popularComments) {
		this.popularComments = popularComments == null ? null : popularComments.trim();
	}
}