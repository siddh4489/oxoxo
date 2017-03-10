package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class FeedItem extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public FeedItem() {
  }
    
  
  /**
   * element  : BestComment of type {urn:sobject.enterprise.soap.sforce.com}FeedComment
   * java type: com.sforce.soap.enterprise.sobject.FeedComment
   */
  private static final com.sforce.ws.bind.TypeInfo BestComment__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","BestComment","urn:sobject.enterprise.soap.sforce.com","FeedComment",0,1,true);

  private boolean BestComment__is_set = false;

  private com.sforce.soap.enterprise.sobject.FeedComment BestComment;

  public com.sforce.soap.enterprise.sobject.FeedComment getBestComment() {
    return BestComment;
  }

  

  public void setBestComment(com.sforce.soap.enterprise.sobject.FeedComment BestComment) {
    this.BestComment = BestComment;
    BestComment__is_set = true;
  }
  
  /**
   * element  : BestCommentId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo BestCommentId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","BestCommentId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean BestCommentId__is_set = false;

  private java.lang.String BestCommentId;

  public java.lang.String getBestCommentId() {
    return BestCommentId;
  }

  

  public void setBestCommentId(java.lang.String BestCommentId) {
    this.BestCommentId = BestCommentId;
    BestCommentId__is_set = true;
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
   * element  : FeedItemThanks of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo FeedItemThanks__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FeedItemThanks","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean FeedItemThanks__is_set = false;

  private com.sforce.soap.enterprise.QueryResult FeedItemThanks;

  public com.sforce.soap.enterprise.QueryResult getFeedItemThanks() {
    return FeedItemThanks;
  }

  

  public void setFeedItemThanks(com.sforce.soap.enterprise.QueryResult FeedItemThanks) {
    this.FeedItemThanks = FeedItemThanks;
    FeedItemThanks__is_set = true;
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
   * element  : HasContent of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo HasContent__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","HasContent","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean HasContent__is_set = false;

  private java.lang.Boolean HasContent;

  public java.lang.Boolean getHasContent() {
    return HasContent;
  }

  

  public void setHasContent(java.lang.Boolean HasContent) {
    this.HasContent = HasContent;
    HasContent__is_set = true;
  }
  
  /**
   * element  : HasLink of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo HasLink__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","HasLink","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean HasLink__is_set = false;

  private java.lang.Boolean HasLink;

  public java.lang.Boolean getHasLink() {
    return HasLink;
  }

  

  public void setHasLink(java.lang.Boolean HasLink) {
    this.HasLink = HasLink;
    HasLink__is_set = true;
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
   * element  : Parent of type {urn:sobject.enterprise.soap.sforce.com}Name
   * java type: com.sforce.soap.enterprise.sobject.Name
   */
  private static final com.sforce.ws.bind.TypeInfo Parent__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Parent","urn:sobject.enterprise.soap.sforce.com","Name",0,1,true);

  private boolean Parent__is_set = false;

  private com.sforce.soap.enterprise.sobject.Name Parent;

  public com.sforce.soap.enterprise.sobject.Name getParent() {
    return Parent;
  }

  

  public void setParent(com.sforce.soap.enterprise.sobject.Name Parent) {
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
   * element  : TopicAssignments of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo TopicAssignments__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TopicAssignments","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean TopicAssignments__is_set = false;

  private com.sforce.soap.enterprise.QueryResult TopicAssignments;

  public com.sforce.soap.enterprise.QueryResult getTopicAssignments() {
    return TopicAssignments;
  }

  

  public void setTopicAssignments(com.sforce.soap.enterprise.QueryResult TopicAssignments) {
    this.TopicAssignments = TopicAssignments;
    TopicAssignments__is_set = true;
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
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "FeedItem");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, BestComment__typeInfo, BestComment, BestComment__is_set);
    __typeMapper.writeString(__out, BestCommentId__typeInfo, BestCommentId, BestCommentId__is_set);
    __typeMapper.writeString(__out, Body__typeInfo, Body, Body__is_set);
    __typeMapper.writeObject(__out, CommentCount__typeInfo, CommentCount, CommentCount__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeObject(__out, FeedAttachments__typeInfo, FeedAttachments, FeedAttachments__is_set);
    __typeMapper.writeObject(__out, FeedComments__typeInfo, FeedComments, FeedComments__is_set);
    __typeMapper.writeObject(__out, FeedItemThanks__typeInfo, FeedItemThanks, FeedItemThanks__is_set);
    __typeMapper.writeObject(__out, FeedLikes__typeInfo, FeedLikes, FeedLikes__is_set);
    __typeMapper.writeObject(__out, FeedRevisions__typeInfo, FeedRevisions, FeedRevisions__is_set);
    __typeMapper.writeObject(__out, FeedTrackedChanges__typeInfo, FeedTrackedChanges, FeedTrackedChanges__is_set);
    __typeMapper.writeObject(__out, HasContent__typeInfo, HasContent, HasContent__is_set);
    __typeMapper.writeObject(__out, HasLink__typeInfo, HasLink, HasLink__is_set);
    __typeMapper.writeObject(__out, InsertedBy__typeInfo, InsertedBy, InsertedBy__is_set);
    __typeMapper.writeString(__out, InsertedById__typeInfo, InsertedById, InsertedById__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, IsRichText__typeInfo, IsRichText, IsRichText__is_set);
    __typeMapper.writeString(__out, LastEditById__typeInfo, LastEditById, LastEditById__is_set);
    __typeMapper.writeObject(__out, LastEditDate__typeInfo, LastEditDate, LastEditDate__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, LikeCount__typeInfo, LikeCount, LikeCount__is_set);
    __typeMapper.writeString(__out, LinkUrl__typeInfo, LinkUrl, LinkUrl__is_set);
    __typeMapper.writeObject(__out, Parent__typeInfo, Parent, Parent__is_set);
    __typeMapper.writeString(__out, ParentId__typeInfo, ParentId, ParentId__is_set);
    __typeMapper.writeString(__out, RelatedRecordId__typeInfo, RelatedRecordId, RelatedRecordId__is_set);
    __typeMapper.writeObject(__out, Revision__typeInfo, Revision, Revision__is_set);
    __typeMapper.writeString(__out, Status__typeInfo, Status, Status__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeString(__out, Title__typeInfo, Title, Title__is_set);
    __typeMapper.writeObject(__out, TopicAssignments__typeInfo, TopicAssignments, TopicAssignments__is_set);
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
    if (__typeMapper.isElement(__in, BestComment__typeInfo)) {
      setBestComment((com.sforce.soap.enterprise.sobject.FeedComment)__typeMapper.readObject(__in, BestComment__typeInfo, com.sforce.soap.enterprise.sobject.FeedComment.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, BestCommentId__typeInfo)) {
      setBestCommentId((java.lang.String)__typeMapper.readString(__in, BestCommentId__typeInfo, java.lang.String.class));
    }
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
    if (__typeMapper.isElement(__in, FeedItemThanks__typeInfo)) {
      setFeedItemThanks((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, FeedItemThanks__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FeedLikes__typeInfo)) {
      setFeedLikes((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, FeedLikes__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FeedRevisions__typeInfo)) {
      setFeedRevisions((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, FeedRevisions__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FeedTrackedChanges__typeInfo)) {
      setFeedTrackedChanges((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, FeedTrackedChanges__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, HasContent__typeInfo)) {
      setHasContent((java.lang.Boolean)__typeMapper.readObject(__in, HasContent__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, HasLink__typeInfo)) {
      setHasLink((java.lang.Boolean)__typeMapper.readObject(__in, HasLink__typeInfo, java.lang.Boolean.class));
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
    if (__typeMapper.isElement(__in, LastEditById__typeInfo)) {
      setLastEditById((java.lang.String)__typeMapper.readString(__in, LastEditById__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LastEditDate__typeInfo)) {
      setLastEditDate((java.util.Calendar)__typeMapper.readObject(__in, LastEditDate__typeInfo, java.util.Calendar.class));
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
      setParent((com.sforce.soap.enterprise.sobject.Name)__typeMapper.readObject(__in, Parent__typeInfo, com.sforce.soap.enterprise.sobject.Name.class));
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
    __in.peekTag();
    if (__typeMapper.isElement(__in, Title__typeInfo)) {
      setTitle((java.lang.String)__typeMapper.readString(__in, Title__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TopicAssignments__typeInfo)) {
      setTopicAssignments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, TopicAssignments__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Type__typeInfo)) {
      setType((java.lang.String)__typeMapper.readString(__in, Type__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[FeedItem ");
    sb.append(super.toString());
    sb.append(" BestComment=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(BestComment)+"'\n");
    sb.append(" BestCommentId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(BestCommentId)+"'\n");
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
    sb.append(" FeedItemThanks=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FeedItemThanks)+"'\n");
    sb.append(" FeedLikes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FeedLikes)+"'\n");
    sb.append(" FeedRevisions=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FeedRevisions)+"'\n");
    sb.append(" FeedTrackedChanges=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FeedTrackedChanges)+"'\n");
    sb.append(" HasContent=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(HasContent)+"'\n");
    sb.append(" HasLink=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(HasLink)+"'\n");
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
    sb.append(" Revision=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Revision)+"'\n");
    sb.append(" Status=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Status)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" Title=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Title)+"'\n");
    sb.append(" TopicAssignments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TopicAssignments)+"'\n");
    sb.append(" Type=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Type)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}