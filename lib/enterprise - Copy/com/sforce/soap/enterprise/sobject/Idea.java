package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class Idea extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public Idea() {
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
   * element  : Categories of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Categories__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Categories","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Categories__is_set = false;

  private java.lang.String Categories;

  public java.lang.String getCategories() {
    return Categories;
  }

  

  public void setCategories(java.lang.String Categories) {
    this.Categories = Categories;
    Categories__is_set = true;
  }
  
  /**
   * element  : Comments of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Comments__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Comments","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Comments__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Comments;

  public com.sforce.soap.enterprise.QueryResult getComments() {
    return Comments;
  }

  

  public void setComments(com.sforce.soap.enterprise.QueryResult Comments) {
    this.Comments = Comments;
    Comments__is_set = true;
  }
  
  /**
   * element  : Community of type {urn:sobject.enterprise.soap.sforce.com}Community
   * java type: com.sforce.soap.enterprise.sobject.Community
   */
  private static final com.sforce.ws.bind.TypeInfo Community__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Community","urn:sobject.enterprise.soap.sforce.com","Community",0,1,true);

  private boolean Community__is_set = false;

  private com.sforce.soap.enterprise.sobject.Community Community;

  public com.sforce.soap.enterprise.sobject.Community getCommunity() {
    return Community;
  }

  

  public void setCommunity(com.sforce.soap.enterprise.sobject.Community Community) {
    this.Community = Community;
    Community__is_set = true;
  }
  
  /**
   * element  : CommunityId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CommunityId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CommunityId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean CommunityId__is_set = false;

  private java.lang.String CommunityId;

  public java.lang.String getCommunityId() {
    return CommunityId;
  }

  

  public void setCommunityId(java.lang.String CommunityId) {
    this.CommunityId = CommunityId;
    CommunityId__is_set = true;
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
   * element  : CreatorFullPhotoUrl of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CreatorFullPhotoUrl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CreatorFullPhotoUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean CreatorFullPhotoUrl__is_set = false;

  private java.lang.String CreatorFullPhotoUrl;

  public java.lang.String getCreatorFullPhotoUrl() {
    return CreatorFullPhotoUrl;
  }

  

  public void setCreatorFullPhotoUrl(java.lang.String CreatorFullPhotoUrl) {
    this.CreatorFullPhotoUrl = CreatorFullPhotoUrl;
    CreatorFullPhotoUrl__is_set = true;
  }
  
  /**
   * element  : CreatorName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CreatorName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CreatorName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean CreatorName__is_set = false;

  private java.lang.String CreatorName;

  public java.lang.String getCreatorName() {
    return CreatorName;
  }

  

  public void setCreatorName(java.lang.String CreatorName) {
    this.CreatorName = CreatorName;
    CreatorName__is_set = true;
  }
  
  /**
   * element  : CreatorSmallPhotoUrl of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CreatorSmallPhotoUrl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CreatorSmallPhotoUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean CreatorSmallPhotoUrl__is_set = false;

  private java.lang.String CreatorSmallPhotoUrl;

  public java.lang.String getCreatorSmallPhotoUrl() {
    return CreatorSmallPhotoUrl;
  }

  

  public void setCreatorSmallPhotoUrl(java.lang.String CreatorSmallPhotoUrl) {
    this.CreatorSmallPhotoUrl = CreatorSmallPhotoUrl;
    CreatorSmallPhotoUrl__is_set = true;
  }
  
  /**
   * element  : IdeaTheme of type {urn:sobject.enterprise.soap.sforce.com}IdeaTheme
   * java type: com.sforce.soap.enterprise.sobject.IdeaTheme
   */
  private static final com.sforce.ws.bind.TypeInfo IdeaTheme__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IdeaTheme","urn:sobject.enterprise.soap.sforce.com","IdeaTheme",0,1,true);

  private boolean IdeaTheme__is_set = false;

  private com.sforce.soap.enterprise.sobject.IdeaTheme IdeaTheme;

  public com.sforce.soap.enterprise.sobject.IdeaTheme getIdeaTheme() {
    return IdeaTheme;
  }

  

  public void setIdeaTheme(com.sforce.soap.enterprise.sobject.IdeaTheme IdeaTheme) {
    this.IdeaTheme = IdeaTheme;
    IdeaTheme__is_set = true;
  }
  
  /**
   * element  : IdeaThemeId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo IdeaThemeId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IdeaThemeId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean IdeaThemeId__is_set = false;

  private java.lang.String IdeaThemeId;

  public java.lang.String getIdeaThemeId() {
    return IdeaThemeId;
  }

  

  public void setIdeaThemeId(java.lang.String IdeaThemeId) {
    this.IdeaThemeId = IdeaThemeId;
    IdeaThemeId__is_set = true;
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
   * element  : IsHtml of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsHtml__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsHtml","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsHtml__is_set = false;

  private java.lang.Boolean IsHtml;

  public java.lang.Boolean getIsHtml() {
    return IsHtml;
  }

  

  public void setIsHtml(java.lang.Boolean IsHtml) {
    this.IsHtml = IsHtml;
    IsHtml__is_set = true;
  }
  
  /**
   * element  : IsMerged of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsMerged__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsMerged","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsMerged__is_set = false;

  private java.lang.Boolean IsMerged;

  public java.lang.Boolean getIsMerged() {
    return IsMerged;
  }

  

  public void setIsMerged(java.lang.Boolean IsMerged) {
    this.IsMerged = IsMerged;
    IsMerged__is_set = true;
  }
  
  /**
   * element  : LastComment of type {urn:sobject.enterprise.soap.sforce.com}IdeaComment
   * java type: com.sforce.soap.enterprise.sobject.IdeaComment
   */
  private static final com.sforce.ws.bind.TypeInfo LastComment__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastComment","urn:sobject.enterprise.soap.sforce.com","IdeaComment",0,1,true);

  private boolean LastComment__is_set = false;

  private com.sforce.soap.enterprise.sobject.IdeaComment LastComment;

  public com.sforce.soap.enterprise.sobject.IdeaComment getLastComment() {
    return LastComment;
  }

  

  public void setLastComment(com.sforce.soap.enterprise.sobject.IdeaComment LastComment) {
    this.LastComment = LastComment;
    LastComment__is_set = true;
  }
  
  /**
   * element  : LastCommentDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo LastCommentDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastCommentDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean LastCommentDate__is_set = false;

  private java.util.Calendar LastCommentDate;

  public java.util.Calendar getLastCommentDate() {
    return LastCommentDate;
  }

  

  public void setLastCommentDate(java.util.Calendar LastCommentDate) {
    this.LastCommentDate = LastCommentDate;
    LastCommentDate__is_set = true;
  }
  
  /**
   * element  : LastCommentId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LastCommentId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastCommentId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean LastCommentId__is_set = false;

  private java.lang.String LastCommentId;

  public java.lang.String getLastCommentId() {
    return LastCommentId;
  }

  

  public void setLastCommentId(java.lang.String LastCommentId) {
    this.LastCommentId = LastCommentId;
    LastCommentId__is_set = true;
  }
  
  /**
   * element  : LastModifiedBy of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo LastModifiedBy__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastModifiedBy","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean LastModifiedBy__is_set = false;

  private com.sforce.soap.enterprise.sobject.User LastModifiedBy;

  public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
    return LastModifiedBy;
  }

  

  public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User LastModifiedBy) {
    this.LastModifiedBy = LastModifiedBy;
    LastModifiedBy__is_set = true;
  }
  
  /**
   * element  : LastModifiedById of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LastModifiedById__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastModifiedById","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean LastModifiedById__is_set = false;

  private java.lang.String LastModifiedById;

  public java.lang.String getLastModifiedById() {
    return LastModifiedById;
  }

  

  public void setLastModifiedById(java.lang.String LastModifiedById) {
    this.LastModifiedById = LastModifiedById;
    LastModifiedById__is_set = true;
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
   * element  : LastReferencedDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo LastReferencedDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastReferencedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean LastReferencedDate__is_set = false;

  private java.util.Calendar LastReferencedDate;

  public java.util.Calendar getLastReferencedDate() {
    return LastReferencedDate;
  }

  

  public void setLastReferencedDate(java.util.Calendar LastReferencedDate) {
    this.LastReferencedDate = LastReferencedDate;
    LastReferencedDate__is_set = true;
  }
  
  /**
   * element  : LastViewedDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo LastViewedDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastViewedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean LastViewedDate__is_set = false;

  private java.util.Calendar LastViewedDate;

  public java.util.Calendar getLastViewedDate() {
    return LastViewedDate;
  }

  

  public void setLastViewedDate(java.util.Calendar LastViewedDate) {
    this.LastViewedDate = LastViewedDate;
    LastViewedDate__is_set = true;
  }
  
  /**
   * element  : NumComments of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo NumComments__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","NumComments","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean NumComments__is_set = false;

  private java.lang.Integer NumComments;

  public java.lang.Integer getNumComments() {
    return NumComments;
  }

  

  public void setNumComments(java.lang.Integer NumComments) {
    this.NumComments = NumComments;
    NumComments__is_set = true;
  }
  
  /**
   * element  : ParentIdea of type {urn:sobject.enterprise.soap.sforce.com}Idea
   * java type: com.sforce.soap.enterprise.sobject.Idea
   */
  private static final com.sforce.ws.bind.TypeInfo ParentIdea__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ParentIdea","urn:sobject.enterprise.soap.sforce.com","Idea",0,1,true);

  private boolean ParentIdea__is_set = false;

  private com.sforce.soap.enterprise.sobject.Idea ParentIdea;

  public com.sforce.soap.enterprise.sobject.Idea getParentIdea() {
    return ParentIdea;
  }

  

  public void setParentIdea(com.sforce.soap.enterprise.sobject.Idea ParentIdea) {
    this.ParentIdea = ParentIdea;
    ParentIdea__is_set = true;
  }
  
  /**
   * element  : ParentIdeaId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ParentIdeaId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ParentIdeaId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ParentIdeaId__is_set = false;

  private java.lang.String ParentIdeaId;

  public java.lang.String getParentIdeaId() {
    return ParentIdeaId;
  }

  

  public void setParentIdeaId(java.lang.String ParentIdeaId) {
    this.ParentIdeaId = ParentIdeaId;
    ParentIdeaId__is_set = true;
  }
  
  /**
   * element  : RecordType of type {urn:sobject.enterprise.soap.sforce.com}RecordType
   * java type: com.sforce.soap.enterprise.sobject.RecordType
   */
  private static final com.sforce.ws.bind.TypeInfo RecordType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RecordType","urn:sobject.enterprise.soap.sforce.com","RecordType",0,1,true);

  private boolean RecordType__is_set = false;

  private com.sforce.soap.enterprise.sobject.RecordType RecordType;

  public com.sforce.soap.enterprise.sobject.RecordType getRecordType() {
    return RecordType;
  }

  

  public void setRecordType(com.sforce.soap.enterprise.sobject.RecordType RecordType) {
    this.RecordType = RecordType;
    RecordType__is_set = true;
  }
  
  /**
   * element  : RecordTypeId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo RecordTypeId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RecordTypeId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean RecordTypeId__is_set = false;

  private java.lang.String RecordTypeId;

  public java.lang.String getRecordTypeId() {
    return RecordTypeId;
  }

  

  public void setRecordTypeId(java.lang.String RecordTypeId) {
    this.RecordTypeId = RecordTypeId;
    RecordTypeId__is_set = true;
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
   * element  : UserRecordAccess of type {urn:sobject.enterprise.soap.sforce.com}UserRecordAccess
   * java type: com.sforce.soap.enterprise.sobject.UserRecordAccess
   */
  private static final com.sforce.ws.bind.TypeInfo UserRecordAccess__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserRecordAccess","urn:sobject.enterprise.soap.sforce.com","UserRecordAccess",0,1,true);

  private boolean UserRecordAccess__is_set = false;

  private com.sforce.soap.enterprise.sobject.UserRecordAccess UserRecordAccess;

  public com.sforce.soap.enterprise.sobject.UserRecordAccess getUserRecordAccess() {
    return UserRecordAccess;
  }

  

  public void setUserRecordAccess(com.sforce.soap.enterprise.sobject.UserRecordAccess UserRecordAccess) {
    this.UserRecordAccess = UserRecordAccess;
    UserRecordAccess__is_set = true;
  }
  
  /**
   * element  : VoteScore of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo VoteScore__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VoteScore","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean VoteScore__is_set = false;

  private java.lang.Double VoteScore;

  public java.lang.Double getVoteScore() {
    return VoteScore;
  }

  

  public void setVoteScore(java.lang.Double VoteScore) {
    this.VoteScore = VoteScore;
    VoteScore__is_set = true;
  }
  
  /**
   * element  : VoteTotal of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo VoteTotal__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VoteTotal","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean VoteTotal__is_set = false;

  private java.lang.Double VoteTotal;

  public java.lang.Double getVoteTotal() {
    return VoteTotal;
  }

  

  public void setVoteTotal(java.lang.Double VoteTotal) {
    this.VoteTotal = VoteTotal;
    VoteTotal__is_set = true;
  }
  
  /**
   * element  : Votes of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Votes__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Votes","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Votes__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Votes;

  public com.sforce.soap.enterprise.QueryResult getVotes() {
    return Votes;
  }

  

  public void setVotes(com.sforce.soap.enterprise.QueryResult Votes) {
    this.Votes = Votes;
    Votes__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "Idea");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, Body__typeInfo, Body, Body__is_set);
    __typeMapper.writeString(__out, Categories__typeInfo, Categories, Categories__is_set);
    __typeMapper.writeObject(__out, Comments__typeInfo, Comments, Comments__is_set);
    __typeMapper.writeObject(__out, Community__typeInfo, Community, Community__is_set);
    __typeMapper.writeString(__out, CommunityId__typeInfo, CommunityId, CommunityId__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, CreatorFullPhotoUrl__typeInfo, CreatorFullPhotoUrl, CreatorFullPhotoUrl__is_set);
    __typeMapper.writeString(__out, CreatorName__typeInfo, CreatorName, CreatorName__is_set);
    __typeMapper.writeString(__out, CreatorSmallPhotoUrl__typeInfo, CreatorSmallPhotoUrl, CreatorSmallPhotoUrl__is_set);
    __typeMapper.writeObject(__out, IdeaTheme__typeInfo, IdeaTheme, IdeaTheme__is_set);
    __typeMapper.writeString(__out, IdeaThemeId__typeInfo, IdeaThemeId, IdeaThemeId__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, IsHtml__typeInfo, IsHtml, IsHtml__is_set);
    __typeMapper.writeObject(__out, IsMerged__typeInfo, IsMerged, IsMerged__is_set);
    __typeMapper.writeObject(__out, LastComment__typeInfo, LastComment, LastComment__is_set);
    __typeMapper.writeObject(__out, LastCommentDate__typeInfo, LastCommentDate, LastCommentDate__is_set);
    __typeMapper.writeString(__out, LastCommentId__typeInfo, LastCommentId, LastCommentId__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, LastReferencedDate__typeInfo, LastReferencedDate, LastReferencedDate__is_set);
    __typeMapper.writeObject(__out, LastViewedDate__typeInfo, LastViewedDate, LastViewedDate__is_set);
    __typeMapper.writeObject(__out, NumComments__typeInfo, NumComments, NumComments__is_set);
    __typeMapper.writeObject(__out, ParentIdea__typeInfo, ParentIdea, ParentIdea__is_set);
    __typeMapper.writeString(__out, ParentIdeaId__typeInfo, ParentIdeaId, ParentIdeaId__is_set);
    __typeMapper.writeObject(__out, RecordType__typeInfo, RecordType, RecordType__is_set);
    __typeMapper.writeString(__out, RecordTypeId__typeInfo, RecordTypeId, RecordTypeId__is_set);
    __typeMapper.writeString(__out, Status__typeInfo, Status, Status__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeString(__out, Title__typeInfo, Title, Title__is_set);
    __typeMapper.writeObject(__out, UserRecordAccess__typeInfo, UserRecordAccess, UserRecordAccess__is_set);
    __typeMapper.writeObject(__out, VoteScore__typeInfo, VoteScore, VoteScore__is_set);
    __typeMapper.writeObject(__out, VoteTotal__typeInfo, VoteTotal, VoteTotal__is_set);
    __typeMapper.writeObject(__out, Votes__typeInfo, Votes, Votes__is_set);
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
    if (__typeMapper.isElement(__in, Categories__typeInfo)) {
      setCategories((java.lang.String)__typeMapper.readString(__in, Categories__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Comments__typeInfo)) {
      setComments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Comments__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Community__typeInfo)) {
      setCommunity((com.sforce.soap.enterprise.sobject.Community)__typeMapper.readObject(__in, Community__typeInfo, com.sforce.soap.enterprise.sobject.Community.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CommunityId__typeInfo)) {
      setCommunityId((java.lang.String)__typeMapper.readString(__in, CommunityId__typeInfo, java.lang.String.class));
    }
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
    if (__typeMapper.isElement(__in, CreatorFullPhotoUrl__typeInfo)) {
      setCreatorFullPhotoUrl((java.lang.String)__typeMapper.readString(__in, CreatorFullPhotoUrl__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CreatorName__typeInfo)) {
      setCreatorName((java.lang.String)__typeMapper.readString(__in, CreatorName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CreatorSmallPhotoUrl__typeInfo)) {
      setCreatorSmallPhotoUrl((java.lang.String)__typeMapper.readString(__in, CreatorSmallPhotoUrl__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IdeaTheme__typeInfo)) {
      setIdeaTheme((com.sforce.soap.enterprise.sobject.IdeaTheme)__typeMapper.readObject(__in, IdeaTheme__typeInfo, com.sforce.soap.enterprise.sobject.IdeaTheme.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IdeaThemeId__typeInfo)) {
      setIdeaThemeId((java.lang.String)__typeMapper.readString(__in, IdeaThemeId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {
      setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, IsDeleted__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsHtml__typeInfo)) {
      setIsHtml((java.lang.Boolean)__typeMapper.readObject(__in, IsHtml__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsMerged__typeInfo)) {
      setIsMerged((java.lang.Boolean)__typeMapper.readObject(__in, IsMerged__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LastComment__typeInfo)) {
      setLastComment((com.sforce.soap.enterprise.sobject.IdeaComment)__typeMapper.readObject(__in, LastComment__typeInfo, com.sforce.soap.enterprise.sobject.IdeaComment.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LastCommentDate__typeInfo)) {
      setLastCommentDate((java.util.Calendar)__typeMapper.readObject(__in, LastCommentDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LastCommentId__typeInfo)) {
      setLastCommentId((java.lang.String)__typeMapper.readString(__in, LastCommentId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LastModifiedBy__typeInfo)) {
      setLastModifiedBy((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, LastModifiedBy__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LastModifiedById__typeInfo)) {
      setLastModifiedById((java.lang.String)__typeMapper.readString(__in, LastModifiedById__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LastModifiedDate__typeInfo)) {
      setLastModifiedDate((java.util.Calendar)__typeMapper.readObject(__in, LastModifiedDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LastReferencedDate__typeInfo)) {
      setLastReferencedDate((java.util.Calendar)__typeMapper.readObject(__in, LastReferencedDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LastViewedDate__typeInfo)) {
      setLastViewedDate((java.util.Calendar)__typeMapper.readObject(__in, LastViewedDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, NumComments__typeInfo)) {
      setNumComments((java.lang.Integer)__typeMapper.readObject(__in, NumComments__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ParentIdea__typeInfo)) {
      setParentIdea((com.sforce.soap.enterprise.sobject.Idea)__typeMapper.readObject(__in, ParentIdea__typeInfo, com.sforce.soap.enterprise.sobject.Idea.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ParentIdeaId__typeInfo)) {
      setParentIdeaId((java.lang.String)__typeMapper.readString(__in, ParentIdeaId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RecordType__typeInfo)) {
      setRecordType((com.sforce.soap.enterprise.sobject.RecordType)__typeMapper.readObject(__in, RecordType__typeInfo, com.sforce.soap.enterprise.sobject.RecordType.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RecordTypeId__typeInfo)) {
      setRecordTypeId((java.lang.String)__typeMapper.readString(__in, RecordTypeId__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, UserRecordAccess__typeInfo)) {
      setUserRecordAccess((com.sforce.soap.enterprise.sobject.UserRecordAccess)__typeMapper.readObject(__in, UserRecordAccess__typeInfo, com.sforce.soap.enterprise.sobject.UserRecordAccess.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VoteScore__typeInfo)) {
      setVoteScore((java.lang.Double)__typeMapper.readObject(__in, VoteScore__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VoteTotal__typeInfo)) {
      setVoteTotal((java.lang.Double)__typeMapper.readObject(__in, VoteTotal__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Votes__typeInfo)) {
      setVotes((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Votes__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[Idea ");
    sb.append(super.toString());
    sb.append(" Body=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Body)+"'\n");
    sb.append(" Categories=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Categories)+"'\n");
    sb.append(" Comments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Comments)+"'\n");
    sb.append(" Community=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Community)+"'\n");
    sb.append(" CommunityId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CommunityId)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" CreatorFullPhotoUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatorFullPhotoUrl)+"'\n");
    sb.append(" CreatorName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatorName)+"'\n");
    sb.append(" CreatorSmallPhotoUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatorSmallPhotoUrl)+"'\n");
    sb.append(" IdeaTheme=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IdeaTheme)+"'\n");
    sb.append(" IdeaThemeId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IdeaThemeId)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" IsHtml=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsHtml)+"'\n");
    sb.append(" IsMerged=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsMerged)+"'\n");
    sb.append(" LastComment=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastComment)+"'\n");
    sb.append(" LastCommentDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastCommentDate)+"'\n");
    sb.append(" LastCommentId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastCommentId)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" LastReferencedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastReferencedDate)+"'\n");
    sb.append(" LastViewedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastViewedDate)+"'\n");
    sb.append(" NumComments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NumComments)+"'\n");
    sb.append(" ParentIdea=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ParentIdea)+"'\n");
    sb.append(" ParentIdeaId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ParentIdeaId)+"'\n");
    sb.append(" RecordType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecordType)+"'\n");
    sb.append(" RecordTypeId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecordTypeId)+"'\n");
    sb.append(" Status=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Status)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" Title=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Title)+"'\n");
    sb.append(" UserRecordAccess=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserRecordAccess)+"'\n");
    sb.append(" VoteScore=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VoteScore)+"'\n");
    sb.append(" VoteTotal=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VoteTotal)+"'\n");
    sb.append(" Votes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Votes)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}