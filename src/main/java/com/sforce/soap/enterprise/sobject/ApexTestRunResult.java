package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class ApexTestRunResult extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public ApexTestRunResult() {
  }
    
  
  /**
   * element  : AsyncApexJob of type {urn:sobject.enterprise.soap.sforce.com}AsyncApexJob
   * java type: com.sforce.soap.enterprise.sobject.AsyncApexJob
   */
  private static final com.sforce.ws.bind.TypeInfo AsyncApexJob__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AsyncApexJob","urn:sobject.enterprise.soap.sforce.com","AsyncApexJob",0,1,true);

  private boolean AsyncApexJob__is_set = false;

  private com.sforce.soap.enterprise.sobject.AsyncApexJob AsyncApexJob;

  public com.sforce.soap.enterprise.sobject.AsyncApexJob getAsyncApexJob() {
    return AsyncApexJob;
  }

  

  public void setAsyncApexJob(com.sforce.soap.enterprise.sobject.AsyncApexJob AsyncApexJob) {
    this.AsyncApexJob = AsyncApexJob;
    AsyncApexJob__is_set = true;
  }
  
  /**
   * element  : AsyncApexJobId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AsyncApexJobId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AsyncApexJobId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean AsyncApexJobId__is_set = false;

  private java.lang.String AsyncApexJobId;

  public java.lang.String getAsyncApexJobId() {
    return AsyncApexJobId;
  }

  

  public void setAsyncApexJobId(java.lang.String AsyncApexJobId) {
    this.AsyncApexJobId = AsyncApexJobId;
    AsyncApexJobId__is_set = true;
  }
  
  /**
   * element  : ClassesCompleted of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo ClassesCompleted__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ClassesCompleted","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean ClassesCompleted__is_set = false;

  private java.lang.Integer ClassesCompleted;

  public java.lang.Integer getClassesCompleted() {
    return ClassesCompleted;
  }

  

  public void setClassesCompleted(java.lang.Integer ClassesCompleted) {
    this.ClassesCompleted = ClassesCompleted;
    ClassesCompleted__is_set = true;
  }
  
  /**
   * element  : ClassesEnqueued of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo ClassesEnqueued__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ClassesEnqueued","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean ClassesEnqueued__is_set = false;

  private java.lang.Integer ClassesEnqueued;

  public java.lang.Integer getClassesEnqueued() {
    return ClassesEnqueued;
  }

  

  public void setClassesEnqueued(java.lang.Integer ClassesEnqueued) {
    this.ClassesEnqueued = ClassesEnqueued;
    ClassesEnqueued__is_set = true;
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
   * element  : EndTime of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo EndTime__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","EndTime","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean EndTime__is_set = false;

  private java.util.Calendar EndTime;

  public java.util.Calendar getEndTime() {
    return EndTime;
  }

  

  public void setEndTime(java.util.Calendar EndTime) {
    this.EndTime = EndTime;
    EndTime__is_set = true;
  }
  
  /**
   * element  : IsAllTests of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsAllTests__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsAllTests","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsAllTests__is_set = false;

  private java.lang.Boolean IsAllTests;

  public java.lang.Boolean getIsAllTests() {
    return IsAllTests;
  }

  

  public void setIsAllTests(java.lang.Boolean IsAllTests) {
    this.IsAllTests = IsAllTests;
    IsAllTests__is_set = true;
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
   * element  : JobName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo JobName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","JobName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean JobName__is_set = false;

  private java.lang.String JobName;

  public java.lang.String getJobName() {
    return JobName;
  }

  

  public void setJobName(java.lang.String JobName) {
    this.JobName = JobName;
    JobName__is_set = true;
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
   * element  : MethodsCompleted of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo MethodsCompleted__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MethodsCompleted","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean MethodsCompleted__is_set = false;

  private java.lang.Integer MethodsCompleted;

  public java.lang.Integer getMethodsCompleted() {
    return MethodsCompleted;
  }

  

  public void setMethodsCompleted(java.lang.Integer MethodsCompleted) {
    this.MethodsCompleted = MethodsCompleted;
    MethodsCompleted__is_set = true;
  }
  
  /**
   * element  : MethodsEnqueued of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo MethodsEnqueued__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MethodsEnqueued","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean MethodsEnqueued__is_set = false;

  private java.lang.Integer MethodsEnqueued;

  public java.lang.Integer getMethodsEnqueued() {
    return MethodsEnqueued;
  }

  

  public void setMethodsEnqueued(java.lang.Integer MethodsEnqueued) {
    this.MethodsEnqueued = MethodsEnqueued;
    MethodsEnqueued__is_set = true;
  }
  
  /**
   * element  : MethodsFailed of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo MethodsFailed__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MethodsFailed","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean MethodsFailed__is_set = false;

  private java.lang.Integer MethodsFailed;

  public java.lang.Integer getMethodsFailed() {
    return MethodsFailed;
  }

  

  public void setMethodsFailed(java.lang.Integer MethodsFailed) {
    this.MethodsFailed = MethodsFailed;
    MethodsFailed__is_set = true;
  }
  
  /**
   * element  : Source of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Source__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Source","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Source__is_set = false;

  private java.lang.String Source;

  public java.lang.String getSource() {
    return Source;
  }

  

  public void setSource(java.lang.String Source) {
    this.Source = Source;
    Source__is_set = true;
  }
  
  /**
   * element  : StartTime of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo StartTime__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","StartTime","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean StartTime__is_set = false;

  private java.util.Calendar StartTime;

  public java.util.Calendar getStartTime() {
    return StartTime;
  }

  

  public void setStartTime(java.util.Calendar StartTime) {
    this.StartTime = StartTime;
    StartTime__is_set = true;
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
   * element  : TestTime of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo TestTime__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TestTime","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean TestTime__is_set = false;

  private java.lang.Integer TestTime;

  public java.lang.Integer getTestTime() {
    return TestTime;
  }

  

  public void setTestTime(java.lang.Integer TestTime) {
    this.TestTime = TestTime;
    TestTime__is_set = true;
  }
  
  /**
   * element  : User of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo User__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","User","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean User__is_set = false;

  private com.sforce.soap.enterprise.sobject.User User;

  public com.sforce.soap.enterprise.sobject.User getUser() {
    return User;
  }

  

  public void setUser(com.sforce.soap.enterprise.sobject.User User) {
    this.User = User;
    User__is_set = true;
  }
  
  /**
   * element  : UserId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo UserId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean UserId__is_set = false;

  private java.lang.String UserId;

  public java.lang.String getUserId() {
    return UserId;
  }

  

  public void setUserId(java.lang.String UserId) {
    this.UserId = UserId;
    UserId__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "ApexTestRunResult");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, AsyncApexJob__typeInfo, AsyncApexJob, AsyncApexJob__is_set);
    __typeMapper.writeString(__out, AsyncApexJobId__typeInfo, AsyncApexJobId, AsyncApexJobId__is_set);
    __typeMapper.writeObject(__out, ClassesCompleted__typeInfo, ClassesCompleted, ClassesCompleted__is_set);
    __typeMapper.writeObject(__out, ClassesEnqueued__typeInfo, ClassesEnqueued, ClassesEnqueued__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeObject(__out, EndTime__typeInfo, EndTime, EndTime__is_set);
    __typeMapper.writeObject(__out, IsAllTests__typeInfo, IsAllTests, IsAllTests__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeString(__out, JobName__typeInfo, JobName, JobName__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, MethodsCompleted__typeInfo, MethodsCompleted, MethodsCompleted__is_set);
    __typeMapper.writeObject(__out, MethodsEnqueued__typeInfo, MethodsEnqueued, MethodsEnqueued__is_set);
    __typeMapper.writeObject(__out, MethodsFailed__typeInfo, MethodsFailed, MethodsFailed__is_set);
    __typeMapper.writeString(__out, Source__typeInfo, Source, Source__is_set);
    __typeMapper.writeObject(__out, StartTime__typeInfo, StartTime, StartTime__is_set);
    __typeMapper.writeString(__out, Status__typeInfo, Status, Status__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeObject(__out, TestTime__typeInfo, TestTime, TestTime__is_set);
    __typeMapper.writeObject(__out, User__typeInfo, User, User__is_set);
    __typeMapper.writeString(__out, UserId__typeInfo, UserId, UserId__is_set);
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
    if (__typeMapper.isElement(__in, AsyncApexJob__typeInfo)) {
      setAsyncApexJob((com.sforce.soap.enterprise.sobject.AsyncApexJob)__typeMapper.readObject(__in, AsyncApexJob__typeInfo, com.sforce.soap.enterprise.sobject.AsyncApexJob.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AsyncApexJobId__typeInfo)) {
      setAsyncApexJobId((java.lang.String)__typeMapper.readString(__in, AsyncApexJobId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ClassesCompleted__typeInfo)) {
      setClassesCompleted((java.lang.Integer)__typeMapper.readObject(__in, ClassesCompleted__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ClassesEnqueued__typeInfo)) {
      setClassesEnqueued((java.lang.Integer)__typeMapper.readObject(__in, ClassesEnqueued__typeInfo, java.lang.Integer.class));
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
    if (__typeMapper.isElement(__in, EndTime__typeInfo)) {
      setEndTime((java.util.Calendar)__typeMapper.readObject(__in, EndTime__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsAllTests__typeInfo)) {
      setIsAllTests((java.lang.Boolean)__typeMapper.readObject(__in, IsAllTests__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {
      setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, IsDeleted__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, JobName__typeInfo)) {
      setJobName((java.lang.String)__typeMapper.readString(__in, JobName__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, MethodsCompleted__typeInfo)) {
      setMethodsCompleted((java.lang.Integer)__typeMapper.readObject(__in, MethodsCompleted__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MethodsEnqueued__typeInfo)) {
      setMethodsEnqueued((java.lang.Integer)__typeMapper.readObject(__in, MethodsEnqueued__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MethodsFailed__typeInfo)) {
      setMethodsFailed((java.lang.Integer)__typeMapper.readObject(__in, MethodsFailed__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Source__typeInfo)) {
      setSource((java.lang.String)__typeMapper.readString(__in, Source__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, StartTime__typeInfo)) {
      setStartTime((java.util.Calendar)__typeMapper.readObject(__in, StartTime__typeInfo, java.util.Calendar.class));
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
    if (__typeMapper.isElement(__in, TestTime__typeInfo)) {
      setTestTime((java.lang.Integer)__typeMapper.readObject(__in, TestTime__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, User__typeInfo)) {
      setUser((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, User__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserId__typeInfo)) {
      setUserId((java.lang.String)__typeMapper.readString(__in, UserId__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[ApexTestRunResult ");
    sb.append(super.toString());
    sb.append(" AsyncApexJob=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AsyncApexJob)+"'\n");
    sb.append(" AsyncApexJobId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AsyncApexJobId)+"'\n");
    sb.append(" ClassesCompleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ClassesCompleted)+"'\n");
    sb.append(" ClassesEnqueued=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ClassesEnqueued)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" EndTime=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EndTime)+"'\n");
    sb.append(" IsAllTests=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsAllTests)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" JobName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(JobName)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" MethodsCompleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MethodsCompleted)+"'\n");
    sb.append(" MethodsEnqueued=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MethodsEnqueued)+"'\n");
    sb.append(" MethodsFailed=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MethodsFailed)+"'\n");
    sb.append(" Source=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Source)+"'\n");
    sb.append(" StartTime=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(StartTime)+"'\n");
    sb.append(" Status=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Status)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" TestTime=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TestTime)+"'\n");
    sb.append(" User=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(User)+"'\n");
    sb.append(" UserId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserId)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}