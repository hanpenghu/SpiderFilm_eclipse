package com.you_fuli.spiderFilm.dto;

public class SpiderFilmlistOrg {
    private Long id;

    private String filmid;

    private String filmname;

    private String englishname;

    private String language;

    private String duration;

    private String dimensional;

    private String country;

    private String director;

    private String actor;

    private String openingdate;

    private String catalog;

    private String picture;

    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFilmid() {
        return filmid;
    }

    public void setFilmid(String filmid) {
        this.filmid = filmid == null ? null : filmid.trim();
    }

    public String getFilmname() {
        return filmname;
    }

    public void setFilmname(String filmname) {
        this.filmname = filmname == null ? null : filmname.trim();
    }

    public String getEnglishname() {
        return englishname;
    }

    public void setEnglishname(String englishname) {
        this.englishname = englishname == null ? null : englishname.trim();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration == null ? null : duration.trim();
    }

    public String getDimensional() {
        return dimensional;
    }

    public void setDimensional(String dimensional) {
        this.dimensional = dimensional == null ? null : dimensional.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director == null ? null : director.trim();
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor == null ? null : actor.trim();
    }

    public String getOpeningdate() {
        return openingdate;
    }

    public void setOpeningdate(String openingdate) {
        this.openingdate = openingdate == null ? null : openingdate.trim();
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog == null ? null : catalog.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SpiderFilmlistOrg [id=");
		builder.append(id);
		builder.append(", filmid=");
		builder.append(filmid);
		builder.append(", filmname=");
		builder.append(filmname);
		builder.append(", englishname=");
		builder.append(englishname);
		builder.append(", language=");
		builder.append(language);
		builder.append(", duration=");
		builder.append(duration);
		builder.append(", dimensional=");
		builder.append(dimensional);
		builder.append(", country=");
		builder.append(country);
		builder.append(", director=");
		builder.append(director);
		builder.append(", actor=");
		builder.append(actor);
		builder.append(", openingdate=");
		builder.append(openingdate);
		builder.append(", catalog=");
		builder.append(catalog);
		builder.append(", picture=");
		builder.append(picture);
		builder.append(", description=");
		builder.append(description);
		builder.append("]");
		return builder.toString();
	}
    
    
}