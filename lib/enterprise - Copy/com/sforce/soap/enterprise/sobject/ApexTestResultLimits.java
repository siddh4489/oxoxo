package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class ApexTestResultLimits extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public ApexTestResultLimits() {
  }
    
  
  /**
   * element  : ApexTestResult of type {urn:sobject.enterprise.soap.sforce.com}ApexTestResult
   * java type: com.sforce.soap.enterprise.sobject.ApexTestResult
   */
  private static final com.sforce.ws.bind.TypeInfo ApexTestResult__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ApexTestResult","urn:sobject.enterprise.soap.sforce.com","ApexTestResult",0,1,true);

  private boolean ApexTestResult__is_set = false;

  private com.sforce.soap.enterprise.sobject.ApexTestResult ApexTestResult;

  public com.sforce.soap.enterprise.sobject.ApexTestResult getApexTestResult() {
    return ApexTestResult;
  }

  

  public void setApexTestResult(com.sforce.soap.enterprise.sobject.ApexTestResult ApexTestResult) {
    this.ApexTestResult = ApexTestResult;
    ApexTestResult__is_set = true;
  }
  
  /**
   * element  : ApexTestResultId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ApexTestResultId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ApexTestResultId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ApexTestResultId__is_set = false;

  private java.lang.String ApexTestResultId;

  public java.lang.String getApexTestResultId() {
    return ApexTestResultId;
  }

  

  public void setApexTestResultId(java.lang.String ApexTestResultId) {
    this.ApexTestResultId = ApexTestResultId;
    ApexTestResultId__is_set = true;
  }
  
  /**
   * element  : AsyncCalls of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo AsyncCalls__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AsyncCalls","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean AsyncCalls__is_set = false;

  private java.lang.Integer AsyncCalls;

  public java.lang.Integer getAsyncCalls() {
    return AsyncCalls;
  }

  

  public void setAsyncCalls(java.lang.Integer AsyncCalls) {
    this.AsyncCalls = AsyncCalls;
    AsyncCalls__is_set = true;
  }
  
  /**
   * element  : Callouts of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo Callouts__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Callouts","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean Callouts__is_set = false;

  private java.lang.Integer Callouts;

  public java.lang.Integer getCallouts() {
    return Callouts;
  }

  

  public void setCallouts(java.lang.Integer Callouts) {
    this.Callouts = Callouts;
    Callouts__is_set = true;
  }
  
  /**
   * element  : Cpu of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo Cpu__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Cpu","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean Cpu__is_set = false;

  private java.lang.Integer Cpu;

  public java.lang.Integer getCpu() {
    return Cpu;
  }

  

  public void setCpu(java.lang.Integer Cpu) {
    this.Cpu = Cpu;
    Cpu__is_set = true;
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
   * element  : Dml of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo Dml__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Dml","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean Dml__is_set = false;

  private java.lang.Integer Dml;

  public java.lang.Integer getDml() {
    return Dml;
  }

  

  public void setDml(java.lang.Integer Dml) {
    this.Dml = Dml;
    Dml__is_set = true;
  }
  
  /**
   * element  : DmlRows of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo DmlRows__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DmlRows","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean DmlRows__is_set = false;

  private java.lang.Integer DmlRows;

  public java.lang.Integer getDmlRows() {
    return DmlRows;
  }

  

  public void setDmlRows(java.lang.Integer DmlRows) {
    this.DmlRows = DmlRows;
    DmlRows__is_set = true;
  }
  
  /**
   * element  : Email of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo Email__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Email","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean Email__is_set = false;

  private java.lang.Integer Email;

  public java.lang.Integer getEmail() {
    return Email;
  }

  

  public void setEmail(java.lang.Integer Email) {
    this.Email = Email;
    Email__is_set = true;
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
   * element  : LimitContext of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LimitContext__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LimitContext","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean LimitContext__is_set = false;

  private java.lang.String LimitContext;

  public java.lang.String getLimitContext() {
    return LimitContext;
  }

  

  public void setLimitContext(java.lang.String LimitContext) {
    this.LimitContext = LimitContext;
    LimitContext__is_set = true;
  }
  
  /**
   * element  : LimitExceptions of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LimitExceptions__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LimitExceptions","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean LimitExceptions__is_set = false;

  private java.lang.String LimitExceptions;

  public java.lang.String getLimitExceptions() {
    return LimitExceptions;
  }

  

  public void setLimitExceptions(java.lang.String LimitExceptions) {
    this.LimitExceptions = LimitExceptions;
    LimitExceptions__is_set = true;
  }
  
  /**
   * element  : MobilePush of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo MobilePush__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MobilePush","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean MobilePush__is_set = false;

  private java.lang.Integer MobilePush;

  public java.lang.Integer getMobilePush() {
    return MobilePush;
  }

  

  public void setMobilePush(java.lang.Integer MobilePush) {
    this.MobilePush = MobilePush;
    MobilePush__is_set = true;
  }
  
  /**
   * element  : QueryRows of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo QueryRows__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","QueryRows","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean QueryRows__is_set = false;

  private java.lang.Integer QueryRows;

  public java.lang.Integer getQueryRows() {
    return QueryRows;
  }

  

  public void setQueryRows(java.lang.Integer QueryRows) {
    this.QueryRows = QueryRows;
    QueryRows__is_set = true;
  }
  
  /**
   * element  : Soql of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo Soql__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Soql","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean Soql__is_set = false;

  private java.lang.Integer Soql;

  public java.lang.Integer getSoql() {
    return Soql;
  }

  

  public void setSoql(java.lang.Integer Soql) {
    this.Soql = Soql;
    Soql__is_set = true;
  }
  
  /**
   * element  : Sosl of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo Sosl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Sosl","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean Sosl__is_set = false;

  private java.lang.Integer Sosl;

  public java.lang.Integer getSosl() {
    return Sosl;
  }

  

  public void setSosl(java.lang.Integer Sosl) {
    this.Sosl = Sosl;
    Sosl__is_set = true;
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
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "ApexTestResultLimits");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, ApexTestResult__typeInfo, ApexTestResult, ApexTestResult__is_set);
    __typeMapper.writeString(__out, ApexTestResultId__typeInfo, ApexTestResultId, ApexTestResultId__is_set);
    __typeMapper.writeObject(__out, AsyncCalls__typeInfo, AsyncCalls, AsyncCalls__is_set);
    __typeMapper.writeObject(__out, Callouts__typeInfo, Callouts, Callouts__is_set);
    __typeMapper.writeObject(__out, Cpu__typeInfo, Cpu, Cpu__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeObject(__out, Dml__typeInfo, Dml, Dml__is_set);
    __typeMapper.writeObject(__out, DmlRows__typeInfo, DmlRows, DmlRows__is_set);
    __typeMapper.writeObject(__out, Email__typeInfo, Email, Email__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeString(__out, LimitContext__typeInfo, LimitContext, LimitContext__is_set);
    __typeMapper.writeString(__out, LimitExceptions__typeInfo, LimitExceptions, LimitExceptions__is_set);
    __typeMapper.writeObject(__out, MobilePush__typeInfo, MobilePush, MobilePush__is_set);
    __typeMapper.writeObject(__out, QueryRows__typeInfo, QueryRows, QueryRows__is_set);
    __typeMapper.writeObject(__out, Soql__typeInfo, Soql, Soql__is_set);
    __typeMapper.writeObject(__out, Sosl__typeInfo, Sosl, Sosl__is_set);
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
    if (__typeMapper.isElement(__in, ApexTestResult__typeInfo)) {
      setApexTestResult((com.sforce.soap.enterprise.sobject.ApexTestResult)__typeMapper.readObject(__in, ApexTestResult__typeInfo, com.sforce.soap.enterprise.sobject.ApexTestResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ApexTestResultId__typeInfo)) {
      setApexTestResultId((java.lang.String)__typeMapper.readString(__in, ApexTestResultId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AsyncCalls__typeInfo)) {
      setAsyncCalls((java.lang.Integer)__typeMapper.readObject(__in, AsyncCalls__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Callouts__typeInfo)) {
      setCallouts((java.lang.Integer)__typeMapper.readObject(__in, Callouts__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Cpu__typeInfo)) {
      setCpu((java.lang.Integer)__typeMapper.readObject(__in, Cpu__typeInfo, java.lang.Integer.class));
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
    if (__typeMapper.isElement(__in, Dml__typeInfo)) {
      setDml((java.lang.Integer)__typeMapper.readObject(__in, Dml__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DmlRows__typeInfo)) {
      setDmlRows((java.lang.Integer)__typeMapper.readObject(__in, DmlRows__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Email__typeInfo)) {
      setEmail((java.lang.Integer)__typeMapper.readObject(__in, Email__typeInfo, java.lang.Integer.class));
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
    if (__typeMapper.isElement(__in, LimitContext__typeInfo)) {
      setLimitContext((java.lang.String)__typeMapper.readString(__in, LimitContext__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LimitExceptions__typeInfo)) {
      setLimitExceptions((java.lang.String)__typeMapper.readString(__in, LimitExceptions__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MobilePush__typeInfo)) {
      setMobilePush((java.lang.Integer)__typeMapper.readObject(__in, MobilePush__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, QueryRows__typeInfo)) {
      setQueryRows((java.lang.Integer)__typeMapper.readObject(__in, QueryRows__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Soql__typeInfo)) {
      setSoql((java.lang.Integer)__typeMapper.readObject(__in, Soql__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Sosl__typeInfo)) {
      setSosl((java.lang.Integer)__typeMapper.readObject(__in, Sosl__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[ApexTestResultLimits ");
    sb.append(super.toString());
    sb.append(" ApexTestResult=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ApexTestResult)+"'\n");
    sb.append(" ApexTestResultId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ApexTestResultId)+"'\n");
    sb.append(" AsyncCalls=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AsyncCalls)+"'\n");
    sb.append(" Callouts=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Callouts)+"'\n");
    sb.append(" Cpu=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Cpu)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" Dml=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Dml)+"'\n");
    sb.append(" DmlRows=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DmlRows)+"'\n");
    sb.append(" Email=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Email)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" LimitContext=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LimitContext)+"'\n");
    sb.append(" LimitExceptions=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LimitExceptions)+"'\n");
    sb.append(" MobilePush=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MobilePush)+"'\n");
    sb.append(" QueryRows=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(QueryRows)+"'\n");
    sb.append(" Soql=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Soql)+"'\n");
    sb.append(" Sosl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Sosl)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}