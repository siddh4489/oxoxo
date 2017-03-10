package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class DescribePrimaryCompactLayouts_element implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public DescribePrimaryCompactLayouts_element() {
  }
    
  
  /**
   * element  : sObjectTypes of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String[]
   */
  private static final com.sforce.ws.bind.TypeInfo sObjectTypes__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","sObjectTypes","http://www.w3.org/2001/XMLSchema","string",1,-1,true);

  private boolean sObjectTypes__is_set = false;

  private java.lang.String[] sObjectTypes = new java.lang.String[0];

  public java.lang.String[] getSObjectTypes() {
    return sObjectTypes;
  }

  

  public void setSObjectTypes(java.lang.String[] sObjectTypes) {
    this.sObjectTypes = sObjectTypes;
    sObjectTypes__is_set = true;
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
   
    __typeMapper.writeObject(__out, sObjectTypes__typeInfo, sObjectTypes, sObjectTypes__is_set);
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
    if (__typeMapper.verifyElement(__in, sObjectTypes__typeInfo)) {
      setSObjectTypes((java.lang.String[])__typeMapper.readObject(__in, sObjectTypes__typeInfo, java.lang.String[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribePrimaryCompactLayouts_element ");
    
    sb.append(" sObjectTypes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(sObjectTypes)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}