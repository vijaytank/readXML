package org.example;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ContentInfo")
@Getter
@Setter
public class ContentInfo {

    @XmlElement(name = "Id")
    private String id;

    @XmlElement(name = "ContentTypeId")
    private int contentTypeId;

    @XmlElement(name = "Type")
    private String type;

    @XmlElement(name = "Name")
    private String name;

    @XmlElement(name = "Description")
    private String description;

    @XmlElement(name = "IsPersonalContent")
    private boolean isPersonalContent;

    @XmlElement(name = "IsCollaborationContent")
    private boolean isCollaborationContent;

    @XmlElement(name = "CreatedBy")
    private String createdBy;

    @XmlElement(name = "CreatedOn")
    private String createdOn;

    @XmlElement(name = "LastUpdate")
    private String lastUpdate;

    @XmlElement(name = "VersionId")
    private String versionId;

    @XmlElement(name = "Version")
    private double version;

    @XmlElement(name = "VersionCreatedOn")
    private String versionCreatedOn;

    @XmlElement(name = "PromotedBy")
    private String promotedBy;

    @XmlElement(name = "ExternalURL")
    private String externalURL;

    @XmlElement(name = "ContentExpiredInfo")
    private String contentExpiredInfo;

}