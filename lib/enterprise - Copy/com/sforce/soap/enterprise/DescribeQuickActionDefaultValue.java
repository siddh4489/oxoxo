package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class DescribeQuickActionDefaultValue implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public DescribeQuickActionDefaultValue() {
  }
    
  
  /**
   * element  : defaultValue of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo defaultValue__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","defaultValue","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean defaultValue__is_set = false;

  private java.lang.String defaultValue;

  public java.lang.String getDefaultValue() {
    return defaultValue;
  }

  

  public void setDefaultValue(java.lang.String defaultValue) {
    this.defaultValue = defaultValue;
    defaultValue__is_set = true;
  }
  
  /**
   * element  : field of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo field__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","field","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean field__is_set = false;

  private java.lang.String field;

  public java.lang.String getField() {
    return field;
  }

  

  public void setField(java.lang.String field) {
    this.field = field;
    field__is_set = true;
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
   
    __typeMapper.writeString(__out, defaultValue__typeInfo, defaultValue, defaultValue__is_set);
    __typeMapper.writeString(__out, field__typeInfo, field, field__is_set);
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
    if (__typeMapper.verifyElement(__in, defaultValue__typeInfo)) {
      setDefaultValue((java.lang.String)__typeMapper.readString(__in, defaultValue__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, field__typeInfo)) {
      setField((java.lang.String)__typeMapper.readString(__in, field__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeQuickActionDefaultValue ");
    
    sb.append(" defaultValue=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(defaultValue)+"'\n");
    sb.append(" field=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(field)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}