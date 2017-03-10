package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class ContentDistribution extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public ContentDistribution() {
  }
    
  
  /**
   * element  : ContentDistributionViews of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo ContentDistributionViews__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ContentDistributionViews","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean ContentDistributionViews__is_set = false;

  private com.sforce.soap.enterprise.QueryResult ContentDistributionViews;

  public com.sforce.soap.enterprise.QueryResult getContentDistributionViews() {
    return ContentDistributionViews;
  }

  

  public void setContentDistributionViews(com.sforce.soap.enterprise.QueryResult ContentDistributionViews) {
    this.ContentDistributionViews = ContentDistributionViews;
    ContentDistributionViews__is_set = true;
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
   * element  : ContentVersion of type {urn:sobject.enterprise.soap.sforce.com}ContentVersion
   * java type: com.sforce.soap.enterprise.sobject.ContentVersion
   */
  private static final com.sforce.ws.bind.TypeInfo ContentVersion__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ContentVersion","urn:sobject.enterprise.soap.sforce.com","ContentVersion",0,1,true);

  private boolean ContentVersion__is_set = false;

  private com.sforce.soap.enterprise.sobject.ContentVersion ContentVersion;

  public com.sforce.soap.enterprise.sobject.ContentVersion getContentVersion() {
    return ContentVersion;
  }

  

  public void setContentVersion(com.sforce.soap.enterprise.sobject.ContentVersion ContentVersion) {
    this.ContentVersion = ContentVersion;
    ContentVersion__is_set = true;
  }
  
  /**
   * element  : ContentVersionId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ContentVersionId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ContentVersionId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ContentVersionId__is_set = false;

  private java.lang.String ContentVersionId;

  public java.lang.String getContentVersionId() {
    return ContentVersionId;
  }

  

  public void setContentVersionId(java.lang.String ContentVersionId) {
    this.ContentVersionId = ContentVersionId;
    ContentVersionId__is_set = true;
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
   * element  : DistributionPublicUrl of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo DistributionPublicUrl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DistributionPublicUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean DistributionPublicUrl__is_set = false;

  private java.lang.String DistributionPublicUrl;

  public java.lang.String getDistributionPublicUrl() {
    return DistributionPublicUrl;
  }

  

  public void setDistributionPublicUrl(java.lang.String DistributionPublicUrl) {
    this.DistributionPublicUrl = DistributionPublicUrl;
    DistributionPublicUrl__is_set = true;
  }
  
  /**
   * element  : ExpiryDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo ExpiryDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ExpiryDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean ExpiryDate__is_set = false;

  private java.util.Calendar ExpiryDate;

  public java.util.Calendar getExpiryDate() {
    return ExpiryDate;
  }

  

  public void setExpiryDate(java.util.Calendar ExpiryDate) {
    this.ExpiryDate = ExpiryDate;
    ExpiryDate__is_set = true;
  }
  
  /**
   * element  : FirstViewDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo FirstViewDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FirstViewDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean FirstViewDate__is_set = false;

  private java.util.Calendar FirstViewDate;

  public java.util.Calendar getFirstViewDate() {
    return FirstViewDate;
  }

  

  public void setFirstViewDate(java.util.Calendar FirstViewDate) {
    this.FirstViewDate = FirstViewDate;
    FirstViewDate__is_set = true;
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
   * element  : LastViewDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo LastViewDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastViewDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean LastViewDate__is_set = false;

  private java.util.Calendar LastViewDate;

  public java.util.Calendar getLastViewDate() {
    return LastViewDate;
  }

  

  public void setLastViewDate(java.util.Calendar LastViewDate) {
    this.LastViewDate = LastViewDate;
    LastViewDate__is_set = true;
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
   * element  : Password of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Password__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Password","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Password__is_set = false;

  private java.lang.String Password;

  public java.lang.String getPassword() {
    return Password;
  }

  

  public void setPassword(java.lang.String Password) {
    this.Password = Password;
    Password__is_set = true;
  }
  
  /**
   * element  : PreferencesAllowOriginalDownload of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PreferencesAllowOriginalDownload__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PreferencesAllowOriginalDownload","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PreferencesAllowOriginalDownload__is_set = false;

  private java.lang.Boolean PreferencesAllowOriginalDownload;

  public java.lang.Boolean getPreferencesAllowOriginalDownload() {
    return PreferencesAllowOriginalDownload;
  }

  

  public void setPreferencesAllowOriginalDownload(java.lang.Boolean PreferencesAllowOriginalDownload) {
    this.PreferencesAllowOriginalDownload = PreferencesAllowOriginalDownload;
    PreferencesAllowOriginalDownload__is_set = true;
  }
  
  /**
   * element  : PreferencesAllowPDFDownload of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PreferencesAllowPDFDownload__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PreferencesAllowPDFDownload","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PreferencesAllowPDFDownload__is_set = false;

  private java.lang.Boolean PreferencesAllowPDFDownload;

  public java.lang.Boolean getPreferencesAllowPDFDownload() {
    return PreferencesAllowPDFDownload;
  }

  

  public void setPreferencesAllowPDFDownload(java.lang.Boolean PreferencesAllowPDFDownload) {
    this.PreferencesAllowPDFDownload = PreferencesAllowPDFDownload;
    PreferencesAllowPDFDownload__is_set = true;
  }
  
  /**
   * element  : PreferencesAllowViewInBrowser of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PreferencesAllowViewInBrowser__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PreferencesAllowViewInBrowser","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PreferencesAllowViewInBrowser__is_set = false;

  private java.lang.Boolean PreferencesAllowViewInBrowser;

  public java.lang.Boolean getPreferencesAllowViewInBrowser() {
    return PreferencesAllowViewInBrowser;
  }

  

  public void setPreferencesAllowViewInBrowser(java.lang.Boolean PreferencesAllowViewInBrowser) {
    this.PreferencesAllowViewInBrowser = PreferencesAllowViewInBrowser;
    PreferencesAllowViewInBrowser__is_set = true;
  }
  
  /**
   * element  : PreferencesExpires of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PreferencesExpires__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PreferencesExpires","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PreferencesExpires__is_set = false;

  private java.lang.Boolean PreferencesExpires;

  public java.lang.Boolean getPreferencesExpires() {
    return PreferencesExpires;
  }

  

  public void setPreferencesExpires(java.lang.Boolean PreferencesExpires) {
    this.PreferencesExpires = PreferencesExpires;
    PreferencesExpires__is_set = true;
  }
  
  /**
   * element  : PreferencesLinkLatestVersion of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PreferencesLinkLatestVersion__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PreferencesLinkLatestVersion","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PreferencesLinkLatestVersion__is_set = false;

  private java.lang.Boolean PreferencesLinkLatestVersion;

  public java.lang.Boolean getPreferencesLinkLatestVersion() {
    return PreferencesLinkLatestVersion;
  }

  

  public void setPreferencesLinkLatestVersion(java.lang.Boolean PreferencesLinkLatestVersion) {
    this.PreferencesLinkLatestVersion = PreferencesLinkLatestVersion;
    PreferencesLinkLatestVersion__is_set = true;
  }
  
  /**
   * element  : PreferencesNotifyOnVisit of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PreferencesNotifyOnVisit__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PreferencesNotifyOnVisit","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PreferencesNotifyOnVisit__is_set = false;

  private java.lang.Boolean PreferencesNotifyOnVisit;

  public java.lang.Boolean getPreferencesNotifyOnVisit() {
    return PreferencesNotifyOnVisit;
  }

  

  public void setPreferencesNotifyOnVisit(java.lang.Boolean PreferencesNotifyOnVisit) {
    this.PreferencesNotifyOnVisit = PreferencesNotifyOnVisit;
    PreferencesNotifyOnVisit__is_set = true;
  }
  
  /**
   * element  : PreferencesNotifyRndtnComplete of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PreferencesNotifyRndtnComplete__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PreferencesNotifyRndtnComplete","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PreferencesNotifyRndtnComplete__is_set = false;

  private java.lang.Boolean PreferencesNotifyRndtnComplete;

  public java.lang.Boolean getPreferencesNotifyRndtnComplete() {
    return PreferencesNotifyRndtnComplete;
  }

  

  public void setPreferencesNotifyRndtnComplete(java.lang.Boolean PreferencesNotifyRndtnComplete) {
    this.PreferencesNotifyRndtnComplete = PreferencesNotifyRndtnComplete;
    PreferencesNotifyRndtnComplete__is_set = true;
  }
  
  /**
   * element  : PreferencesPasswordRequired of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PreferencesPasswordRequired__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PreferencesPasswordRequired","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PreferencesPasswordRequired__is_set = false;

  private java.lang.Boolean PreferencesPasswordRequired;

  public java.lang.Boolean getPreferencesPasswordRequired() {
    return PreferencesPasswordRequired;
  }

  

  public void setPreferencesPasswordRequired(java.lang.Boolean PreferencesPasswordRequired) {
    this.PreferencesPasswordRequired = PreferencesPasswordRequired;
    PreferencesPasswordRequired__is_set = true;
  }
  
  /**
   * element  : RelatedRecord of type {urn:sobject.enterprise.soap.sforce.com}Name
   * java type: com.sforce.soap.enterprise.sobject.Name
   */
  private static final com.sforce.ws.bind.TypeInfo RelatedRecord__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RelatedRecord","urn:sobject.enterprise.soap.sforce.com","Name",0,1,true);

  private boolean RelatedRecord__is_set = false;

  private com.sforce.soap.enterprise.sobject.Name RelatedRecord;

  public com.sforce.soap.enterprise.sobject.Name getRelatedRecord() {
    return RelatedRecord;
  }

  

  public void setRelatedRecord(com.sforce.soap.enterprise.sobject.Name RelatedRecord) {
    this.RelatedRecord = RelatedRecord;
    RelatedRecord__is_set = true;
  }
  
  /**
   * element  : RelatedRecordId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo RelatedRecordId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RelatedRecordId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean RelatedRecordId__is_set = false;

  private java.lang.String RelatedRecordId;

  public java.lang.String getRelatedRecordId() {
    return RelatedRecordId;
  }

  

  public void setRelatedRecordId(java.lang.String RelatedRecordId) {
    this.RelatedRecordId = RelatedRecordId;
    RelatedRecordId__is_set = true;
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
   * element  : ViewCount of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo ViewCount__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ViewCount","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean ViewCount__is_set = false;

  private java.lang.Integer ViewCount;

  public java.lang.Integer getViewCount() {
    return ViewCount;
  }

  

  public void setViewCount(java.lang.Integer ViewCount) {
    this.ViewCount = ViewCount;
    ViewCount__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "ContentDistribution");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, ContentDistributionViews__typeInfo, ContentDistributionViews, ContentDistributionViews__is_set);
    __typeMapper.writeString(__out, ContentDocumentId__typeInfo, ContentDocumentId, ContentDocumentId__is_set);
    __typeMapper.writeObject(__out, ContentVersion__typeInfo, ContentVersion, ContentVersion__is_set);
    __typeMapper.writeString(__out, ContentVersionId__typeInfo, ContentVersionId, ContentVersionId__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, DistributionPublicUrl__typeInfo, DistributionPublicUrl, DistributionPublicUrl__is_set);
    __typeMapper.writeObject(__out, ExpiryDate__typeInfo, ExpiryDate, ExpiryDate__is_set);
    __typeMapper.writeObject(__out, FirstViewDate__typeInfo, FirstViewDate, FirstViewDate__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, LastViewDate__typeInfo, LastViewDate, LastViewDate__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeObject(__out, Owner__typeInfo, Owner, Owner__is_set);
    __typeMapper.writeString(__out, OwnerId__typeInfo, OwnerId, OwnerId__is_set);
    __typeMapper.writeString(__out, Password__typeInfo, Password, Password__is_set);
    __typeMapper.writeObject(__out, PreferencesAllowOriginalDownload__typeInfo, PreferencesAllowOriginalDownload, PreferencesAllowOriginalDownload__is_set);
    __typeMapper.writeObject(__out, PreferencesAllowPDFDownload__typeInfo, PreferencesAllowPDFDownload, PreferencesAllowPDFDownload__is_set);
    __typeMapper.writeObject(__out, PreferencesAllowViewInBrowser__typeInfo, PreferencesAllowViewInBrowser, PreferencesAllowViewInBrowser__is_set);
    __typeMapper.writeObject(__out, PreferencesExpires__typeInfo, PreferencesExpires, PreferencesExpires__is_set);
    __typeMapper.writeObject(__out, PreferencesLinkLatestVersion__typeInfo, PreferencesLinkLatestVersion, PreferencesLinkLatestVersion__is_set);
    __typeMapper.writeObject(__out, PreferencesNotifyOnVisit__typeInfo, PreferencesNotifyOnVisit, PreferencesNotifyOnVisit__is_set);
    __typeMapper.writeObject(__out, PreferencesNotifyRndtnComplete__typeInfo, PreferencesNotifyRndtnComplete, PreferencesNotifyRndtnComplete__is_set);
    __typeMapper.writeObject(__out, PreferencesPasswordRequired__typeInfo, PreferencesPasswordRequired, PreferencesPasswordRequired__is_set);
    __typeMapper.writeObject(__out, RelatedRecord__typeInfo, RelatedRecord, RelatedRecord__is_set);
    __typeMapper.writeString(__out, RelatedRecordId__typeInfo, RelatedRecordId, RelatedRecordId__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeObject(__out, ViewCount__typeInfo, ViewCount, ViewCount__is_set);
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
    if (__typeMapper.isElement(__in, ContentDistributionViews__typeInfo)) {
      setContentDistributionViews((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, ContentDistributionViews__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ContentDocumentId__typeInfo)) {
      setContentDocumentId((java.lang.String)__typeMapper.readString(__in, ContentDocumentId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ContentVersion__typeInfo)) {
      setContentVersion((com.sforce.soap.enterprise.sobject.ContentVersion)__typeMapper.readObject(__in, ContentVersion__typeInfo, com.sforce.soap.enterprise.sobject.ContentVersion.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ContentVersionId__typeInfo)) {
      setContentVersionId((java.lang.String)__typeMapper.readString(__in, ContentVersionId__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, DistributionPublicUrl__typeInfo)) {
      setDistributionPublicUrl((java.lang.String)__typeMapper.readString(__in, DistributionPublicUrl__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ExpiryDate__typeInfo)) {
      setExpiryDate((java.util.Calendar)__typeMapper.readObject(__in, ExpiryDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FirstViewDate__typeInfo)) {
      setFirstViewDate((java.util.Calendar)__typeMapper.readObject(__in, FirstViewDate__typeInfo, java.util.Calendar.class));
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
    if (__typeMapper.isElement(__in, LastViewDate__typeInfo)) {
      setLastViewDate((java.util.Calendar)__typeMapper.readObject(__in, LastViewDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Name__typeInfo)) {
      setName((java.lang.String)__typeMapper.readString(__in, Name__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Password__typeInfo)) {
      setPassword((java.lang.String)__typeMapper.readString(__in, Password__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PreferencesAllowOriginalDownload__typeInfo)) {
      setPreferencesAllowOriginalDownload((java.lang.Boolean)__typeMapper.readObject(__in, PreferencesAllowOriginalDownload__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PreferencesAllowPDFDownload__typeInfo)) {
      setPreferencesAllowPDFDownload((java.lang.Boolean)__typeMapper.readObject(__in, PreferencesAllowPDFDownload__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PreferencesAllowViewInBrowser__typeInfo)) {
      setPreferencesAllowViewInBrowser((java.lang.Boolean)__typeMapper.readObject(__in, PreferencesAllowViewInBrowser__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PreferencesExpires__typeInfo)) {
      setPreferencesExpires((java.lang.Boolean)__typeMapper.readObject(__in, PreferencesExpires__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PreferencesLinkLatestVersion__typeInfo)) {
      setPreferencesLinkLatestVersion((java.lang.Boolean)__typeMapper.readObject(__in, PreferencesLinkLatestVersion__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PreferencesNotifyOnVisit__typeInfo)) {
      setPreferencesNotifyOnVisit((java.lang.Boolean)__typeMapper.readObject(__in, PreferencesNotifyOnVisit__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PreferencesNotifyRndtnComplete__typeInfo)) {
      setPreferencesNotifyRndtnComplete((java.lang.Boolean)__typeMapper.readObject(__in, PreferencesNotifyRndtnComplete__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PreferencesPasswordRequired__typeInfo)) {
      setPreferencesPasswordRequired((java.lang.Boolean)__typeMapper.readObject(__in, PreferencesPasswordRequired__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RelatedRecord__typeInfo)) {
      setRelatedRecord((com.sforce.soap.enterprise.sobject.Name)__typeMapper.readObject(__in, RelatedRecord__typeInfo, com.sforce.soap.enterprise.sobject.Name.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RelatedRecordId__typeInfo)) {
      setRelatedRecordId((java.lang.String)__typeMapper.readString(__in, RelatedRecordId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ViewCount__typeInfo)) {
      setViewCount((java.lang.Integer)__typeMapper.readObject(__in, ViewCount__typeInfo, java.lang.Integer.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[ContentDistribution ");
    sb.append(super.toString());
    sb.append(" ContentDistributionViews=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContentDistributionViews)+"'\n");
    sb.append(" ContentDocumentId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContentDocumentId)+"'\n");
    sb.append(" ContentVersion=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContentVersion)+"'\n");
    sb.append(" ContentVersionId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContentVersionId)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" DistributionPublicUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DistributionPublicUrl)+"'\n");
    sb.append(" ExpiryDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ExpiryDate)+"'\n");
    sb.append(" FirstViewDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FirstViewDate)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" LastViewDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastViewDate)+"'\n");
    sb.append(" Name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");
    sb.append(" Owner=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Owner)+"'\n");
    sb.append(" OwnerId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OwnerId)+"'\n");
    sb.append(" Password=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Password)+"'\n");
    sb.append(" PreferencesAllowOriginalDownload=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PreferencesAllowOriginalDownload)+"'\n");
    sb.append(" PreferencesAllowPDFDownload=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PreferencesAllowPDFDownload)+"'\n");
    sb.append(" PreferencesAllowViewInBrowser=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PreferencesAllowViewInBrowser)+"'\n");
    sb.append(" PreferencesExpires=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PreferencesExpires)+"'\n");
    sb.append(" PreferencesLinkLatestVersion=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PreferencesLinkLatestVersion)+"'\n");
    sb.append(" PreferencesNotifyOnVisit=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PreferencesNotifyOnVisit)+"'\n");
    sb.append(" PreferencesNotifyRndtnComplete=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PreferencesNotifyRndtnComplete)+"'\n");
    sb.append(" PreferencesPasswordRequired=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PreferencesPasswordRequired)+"'\n");
    sb.append(" RelatedRecord=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RelatedRecord)+"'\n");
    sb.append(" RelatedRecordId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RelatedRecordId)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" ViewCount=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ViewCount)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}