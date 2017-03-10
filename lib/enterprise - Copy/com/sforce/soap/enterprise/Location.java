package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class Location implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public Location() {
  }
    
  
  /**
   * element  : latitude of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo latitude__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","latitude","http://www.w3.org/2001/XMLSchema","double",1,1,true);

  private boolean latitude__is_set = false;

  private java.lang.Double latitude;

  public java.lang.Double getLatitude() {
    return latitude;
  }

  

  public void setLatitude(java.lang.Double latitude) {
    this.latitude = latitude;
    latitude__is_set = true;
  }
  
  /**
   * element  : longitude of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo longitude__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","longitude","http://www.w3.org/2001/XMLSchema","double",1,1,true);

  private boolean longitude__is_set = false;

  private java.lang.Double longitude;

  public java.lang.Double getLongitude() {
    return longitude;
  }

  

  public void setLongitude(java.lang.Double longitude) {
    this.longitude = longitude;
    longitude__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   
    __typeMapper.writeObject(__out, latitude__typeInfo, latitude, latitude__is_set);
    __typeMapper.writeObject(__out, longitude__typeInfo, longitude, longitude__is_set);
  }


  public void load(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
    __typeMapper.consumeStartTag(__in);
    loadFields(__in, __typeMapper);
    __typeMapper.consumeEndTag(__in);
  }

  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
   
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, latitude__typeInfo)) {
      setLatitude((java.lang.Double)__typeMapper.readObject(__in, latitude__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, longitude__typeInfo)) {
      setLongitude((java.lang.Double)__typeMapper.readObject(__in, longitude__typeInfo, java.lang.Double.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[Location ");
    
    sb.append(" latitude=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(latitude)+"'\n");
    sb.append(" longitude=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(longitude)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}