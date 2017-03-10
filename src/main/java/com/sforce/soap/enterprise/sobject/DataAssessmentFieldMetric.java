package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class DataAssessmentFieldMetric extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public DataAssessmentFieldMetric() {
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
   * element  : DataAssessmentMetric of type {urn:sobject.enterprise.soap.sforce.com}DataAssessmentMetric
   * java type: com.sforce.soap.enterprise.sobject.DataAssessmentMetric
   */
  private static final com.sforce.ws.bind.TypeInfo DataAssessmentMetric__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DataAssessmentMetric","urn:sobject.enterprise.soap.sforce.com","DataAssessmentMetric",0,1,true);

  private boolean DataAssessmentMetric__is_set = false;

  private com.sforce.soap.enterprise.sobject.DataAssessmentMetric DataAssessmentMetric;

  public com.sforce.soap.enterprise.sobject.DataAssessmentMetric getDataAssessmentMetric() {
    return DataAssessmentMetric;
  }

  

  public void setDataAssessmentMetric(com.sforce.soap.enterprise.sobject.DataAssessmentMetric DataAssessmentMetric) {
    this.DataAssessmentMetric = DataAssessmentMetric;
    DataAssessmentMetric__is_set = true;
  }
  
  /**
   * element  : DataAssessmentMetricId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo DataAssessmentMetricId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DataAssessmentMetricId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean DataAssessmentMetricId__is_set = false;

  private java.lang.String DataAssessmentMetricId;

  public java.lang.String getDataAssessmentMetricId() {
    return DataAssessmentMetricId;
  }

  

  public void setDataAssessmentMetricId(java.lang.String DataAssessmentMetricId) {
    this.DataAssessmentMetricId = DataAssessmentMetricId;
    DataAssessmentMetricId__is_set = true;
  }
  
  /**
   * element  : DataAssessmentValueMetrics of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo DataAssessmentValueMetrics__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DataAssessmentValueMetrics","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean DataAssessmentValueMetrics__is_set = false;

  private com.sforce.soap.enterprise.QueryResult DataAssessmentValueMetrics;

  public com.sforce.soap.enterprise.QueryResult getDataAssessmentValueMetrics() {
    return DataAssessmentValueMetrics;
  }

  

  public void setDataAssessmentValueMetrics(com.sforce.soap.enterprise.QueryResult DataAssessmentValueMetrics) {
    this.DataAssessmentValueMetrics = DataAssessmentValueMetrics;
    DataAssessmentValueMetrics__is_set = true;
  }
  
  /**
   * element  : FieldName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo FieldName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FieldName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean FieldName__is_set = false;

  private java.lang.String FieldName;

  public java.lang.String getFieldName() {
    return FieldName;
  }

  

  public void setFieldName(java.lang.String FieldName) {
    this.FieldName = FieldName;
    FieldName__is_set = true;
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
   * element  : NumMatchedBlanks of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo NumMatchedBlanks__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","NumMatchedBlanks","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean NumMatchedBlanks__is_set = false;

  private java.lang.Integer NumMatchedBlanks;

  public java.lang.Integer getNumMatchedBlanks() {
    return NumMatchedBlanks;
  }

  

  public void setNumMatchedBlanks(java.lang.Integer NumMatchedBlanks) {
    this.NumMatchedBlanks = NumMatchedBlanks;
    NumMatchedBlanks__is_set = true;
  }
  
  /**
   * element  : NumMatchedDifferent of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo NumMatchedDifferent__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","NumMatchedDifferent","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean NumMatchedDifferent__is_set = false;

  private java.lang.Integer NumMatchedDifferent;

  public java.lang.Integer getNumMatchedDifferent() {
    return NumMatchedDifferent;
  }

  

  public void setNumMatchedDifferent(java.lang.Integer NumMatchedDifferent) {
    this.NumMatchedDifferent = NumMatchedDifferent;
    NumMatchedDifferent__is_set = true;
  }
  
  /**
   * element  : NumMatchedInSync of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo NumMatchedInSync__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","NumMatchedInSync","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean NumMatchedInSync__is_set = false;

  private java.lang.Integer NumMatchedInSync;

  public java.lang.Integer getNumMatchedInSync() {
    return NumMatchedInSync;
  }

  

  public void setNumMatchedInSync(java.lang.Integer NumMatchedInSync) {
    this.NumMatchedInSync = NumMatchedInSync;
    NumMatchedInSync__is_set = true;
  }
  
  /**
   * element  : NumUnmatchedBlanks of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo NumUnmatchedBlanks__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","NumUnmatchedBlanks","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean NumUnmatchedBlanks__is_set = false;

  private java.lang.Integer NumUnmatchedBlanks;

  public java.lang.Integer getNumUnmatchedBlanks() {
    return NumUnmatchedBlanks;
  }

  

  public void setNumUnmatchedBlanks(java.lang.Integer NumUnmatchedBlanks) {
    this.NumUnmatchedBlanks = NumUnmatchedBlanks;
    NumUnmatchedBlanks__is_set = true;
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
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "DataAssessmentFieldMetric");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeObject(__out, DataAssessmentMetric__typeInfo, DataAssessmentMetric, DataAssessmentMetric__is_set);
    __typeMapper.writeString(__out, DataAssessmentMetricId__typeInfo, DataAssessmentMetricId, DataAssessmentMetricId__is_set);
    __typeMapper.writeObject(__out, DataAssessmentValueMetrics__typeInfo, DataAssessmentValueMetrics, DataAssessmentValueMetrics__is_set);
    __typeMapper.writeString(__out, FieldName__typeInfo, FieldName, FieldName__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeObject(__out, NumMatchedBlanks__typeInfo, NumMatchedBlanks, NumMatchedBlanks__is_set);
    __typeMapper.writeObject(__out, NumMatchedDifferent__typeInfo, NumMatchedDifferent, NumMatchedDifferent__is_set);
    __typeMapper.writeObject(__out, NumMatchedInSync__typeInfo, NumMatchedInSync, NumMatchedInSync__is_set);
    __typeMapper.writeObject(__out, NumUnmatchedBlanks__typeInfo, NumUnmatchedBlanks, NumUnmatchedBlanks__is_set);
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
    if (__typeMapper.isElement(__in, DataAssessmentMetric__typeInfo)) {
      setDataAssessmentMetric((com.sforce.soap.enterprise.sobject.DataAssessmentMetric)__typeMapper.readObject(__in, DataAssessmentMetric__typeInfo, com.sforce.soap.enterprise.sobject.DataAssessmentMetric.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DataAssessmentMetricId__typeInfo)) {
      setDataAssessmentMetricId((java.lang.String)__typeMapper.readString(__in, DataAssessmentMetricId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DataAssessmentValueMetrics__typeInfo)) {
      setDataAssessmentValueMetrics((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, DataAssessmentValueMetrics__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FieldName__typeInfo)) {
      setFieldName((java.lang.String)__typeMapper.readString(__in, FieldName__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, NumMatchedBlanks__typeInfo)) {
      setNumMatchedBlanks((java.lang.Integer)__typeMapper.readObject(__in, NumMatchedBlanks__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, NumMatchedDifferent__typeInfo)) {
      setNumMatchedDifferent((java.lang.Integer)__typeMapper.readObject(__in, NumMatchedDifferent__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, NumMatchedInSync__typeInfo)) {
      setNumMatchedInSync((java.lang.Integer)__typeMapper.readObject(__in, NumMatchedInSync__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, NumUnmatchedBlanks__typeInfo)) {
      setNumUnmatchedBlanks((java.lang.Integer)__typeMapper.readObject(__in, NumUnmatchedBlanks__typeInfo, java.lang.Integer.class));
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
    sb.append("[DataAssessmentFieldMetric ");
    sb.append(super.toString());
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" DataAssessmentMetric=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DataAssessmentMetric)+"'\n");
    sb.append(" DataAssessmentMetricId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DataAssessmentMetricId)+"'\n");
    sb.append(" DataAssessmentValueMetrics=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DataAssessmentValueMetrics)+"'\n");
    sb.append(" FieldName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FieldName)+"'\n");
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
    sb.append(" NumMatchedBlanks=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NumMatchedBlanks)+"'\n");
    sb.append(" NumMatchedDifferent=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NumMatchedDifferent)+"'\n");
    sb.append(" NumMatchedInSync=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NumMatchedInSync)+"'\n");
    sb.append(" NumUnmatchedBlanks=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NumUnmatchedBlanks)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" UserRecordAccess=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserRecordAccess)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}