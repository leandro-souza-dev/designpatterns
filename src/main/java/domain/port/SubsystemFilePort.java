package domain.port;

import domain.video.FileVideo;

public interface SubsystemFilePort {
    void exportFile(FileVideo fileVideo);
}
