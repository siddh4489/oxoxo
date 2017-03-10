package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class FeedLike extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public FeedLike() {
  }
    
  
  /**
   * element  : CreatedBy of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo CreatedBy__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CreatedBy","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean CreatedBy__is_set = false;

  private com.sforce.soap.enterprise.sobject.User CreatedBy;

  public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
    return CreatedBy;
  }

  

  public void setCreatedBy(com.sforce.soap.enterprise.sobject.User CreatedBy) {
    this.CreatedBy = CreatedBy;
    CreatedBy__is_set = true;
  }
  
  /**
   * element  : CreatedById of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CreatedById__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CreatedById","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean CreatedById__is_set = false;

  private java.lang.String CreatedById;

  public java.lang.String getCreatedById() {
    return CreatedById;
  }

  

  public void setCreatedById(java.lang.String CreatedById) {
    this.CreatedById = CreatedById;
    CreatedById__is_set = true;
  }
  
  /**
   * element  : CreatedDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo CreatedDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CreatedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean CreatedDate__is_set = false;

  private java.util.Calendar CreatedDate;

  public java.util.Calendar getCreatedDate() {
    return CreatedDate;
  }

  

  public void setCreatedDate(java.util.Calendar CreatedDate) {
    this.CreatedDate = CreatedDate;
    CreatedDate__is_set = true;
  }
  
  /**
   * element  : FeedEntityId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo FeedEntityId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FeedEntityId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean FeedEntityId__is_set = false;

  private java.lang.String FeedEntityId;

  public java.lang.String getFeedEntityId() {
    return FeedEntityId;
  }

  

  public void setFeedEntityId(java.lang.String FeedEntityId) {
    this.FeedEntityId = FeedEntityId;
    FeedEntityId__is_set = true;
  }
  
  /**
   * element  : FeedItemId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo FeedItemId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FeedItemId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean FeedItemId__is_set = false;

  private java.lang.String FeedItemId;

  public java.lang.String getFeedItemId() {
    return FeedItemId;
  }

  

  public void setFeedItemId(java.lang.String FeedItemId) {
    this.FeedItemId = FeedItemId;
    FeedItemId__is_set = true;
  }
  
  /**
   * element  : InsertedBy of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo InsertedBy__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","InsertedBy","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean InsertedBy__is_set = false;

  private com.sforce.soap.enterprise.sobject.User InsertedBy;

  public com.sforce.soap.enterprise.sobject.User getInsertedBy() {
    return InsertedBy;
  }

  

  public void setInsertedBy(com.sforce.soap.enterprise.sobject.User InsertedBy) {
    this.InsertedBy = InsertedBy;
    InsertedBy__is_set = true;
  }
  
  /**
   * element  : InsertedById of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo InsertedById__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","InsertedById","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean InsertedById__is_set = false;

  private java.lang.String InsertedById;

  public java.lang.String getInsertedById() {
    return InsertedById;
  }

  

  public void setInsertedById(java.lang.String InsertedById) {
    this.InsertedById = InsertedById;
    InsertedById__is_set = true;
  }
  
  /**
   * element  : IsDeleted of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsDeleted__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsDeleted","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsDeleted__is_set = false;

  private java.lang.Boolean IsDeleted;

  public java.lang.Boolean getIsDeleted() {
    return IsDeleted;
  }

  

  public void setIsDeleted(java.lang.Boolean IsDeleted) {
    this.IsDeleted = IsDeleted;
    IsDeleted__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "FeedLike");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, FeedEntityId__typeInfo, FeedEntityId, FeedEntityId__is_set);
    __typeMapper.writeString(__out, FeedItemId__typeInfo, FeedItemId, FeedItemId__is_set);
    __typeMapper.writeObject(__out, InsertedBy__typeInfo, InsertedBy, InsertedBy__is_set);
    __typeMapper.writeString(__out, InsertedById__typeInfo, InsertedById, InsertedById__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
  }


  public void load(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
    __typeMapper.consumeStartTag(__in);
    loadFields(__in, __typeMapper);
    __typeMapper.consumeEndTag(__in);
  }

  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
   super.loadFields(__in, __typeMapper);
    __in.peekTag();
    if (__typeMapper.isElement(__in, CreatedBy__typeInfo)) {
      setCreatedBy((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, CreatedBy__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CreatedById__typeInfo)) {
      setCreatedById((java.lang.String)__typeMapper.readString(__in, CreatedById__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CreatedDate__typeInfo)) {
      setCreatedDate((java.util.Calendar)__typeMapper.readObject(__in, CreatedDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FeedEntityId__typeInfo)) {
      setFeedEntityId((java.lang.String)__typeMapper.readString(__in, FeedEntityId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FeedItemId__typeInfo)) {
      setFeedItemId((java.lang.String)__typeMapper.readString(__in, FeedItemId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, InsertedBy__typeInfo)) {
      setInsertedBy((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, InsertedBy__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, InsertedById__typeInfo)) {
      setInsertedById((java.lang.String)__typeMapper.readString(__in, InsertedById__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {
      setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, IsDeleted__typeInfo, java.lang.Boolean.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[FeedLike ");
    sb.append(super.toString());
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" FeedEntityId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FeedEntityId)+"'\n");
    sb.append(" FeedItemId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FeedItemId)+"'\n");
    sb.append(" InsertedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(InsertedBy)+"'\n");
    sb.append(" InsertedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(InsertedById)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}