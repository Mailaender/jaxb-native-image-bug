package classes;

import jakarta.xml.bind.JAXB;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;

public class Main {

	@XmlRootElement
	public static class Data {
		@XmlAttribute
		private int x;
	}

	public static void main(String[] args) {
		JAXB.marshal(new Data(), System.out);
	}

}
