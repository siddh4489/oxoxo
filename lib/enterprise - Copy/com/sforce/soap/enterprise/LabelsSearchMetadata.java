package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class LabelsSearchMetadata implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public LabelsSearchMetadata() {
  }
    
  
  /**
   * element  : entityFieldLabels of type {urn:enterprise.soap.sforce.com}NameValuePair
   * java type: com.sforce.soap.enterprise.NameValuePair[]
   */
  private static final com.sforce.ws.bind.TypeInfo entityFieldLabels__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","entityFieldLabels","urn:enterprise.soap.sforce.com","NameValuePair",0,-1,true);

  private boolean entityFieldLabels__is_set = false;

  private com.sforce.soap.enterprise.NameValuePair[] entityFieldLabels = new com.sforce.soap.enterprise.NameValuePair[0];

  public com.sforce.soap.enterprise.NameValuePair[] getEntityFieldLabels() {
    return entityFieldLabels;
  }

  

  public void setEntityFieldLabels(com.sforce.soap.enterprise.NameValuePair[] entityFieldLabels) {
    this.entityFieldLabels = entityFieldLabels;
    entityFieldLabels__is_set = true;
  }
  
  /**
   * element  : entityName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo entityName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","entityName","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean entityName__is_set = false;

  private java.lang.String entityName;

  public java.lang.String getEntityName() {
    return entityName;
  }

  

  public void setEntityName(java.lang.String entityName) {
    this.entityName = entityName;
    entityName__is_set = true;
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
   
    __typeMapper.writeObject(__out, entityFieldLabels__typeInfo, entityFieldLabels, entityFieldLabels__is_set);
    __typeMapper.writeString(__out, entityName__typeInfo, entityName, entityName__is_set);
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
    if (__typeMapper.isElement(__in, entityFieldLabels__typeInfo)) {
      setEntityFieldLabels((com.sforce.soap.enterprise.NameValuePair[])__typeMapper.readObject(__in, entityFieldLabels__typeInfo, com.sforce.soap.enterprise.NameValuePair[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, entityName__typeInfo)) {
      setEntityName((java.lang.String)__typeMapper.readString(__in, entityName__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[LabelsSearchMetadata ");
    
    sb.append(" entityFieldLabels=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(entityFieldLabels)+"'\n");
    sb.append(" entityName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(entityName)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}