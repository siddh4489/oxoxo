package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class EmailTemplate extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public EmailTemplate() {
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
   * element  : AttachedContentDocuments of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo AttachedContentDocuments__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AttachedContentDocuments","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean AttachedContentDocuments__is_set = false;

  private com.sforce.soap.enterprise.QueryResult AttachedContentDocuments;

  public com.sforce.soap.enterprise.QueryResult getAttachedContentDocuments() {
    return AttachedContentDocuments;
  }

  

  public void setAttachedContentDocuments(com.sforce.soap.enterprise.QueryResult AttachedContentDocuments) {
    this.AttachedContentDocuments = AttachedContentDocuments;
    AttachedContentDocuments__is_set = true;
  }
  
  /**
   * element  : AttachedContentNotes of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo AttachedContentNotes__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AttachedContentNotes","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean AttachedContentNotes__is_set = false;

  private com.sforce.soap.enterprise.QueryResult AttachedContentNotes;

  public com.sforce.soap.enterprise.QueryResult getAttachedContentNotes() {
    return AttachedContentNotes;
  }

  

  public void setAttachedContentNotes(com.sforce.soap.enterprise.QueryResult AttachedContentNotes) {
    this.AttachedContentNotes = AttachedContentNotes;
    AttachedContentNotes__is_set = true;
  }
  
  /**
   * element  : Attachments of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Attachments__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Attachments","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Attachments__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Attachments;

  public com.sforce.soap.enterprise.QueryResult getAttachments() {
    return Attachments;
  }

  

  public void setAttachments(com.sforce.soap.enterprise.QueryResult Attachments) {
    this.Attachments = Attachments;
    Attachments__is_set = true;
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
   * element  : BrandTemplateId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo BrandTemplateId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","BrandTemplateId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean BrandTemplateId__is_set = false;

  private java.lang.String BrandTemplateId;

  public java.lang.String getBrandTemplateId() {
    return BrandTemplateId;
  }

  

  public void setBrandTemplateId(java.lang.String BrandTemplateId) {
    this.BrandTemplateId = BrandTemplateId;
    BrandTemplateId__is_set = true;
  }
  
  /**
   * element  : CombinedAttachments of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo CombinedAttachments__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CombinedAttachments","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean CombinedAttachments__is_set = false;

  private com.sforce.soap.enterprise.QueryResult CombinedAttachments;

  public com.sforce.soap.enterprise.QueryResult getCombinedAttachments() {
    return CombinedAttachments;
  }

  

  public void setCombinedAttachments(com.sforce.soap.enterprise.QueryResult CombinedAttachments) {
    this.CombinedAttachments = CombinedAttachments;
    CombinedAttachments__is_set = true;
  }
  
  /**
   * element  : ContentDocumentLinks of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo ContentDocumentLinks__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ContentDocumentLinks","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean ContentDocumentLinks__is_set = false;

  private com.sforce.soap.enterprise.QueryResult ContentDocumentLinks;

  public com.sforce.soap.enterprise.QueryResult getContentDocumentLinks() {
    return ContentDocumentLinks;
  }

  

  public void setContentDocumentLinks(com.sforce.soap.enterprise.QueryResult ContentDocumentLinks) {
    this.ContentDocumentLinks = ContentDocumentLinks;
    ContentDocumentLinks__is_set = true;
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
   * element  : DeveloperName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo DeveloperName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DeveloperName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean DeveloperName__is_set = false;

  private java.lang.String DeveloperName;

  public java.lang.String getDeveloperName() {
    return DeveloperName;
  }

  

  public void setDeveloperName(java.lang.String DeveloperName) {
    this.DeveloperName = DeveloperName;
    DeveloperName__is_set = true;
  }
  
  /**
   * element  : Encoding of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Encoding__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Encoding","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Encoding__is_set = false;

  private java.lang.String Encoding;

  public java.lang.String getEncoding() {
    return Encoding;
  }

  

  public void setEncoding(java.lang.String Encoding) {
    this.Encoding = Encoding;
    Encoding__is_set = true;
  }
  
  /**
   * element  : EntityType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo EntityType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","EntityType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean EntityType__is_set = false;

  private java.lang.String EntityType;

  public java.lang.String getEntityType() {
    return EntityType;
  }

  

  public void setEntityType(java.lang.String EntityType) {
    this.EntityType = EntityType;
    EntityType__is_set = true;
  }
  
  /**
   * element  : Folder of type {urn:sobject.enterprise.soap.sforce.com}Folder
   * java type: com.sforce.soap.enterprise.sobject.Folder
   */
  private static final com.sforce.ws.bind.TypeInfo Folder__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Folder","urn:sobject.enterprise.soap.sforce.com","Folder",0,1,true);

  private boolean Folder__is_set = false;

  private com.sforce.soap.enterprise.sobject.Folder Folder;

  public com.sforce.soap.enterprise.sobject.Folder getFolder() {
    return Folder;
  }

  

  public void setFolder(com.sforce.soap.enterprise.sobject.Folder Folder) {
    this.Folder = Folder;
    Folder__is_set = true;
  }
  
  /**
   * element  : FolderId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo FolderId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FolderId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean FolderId__is_set = false;

  private java.lang.String FolderId;

  public java.lang.String getFolderId() {
    return FolderId;
  }

  

  public void setFolderId(java.lang.String FolderId) {
    this.FolderId = FolderId;
    FolderId__is_set = true;
  }
  
  /**
   * element  : HtmlValue of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo HtmlValue__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","HtmlValue","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean HtmlValue__is_set = false;

  private java.lang.String HtmlValue;

  public java.lang.String getHtmlValue() {
    return HtmlValue;
  }

  

  public void setHtmlValue(java.lang.String HtmlValue) {
    this.HtmlValue = HtmlValue;
    HtmlValue__is_set = true;
  }
  
  /**
   * element  : IsActive of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsActive__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsActive","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsActive__is_set = false;

  private java.lang.Boolean IsActive;

  public java.lang.Boolean getIsActive() {
    return IsActive;
  }

  

  public void setIsActive(java.lang.Boolean IsActive) {
    this.IsActive = IsActive;
    IsActive__is_set = true;
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
   * element  : Markup of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Markup__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Markup","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Markup__is_set = false;

  private java.lang.String Markup;

  public java.lang.String getMarkup() {
    return Markup;
  }

  

  public void setMarkup(java.lang.String Markup) {
    this.Markup = Markup;
    Markup__is_set = true;
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
   * element  : Owner of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo Owner__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Owner","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean Owner__is_set = false;

  private com.sforce.soap.enterprise.sobject.User Owner;

  public com.sforce.soap.enterprise.sobject.User getOwner() {
    return Owner;
  }

  

  public void setOwner(com.sforce.soap.enterprise.sobject.User Owner) {
    this.Owner = Owner;
    Owner__is_set = true;
  }
  
  /**
   * element  : OwnerId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo OwnerId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OwnerId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean OwnerId__is_set = false;

  private java.lang.String OwnerId;

  public java.lang.String getOwnerId() {
    return OwnerId;
  }

  

  public void setOwnerId(java.lang.String OwnerId) {
    this.OwnerId = OwnerId;
    OwnerId__is_set = true;
  }
  
  /**
   * element  : Subject of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Subject__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Subject","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Subject__is_set = false;

  private java.lang.String Subject;

  public java.lang.String getSubject() {
    return Subject;
  }

  

  public void setSubject(java.lang.String Subject) {
    this.Subject = Subject;
    Subject__is_set = true;
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
   * element  : TemplateStyle of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo TemplateStyle__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TemplateStyle","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean TemplateStyle__is_set = false;

  private java.lang.String TemplateStyle;

  public java.lang.String getTemplateStyle() {
    return TemplateStyle;
  }

  

  public void setTemplateStyle(java.lang.String TemplateStyle) {
    this.TemplateStyle = TemplateStyle;
    TemplateStyle__is_set = true;
  }
  
  /**
   * element  : TemplateType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo TemplateType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TemplateType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean TemplateType__is_set = false;

  private java.lang.String TemplateType;

  public java.lang.String getTemplateType() {
    return TemplateType;
  }

  

  public void setTemplateType(java.lang.String TemplateType) {
    this.TemplateType = TemplateType;
    TemplateType__is_set = true;
  }
  
  /**
   * element  : TimesUsed of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo TimesUsed__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TimesUsed","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean TimesUsed__is_set = false;

  private java.lang.Integer TimesUsed;

  public java.lang.Integer getTimesUsed() {
    return TimesUsed;
  }

  

  public void setTimesUsed(java.lang.Integer TimesUsed) {
    this.TimesUsed = TimesUsed;
    TimesUsed__is_set = true;
  }
  
  /**
   * element  : UiType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo UiType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UiType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean UiType__is_set = false;

  private java.lang.String UiType;

  public java.lang.String getUiType() {
    return UiType;
  }

  

  public void setUiType(java.lang.String UiType) {
    this.UiType = UiType;
    UiType__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "EmailTemplate");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, ApiVersion__typeInfo, ApiVersion, ApiVersion__is_set);
    __typeMapper.writeObject(__out, AttachedContentDocuments__typeInfo, AttachedContentDocuments, AttachedContentDocuments__is_set);
    __typeMapper.writeObject(__out, AttachedContentNotes__typeInfo, AttachedContentNotes, AttachedContentNotes__is_set);
    __typeMapper.writeObject(__out, Attachments__typeInfo, Attachments, Attachments__is_set);
    __typeMapper.writeString(__out, Body__typeInfo, Body, Body__is_set);
    __typeMapper.writeString(__out, BrandTemplateId__typeInfo, BrandTemplateId, BrandTemplateId__is_set);
    __typeMapper.writeObject(__out, CombinedAttachments__typeInfo, CombinedAttachments, CombinedAttachments__is_set);
    __typeMapper.writeObject(__out, ContentDocumentLinks__typeInfo, ContentDocumentLinks, ContentDocumentLinks__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, Description__typeInfo, Description, Description__is_set);
    __typeMapper.writeString(__out, DeveloperName__typeInfo, DeveloperName, DeveloperName__is_set);
    __typeMapper.writeString(__out, Encoding__typeInfo, Encoding, Encoding__is_set);
    __typeMapper.writeString(__out, EntityType__typeInfo, EntityType, EntityType__is_set);
    __typeMapper.writeObject(__out, Folder__typeInfo, Folder, Folder__is_set);
    __typeMapper.writeString(__out, FolderId__typeInfo, FolderId, FolderId__is_set);
    __typeMapper.writeString(__out, HtmlValue__typeInfo, HtmlValue, HtmlValue__is_set);
    __typeMapper.writeObject(__out, IsActive__typeInfo, IsActive, IsActive__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, LastUsedDate__typeInfo, LastUsedDate, LastUsedDate__is_set);
    __typeMapper.writeString(__out, Markup__typeInfo, Markup, Markup__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeString(__out, NamespacePrefix__typeInfo, NamespacePrefix, NamespacePrefix__is_set);
    __typeMapper.writeObject(__out, Owner__typeInfo, Owner, Owner__is_set);
    __typeMapper.writeString(__out, OwnerId__typeInfo, OwnerId, OwnerId__is_set);
    __typeMapper.writeString(__out, Subject__typeInfo, Subject, Subject__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeString(__out, TemplateStyle__typeInfo, TemplateStyle, TemplateStyle__is_set);
    __typeMapper.writeString(__out, TemplateType__typeInfo, TemplateType, TemplateType__is_set);
    __typeMapper.writeObject(__out, TimesUsed__typeInfo, TimesUsed, TimesUsed__is_set);
    __typeMapper.writeString(__out, UiType__typeInfo, UiType, UiType__is_set);
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
    if (__typeMapper.isElement(__in, AttachedContentDocuments__typeInfo)) {
      setAttachedContentDocuments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, AttachedContentDocuments__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AttachedContentNotes__typeInfo)) {
      setAttachedContentNotes((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, AttachedContentNotes__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Attachments__typeInfo)) {
      setAttachments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Attachments__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Body__typeInfo)) {
      setBody((java.lang.String)__typeMapper.readString(__in, Body__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, BrandTemplateId__typeInfo)) {
      setBrandTemplateId((java.lang.String)__typeMapper.readString(__in, BrandTemplateId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CombinedAttachments__typeInfo)) {
      setCombinedAttachments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, CombinedAttachments__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ContentDocumentLinks__typeInfo)) {
      setContentDocumentLinks((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, ContentDocumentLinks__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    if (__typeMapper.isElement(__in, DeveloperName__typeInfo)) {
      setDeveloperName((java.lang.String)__typeMapper.readString(__in, DeveloperName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Encoding__typeInfo)) {
      setEncoding((java.lang.String)__typeMapper.readString(__in, Encoding__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, EntityType__typeInfo)) {
      setEntityType((java.lang.String)__typeMapper.readString(__in, EntityType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Folder__typeInfo)) {
      setFolder((com.sforce.soap.enterprise.sobject.Folder)__typeMapper.readObject(__in, Folder__typeInfo, com.sforce.soap.enterprise.sobject.Folder.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FolderId__typeInfo)) {
      setFolderId((java.lang.String)__typeMapper.readString(__in, FolderId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, HtmlValue__typeInfo)) {
      setHtmlValue((java.lang.String)__typeMapper.readString(__in, HtmlValue__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsActive__typeInfo)) {
      setIsActive((java.lang.Boolean)__typeMapper.readObject(__in, IsActive__typeInfo, java.lang.Boolean.class));
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
    if (__typeMapper.isElement(__in, Markup__typeInfo)) {
      setMarkup((java.lang.String)__typeMapper.readString(__in, Markup__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Owner__typeInfo)) {
      setOwner((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, Owner__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OwnerId__typeInfo)) {
      setOwnerId((java.lang.String)__typeMapper.readString(__in, OwnerId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Subject__typeInfo)) {
      setSubject((java.lang.String)__typeMapper.readString(__in, Subject__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TemplateStyle__typeInfo)) {
      setTemplateStyle((java.lang.String)__typeMapper.readString(__in, TemplateStyle__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TemplateType__typeInfo)) {
      setTemplateType((java.lang.String)__typeMapper.readString(__in, TemplateType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TimesUsed__typeInfo)) {
      setTimesUsed((java.lang.Integer)__typeMapper.readObject(__in, TimesUsed__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UiType__typeInfo)) {
      setUiType((java.lang.String)__typeMapper.readString(__in, UiType__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[EmailTemplate ");
    sb.append(super.toString());
    sb.append(" ApiVersion=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ApiVersion)+"'\n");
    sb.append(" AttachedContentDocuments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentDocuments)+"'\n");
    sb.append(" AttachedContentNotes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentNotes)+"'\n");
    sb.append(" Attachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Attachments)+"'\n");
    sb.append(" Body=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Body)+"'\n");
    sb.append(" BrandTemplateId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(BrandTemplateId)+"'\n");
    sb.append(" CombinedAttachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CombinedAttachments)+"'\n");
    sb.append(" ContentDocumentLinks=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContentDocumentLinks)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" Description=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Description)+"'\n");
    sb.append(" DeveloperName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DeveloperName)+"'\n");
    sb.append(" Encoding=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Encoding)+"'\n");
    sb.append(" EntityType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EntityType)+"'\n");
    sb.append(" Folder=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Folder)+"'\n");
    sb.append(" FolderId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FolderId)+"'\n");
    sb.append(" HtmlValue=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(HtmlValue)+"'\n");
    sb.append(" IsActive=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsActive)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" LastUsedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastUsedDate)+"'\n");
    sb.append(" Markup=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Markup)+"'\n");
    sb.append(" Name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");
    sb.append(" NamespacePrefix=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NamespacePrefix)+"'\n");
    sb.append(" Owner=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Owner)+"'\n");
    sb.append(" OwnerId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OwnerId)+"'\n");
    sb.append(" Subject=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Subject)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" TemplateStyle=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TemplateStyle)+"'\n");
    sb.append(" TemplateType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TemplateType)+"'\n");
    sb.append(" TimesUsed=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TimesUsed)+"'\n");
    sb.append(" UiType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UiType)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}