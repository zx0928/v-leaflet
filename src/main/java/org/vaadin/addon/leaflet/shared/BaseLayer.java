package org.vaadin.addon.leaflet.shared;


public class BaseLayer {
	
	private String url;
	private String name;
	private String attributionString;
	private Boolean detectRetina;
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAttributionString() {
		return attributionString;
	}
	public void setAttributionString(String attributionString) {
		this.attributionString = attributionString;
	}
	public Boolean getDetectRetina() {
		return detectRetina;
	}
	public void setDetectRetina(Boolean detectRetina) {
		this.detectRetina = detectRetina;
	}

}
