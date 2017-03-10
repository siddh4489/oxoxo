package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class DescribeCompactLayoutsResult implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public DescribeCompactLayoutsResult() {
  }
    
  
  /**
   * element  : compactLayouts of type {urn:enterprise.soap.sforce.com}DescribeCompactLayout
   * java type: com.sforce.soap.enterprise.DescribeCompactLayout[]
   */
  private static final com.sforce.ws.bind.TypeInfo compactLayouts__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","compactLayouts","urn:enterprise.soap.sforce.com","DescribeCompactLayout",1,-1,true);

  private boolean compactLayouts__is_set = false;

  private com.sforce.soap.enterprise.DescribeCompactLayout[] compactLayouts = new com.sforce.soap.enterprise.DescribeCompactLayout[0];

  public com.sforce.soap.enterprise.DescribeCompactLayout[] getCompactLayouts() {
    return compactLayouts;
  }

  

  public void setCompactLayouts(com.sforce.soap.enterprise.DescribeCompactLayout[] compactLayouts) {
    this.compactLayouts = compactLayouts;
    compactLayouts__is_set = true;
  }
  
  /**
   * element  : defaultCompactLayoutId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo defaultCompactLayoutId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","defaultCompactLayoutId","urn:enterprise.soap.sforce.com","ID",1,1,true);

  private boolean defaultCompactLayoutId__is_set = false;

  private java.lang.String defaultCompactLayoutId;

  public java.lang.String getDefaultCompactLayoutId() {
    return defaultCompactLayoutId;
  }

  

  public void setDefaultCompactLayoutId(java.lang.String defaultCompactLayoutId) {
    this.defaultCompactLayoutId = defaultCompactLayoutId;
    defaultCompactLayoutId__is_set = true;
  }
  
  /**
   * element  : recordTypeCompactLayoutMappings of type {urn:enterprise.soap.sforce.com}RecordTypeCompactLayoutMapping
   * java type: com.sforce.soap.enterprise.RecordTypeCompactLayoutMapping[]
   */
  private static final com.sforce.ws.bind.TypeInfo recordTypeCompactLayoutMappings__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","recordTypeCompactLayoutMappings","urn:enterprise.soap.sforce.com","RecordTypeCompactLayoutMapping",0,-1,true);

  private boolean recordTypeCompactLayoutMappings__is_set = false;

  private com.sforce.soap.enterprise.RecordTypeCompactLayoutMapping[] recordTypeCompactLayoutMappings = new com.sforce.soap.enterprise.RecordTypeCompactLayoutMapping[0];

  public com.sforce.soap.enterprise.RecordTypeCompactLayoutMapping[] getRecordTypeCompactLayoutMappings() {
    return recordTypeCompactLayoutMappings;
  }

  

  public void setRecordTypeCompactLayoutMappings(com.sforce.soap.enterprise.RecordTypeCompactLayoutMapping[] recordTypeCompactLayoutMappings) {
    this.recordTypeCompactLayoutMappings = recordTypeCompactLayoutMappings;
    recordTypeCompactLayoutMappings__is_set = true;
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
   
    __typeMapper.writeObject(__out, compactLayouts__typeInfo, compactLayouts, compactLayouts__is_set);
    __typeMapper.writeString(__out, defaultCompactLayoutId__typeInfo, defaultCompactLayoutId, defaultCompactLayoutId__is_set);
    __typeMapper.writeObject(__out, recordTypeCompactLayoutMappings__typeInfo, recordTypeCompactLayoutMappings, recordTypeCompactLayoutMappings__is_set);
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
    if (__typeMapper.verifyElement(__in, compactLayouts__typeInfo)) {
      setCompactLayouts((com.sforce.soap.enterprise.DescribeCompactLayout[])__typeMapper.readObject(__in, compactLayouts__typeInfo, com.sforce.soap.enterprise.DescribeCompactLayout[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, defaultCompactLayoutId__typeInfo)) {
      setDefaultCompactLayoutId((java.lang.String)__typeMapper.readString(__in, defaultCompactLayoutId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, recordTypeCompactLayoutMappings__typeInfo)) {
      setRecordTypeCompactLayoutMappings((com.sforce.soap.enterprise.RecordTypeCompactLayoutMapping[])__typeMapper.readObject(__in, recordTypeCompactLayoutMappings__typeInfo, com.sforce.soap.enterprise.RecordTypeCompactLayoutMapping[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeCompactLayoutsResult ");
    
    sb.append(" compactLayouts=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(compactLayouts)+"'\n");
    sb.append(" defaultCompactLayoutId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(defaultCompactLayoutId)+"'\n");
    sb.append(" recordTypeCompactLayoutMappings=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(recordTypeCompactLayoutMappings)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}