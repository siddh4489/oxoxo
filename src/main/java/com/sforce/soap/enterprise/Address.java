package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class Address extends com.sforce.soap.enterprise.Location {
  /**
   * Constructor
   */
  public Address() {
  }
    
  
  /**
   * element  : city of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo city__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","city","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean city__is_set = false;

  private java.lang.String city;

  public java.lang.String getCity() {
    return city;
  }

  

  public void setCity(java.lang.String city) {
    this.city = city;
    city__is_set = true;
  }
  
  /**
   * element  : country of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo country__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","country","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean country__is_set = false;

  private java.lang.String country;

  public java.lang.String getCountry() {
    return country;
  }

  

  public void setCountry(java.lang.String country) {
    this.country = country;
    country__is_set = true;
  }
  
  /**
   * element  : countryCode of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo countryCode__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","countryCode","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean countryCode__is_set = false;

  private java.lang.String countryCode;

  public java.lang.String getCountryCode() {
    return countryCode;
  }

  

  public void setCountryCode(java.lang.String countryCode) {
    this.countryCode = countryCode;
    countryCode__is_set = true;
  }
  
  /**
   * element  : geocodeAccuracy of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo geocodeAccuracy__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","geocodeAccuracy","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean geocodeAccuracy__is_set = false;

  private java.lang.String geocodeAccuracy;

  public java.lang.String getGeocodeAccuracy() {
    return geocodeAccuracy;
  }

  

  public void setGeocodeAccuracy(java.lang.String geocodeAccuracy) {
    this.geocodeAccuracy = geocodeAccuracy;
    geocodeAccuracy__is_set = true;
  }
  
  /**
   * element  : postalCode of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo postalCode__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","postalCode","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean postalCode__is_set = false;

  private java.lang.String postalCode;

  public java.lang.String getPostalCode() {
    return postalCode;
  }

  

  public void setPostalCode(java.lang.String postalCode) {
    this.postalCode = postalCode;
    postalCode__is_set = true;
  }
  
  /**
   * element  : state of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo state__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","state","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean state__is_set = false;

  private java.lang.String state;

  public java.lang.String getState() {
    return state;
  }

  

  public void setState(java.lang.String state) {
    this.state = state;
    state__is_set = true;
  }
  
  /**
   * element  : stateCode of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo stateCode__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","stateCode","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean stateCode__is_set = false;

  private java.lang.String stateCode;

  public java.lang.String getStateCode() {
    return stateCode;
  }

  

  public void setStateCode(java.lang.String stateCode) {
    this.stateCode = stateCode;
    stateCode__is_set = true;
  }
  
  /**
   * element  : street of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo street__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","street","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean street__is_set = false;

  private java.lang.String street;

  public java.lang.String getStreet() {
    return street;
  }

  

  public void setStreet(java.lang.String street) {
    this.street = street;
    street__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:enterprise.soap.sforce.com", "address");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, city__typeInfo, city, city__is_set);
    __typeMapper.writeString(__out, country__typeInfo, country, country__is_set);
    __typeMapper.writeString(__out, countryCode__typeInfo, countryCode, countryCode__is_set);
    __typeMapper.writeString(__out, geocodeAccuracy__typeInfo, geocodeAccuracy, geocodeAccuracy__is_set);
    __typeMapper.writeString(__out, postalCode__typeInfo, postalCode, postalCode__is_set);
    __typeMapper.writeString(__out, state__typeInfo, state, state__is_set);
    __typeMapper.writeString(__out, stateCode__typeInfo, stateCode, stateCode__is_set);
    __typeMapper.writeString(__out, street__typeInfo, street, street__is_set);
  }


  public void load(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
    __typeMapper.consumeStartTag(__in);
    loadFields(__in, __typeMapper);
    __typeMapper.consumeEndTag(__in);
  }

  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
   super.loadFields(__in, __typeMapper);
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, city__typeInfo)) {
      setCity((java.lang.String)__typeMapper.readString(__in, city__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, country__typeInfo)) {
      setCountry((java.lang.String)__typeMapper.readString(__in, country__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, countryCode__typeInfo)) {
      setCountryCode((java.lang.String)__typeMapper.readString(__in, countryCode__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, geocodeAccuracy__typeInfo)) {
      setGeocodeAccuracy((java.lang.String)__typeMapper.readString(__in, geocodeAccuracy__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, postalCode__typeInfo)) {
      setPostalCode((java.lang.String)__typeMapper.readString(__in, postalCode__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, state__typeInfo)) {
      setState((java.lang.String)__typeMapper.readString(__in, state__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, stateCode__typeInfo)) {
      setStateCode((java.lang.String)__typeMapper.readString(__in, stateCode__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, street__typeInfo)) {
      setStreet((java.lang.String)__typeMapper.readString(__in, street__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[Address ");
    sb.append(super.toString());
    sb.append(" city=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(city)+"'\n");
    sb.append(" country=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(country)+"'\n");
    sb.append(" countryCode=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(countryCode)+"'\n");
    sb.append(" geocodeAccuracy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(geocodeAccuracy)+"'\n");
    sb.append(" postalCode=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(postalCode)+"'\n");
    sb.append(" state=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(state)+"'\n");
    sb.append(" stateCode=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(stateCode)+"'\n");
    sb.append(" street=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(street)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}