package hw2;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Candy {

    private String name;
    private String wrapper;
    private String cover;
    private String filler;
    private Integer quantity;

    public Candy() {
    }

    public Candy(String name, String wrapper, String cover, String filler, Integer quantity) {
        this.name = name;
        this.wrapper = wrapper;
        this.cover = cover;
        this.filler = filler;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    @XmlAttribute
    public void setName(String name) {
        this.name = name;
    }

    public String getWrapper() {
        return wrapper;
    }

    @XmlElement
    public void setWrapper(String wrapper) {
        this.wrapper = wrapper;
    }

    public String getCover() {
        return cover;
    }

    @XmlElement
    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getFiller() {
        return filler;
    }

    @XmlElement
    public void setFiller(String filler) {
        this.filler = filler;
    }

    public Integer getQuantity() {
        return quantity;
    }

    @XmlElement
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "name='" + name + '\'' +
                ", wrapper='" + wrapper + '\'' +
                ", cover='" + cover + '\'' +
                ", filler='" + filler + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
