package com.example.feignclient.controller;

import com.example.feignclient.dto.VideoApiDto;
import com.example.feignclient.repository.VideoApiProxy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VideoApiController {

    private final VideoApiProxy videoApiProxy;

    public VideoApiController(VideoApiProxy videoApiProxy) {
        this.videoApiProxy = videoApiProxy;
    }

    @GetMapping("/start")
    public List<VideoApiDto> getVideos() {
        return videoApiProxy.getVideos();
    }


}
