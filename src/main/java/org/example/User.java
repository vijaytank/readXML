package org.example;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@XmlRootElement(name = "User")
public class User {

    @XmlAttribute(name = "Id")
    private String id;

    @XmlAttribute(name = "Name")
    private String name;

    @XmlAttribute(name = "Email")
    private String email;

    // Getters and setters for each field are omitted for brevity
}
