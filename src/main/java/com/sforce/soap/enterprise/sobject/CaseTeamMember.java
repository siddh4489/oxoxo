package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class CaseTeamMember extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public CaseTeamMember() {
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
   * element  : Member of type {urn:sobject.enterprise.soap.sforce.com}Name
   * java type: com.sforce.soap.enterprise.sobject.Name
   */
  private static final com.sforce.ws.bind.TypeInfo Member__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Member","urn:sobject.enterprise.soap.sforce.com","Name",0,1,true);

  private boolean Member__is_set = false;

  private com.sforce.soap.enterprise.sobject.Name Member;

  public com.sforce.soap.enterprise.sobject.Name getMember() {
    return Member;
  }

  

  public void setMember(com.sforce.soap.enterprise.sobject.Name Member) {
    this.Member = Member;
    Member__is_set = true;
  }
  
  /**
   * element  : MemberId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo MemberId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MemberId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean MemberId__is_set = false;

  private java.lang.String MemberId;

  public java.lang.String getMemberId() {
    return MemberId;
  }

  

  public void setMemberId(java.lang.String MemberId) {
    this.MemberId = MemberId;
    MemberId__is_set = true;
  }
  
  /**
   * element  : Parent of type {urn:sobject.enterprise.soap.sforce.com}Case
   * java type: com.sforce.soap.enterprise.sobject.Case
   */
  private static final com.sforce.ws.bind.TypeInfo Parent__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Parent","urn:sobject.enterprise.soap.sforce.com","Case",0,1,true);

  private boolean Parent__is_set = false;

  private com.sforce.soap.enterprise.sobject.Case Parent;

  public com.sforce.soap.enterprise.sobject.Case getParent() {
    return Parent;
  }

  

  public void setParent(com.sforce.soap.enterprise.sobject.Case Parent) {
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
   * element  : TeamRole of type {urn:sobject.enterprise.soap.sforce.com}CaseTeamRole
   * java type: com.sforce.soap.enterprise.sobject.CaseTeamRole
   */
  private static final com.sforce.ws.bind.TypeInfo TeamRole__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TeamRole","urn:sobject.enterprise.soap.sforce.com","CaseTeamRole",0,1,true);

  private boolean TeamRole__is_set = false;

  private com.sforce.soap.enterprise.sobject.CaseTeamRole TeamRole;

  public com.sforce.soap.enterprise.sobject.CaseTeamRole getTeamRole() {
    return TeamRole;
  }

  

  public void setTeamRole(com.sforce.soap.enterprise.sobject.CaseTeamRole TeamRole) {
    this.TeamRole = TeamRole;
    TeamRole__is_set = true;
  }
  
  /**
   * element  : TeamRoleId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo TeamRoleId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TeamRoleId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean TeamRoleId__is_set = false;

  private java.lang.String TeamRoleId;

  public java.lang.String getTeamRoleId() {
    return TeamRoleId;
  }

  

  public void setTeamRoleId(java.lang.String TeamRoleId) {
    this.TeamRoleId = TeamRoleId;
    TeamRoleId__is_set = true;
  }
  
  /**
   * element  : TeamTemplateMember of type {urn:sobject.enterprise.soap.sforce.com}CaseTeamTemplateMember
   * java type: com.sforce.soap.enterprise.sobject.CaseTeamTemplateMember
   */
  private static final com.sforce.ws.bind.TypeInfo TeamTemplateMember__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TeamTemplateMember","urn:sobject.enterprise.soap.sforce.com","CaseTeamTemplateMember",0,1,true);

  private boolean TeamTemplateMember__is_set = false;

  private com.sforce.soap.enterprise.sobject.CaseTeamTemplateMember TeamTemplateMember;

  public com.sforce.soap.enterprise.sobject.CaseTeamTemplateMember getTeamTemplateMember() {
    return TeamTemplateMember;
  }

  

  public void setTeamTemplateMember(com.sforce.soap.enterprise.sobject.CaseTeamTemplateMember TeamTemplateMember) {
    this.TeamTemplateMember = TeamTemplateMember;
    TeamTemplateMember__is_set = true;
  }
  
  /**
   * element  : TeamTemplateMemberId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo TeamTemplateMemberId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TeamTemplateMemberId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean TeamTemplateMemberId__is_set = false;

  private java.lang.String TeamTemplateMemberId;

  public java.lang.String getTeamTemplateMemberId() {
    return TeamTemplateMemberId;
  }

  

  public void setTeamTemplateMemberId(java.lang.String TeamTemplateMemberId) {
    this.TeamTemplateMemberId = TeamTemplateMemberId;
    TeamTemplateMemberId__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "CaseTeamMember");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, Member__typeInfo, Member, Member__is_set);
    __typeMapper.writeString(__out, MemberId__typeInfo, MemberId, MemberId__is_set);
    __typeMapper.writeObject(__out, Parent__typeInfo, Parent, Parent__is_set);
    __typeMapper.writeString(__out, ParentId__typeInfo, ParentId, ParentId__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeObject(__out, TeamRole__typeInfo, TeamRole, TeamRole__is_set);
    __typeMapper.writeString(__out, TeamRoleId__typeInfo, TeamRoleId, TeamRoleId__is_set);
    __typeMapper.writeObject(__out, TeamTemplateMember__typeInfo, TeamTemplateMember, TeamTemplateMember__is_set);
    __typeMapper.writeString(__out, TeamTemplateMemberId__typeInfo, TeamTemplateMemberId, TeamTemplateMemberId__is_set);
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
    if (__typeMapper.isElement(__in, Member__typeInfo)) {
      setMember((com.sforce.soap.enterprise.sobject.Name)__typeMapper.readObject(__in, Member__typeInfo, com.sforce.soap.enterprise.sobject.Name.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MemberId__typeInfo)) {
      setMemberId((java.lang.String)__typeMapper.readString(__in, MemberId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Parent__typeInfo)) {
      setParent((com.sforce.soap.enterprise.sobject.Case)__typeMapper.readObject(__in, Parent__typeInfo, com.sforce.soap.enterprise.sobject.Case.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ParentId__typeInfo)) {
      setParentId((java.lang.String)__typeMapper.readString(__in, ParentId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TeamRole__typeInfo)) {
      setTeamRole((com.sforce.soap.enterprise.sobject.CaseTeamRole)__typeMapper.readObject(__in, TeamRole__typeInfo, com.sforce.soap.enterprise.sobject.CaseTeamRole.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TeamRoleId__typeInfo)) {
      setTeamRoleId((java.lang.String)__typeMapper.readString(__in, TeamRoleId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TeamTemplateMember__typeInfo)) {
      setTeamTemplateMember((com.sforce.soap.enterprise.sobject.CaseTeamTemplateMember)__typeMapper.readObject(__in, TeamTemplateMember__typeInfo, com.sforce.soap.enterprise.sobject.CaseTeamTemplateMember.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TeamTemplateMemberId__typeInfo)) {
      setTeamTemplateMemberId((java.lang.String)__typeMapper.readString(__in, TeamTemplateMemberId__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[CaseTeamMember ");
    sb.append(super.toString());
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" Member=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Member)+"'\n");
    sb.append(" MemberId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MemberId)+"'\n");
    sb.append(" Parent=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Parent)+"'\n");
    sb.append(" ParentId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ParentId)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" TeamRole=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TeamRole)+"'\n");
    sb.append(" TeamRoleId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TeamRoleId)+"'\n");
    sb.append(" TeamTemplateMember=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TeamTemplateMember)+"'\n");
    sb.append(" TeamTemplateMemberId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TeamTemplateMemberId)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}