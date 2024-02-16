package org.example;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@XmlRootElement(name = "DeliveryOutput")
public class DeliveryOutput {

    @XmlElement(name = "RequestInfo")
    private RequestInfo requestInfo;

    @XmlElement(name = "Files")
    private Files files;

    @XmlElement(name = "DeliveryDetailExtra")
    private String deliveryDetailExtra;

    // Getters and setters for each field are omitted for brevity
}

