package com.rabbit.ssm.domain.model.mybatis;

import com.baomidou.mybatisplus.annotations.TableName;

import java.util.Date;
@TableName("app")
public class AppDO {
    private Integer id;

    private String adsType;

    private Long bytes;

    private Date createDatetime;

    private String developerEmail;

    private String developerIntro;

    private String developerName;

    private String developerWebsite;

    private Long downloadCount;

    private String downloadCountStr;

    private String downloadUrl;

    private Long installedCount;

    private String installedCountStr;

    private String language;

    private Integer likesRate;

    private Integer minSdkVersion;

    private Integer outputNo;

    private String packageName;

    private Date publishDate;

    private Integer recommendDiv;

    private String tagline;

    private String title;

    private Integer versionCode;

    private String versionName;

    private Integer typeId;

    private Integer status;

    private Integer recommendOutputNo;

    private String searchTag;

    private Integer temp;

    private String filePath;

    private String zlAppcol;

    private String vendor;

    private Integer point;

    private String appId;

    private String md5;

    private Integer gameId;

    private String packageId;

    private Date updateDatetime;

    private String changelog;

    private String description;

    private String realDownloadUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdsType() {
        return adsType;
    }

    public void setAdsType(String adsType) {
        this.adsType = adsType == null ? null : adsType.trim();
    }

    public Long getBytes() {
        return bytes;
    }

    public void setBytes(Long bytes) {
        this.bytes = bytes;
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    public String getDeveloperEmail() {
        return developerEmail;
    }

    public void setDeveloperEmail(String developerEmail) {
        this.developerEmail = developerEmail == null ? null : developerEmail.trim();
    }

    public String getDeveloperIntro() {
        return developerIntro;
    }

    public void setDeveloperIntro(String developerIntro) {
        this.developerIntro = developerIntro == null ? null : developerIntro.trim();
    }

    public String getDeveloperName() {
        return developerName;
    }

    public void setDeveloperName(String developerName) {
        this.developerName = developerName == null ? null : developerName.trim();
    }

    public String getDeveloperWebsite() {
        return developerWebsite;
    }

    public void setDeveloperWebsite(String developerWebsite) {
        this.developerWebsite = developerWebsite == null ? null : developerWebsite.trim();
    }

    public Long getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(Long downloadCount) {
        this.downloadCount = downloadCount;
    }

    public String getDownloadCountStr() {
        return downloadCountStr;
    }

    public void setDownloadCountStr(String downloadCountStr) {
        this.downloadCountStr = downloadCountStr == null ? null : downloadCountStr.trim();
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl == null ? null : downloadUrl.trim();
    }

    public Long getInstalledCount() {
        return installedCount;
    }

    public void setInstalledCount(Long installedCount) {
        this.installedCount = installedCount;
    }

    public String getInstalledCountStr() {
        return installedCountStr;
    }

    public void setInstalledCountStr(String installedCountStr) {
        this.installedCountStr = installedCountStr == null ? null : installedCountStr.trim();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public Integer getLikesRate() {
        return likesRate;
    }

    public void setLikesRate(Integer likesRate) {
        this.likesRate = likesRate;
    }

    public Integer getMinSdkVersion() {
        return minSdkVersion;
    }

    public void setMinSdkVersion(Integer minSdkVersion) {
        this.minSdkVersion = minSdkVersion;
    }

    public Integer getOutputNo() {
        return outputNo;
    }

    public void setOutputNo(Integer outputNo) {
        this.outputNo = outputNo;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName == null ? null : packageName.trim();
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public Integer getRecommendDiv() {
        return recommendDiv;
    }

    public void setRecommendDiv(Integer recommendDiv) {
        this.recommendDiv = recommendDiv;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline == null ? null : tagline.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName == null ? null : versionName.trim();
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getRecommendOutputNo() {
        return recommendOutputNo;
    }

    public void setRecommendOutputNo(Integer recommendOutputNo) {
        this.recommendOutputNo = recommendOutputNo;
    }

    public String getSearchTag() {
        return searchTag;
    }

    public void setSearchTag(String searchTag) {
        this.searchTag = searchTag == null ? null : searchTag.trim();
    }

    public Integer getTemp() {
        return temp;
    }

    public void setTemp(Integer temp) {
        this.temp = temp;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    public String getZlAppcol() {
        return zlAppcol;
    }

    public void setZlAppcol(String zlAppcol) {
        this.zlAppcol = zlAppcol == null ? null : zlAppcol.trim();
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor == null ? null : vendor.trim();
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5 == null ? null : md5.trim();
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId == null ? null : packageId.trim();
    }

    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    public String getChangelog() {
        return changelog;
    }

    public void setChangelog(String changelog) {
        this.changelog = changelog == null ? null : changelog.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getRealDownloadUrl() {
        return realDownloadUrl;
    }

    public void setRealDownloadUrl(String realDownloadUrl) {
        this.realDownloadUrl = realDownloadUrl == null ? null : realDownloadUrl.trim();
    }
}