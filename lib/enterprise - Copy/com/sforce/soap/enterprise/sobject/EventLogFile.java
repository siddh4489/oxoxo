package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class EventLogFile extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public EventLogFile() {
  }
    
  
  /**
   * element  : ApiVersion of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo ApiVersion__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ApiVersion","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean ApiVersion__is_set = false;

  private java.lang.Double ApiVersion;

  public java.lang.Double getApiVersion() {
    return ApiVersion;
  }

  

  public void setApiVersion(java.lang.Double ApiVersion) {
    this.ApiVersion = ApiVersion;
    ApiVersion__is_set = true;
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
   * element  : EventType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo EventType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","EventType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean EventType__is_set = false;

  private java.lang.String EventType;

  public java.lang.String getEventType() {
    return EventType;
  }

  

  public void setEventType(java.lang.String EventType) {
    this.EventType = EventType;
    EventType__is_set = true;
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
   * element  : LogDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo LogDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LogDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean LogDate__is_set = false;

  private java.util.Calendar LogDate;

  public java.util.Calendar getLogDate() {
    return LogDate;
  }

  

  public void setLogDate(java.util.Calendar LogDate) {
    this.LogDate = LogDate;
    LogDate__is_set = true;
  }
  
  /**
   * element  : LogFile of type {http://www.w3.org/2001/XMLSchema}base64Binary
   * java type: byte[]
   */
  private static final com.sforce.ws.bind.TypeInfo LogFile__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LogFile","http://www.w3.org/2001/XMLSchema","base64Binary",0,1,true);

  private boolean LogFile__is_set = false;

  private byte[] LogFile;

  public byte[] getLogFile() {
    return LogFile;
  }

  

  public void setLogFile(byte[] LogFile) {
    this.LogFile = LogFile;
    LogFile__is_set = true;
  }
  
  /**
   * element  : LogFileContentType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LogFileContentType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LogFileContentType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean LogFileContentType__is_set = false;

  private java.lang.String LogFileContentType;

  public java.lang.String getLogFileContentType() {
    return LogFileContentType;
  }

  

  public void setLogFileContentType(java.lang.String LogFileContentType) {
    this.LogFileContentType = LogFileContentType;
    LogFileContentType__is_set = true;
  }
  
  /**
   * element  : LogFileFieldNames of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LogFileFieldNames__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LogFileFieldNames","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean LogFileFieldNames__is_set = false;

  private java.lang.String LogFileFieldNames;

  public java.lang.String getLogFileFieldNames() {
    return LogFileFieldNames;
  }

  

  public void setLogFileFieldNames(java.lang.String LogFileFieldNames) {
    this.LogFileFieldNames = LogFileFieldNames;
    LogFileFieldNames__is_set = true;
  }
  
  /**
   * element  : LogFileFieldTypes of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LogFileFieldTypes__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LogFileFieldTypes","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean LogFileFieldTypes__is_set = false;

  private java.lang.String LogFileFieldTypes;

  public java.lang.String getLogFileFieldTypes() {
    return LogFileFieldTypes;
  }

  

  public void setLogFileFieldTypes(java.lang.String LogFileFieldTypes) {
    this.LogFileFieldTypes = LogFileFieldTypes;
    LogFileFieldTypes__is_set = true;
  }
  
  /**
   * element  : LogFileLength of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo LogFileLength__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LogFileLength","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean LogFileLength__is_set = false;

  private java.lang.Double LogFileLength;

  public java.lang.Double getLogFileLength() {
    return LogFileLength;
  }

  

  public void setLogFileLength(java.lang.Double LogFileLength) {
    this.LogFileLength = LogFileLength;
    LogFileLength__is_set = true;
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
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "EventLogFile");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, ApiVersion__typeInfo, ApiVersion, ApiVersion__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, EventType__typeInfo, EventType, EventType__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, LogDate__typeInfo, LogDate, LogDate__is_set);
    __typeMapper.writeObject(__out, LogFile__typeInfo, LogFile, LogFile__is_set);
    __typeMapper.writeString(__out, LogFileContentType__typeInfo, LogFileContentType, LogFileContentType__is_set);
    __typeMapper.writeString(__out, LogFileFieldNames__typeInfo, LogFileFieldNames, LogFileFieldNames__is_set);
    __typeMapper.writeString(__out, LogFileFieldTypes__typeInfo, LogFileFieldTypes, LogFileFieldTypes__is_set);
    __typeMapper.writeObject(__out, LogFileLength__typeInfo, LogFileLength, LogFileLength__is_set);
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
    if (__typeMapper.isElement(__in, ApiVersion__typeInfo)) {
      setApiVersion((java.lang.Double)__typeMapper.readObject(__in, ApiVersion__typeInfo, java.lang.Double.class));
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
    if (__typeMapper.isElement(__in, EventType__typeInfo)) {
      setEventType((java.lang.String)__typeMapper.readString(__in, EventType__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, LogDate__typeInfo)) {
      setLogDate((java.util.Calendar)__typeMapper.readObject(__in, LogDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LogFile__typeInfo)) {
      setLogFile((byte[])__typeMapper.readObject(__in, LogFile__typeInfo, byte[].class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LogFileContentType__typeInfo)) {
      setLogFileContentType((java.lang.String)__typeMapper.readString(__in, LogFileContentType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LogFileFieldNames__typeInfo)) {
      setLogFileFieldNames((java.lang.String)__typeMapper.readString(__in, LogFileFieldNames__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LogFileFieldTypes__typeInfo)) {
      setLogFileFieldTypes((java.lang.String)__typeMapper.readString(__in, LogFileFieldTypes__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LogFileLength__typeInfo)) {
      setLogFileLength((java.lang.Double)__typeMapper.readObject(__in, LogFileLength__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[EventLogFile ");
    sb.append(super.toString());
    sb.append(" ApiVersion=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ApiVersion)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" EventType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EventType)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" LogDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LogDate)+"'\n");
    sb.append(" LogFile=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LogFile)+"'\n");
    sb.append(" LogFileContentType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LogFileContentType)+"'\n");
    sb.append(" LogFileFieldNames=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LogFileFieldNames)+"'\n");
    sb.append(" LogFileFieldTypes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LogFileFieldTypes)+"'\n");
    sb.append(" LogFileLength=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LogFileLength)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}