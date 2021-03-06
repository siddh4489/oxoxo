package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class ContentFolderItem extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public ContentFolderItem() {
  }
    
  
  /**
   * element  : ContentSize of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo ContentSize__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ContentSize","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean ContentSize__is_set = false;

  private java.lang.Integer ContentSize;

  public java.lang.Integer getContentSize() {
    return ContentSize;
  }

  

  public void setContentSize(java.lang.Integer ContentSize) {
    this.ContentSize = ContentSize;
    ContentSize__is_set = true;
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
   * element  : FileExtension of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo FileExtension__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FileExtension","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean FileExtension__is_set = false;

  private java.lang.String FileExtension;

  public java.lang.String getFileExtension() {
    return FileExtension;
  }

  

  public void setFileExtension(java.lang.String FileExtension) {
    this.FileExtension = FileExtension;
    FileExtension__is_set = true;
  }
  
  /**
   * element  : FileType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo FileType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FileType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean FileType__is_set = false;

  private java.lang.String FileType;

  public java.lang.String getFileType() {
    return FileType;
  }

  

  public void setFileType(java.lang.String FileType) {
    this.FileType = FileType;
    FileType__is_set = true;
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
   * element  : IsFolder of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsFolder__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsFolder","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsFolder__is_set = false;

  private java.lang.Boolean IsFolder;

  public java.lang.Boolean getIsFolder() {
    return IsFolder;
  }

  

  public void setIsFolder(java.lang.Boolean IsFolder) {
    this.IsFolder = IsFolder;
    IsFolder__is_set = true;
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
   * element  : ParentContentFolder of type {urn:sobject.enterprise.soap.sforce.com}ContentFolder
   * java type: com.sforce.soap.enterprise.sobject.ContentFolder
   */
  private static final com.sforce.ws.bind.TypeInfo ParentContentFolder__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ParentContentFolder","urn:sobject.enterprise.soap.sforce.com","ContentFolder",0,1,true);

  private boolean ParentContentFolder__is_set = false;

  private com.sforce.soap.enterprise.sobject.ContentFolder ParentContentFolder;

  public com.sforce.soap.enterprise.sobject.ContentFolder getParentContentFolder() {
    return ParentContentFolder;
  }

  

  public void setParentContentFolder(com.sforce.soap.enterprise.sobject.ContentFolder ParentContentFolder) {
    this.ParentContentFolder = ParentContentFolder;
    ParentContentFolder__is_set = true;
  }
  
  /**
   * element  : ParentContentFolderId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ParentContentFolderId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ParentContentFolderId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ParentContentFolderId__is_set = false;

  private java.lang.String ParentContentFolderId;

  public java.lang.String getParentContentFolderId() {
    return ParentContentFolderId;
  }

  

  public void setParentContentFolderId(java.lang.String ParentContentFolderId) {
    this.ParentContentFolderId = ParentContentFolderId;
    ParentContentFolderId__is_set = true;
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
   * element  : Title of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Title__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Title","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Title__is_set = false;

  private java.lang.String Title;

  public java.lang.String getTitle() {
    return Title;
  }

  

  public void setTitle(java.lang.String Title) {
    this.Title = Title;
    Title__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "ContentFolderItem");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, ContentSize__typeInfo, ContentSize, ContentSize__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, FileExtension__typeInfo, FileExtension, FileExtension__is_set);
    __typeMapper.writeString(__out, FileType__typeInfo, FileType, FileType__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, IsFolder__typeInfo, IsFolder, IsFolder__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, ParentContentFolder__typeInfo, ParentContentFolder, ParentContentFolder__is_set);
    __typeMapper.writeString(__out, ParentContentFolderId__typeInfo, ParentContentFolderId, ParentContentFolderId__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeString(__out, Title__typeInfo, Title, Title__is_set);
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
    if (__typeMapper.isElement(__in, ContentSize__typeInfo)) {
      setContentSize((java.lang.Integer)__typeMapper.readObject(__in, ContentSize__typeInfo, java.lang.Integer.class));
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
    if (__typeMapper.isElement(__in, FileExtension__typeInfo)) {
      setFileExtension((java.lang.String)__typeMapper.readString(__in, FileExtension__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FileType__typeInfo)) {
      setFileType((java.lang.String)__typeMapper.readString(__in, FileType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {
      setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, IsDeleted__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsFolder__typeInfo)) {
      setIsFolder((java.lang.Boolean)__typeMapper.readObject(__in, IsFolder__typeInfo, java.lang.Boolean.class));
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
    if (__typeMapper.isElement(__in, ParentContentFolder__typeInfo)) {
      setParentContentFolder((com.sforce.soap.enterprise.sobject.ContentFolder)__typeMapper.readObject(__in, ParentContentFolder__typeInfo, com.sforce.soap.enterprise.sobject.ContentFolder.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ParentContentFolderId__typeInfo)) {
      setParentContentFolderId((java.lang.String)__typeMapper.readString(__in, ParentContentFolderId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Title__typeInfo)) {
      setTitle((java.lang.String)__typeMapper.readString(__in, Title__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[ContentFolderItem ");
    sb.append(super.toString());
    sb.append(" ContentSize=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContentSize)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" FileExtension=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FileExtension)+"'\n");
    sb.append(" FileType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FileType)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" IsFolder=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsFolder)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" ParentContentFolder=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ParentContentFolder)+"'\n");
    sb.append(" ParentContentFolderId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ParentContentFolderId)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" Title=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Title)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}