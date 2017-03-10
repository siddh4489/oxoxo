package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class DescribeCompactLayouts_element implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public DescribeCompactLayouts_element() {
  }
    
  
  /**
   * element  : sObjectType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo sObjectType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","sObjectType","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean sObjectType__is_set = false;

  private java.lang.String sObjectType;

  public java.lang.String getSObjectType() {
    return sObjectType;
  }

  

  public void setSObjectType(java.lang.String sObjectType) {
    this.sObjectType = sObjectType;
    sObjectType__is_set = true;
  }
  
  /**
   * element  : recordTypeIds of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String[]
   */
  private static final com.sforce.ws.bind.TypeInfo recordTypeIds__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","recordTypeIds","urn:enterprise.soap.sforce.com","ID",0,-1,true);

  private boolean recordTypeIds__is_set = false;

  private java.lang.String[] recordTypeIds = new java.lang.String[0];

  public java.lang.String[] getRecordTypeIds() {
    return recordTypeIds;
  }

  

  public void setRecordTypeIds(java.lang.String[] recordTypeIds) {
    this.recordTypeIds = recordTypeIds;
    recordTypeIds__is_set = true;
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
   
    __typeMapper.writeString(__out, sObjectType__typeInfo, sObjectType, sObjectType__is_set);
    __typeMapper.writeObject(__out, recordTypeIds__typeInfo, recordTypeIds, recordTypeIds__is_set);
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
    if (__typeMapper.verifyElement(__in, sObjectType__typeInfo)) {
      setSObjectType((java.lang.String)__typeMapper.readString(__in, sObjectType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, recordTypeIds__typeInfo)) {
      setRecordTypeIds((java.lang.String[])__typeMapper.readObject(__in, recordTypeIds__typeInfo, java.lang.String[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeCompactLayouts_element ");
    
    sb.append(" sObjectType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(sObjectType)+"'\n");
    sb.append(" recordTypeIds=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(recordTypeIds)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}