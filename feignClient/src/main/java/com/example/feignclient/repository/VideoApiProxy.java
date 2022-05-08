package com.example.feignclient.repository;


import com.example.feignclient.dto.VideoApiDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("VIDEOAPI-SERVICE")
public interface VideoApiProxy {

    @GetMapping("/videos")
    List<VideoApiDto> getVideos();
}
