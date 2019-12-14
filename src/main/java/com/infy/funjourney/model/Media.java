package com.infy.funjourney.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Document
@NoArgsConstructor
public class Media {

    @Id
    @Getter
    @Setter
    String id;

    @Getter
    @Setter
    String name;

    @Getter
    @Setter
    String type;

    @Getter
    @Setter
    Integer duration;

    @Getter
    @Setter
    String certification;

    @Getter
    @Setter
    String url;

    @Getter
    @Setter
    String genre;

    @Getter
    @Setter
    String photoUrl;

	@Override
	public String toString() {
		return "Media [id=" + id + ", name=" + name + ", type=" + type + ", duration=" + duration + ", certification="
				+ certification + ", url=" + url + ", genre=" + genre + ", photoUrl=" + photoUrl + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getCertification() {
		return certification;
	}

	public void setCertification(String certification) {
		this.certification = certification;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
    
    

}