package org.example;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "FileInfo")
@Getter
@Setter
public class FileInfo {

    @XmlElement(name = "FileName")
    private String fileName;

    @XmlElement(name = "Format")
    private String format;

    @XmlElement(name = "Size")
    private int size;

    @XmlElement(name = "RequestId")
    private String requestId;

    @XmlElement(name = "ContentInfo")
    private ContentInfo contentInfo;

    @XmlElement(name = "ContextInfo")
    private ContextInfo contextInfo;

    // Getters and setters for each field are omitted for brevity
}

