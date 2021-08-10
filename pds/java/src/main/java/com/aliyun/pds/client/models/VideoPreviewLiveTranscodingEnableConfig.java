// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds.client.models;

import com.aliyun.tea.*;

/**
 * 
 */
public class VideoPreviewLiveTranscodingEnableConfig extends TeaModel {
    @NameInMap("drop_file_created_event")
    public Boolean dropFileCreatedEvent;

    @NameInMap("enable_ignore_copied_file")
    public Boolean enableIgnoreCopiedFile;

    public static VideoPreviewLiveTranscodingEnableConfig build(java.util.Map<String, ?> map) throws Exception {
        VideoPreviewLiveTranscodingEnableConfig self = new VideoPreviewLiveTranscodingEnableConfig();
        return TeaModel.build(map, self);
    }

    public VideoPreviewLiveTranscodingEnableConfig setDropFileCreatedEvent(Boolean dropFileCreatedEvent) {
        this.dropFileCreatedEvent = dropFileCreatedEvent;
        return this;
    }
    public Boolean getDropFileCreatedEvent() {
        return this.dropFileCreatedEvent;
    }

    public VideoPreviewLiveTranscodingEnableConfig setEnableIgnoreCopiedFile(Boolean enableIgnoreCopiedFile) {
        this.enableIgnoreCopiedFile = enableIgnoreCopiedFile;
        return this;
    }
    public Boolean getEnableIgnoreCopiedFile() {
        return this.enableIgnoreCopiedFile;
    }

}