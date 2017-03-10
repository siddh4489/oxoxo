package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class DescribeVisualForce_element implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public DescribeVisualForce_element() {
  }
    
  
  /**
   * element  : includeAllDetails of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo includeAllDetails__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","includeAllDetails","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean includeAllDetails__is_set = false;

  private boolean includeAllDetails;

  public boolean getIncludeAllDetails() {
    return includeAllDetails;
  }

  

  public boolean isIncludeAllDetails() {
    return includeAllDetails;
  }

  

  public void setIncludeAllDetails(boolean includeAllDetails) {
    this.includeAllDetails = includeAllDetails;
    includeAllDetails__is_set = true;
  }
  
  /**
   * element  : namespacePrefix of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo namespacePrefix__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","namespacePrefix","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean namespacePrefix__is_set = false;

  private java.lang.String namespacePrefix;

  public java.lang.String getNamespacePrefix() {
    return namespacePrefix;
  }

  

  public void setNamespacePrefix(java.lang.String namespacePrefix) {
    this.namespacePrefix = namespacePrefix;
    namespacePrefix__is_set = true;
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
   
    __typeMapper.writeBoolean(__out, includeAllDetails__typeInfo, includeAllDetails, includeAllDetails__is_set);
    __typeMapper.writeString(__out, namespacePrefix__typeInfo, namespacePrefix, namespacePrefix__is_set);
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
    if (__typeMapper.verifyElement(__in, includeAllDetails__typeInfo)) {
      setIncludeAllDetails((boolean)__typeMapper.readBoolean(__in, includeAllDetails__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, namespacePrefix__typeInfo)) {
      setNamespacePrefix((java.lang.String)__typeMapper.readString(__in, namespacePrefix__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeVisualForce_element ");
    
    sb.append(" includeAllDetails=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(includeAllDetails)+"'\n");
    sb.append(" namespacePrefix=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(namespacePrefix)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}