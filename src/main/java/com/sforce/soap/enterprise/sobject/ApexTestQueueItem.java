package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class ApexTestQueueItem extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public ApexTestQueueItem() {
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
   * element  : TestRunResultId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo TestRunResultId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TestRunResultId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean TestRunResultId__is_set = false;

  private java.lang.String TestRunResultId;

  public java.lang.String getTestRunResultId() {
    return TestRunResultId;
  }

  

  public void setTestRunResultId(java.lang.String TestRunResultId) {
    this.TestRunResultId = TestRunResultId;
    TestRunResultId__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "ApexTestQueueItem");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, ApexClass__typeInfo, ApexClass, ApexClass__is_set);
    __typeMapper.writeString(__out, ApexClassId__typeInfo, ApexClassId, ApexClassId__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, ExtendedStatus__typeInfo, ExtendedStatus, ExtendedStatus__is_set);
    __typeMapper.writeString(__out, ParentJobId__typeInfo, ParentJobId, ParentJobId__is_set);
    __typeMapper.writeString(__out, Status__typeInfo, Status, Status__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeString(__out, TestRunResultId__typeInfo, TestRunResultId, TestRunResultId__is_set);
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
    if (__typeMapper.isElement(__in, ParentJobId__typeInfo)) {
      setParentJobId((java.lang.String)__typeMapper.readString(__in, ParentJobId__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, TestRunResultId__typeInfo)) {
      setTestRunResultId((java.lang.String)__typeMapper.readString(__in, TestRunResultId__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[ApexTestQueueItem ");
    sb.append(super.toString());
    sb.append(" ApexClass=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ApexClass)+"'\n");
    sb.append(" ApexClassId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ApexClassId)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" ExtendedStatus=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ExtendedStatus)+"'\n");
    sb.append(" ParentJobId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ParentJobId)+"'\n");
    sb.append(" Status=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Status)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" TestRunResultId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TestRunResultId)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}