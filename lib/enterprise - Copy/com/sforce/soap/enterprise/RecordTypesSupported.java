package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class RecordTypesSupported implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public RecordTypesSupported() {
  }
    
  
  /**
   * element  : recordTypeInfos of type {urn:enterprise.soap.sforce.com}RecordTypeInfo
   * java type: com.sforce.soap.enterprise.RecordTypeInfo[]
   */
  private static final com.sforce.ws.bind.TypeInfo recordTypeInfos__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","recordTypeInfos","urn:enterprise.soap.sforce.com","RecordTypeInfo",0,-1,true);

  private boolean recordTypeInfos__is_set = false;

  private com.sforce.soap.enterprise.RecordTypeInfo[] recordTypeInfos = new com.sforce.soap.enterprise.RecordTypeInfo[0];

  public com.sforce.soap.enterprise.RecordTypeInfo[] getRecordTypeInfos() {
    return recordTypeInfos;
  }

  

  public void setRecordTypeInfos(com.sforce.soap.enterprise.RecordTypeInfo[] recordTypeInfos) {
    this.recordTypeInfos = recordTypeInfos;
    recordTypeInfos__is_set = true;
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
   
    __typeMapper.writeObject(__out, recordTypeInfos__typeInfo, recordTypeInfos, recordTypeInfos__is_set);
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
    if (__typeMapper.isElement(__in, recordTypeInfos__typeInfo)) {
      setRecordTypeInfos((com.sforce.soap.enterprise.RecordTypeInfo[])__typeMapper.readObject(__in, recordTypeInfos__typeInfo, com.sforce.soap.enterprise.RecordTypeInfo[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[RecordTypesSupported ");
    
    sb.append(" recordTypeInfos=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(recordTypeInfos)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}