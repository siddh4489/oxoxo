package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class ObjectPermissions extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public ObjectPermissions() {
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
   * element  : Parent of type {urn:sobject.enterprise.soap.sforce.com}PermissionSet
   * java type: com.sforce.soap.enterprise.sobject.PermissionSet
   */
  private static final com.sforce.ws.bind.TypeInfo Parent__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Parent","urn:sobject.enterprise.soap.sforce.com","PermissionSet",0,1,true);

  private boolean Parent__is_set = false;

  private com.sforce.soap.enterprise.sobject.PermissionSet Parent;

  public com.sforce.soap.enterprise.sobject.PermissionSet getParent() {
    return Parent;
  }

  

  public void setParent(com.sforce.soap.enterprise.sobject.PermissionSet Parent) {
    this.Parent = Parent;
    Parent__is_set = true;
  }
  
  /**
   * element  : ParentId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ParentId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ParentId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ParentId__is_set = false;

  private java.lang.String ParentId;

  public java.lang.String getParentId() {
    return ParentId;
  }

  

  public void setParentId(java.lang.String ParentId) {
    this.ParentId = ParentId;
    ParentId__is_set = true;
  }
  
  /**
   * element  : PermissionsCreate of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsCreate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsCreate","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsCreate__is_set = false;

  private java.lang.Boolean PermissionsCreate;

  public java.lang.Boolean getPermissionsCreate() {
    return PermissionsCreate;
  }

  

  public void setPermissionsCreate(java.lang.Boolean PermissionsCreate) {
    this.PermissionsCreate = PermissionsCreate;
    PermissionsCreate__is_set = true;
  }
  
  /**
   * element  : PermissionsDelete of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsDelete__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsDelete","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsDelete__is_set = false;

  private java.lang.Boolean PermissionsDelete;

  public java.lang.Boolean getPermissionsDelete() {
    return PermissionsDelete;
  }

  

  public void setPermissionsDelete(java.lang.Boolean PermissionsDelete) {
    this.PermissionsDelete = PermissionsDelete;
    PermissionsDelete__is_set = true;
  }
  
  /**
   * element  : PermissionsEdit of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsEdit__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsEdit","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsEdit__is_set = false;

  private java.lang.Boolean PermissionsEdit;

  public java.lang.Boolean getPermissionsEdit() {
    return PermissionsEdit;
  }

  

  public void setPermissionsEdit(java.lang.Boolean PermissionsEdit) {
    this.PermissionsEdit = PermissionsEdit;
    PermissionsEdit__is_set = true;
  }
  
  /**
   * element  : PermissionsModifyAllRecords of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsModifyAllRecords__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsModifyAllRecords","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsModifyAllRecords__is_set = false;

  private java.lang.Boolean PermissionsModifyAllRecords;

  public java.lang.Boolean getPermissionsModifyAllRecords() {
    return PermissionsModifyAllRecords;
  }

  

  public void setPermissionsModifyAllRecords(java.lang.Boolean PermissionsModifyAllRecords) {
    this.PermissionsModifyAllRecords = PermissionsModifyAllRecords;
    PermissionsModifyAllRecords__is_set = true;
  }
  
  /**
   * element  : PermissionsRead of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsRead__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsRead","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsRead__is_set = false;

  private java.lang.Boolean PermissionsRead;

  public java.lang.Boolean getPermissionsRead() {
    return PermissionsRead;
  }

  

  public void setPermissionsRead(java.lang.Boolean PermissionsRead) {
    this.PermissionsRead = PermissionsRead;
    PermissionsRead__is_set = true;
  }
  
  /**
   * element  : PermissionsViewAllRecords of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsViewAllRecords__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsViewAllRecords","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsViewAllRecords__is_set = false;

  private java.lang.Boolean PermissionsViewAllRecords;

  public java.lang.Boolean getPermissionsViewAllRecords() {
    return PermissionsViewAllRecords;
  }

  

  public void setPermissionsViewAllRecords(java.lang.Boolean PermissionsViewAllRecords) {
    this.PermissionsViewAllRecords = PermissionsViewAllRecords;
    PermissionsViewAllRecords__is_set = true;
  }
  
  /**
   * element  : SobjectType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo SobjectType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SobjectType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean SobjectType__is_set = false;

  private java.lang.String SobjectType;

  public java.lang.String getSobjectType() {
    return SobjectType;
  }

  

  public void setSobjectType(java.lang.String SobjectType) {
    this.SobjectType = SobjectType;
    SobjectType__is_set = true;
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
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "ObjectPermissions");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, Parent__typeInfo, Parent, Parent__is_set);
    __typeMapper.writeString(__out, ParentId__typeInfo, ParentId, ParentId__is_set);
    __typeMapper.writeObject(__out, PermissionsCreate__typeInfo, PermissionsCreate, PermissionsCreate__is_set);
    __typeMapper.writeObject(__out, PermissionsDelete__typeInfo, PermissionsDelete, PermissionsDelete__is_set);
    __typeMapper.writeObject(__out, PermissionsEdit__typeInfo, PermissionsEdit, PermissionsEdit__is_set);
    __typeMapper.writeObject(__out, PermissionsModifyAllRecords__typeInfo, PermissionsModifyAllRecords, PermissionsModifyAllRecords__is_set);
    __typeMapper.writeObject(__out, PermissionsRead__typeInfo, PermissionsRead, PermissionsRead__is_set);
    __typeMapper.writeObject(__out, PermissionsViewAllRecords__typeInfo, PermissionsViewAllRecords, PermissionsViewAllRecords__is_set);
    __typeMapper.writeString(__out, SobjectType__typeInfo, SobjectType, SobjectType__is_set);
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
    if (__typeMapper.isElement(__in, Parent__typeInfo)) {
      setParent((com.sforce.soap.enterprise.sobject.PermissionSet)__typeMapper.readObject(__in, Parent__typeInfo, com.sforce.soap.enterprise.sobject.PermissionSet.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ParentId__typeInfo)) {
      setParentId((java.lang.String)__typeMapper.readString(__in, ParentId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsCreate__typeInfo)) {
      setPermissionsCreate((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsCreate__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsDelete__typeInfo)) {
      setPermissionsDelete((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsDelete__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsEdit__typeInfo)) {
      setPermissionsEdit((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsEdit__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsModifyAllRecords__typeInfo)) {
      setPermissionsModifyAllRecords((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsModifyAllRecords__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsRead__typeInfo)) {
      setPermissionsRead((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsRead__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsViewAllRecords__typeInfo)) {
      setPermissionsViewAllRecords((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsViewAllRecords__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SobjectType__typeInfo)) {
      setSobjectType((java.lang.String)__typeMapper.readString(__in, SobjectType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[ObjectPermissions ");
    sb.append(super.toString());
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" Parent=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Parent)+"'\n");
    sb.append(" ParentId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ParentId)+"'\n");
    sb.append(" PermissionsCreate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsCreate)+"'\n");
    sb.append(" PermissionsDelete=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsDelete)+"'\n");
    sb.append(" PermissionsEdit=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsEdit)+"'\n");
    sb.append(" PermissionsModifyAllRecords=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsModifyAllRecords)+"'\n");
    sb.append(" PermissionsRead=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsRead)+"'\n");
    sb.append(" PermissionsViewAllRecords=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsViewAllRecords)+"'\n");
    sb.append(" SobjectType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SobjectType)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}