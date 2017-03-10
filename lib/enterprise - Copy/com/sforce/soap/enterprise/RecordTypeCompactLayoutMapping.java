package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class RecordTypeCompactLayoutMapping implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public RecordTypeCompactLayoutMapping() {
  }
    
  
  /**
   * element  : available of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo available__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","available","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean available__is_set = false;

  private boolean available;

  public boolean getAvailable() {
    return available;
  }

  

  public boolean isAvailable() {
    return available;
  }

  

  public void setAvailable(boolean available) {
    this.available = available;
    available__is_set = true;
  }
  
  /**
   * element  : compactLayoutId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo compactLayoutId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","compactLayoutId","urn:enterprise.soap.sforce.com","ID",1,1,true);

  private boolean compactLayoutId__is_set = false;

  private java.lang.String compactLayoutId;

  public java.lang.String getCompactLayoutId() {
    return compactLayoutId;
  }

  

  public void setCompactLayoutId(java.lang.String compactLayoutId) {
    this.compactLayoutId = compactLayoutId;
    compactLayoutId__is_set = true;
  }
  
  /**
   * element  : compactLayoutName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo compactLayoutName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","compactLayoutName","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean compactLayoutName__is_set = false;

  private java.lang.String compactLayoutName;

  public java.lang.String getCompactLayoutName() {
    return compactLayoutName;
  }

  

  public void setCompactLayoutName(java.lang.String compactLayoutName) {
    this.compactLayoutName = compactLayoutName;
    compactLayoutName__is_set = true;
  }
  
  /**
   * element  : recordTypeId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo recordTypeId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","recordTypeId","urn:enterprise.soap.sforce.com","ID",1,1,true);

  private boolean recordTypeId__is_set = false;

  private java.lang.String recordTypeId;

  public java.lang.String getRecordTypeId() {
    return recordTypeId;
  }

  

  public void setRecordTypeId(java.lang.String recordTypeId) {
    this.recordTypeId = recordTypeId;
    recordTypeId__is_set = true;
  }
  
  /**
   * element  : recordTypeName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo recordTypeName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","recordTypeName","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean recordTypeName__is_set = false;

  private java.lang.String recordTypeName;

  public java.lang.String getRecordTypeName() {
    return recordTypeName;
  }

  

  public void setRecordTypeName(java.lang.String recordTypeName) {
    this.recordTypeName = recordTypeName;
    recordTypeName__is_set = true;
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
   
    __typeMapper.writeBoolean(__out, available__typeInfo, available, available__is_set);
    __typeMapper.writeString(__out, compactLayoutId__typeInfo, compactLayoutId, compactLayoutId__is_set);
    __typeMapper.writeString(__out, compactLayoutName__typeInfo, compactLayoutName, compactLayoutName__is_set);
    __typeMapper.writeString(__out, recordTypeId__typeInfo, recordTypeId, recordTypeId__is_set);
    __typeMapper.writeString(__out, recordTypeName__typeInfo, recordTypeName, recordTypeName__is_set);
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
    if (__typeMapper.verifyElement(__in, available__typeInfo)) {
      setAvailable((boolean)__typeMapper.readBoolean(__in, available__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, compactLayoutId__typeInfo)) {
      setCompactLayoutId((java.lang.String)__typeMapper.readString(__in, compactLayoutId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, compactLayoutName__typeInfo)) {
      setCompactLayoutName((java.lang.String)__typeMapper.readString(__in, compactLayoutName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, recordTypeId__typeInfo)) {
      setRecordTypeId((java.lang.String)__typeMapper.readString(__in, recordTypeId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, recordTypeName__typeInfo)) {
      setRecordTypeName((java.lang.String)__typeMapper.readString(__in, recordTypeName__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[RecordTypeCompactLayoutMapping ");
    
    sb.append(" available=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(available)+"'\n");
    sb.append(" compactLayoutId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(compactLayoutId)+"'\n");
    sb.append(" compactLayoutName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(compactLayoutName)+"'\n");
    sb.append(" recordTypeId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(recordTypeId)+"'\n");
    sb.append(" recordTypeName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(recordTypeName)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}