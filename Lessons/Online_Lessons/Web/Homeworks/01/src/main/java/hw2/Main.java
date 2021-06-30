package hw2;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Main {
    public static void main(String[] args) throws JAXBException {

/*        Candy candyOne = new Candy("Barbariska", "Paper", "Caramel", "Caramel", 3);
        Candy candyDushes = new Candy("Dushes", "Paper", "Caramel", "Caramel", 2);
        Factory fac = new Factory();
        fac.add(candyOne);
        fac.add(candyDushes);
        System.out.println(fac);

        File fileOut = new File("D:\\JAVA\\CyberBionic Systematics\\Lessons\\Online_Lessons" +
                "\\Web\\Homeworks\\01\\src\\main\\java\\hw2\\out.xml");
        JAXBContext outContent = JAXBContext.newInstance(Factory.class);
        Marshaller marshaller = outContent.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        marshaller.marshal(fac, fileOut);
        marshaller.marshal(fac, System.out);
        System.out.println();*/

        File file = new File("D:\\JAVA\\CyberBionic Systematics\\Lessons\\Online_Lessons" +
                "\\Web\\Homeworks\\01\\src\\main\\java\\hw2\\factory.xml");
        JAXBContext context = JAXBContext.newInstance(Factory.class);

        Unmarshaller unmarshaller = context.createUnmarshaller();
        Factory candy = (Factory) unmarshaller.unmarshal(file);
        System.out.println(candy.toString());
    }
}
