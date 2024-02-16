package org.example;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "RequestInfo")
@Getter
@Setter
public class RequestInfo {

    @XmlElement(name = "Tenant")
    private String tenant;

    @XmlElement(name = "Client")
    private String client;

    @XmlElement(name = "TeamSiteName")
    private String teamSiteName;

    @XmlElement(name = "IpAddress")
    private String ipAddress;

    @XmlElement(name = "Timestamp")
    private String timestamp;

    @XmlElement(name = "User")
    private User user;

    @XmlElement(name = "ContextInfo")
    private ContextInfo contextInfo;

    // Getters and setters for each field are omitted for brevity
}
