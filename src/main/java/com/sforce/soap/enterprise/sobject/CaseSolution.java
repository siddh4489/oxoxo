package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class CaseSolution extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public CaseSolution() {
  }
    
  
  /**
   * element  : Case of type {urn:sobject.enterprise.soap.sforce.com}Case
   * java type: com.sforce.soap.enterprise.sobject.Case
   */
  private static final com.sforce.ws.bind.TypeInfo Case__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Case","urn:sobject.enterprise.soap.sforce.com","Case",0,1,true);

  private boolean Case__is_set = false;

  private com.sforce.soap.enterprise.sobject.Case Case;

  public com.sforce.soap.enterprise.sobject.Case getCase() {
    return Case;
  }

  

  public void setCase(com.sforce.soap.enterprise.sobject.Case Case) {
    this.Case = Case;
    Case__is_set = true;
  }
  
  /**
   * element  : CaseId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CaseId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CaseId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean CaseId__is_set = false;

  private java.lang.String CaseId;

  public java.lang.String getCaseId() {
    return CaseId;
  }

  

  public void setCaseId(java.lang.String CaseId) {
    this.CaseId = CaseId;
    CaseId__is_set = true;
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
   * element  : Solution of type {urn:sobject.enterprise.soap.sforce.com}Solution
   * java type: com.sforce.soap.enterprise.sobject.Solution
   */
  private static final com.sforce.ws.bind.TypeInfo Solution__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Solution","urn:sobject.enterprise.soap.sforce.com","Solution",0,1,true);

  private boolean Solution__is_set = false;

  private com.sforce.soap.enterprise.sobject.Solution Solution;

  public com.sforce.soap.enterprise.sobject.Solution getSolution() {
    return Solution;
  }

  

  public void setSolution(com.sforce.soap.enterprise.sobject.Solution Solution) {
    this.Solution = Solution;
    Solution__is_set = true;
  }
  
  /**
   * element  : SolutionId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo SolutionId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SolutionId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean SolutionId__is_set = false;

  private java.lang.String SolutionId;

  public java.lang.String getSolutionId() {
    return SolutionId;
  }

  

  public void setSolutionId(java.lang.String SolutionId) {
    this.SolutionId = SolutionId;
    SolutionId__is_set = true;
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
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "CaseSolution");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, Case__typeInfo, Case, Case__is_set);
    __typeMapper.writeString(__out, CaseId__typeInfo, CaseId, CaseId__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, Solution__typeInfo, Solution, Solution__is_set);
    __typeMapper.writeString(__out, SolutionId__typeInfo, SolutionId, SolutionId__is_set);
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
    if (__typeMapper.isElement(__in, Case__typeInfo)) {
      setCase((com.sforce.soap.enterprise.sobject.Case)__typeMapper.readObject(__in, Case__typeInfo, com.sforce.soap.enterprise.sobject.Case.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CaseId__typeInfo)) {
      setCaseId((java.lang.String)__typeMapper.readString(__in, CaseId__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {
      setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, IsDeleted__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Solution__typeInfo)) {
      setSolution((com.sforce.soap.enterprise.sobject.Solution)__typeMapper.readObject(__in, Solution__typeInfo, com.sforce.soap.enterprise.sobject.Solution.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SolutionId__typeInfo)) {
      setSolutionId((java.lang.String)__typeMapper.readString(__in, SolutionId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[CaseSolution ");
    sb.append(super.toString());
    sb.append(" Case=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Case)+"'\n");
    sb.append(" CaseId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CaseId)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" Solution=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Solution)+"'\n");
    sb.append(" SolutionId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SolutionId)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}