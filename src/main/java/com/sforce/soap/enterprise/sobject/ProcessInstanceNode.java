package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class ProcessInstanceNode extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public ProcessInstanceNode() {
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
   * element  : NodeStatus of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo NodeStatus__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","NodeStatus","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean NodeStatus__is_set = false;

  private java.lang.String NodeStatus;

  public java.lang.String getNodeStatus() {
    return NodeStatus;
  }

  

  public void setNodeStatus(java.lang.String NodeStatus) {
    this.NodeStatus = NodeStatus;
    NodeStatus__is_set = true;
  }
  
  /**
   * element  : ProcessInstance of type {urn:sobject.enterprise.soap.sforce.com}ProcessInstance
   * java type: com.sforce.soap.enterprise.sobject.ProcessInstance
   */
  private static final com.sforce.ws.bind.TypeInfo ProcessInstance__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ProcessInstance","urn:sobject.enterprise.soap.sforce.com","ProcessInstance",0,1,true);

  private boolean ProcessInstance__is_set = false;

  private com.sforce.soap.enterprise.sobject.ProcessInstance ProcessInstance;

  public com.sforce.soap.enterprise.sobject.ProcessInstance getProcessInstance() {
    return ProcessInstance;
  }

  

  public void setProcessInstance(com.sforce.soap.enterprise.sobject.ProcessInstance ProcessInstance) {
    this.ProcessInstance = ProcessInstance;
    ProcessInstance__is_set = true;
  }
  
  /**
   * element  : ProcessInstanceId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ProcessInstanceId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ProcessInstanceId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ProcessInstanceId__is_set = false;

  private java.lang.String ProcessInstanceId;

  public java.lang.String getProcessInstanceId() {
    return ProcessInstanceId;
  }

  

  public void setProcessInstanceId(java.lang.String ProcessInstanceId) {
    this.ProcessInstanceId = ProcessInstanceId;
    ProcessInstanceId__is_set = true;
  }
  
  /**
   * element  : ProcessNode of type {urn:sobject.enterprise.soap.sforce.com}ProcessNode
   * java type: com.sforce.soap.enterprise.sobject.ProcessNode
   */
  private static final com.sforce.ws.bind.TypeInfo ProcessNode__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ProcessNode","urn:sobject.enterprise.soap.sforce.com","ProcessNode",0,1,true);

  private boolean ProcessNode__is_set = false;

  private com.sforce.soap.enterprise.sobject.ProcessNode ProcessNode;

  public com.sforce.soap.enterprise.sobject.ProcessNode getProcessNode() {
    return ProcessNode;
  }

  

  public void setProcessNode(com.sforce.soap.enterprise.sobject.ProcessNode ProcessNode) {
    this.ProcessNode = ProcessNode;
    ProcessNode__is_set = true;
  }
  
  /**
   * element  : ProcessNodeId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ProcessNodeId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ProcessNodeId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ProcessNodeId__is_set = false;

  private java.lang.String ProcessNodeId;

  public java.lang.String getProcessNodeId() {
    return ProcessNodeId;
  }

  

  public void setProcessNodeId(java.lang.String ProcessNodeId) {
    this.ProcessNodeId = ProcessNodeId;
    ProcessNodeId__is_set = true;
  }
  
  /**
   * element  : ProcessNodeName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ProcessNodeName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ProcessNodeName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ProcessNodeName__is_set = false;

  private java.lang.String ProcessNodeName;

  public java.lang.String getProcessNodeName() {
    return ProcessNodeName;
  }

  

  public void setProcessNodeName(java.lang.String ProcessNodeName) {
    this.ProcessNodeName = ProcessNodeName;
    ProcessNodeName__is_set = true;
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
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "ProcessInstanceNode");
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
    __typeMapper.writeString(__out, NodeStatus__typeInfo, NodeStatus, NodeStatus__is_set);
    __typeMapper.writeObject(__out, ProcessInstance__typeInfo, ProcessInstance, ProcessInstance__is_set);
    __typeMapper.writeString(__out, ProcessInstanceId__typeInfo, ProcessInstanceId, ProcessInstanceId__is_set);
    __typeMapper.writeObject(__out, ProcessNode__typeInfo, ProcessNode, ProcessNode__is_set);
    __typeMapper.writeString(__out, ProcessNodeId__typeInfo, ProcessNodeId, ProcessNodeId__is_set);
    __typeMapper.writeString(__out, ProcessNodeName__typeInfo, ProcessNodeName, ProcessNodeName__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeObject(__out, UserRecordAccess__typeInfo, UserRecordAccess, UserRecordAccess__is_set);
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
    if (__typeMapper.isElement(__in, NodeStatus__typeInfo)) {
      setNodeStatus((java.lang.String)__typeMapper.readString(__in, NodeStatus__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ProcessInstance__typeInfo)) {
      setProcessInstance((com.sforce.soap.enterprise.sobject.ProcessInstance)__typeMapper.readObject(__in, ProcessInstance__typeInfo, com.sforce.soap.enterprise.sobject.ProcessInstance.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ProcessInstanceId__typeInfo)) {
      setProcessInstanceId((java.lang.String)__typeMapper.readString(__in, ProcessInstanceId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ProcessNode__typeInfo)) {
      setProcessNode((com.sforce.soap.enterprise.sobject.ProcessNode)__typeMapper.readObject(__in, ProcessNode__typeInfo, com.sforce.soap.enterprise.sobject.ProcessNode.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ProcessNodeId__typeInfo)) {
      setProcessNodeId((java.lang.String)__typeMapper.readString(__in, ProcessNodeId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ProcessNodeName__typeInfo)) {
      setProcessNodeName((java.lang.String)__typeMapper.readString(__in, ProcessNodeName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserRecordAccess__typeInfo)) {
      setUserRecordAccess((com.sforce.soap.enterprise.sobject.UserRecordAccess)__typeMapper.readObject(__in, UserRecordAccess__typeInfo, com.sforce.soap.enterprise.sobject.UserRecordAccess.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[ProcessInstanceNode ");
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
    sb.append(" NodeStatus=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NodeStatus)+"'\n");
    sb.append(" ProcessInstance=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessInstance)+"'\n");
    sb.append(" ProcessInstanceId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessInstanceId)+"'\n");
    sb.append(" ProcessNode=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessNode)+"'\n");
    sb.append(" ProcessNodeId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessNodeId)+"'\n");
    sb.append(" ProcessNodeName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessNodeName)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" UserRecordAccess=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserRecordAccess)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}