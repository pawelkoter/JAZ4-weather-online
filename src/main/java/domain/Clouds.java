package domain;


import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class Clouds {
    private int all;

    public int getAll() {
        return all;
    }

    public void setAll( int all ) {
        this.all = all;
    }
}