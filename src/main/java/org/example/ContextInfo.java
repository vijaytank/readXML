package org.example;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ContextInfo")
@Getter
@Setter
public class ContextInfo {

    @XmlElement(name = "ExternalSystemTypes")
    private String externalSystemTypes;

    @XmlElement(name = "ExternalContextId")
    private String externalContextId;

    @XmlElement(name = "ExternalContextType")
    private String externalContextType;

    @XmlElement(name = "ExternalContextName")
    private String externalContextName;

    // Getters and setters for each field are omitted for brevity
}
