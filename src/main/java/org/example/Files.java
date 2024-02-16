package org.example;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "Files")
@Getter
@Setter
public class Files {

    @XmlAttribute(name = "PackageFileName")
    private String packageFileName;

    @XmlElement(name = "FileInfo")
    private List<FileInfo> fileInfoList;

    // Getters and setters for each field are omitted for brevity
}
