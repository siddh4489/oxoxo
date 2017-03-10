package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class MailmergeTemplate extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public MailmergeTemplate() {
  }
    
  
  /**
   * element  : Body of type {http://www.w3.org/2001/XMLSchema}base64Binary
   * java type: byte[]
   */
  private static final com.sforce.ws.bind.TypeInfo Body__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Body","http://www.w3.org/2001/XMLSchema","base64Binary",0,1,true);

  private boolean Body__is_set = false;

  private byte[] Body;

  public byte[] getBody() {
    return Body;
  }

  

  public void setBody(byte[] Body) {
    this.Body = Body;
    Body__is_set = true;
  }
  
  /**
   * element  : BodyLength of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo BodyLength__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","BodyLength","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean BodyLength__is_set = false;

  private java.lang.Integer BodyLength;

  public java.lang.Integer getBodyLength() {
    return BodyLength;
  }

  

  public void setBodyLength(java.lang.Integer BodyLength) {
    this.BodyLength = BodyLength;
    BodyLength__is_set = true;
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
   * element  : Description of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Description__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Description","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Description__is_set = false;

  private java.lang.String Description;

  public java.lang.String getDescription() {
    return Description;
  }

  

  public void setDescription(java.lang.String Description) {
    this.Description = Description;
    Description__is_set = true;
  }
  
  /**
   * element  : Filename of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Filename__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Filename","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Filename__is_set = false;

  private java.lang.String Filename;

  public java.lang.String getFilename() {
    return Filename;
  }

  

  public void setFilename(java.lang.String Filename) {
    this.Filename = Filename;
    Filename__is_set = true;
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
   * element  : LastUsedDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo LastUsedDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastUsedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean LastUsedDate__is_set = false;

  private java.util.Calendar LastUsedDate;

  public java.util.Calendar getLastUsedDate() {
    return LastUsedDate;
  }

  

  public void setLastUsedDate(java.util.Calendar LastUsedDate) {
    this.LastUsedDate = LastUsedDate;
    LastUsedDate__is_set = true;
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
   * element  : SecurityOptionsAttachmentHasFlash of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo SecurityOptionsAttachmentHasFlash__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SecurityOptionsAttachmentHasFlash","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean SecurityOptionsAttachmentHasFlash__is_set = false;

  private java.lang.Boolean SecurityOptionsAttachmentHasFlash;

  public java.lang.Boolean getSecurityOptionsAttachmentHasFlash() {
    return SecurityOptionsAttachmentHasFlash;
  }

  

  public void setSecurityOptionsAttachmentHasFlash(java.lang.Boolean SecurityOptionsAttachmentHasFlash) {
    this.SecurityOptionsAttachmentHasFlash = SecurityOptionsAttachmentHasFlash;
    SecurityOptionsAttachmentHasFlash__is_set = true;
  }
  
  /**
   * element  : SecurityOptionsAttachmentHasXSSThreat of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo SecurityOptionsAttachmentHasXSSThreat__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SecurityOptionsAttachmentHasXSSThreat","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean SecurityOptionsAttachmentHasXSSThreat__is_set = false;

  private java.lang.Boolean SecurityOptionsAttachmentHasXSSThreat;

  public java.lang.Boolean getSecurityOptionsAttachmentHasXSSThreat() {
    return SecurityOptionsAttachmentHasXSSThreat;
  }

  

  public void setSecurityOptionsAttachmentHasXSSThreat(java.lang.Boolean SecurityOptionsAttachmentHasXSSThreat) {
    this.SecurityOptionsAttachmentHasXSSThreat = SecurityOptionsAttachmentHasXSSThreat;
    SecurityOptionsAttachmentHasXSSThreat__is_set = true;
  }
  
  /**
   * element  : SecurityOptionsAttachmentScannedForXSS of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo SecurityOptionsAttachmentScannedForXSS__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SecurityOptionsAttachmentScannedForXSS","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean SecurityOptionsAttachmentScannedForXSS__is_set = false;

  private java.lang.Boolean SecurityOptionsAttachmentScannedForXSS;

  public java.lang.Boolean getSecurityOptionsAttachmentScannedForXSS() {
    return SecurityOptionsAttachmentScannedForXSS;
  }

  

  public void setSecurityOptionsAttachmentScannedForXSS(java.lang.Boolean SecurityOptionsAttachmentScannedForXSS) {
    this.SecurityOptionsAttachmentScannedForXSS = SecurityOptionsAttachmentScannedForXSS;
    SecurityOptionsAttachmentScannedForXSS__is_set = true;
  }
  
  /**
   * element  : SecurityOptionsAttachmentScannedforFlash of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo SecurityOptionsAttachmentScannedforFlash__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SecurityOptionsAttachmentScannedforFlash","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean SecurityOptionsAttachmentScannedforFlash__is_set = false;

  private java.lang.Boolean SecurityOptionsAttachmentScannedforFlash;

  public java.lang.Boolean getSecurityOptionsAttachmentScannedforFlash() {
    return SecurityOptionsAttachmentScannedforFlash;
  }

  

  public void setSecurityOptionsAttachmentScannedforFlash(java.lang.Boolean SecurityOptionsAttachmentScannedforFlash) {
    this.SecurityOptionsAttachmentScannedforFlash = SecurityOptionsAttachmentScannedforFlash;
    SecurityOptionsAttachmentScannedforFlash__is_set = true;
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
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "MailmergeTemplate");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, Body__typeInfo, Body, Body__is_set);
    __typeMapper.writeObject(__out, BodyLength__typeInfo, BodyLength, BodyLength__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, Description__typeInfo, Description, Description__is_set);
    __typeMapper.writeString(__out, Filename__typeInfo, Filename, Filename__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, LastUsedDate__typeInfo, LastUsedDate, LastUsedDate__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeObject(__out, SecurityOptionsAttachmentHasFlash__typeInfo, SecurityOptionsAttachmentHasFlash, SecurityOptionsAttachmentHasFlash__is_set);
    __typeMapper.writeObject(__out, SecurityOptionsAttachmentHasXSSThreat__typeInfo, SecurityOptionsAttachmentHasXSSThreat, SecurityOptionsAttachmentHasXSSThreat__is_set);
    __typeMapper.writeObject(__out, SecurityOptionsAttachmentScannedForXSS__typeInfo, SecurityOptionsAttachmentScannedForXSS, SecurityOptionsAttachmentScannedForXSS__is_set);
    __typeMapper.writeObject(__out, SecurityOptionsAttachmentScannedforFlash__typeInfo, SecurityOptionsAttachmentScannedforFlash, SecurityOptionsAttachmentScannedforFlash__is_set);
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
    if (__typeMapper.isElement(__in, Body__typeInfo)) {
      setBody((byte[])__typeMapper.readObject(__in, Body__typeInfo, byte[].class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, BodyLength__typeInfo)) {
      setBodyLength((java.lang.Integer)__typeMapper.readObject(__in, BodyLength__typeInfo, java.lang.Integer.class));
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
    if (__typeMapper.isElement(__in, Description__typeInfo)) {
      setDescription((java.lang.String)__typeMapper.readString(__in, Description__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Filename__typeInfo)) {
      setFilename((java.lang.String)__typeMapper.readString(__in, Filename__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, LastUsedDate__typeInfo)) {
      setLastUsedDate((java.util.Calendar)__typeMapper.readObject(__in, LastUsedDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Name__typeInfo)) {
      setName((java.lang.String)__typeMapper.readString(__in, Name__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SecurityOptionsAttachmentHasFlash__typeInfo)) {
      setSecurityOptionsAttachmentHasFlash((java.lang.Boolean)__typeMapper.readObject(__in, SecurityOptionsAttachmentHasFlash__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SecurityOptionsAttachmentHasXSSThreat__typeInfo)) {
      setSecurityOptionsAttachmentHasXSSThreat((java.lang.Boolean)__typeMapper.readObject(__in, SecurityOptionsAttachmentHasXSSThreat__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SecurityOptionsAttachmentScannedForXSS__typeInfo)) {
      setSecurityOptionsAttachmentScannedForXSS((java.lang.Boolean)__typeMapper.readObject(__in, SecurityOptionsAttachmentScannedForXSS__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SecurityOptionsAttachmentScannedforFlash__typeInfo)) {
      setSecurityOptionsAttachmentScannedforFlash((java.lang.Boolean)__typeMapper.readObject(__in, SecurityOptionsAttachmentScannedforFlash__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[MailmergeTemplate ");
    sb.append(super.toString());
    sb.append(" Body=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Body)+"'\n");
    sb.append(" BodyLength=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(BodyLength)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" Description=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Description)+"'\n");
    sb.append(" Filename=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Filename)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" LastUsedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastUsedDate)+"'\n");
    sb.append(" Name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");
    sb.append(" SecurityOptionsAttachmentHasFlash=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SecurityOptionsAttachmentHasFlash)+"'\n");
    sb.append(" SecurityOptionsAttachmentHasXSSThreat=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SecurityOptionsAttachmentHasXSSThreat)+"'\n");
    sb.append(" SecurityOptionsAttachmentScannedForXSS=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SecurityOptionsAttachmentScannedForXSS)+"'\n");
    sb.append(" SecurityOptionsAttachmentScannedforFlash=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SecurityOptionsAttachmentScannedforFlash)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}