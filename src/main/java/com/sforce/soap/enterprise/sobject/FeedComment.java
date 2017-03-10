package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class FeedComment extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public FeedComment() {
  }
    
  
  /**
   * element  : CommentBody of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CommentBody__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CommentBody","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean CommentBody__is_set = false;

  private java.lang.String CommentBody;

  public java.lang.String getCommentBody() {
    return CommentBody;
  }

  

  public void setCommentBody(java.lang.String CommentBody) {
    this.CommentBody = CommentBody;
    CommentBody__is_set = true;
  }
  
  /**
   * element  : CommentType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CommentType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CommentType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean CommentType__is_set = false;

  private java.lang.String CommentType;

  public java.lang.String getCommentType() {
    return CommentType;
  }

  

  public void setCommentType(java.lang.String CommentType) {
    this.CommentType = CommentType;
    CommentType__is_set = true;
  }
  
  /**
   * element  : CreatedBy of type {urn:sobject.enterprise.soap.sforce.com}Name
   * java type: com.sforce.soap.enterprise.sobject.Name
   */
  private static final com.sforce.ws.bind.TypeInfo CreatedBy__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CreatedBy","urn:sobject.enterprise.soap.sforce.com","Name",0,1,true);

  private boolean CreatedBy__is_set = false;

  private com.sforce.soap.enterprise.sobject.Name CreatedBy;

  public com.sforce.soap.enterprise.sobject.Name getCreatedBy() {
    return CreatedBy;
  }

  

  public void setCreatedBy(com.sforce.soap.enterprise.sobject.Name CreatedBy) {
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
   * element  : FeedAttachments of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo FeedAttachments__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FeedAttachments","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean FeedAttachments__is_set = false;

  private com.sforce.soap.enterprise.QueryResult FeedAttachments;

  public com.sforce.soap.enterprise.QueryResult getFeedAttachments() {
    return FeedAttachments;
  }

  

  public void setFeedAttachments(com.sforce.soap.enterprise.QueryResult FeedAttachments) {
    this.FeedAttachments = FeedAttachments;
    FeedAttachments__is_set = true;
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
   * element  : FeedRevisions of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo FeedRevisions__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FeedRevisions","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean FeedRevisions__is_set = false;

  private com.sforce.soap.enterprise.QueryResult FeedRevisions;

  public com.sforce.soap.enterprise.QueryResult getFeedRevisions() {
    return FeedRevisions;
  }

  

  public void setFeedRevisions(com.sforce.soap.enterprise.QueryResult FeedRevisions) {
    this.FeedRevisions = FeedRevisions;
    FeedRevisions__is_set = true;
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
   * element  : IsRichText of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsRichText__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsRichText","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsRichText__is_set = false;

  private java.lang.Boolean IsRichText;

  public java.lang.Boolean getIsRichText() {
    return IsRichText;
  }

  

  public void setIsRichText(java.lang.Boolean IsRichText) {
    this.IsRichText = IsRichText;
    IsRichText__is_set = true;
  }
  
  /**
   * element  : LastEditById of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LastEditById__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastEditById","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean LastEditById__is_set = false;

  private java.lang.String LastEditById;

  public java.lang.String getLastEditById() {
    return LastEditById;
  }

  

  public void setLastEditById(java.lang.String LastEditById) {
    this.LastEditById = LastEditById;
    LastEditById__is_set = true;
  }
  
  /**
   * element  : LastEditDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo LastEditDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastEditDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean LastEditDate__is_set = false;

  private java.util.Calendar LastEditDate;

  public java.util.Calendar getLastEditDate() {
    return LastEditDate;
  }

  

  public void setLastEditDate(java.util.Calendar LastEditDate) {
    this.LastEditDate = LastEditDate;
    LastEditDate__is_set = true;
  }
  
  /**
   * element  : ParentId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ParentId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ParentId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ParentId__is_set = false;

  private java.lang.String ParentId;

  public java.lang.String getParentId() {
    return ParentId;
  }

  

  public void setParentId(java.lang.String ParentId) {
    this.ParentId = ParentId;
    ParentId__is_set = true;
  }
  
  /**
   * element  : RelatedRecordId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo RelatedRecordId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RelatedRecordId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean RelatedRecordId__is_set = false;

  private java.lang.String RelatedRecordId;

  public java.lang.String getRelatedRecordId() {
    return RelatedRecordId;
  }

  

  public void setRelatedRecordId(java.lang.String RelatedRecordId) {
    this.RelatedRecordId = RelatedRecordId;
    RelatedRecordId__is_set = true;
  }
  
  /**
   * element  : Revision of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo Revision__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Revision","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean Revision__is_set = false;

  private java.lang.Integer Revision;

  public java.lang.Integer getRevision() {
    return Revision;
  }

  

  public void setRevision(java.lang.Integer Revision) {
    this.Revision = Revision;
    Revision__is_set = true;
  }
  
  /**
   * element  : Status of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Status__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Status","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Status__is_set = false;

  private java.lang.String Status;

  public java.lang.String getStatus() {
    return Status;
  }

  

  public void setStatus(java.lang.String Status) {
    this.Status = Status;
    Status__is_set = true;
  }
  
  /**
   * element  : SystemModstamp of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo SystemModstamp__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SystemModstamp","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean SystemModstamp__is_set = false;

  private java.util.Calendar SystemModstamp;

  public java.util.Calendar getSystemModstamp() {
    return SystemModstamp;
  }

  

  public void setSystemModstamp(java.util.Calendar SystemModstamp) {
    this.SystemModstamp = SystemModstamp;
    SystemModstamp__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "FeedComment");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, CommentBody__typeInfo, CommentBody, CommentBody__is_set);
    __typeMapper.writeString(__out, CommentType__typeInfo, CommentType, CommentType__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeObject(__out, FeedAttachments__typeInfo, FeedAttachments, FeedAttachments__is_set);
    __typeMapper.writeString(__out, FeedItemId__typeInfo, FeedItemId, FeedItemId__is_set);
    __typeMapper.writeObject(__out, FeedRevisions__typeInfo, FeedRevisions, FeedRevisions__is_set);
    __typeMapper.writeObject(__out, InsertedBy__typeInfo, InsertedBy, InsertedBy__is_set);
    __typeMapper.writeString(__out, InsertedById__typeInfo, InsertedById, InsertedById__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, IsRichText__typeInfo, IsRichText, IsRichText__is_set);
    __typeMapper.writeString(__out, LastEditById__typeInfo, LastEditById, LastEditById__is_set);
    __typeMapper.writeObject(__out, LastEditDate__typeInfo, LastEditDate, LastEditDate__is_set);
    __typeMapper.writeString(__out, ParentId__typeInfo, ParentId, ParentId__is_set);
    __typeMapper.writeString(__out, RelatedRecordId__typeInfo, RelatedRecordId, RelatedRecordId__is_set);
    __typeMapper.writeObject(__out, Revision__typeInfo, Revision, Revision__is_set);
    __typeMapper.writeString(__out, Status__typeInfo, Status, Status__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
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
    if (__typeMapper.isElement(__in, CommentBody__typeInfo)) {
      setCommentBody((java.lang.String)__typeMapper.readString(__in, CommentBody__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CommentType__typeInfo)) {
      setCommentType((java.lang.String)__typeMapper.readString(__in, CommentType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CreatedBy__typeInfo)) {
      setCreatedBy((com.sforce.soap.enterprise.sobject.Name)__typeMapper.readObject(__in, CreatedBy__typeInfo, com.sforce.soap.enterprise.sobject.Name.class));
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
    if (__typeMapper.isElement(__in, FeedAttachments__typeInfo)) {
      setFeedAttachments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, FeedAttachments__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FeedItemId__typeInfo)) {
      setFeedItemId((java.lang.String)__typeMapper.readString(__in, FeedItemId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FeedRevisions__typeInfo)) {
      setFeedRevisions((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, FeedRevisions__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsRichText__typeInfo)) {
      setIsRichText((java.lang.Boolean)__typeMapper.readObject(__in, IsRichText__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LastEditById__typeInfo)) {
      setLastEditById((java.lang.String)__typeMapper.readString(__in, LastEditById__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LastEditDate__typeInfo)) {
      setLastEditDate((java.util.Calendar)__typeMapper.readObject(__in, LastEditDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ParentId__typeInfo)) {
      setParentId((java.lang.String)__typeMapper.readString(__in, ParentId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RelatedRecordId__typeInfo)) {
      setRelatedRecordId((java.lang.String)__typeMapper.readString(__in, RelatedRecordId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Revision__typeInfo)) {
      setRevision((java.lang.Integer)__typeMapper.readObject(__in, Revision__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Status__typeInfo)) {
      setStatus((java.lang.String)__typeMapper.readString(__in, Status__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[FeedComment ");
    sb.append(super.toString());
    sb.append(" CommentBody=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CommentBody)+"'\n");
    sb.append(" CommentType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CommentType)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" FeedAttachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FeedAttachments)+"'\n");
    sb.append(" FeedItemId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FeedItemId)+"'\n");
    sb.append(" FeedRevisions=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FeedRevisions)+"'\n");
    sb.append(" InsertedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(InsertedBy)+"'\n");
    sb.append(" InsertedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(InsertedById)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" IsRichText=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsRichText)+"'\n");
    sb.append(" LastEditById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastEditById)+"'\n");
    sb.append(" LastEditDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastEditDate)+"'\n");
    sb.append(" ParentId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ParentId)+"'\n");
    sb.append(" RelatedRecordId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RelatedRecordId)+"'\n");
    sb.append(" Revision=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Revision)+"'\n");
    sb.append(" Status=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Status)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}