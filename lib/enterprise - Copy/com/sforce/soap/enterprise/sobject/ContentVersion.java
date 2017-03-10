package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class ContentVersion extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public ContentVersion() {
  }
    
  
  /**
   * element  : Checksum of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Checksum__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Checksum","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Checksum__is_set = false;

  private java.lang.String Checksum;

  public java.lang.String getChecksum() {
    return Checksum;
  }

  

  public void setChecksum(java.lang.String Checksum) {
    this.Checksum = Checksum;
    Checksum__is_set = true;
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
   * element  : ContentLocation of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ContentLocation__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ContentLocation","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ContentLocation__is_set = false;

  private java.lang.String ContentLocation;

  public java.lang.String getContentLocation() {
    return ContentLocation;
  }

  

  public void setContentLocation(java.lang.String ContentLocation) {
    this.ContentLocation = ContentLocation;
    ContentLocation__is_set = true;
  }
  
  /**
   * element  : ContentModifiedById of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ContentModifiedById__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ContentModifiedById","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ContentModifiedById__is_set = false;

  private java.lang.String ContentModifiedById;

  public java.lang.String getContentModifiedById() {
    return ContentModifiedById;
  }

  

  public void setContentModifiedById(java.lang.String ContentModifiedById) {
    this.ContentModifiedById = ContentModifiedById;
    ContentModifiedById__is_set = true;
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
   * element  : ContentUrl of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ContentUrl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ContentUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ContentUrl__is_set = false;

  private java.lang.String ContentUrl;

  public java.lang.String getContentUrl() {
    return ContentUrl;
  }

  

  public void setContentUrl(java.lang.String ContentUrl) {
    this.ContentUrl = ContentUrl;
    ContentUrl__is_set = true;
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
   * element  : ExternalDataSource of type {urn:sobject.enterprise.soap.sforce.com}ExternalDataSource
   * java type: com.sforce.soap.enterprise.sobject.ExternalDataSource
   */
  private static final com.sforce.ws.bind.TypeInfo ExternalDataSource__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ExternalDataSource","urn:sobject.enterprise.soap.sforce.com","ExternalDataSource",0,1,true);

  private boolean ExternalDataSource__is_set = false;

  private com.sforce.soap.enterprise.sobject.ExternalDataSource ExternalDataSource;

  public com.sforce.soap.enterprise.sobject.ExternalDataSource getExternalDataSource() {
    return ExternalDataSource;
  }

  

  public void setExternalDataSource(com.sforce.soap.enterprise.sobject.ExternalDataSource ExternalDataSource) {
    this.ExternalDataSource = ExternalDataSource;
    ExternalDataSource__is_set = true;
  }
  
  /**
   * element  : ExternalDataSourceId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ExternalDataSourceId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ExternalDataSourceId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ExternalDataSourceId__is_set = false;

  private java.lang.String ExternalDataSourceId;

  public java.lang.String getExternalDataSourceId() {
    return ExternalDataSourceId;
  }

  

  public void setExternalDataSourceId(java.lang.String ExternalDataSourceId) {
    this.ExternalDataSourceId = ExternalDataSourceId;
    ExternalDataSourceId__is_set = true;
  }
  
  /**
   * element  : ExternalDocumentInfo1 of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ExternalDocumentInfo1__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ExternalDocumentInfo1","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ExternalDocumentInfo1__is_set = false;

  private java.lang.String ExternalDocumentInfo1;

  public java.lang.String getExternalDocumentInfo1() {
    return ExternalDocumentInfo1;
  }

  

  public void setExternalDocumentInfo1(java.lang.String ExternalDocumentInfo1) {
    this.ExternalDocumentInfo1 = ExternalDocumentInfo1;
    ExternalDocumentInfo1__is_set = true;
  }
  
  /**
   * element  : ExternalDocumentInfo2 of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ExternalDocumentInfo2__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ExternalDocumentInfo2","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ExternalDocumentInfo2__is_set = false;

  private java.lang.String ExternalDocumentInfo2;

  public java.lang.String getExternalDocumentInfo2() {
    return ExternalDocumentInfo2;
  }

  

  public void setExternalDocumentInfo2(java.lang.String ExternalDocumentInfo2) {
    this.ExternalDocumentInfo2 = ExternalDocumentInfo2;
    ExternalDocumentInfo2__is_set = true;
  }
  
  /**
   * element  : FeaturedContentBoost of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo FeaturedContentBoost__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FeaturedContentBoost","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean FeaturedContentBoost__is_set = false;

  private java.lang.Integer FeaturedContentBoost;

  public java.lang.Integer getFeaturedContentBoost() {
    return FeaturedContentBoost;
  }

  

  public void setFeaturedContentBoost(java.lang.Integer FeaturedContentBoost) {
    this.FeaturedContentBoost = FeaturedContentBoost;
    FeaturedContentBoost__is_set = true;
  }
  
  /**
   * element  : FeaturedContentDate of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo FeaturedContentDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FeaturedContentDate","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean FeaturedContentDate__is_set = false;

  private java.util.Calendar FeaturedContentDate;

  public java.util.Calendar getFeaturedContentDate() {
    return FeaturedContentDate;
  }

  

  public void setFeaturedContentDate(java.util.Calendar FeaturedContentDate) {
    this.FeaturedContentDate = FeaturedContentDate;
    FeaturedContentDate__is_set = true;
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
   * element  : FirstPublishLocation of type {urn:sobject.enterprise.soap.sforce.com}Name
   * java type: com.sforce.soap.enterprise.sobject.Name
   */
  private static final com.sforce.ws.bind.TypeInfo FirstPublishLocation__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FirstPublishLocation","urn:sobject.enterprise.soap.sforce.com","Name",0,1,true);

  private boolean FirstPublishLocation__is_set = false;

  private com.sforce.soap.enterprise.sobject.Name FirstPublishLocation;

  public com.sforce.soap.enterprise.sobject.Name getFirstPublishLocation() {
    return FirstPublishLocation;
  }

  

  public void setFirstPublishLocation(com.sforce.soap.enterprise.sobject.Name FirstPublishLocation) {
    this.FirstPublishLocation = FirstPublishLocation;
    FirstPublishLocation__is_set = true;
  }
  
  /**
   * element  : FirstPublishLocationId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo FirstPublishLocationId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FirstPublishLocationId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean FirstPublishLocationId__is_set = false;

  private java.lang.String FirstPublishLocationId;

  public java.lang.String getFirstPublishLocationId() {
    return FirstPublishLocationId;
  }

  

  public void setFirstPublishLocationId(java.lang.String FirstPublishLocationId) {
    this.FirstPublishLocationId = FirstPublishLocationId;
    FirstPublishLocationId__is_set = true;
  }
  
  /**
   * element  : Histories of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Histories__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Histories","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Histories__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Histories;

  public com.sforce.soap.enterprise.QueryResult getHistories() {
    return Histories;
  }

  

  public void setHistories(com.sforce.soap.enterprise.QueryResult Histories) {
    this.Histories = Histories;
    Histories__is_set = true;
  }
  
  /**
   * element  : IsAssetEnabled of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsAssetEnabled__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsAssetEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsAssetEnabled__is_set = false;

  private java.lang.Boolean IsAssetEnabled;

  public java.lang.Boolean getIsAssetEnabled() {
    return IsAssetEnabled;
  }

  

  public void setIsAssetEnabled(java.lang.Boolean IsAssetEnabled) {
    this.IsAssetEnabled = IsAssetEnabled;
    IsAssetEnabled__is_set = true;
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
   * element  : IsLatest of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsLatest__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsLatest","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsLatest__is_set = false;

  private java.lang.Boolean IsLatest;

  public java.lang.Boolean getIsLatest() {
    return IsLatest;
  }

  

  public void setIsLatest(java.lang.Boolean IsLatest) {
    this.IsLatest = IsLatest;
    IsLatest__is_set = true;
  }
  
  /**
   * element  : IsMajorVersion of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsMajorVersion__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsMajorVersion","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsMajorVersion__is_set = false;

  private java.lang.Boolean IsMajorVersion;

  public java.lang.Boolean getIsMajorVersion() {
    return IsMajorVersion;
  }

  

  public void setIsMajorVersion(java.lang.Boolean IsMajorVersion) {
    this.IsMajorVersion = IsMajorVersion;
    IsMajorVersion__is_set = true;
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
   * element  : NegativeRatingCount of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo NegativeRatingCount__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","NegativeRatingCount","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean NegativeRatingCount__is_set = false;

  private java.lang.Integer NegativeRatingCount;

  public java.lang.Integer getNegativeRatingCount() {
    return NegativeRatingCount;
  }

  

  public void setNegativeRatingCount(java.lang.Integer NegativeRatingCount) {
    this.NegativeRatingCount = NegativeRatingCount;
    NegativeRatingCount__is_set = true;
  }
  
  /**
   * element  : Origin of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Origin__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Origin","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Origin__is_set = false;

  private java.lang.String Origin;

  public java.lang.String getOrigin() {
    return Origin;
  }

  

  public void setOrigin(java.lang.String Origin) {
    this.Origin = Origin;
    Origin__is_set = true;
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
   * element  : PathOnClient of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo PathOnClient__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PathOnClient","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean PathOnClient__is_set = false;

  private java.lang.String PathOnClient;

  public java.lang.String getPathOnClient() {
    return PathOnClient;
  }

  

  public void setPathOnClient(java.lang.String PathOnClient) {
    this.PathOnClient = PathOnClient;
    PathOnClient__is_set = true;
  }
  
  /**
   * element  : PositiveRatingCount of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo PositiveRatingCount__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PositiveRatingCount","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean PositiveRatingCount__is_set = false;

  private java.lang.Integer PositiveRatingCount;

  public java.lang.Integer getPositiveRatingCount() {
    return PositiveRatingCount;
  }

  

  public void setPositiveRatingCount(java.lang.Integer PositiveRatingCount) {
    this.PositiveRatingCount = PositiveRatingCount;
    PositiveRatingCount__is_set = true;
  }
  
  /**
   * element  : PublishStatus of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo PublishStatus__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PublishStatus","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean PublishStatus__is_set = false;

  private java.lang.String PublishStatus;

  public java.lang.String getPublishStatus() {
    return PublishStatus;
  }

  

  public void setPublishStatus(java.lang.String PublishStatus) {
    this.PublishStatus = PublishStatus;
    PublishStatus__is_set = true;
  }
  
  /**
   * element  : RatingCount of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo RatingCount__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RatingCount","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean RatingCount__is_set = false;

  private java.lang.Integer RatingCount;

  public java.lang.Integer getRatingCount() {
    return RatingCount;
  }

  

  public void setRatingCount(java.lang.Integer RatingCount) {
    this.RatingCount = RatingCount;
    RatingCount__is_set = true;
  }
  
  /**
   * element  : ReasonForChange of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ReasonForChange__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ReasonForChange","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ReasonForChange__is_set = false;

  private java.lang.String ReasonForChange;

  public java.lang.String getReasonForChange() {
    return ReasonForChange;
  }

  

  public void setReasonForChange(java.lang.String ReasonForChange) {
    this.ReasonForChange = ReasonForChange;
    ReasonForChange__is_set = true;
  }
  
  /**
   * element  : RecordType of type {urn:sobject.enterprise.soap.sforce.com}RecordType
   * java type: com.sforce.soap.enterprise.sobject.RecordType
   */
  private static final com.sforce.ws.bind.TypeInfo RecordType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RecordType","urn:sobject.enterprise.soap.sforce.com","RecordType",0,1,true);

  private boolean RecordType__is_set = false;

  private com.sforce.soap.enterprise.sobject.RecordType RecordType;

  public com.sforce.soap.enterprise.sobject.RecordType getRecordType() {
    return RecordType;
  }

  

  public void setRecordType(com.sforce.soap.enterprise.sobject.RecordType RecordType) {
    this.RecordType = RecordType;
    RecordType__is_set = true;
  }
  
  /**
   * element  : RecordTypeId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo RecordTypeId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RecordTypeId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean RecordTypeId__is_set = false;

  private java.lang.String RecordTypeId;

  public java.lang.String getRecordTypeId() {
    return RecordTypeId;
  }

  

  public void setRecordTypeId(java.lang.String RecordTypeId) {
    this.RecordTypeId = RecordTypeId;
    RecordTypeId__is_set = true;
  }
  
  /**
   * element  : SharingOption of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo SharingOption__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SharingOption","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean SharingOption__is_set = false;

  private java.lang.String SharingOption;

  public java.lang.String getSharingOption() {
    return SharingOption;
  }

  

  public void setSharingOption(java.lang.String SharingOption) {
    this.SharingOption = SharingOption;
    SharingOption__is_set = true;
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
   * element  : TagCsv of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo TagCsv__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TagCsv","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean TagCsv__is_set = false;

  private java.lang.String TagCsv;

  public java.lang.String getTagCsv() {
    return TagCsv;
  }

  

  public void setTagCsv(java.lang.String TagCsv) {
    this.TagCsv = TagCsv;
    TagCsv__is_set = true;
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
   * element  : VersionData of type {http://www.w3.org/2001/XMLSchema}base64Binary
   * java type: byte[]
   */
  private static final com.sforce.ws.bind.TypeInfo VersionData__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VersionData","http://www.w3.org/2001/XMLSchema","base64Binary",0,1,true);

  private boolean VersionData__is_set = false;

  private byte[] VersionData;

  public byte[] getVersionData() {
    return VersionData;
  }

  

  public void setVersionData(byte[] VersionData) {
    this.VersionData = VersionData;
    VersionData__is_set = true;
  }
  
  /**
   * element  : VersionNumber of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo VersionNumber__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VersionNumber","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean VersionNumber__is_set = false;

  private java.lang.String VersionNumber;

  public java.lang.String getVersionNumber() {
    return VersionNumber;
  }

  

  public void setVersionNumber(java.lang.String VersionNumber) {
    this.VersionNumber = VersionNumber;
    VersionNumber__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "ContentVersion");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, Checksum__typeInfo, Checksum, Checksum__is_set);
    __typeMapper.writeObject(__out, ContentDocument__typeInfo, ContentDocument, ContentDocument__is_set);
    __typeMapper.writeString(__out, ContentDocumentId__typeInfo, ContentDocumentId, ContentDocumentId__is_set);
    __typeMapper.writeString(__out, ContentLocation__typeInfo, ContentLocation, ContentLocation__is_set);
    __typeMapper.writeString(__out, ContentModifiedById__typeInfo, ContentModifiedById, ContentModifiedById__is_set);
    __typeMapper.writeObject(__out, ContentModifiedDate__typeInfo, ContentModifiedDate, ContentModifiedDate__is_set);
    __typeMapper.writeObject(__out, ContentSize__typeInfo, ContentSize, ContentSize__is_set);
    __typeMapper.writeString(__out, ContentUrl__typeInfo, ContentUrl, ContentUrl__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, Description__typeInfo, Description, Description__is_set);
    __typeMapper.writeObject(__out, ExternalDataSource__typeInfo, ExternalDataSource, ExternalDataSource__is_set);
    __typeMapper.writeString(__out, ExternalDataSourceId__typeInfo, ExternalDataSourceId, ExternalDataSourceId__is_set);
    __typeMapper.writeString(__out, ExternalDocumentInfo1__typeInfo, ExternalDocumentInfo1, ExternalDocumentInfo1__is_set);
    __typeMapper.writeString(__out, ExternalDocumentInfo2__typeInfo, ExternalDocumentInfo2, ExternalDocumentInfo2__is_set);
    __typeMapper.writeObject(__out, FeaturedContentBoost__typeInfo, FeaturedContentBoost, FeaturedContentBoost__is_set);
    __typeMapper.writeObject(__out, FeaturedContentDate__typeInfo, FeaturedContentDate, FeaturedContentDate__is_set);
    __typeMapper.writeString(__out, FileExtension__typeInfo, FileExtension, FileExtension__is_set);
    __typeMapper.writeString(__out, FileType__typeInfo, FileType, FileType__is_set);
    __typeMapper.writeObject(__out, FirstPublishLocation__typeInfo, FirstPublishLocation, FirstPublishLocation__is_set);
    __typeMapper.writeString(__out, FirstPublishLocationId__typeInfo, FirstPublishLocationId, FirstPublishLocationId__is_set);
    __typeMapper.writeObject(__out, Histories__typeInfo, Histories, Histories__is_set);
    __typeMapper.writeObject(__out, IsAssetEnabled__typeInfo, IsAssetEnabled, IsAssetEnabled__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, IsLatest__typeInfo, IsLatest, IsLatest__is_set);
    __typeMapper.writeObject(__out, IsMajorVersion__typeInfo, IsMajorVersion, IsMajorVersion__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, NegativeRatingCount__typeInfo, NegativeRatingCount, NegativeRatingCount__is_set);
    __typeMapper.writeString(__out, Origin__typeInfo, Origin, Origin__is_set);
    __typeMapper.writeObject(__out, Owner__typeInfo, Owner, Owner__is_set);
    __typeMapper.writeString(__out, OwnerId__typeInfo, OwnerId, OwnerId__is_set);
    __typeMapper.writeString(__out, PathOnClient__typeInfo, PathOnClient, PathOnClient__is_set);
    __typeMapper.writeObject(__out, PositiveRatingCount__typeInfo, PositiveRatingCount, PositiveRatingCount__is_set);
    __typeMapper.writeString(__out, PublishStatus__typeInfo, PublishStatus, PublishStatus__is_set);
    __typeMapper.writeObject(__out, RatingCount__typeInfo, RatingCount, RatingCount__is_set);
    __typeMapper.writeString(__out, ReasonForChange__typeInfo, ReasonForChange, ReasonForChange__is_set);
    __typeMapper.writeObject(__out, RecordType__typeInfo, RecordType, RecordType__is_set);
    __typeMapper.writeString(__out, RecordTypeId__typeInfo, RecordTypeId, RecordTypeId__is_set);
    __typeMapper.writeString(__out, SharingOption__typeInfo, SharingOption, SharingOption__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeString(__out, TagCsv__typeInfo, TagCsv, TagCsv__is_set);
    __typeMapper.writeString(__out, TextPreview__typeInfo, TextPreview, TextPreview__is_set);
    __typeMapper.writeString(__out, Title__typeInfo, Title, Title__is_set);
    __typeMapper.writeObject(__out, VersionData__typeInfo, VersionData, VersionData__is_set);
    __typeMapper.writeString(__out, VersionNumber__typeInfo, VersionNumber, VersionNumber__is_set);
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
    if (__typeMapper.isElement(__in, Checksum__typeInfo)) {
      setChecksum((java.lang.String)__typeMapper.readString(__in, Checksum__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ContentDocument__typeInfo)) {
      setContentDocument((com.sforce.soap.enterprise.sobject.ContentDocument)__typeMapper.readObject(__in, ContentDocument__typeInfo, com.sforce.soap.enterprise.sobject.ContentDocument.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ContentDocumentId__typeInfo)) {
      setContentDocumentId((java.lang.String)__typeMapper.readString(__in, ContentDocumentId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ContentLocation__typeInfo)) {
      setContentLocation((java.lang.String)__typeMapper.readString(__in, ContentLocation__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ContentModifiedById__typeInfo)) {
      setContentModifiedById((java.lang.String)__typeMapper.readString(__in, ContentModifiedById__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, ContentUrl__typeInfo)) {
      setContentUrl((java.lang.String)__typeMapper.readString(__in, ContentUrl__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, ExternalDataSource__typeInfo)) {
      setExternalDataSource((com.sforce.soap.enterprise.sobject.ExternalDataSource)__typeMapper.readObject(__in, ExternalDataSource__typeInfo, com.sforce.soap.enterprise.sobject.ExternalDataSource.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ExternalDataSourceId__typeInfo)) {
      setExternalDataSourceId((java.lang.String)__typeMapper.readString(__in, ExternalDataSourceId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ExternalDocumentInfo1__typeInfo)) {
      setExternalDocumentInfo1((java.lang.String)__typeMapper.readString(__in, ExternalDocumentInfo1__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ExternalDocumentInfo2__typeInfo)) {
      setExternalDocumentInfo2((java.lang.String)__typeMapper.readString(__in, ExternalDocumentInfo2__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FeaturedContentBoost__typeInfo)) {
      setFeaturedContentBoost((java.lang.Integer)__typeMapper.readObject(__in, FeaturedContentBoost__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FeaturedContentDate__typeInfo)) {
      setFeaturedContentDate((java.util.Calendar)__typeMapper.readObject(__in, FeaturedContentDate__typeInfo, java.util.Calendar.class));
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
    if (__typeMapper.isElement(__in, FirstPublishLocation__typeInfo)) {
      setFirstPublishLocation((com.sforce.soap.enterprise.sobject.Name)__typeMapper.readObject(__in, FirstPublishLocation__typeInfo, com.sforce.soap.enterprise.sobject.Name.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FirstPublishLocationId__typeInfo)) {
      setFirstPublishLocationId((java.lang.String)__typeMapper.readString(__in, FirstPublishLocationId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Histories__typeInfo)) {
      setHistories((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Histories__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsAssetEnabled__typeInfo)) {
      setIsAssetEnabled((java.lang.Boolean)__typeMapper.readObject(__in, IsAssetEnabled__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {
      setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, IsDeleted__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsLatest__typeInfo)) {
      setIsLatest((java.lang.Boolean)__typeMapper.readObject(__in, IsLatest__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsMajorVersion__typeInfo)) {
      setIsMajorVersion((java.lang.Boolean)__typeMapper.readObject(__in, IsMajorVersion__typeInfo, java.lang.Boolean.class));
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
    if (__typeMapper.isElement(__in, NegativeRatingCount__typeInfo)) {
      setNegativeRatingCount((java.lang.Integer)__typeMapper.readObject(__in, NegativeRatingCount__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Origin__typeInfo)) {
      setOrigin((java.lang.String)__typeMapper.readString(__in, Origin__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, PathOnClient__typeInfo)) {
      setPathOnClient((java.lang.String)__typeMapper.readString(__in, PathOnClient__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PositiveRatingCount__typeInfo)) {
      setPositiveRatingCount((java.lang.Integer)__typeMapper.readObject(__in, PositiveRatingCount__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PublishStatus__typeInfo)) {
      setPublishStatus((java.lang.String)__typeMapper.readString(__in, PublishStatus__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RatingCount__typeInfo)) {
      setRatingCount((java.lang.Integer)__typeMapper.readObject(__in, RatingCount__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ReasonForChange__typeInfo)) {
      setReasonForChange((java.lang.String)__typeMapper.readString(__in, ReasonForChange__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RecordType__typeInfo)) {
      setRecordType((com.sforce.soap.enterprise.sobject.RecordType)__typeMapper.readObject(__in, RecordType__typeInfo, com.sforce.soap.enterprise.sobject.RecordType.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RecordTypeId__typeInfo)) {
      setRecordTypeId((java.lang.String)__typeMapper.readString(__in, RecordTypeId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SharingOption__typeInfo)) {
      setSharingOption((java.lang.String)__typeMapper.readString(__in, SharingOption__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TagCsv__typeInfo)) {
      setTagCsv((java.lang.String)__typeMapper.readString(__in, TagCsv__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TextPreview__typeInfo)) {
      setTextPreview((java.lang.String)__typeMapper.readString(__in, TextPreview__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Title__typeInfo)) {
      setTitle((java.lang.String)__typeMapper.readString(__in, Title__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VersionData__typeInfo)) {
      setVersionData((byte[])__typeMapper.readObject(__in, VersionData__typeInfo, byte[].class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VersionNumber__typeInfo)) {
      setVersionNumber((java.lang.String)__typeMapper.readString(__in, VersionNumber__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[ContentVersion ");
    sb.append(super.toString());
    sb.append(" Checksum=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Checksum)+"'\n");
    sb.append(" ContentDocument=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContentDocument)+"'\n");
    sb.append(" ContentDocumentId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContentDocumentId)+"'\n");
    sb.append(" ContentLocation=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContentLocation)+"'\n");
    sb.append(" ContentModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContentModifiedById)+"'\n");
    sb.append(" ContentModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContentModifiedDate)+"'\n");
    sb.append(" ContentSize=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContentSize)+"'\n");
    sb.append(" ContentUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContentUrl)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" Description=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Description)+"'\n");
    sb.append(" ExternalDataSource=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ExternalDataSource)+"'\n");
    sb.append(" ExternalDataSourceId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ExternalDataSourceId)+"'\n");
    sb.append(" ExternalDocumentInfo1=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ExternalDocumentInfo1)+"'\n");
    sb.append(" ExternalDocumentInfo2=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ExternalDocumentInfo2)+"'\n");
    sb.append(" FeaturedContentBoost=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FeaturedContentBoost)+"'\n");
    sb.append(" FeaturedContentDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FeaturedContentDate)+"'\n");
    sb.append(" FileExtension=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FileExtension)+"'\n");
    sb.append(" FileType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FileType)+"'\n");
    sb.append(" FirstPublishLocation=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FirstPublishLocation)+"'\n");
    sb.append(" FirstPublishLocationId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FirstPublishLocationId)+"'\n");
    sb.append(" Histories=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Histories)+"'\n");
    sb.append(" IsAssetEnabled=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsAssetEnabled)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" IsLatest=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsLatest)+"'\n");
    sb.append(" IsMajorVersion=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsMajorVersion)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" NegativeRatingCount=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NegativeRatingCount)+"'\n");
    sb.append(" Origin=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Origin)+"'\n");
    sb.append(" Owner=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Owner)+"'\n");
    sb.append(" OwnerId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OwnerId)+"'\n");
    sb.append(" PathOnClient=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PathOnClient)+"'\n");
    sb.append(" PositiveRatingCount=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PositiveRatingCount)+"'\n");
    sb.append(" PublishStatus=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PublishStatus)+"'\n");
    sb.append(" RatingCount=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RatingCount)+"'\n");
    sb.append(" ReasonForChange=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ReasonForChange)+"'\n");
    sb.append(" RecordType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecordType)+"'\n");
    sb.append(" RecordTypeId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecordTypeId)+"'\n");
    sb.append(" SharingOption=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SharingOption)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" TagCsv=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TagCsv)+"'\n");
    sb.append(" TextPreview=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TextPreview)+"'\n");
    sb.append(" Title=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Title)+"'\n");
    sb.append(" VersionData=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VersionData)+"'\n");
    sb.append(" VersionNumber=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VersionNumber)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}