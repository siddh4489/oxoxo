package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class Reply extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public Reply() {
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
   * element  : DownVotes of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo DownVotes__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DownVotes","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean DownVotes__is_set = false;

  private java.lang.Integer DownVotes;

  public java.lang.Integer getDownVotes() {
    return DownVotes;
  }

  

  public void setDownVotes(java.lang.Integer DownVotes) {
    this.DownVotes = DownVotes;
    DownVotes__is_set = true;
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
   * element  : Name of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Name__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Name","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Name__is_set = false;

  private java.lang.String Name;

  public java.lang.String getName() {
    return Name;
  }

  

  public void setName(java.lang.String Name) {
    this.Name = Name;
    Name__is_set = true;
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
   * element  : Question of type {urn:sobject.enterprise.soap.sforce.com}Question
   * java type: com.sforce.soap.enterprise.sobject.Question
   */
  private static final com.sforce.ws.bind.TypeInfo Question__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Question","urn:sobject.enterprise.soap.sforce.com","Question",0,1,true);

  private boolean Question__is_set = false;

  private com.sforce.soap.enterprise.sobject.Question Question;

  public com.sforce.soap.enterprise.sobject.Question getQuestion() {
    return Question;
  }

  

  public void setQuestion(com.sforce.soap.enterprise.sobject.Question Question) {
    this.Question = Question;
    Question__is_set = true;
  }
  
  /**
   * element  : QuestionId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo QuestionId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","QuestionId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean QuestionId__is_set = false;

  private java.lang.String QuestionId;

  public java.lang.String getQuestionId() {
    return QuestionId;
  }

  

  public void setQuestionId(java.lang.String QuestionId) {
    this.QuestionId = QuestionId;
    QuestionId__is_set = true;
  }
  
  /**
   * element  : ReplyReportAbuses of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo ReplyReportAbuses__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ReplyReportAbuses","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean ReplyReportAbuses__is_set = false;

  private com.sforce.soap.enterprise.QueryResult ReplyReportAbuses;

  public com.sforce.soap.enterprise.QueryResult getReplyReportAbuses() {
    return ReplyReportAbuses;
  }

  

  public void setReplyReportAbuses(com.sforce.soap.enterprise.QueryResult ReplyReportAbuses) {
    this.ReplyReportAbuses = ReplyReportAbuses;
    ReplyReportAbuses__is_set = true;
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
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "Reply");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, Body__typeInfo, Body, Body__is_set);
    __typeMapper.writeObject(__out, Community__typeInfo, Community, Community__is_set);
    __typeMapper.writeString(__out, CommunityId__typeInfo, CommunityId, CommunityId__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, CreatorFullPhotoUrl__typeInfo, CreatorFullPhotoUrl, CreatorFullPhotoUrl__is_set);
    __typeMapper.writeString(__out, CreatorName__typeInfo, CreatorName, CreatorName__is_set);
    __typeMapper.writeString(__out, CreatorSmallPhotoUrl__typeInfo, CreatorSmallPhotoUrl, CreatorSmallPhotoUrl__is_set);
    __typeMapper.writeObject(__out, DownVotes__typeInfo, DownVotes, DownVotes__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeObject(__out, NumReportAbuses__typeInfo, NumReportAbuses, NumReportAbuses__is_set);
    __typeMapper.writeObject(__out, Posts__typeInfo, Posts, Posts__is_set);
    __typeMapper.writeObject(__out, Question__typeInfo, Question, Question__is_set);
    __typeMapper.writeString(__out, QuestionId__typeInfo, QuestionId, QuestionId__is_set);
    __typeMapper.writeObject(__out, ReplyReportAbuses__typeInfo, ReplyReportAbuses, ReplyReportAbuses__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeObject(__out, UpVotes__typeInfo, UpVotes, UpVotes__is_set);
    __typeMapper.writeObject(__out, UserRecordAccess__typeInfo, UserRecordAccess, UserRecordAccess__is_set);
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
    if (__typeMapper.isElement(__in, DownVotes__typeInfo)) {
      setDownVotes((java.lang.Integer)__typeMapper.readObject(__in, DownVotes__typeInfo, java.lang.Integer.class));
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
    if (__typeMapper.isElement(__in, Name__typeInfo)) {
      setName((java.lang.String)__typeMapper.readString(__in, Name__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, NumReportAbuses__typeInfo)) {
      setNumReportAbuses((java.lang.Integer)__typeMapper.readObject(__in, NumReportAbuses__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Posts__typeInfo)) {
      setPosts((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Posts__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Question__typeInfo)) {
      setQuestion((com.sforce.soap.enterprise.sobject.Question)__typeMapper.readObject(__in, Question__typeInfo, com.sforce.soap.enterprise.sobject.Question.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, QuestionId__typeInfo)) {
      setQuestionId((java.lang.String)__typeMapper.readString(__in, QuestionId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ReplyReportAbuses__typeInfo)) {
      setReplyReportAbuses((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, ReplyReportAbuses__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
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
    sb.append("[Reply ");
    sb.append(super.toString());
    sb.append(" Body=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Body)+"'\n");
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
    sb.append(" DownVotes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DownVotes)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" Name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");
    sb.append(" NumReportAbuses=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NumReportAbuses)+"'\n");
    sb.append(" Posts=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Posts)+"'\n");
    sb.append(" Question=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Question)+"'\n");
    sb.append(" QuestionId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(QuestionId)+"'\n");
    sb.append(" ReplyReportAbuses=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ReplyReportAbuses)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" UpVotes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UpVotes)+"'\n");
    sb.append(" UserRecordAccess=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserRecordAccess)+"'\n");
    sb.append(" VoteTotal=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VoteTotal)+"'\n");
    sb.append(" Votes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Votes)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}