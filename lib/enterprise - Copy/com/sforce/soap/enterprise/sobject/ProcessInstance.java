package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class ProcessInstance extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public ProcessInstance() {
  }
    
  
  /**
   * element  : CompletedDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo CompletedDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CompletedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean CompletedDate__is_set = false;

  private java.util.Calendar CompletedDate;

  public java.util.Calendar getCompletedDate() {
    return CompletedDate;
  }

  

  public void setCompletedDate(java.util.Calendar CompletedDate) {
    this.CompletedDate = CompletedDate;
    CompletedDate__is_set = true;
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
   * element  : ElapsedTimeInDays of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo ElapsedTimeInDays__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ElapsedTimeInDays","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean ElapsedTimeInDays__is_set = false;

  private java.lang.Double ElapsedTimeInDays;

  public java.lang.Double getElapsedTimeInDays() {
    return ElapsedTimeInDays;
  }

  

  public void setElapsedTimeInDays(java.lang.Double ElapsedTimeInDays) {
    this.ElapsedTimeInDays = ElapsedTimeInDays;
    ElapsedTimeInDays__is_set = true;
  }
  
  /**
   * element  : ElapsedTimeInHours of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo ElapsedTimeInHours__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ElapsedTimeInHours","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean ElapsedTimeInHours__is_set = false;

  private java.lang.Double ElapsedTimeInHours;

  public java.lang.Double getElapsedTimeInHours() {
    return ElapsedTimeInHours;
  }

  

  public void setElapsedTimeInHours(java.lang.Double ElapsedTimeInHours) {
    this.ElapsedTimeInHours = ElapsedTimeInHours;
    ElapsedTimeInHours__is_set = true;
  }
  
  /**
   * element  : ElapsedTimeInMinutes of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo ElapsedTimeInMinutes__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ElapsedTimeInMinutes","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean ElapsedTimeInMinutes__is_set = false;

  private java.lang.Double ElapsedTimeInMinutes;

  public java.lang.Double getElapsedTimeInMinutes() {
    return ElapsedTimeInMinutes;
  }

  

  public void setElapsedTimeInMinutes(java.lang.Double ElapsedTimeInMinutes) {
    this.ElapsedTimeInMinutes = ElapsedTimeInMinutes;
    ElapsedTimeInMinutes__is_set = true;
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
   * element  : LastActor of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo LastActor__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastActor","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean LastActor__is_set = false;

  private com.sforce.soap.enterprise.sobject.User LastActor;

  public com.sforce.soap.enterprise.sobject.User getLastActor() {
    return LastActor;
  }

  

  public void setLastActor(com.sforce.soap.enterprise.sobject.User LastActor) {
    this.LastActor = LastActor;
    LastActor__is_set = true;
  }
  
  /**
   * element  : LastActorId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LastActorId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastActorId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean LastActorId__is_set = false;

  private java.lang.String LastActorId;

  public java.lang.String getLastActorId() {
    return LastActorId;
  }

  

  public void setLastActorId(java.lang.String LastActorId) {
    this.LastActorId = LastActorId;
    LastActorId__is_set = true;
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
   * element  : Nodes of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Nodes__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Nodes","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Nodes__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Nodes;

  public com.sforce.soap.enterprise.QueryResult getNodes() {
    return Nodes;
  }

  

  public void setNodes(com.sforce.soap.enterprise.QueryResult Nodes) {
    this.Nodes = Nodes;
    Nodes__is_set = true;
  }
  
  /**
   * element  : ProcessDefinition of type {urn:sobject.enterprise.soap.sforce.com}ProcessDefinition
   * java type: com.sforce.soap.enterprise.sobject.ProcessDefinition
   */
  private static final com.sforce.ws.bind.TypeInfo ProcessDefinition__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ProcessDefinition","urn:sobject.enterprise.soap.sforce.com","ProcessDefinition",0,1,true);

  private boolean ProcessDefinition__is_set = false;

  private com.sforce.soap.enterprise.sobject.ProcessDefinition ProcessDefinition;

  public com.sforce.soap.enterprise.sobject.ProcessDefinition getProcessDefinition() {
    return ProcessDefinition;
  }

  

  public void setProcessDefinition(com.sforce.soap.enterprise.sobject.ProcessDefinition ProcessDefinition) {
    this.ProcessDefinition = ProcessDefinition;
    ProcessDefinition__is_set = true;
  }
  
  /**
   * element  : ProcessDefinitionId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ProcessDefinitionId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ProcessDefinitionId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ProcessDefinitionId__is_set = false;

  private java.lang.String ProcessDefinitionId;

  public java.lang.String getProcessDefinitionId() {
    return ProcessDefinitionId;
  }

  

  public void setProcessDefinitionId(java.lang.String ProcessDefinitionId) {
    this.ProcessDefinitionId = ProcessDefinitionId;
    ProcessDefinitionId__is_set = true;
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
   * element  : Steps of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Steps__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Steps","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Steps__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Steps;

  public com.sforce.soap.enterprise.QueryResult getSteps() {
    return Steps;
  }

  

  public void setSteps(com.sforce.soap.enterprise.QueryResult Steps) {
    this.Steps = Steps;
    Steps__is_set = true;
  }
  
  /**
   * element  : StepsAndWorkitems of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo StepsAndWorkitems__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","StepsAndWorkitems","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean StepsAndWorkitems__is_set = false;

  private com.sforce.soap.enterprise.QueryResult StepsAndWorkitems;

  public com.sforce.soap.enterprise.QueryResult getStepsAndWorkitems() {
    return StepsAndWorkitems;
  }

  

  public void setStepsAndWorkitems(com.sforce.soap.enterprise.QueryResult StepsAndWorkitems) {
    this.StepsAndWorkitems = StepsAndWorkitems;
    StepsAndWorkitems__is_set = true;
  }
  
  /**
   * element  : SubmittedBy of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo SubmittedBy__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SubmittedBy","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean SubmittedBy__is_set = false;

  private com.sforce.soap.enterprise.sobject.User SubmittedBy;

  public com.sforce.soap.enterprise.sobject.User getSubmittedBy() {
    return SubmittedBy;
  }

  

  public void setSubmittedBy(com.sforce.soap.enterprise.sobject.User SubmittedBy) {
    this.SubmittedBy = SubmittedBy;
    SubmittedBy__is_set = true;
  }
  
  /**
   * element  : SubmittedById of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo SubmittedById__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SubmittedById","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean SubmittedById__is_set = false;

  private java.lang.String SubmittedById;

  public java.lang.String getSubmittedById() {
    return SubmittedById;
  }

  

  public void setSubmittedById(java.lang.String SubmittedById) {
    this.SubmittedById = SubmittedById;
    SubmittedById__is_set = true;
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
   * element  : TargetObject of type {urn:sobject.enterprise.soap.sforce.com}Name
   * java type: com.sforce.soap.enterprise.sobject.Name
   */
  private static final com.sforce.ws.bind.TypeInfo TargetObject__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TargetObject","urn:sobject.enterprise.soap.sforce.com","Name",0,1,true);

  private boolean TargetObject__is_set = false;

  private com.sforce.soap.enterprise.sobject.Name TargetObject;

  public com.sforce.soap.enterprise.sobject.Name getTargetObject() {
    return TargetObject;
  }

  

  public void setTargetObject(com.sforce.soap.enterprise.sobject.Name TargetObject) {
    this.TargetObject = TargetObject;
    TargetObject__is_set = true;
  }
  
  /**
   * element  : TargetObjectId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo TargetObjectId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TargetObjectId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean TargetObjectId__is_set = false;

  private java.lang.String TargetObjectId;

  public java.lang.String getTargetObjectId() {
    return TargetObjectId;
  }

  

  public void setTargetObjectId(java.lang.String TargetObjectId) {
    this.TargetObjectId = TargetObjectId;
    TargetObjectId__is_set = true;
  }
  
  /**
   * element  : Workitems of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Workitems__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Workitems","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Workitems__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Workitems;

  public com.sforce.soap.enterprise.QueryResult getWorkitems() {
    return Workitems;
  }

  

  public void setWorkitems(com.sforce.soap.enterprise.QueryResult Workitems) {
    this.Workitems = Workitems;
    Workitems__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "ProcessInstance");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, CompletedDate__typeInfo, CompletedDate, CompletedDate__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeObject(__out, ElapsedTimeInDays__typeInfo, ElapsedTimeInDays, ElapsedTimeInDays__is_set);
    __typeMapper.writeObject(__out, ElapsedTimeInHours__typeInfo, ElapsedTimeInHours, ElapsedTimeInHours__is_set);
    __typeMapper.writeObject(__out, ElapsedTimeInMinutes__typeInfo, ElapsedTimeInMinutes, ElapsedTimeInMinutes__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, LastActor__typeInfo, LastActor, LastActor__is_set);
    __typeMapper.writeString(__out, LastActorId__typeInfo, LastActorId, LastActorId__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, Nodes__typeInfo, Nodes, Nodes__is_set);
    __typeMapper.writeObject(__out, ProcessDefinition__typeInfo, ProcessDefinition, ProcessDefinition__is_set);
    __typeMapper.writeString(__out, ProcessDefinitionId__typeInfo, ProcessDefinitionId, ProcessDefinitionId__is_set);
    __typeMapper.writeString(__out, Status__typeInfo, Status, Status__is_set);
    __typeMapper.writeObject(__out, Steps__typeInfo, Steps, Steps__is_set);
    __typeMapper.writeObject(__out, StepsAndWorkitems__typeInfo, StepsAndWorkitems, StepsAndWorkitems__is_set);
    __typeMapper.writeObject(__out, SubmittedBy__typeInfo, SubmittedBy, SubmittedBy__is_set);
    __typeMapper.writeString(__out, SubmittedById__typeInfo, SubmittedById, SubmittedById__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeObject(__out, TargetObject__typeInfo, TargetObject, TargetObject__is_set);
    __typeMapper.writeString(__out, TargetObjectId__typeInfo, TargetObjectId, TargetObjectId__is_set);
    __typeMapper.writeObject(__out, Workitems__typeInfo, Workitems, Workitems__is_set);
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
    if (__typeMapper.isElement(__in, CompletedDate__typeInfo)) {
      setCompletedDate((java.util.Calendar)__typeMapper.readObject(__in, CompletedDate__typeInfo, java.util.Calendar.class));
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
    if (__typeMapper.isElement(__in, ElapsedTimeInDays__typeInfo)) {
      setElapsedTimeInDays((java.lang.Double)__typeMapper.readObject(__in, ElapsedTimeInDays__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ElapsedTimeInHours__typeInfo)) {
      setElapsedTimeInHours((java.lang.Double)__typeMapper.readObject(__in, ElapsedTimeInHours__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ElapsedTimeInMinutes__typeInfo)) {
      setElapsedTimeInMinutes((java.lang.Double)__typeMapper.readObject(__in, ElapsedTimeInMinutes__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {
      setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, IsDeleted__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LastActor__typeInfo)) {
      setLastActor((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, LastActor__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LastActorId__typeInfo)) {
      setLastActorId((java.lang.String)__typeMapper.readString(__in, LastActorId__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Nodes__typeInfo)) {
      setNodes((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Nodes__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ProcessDefinition__typeInfo)) {
      setProcessDefinition((com.sforce.soap.enterprise.sobject.ProcessDefinition)__typeMapper.readObject(__in, ProcessDefinition__typeInfo, com.sforce.soap.enterprise.sobject.ProcessDefinition.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ProcessDefinitionId__typeInfo)) {
      setProcessDefinitionId((java.lang.String)__typeMapper.readString(__in, ProcessDefinitionId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Status__typeInfo)) {
      setStatus((java.lang.String)__typeMapper.readString(__in, Status__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Steps__typeInfo)) {
      setSteps((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Steps__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, StepsAndWorkitems__typeInfo)) {
      setStepsAndWorkitems((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, StepsAndWorkitems__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SubmittedBy__typeInfo)) {
      setSubmittedBy((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, SubmittedBy__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SubmittedById__typeInfo)) {
      setSubmittedById((java.lang.String)__typeMapper.readString(__in, SubmittedById__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TargetObject__typeInfo)) {
      setTargetObject((com.sforce.soap.enterprise.sobject.Name)__typeMapper.readObject(__in, TargetObject__typeInfo, com.sforce.soap.enterprise.sobject.Name.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TargetObjectId__typeInfo)) {
      setTargetObjectId((java.lang.String)__typeMapper.readString(__in, TargetObjectId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Workitems__typeInfo)) {
      setWorkitems((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Workitems__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[ProcessInstance ");
    sb.append(super.toString());
    sb.append(" CompletedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CompletedDate)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" ElapsedTimeInDays=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ElapsedTimeInDays)+"'\n");
    sb.append(" ElapsedTimeInHours=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ElapsedTimeInHours)+"'\n");
    sb.append(" ElapsedTimeInMinutes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ElapsedTimeInMinutes)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" LastActor=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastActor)+"'\n");
    sb.append(" LastActorId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastActorId)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" Nodes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Nodes)+"'\n");
    sb.append(" ProcessDefinition=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessDefinition)+"'\n");
    sb.append(" ProcessDefinitionId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessDefinitionId)+"'\n");
    sb.append(" Status=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Status)+"'\n");
    sb.append(" Steps=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Steps)+"'\n");
    sb.append(" StepsAndWorkitems=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(StepsAndWorkitems)+"'\n");
    sb.append(" SubmittedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SubmittedBy)+"'\n");
    sb.append(" SubmittedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SubmittedById)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" TargetObject=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TargetObject)+"'\n");
    sb.append(" TargetObjectId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TargetObjectId)+"'\n");
    sb.append(" Workitems=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Workitems)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}