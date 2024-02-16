package org.example;

import javax.xml.bind.JAXBException;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {readXmlFile.class})
@ExtendWith(MockitoExtension.class)
class readXmlFileDiffblueTest {

    @InjectMocks
    readXmlFile readXmlFile;

    @Test
    void testReadXML() throws JAXBException {

        this.readXmlFile.readXML();

    }
}
