package org.example;

import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

@Service
public class readXmlFile {


    public void readXML() throws JAXBException {
        File xmlFile = new File("/home/root307/Downloads/output.xml"); // Replace with your actual file path

        JAXBContext jaxbContext = JAXBContext.newInstance(DeliveryOutput.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

        DeliveryOutput deliveryOutput = (DeliveryOutput) jaxbUnmarshaller.unmarshal(xmlFile);

        // Access data from the DeliveryOutput object and its nested classes
        System.out.println("Tenant: " + deliveryOutput.getRequestInfo().getTenant());
        System.out.println("File package name: " + deliveryOutput.getFiles().getPackageFileName());
        for (FileInfo fileInfo : deliveryOutput.getFiles().getFileInfoList()) {
            System.out.println("File name: " + fileInfo.getFileName());
            System.out.println("File size: " + fileInfo.getSize());
        }
        // ... access other data as needed

        System.out.println("Delivery details successfully read from XML file!");
    }
}


