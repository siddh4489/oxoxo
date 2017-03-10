package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class SObject implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public SObject() {
  }
    
  
  /**
   * element  : fieldsToNull of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String[]
   */
  private static final com.sforce.ws.bind.TypeInfo fieldsToNull__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","fieldsToNull","http://www.w3.org/2001/XMLSchema","string",0,-1,true);

  private boolean fieldsToNull__is_set = false;

  private java.lang.String[] fieldsToNull = new java.lang.String[0];

  public java.lang.String[] getFieldsToNull() {
    return fieldsToNull;
  }

  

  public void setFieldsToNull(java.lang.String[] fieldsToNull) {
    this.fieldsToNull = fieldsToNull;
    fieldsToNull__is_set = true;
  }
  
  /**
   * element  : Id of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Id__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Id","urn:enterprise.soap.sforce.com","ID",1,1,true);

  private boolean Id__is_set = false;

  private java.lang.String Id;

  public java.lang.String getId() {
    return Id;
  }

  

  public void setId(java.lang.String Id) {
    this.Id = Id;
    Id__is_set = true;
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
   
    __typeMapper.writeObject(__out, fieldsToNull__typeInfo, fieldsToNull, fieldsToNull__is_set);
    __typeMapper.writeString(__out, Id__typeInfo, Id, Id__is_set);
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
    if (__typeMapper.isElement(__in, fieldsToNull__typeInfo)) {
      setFieldsToNull((java.lang.String[])__typeMapper.readObject(__in, fieldsToNull__typeInfo, java.lang.String[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, Id__typeInfo)) {
      setId((java.lang.String)__typeMapper.readString(__in, Id__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[SObject ");
    
    sb.append(" fieldsToNull=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(fieldsToNull)+"'\n");
    sb.append(" Id=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Id)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}