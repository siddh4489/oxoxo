package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class ExecuteListViewRequest implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public ExecuteListViewRequest() {
  }
    
  
  /**
   * element  : developerNameOrId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo developerNameOrId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","developerNameOrId","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean developerNameOrId__is_set = false;

  private java.lang.String developerNameOrId;

  public java.lang.String getDeveloperNameOrId() {
    return developerNameOrId;
  }

  

  public void setDeveloperNameOrId(java.lang.String developerNameOrId) {
    this.developerNameOrId = developerNameOrId;
    developerNameOrId__is_set = true;
  }
  
  /**
   * element  : limit of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo limit__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","limit","http://www.w3.org/2001/XMLSchema","int",1,1,true);

  private boolean limit__is_set = false;

  private java.lang.Integer limit;

  public java.lang.Integer getLimit() {
    return limit;
  }

  

  public void setLimit(java.lang.Integer limit) {
    this.limit = limit;
    limit__is_set = true;
  }
  
  /**
   * element  : offset of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo offset__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","offset","http://www.w3.org/2001/XMLSchema","int",1,1,true);

  private boolean offset__is_set = false;

  private java.lang.Integer offset;

  public java.lang.Integer getOffset() {
    return offset;
  }

  

  public void setOffset(java.lang.Integer offset) {
    this.offset = offset;
    offset__is_set = true;
  }
  
  /**
   * element  : orderBy of type {urn:enterprise.soap.sforce.com}ListViewOrderBy
   * java type: com.sforce.soap.enterprise.ListViewOrderBy[]
   */
  private static final com.sforce.ws.bind.TypeInfo orderBy__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","orderBy","urn:enterprise.soap.sforce.com","ListViewOrderBy",1,-1,true);

  private boolean orderBy__is_set = false;

  private com.sforce.soap.enterprise.ListViewOrderBy[] orderBy = new com.sforce.soap.enterprise.ListViewOrderBy[0];

  public com.sforce.soap.enterprise.ListViewOrderBy[] getOrderBy() {
    return orderBy;
  }

  

  public void setOrderBy(com.sforce.soap.enterprise.ListViewOrderBy[] orderBy) {
    this.orderBy = orderBy;
    orderBy__is_set = true;
  }
  
  /**
   * element  : sobjectType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo sobjectType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","sobjectType","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean sobjectType__is_set = false;

  private java.lang.String sobjectType;

  public java.lang.String getSobjectType() {
    return sobjectType;
  }

  

  public void setSobjectType(java.lang.String sobjectType) {
    this.sobjectType = sobjectType;
    sobjectType__is_set = true;
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
   
    __typeMapper.writeString(__out, developerNameOrId__typeInfo, developerNameOrId, developerNameOrId__is_set);
    __typeMapper.writeObject(__out, limit__typeInfo, limit, limit__is_set);
    __typeMapper.writeObject(__out, offset__typeInfo, offset, offset__is_set);
    __typeMapper.writeObject(__out, orderBy__typeInfo, orderBy, orderBy__is_set);
    __typeMapper.writeString(__out, sobjectType__typeInfo, sobjectType, sobjectType__is_set);
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
    if (__typeMapper.verifyElement(__in, developerNameOrId__typeInfo)) {
      setDeveloperNameOrId((java.lang.String)__typeMapper.readString(__in, developerNameOrId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, limit__typeInfo)) {
      setLimit((java.lang.Integer)__typeMapper.readObject(__in, limit__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, offset__typeInfo)) {
      setOffset((java.lang.Integer)__typeMapper.readObject(__in, offset__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, orderBy__typeInfo)) {
      setOrderBy((com.sforce.soap.enterprise.ListViewOrderBy[])__typeMapper.readObject(__in, orderBy__typeInfo, com.sforce.soap.enterprise.ListViewOrderBy[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, sobjectType__typeInfo)) {
      setSobjectType((java.lang.String)__typeMapper.readString(__in, sobjectType__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[ExecuteListViewRequest ");
    
    sb.append(" developerNameOrId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(developerNameOrId)+"'\n");
    sb.append(" limit=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(limit)+"'\n");
    sb.append(" offset=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(offset)+"'\n");
    sb.append(" orderBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(orderBy)+"'\n");
    sb.append(" sobjectType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(sobjectType)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}