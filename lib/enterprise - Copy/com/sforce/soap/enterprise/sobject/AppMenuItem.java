package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class AppMenuItem extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public AppMenuItem() {
  }
    
  
  /**
   * element  : ApplicationId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ApplicationId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ApplicationId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ApplicationId__is_set = false;

  private java.lang.String ApplicationId;

  public java.lang.String getApplicationId() {
    return ApplicationId;
  }

  

  public void setApplicationId(java.lang.String ApplicationId) {
    this.ApplicationId = ApplicationId;
    ApplicationId__is_set = true;
  }
  
  /**
   * element  : CanvasAccessMethod of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CanvasAccessMethod__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CanvasAccessMethod","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean CanvasAccessMethod__is_set = false;

  private java.lang.String CanvasAccessMethod;

  public java.lang.String getCanvasAccessMethod() {
    return CanvasAccessMethod;
  }

  

  public void setCanvasAccessMethod(java.lang.String CanvasAccessMethod) {
    this.CanvasAccessMethod = CanvasAccessMethod;
    CanvasAccessMethod__is_set = true;
  }
  
  /**
   * element  : CanvasEnabled of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo CanvasEnabled__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CanvasEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean CanvasEnabled__is_set = false;

  private java.lang.Boolean CanvasEnabled;

  public java.lang.Boolean getCanvasEnabled() {
    return CanvasEnabled;
  }

  

  public void setCanvasEnabled(java.lang.Boolean CanvasEnabled) {
    this.CanvasEnabled = CanvasEnabled;
    CanvasEnabled__is_set = true;
  }
  
  /**
   * element  : CanvasOptions of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CanvasOptions__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CanvasOptions","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean CanvasOptions__is_set = false;

  private java.lang.String CanvasOptions;

  public java.lang.String getCanvasOptions() {
    return CanvasOptions;
  }

  

  public void setCanvasOptions(java.lang.String CanvasOptions) {
    this.CanvasOptions = CanvasOptions;
    CanvasOptions__is_set = true;
  }
  
  /**
   * element  : CanvasReferenceId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CanvasReferenceId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CanvasReferenceId","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean CanvasReferenceId__is_set = false;

  private java.lang.String CanvasReferenceId;

  public java.lang.String getCanvasReferenceId() {
    return CanvasReferenceId;
  }

  

  public void setCanvasReferenceId(java.lang.String CanvasReferenceId) {
    this.CanvasReferenceId = CanvasReferenceId;
    CanvasReferenceId__is_set = true;
  }
  
  /**
   * element  : CanvasSelectedLocations of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CanvasSelectedLocations__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CanvasSelectedLocations","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean CanvasSelectedLocations__is_set = false;

  private java.lang.String CanvasSelectedLocations;

  public java.lang.String getCanvasSelectedLocations() {
    return CanvasSelectedLocations;
  }

  

  public void setCanvasSelectedLocations(java.lang.String CanvasSelectedLocations) {
    this.CanvasSelectedLocations = CanvasSelectedLocations;
    CanvasSelectedLocations__is_set = true;
  }
  
  /**
   * element  : CanvasUrl of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CanvasUrl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CanvasUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean CanvasUrl__is_set = false;

  private java.lang.String CanvasUrl;

  public java.lang.String getCanvasUrl() {
    return CanvasUrl;
  }

  

  public void setCanvasUrl(java.lang.String CanvasUrl) {
    this.CanvasUrl = CanvasUrl;
    CanvasUrl__is_set = true;
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
   * element  : IconUrl of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo IconUrl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IconUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean IconUrl__is_set = false;

  private java.lang.String IconUrl;

  public java.lang.String getIconUrl() {
    return IconUrl;
  }

  

  public void setIconUrl(java.lang.String IconUrl) {
    this.IconUrl = IconUrl;
    IconUrl__is_set = true;
  }
  
  /**
   * element  : InfoUrl of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo InfoUrl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","InfoUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean InfoUrl__is_set = false;

  private java.lang.String InfoUrl;

  public java.lang.String getInfoUrl() {
    return InfoUrl;
  }

  

  public void setInfoUrl(java.lang.String InfoUrl) {
    this.InfoUrl = InfoUrl;
    InfoUrl__is_set = true;
  }
  
  /**
   * element  : IsAccessible of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsAccessible__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsAccessible","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsAccessible__is_set = false;

  private java.lang.Boolean IsAccessible;

  public java.lang.Boolean getIsAccessible() {
    return IsAccessible;
  }

  

  public void setIsAccessible(java.lang.Boolean IsAccessible) {
    this.IsAccessible = IsAccessible;
    IsAccessible__is_set = true;
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
   * element  : IsRegisteredDeviceOnly of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsRegisteredDeviceOnly__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsRegisteredDeviceOnly","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsRegisteredDeviceOnly__is_set = false;

  private java.lang.Boolean IsRegisteredDeviceOnly;

  public java.lang.Boolean getIsRegisteredDeviceOnly() {
    return IsRegisteredDeviceOnly;
  }

  

  public void setIsRegisteredDeviceOnly(java.lang.Boolean IsRegisteredDeviceOnly) {
    this.IsRegisteredDeviceOnly = IsRegisteredDeviceOnly;
    IsRegisteredDeviceOnly__is_set = true;
  }
  
  /**
   * element  : IsUsingAdminAuthorization of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsUsingAdminAuthorization__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsUsingAdminAuthorization","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsUsingAdminAuthorization__is_set = false;

  private java.lang.Boolean IsUsingAdminAuthorization;

  public java.lang.Boolean getIsUsingAdminAuthorization() {
    return IsUsingAdminAuthorization;
  }

  

  public void setIsUsingAdminAuthorization(java.lang.Boolean IsUsingAdminAuthorization) {
    this.IsUsingAdminAuthorization = IsUsingAdminAuthorization;
    IsUsingAdminAuthorization__is_set = true;
  }
  
  /**
   * element  : IsVisible of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsVisible__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsVisible","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsVisible__is_set = false;

  private java.lang.Boolean IsVisible;

  public java.lang.Boolean getIsVisible() {
    return IsVisible;
  }

  

  public void setIsVisible(java.lang.Boolean IsVisible) {
    this.IsVisible = IsVisible;
    IsVisible__is_set = true;
  }
  
  /**
   * element  : Label of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Label__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Label","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Label__is_set = false;

  private java.lang.String Label;

  public java.lang.String getLabel() {
    return Label;
  }

  

  public void setLabel(java.lang.String Label) {
    this.Label = Label;
    Label__is_set = true;
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
   * element  : LogoUrl of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LogoUrl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LogoUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean LogoUrl__is_set = false;

  private java.lang.String LogoUrl;

  public java.lang.String getLogoUrl() {
    return LogoUrl;
  }

  

  public void setLogoUrl(java.lang.String LogoUrl) {
    this.LogoUrl = LogoUrl;
    LogoUrl__is_set = true;
  }
  
  /**
   * element  : MobileAppBinaryId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo MobileAppBinaryId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MobileAppBinaryId","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean MobileAppBinaryId__is_set = false;

  private java.lang.String MobileAppBinaryId;

  public java.lang.String getMobileAppBinaryId() {
    return MobileAppBinaryId;
  }

  

  public void setMobileAppBinaryId(java.lang.String MobileAppBinaryId) {
    this.MobileAppBinaryId = MobileAppBinaryId;
    MobileAppBinaryId__is_set = true;
  }
  
  /**
   * element  : MobileAppInstallUrl of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo MobileAppInstallUrl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MobileAppInstallUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean MobileAppInstallUrl__is_set = false;

  private java.lang.String MobileAppInstallUrl;

  public java.lang.String getMobileAppInstallUrl() {
    return MobileAppInstallUrl;
  }

  

  public void setMobileAppInstallUrl(java.lang.String MobileAppInstallUrl) {
    this.MobileAppInstallUrl = MobileAppInstallUrl;
    MobileAppInstallUrl__is_set = true;
  }
  
  /**
   * element  : MobileAppInstalledDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo MobileAppInstalledDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MobileAppInstalledDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean MobileAppInstalledDate__is_set = false;

  private java.util.Calendar MobileAppInstalledDate;

  public java.util.Calendar getMobileAppInstalledDate() {
    return MobileAppInstalledDate;
  }

  

  public void setMobileAppInstalledDate(java.util.Calendar MobileAppInstalledDate) {
    this.MobileAppInstalledDate = MobileAppInstalledDate;
    MobileAppInstalledDate__is_set = true;
  }
  
  /**
   * element  : MobileAppInstalledVersion of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo MobileAppInstalledVersion__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MobileAppInstalledVersion","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean MobileAppInstalledVersion__is_set = false;

  private java.lang.String MobileAppInstalledVersion;

  public java.lang.String getMobileAppInstalledVersion() {
    return MobileAppInstalledVersion;
  }

  

  public void setMobileAppInstalledVersion(java.lang.String MobileAppInstalledVersion) {
    this.MobileAppInstalledVersion = MobileAppInstalledVersion;
    MobileAppInstalledVersion__is_set = true;
  }
  
  /**
   * element  : MobileAppVer of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo MobileAppVer__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MobileAppVer","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean MobileAppVer__is_set = false;

  private java.lang.String MobileAppVer;

  public java.lang.String getMobileAppVer() {
    return MobileAppVer;
  }

  

  public void setMobileAppVer(java.lang.String MobileAppVer) {
    this.MobileAppVer = MobileAppVer;
    MobileAppVer__is_set = true;
  }
  
  /**
   * element  : MobileDeviceType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo MobileDeviceType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MobileDeviceType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean MobileDeviceType__is_set = false;

  private java.lang.String MobileDeviceType;

  public java.lang.String getMobileDeviceType() {
    return MobileDeviceType;
  }

  

  public void setMobileDeviceType(java.lang.String MobileDeviceType) {
    this.MobileDeviceType = MobileDeviceType;
    MobileDeviceType__is_set = true;
  }
  
  /**
   * element  : MobileMinOsVer of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo MobileMinOsVer__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MobileMinOsVer","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean MobileMinOsVer__is_set = false;

  private java.lang.String MobileMinOsVer;

  public java.lang.String getMobileMinOsVer() {
    return MobileMinOsVer;
  }

  

  public void setMobileMinOsVer(java.lang.String MobileMinOsVer) {
    this.MobileMinOsVer = MobileMinOsVer;
    MobileMinOsVer__is_set = true;
  }
  
  /**
   * element  : MobilePlatform of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo MobilePlatform__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MobilePlatform","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean MobilePlatform__is_set = false;

  private java.lang.String MobilePlatform;

  public java.lang.String getMobilePlatform() {
    return MobilePlatform;
  }

  

  public void setMobilePlatform(java.lang.String MobilePlatform) {
    this.MobilePlatform = MobilePlatform;
    MobilePlatform__is_set = true;
  }
  
  /**
   * element  : MobileStartUrl of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo MobileStartUrl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MobileStartUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean MobileStartUrl__is_set = false;

  private java.lang.String MobileStartUrl;

  public java.lang.String getMobileStartUrl() {
    return MobileStartUrl;
  }

  

  public void setMobileStartUrl(java.lang.String MobileStartUrl) {
    this.MobileStartUrl = MobileStartUrl;
    MobileStartUrl__is_set = true;
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
   * element  : SortOrder of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo SortOrder__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SortOrder","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean SortOrder__is_set = false;

  private java.lang.Integer SortOrder;

  public java.lang.Integer getSortOrder() {
    return SortOrder;
  }

  

  public void setSortOrder(java.lang.Integer SortOrder) {
    this.SortOrder = SortOrder;
    SortOrder__is_set = true;
  }
  
  /**
   * element  : StartUrl of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo StartUrl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","StartUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean StartUrl__is_set = false;

  private java.lang.String StartUrl;

  public java.lang.String getStartUrl() {
    return StartUrl;
  }

  

  public void setStartUrl(java.lang.String StartUrl) {
    this.StartUrl = StartUrl;
    StartUrl__is_set = true;
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
   * element  : Type of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Type__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Type","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Type__is_set = false;

  private java.lang.String Type;

  public java.lang.String getType() {
    return Type;
  }

  

  public void setType(java.lang.String Type) {
    this.Type = Type;
    Type__is_set = true;
  }
  
  /**
   * element  : UserSortOrder of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo UserSortOrder__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserSortOrder","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean UserSortOrder__is_set = false;

  private java.lang.Integer UserSortOrder;

  public java.lang.Integer getUserSortOrder() {
    return UserSortOrder;
  }

  

  public void setUserSortOrder(java.lang.Integer UserSortOrder) {
    this.UserSortOrder = UserSortOrder;
    UserSortOrder__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "AppMenuItem");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, ApplicationId__typeInfo, ApplicationId, ApplicationId__is_set);
    __typeMapper.writeString(__out, CanvasAccessMethod__typeInfo, CanvasAccessMethod, CanvasAccessMethod__is_set);
    __typeMapper.writeObject(__out, CanvasEnabled__typeInfo, CanvasEnabled, CanvasEnabled__is_set);
    __typeMapper.writeString(__out, CanvasOptions__typeInfo, CanvasOptions, CanvasOptions__is_set);
    __typeMapper.writeString(__out, CanvasReferenceId__typeInfo, CanvasReferenceId, CanvasReferenceId__is_set);
    __typeMapper.writeString(__out, CanvasSelectedLocations__typeInfo, CanvasSelectedLocations, CanvasSelectedLocations__is_set);
    __typeMapper.writeString(__out, CanvasUrl__typeInfo, CanvasUrl, CanvasUrl__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, Description__typeInfo, Description, Description__is_set);
    __typeMapper.writeString(__out, IconUrl__typeInfo, IconUrl, IconUrl__is_set);
    __typeMapper.writeString(__out, InfoUrl__typeInfo, InfoUrl, InfoUrl__is_set);
    __typeMapper.writeObject(__out, IsAccessible__typeInfo, IsAccessible, IsAccessible__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, IsRegisteredDeviceOnly__typeInfo, IsRegisteredDeviceOnly, IsRegisteredDeviceOnly__is_set);
    __typeMapper.writeObject(__out, IsUsingAdminAuthorization__typeInfo, IsUsingAdminAuthorization, IsUsingAdminAuthorization__is_set);
    __typeMapper.writeObject(__out, IsVisible__typeInfo, IsVisible, IsVisible__is_set);
    __typeMapper.writeString(__out, Label__typeInfo, Label, Label__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeString(__out, LogoUrl__typeInfo, LogoUrl, LogoUrl__is_set);
    __typeMapper.writeString(__out, MobileAppBinaryId__typeInfo, MobileAppBinaryId, MobileAppBinaryId__is_set);
    __typeMapper.writeString(__out, MobileAppInstallUrl__typeInfo, MobileAppInstallUrl, MobileAppInstallUrl__is_set);
    __typeMapper.writeObject(__out, MobileAppInstalledDate__typeInfo, MobileAppInstalledDate, MobileAppInstalledDate__is_set);
    __typeMapper.writeString(__out, MobileAppInstalledVersion__typeInfo, MobileAppInstalledVersion, MobileAppInstalledVersion__is_set);
    __typeMapper.writeString(__out, MobileAppVer__typeInfo, MobileAppVer, MobileAppVer__is_set);
    __typeMapper.writeString(__out, MobileDeviceType__typeInfo, MobileDeviceType, MobileDeviceType__is_set);
    __typeMapper.writeString(__out, MobileMinOsVer__typeInfo, MobileMinOsVer, MobileMinOsVer__is_set);
    __typeMapper.writeString(__out, MobilePlatform__typeInfo, MobilePlatform, MobilePlatform__is_set);
    __typeMapper.writeString(__out, MobileStartUrl__typeInfo, MobileStartUrl, MobileStartUrl__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeString(__out, NamespacePrefix__typeInfo, NamespacePrefix, NamespacePrefix__is_set);
    __typeMapper.writeObject(__out, SortOrder__typeInfo, SortOrder, SortOrder__is_set);
    __typeMapper.writeString(__out, StartUrl__typeInfo, StartUrl, StartUrl__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeString(__out, Type__typeInfo, Type, Type__is_set);
    __typeMapper.writeObject(__out, UserSortOrder__typeInfo, UserSortOrder, UserSortOrder__is_set);
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
    if (__typeMapper.isElement(__in, ApplicationId__typeInfo)) {
      setApplicationId((java.lang.String)__typeMapper.readString(__in, ApplicationId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CanvasAccessMethod__typeInfo)) {
      setCanvasAccessMethod((java.lang.String)__typeMapper.readString(__in, CanvasAccessMethod__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CanvasEnabled__typeInfo)) {
      setCanvasEnabled((java.lang.Boolean)__typeMapper.readObject(__in, CanvasEnabled__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CanvasOptions__typeInfo)) {
      setCanvasOptions((java.lang.String)__typeMapper.readString(__in, CanvasOptions__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CanvasReferenceId__typeInfo)) {
      setCanvasReferenceId((java.lang.String)__typeMapper.readString(__in, CanvasReferenceId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CanvasSelectedLocations__typeInfo)) {
      setCanvasSelectedLocations((java.lang.String)__typeMapper.readString(__in, CanvasSelectedLocations__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CanvasUrl__typeInfo)) {
      setCanvasUrl((java.lang.String)__typeMapper.readString(__in, CanvasUrl__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, IconUrl__typeInfo)) {
      setIconUrl((java.lang.String)__typeMapper.readString(__in, IconUrl__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, InfoUrl__typeInfo)) {
      setInfoUrl((java.lang.String)__typeMapper.readString(__in, InfoUrl__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsAccessible__typeInfo)) {
      setIsAccessible((java.lang.Boolean)__typeMapper.readObject(__in, IsAccessible__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {
      setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, IsDeleted__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsRegisteredDeviceOnly__typeInfo)) {
      setIsRegisteredDeviceOnly((java.lang.Boolean)__typeMapper.readObject(__in, IsRegisteredDeviceOnly__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsUsingAdminAuthorization__typeInfo)) {
      setIsUsingAdminAuthorization((java.lang.Boolean)__typeMapper.readObject(__in, IsUsingAdminAuthorization__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsVisible__typeInfo)) {
      setIsVisible((java.lang.Boolean)__typeMapper.readObject(__in, IsVisible__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Label__typeInfo)) {
      setLabel((java.lang.String)__typeMapper.readString(__in, Label__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, LogoUrl__typeInfo)) {
      setLogoUrl((java.lang.String)__typeMapper.readString(__in, LogoUrl__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MobileAppBinaryId__typeInfo)) {
      setMobileAppBinaryId((java.lang.String)__typeMapper.readString(__in, MobileAppBinaryId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MobileAppInstallUrl__typeInfo)) {
      setMobileAppInstallUrl((java.lang.String)__typeMapper.readString(__in, MobileAppInstallUrl__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MobileAppInstalledDate__typeInfo)) {
      setMobileAppInstalledDate((java.util.Calendar)__typeMapper.readObject(__in, MobileAppInstalledDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MobileAppInstalledVersion__typeInfo)) {
      setMobileAppInstalledVersion((java.lang.String)__typeMapper.readString(__in, MobileAppInstalledVersion__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MobileAppVer__typeInfo)) {
      setMobileAppVer((java.lang.String)__typeMapper.readString(__in, MobileAppVer__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MobileDeviceType__typeInfo)) {
      setMobileDeviceType((java.lang.String)__typeMapper.readString(__in, MobileDeviceType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MobileMinOsVer__typeInfo)) {
      setMobileMinOsVer((java.lang.String)__typeMapper.readString(__in, MobileMinOsVer__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MobilePlatform__typeInfo)) {
      setMobilePlatform((java.lang.String)__typeMapper.readString(__in, MobilePlatform__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MobileStartUrl__typeInfo)) {
      setMobileStartUrl((java.lang.String)__typeMapper.readString(__in, MobileStartUrl__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, SortOrder__typeInfo)) {
      setSortOrder((java.lang.Integer)__typeMapper.readObject(__in, SortOrder__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, StartUrl__typeInfo)) {
      setStartUrl((java.lang.String)__typeMapper.readString(__in, StartUrl__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Type__typeInfo)) {
      setType((java.lang.String)__typeMapper.readString(__in, Type__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserSortOrder__typeInfo)) {
      setUserSortOrder((java.lang.Integer)__typeMapper.readObject(__in, UserSortOrder__typeInfo, java.lang.Integer.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[AppMenuItem ");
    sb.append(super.toString());
    sb.append(" ApplicationId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ApplicationId)+"'\n");
    sb.append(" CanvasAccessMethod=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CanvasAccessMethod)+"'\n");
    sb.append(" CanvasEnabled=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CanvasEnabled)+"'\n");
    sb.append(" CanvasOptions=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CanvasOptions)+"'\n");
    sb.append(" CanvasReferenceId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CanvasReferenceId)+"'\n");
    sb.append(" CanvasSelectedLocations=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CanvasSelectedLocations)+"'\n");
    sb.append(" CanvasUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CanvasUrl)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" Description=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Description)+"'\n");
    sb.append(" IconUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IconUrl)+"'\n");
    sb.append(" InfoUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(InfoUrl)+"'\n");
    sb.append(" IsAccessible=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsAccessible)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" IsRegisteredDeviceOnly=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsRegisteredDeviceOnly)+"'\n");
    sb.append(" IsUsingAdminAuthorization=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsUsingAdminAuthorization)+"'\n");
    sb.append(" IsVisible=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsVisible)+"'\n");
    sb.append(" Label=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Label)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" LogoUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LogoUrl)+"'\n");
    sb.append(" MobileAppBinaryId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MobileAppBinaryId)+"'\n");
    sb.append(" MobileAppInstallUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MobileAppInstallUrl)+"'\n");
    sb.append(" MobileAppInstalledDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MobileAppInstalledDate)+"'\n");
    sb.append(" MobileAppInstalledVersion=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MobileAppInstalledVersion)+"'\n");
    sb.append(" MobileAppVer=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MobileAppVer)+"'\n");
    sb.append(" MobileDeviceType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MobileDeviceType)+"'\n");
    sb.append(" MobileMinOsVer=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MobileMinOsVer)+"'\n");
    sb.append(" MobilePlatform=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MobilePlatform)+"'\n");
    sb.append(" MobileStartUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MobileStartUrl)+"'\n");
    sb.append(" Name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");
    sb.append(" NamespacePrefix=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NamespacePrefix)+"'\n");
    sb.append(" SortOrder=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SortOrder)+"'\n");
    sb.append(" StartUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(StartUrl)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" Type=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Type)+"'\n");
    sb.append(" UserSortOrder=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserSortOrder)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}