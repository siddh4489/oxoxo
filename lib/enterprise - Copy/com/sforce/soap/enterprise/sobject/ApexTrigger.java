package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class ApexTrigger extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public ApexTrigger() {
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
   * element  : Body of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Body__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Body","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Body__is_set = false;

  private java.lang.String Body;

  public java.lang.String getBody() {
    return Body;
  }

  

  public void setBody(java.lang.String Body) {
    this.Body = Body;
    Body__is_set = true;
  }
  
  /**
   * element  : BodyCrc of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo BodyCrc__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","BodyCrc","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean BodyCrc__is_set = false;

  private java.lang.Double BodyCrc;

  public java.lang.Double getBodyCrc() {
    return BodyCrc;
  }

  

  public void setBodyCrc(java.lang.Double BodyCrc) {
    this.BodyCrc = BodyCrc;
    BodyCrc__is_set = true;
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
   * element  : IsValid of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsValid__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsValid","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsValid__is_set = false;

  private java.lang.Boolean IsValid;

  public java.lang.Boolean getIsValid() {
    return IsValid;
  }

  

  public void setIsValid(java.lang.Boolean IsValid) {
    this.IsValid = IsValid;
    IsValid__is_set = true;
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
   * element  : LengthWithoutComments of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo LengthWithoutComments__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LengthWithoutComments","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean LengthWithoutComments__is_set = false;

  private java.lang.Integer LengthWithoutComments;

  public java.lang.Integer getLengthWithoutComments() {
    return LengthWithoutComments;
  }

  

  public void setLengthWithoutComments(java.lang.Integer LengthWithoutComments) {
    this.LengthWithoutComments = LengthWithoutComments;
    LengthWithoutComments__is_set = true;
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
   * element  : NamespacePrefix of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo NamespacePrefix__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","NamespacePrefix","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean NamespacePrefix__is_set = false;

  private java.lang.String NamespacePrefix;

  public java.lang.String getNamespacePrefix() {
    return NamespacePrefix;
  }

  

  public void setNamespacePrefix(java.lang.String NamespacePrefix) {
    this.NamespacePrefix = NamespacePrefix;
    NamespacePrefix__is_set = true;
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
   * element  : TableEnumOrId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo TableEnumOrId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TableEnumOrId","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean TableEnumOrId__is_set = false;

  private java.lang.String TableEnumOrId;

  public java.lang.String getTableEnumOrId() {
    return TableEnumOrId;
  }

  

  public void setTableEnumOrId(java.lang.String TableEnumOrId) {
    this.TableEnumOrId = TableEnumOrId;
    TableEnumOrId__is_set = true;
  }
  
  /**
   * element  : UsageAfterDelete of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UsageAfterDelete__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UsageAfterDelete","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UsageAfterDelete__is_set = false;

  private java.lang.Boolean UsageAfterDelete;

  public java.lang.Boolean getUsageAfterDelete() {
    return UsageAfterDelete;
  }

  

  public void setUsageAfterDelete(java.lang.Boolean UsageAfterDelete) {
    this.UsageAfterDelete = UsageAfterDelete;
    UsageAfterDelete__is_set = true;
  }
  
  /**
   * element  : UsageAfterInsert of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UsageAfterInsert__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UsageAfterInsert","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UsageAfterInsert__is_set = false;

  private java.lang.Boolean UsageAfterInsert;

  public java.lang.Boolean getUsageAfterInsert() {
    return UsageAfterInsert;
  }

  

  public void setUsageAfterInsert(java.lang.Boolean UsageAfterInsert) {
    this.UsageAfterInsert = UsageAfterInsert;
    UsageAfterInsert__is_set = true;
  }
  
  /**
   * element  : UsageAfterUndelete of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UsageAfterUndelete__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UsageAfterUndelete","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UsageAfterUndelete__is_set = false;

  private java.lang.Boolean UsageAfterUndelete;

  public java.lang.Boolean getUsageAfterUndelete() {
    return UsageAfterUndelete;
  }

  

  public void setUsageAfterUndelete(java.lang.Boolean UsageAfterUndelete) {
    this.UsageAfterUndelete = UsageAfterUndelete;
    UsageAfterUndelete__is_set = true;
  }
  
  /**
   * element  : UsageAfterUpdate of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UsageAfterUpdate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UsageAfterUpdate","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UsageAfterUpdate__is_set = false;

  private java.lang.Boolean UsageAfterUpdate;

  public java.lang.Boolean getUsageAfterUpdate() {
    return UsageAfterUpdate;
  }

  

  public void setUsageAfterUpdate(java.lang.Boolean UsageAfterUpdate) {
    this.UsageAfterUpdate = UsageAfterUpdate;
    UsageAfterUpdate__is_set = true;
  }
  
  /**
   * element  : UsageBeforeDelete of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UsageBeforeDelete__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UsageBeforeDelete","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UsageBeforeDelete__is_set = false;

  private java.lang.Boolean UsageBeforeDelete;

  public java.lang.Boolean getUsageBeforeDelete() {
    return UsageBeforeDelete;
  }

  

  public void setUsageBeforeDelete(java.lang.Boolean UsageBeforeDelete) {
    this.UsageBeforeDelete = UsageBeforeDelete;
    UsageBeforeDelete__is_set = true;
  }
  
  /**
   * element  : UsageBeforeInsert of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UsageBeforeInsert__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UsageBeforeInsert","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UsageBeforeInsert__is_set = false;

  private java.lang.Boolean UsageBeforeInsert;

  public java.lang.Boolean getUsageBeforeInsert() {
    return UsageBeforeInsert;
  }

  

  public void setUsageBeforeInsert(java.lang.Boolean UsageBeforeInsert) {
    this.UsageBeforeInsert = UsageBeforeInsert;
    UsageBeforeInsert__is_set = true;
  }
  
  /**
   * element  : UsageBeforeUpdate of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UsageBeforeUpdate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UsageBeforeUpdate","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UsageBeforeUpdate__is_set = false;

  private java.lang.Boolean UsageBeforeUpdate;

  public java.lang.Boolean getUsageBeforeUpdate() {
    return UsageBeforeUpdate;
  }

  

  public void setUsageBeforeUpdate(java.lang.Boolean UsageBeforeUpdate) {
    this.UsageBeforeUpdate = UsageBeforeUpdate;
    UsageBeforeUpdate__is_set = true;
  }
  
  /**
   * element  : UsageIsBulk of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UsageIsBulk__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UsageIsBulk","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UsageIsBulk__is_set = false;

  private java.lang.Boolean UsageIsBulk;

  public java.lang.Boolean getUsageIsBulk() {
    return UsageIsBulk;
  }

  

  public void setUsageIsBulk(java.lang.Boolean UsageIsBulk) {
    this.UsageIsBulk = UsageIsBulk;
    UsageIsBulk__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "ApexTrigger");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, ApiVersion__typeInfo, ApiVersion, ApiVersion__is_set);
    __typeMapper.writeString(__out, Body__typeInfo, Body, Body__is_set);
    __typeMapper.writeObject(__out, BodyCrc__typeInfo, BodyCrc, BodyCrc__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeObject(__out, IsValid__typeInfo, IsValid, IsValid__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, LengthWithoutComments__typeInfo, LengthWithoutComments, LengthWithoutComments__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeString(__out, NamespacePrefix__typeInfo, NamespacePrefix, NamespacePrefix__is_set);
    __typeMapper.writeString(__out, Status__typeInfo, Status, Status__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeString(__out, TableEnumOrId__typeInfo, TableEnumOrId, TableEnumOrId__is_set);
    __typeMapper.writeObject(__out, UsageAfterDelete__typeInfo, UsageAfterDelete, UsageAfterDelete__is_set);
    __typeMapper.writeObject(__out, UsageAfterInsert__typeInfo, UsageAfterInsert, UsageAfterInsert__is_set);
    __typeMapper.writeObject(__out, UsageAfterUndelete__typeInfo, UsageAfterUndelete, UsageAfterUndelete__is_set);
    __typeMapper.writeObject(__out, UsageAfterUpdate__typeInfo, UsageAfterUpdate, UsageAfterUpdate__is_set);
    __typeMapper.writeObject(__out, UsageBeforeDelete__typeInfo, UsageBeforeDelete, UsageBeforeDelete__is_set);
    __typeMapper.writeObject(__out, UsageBeforeInsert__typeInfo, UsageBeforeInsert, UsageBeforeInsert__is_set);
    __typeMapper.writeObject(__out, UsageBeforeUpdate__typeInfo, UsageBeforeUpdate, UsageBeforeUpdate__is_set);
    __typeMapper.writeObject(__out, UsageIsBulk__typeInfo, UsageIsBulk, UsageIsBulk__is_set);
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
    if (__typeMapper.isElement(__in, Body__typeInfo)) {
      setBody((java.lang.String)__typeMapper.readString(__in, Body__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, BodyCrc__typeInfo)) {
      setBodyCrc((java.lang.Double)__typeMapper.readObject(__in, BodyCrc__typeInfo, java.lang.Double.class));
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
    if (__typeMapper.isElement(__in, IsValid__typeInfo)) {
      setIsValid((java.lang.Boolean)__typeMapper.readObject(__in, IsValid__typeInfo, java.lang.Boolean.class));
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
    if (__typeMapper.isElement(__in, LengthWithoutComments__typeInfo)) {
      setLengthWithoutComments((java.lang.Integer)__typeMapper.readObject(__in, LengthWithoutComments__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Name__typeInfo)) {
      setName((java.lang.String)__typeMapper.readString(__in, Name__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, NamespacePrefix__typeInfo)) {
      setNamespacePrefix((java.lang.String)__typeMapper.readString(__in, NamespacePrefix__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, TableEnumOrId__typeInfo)) {
      setTableEnumOrId((java.lang.String)__typeMapper.readString(__in, TableEnumOrId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UsageAfterDelete__typeInfo)) {
      setUsageAfterDelete((java.lang.Boolean)__typeMapper.readObject(__in, UsageAfterDelete__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UsageAfterInsert__typeInfo)) {
      setUsageAfterInsert((java.lang.Boolean)__typeMapper.readObject(__in, UsageAfterInsert__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UsageAfterUndelete__typeInfo)) {
      setUsageAfterUndelete((java.lang.Boolean)__typeMapper.readObject(__in, UsageAfterUndelete__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UsageAfterUpdate__typeInfo)) {
      setUsageAfterUpdate((java.lang.Boolean)__typeMapper.readObject(__in, UsageAfterUpdate__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UsageBeforeDelete__typeInfo)) {
      setUsageBeforeDelete((java.lang.Boolean)__typeMapper.readObject(__in, UsageBeforeDelete__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UsageBeforeInsert__typeInfo)) {
      setUsageBeforeInsert((java.lang.Boolean)__typeMapper.readObject(__in, UsageBeforeInsert__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UsageBeforeUpdate__typeInfo)) {
      setUsageBeforeUpdate((java.lang.Boolean)__typeMapper.readObject(__in, UsageBeforeUpdate__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UsageIsBulk__typeInfo)) {
      setUsageIsBulk((java.lang.Boolean)__typeMapper.readObject(__in, UsageIsBulk__typeInfo, java.lang.Boolean.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[ApexTrigger ");
    sb.append(super.toString());
    sb.append(" ApiVersion=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ApiVersion)+"'\n");
    sb.append(" Body=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Body)+"'\n");
    sb.append(" BodyCrc=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(BodyCrc)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" IsValid=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsValid)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" LengthWithoutComments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LengthWithoutComments)+"'\n");
    sb.append(" Name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");
    sb.append(" NamespacePrefix=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NamespacePrefix)+"'\n");
    sb.append(" Status=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Status)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" TableEnumOrId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TableEnumOrId)+"'\n");
    sb.append(" UsageAfterDelete=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UsageAfterDelete)+"'\n");
    sb.append(" UsageAfterInsert=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UsageAfterInsert)+"'\n");
    sb.append(" UsageAfterUndelete=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UsageAfterUndelete)+"'\n");
    sb.append(" UsageAfterUpdate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UsageAfterUpdate)+"'\n");
    sb.append(" UsageBeforeDelete=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UsageBeforeDelete)+"'\n");
    sb.append(" UsageBeforeInsert=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UsageBeforeInsert)+"'\n");
    sb.append(" UsageBeforeUpdate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UsageBeforeUpdate)+"'\n");
    sb.append(" UsageIsBulk=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UsageIsBulk)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}