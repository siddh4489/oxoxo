package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class NameObjectValuePair implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public NameObjectValuePair() {
  }
    
  
  /**
   * element  : name of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo name__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","name","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean name__is_set = false;

  private java.lang.String name;

  public java.lang.String getName() {
    return name;
  }

  

  public void setName(java.lang.String name) {
    this.name = name;
    name__is_set = true;
  }
  
  /**
   * element  : value of type {http://www.w3.org/2001/XMLSchema}anyType
   * java type: java.lang.Object[]
   */
  private static final com.sforce.ws.bind.TypeInfo value__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","value","http://www.w3.org/2001/XMLSchema","anyType",1,-1,true);

  private boolean value__is_set = false;

  private java.lang.Object[] value = new java.lang.Object[0];

  public java.lang.Object[] getValue() {
    return value;
  }

  

  public void setValue(java.lang.Object[] value) {
    this.value = value;
    value__is_set = true;
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
   
    __typeMapper.writeString(__out, name__typeInfo, name, name__is_set);
    __typeMapper.writeObject(__out, value__typeInfo, value, value__is_set);
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
    if (__typeMapper.verifyElement(__in, name__typeInfo)) {
      setName((java.lang.String)__typeMapper.readString(__in, name__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, value__typeInfo)) {
      setValue((java.lang.Object[])__typeMapper.readObject(__in, value__typeInfo, java.lang.Object[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[NameObjectValuePair ");
    
    sb.append(" name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(name)+"'\n");
    sb.append(" value=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(value)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}