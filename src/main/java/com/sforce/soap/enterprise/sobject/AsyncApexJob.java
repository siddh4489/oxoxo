package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class AsyncApexJob extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public AsyncApexJob() {
  }
    
  
  /**
   * element  : ApexClass of type {urn:sobject.enterprise.soap.sforce.com}ApexClass
   * java type: com.sforce.soap.enterprise.sobject.ApexClass
   */
  private static final com.sforce.ws.bind.TypeInfo ApexClass__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ApexClass","urn:sobject.enterprise.soap.sforce.com","ApexClass",0,1,true);

  private boolean ApexClass__is_set = false;

  private com.sforce.soap.enterprise.sobject.ApexClass ApexClass;

  public com.sforce.soap.enterprise.sobject.ApexClass getApexClass() {
    return ApexClass;
  }

  

  public void setApexClass(com.sforce.soap.enterprise.sobject.ApexClass ApexClass) {
    this.ApexClass = ApexClass;
    ApexClass__is_set = true;
  }
  
  /**
   * element  : ApexClassId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ApexClassId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ApexClassId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ApexClassId__is_set = false;

  private java.lang.String ApexClassId;

  public java.lang.String getApexClassId() {
    return ApexClassId;
  }

  

  public void setApexClassId(java.lang.String ApexClassId) {
    this.ApexClassId = ApexClassId;
    ApexClassId__is_set = true;
  }
  
  /**
   * element  : AsyncApex of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo AsyncApex__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AsyncApex","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean AsyncApex__is_set = false;

  private com.sforce.soap.enterprise.QueryResult AsyncApex;

  public com.sforce.soap.enterprise.QueryResult getAsyncApex() {
    return AsyncApex;
  }

  

  public void setAsyncApex(com.sforce.soap.enterprise.QueryResult AsyncApex) {
    this.AsyncApex = AsyncApex;
    AsyncApex__is_set = true;
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
   * element  : ExtendedStatus of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ExtendedStatus__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ExtendedStatus","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ExtendedStatus__is_set = false;

  private java.lang.String ExtendedStatus;

  public java.lang.String getExtendedStatus() {
    return ExtendedStatus;
  }

  

  public void setExtendedStatus(java.lang.String ExtendedStatus) {
    this.ExtendedStatus = ExtendedStatus;
    ExtendedStatus__is_set = true;
  }
  
  /**
   * element  : JobItemsProcessed of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo JobItemsProcessed__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","JobItemsProcessed","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean JobItemsProcessed__is_set = false;

  private java.lang.Integer JobItemsProcessed;

  public java.lang.Integer getJobItemsProcessed() {
    return JobItemsProcessed;
  }

  

  public void setJobItemsProcessed(java.lang.Integer JobItemsProcessed) {
    this.JobItemsProcessed = JobItemsProcessed;
    JobItemsProcessed__is_set = true;
  }
  
  /**
   * element  : JobType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo JobType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","JobType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean JobType__is_set = false;

  private java.lang.String JobType;

  public java.lang.String getJobType() {
    return JobType;
  }

  

  public void setJobType(java.lang.String JobType) {
    this.JobType = JobType;
    JobType__is_set = true;
  }
  
  /**
   * element  : LastProcessed of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LastProcessed__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastProcessed","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean LastProcessed__is_set = false;

  private java.lang.String LastProcessed;

  public java.lang.String getLastProcessed() {
    return LastProcessed;
  }

  

  public void setLastProcessed(java.lang.String LastProcessed) {
    this.LastProcessed = LastProcessed;
    LastProcessed__is_set = true;
  }
  
  /**
   * element  : LastProcessedOffset of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo LastProcessedOffset__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastProcessedOffset","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean LastProcessedOffset__is_set = false;

  private java.lang.Integer LastProcessedOffset;

  public java.lang.Integer getLastProcessedOffset() {
    return LastProcessedOffset;
  }

  

  public void setLastProcessedOffset(java.lang.Integer LastProcessedOffset) {
    this.LastProcessedOffset = LastProcessedOffset;
    LastProcessedOffset__is_set = true;
  }
  
  /**
   * element  : MethodName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo MethodName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MethodName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean MethodName__is_set = false;

  private java.lang.String MethodName;

  public java.lang.String getMethodName() {
    return MethodName;
  }

  

  public void setMethodName(java.lang.String MethodName) {
    this.MethodName = MethodName;
    MethodName__is_set = true;
  }
  
  /**
   * element  : NumberOfErrors of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo NumberOfErrors__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","NumberOfErrors","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean NumberOfErrors__is_set = false;

  private java.lang.Integer NumberOfErrors;

  public java.lang.Integer getNumberOfErrors() {
    return NumberOfErrors;
  }

  

  public void setNumberOfErrors(java.lang.Integer NumberOfErrors) {
    this.NumberOfErrors = NumberOfErrors;
    NumberOfErrors__is_set = true;
  }
  
  /**
   * element  : ParentJobId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ParentJobId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ParentJobId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ParentJobId__is_set = false;

  private java.lang.String ParentJobId;

  public java.lang.String getParentJobId() {
    return ParentJobId;
  }

  

  public void setParentJobId(java.lang.String ParentJobId) {
    this.ParentJobId = ParentJobId;
    ParentJobId__is_set = true;
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
   * element  : TotalJobItems of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo TotalJobItems__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TotalJobItems","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean TotalJobItems__is_set = false;

  private java.lang.Integer TotalJobItems;

  public java.lang.Integer getTotalJobItems() {
    return TotalJobItems;
  }

  

  public void setTotalJobItems(java.lang.Integer TotalJobItems) {
    this.TotalJobItems = TotalJobItems;
    TotalJobItems__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "AsyncApexJob");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, ApexClass__typeInfo, ApexClass, ApexClass__is_set);
    __typeMapper.writeString(__out, ApexClassId__typeInfo, ApexClassId, ApexClassId__is_set);
    __typeMapper.writeObject(__out, AsyncApex__typeInfo, AsyncApex, AsyncApex__is_set);
    __typeMapper.writeObject(__out, CompletedDate__typeInfo, CompletedDate, CompletedDate__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, ExtendedStatus__typeInfo, ExtendedStatus, ExtendedStatus__is_set);
    __typeMapper.writeObject(__out, JobItemsProcessed__typeInfo, JobItemsProcessed, JobItemsProcessed__is_set);
    __typeMapper.writeString(__out, JobType__typeInfo, JobType, JobType__is_set);
    __typeMapper.writeString(__out, LastProcessed__typeInfo, LastProcessed, LastProcessed__is_set);
    __typeMapper.writeObject(__out, LastProcessedOffset__typeInfo, LastProcessedOffset, LastProcessedOffset__is_set);
    __typeMapper.writeString(__out, MethodName__typeInfo, MethodName, MethodName__is_set);
    __typeMapper.writeObject(__out, NumberOfErrors__typeInfo, NumberOfErrors, NumberOfErrors__is_set);
    __typeMapper.writeString(__out, ParentJobId__typeInfo, ParentJobId, ParentJobId__is_set);
    __typeMapper.writeString(__out, Status__typeInfo, Status, Status__is_set);
    __typeMapper.writeObject(__out, TotalJobItems__typeInfo, TotalJobItems, TotalJobItems__is_set);
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
    if (__typeMapper.isElement(__in, ApexClass__typeInfo)) {
      setApexClass((com.sforce.soap.enterprise.sobject.ApexClass)__typeMapper.readObject(__in, ApexClass__typeInfo, com.sforce.soap.enterprise.sobject.ApexClass.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ApexClassId__typeInfo)) {
      setApexClassId((java.lang.String)__typeMapper.readString(__in, ApexClassId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AsyncApex__typeInfo)) {
      setAsyncApex((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, AsyncApex__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
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
    if (__typeMapper.isElement(__in, ExtendedStatus__typeInfo)) {
      setExtendedStatus((java.lang.String)__typeMapper.readString(__in, ExtendedStatus__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, JobItemsProcessed__typeInfo)) {
      setJobItemsProcessed((java.lang.Integer)__typeMapper.readObject(__in, JobItemsProcessed__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, JobType__typeInfo)) {
      setJobType((java.lang.String)__typeMapper.readString(__in, JobType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LastProcessed__typeInfo)) {
      setLastProcessed((java.lang.String)__typeMapper.readString(__in, LastProcessed__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LastProcessedOffset__typeInfo)) {
      setLastProcessedOffset((java.lang.Integer)__typeMapper.readObject(__in, LastProcessedOffset__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MethodName__typeInfo)) {
      setMethodName((java.lang.String)__typeMapper.readString(__in, MethodName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, NumberOfErrors__typeInfo)) {
      setNumberOfErrors((java.lang.Integer)__typeMapper.readObject(__in, NumberOfErrors__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ParentJobId__typeInfo)) {
      setParentJobId((java.lang.String)__typeMapper.readString(__in, ParentJobId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Status__typeInfo)) {
      setStatus((java.lang.String)__typeMapper.readString(__in, Status__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TotalJobItems__typeInfo)) {
      setTotalJobItems((java.lang.Integer)__typeMapper.readObject(__in, TotalJobItems__typeInfo, java.lang.Integer.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[AsyncApexJob ");
    sb.append(super.toString());
    sb.append(" ApexClass=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ApexClass)+"'\n");
    sb.append(" ApexClassId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ApexClassId)+"'\n");
    sb.append(" AsyncApex=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AsyncApex)+"'\n");
    sb.append(" CompletedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CompletedDate)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" ExtendedStatus=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ExtendedStatus)+"'\n");
    sb.append(" JobItemsProcessed=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(JobItemsProcessed)+"'\n");
    sb.append(" JobType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(JobType)+"'\n");
    sb.append(" LastProcessed=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastProcessed)+"'\n");
    sb.append(" LastProcessedOffset=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastProcessedOffset)+"'\n");
    sb.append(" MethodName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MethodName)+"'\n");
    sb.append(" NumberOfErrors=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NumberOfErrors)+"'\n");
    sb.append(" ParentJobId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ParentJobId)+"'\n");
    sb.append(" Status=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Status)+"'\n");
    sb.append(" TotalJobItems=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TotalJobItems)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}