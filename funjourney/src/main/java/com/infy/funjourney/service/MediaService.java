package com.infy.funjourney.service;

import java.util.List;

import com.infy.funjourney.model.Media;
import com.infy.funjourney.repository.MediaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MediaService {

    @Autowired
    private MediaRepository mediaRepository;

    public Media addMedia(Media media) {
        return mediaRepository.insert(media);
    }

    public List<Media> filterByGenre(String genre) {
        return this.mediaRepository.filterByGenre(genre);
        
    }

    public List<Media> filterByType(String type) {
        return this.mediaRepository.filterByType(type);

    }

}