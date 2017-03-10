package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class IdeaComment extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public IdeaComment() {
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
   * element  : Idea of type {urn:sobject.enterprise.soap.sforce.com}Idea
   * java type: com.sforce.soap.enterprise.sobject.Idea
   */
  private static final com.sforce.ws.bind.TypeInfo Idea__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Idea","urn:sobject.enterprise.soap.sforce.com","Idea",0,1,true);

  private boolean Idea__is_set = false;

  private com.sforce.soap.enterprise.sobject.Idea Idea;

  public com.sforce.soap.enterprise.sobject.Idea getIdea() {
    return Idea;
  }

  

  public void setIdea(com.sforce.soap.enterprise.sobject.Idea Idea) {
    this.Idea = Idea;
    Idea__is_set = true;
  }
  
  /**
   * element  : IdeaId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo IdeaId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IdeaId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean IdeaId__is_set = false;

  private java.lang.String IdeaId;

  public java.lang.String getIdeaId() {
    return IdeaId;
  }

  

  public void setIdeaId(java.lang.String IdeaId) {
    this.IdeaId = IdeaId;
    IdeaId__is_set = true;
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
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "IdeaComment");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, CommentBody__typeInfo, CommentBody, CommentBody__is_set);
    __typeMapper.writeString(__out, CommunityId__typeInfo, CommunityId, CommunityId__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, CreatorFullPhotoUrl__typeInfo, CreatorFullPhotoUrl, CreatorFullPhotoUrl__is_set);
    __typeMapper.writeString(__out, CreatorName__typeInfo, CreatorName, CreatorName__is_set);
    __typeMapper.writeString(__out, CreatorSmallPhotoUrl__typeInfo, CreatorSmallPhotoUrl, CreatorSmallPhotoUrl__is_set);
    __typeMapper.writeObject(__out, Idea__typeInfo, Idea, Idea__is_set);
    __typeMapper.writeString(__out, IdeaId__typeInfo, IdeaId, IdeaId__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, IsHtml__typeInfo, IsHtml, IsHtml__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeObject(__out, UpVotes__typeInfo, UpVotes, UpVotes__is_set);
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
    if (__typeMapper.isElement(__in, CommentBody__typeInfo)) {
      setCommentBody((java.lang.String)__typeMapper.readString(__in, CommentBody__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Idea__typeInfo)) {
      setIdea((com.sforce.soap.enterprise.sobject.Idea)__typeMapper.readObject(__in, Idea__typeInfo, com.sforce.soap.enterprise.sobject.Idea.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IdeaId__typeInfo)) {
      setIdeaId((java.lang.String)__typeMapper.readString(__in, IdeaId__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UpVotes__typeInfo)) {
      setUpVotes((java.lang.Integer)__typeMapper.readObject(__in, UpVotes__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Votes__typeInfo)) {
      setVotes((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Votes__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[IdeaComment ");
    sb.append(super.toString());
    sb.append(" CommentBody=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CommentBody)+"'\n");
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
    sb.append(" Idea=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Idea)+"'\n");
    sb.append(" IdeaId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IdeaId)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" IsHtml=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsHtml)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" UpVotes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UpVotes)+"'\n");
    sb.append(" Votes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Votes)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}