package com.xzh.film.vo;

import java.util.List;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Auto-generated: 2018-01-22 17:28:37
 *
 * @author www.jsons.cn
 * @website http://www.jsons.cn/json2java/
 */
public class MovieItemVO {

	private Rating rating;
	@JsonProperty("reviews_count")
	private int reviewsCount;
	private List<String> videos;
	@JsonProperty("wish_count")
	private int wishCount;
	@JsonProperty("original_title")
	private String originalTitle;
	@JsonProperty("blooper_urls")
	private List<String> blooperUrls;
	@JsonProperty("collect_count")
	private int collectCount;
	private Images images;
	@JsonProperty("douban_site")
	private String doubanSite;
	private String year;
	@JsonProperty("popular_comments")
	private List<PopularComments> popularComments;
	private String alt;
	private String id;
	@JsonProperty("mobile_url")
	private String mobileUrl;
	@JsonProperty("photos_count")
	private int photosCount;
	private String pubdate;
	private String title;
	@JsonProperty("do_count")
	private String doCount;
	@JsonProperty("seasons_count")
	private String seasonsCount;
	private List<String> languages;
	private List<Writers> writers;
	private List<String> pubdates;
	private String website;
	private List<String> tags;
	private List<String> durations;
	private List<String> genres;
	private String collection;
	@JsonProperty("episodes_count")
	private String episodesCount;
	@JsonProperty("current_season")
	private String currentSeason;
	private List<Casts> casts;
	private List<String> countries;
	@JsonProperty("mainland_pubdate")
	private String mainlandPubdate;
	private List<Photos> photos;
	private String summary;
	private String subtype;
	private List<Directors> directors;
	@JsonProperty("comments_count")
	private int commentsCount;
	@JsonProperty("popular_reviews")
	private List<PopularReviews> popularReviews;
	@JsonProperty("ratings_count")
	private int ratingsCount;
	private List<String> aka;

	public void setRating(Rating rating) {
		this.rating = rating;
	}

	public Rating getRating() {
		return rating;
	}

	public void setReviewsCount(int reviewsCount) {
		this.reviewsCount = reviewsCount;
	}

	public int getReviewsCount() {
		return reviewsCount;
	}

	public void setVideos(List<String> videos) {
		this.videos = videos;
	}

	public List<String> getVideos() {
		return videos;
	}

	public void setWishCount(int wishCount) {
		this.wishCount = wishCount;
	}

	public int getWishCount() {
		return wishCount;
	}

	public void setOriginalTitle(String originalTitle) {
		this.originalTitle = originalTitle;
	}

	public String getOriginalTitle() {
		return originalTitle;
	}

	public void setBlooperUrls(List<String> blooperUrls) {
		this.blooperUrls = blooperUrls;
	}

	public List<String> getBlooperUrls() {
		return blooperUrls;
	}

	public void setCollectCount(int collectCount) {
		this.collectCount = collectCount;
	}

	public int getCollectCount() {
		return collectCount;
	}

	public void setImages(Images images) {
		this.images = images;
	}

	public Images getImages() {
		return images;
	}

	public void setDoubanSite(String doubanSite) {
		this.doubanSite = doubanSite;
	}

	public String getDoubanSite() {
		return doubanSite;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getYear() {
		return year;
	}

	public void setPopularComments(List<PopularComments> popularComments) {
		this.popularComments = popularComments;
	}

	public List<PopularComments> getPopularComments() {
		return popularComments;
	}

	public void setAlt(String alt) {
		this.alt = alt;
	}

	public String getAlt() {
		return alt;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setMobileUrl(String mobileUrl) {
		this.mobileUrl = mobileUrl;
	}

	public String getMobileUrl() {
		return mobileUrl;
	}

	public void setPhotosCount(int photosCount) {
		this.photosCount = photosCount;
	}

	public int getPhotosCount() {
		return photosCount;
	}

	public void setPubdate(String pubdate) {
		this.pubdate = pubdate;
	}

	public String getPubdate() {
		return pubdate;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setDoCount(String doCount) {
		this.doCount = doCount;
	}

	public String getDoCount() {
		return doCount;
	}

	public void setSeasonsCount(String seasonsCount) {
		this.seasonsCount = seasonsCount;
	}

	public String getSeasonsCount() {
		return seasonsCount;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

	public List<String> getLanguages() {
		return languages;
	}

	public void setWriters(List<Writers> writers) {
		this.writers = writers;
	}

	public List<Writers> getWriters() {
		return writers;
	}

	public void setPubdates(List<String> pubdates) {
		this.pubdates = pubdates;
	}

	public List<String> getPubdates() {
		return pubdates;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getWebsite() {
		return website;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setDurations(List<String> durations) {
		this.durations = durations;
	}

	public List<String> getDurations() {
		return durations;
	}

	public void setGenres(List<String> genres) {
		this.genres = genres;
	}

	public List<String> getGenres() {
		return genres;
	}

	public void setCollection(String collection) {
		this.collection = collection;
	}

	public String getCollection() {
		return collection;
	}

	public void setEpisodesCount(String episodesCount) {
		this.episodesCount = episodesCount;
	}

	public String getEpisodesCount() {
		return episodesCount;
	}

	public void setCurrentSeason(String currentSeason) {
		this.currentSeason = currentSeason;
	}

	public String getCurrentSeason() {
		return currentSeason;
	}

	public void setCasts(List<Casts> casts) {
		this.casts = casts;
	}

	public List<Casts> getCasts() {
		return casts;
	}

	public void setCountries(List<String> countries) {
		this.countries = countries;
	}

	public List<String> getCountries() {
		return countries;
	}

	public void setMainlandPubdate(String mainlandPubdate) {
		this.mainlandPubdate = mainlandPubdate;
	}

	public String getMainlandPubdate() {
		return mainlandPubdate;
	}

	public void setPhotos(List<Photos> photos) {
		this.photos = photos;
	}

	public List<Photos> getPhotos() {
		return photos;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getSummary() {
		return summary;
	}


	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}

	public String getSubtype() {
		return subtype;
	}

	public void setDirectors(List<Directors> directors) {
		this.directors = directors;
	}

	public List<Directors> getDirectors() {
		return directors;
	}

	public void setCommentsCount(int commentsCount) {
		this.commentsCount = commentsCount;
	}

	public int getCommentsCount() {
		return commentsCount;
	}

	public void setPopularReviews(List<PopularReviews> popularReviews) {
		this.popularReviews = popularReviews;
	}

	public List<PopularReviews> getPopularReviews() {
		return popularReviews;
	}

	public void setRatingsCount(int ratingsCount) {
		this.ratingsCount = ratingsCount;
	}

	public int getRatingsCount() {
		return ratingsCount;
	}

	public void setAka(List<String> aka) {
		this.aka = aka;
	}

	public List<String> getAka() {
		return aka;
	}

}