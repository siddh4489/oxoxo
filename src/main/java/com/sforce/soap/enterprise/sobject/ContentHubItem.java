package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class ContentHubItem extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public ContentHubItem() {
  }
    
  
  /**
   * element  : ContentHubRepository of type {urn:sobject.enterprise.soap.sforce.com}ContentHubRepository
   * java type: com.sforce.soap.enterprise.sobject.ContentHubRepository
   */
  private static final com.sforce.ws.bind.TypeInfo ContentHubRepository__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ContentHubRepository","urn:sobject.enterprise.soap.sforce.com","ContentHubRepository",0,1,true);

  private boolean ContentHubRepository__is_set = false;

  private com.sforce.soap.enterprise.sobject.ContentHubRepository ContentHubRepository;

  public com.sforce.soap.enterprise.sobject.ContentHubRepository getContentHubRepository() {
    return ContentHubRepository;
  }

  

  public void setContentHubRepository(com.sforce.soap.enterprise.sobject.ContentHubRepository ContentHubRepository) {
    this.ContentHubRepository = ContentHubRepository;
    ContentHubRepository__is_set = true;
  }
  
  /**
   * element  : ContentHubRepositoryId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ContentHubRepositoryId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ContentHubRepositoryId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ContentHubRepositoryId__is_set = false;

  private java.lang.String ContentHubRepositoryId;

  public java.lang.String getContentHubRepositoryId() {
    return ContentHubRepositoryId;
  }

  

  public void setContentHubRepositoryId(java.lang.String ContentHubRepositoryId) {
    this.ContentHubRepositoryId = ContentHubRepositoryId;
    ContentHubRepositoryId__is_set = true;
  }
  
  /**
   * element  : ContentModifiedDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo ContentModifiedDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ContentModifiedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean ContentModifiedDate__is_set = false;

  private java.util.Calendar ContentModifiedDate;

  public java.util.Calendar getContentModifiedDate() {
    return ContentModifiedDate;
  }

  

  public void setContentModifiedDate(java.util.Calendar ContentModifiedDate) {
    this.ContentModifiedDate = ContentModifiedDate;
    ContentModifiedDate__is_set = true;
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
   * element  : ExternalContentUrl of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ExternalContentUrl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ExternalContentUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ExternalContentUrl__is_set = false;

  private java.lang.String ExternalContentUrl;

  public java.lang.String getExternalContentUrl() {
    return ExternalContentUrl;
  }

  

  public void setExternalContentUrl(java.lang.String ExternalContentUrl) {
    this.ExternalContentUrl = ExternalContentUrl;
    ExternalContentUrl__is_set = true;
  }
  
  /**
   * element  : ExternalDocumentUrl of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ExternalDocumentUrl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ExternalDocumentUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ExternalDocumentUrl__is_set = false;

  private java.lang.String ExternalDocumentUrl;

  public java.lang.String getExternalDocumentUrl() {
    return ExternalDocumentUrl;
  }

  

  public void setExternalDocumentUrl(java.lang.String ExternalDocumentUrl) {
    this.ExternalDocumentUrl = ExternalDocumentUrl;
    ExternalDocumentUrl__is_set = true;
  }
  
  /**
   * element  : ExternalId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ExternalId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ExternalId","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ExternalId__is_set = false;

  private java.lang.String ExternalId;

  public java.lang.String getExternalId() {
    return ExternalId;
  }

  

  public void setExternalId(java.lang.String ExternalId) {
    this.ExternalId = ExternalId;
    ExternalId__is_set = true;
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
   * element  : MimeType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo MimeType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MimeType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean MimeType__is_set = false;

  private java.lang.String MimeType;

  public java.lang.String getMimeType() {
    return MimeType;
  }

  

  public void setMimeType(java.lang.String MimeType) {
    this.MimeType = MimeType;
    MimeType__is_set = true;
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
   * element  : Owner of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Owner__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Owner","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Owner__is_set = false;

  private java.lang.String Owner;

  public java.lang.String getOwner() {
    return Owner;
  }

  

  public void setOwner(java.lang.String Owner) {
    this.Owner = Owner;
    Owner__is_set = true;
  }
  
  /**
   * element  : ParentId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ParentId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ParentId","http://www.w3.org/2001/XMLSchema","string",0,1,true);

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
   * element  : UpdatedBy of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo UpdatedBy__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UpdatedBy","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean UpdatedBy__is_set = false;

  private java.lang.String UpdatedBy;

  public java.lang.String getUpdatedBy() {
    return UpdatedBy;
  }

  

  public void setUpdatedBy(java.lang.String UpdatedBy) {
    this.UpdatedBy = UpdatedBy;
    UpdatedBy__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "ContentHubItem");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, ContentHubRepository__typeInfo, ContentHubRepository, ContentHubRepository__is_set);
    __typeMapper.writeString(__out, ContentHubRepositoryId__typeInfo, ContentHubRepositoryId, ContentHubRepositoryId__is_set);
    __typeMapper.writeObject(__out, ContentModifiedDate__typeInfo, ContentModifiedDate, ContentModifiedDate__is_set);
    __typeMapper.writeObject(__out, ContentSize__typeInfo, ContentSize, ContentSize__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, Description__typeInfo, Description, Description__is_set);
    __typeMapper.writeString(__out, ExternalContentUrl__typeInfo, ExternalContentUrl, ExternalContentUrl__is_set);
    __typeMapper.writeString(__out, ExternalDocumentUrl__typeInfo, ExternalDocumentUrl, ExternalDocumentUrl__is_set);
    __typeMapper.writeString(__out, ExternalId__typeInfo, ExternalId, ExternalId__is_set);
    __typeMapper.writeString(__out, FileExtension__typeInfo, FileExtension, FileExtension__is_set);
    __typeMapper.writeString(__out, FileType__typeInfo, FileType, FileType__is_set);
    __typeMapper.writeObject(__out, IsFolder__typeInfo, IsFolder, IsFolder__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeString(__out, MimeType__typeInfo, MimeType, MimeType__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeString(__out, Owner__typeInfo, Owner, Owner__is_set);
    __typeMapper.writeString(__out, ParentId__typeInfo, ParentId, ParentId__is_set);
    __typeMapper.writeString(__out, Title__typeInfo, Title, Title__is_set);
    __typeMapper.writeString(__out, UpdatedBy__typeInfo, UpdatedBy, UpdatedBy__is_set);
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
    if (__typeMapper.isElement(__in, ContentHubRepository__typeInfo)) {
      setContentHubRepository((com.sforce.soap.enterprise.sobject.ContentHubRepository)__typeMapper.readObject(__in, ContentHubRepository__typeInfo, com.sforce.soap.enterprise.sobject.ContentHubRepository.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ContentHubRepositoryId__typeInfo)) {
      setContentHubRepositoryId((java.lang.String)__typeMapper.readString(__in, ContentHubRepositoryId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ContentModifiedDate__typeInfo)) {
      setContentModifiedDate((java.util.Calendar)__typeMapper.readObject(__in, ContentModifiedDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ContentSize__typeInfo)) {
      setContentSize((java.lang.Integer)__typeMapper.readObject(__in, ContentSize__typeInfo, java.lang.Integer.class));
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
    if (__typeMapper.isElement(__in, ExternalContentUrl__typeInfo)) {
      setExternalContentUrl((java.lang.String)__typeMapper.readString(__in, ExternalContentUrl__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ExternalDocumentUrl__typeInfo)) {
      setExternalDocumentUrl((java.lang.String)__typeMapper.readString(__in, ExternalDocumentUrl__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ExternalId__typeInfo)) {
      setExternalId((java.lang.String)__typeMapper.readString(__in, ExternalId__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, IsFolder__typeInfo)) {
      setIsFolder((java.lang.Boolean)__typeMapper.readObject(__in, IsFolder__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LastModifiedDate__typeInfo)) {
      setLastModifiedDate((java.util.Calendar)__typeMapper.readObject(__in, LastModifiedDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MimeType__typeInfo)) {
      setMimeType((java.lang.String)__typeMapper.readString(__in, MimeType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Name__typeInfo)) {
      setName((java.lang.String)__typeMapper.readString(__in, Name__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Owner__typeInfo)) {
      setOwner((java.lang.String)__typeMapper.readString(__in, Owner__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ParentId__typeInfo)) {
      setParentId((java.lang.String)__typeMapper.readString(__in, ParentId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Title__typeInfo)) {
      setTitle((java.lang.String)__typeMapper.readString(__in, Title__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UpdatedBy__typeInfo)) {
      setUpdatedBy((java.lang.String)__typeMapper.readString(__in, UpdatedBy__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[ContentHubItem ");
    sb.append(super.toString());
    sb.append(" ContentHubRepository=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContentHubRepository)+"'\n");
    sb.append(" ContentHubRepositoryId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContentHubRepositoryId)+"'\n");
    sb.append(" ContentModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContentModifiedDate)+"'\n");
    sb.append(" ContentSize=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContentSize)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" Description=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Description)+"'\n");
    sb.append(" ExternalContentUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ExternalContentUrl)+"'\n");
    sb.append(" ExternalDocumentUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ExternalDocumentUrl)+"'\n");
    sb.append(" ExternalId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ExternalId)+"'\n");
    sb.append(" FileExtension=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FileExtension)+"'\n");
    sb.append(" FileType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FileType)+"'\n");
    sb.append(" IsFolder=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsFolder)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" MimeType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MimeType)+"'\n");
    sb.append(" Name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");
    sb.append(" Owner=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Owner)+"'\n");
    sb.append(" ParentId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ParentId)+"'\n");
    sb.append(" Title=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Title)+"'\n");
    sb.append(" UpdatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UpdatedBy)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}