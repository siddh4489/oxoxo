package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class AttachedContentNote extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public AttachedContentNote() {
  }
    
  
  /**
   * element  : ContentDocument of type {urn:sobject.enterprise.soap.sforce.com}ContentDocument
   * java type: com.sforce.soap.enterprise.sobject.ContentDocument
   */
  private static final com.sforce.ws.bind.TypeInfo ContentDocument__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ContentDocument","urn:sobject.enterprise.soap.sforce.com","ContentDocument",0,1,true);

  private boolean ContentDocument__is_set = false;

  private com.sforce.soap.enterprise.sobject.ContentDocument ContentDocument;

  public com.sforce.soap.enterprise.sobject.ContentDocument getContentDocument() {
    return ContentDocument;
  }

  

  public void setContentDocument(com.sforce.soap.enterprise.sobject.ContentDocument ContentDocument) {
    this.ContentDocument = ContentDocument;
    ContentDocument__is_set = true;
  }
  
  /**
   * element  : ContentDocumentId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ContentDocumentId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ContentDocumentId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ContentDocumentId__is_set = false;

  private java.lang.String ContentDocumentId;

  public java.lang.String getContentDocumentId() {
    return ContentDocumentId;
  }

  

  public void setContentDocumentId(java.lang.String ContentDocumentId) {
    this.ContentDocumentId = ContentDocumentId;
    ContentDocumentId__is_set = true;
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
   * element  : LinkedEntity of type {urn:sobject.enterprise.soap.sforce.com}Contract
   * java type: com.sforce.soap.enterprise.sobject.Contract
   */
  private static final com.sforce.ws.bind.TypeInfo LinkedEntity__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LinkedEntity","urn:sobject.enterprise.soap.sforce.com","Contract",0,1,true);

  private boolean LinkedEntity__is_set = false;

  private com.sforce.soap.enterprise.sobject.Contract LinkedEntity;

  public com.sforce.soap.enterprise.sobject.Contract getLinkedEntity() {
    return LinkedEntity;
  }

  

  public void setLinkedEntity(com.sforce.soap.enterprise.sobject.Contract LinkedEntity) {
    this.LinkedEntity = LinkedEntity;
    LinkedEntity__is_set = true;
  }
  
  /**
   * element  : LinkedEntityId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LinkedEntityId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LinkedEntityId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean LinkedEntityId__is_set = false;

  private java.lang.String LinkedEntityId;

  public java.lang.String getLinkedEntityId() {
    return LinkedEntityId;
  }

  

  public void setLinkedEntityId(java.lang.String LinkedEntityId) {
    this.LinkedEntityId = LinkedEntityId;
    LinkedEntityId__is_set = true;
  }
  
  /**
   * element  : TextPreview of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo TextPreview__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TextPreview","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean TextPreview__is_set = false;

  private java.lang.String TextPreview;

  public java.lang.String getTextPreview() {
    return TextPreview;
  }

  

  public void setTextPreview(java.lang.String TextPreview) {
    this.TextPreview = TextPreview;
    TextPreview__is_set = true;
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
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "AttachedContentNote");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, ContentDocument__typeInfo, ContentDocument, ContentDocument__is_set);
    __typeMapper.writeString(__out, ContentDocumentId__typeInfo, ContentDocumentId, ContentDocumentId__is_set);
    __typeMapper.writeObject(__out, ContentSize__typeInfo, ContentSize, ContentSize__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, FileExtension__typeInfo, FileExtension, FileExtension__is_set);
    __typeMapper.writeString(__out, FileType__typeInfo, FileType, FileType__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, LinkedEntity__typeInfo, LinkedEntity, LinkedEntity__is_set);
    __typeMapper.writeString(__out, LinkedEntityId__typeInfo, LinkedEntityId, LinkedEntityId__is_set);
    __typeMapper.writeString(__out, TextPreview__typeInfo, TextPreview, TextPreview__is_set);
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
    if (__typeMapper.isElement(__in, ContentDocument__typeInfo)) {
      setContentDocument((com.sforce.soap.enterprise.sobject.ContentDocument)__typeMapper.readObject(__in, ContentDocument__typeInfo, com.sforce.soap.enterprise.sobject.ContentDocument.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ContentDocumentId__typeInfo)) {
      setContentDocumentId((java.lang.String)__typeMapper.readString(__in, ContentDocumentId__typeInfo, java.lang.String.class));
    }
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
    if (__typeMapper.isElement(__in, LinkedEntity__typeInfo)) {
      setLinkedEntity((com.sforce.soap.enterprise.sobject.Contract)__typeMapper.readObject(__in, LinkedEntity__typeInfo, com.sforce.soap.enterprise.sobject.Contract.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LinkedEntityId__typeInfo)) {
      setLinkedEntityId((java.lang.String)__typeMapper.readString(__in, LinkedEntityId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TextPreview__typeInfo)) {
      setTextPreview((java.lang.String)__typeMapper.readString(__in, TextPreview__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Title__typeInfo)) {
      setTitle((java.lang.String)__typeMapper.readString(__in, Title__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[AttachedContentNote ");
    sb.append(super.toString());
    sb.append(" ContentDocument=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContentDocument)+"'\n");
    sb.append(" ContentDocumentId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContentDocumentId)+"'\n");
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
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" LinkedEntity=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LinkedEntity)+"'\n");
    sb.append(" LinkedEntityId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LinkedEntityId)+"'\n");
    sb.append(" TextPreview=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TextPreview)+"'\n");
    sb.append(" Title=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Title)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}