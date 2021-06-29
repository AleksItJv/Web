package hw2;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Main {
    public static void main(String[] args) throws JAXBException {

        File file = new File("D:\\JAVA\\CyberBionic Systematics\\Lessons\\Online_Lessons" +
                "\\Web\\Homeworks\\01\\src\\main\\java\\hw2\\factory.xml");
        JAXBContext context = JAXBContext.newInstance(Factory.class);

        Unmarshaller unmarshaller = context.createUnmarshaller();
        Factory candy = (Factory) unmarshaller.unmarshal(file);
        System.out.println(candy.toString());
    }
}
