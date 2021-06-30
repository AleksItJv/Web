package hw2;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@XmlRootElement(name = "factory")
public class Factory {
    @XmlElement(name = "candy")
    private List<Candy> candyShop= new ArrayList<>();

    public void add(Candy candy){
        candyShop.add(candy);
    }

    @Override
    public String toString(){
        return Arrays.deepToString(candyShop.toArray());
    }
}
