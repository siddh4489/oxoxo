package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class UserFeed extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public UserFeed() {
  }
    
  
  /**
   * element  : Body of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Body__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Body","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Body__is_set = false;

  private java.lang.String Body;

  public java.lang.String getBody() {
    return Body;
  }

  

  public void setBody(java.lang.String Body) {
    this.Body = Body;
    Body__is_set = true;
  }
  
  /**
   * element  : CommentCount of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo CommentCount__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CommentCount","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean CommentCount__is_set = false;

  private java.lang.Integer CommentCount;

  public java.lang.Integer getCommentCount() {
    return CommentCount;
  }

  

  public void setCommentCount(java.lang.Integer CommentCount) {
    this.CommentCount = CommentCount;
    CommentCount__is_set = true;
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
   * element  : FeedComments of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo FeedComments__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FeedComments","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean FeedComments__is_set = false;

  private com.sforce.soap.enterprise.QueryResult FeedComments;

  public com.sforce.soap.enterprise.QueryResult getFeedComments() {
    return FeedComments;
  }

  

  public void setFeedComments(com.sforce.soap.enterprise.QueryResult FeedComments) {
    this.FeedComments = FeedComments;
    FeedComments__is_set = true;
  }
  
  /**
   * element  : FeedLikes of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo FeedLikes__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FeedLikes","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean FeedLikes__is_set = false;

  private com.sforce.soap.enterprise.QueryResult FeedLikes;

  public com.sforce.soap.enterprise.QueryResult getFeedLikes() {
    return FeedLikes;
  }

  

  public void setFeedLikes(com.sforce.soap.enterprise.QueryResult FeedLikes) {
    this.FeedLikes = FeedLikes;
    FeedLikes__is_set = true;
  }
  
  /**
   * element  : FeedTrackedChanges of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo FeedTrackedChanges__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FeedTrackedChanges","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean FeedTrackedChanges__is_set = false;

  private com.sforce.soap.enterprise.QueryResult FeedTrackedChanges;

  public com.sforce.soap.enterprise.QueryResult getFeedTrackedChanges() {
    return FeedTrackedChanges;
  }

  

  public void setFeedTrackedChanges(com.sforce.soap.enterprise.QueryResult FeedTrackedChanges) {
    this.FeedTrackedChanges = FeedTrackedChanges;
    FeedTrackedChanges__is_set = true;
  }
  
  /**
   * element  : InsertedBy of type {urn:sobject.enterprise.soap.sforce.com}Name
   * java type: com.sforce.soap.enterprise.sobject.Name
   */
  private static final com.sforce.ws.bind.TypeInfo InsertedBy__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","InsertedBy","urn:sobject.enterprise.soap.sforce.com","Name",0,1,true);

  private boolean InsertedBy__is_set = false;

  private com.sforce.soap.enterprise.sobject.Name InsertedBy;

  public com.sforce.soap.enterprise.sobject.Name getInsertedBy() {
    return InsertedBy;
  }

  

  public void setInsertedBy(com.sforce.soap.enterprise.sobject.Name InsertedBy) {
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
   * element  : LastModifiedDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo LastModifiedDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastModifiedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean LastModifiedDate__is_set = false;

  private java.util.Calendar LastModifiedDate;

  public java.util.Calendar getLastModifiedDate() {
    return LastModifiedDate;
  }

  

  public void setLastModifiedDate(java.util.Calendar LastModifiedDate) {
    this.LastModifiedDate = LastModifiedDate;
    LastModifiedDate__is_set = true;
  }
  
  /**
   * element  : LikeCount of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo LikeCount__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LikeCount","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean LikeCount__is_set = false;

  private java.lang.Integer LikeCount;

  public java.lang.Integer getLikeCount() {
    return LikeCount;
  }

  

  public void setLikeCount(java.lang.Integer LikeCount) {
    this.LikeCount = LikeCount;
    LikeCount__is_set = true;
  }
  
  /**
   * element  : LinkUrl of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LinkUrl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LinkUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean LinkUrl__is_set = false;

  private java.lang.String LinkUrl;

  public java.lang.String getLinkUrl() {
    return LinkUrl;
  }

  

  public void setLinkUrl(java.lang.String LinkUrl) {
    this.LinkUrl = LinkUrl;
    LinkUrl__is_set = true;
  }
  
  /**
   * element  : Parent of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo Parent__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Parent","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean Parent__is_set = false;

  private com.sforce.soap.enterprise.sobject.User Parent;

  public com.sforce.soap.enterprise.sobject.User getParent() {
    return Parent;
  }

  

  public void setParent(com.sforce.soap.enterprise.sobject.User Parent) {
    this.Parent = Parent;
    Parent__is_set = true;
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
   * element  : Title of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Title__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Title","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Title__is_set = false;

  private java.lang.String Title;

  public java.lang.String getTitle() {
    return Title;
  }

  

  public void setTitle(java.lang.String Title) {
    this.Title = Title;
    Title__is_set = true;
  }
  
  /**
   * element  : Type of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Type__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Type","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Type__is_set = false;

  private java.lang.String Type;

  public java.lang.String getType() {
    return Type;
  }

  

  public void setType(java.lang.String Type) {
    this.Type = Type;
    Type__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "UserFeed");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, Body__typeInfo, Body, Body__is_set);
    __typeMapper.writeObject(__out, CommentCount__typeInfo, CommentCount, CommentCount__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeObject(__out, FeedAttachments__typeInfo, FeedAttachments, FeedAttachments__is_set);
    __typeMapper.writeObject(__out, FeedComments__typeInfo, FeedComments, FeedComments__is_set);
    __typeMapper.writeObject(__out, FeedLikes__typeInfo, FeedLikes, FeedLikes__is_set);
    __typeMapper.writeObject(__out, FeedTrackedChanges__typeInfo, FeedTrackedChanges, FeedTrackedChanges__is_set);
    __typeMapper.writeObject(__out, InsertedBy__typeInfo, InsertedBy, InsertedBy__is_set);
    __typeMapper.writeString(__out, InsertedById__typeInfo, InsertedById, InsertedById__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, IsRichText__typeInfo, IsRichText, IsRichText__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, LikeCount__typeInfo, LikeCount, LikeCount__is_set);
    __typeMapper.writeString(__out, LinkUrl__typeInfo, LinkUrl, LinkUrl__is_set);
    __typeMapper.writeObject(__out, Parent__typeInfo, Parent, Parent__is_set);
    __typeMapper.writeString(__out, ParentId__typeInfo, ParentId, ParentId__is_set);
    __typeMapper.writeString(__out, RelatedRecordId__typeInfo, RelatedRecordId, RelatedRecordId__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeString(__out, Title__typeInfo, Title, Title__is_set);
    __typeMapper.writeString(__out, Type__typeInfo, Type, Type__is_set);
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
    if (__typeMapper.isElement(__in, Body__typeInfo)) {
      setBody((java.lang.String)__typeMapper.readString(__in, Body__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CommentCount__typeInfo)) {
      setCommentCount((java.lang.Integer)__typeMapper.readObject(__in, CommentCount__typeInfo, java.lang.Integer.class));
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
    if (__typeMapper.isElement(__in, FeedComments__typeInfo)) {
      setFeedComments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, FeedComments__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FeedLikes__typeInfo)) {
      setFeedLikes((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, FeedLikes__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FeedTrackedChanges__typeInfo)) {
      setFeedTrackedChanges((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, FeedTrackedChanges__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, InsertedBy__typeInfo)) {
      setInsertedBy((com.sforce.soap.enterprise.sobject.Name)__typeMapper.readObject(__in, InsertedBy__typeInfo, com.sforce.soap.enterprise.sobject.Name.class));
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
    if (__typeMapper.isElement(__in, LastModifiedDate__typeInfo)) {
      setLastModifiedDate((java.util.Calendar)__typeMapper.readObject(__in, LastModifiedDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LikeCount__typeInfo)) {
      setLikeCount((java.lang.Integer)__typeMapper.readObject(__in, LikeCount__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LinkUrl__typeInfo)) {
      setLinkUrl((java.lang.String)__typeMapper.readString(__in, LinkUrl__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Parent__typeInfo)) {
      setParent((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, Parent__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
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
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Title__typeInfo)) {
      setTitle((java.lang.String)__typeMapper.readString(__in, Title__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Type__typeInfo)) {
      setType((java.lang.String)__typeMapper.readString(__in, Type__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[UserFeed ");
    sb.append(super.toString());
    sb.append(" Body=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Body)+"'\n");
    sb.append(" CommentCount=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CommentCount)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" FeedAttachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FeedAttachments)+"'\n");
    sb.append(" FeedComments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FeedComments)+"'\n");
    sb.append(" FeedLikes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FeedLikes)+"'\n");
    sb.append(" FeedTrackedChanges=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FeedTrackedChanges)+"'\n");
    sb.append(" InsertedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(InsertedBy)+"'\n");
    sb.append(" InsertedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(InsertedById)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" IsRichText=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsRichText)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" LikeCount=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LikeCount)+"'\n");
    sb.append(" LinkUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LinkUrl)+"'\n");
    sb.append(" Parent=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Parent)+"'\n");
    sb.append(" ParentId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ParentId)+"'\n");
    sb.append(" RelatedRecordId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RelatedRecordId)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" Title=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Title)+"'\n");
    sb.append(" Type=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Type)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}