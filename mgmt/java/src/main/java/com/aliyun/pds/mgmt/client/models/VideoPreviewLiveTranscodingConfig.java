// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds.mgmt.client.models;

import com.aliyun.tea.*;

/**
 * domain config --------
 */
public class VideoPreviewLiveTranscodingConfig extends TeaModel {
    @NameInMap("current_version")
    public Long currentVersion;

    @NameInMap("deprecated_version")
    public Long deprecatedVersion;

    @NameInMap("detail_count_limit")
    public Long detailCountLimit;

    @NameInMap("enabled")
    public Boolean enabled;

    @NameInMap("imm_project_map")
    public java.util.Map<String, ?> immProjectMap;

    @NameInMap("leading_prefix")
    public String leadingPrefix;

    @NameInMap("m3u8_file_prefix")
    public String m3u8FilePrefix;

    @NameInMap("media_duration_limit")
    public Double mediaDurationLimit;

    @NameInMap("segment")
    public Long segment;

    @NameInMap("template_list")
    public java.util.List<String> templateList;

    // Mode              string   `json:"mode"`               // 默认media模式
    // 以下几个count需要根据task的status和stage来判断, 当前实时转码的状态
    @NameInMap("ts_count_when_init_m3u8")
    public Long tsCountWhenInitM3u8;

    @NameInMap("ts_count_when_ts_404")
    public Long tsCountWhenTs404;

    @NameInMap("ts_file_prefix")
    public String tsFilePrefix;

    public static VideoPreviewLiveTranscodingConfig build(java.util.Map<String, ?> map) throws Exception {
        VideoPreviewLiveTranscodingConfig self = new VideoPreviewLiveTranscodingConfig();
        return TeaModel.build(map, self);
    }

    public VideoPreviewLiveTranscodingConfig setCurrentVersion(Long currentVersion) {
        this.currentVersion = currentVersion;
        return this;
    }
    public Long getCurrentVersion() {
        return this.currentVersion;
    }

    public VideoPreviewLiveTranscodingConfig setDeprecatedVersion(Long deprecatedVersion) {
        this.deprecatedVersion = deprecatedVersion;
        return this;
    }
    public Long getDeprecatedVersion() {
        return this.deprecatedVersion;
    }

    public VideoPreviewLiveTranscodingConfig setDetailCountLimit(Long detailCountLimit) {
        this.detailCountLimit = detailCountLimit;
        return this;
    }
    public Long getDetailCountLimit() {
        return this.detailCountLimit;
    }

    public VideoPreviewLiveTranscodingConfig setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public VideoPreviewLiveTranscodingConfig setImmProjectMap(java.util.Map<String, ?> immProjectMap) {
        this.immProjectMap = immProjectMap;
        return this;
    }
    public java.util.Map<String, ?> getImmProjectMap() {
        return this.immProjectMap;
    }

    public VideoPreviewLiveTranscodingConfig setLeadingPrefix(String leadingPrefix) {
        this.leadingPrefix = leadingPrefix;
        return this;
    }
    public String getLeadingPrefix() {
        return this.leadingPrefix;
    }

    public VideoPreviewLiveTranscodingConfig setM3u8FilePrefix(String m3u8FilePrefix) {
        this.m3u8FilePrefix = m3u8FilePrefix;
        return this;
    }
    public String getM3u8FilePrefix() {
        return this.m3u8FilePrefix;
    }

    public VideoPreviewLiveTranscodingConfig setMediaDurationLimit(Double mediaDurationLimit) {
        this.mediaDurationLimit = mediaDurationLimit;
        return this;
    }
    public Double getMediaDurationLimit() {
        return this.mediaDurationLimit;
    }

    public VideoPreviewLiveTranscodingConfig setSegment(Long segment) {
        this.segment = segment;
        return this;
    }
    public Long getSegment() {
        return this.segment;
    }

    public VideoPreviewLiveTranscodingConfig setTemplateList(java.util.List<String> templateList) {
        this.templateList = templateList;
        return this;
    }
    public java.util.List<String> getTemplateList() {
        return this.templateList;
    }

    public VideoPreviewLiveTranscodingConfig setTsCountWhenInitM3u8(Long tsCountWhenInitM3u8) {
        this.tsCountWhenInitM3u8 = tsCountWhenInitM3u8;
        return this;
    }
    public Long getTsCountWhenInitM3u8() {
        return this.tsCountWhenInitM3u8;
    }

    public VideoPreviewLiveTranscodingConfig setTsCountWhenTs404(Long tsCountWhenTs404) {
        this.tsCountWhenTs404 = tsCountWhenTs404;
        return this;
    }
    public Long getTsCountWhenTs404() {
        return this.tsCountWhenTs404;
    }

    public VideoPreviewLiveTranscodingConfig setTsFilePrefix(String tsFilePrefix) {
        this.tsFilePrefix = tsFilePrefix;
        return this;
    }
    public String getTsFilePrefix() {
        return this.tsFilePrefix;
    }

}