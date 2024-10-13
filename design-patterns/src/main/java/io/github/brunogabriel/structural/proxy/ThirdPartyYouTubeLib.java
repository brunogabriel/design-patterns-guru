package io.github.brunogabriel.structural.proxy;

import io.github.brunogabriel.structural.proxy.model.Video;

import java.util.HashMap;

public interface ThirdPartyYouTubeLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}
