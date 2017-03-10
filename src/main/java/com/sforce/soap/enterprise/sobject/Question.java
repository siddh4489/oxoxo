package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class Question extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public Question() {
  }
    
  
  /**
   * element  : BestReply of type {urn:sobject.enterprise.soap.sforce.com}Reply
   * java type: com.sforce.soap.enterprise.sobject.Reply
   */
  private static final com.sforce.ws.bind.TypeInfo BestReply__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","BestReply","urn:sobject.enterprise.soap.sforce.com","Reply",0,1,true);

  private boolean BestReply__is_set = false;

  private com.sforce.soap.enterprise.sobject.Reply BestReply;

  public com.sforce.soap.enterprise.sobject.Reply getBestReply() {
    return BestReply;
  }

  

  public void setBestReply(com.sforce.soap.enterprise.sobject.Reply BestReply) {
    this.BestReply = BestReply;
    BestReply__is_set = true;
  }
  
  /**
   * element  : BestReplyId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo BestReplyId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","BestReplyId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean BestReplyId__is_set = false;

  private java.lang.String BestReplyId;

  public java.lang.String getBestReplyId() {
    return BestReplyId;
  }

  

  public void setBestReplyId(java.lang.String BestReplyId) {
    this.BestReplyId = BestReplyId;
    BestReplyId__is_set = true;
  }
  
  /**
   * element  : BestReplySelectedBy of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo BestReplySelectedBy__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","BestReplySelectedBy","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean BestReplySelectedBy__is_set = false;

  private com.sforce.soap.enterprise.sobject.User BestReplySelectedBy;

  public com.sforce.soap.enterprise.sobject.User getBestReplySelectedBy() {
    return BestReplySelectedBy;
  }

  

  public void setBestReplySelectedBy(com.sforce.soap.enterprise.sobject.User BestReplySelectedBy) {
    this.BestReplySelectedBy = BestReplySelectedBy;
    BestReplySelectedBy__is_set = true;
  }
  
  /**
   * element  : BestReplySelectedById of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo BestReplySelectedById__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","BestReplySelectedById","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean BestReplySelectedById__is_set = false;

  private java.lang.String BestReplySelectedById;

  public java.lang.String getBestReplySelectedById() {
    return BestReplySelectedById;
  }

  

  public void setBestReplySelectedById(java.lang.String BestReplySelectedById) {
    this.BestReplySelectedById = BestReplySelectedById;
    BestReplySelectedById__is_set = true;
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
   * element  : Cases of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Cases__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Cases","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Cases__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Cases;

  public com.sforce.soap.enterprise.QueryResult getCases() {
    return Cases;
  }

  

  public void setCases(com.sforce.soap.enterprise.QueryResult Cases) {
    this.Cases = Cases;
    Cases__is_set = true;
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
   * element  : DataCategorySelections of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo DataCategorySelections__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DataCategorySelections","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean DataCategorySelections__is_set = false;

  private com.sforce.soap.enterprise.QueryResult DataCategorySelections;

  public com.sforce.soap.enterprise.QueryResult getDataCategorySelections() {
    return DataCategorySelections;
  }

  

  public void setDataCategorySelections(com.sforce.soap.enterprise.QueryResult DataCategorySelections) {
    this.DataCategorySelections = DataCategorySelections;
    DataCategorySelections__is_set = true;
  }
  
  /**
   * element  : HasSingleFieldForContent of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo HasSingleFieldForContent__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","HasSingleFieldForContent","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean HasSingleFieldForContent__is_set = false;

  private java.lang.Boolean HasSingleFieldForContent;

  public java.lang.Boolean getHasSingleFieldForContent() {
    return HasSingleFieldForContent;
  }

  

  public void setHasSingleFieldForContent(java.lang.Boolean HasSingleFieldForContent) {
    this.HasSingleFieldForContent = HasSingleFieldForContent;
    HasSingleFieldForContent__is_set = true;
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
   * element  : LastReply of type {urn:sobject.enterprise.soap.sforce.com}Reply
   * java type: com.sforce.soap.enterprise.sobject.Reply
   */
  private static final com.sforce.ws.bind.TypeInfo LastReply__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastReply","urn:sobject.enterprise.soap.sforce.com","Reply",0,1,true);

  private boolean LastReply__is_set = false;

  private com.sforce.soap.enterprise.sobject.Reply LastReply;

  public com.sforce.soap.enterprise.sobject.Reply getLastReply() {
    return LastReply;
  }

  

  public void setLastReply(com.sforce.soap.enterprise.sobject.Reply LastReply) {
    this.LastReply = LastReply;
    LastReply__is_set = true;
  }
  
  /**
   * element  : LastReplyDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo LastReplyDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastReplyDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean LastReplyDate__is_set = false;

  private java.util.Calendar LastReplyDate;

  public java.util.Calendar getLastReplyDate() {
    return LastReplyDate;
  }

  

  public void setLastReplyDate(java.util.Calendar LastReplyDate) {
    this.LastReplyDate = LastReplyDate;
    LastReplyDate__is_set = true;
  }
  
  /**
   * element  : LastReplyId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LastReplyId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastReplyId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean LastReplyId__is_set = false;

  private java.lang.String LastReplyId;

  public java.lang.String getLastReplyId() {
    return LastReplyId;
  }

  

  public void setLastReplyId(java.lang.String LastReplyId) {
    this.LastReplyId = LastReplyId;
    LastReplyId__is_set = true;
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
   * element  : MostReportAbusesOnReply of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo MostReportAbusesOnReply__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MostReportAbusesOnReply","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean MostReportAbusesOnReply__is_set = false;

  private java.lang.Integer MostReportAbusesOnReply;

  public java.lang.Integer getMostReportAbusesOnReply() {
    return MostReportAbusesOnReply;
  }

  

  public void setMostReportAbusesOnReply(java.lang.Integer MostReportAbusesOnReply) {
    this.MostReportAbusesOnReply = MostReportAbusesOnReply;
    MostReportAbusesOnReply__is_set = true;
  }
  
  /**
   * element  : NumReplies of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo NumReplies__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","NumReplies","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean NumReplies__is_set = false;

  private java.lang.Integer NumReplies;

  public java.lang.Integer getNumReplies() {
    return NumReplies;
  }

  

  public void setNumReplies(java.lang.Integer NumReplies) {
    this.NumReplies = NumReplies;
    NumReplies__is_set = true;
  }
  
  /**
   * element  : NumReportAbuses of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo NumReportAbuses__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","NumReportAbuses","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean NumReportAbuses__is_set = false;

  private java.lang.Integer NumReportAbuses;

  public java.lang.Integer getNumReportAbuses() {
    return NumReportAbuses;
  }

  

  public void setNumReportAbuses(java.lang.Integer NumReportAbuses) {
    this.NumReportAbuses = NumReportAbuses;
    NumReportAbuses__is_set = true;
  }
  
  /**
   * element  : NumSubscriptions of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo NumSubscriptions__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","NumSubscriptions","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean NumSubscriptions__is_set = false;

  private java.lang.Integer NumSubscriptions;

  public java.lang.Integer getNumSubscriptions() {
    return NumSubscriptions;
  }

  

  public void setNumSubscriptions(java.lang.Integer NumSubscriptions) {
    this.NumSubscriptions = NumSubscriptions;
    NumSubscriptions__is_set = true;
  }
  
  /**
   * element  : Origin of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Origin__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Origin","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Origin__is_set = false;

  private java.lang.String Origin;

  public java.lang.String getOrigin() {
    return Origin;
  }

  

  public void setOrigin(java.lang.String Origin) {
    this.Origin = Origin;
    Origin__is_set = true;
  }
  
  /**
   * element  : Posts of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Posts__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Posts","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Posts__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Posts;

  public com.sforce.soap.enterprise.QueryResult getPosts() {
    return Posts;
  }

  

  public void setPosts(com.sforce.soap.enterprise.QueryResult Posts) {
    this.Posts = Posts;
    Posts__is_set = true;
  }
  
  /**
   * element  : Priority of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Priority__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Priority","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Priority__is_set = false;

  private java.lang.String Priority;

  public java.lang.String getPriority() {
    return Priority;
  }

  

  public void setPriority(java.lang.String Priority) {
    this.Priority = Priority;
    Priority__is_set = true;
  }
  
  /**
   * element  : QuestionReportAbuses of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo QuestionReportAbuses__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","QuestionReportAbuses","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean QuestionReportAbuses__is_set = false;

  private com.sforce.soap.enterprise.QueryResult QuestionReportAbuses;

  public com.sforce.soap.enterprise.QueryResult getQuestionReportAbuses() {
    return QuestionReportAbuses;
  }

  

  public void setQuestionReportAbuses(com.sforce.soap.enterprise.QueryResult QuestionReportAbuses) {
    this.QuestionReportAbuses = QuestionReportAbuses;
    QuestionReportAbuses__is_set = true;
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
   * element  : Replies of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Replies__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Replies","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Replies__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Replies;

  public com.sforce.soap.enterprise.QueryResult getReplies() {
    return Replies;
  }

  

  public void setReplies(com.sforce.soap.enterprise.QueryResult Replies) {
    this.Replies = Replies;
    Replies__is_set = true;
  }
  
  /**
   * element  : Subscriptions of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Subscriptions__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Subscriptions","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Subscriptions__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Subscriptions;

  public com.sforce.soap.enterprise.QueryResult getSubscriptions() {
    return Subscriptions;
  }

  

  public void setSubscriptions(com.sforce.soap.enterprise.QueryResult Subscriptions) {
    this.Subscriptions = Subscriptions;
    Subscriptions__is_set = true;
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
   * element  : UpVotes of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo UpVotes__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UpVotes","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean UpVotes__is_set = false;

  private java.lang.Integer UpVotes;

  public java.lang.Integer getUpVotes() {
    return UpVotes;
  }

  

  public void setUpVotes(java.lang.Integer UpVotes) {
    this.UpVotes = UpVotes;
    UpVotes__is_set = true;
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
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "Question");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, BestReply__typeInfo, BestReply, BestReply__is_set);
    __typeMapper.writeString(__out, BestReplyId__typeInfo, BestReplyId, BestReplyId__is_set);
    __typeMapper.writeObject(__out, BestReplySelectedBy__typeInfo, BestReplySelectedBy, BestReplySelectedBy__is_set);
    __typeMapper.writeString(__out, BestReplySelectedById__typeInfo, BestReplySelectedById, BestReplySelectedById__is_set);
    __typeMapper.writeString(__out, Body__typeInfo, Body, Body__is_set);
    __typeMapper.writeObject(__out, Cases__typeInfo, Cases, Cases__is_set);
    __typeMapper.writeObject(__out, Community__typeInfo, Community, Community__is_set);
    __typeMapper.writeString(__out, CommunityId__typeInfo, CommunityId, CommunityId__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, CreatorFullPhotoUrl__typeInfo, CreatorFullPhotoUrl, CreatorFullPhotoUrl__is_set);
    __typeMapper.writeString(__out, CreatorName__typeInfo, CreatorName, CreatorName__is_set);
    __typeMapper.writeString(__out, CreatorSmallPhotoUrl__typeInfo, CreatorSmallPhotoUrl, CreatorSmallPhotoUrl__is_set);
    __typeMapper.writeObject(__out, DataCategorySelections__typeInfo, DataCategorySelections, DataCategorySelections__is_set);
    __typeMapper.writeObject(__out, HasSingleFieldForContent__typeInfo, HasSingleFieldForContent, HasSingleFieldForContent__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, LastReferencedDate__typeInfo, LastReferencedDate, LastReferencedDate__is_set);
    __typeMapper.writeObject(__out, LastReply__typeInfo, LastReply, LastReply__is_set);
    __typeMapper.writeObject(__out, LastReplyDate__typeInfo, LastReplyDate, LastReplyDate__is_set);
    __typeMapper.writeString(__out, LastReplyId__typeInfo, LastReplyId, LastReplyId__is_set);
    __typeMapper.writeObject(__out, LastViewedDate__typeInfo, LastViewedDate, LastViewedDate__is_set);
    __typeMapper.writeObject(__out, MostReportAbusesOnReply__typeInfo, MostReportAbusesOnReply, MostReportAbusesOnReply__is_set);
    __typeMapper.writeObject(__out, NumReplies__typeInfo, NumReplies, NumReplies__is_set);
    __typeMapper.writeObject(__out, NumReportAbuses__typeInfo, NumReportAbuses, NumReportAbuses__is_set);
    __typeMapper.writeObject(__out, NumSubscriptions__typeInfo, NumSubscriptions, NumSubscriptions__is_set);
    __typeMapper.writeString(__out, Origin__typeInfo, Origin, Origin__is_set);
    __typeMapper.writeObject(__out, Posts__typeInfo, Posts, Posts__is_set);
    __typeMapper.writeString(__out, Priority__typeInfo, Priority, Priority__is_set);
    __typeMapper.writeObject(__out, QuestionReportAbuses__typeInfo, QuestionReportAbuses, QuestionReportAbuses__is_set);
    __typeMapper.writeObject(__out, RecordType__typeInfo, RecordType, RecordType__is_set);
    __typeMapper.writeString(__out, RecordTypeId__typeInfo, RecordTypeId, RecordTypeId__is_set);
    __typeMapper.writeObject(__out, Replies__typeInfo, Replies, Replies__is_set);
    __typeMapper.writeObject(__out, Subscriptions__typeInfo, Subscriptions, Subscriptions__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeString(__out, Title__typeInfo, Title, Title__is_set);
    __typeMapper.writeObject(__out, UpVotes__typeInfo, UpVotes, UpVotes__is_set);
    __typeMapper.writeObject(__out, UserRecordAccess__typeInfo, UserRecordAccess, UserRecordAccess__is_set);
    __typeMapper.writeObject(__out, VoteScore__typeInfo, VoteScore, VoteScore__is_set);
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
    if (__typeMapper.isElement(__in, BestReply__typeInfo)) {
      setBestReply((com.sforce.soap.enterprise.sobject.Reply)__typeMapper.readObject(__in, BestReply__typeInfo, com.sforce.soap.enterprise.sobject.Reply.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, BestReplyId__typeInfo)) {
      setBestReplyId((java.lang.String)__typeMapper.readString(__in, BestReplyId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, BestReplySelectedBy__typeInfo)) {
      setBestReplySelectedBy((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, BestReplySelectedBy__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, BestReplySelectedById__typeInfo)) {
      setBestReplySelectedById((java.lang.String)__typeMapper.readString(__in, BestReplySelectedById__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Body__typeInfo)) {
      setBody((java.lang.String)__typeMapper.readString(__in, Body__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Cases__typeInfo)) {
      setCases((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Cases__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    if (__typeMapper.isElement(__in, DataCategorySelections__typeInfo)) {
      setDataCategorySelections((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, DataCategorySelections__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, HasSingleFieldForContent__typeInfo)) {
      setHasSingleFieldForContent((java.lang.Boolean)__typeMapper.readObject(__in, HasSingleFieldForContent__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {
      setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, IsDeleted__typeInfo, java.lang.Boolean.class));
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
    if (__typeMapper.isElement(__in, LastReply__typeInfo)) {
      setLastReply((com.sforce.soap.enterprise.sobject.Reply)__typeMapper.readObject(__in, LastReply__typeInfo, com.sforce.soap.enterprise.sobject.Reply.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LastReplyDate__typeInfo)) {
      setLastReplyDate((java.util.Calendar)__typeMapper.readObject(__in, LastReplyDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LastReplyId__typeInfo)) {
      setLastReplyId((java.lang.String)__typeMapper.readString(__in, LastReplyId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LastViewedDate__typeInfo)) {
      setLastViewedDate((java.util.Calendar)__typeMapper.readObject(__in, LastViewedDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MostReportAbusesOnReply__typeInfo)) {
      setMostReportAbusesOnReply((java.lang.Integer)__typeMapper.readObject(__in, MostReportAbusesOnReply__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, NumReplies__typeInfo)) {
      setNumReplies((java.lang.Integer)__typeMapper.readObject(__in, NumReplies__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, NumReportAbuses__typeInfo)) {
      setNumReportAbuses((java.lang.Integer)__typeMapper.readObject(__in, NumReportAbuses__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, NumSubscriptions__typeInfo)) {
      setNumSubscriptions((java.lang.Integer)__typeMapper.readObject(__in, NumSubscriptions__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Origin__typeInfo)) {
      setOrigin((java.lang.String)__typeMapper.readString(__in, Origin__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Posts__typeInfo)) {
      setPosts((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Posts__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Priority__typeInfo)) {
      setPriority((java.lang.String)__typeMapper.readString(__in, Priority__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, QuestionReportAbuses__typeInfo)) {
      setQuestionReportAbuses((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, QuestionReportAbuses__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    if (__typeMapper.isElement(__in, Replies__typeInfo)) {
      setReplies((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Replies__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Subscriptions__typeInfo)) {
      setSubscriptions((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Subscriptions__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    if (__typeMapper.isElement(__in, UpVotes__typeInfo)) {
      setUpVotes((java.lang.Integer)__typeMapper.readObject(__in, UpVotes__typeInfo, java.lang.Integer.class));
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
    if (__typeMapper.isElement(__in, Votes__typeInfo)) {
      setVotes((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Votes__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[Question ");
    sb.append(super.toString());
    sb.append(" BestReply=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(BestReply)+"'\n");
    sb.append(" BestReplyId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(BestReplyId)+"'\n");
    sb.append(" BestReplySelectedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(BestReplySelectedBy)+"'\n");
    sb.append(" BestReplySelectedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(BestReplySelectedById)+"'\n");
    sb.append(" Body=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Body)+"'\n");
    sb.append(" Cases=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Cases)+"'\n");
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
    sb.append(" DataCategorySelections=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DataCategorySelections)+"'\n");
    sb.append(" HasSingleFieldForContent=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(HasSingleFieldForContent)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" LastReferencedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastReferencedDate)+"'\n");
    sb.append(" LastReply=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastReply)+"'\n");
    sb.append(" LastReplyDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastReplyDate)+"'\n");
    sb.append(" LastReplyId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastReplyId)+"'\n");
    sb.append(" LastViewedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastViewedDate)+"'\n");
    sb.append(" MostReportAbusesOnReply=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MostReportAbusesOnReply)+"'\n");
    sb.append(" NumReplies=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NumReplies)+"'\n");
    sb.append(" NumReportAbuses=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NumReportAbuses)+"'\n");
    sb.append(" NumSubscriptions=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NumSubscriptions)+"'\n");
    sb.append(" Origin=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Origin)+"'\n");
    sb.append(" Posts=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Posts)+"'\n");
    sb.append(" Priority=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Priority)+"'\n");
    sb.append(" QuestionReportAbuses=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(QuestionReportAbuses)+"'\n");
    sb.append(" RecordType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecordType)+"'\n");
    sb.append(" RecordTypeId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecordTypeId)+"'\n");
    sb.append(" Replies=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Replies)+"'\n");
    sb.append(" Subscriptions=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Subscriptions)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" Title=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Title)+"'\n");
    sb.append(" UpVotes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UpVotes)+"'\n");
    sb.append(" UserRecordAccess=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserRecordAccess)+"'\n");
    sb.append(" VoteScore=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VoteScore)+"'\n");
    sb.append(" Votes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Votes)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}