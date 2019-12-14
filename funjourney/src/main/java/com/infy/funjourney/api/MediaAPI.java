package com.infy.funjourney.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.infy.funjourney.model.Media;
import com.infy.funjourney.service.MediaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/api/media")
public class MediaAPI {

    @Autowired
    private MediaService mediaService;

    @PostMapping(value="/add")
    public Media addMedia(@RequestBody Media media) {
        return mediaService.addMedia(media);
    }

    @GetMapping(value="/genre/{genre}")
    public List<Media> getMediaByGenre(@PathVariable(value = "genre") String genre) {
        return this.mediaService.filterByGenre(genre);
    }

    @GetMapping(value = "/type/{type}")
    public List<Media> getMediaByType(@PathVariable(value = "type") String type) {
        return this.mediaService.filterByType(type);
    }

    @GetMapping(value = "/name/{name}")
    public Media getMediaByName(@PathVariable("name") String name) {
        return this.mediaService.findMediaByName(name);
    }


        

}