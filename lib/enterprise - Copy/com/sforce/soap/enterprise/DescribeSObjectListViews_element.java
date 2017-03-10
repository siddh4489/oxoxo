package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class DescribeSObjectListViews_element implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public DescribeSObjectListViews_element() {
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
   * element  : recentsOnly of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo recentsOnly__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","recentsOnly","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean recentsOnly__is_set = false;

  private boolean recentsOnly;

  public boolean getRecentsOnly() {
    return recentsOnly;
  }

  

  public boolean isRecentsOnly() {
    return recentsOnly;
  }

  

  public void setRecentsOnly(boolean recentsOnly) {
    this.recentsOnly = recentsOnly;
    recentsOnly__is_set = true;
  }
  
  /**
   * element  : isSoqlCompatible of type {urn:enterprise.soap.sforce.com}listViewIsSoqlCompatible
   * java type: com.sforce.soap.enterprise.ListViewIsSoqlCompatible
   */
  private static final com.sforce.ws.bind.TypeInfo isSoqlCompatible__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","isSoqlCompatible","urn:enterprise.soap.sforce.com","listViewIsSoqlCompatible",1,1,true);

  private boolean isSoqlCompatible__is_set = false;

  private com.sforce.soap.enterprise.ListViewIsSoqlCompatible isSoqlCompatible;

  public com.sforce.soap.enterprise.ListViewIsSoqlCompatible getIsSoqlCompatible() {
    return isSoqlCompatible;
  }

  

  public void setIsSoqlCompatible(com.sforce.soap.enterprise.ListViewIsSoqlCompatible isSoqlCompatible) {
    this.isSoqlCompatible = isSoqlCompatible;
    isSoqlCompatible__is_set = true;
  }
  
  /**
   * element  : limit of type {http://www.w3.org/2001/XMLSchema}int
   * java type: int
   */
  private static final com.sforce.ws.bind.TypeInfo limit__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","limit","http://www.w3.org/2001/XMLSchema","int",1,1,true);

  private boolean limit__is_set = false;

  private int limit;

  public int getLimit() {
    return limit;
  }

  

  public void setLimit(int limit) {
    this.limit = limit;
    limit__is_set = true;
  }
  
  /**
   * element  : offset of type {http://www.w3.org/2001/XMLSchema}int
   * java type: int
   */
  private static final com.sforce.ws.bind.TypeInfo offset__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","offset","http://www.w3.org/2001/XMLSchema","int",1,1,true);

  private boolean offset__is_set = false;

  private int offset;

  public int getOffset() {
    return offset;
  }

  

  public void setOffset(int offset) {
    this.offset = offset;
    offset__is_set = true;
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
    __typeMapper.writeBoolean(__out, recentsOnly__typeInfo, recentsOnly, recentsOnly__is_set);
    __typeMapper.writeObject(__out, isSoqlCompatible__typeInfo, isSoqlCompatible, isSoqlCompatible__is_set);
    __typeMapper.writeInt(__out, limit__typeInfo, limit, limit__is_set);
    __typeMapper.writeInt(__out, offset__typeInfo, offset, offset__is_set);
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
    if (__typeMapper.verifyElement(__in, recentsOnly__typeInfo)) {
      setRecentsOnly((boolean)__typeMapper.readBoolean(__in, recentsOnly__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, isSoqlCompatible__typeInfo)) {
      setIsSoqlCompatible((com.sforce.soap.enterprise.ListViewIsSoqlCompatible)__typeMapper.readObject(__in, isSoqlCompatible__typeInfo, com.sforce.soap.enterprise.ListViewIsSoqlCompatible.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, limit__typeInfo)) {
      setLimit((int)__typeMapper.readInt(__in, limit__typeInfo, int.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, offset__typeInfo)) {
      setOffset((int)__typeMapper.readInt(__in, offset__typeInfo, int.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeSObjectListViews_element ");
    
    sb.append(" sObjectType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(sObjectType)+"'\n");
    sb.append(" recentsOnly=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(recentsOnly)+"'\n");
    sb.append(" isSoqlCompatible=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(isSoqlCompatible)+"'\n");
    sb.append(" limit=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(limit)+"'\n");
    sb.append(" offset=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(offset)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}