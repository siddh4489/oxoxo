package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class Site extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public Site() {
  }
    
  
  /**
   * element  : Admin of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo Admin__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Admin","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean Admin__is_set = false;

  private com.sforce.soap.enterprise.sobject.User Admin;

  public com.sforce.soap.enterprise.sobject.User getAdmin() {
    return Admin;
  }

  

  public void setAdmin(com.sforce.soap.enterprise.sobject.User Admin) {
    this.Admin = Admin;
    Admin__is_set = true;
  }
  
  /**
   * element  : AdminId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AdminId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AdminId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean AdminId__is_set = false;

  private java.lang.String AdminId;

  public java.lang.String getAdminId() {
    return AdminId;
  }

  

  public void setAdminId(java.lang.String AdminId) {
    this.AdminId = AdminId;
    AdminId__is_set = true;
  }
  
  /**
   * element  : AnalyticsTrackingCode of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AnalyticsTrackingCode__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AnalyticsTrackingCode","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean AnalyticsTrackingCode__is_set = false;

  private java.lang.String AnalyticsTrackingCode;

  public java.lang.String getAnalyticsTrackingCode() {
    return AnalyticsTrackingCode;
  }

  

  public void setAnalyticsTrackingCode(java.lang.String AnalyticsTrackingCode) {
    this.AnalyticsTrackingCode = AnalyticsTrackingCode;
    AnalyticsTrackingCode__is_set = true;
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
   * element  : ClickjackProtectionLevel of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ClickjackProtectionLevel__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ClickjackProtectionLevel","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ClickjackProtectionLevel__is_set = false;

  private java.lang.String ClickjackProtectionLevel;

  public java.lang.String getClickjackProtectionLevel() {
    return ClickjackProtectionLevel;
  }

  

  public void setClickjackProtectionLevel(java.lang.String ClickjackProtectionLevel) {
    this.ClickjackProtectionLevel = ClickjackProtectionLevel;
    ClickjackProtectionLevel__is_set = true;
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
   * element  : DailyBandwidthLimit of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo DailyBandwidthLimit__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DailyBandwidthLimit","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean DailyBandwidthLimit__is_set = false;

  private java.lang.Integer DailyBandwidthLimit;

  public java.lang.Integer getDailyBandwidthLimit() {
    return DailyBandwidthLimit;
  }

  

  public void setDailyBandwidthLimit(java.lang.Integer DailyBandwidthLimit) {
    this.DailyBandwidthLimit = DailyBandwidthLimit;
    DailyBandwidthLimit__is_set = true;
  }
  
  /**
   * element  : DailyBandwidthUsed of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo DailyBandwidthUsed__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DailyBandwidthUsed","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean DailyBandwidthUsed__is_set = false;

  private java.lang.Integer DailyBandwidthUsed;

  public java.lang.Integer getDailyBandwidthUsed() {
    return DailyBandwidthUsed;
  }

  

  public void setDailyBandwidthUsed(java.lang.Integer DailyBandwidthUsed) {
    this.DailyBandwidthUsed = DailyBandwidthUsed;
    DailyBandwidthUsed__is_set = true;
  }
  
  /**
   * element  : DailyRequestTimeLimit of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo DailyRequestTimeLimit__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DailyRequestTimeLimit","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean DailyRequestTimeLimit__is_set = false;

  private java.lang.Integer DailyRequestTimeLimit;

  public java.lang.Integer getDailyRequestTimeLimit() {
    return DailyRequestTimeLimit;
  }

  

  public void setDailyRequestTimeLimit(java.lang.Integer DailyRequestTimeLimit) {
    this.DailyRequestTimeLimit = DailyRequestTimeLimit;
    DailyRequestTimeLimit__is_set = true;
  }
  
  /**
   * element  : DailyRequestTimeUsed of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo DailyRequestTimeUsed__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DailyRequestTimeUsed","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean DailyRequestTimeUsed__is_set = false;

  private java.lang.Integer DailyRequestTimeUsed;

  public java.lang.Integer getDailyRequestTimeUsed() {
    return DailyRequestTimeUsed;
  }

  

  public void setDailyRequestTimeUsed(java.lang.Integer DailyRequestTimeUsed) {
    this.DailyRequestTimeUsed = DailyRequestTimeUsed;
    DailyRequestTimeUsed__is_set = true;
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
   * element  : FeedSubscriptionsForEntity of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo FeedSubscriptionsForEntity__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FeedSubscriptionsForEntity","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean FeedSubscriptionsForEntity__is_set = false;

  private com.sforce.soap.enterprise.QueryResult FeedSubscriptionsForEntity;

  public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
    return FeedSubscriptionsForEntity;
  }

  

  public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult FeedSubscriptionsForEntity) {
    this.FeedSubscriptionsForEntity = FeedSubscriptionsForEntity;
    FeedSubscriptionsForEntity__is_set = true;
  }
  
  /**
   * element  : Feeds of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Feeds__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Feeds","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Feeds__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Feeds;

  public com.sforce.soap.enterprise.QueryResult getFeeds() {
    return Feeds;
  }

  

  public void setFeeds(com.sforce.soap.enterprise.QueryResult Feeds) {
    this.Feeds = Feeds;
    Feeds__is_set = true;
  }
  
  /**
   * element  : GuestUser of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo GuestUser__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","GuestUser","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean GuestUser__is_set = false;

  private com.sforce.soap.enterprise.sobject.User GuestUser;

  public com.sforce.soap.enterprise.sobject.User getGuestUser() {
    return GuestUser;
  }

  

  public void setGuestUser(com.sforce.soap.enterprise.sobject.User GuestUser) {
    this.GuestUser = GuestUser;
    GuestUser__is_set = true;
  }
  
  /**
   * element  : GuestUserId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo GuestUserId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","GuestUserId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean GuestUserId__is_set = false;

  private java.lang.String GuestUserId;

  public java.lang.String getGuestUserId() {
    return GuestUserId;
  }

  

  public void setGuestUserId(java.lang.String GuestUserId) {
    this.GuestUserId = GuestUserId;
    GuestUserId__is_set = true;
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
   * element  : MasterLabel of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo MasterLabel__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MasterLabel","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean MasterLabel__is_set = false;

  private java.lang.String MasterLabel;

  public java.lang.String getMasterLabel() {
    return MasterLabel;
  }

  

  public void setMasterLabel(java.lang.String MasterLabel) {
    this.MasterLabel = MasterLabel;
    MasterLabel__is_set = true;
  }
  
  /**
   * element  : MonthlyPageViewsEntitlement of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo MonthlyPageViewsEntitlement__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MonthlyPageViewsEntitlement","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean MonthlyPageViewsEntitlement__is_set = false;

  private java.lang.Integer MonthlyPageViewsEntitlement;

  public java.lang.Integer getMonthlyPageViewsEntitlement() {
    return MonthlyPageViewsEntitlement;
  }

  

  public void setMonthlyPageViewsEntitlement(java.lang.Integer MonthlyPageViewsEntitlement) {
    this.MonthlyPageViewsEntitlement = MonthlyPageViewsEntitlement;
    MonthlyPageViewsEntitlement__is_set = true;
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
   * element  : OptionsAllowGuestSupportApi of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo OptionsAllowGuestSupportApi__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OptionsAllowGuestSupportApi","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean OptionsAllowGuestSupportApi__is_set = false;

  private java.lang.Boolean OptionsAllowGuestSupportApi;

  public java.lang.Boolean getOptionsAllowGuestSupportApi() {
    return OptionsAllowGuestSupportApi;
  }

  

  public void setOptionsAllowGuestSupportApi(java.lang.Boolean OptionsAllowGuestSupportApi) {
    this.OptionsAllowGuestSupportApi = OptionsAllowGuestSupportApi;
    OptionsAllowGuestSupportApi__is_set = true;
  }
  
  /**
   * element  : OptionsAllowHomePage of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo OptionsAllowHomePage__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OptionsAllowHomePage","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean OptionsAllowHomePage__is_set = false;

  private java.lang.Boolean OptionsAllowHomePage;

  public java.lang.Boolean getOptionsAllowHomePage() {
    return OptionsAllowHomePage;
  }

  

  public void setOptionsAllowHomePage(java.lang.Boolean OptionsAllowHomePage) {
    this.OptionsAllowHomePage = OptionsAllowHomePage;
    OptionsAllowHomePage__is_set = true;
  }
  
  /**
   * element  : OptionsAllowStandardAnswersPages of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo OptionsAllowStandardAnswersPages__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OptionsAllowStandardAnswersPages","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean OptionsAllowStandardAnswersPages__is_set = false;

  private java.lang.Boolean OptionsAllowStandardAnswersPages;

  public java.lang.Boolean getOptionsAllowStandardAnswersPages() {
    return OptionsAllowStandardAnswersPages;
  }

  

  public void setOptionsAllowStandardAnswersPages(java.lang.Boolean OptionsAllowStandardAnswersPages) {
    this.OptionsAllowStandardAnswersPages = OptionsAllowStandardAnswersPages;
    OptionsAllowStandardAnswersPages__is_set = true;
  }
  
  /**
   * element  : OptionsAllowStandardIdeasPages of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo OptionsAllowStandardIdeasPages__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OptionsAllowStandardIdeasPages","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean OptionsAllowStandardIdeasPages__is_set = false;

  private java.lang.Boolean OptionsAllowStandardIdeasPages;

  public java.lang.Boolean getOptionsAllowStandardIdeasPages() {
    return OptionsAllowStandardIdeasPages;
  }

  

  public void setOptionsAllowStandardIdeasPages(java.lang.Boolean OptionsAllowStandardIdeasPages) {
    this.OptionsAllowStandardIdeasPages = OptionsAllowStandardIdeasPages;
    OptionsAllowStandardIdeasPages__is_set = true;
  }
  
  /**
   * element  : OptionsAllowStandardLookups of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo OptionsAllowStandardLookups__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OptionsAllowStandardLookups","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean OptionsAllowStandardLookups__is_set = false;

  private java.lang.Boolean OptionsAllowStandardLookups;

  public java.lang.Boolean getOptionsAllowStandardLookups() {
    return OptionsAllowStandardLookups;
  }

  

  public void setOptionsAllowStandardLookups(java.lang.Boolean OptionsAllowStandardLookups) {
    this.OptionsAllowStandardLookups = OptionsAllowStandardLookups;
    OptionsAllowStandardLookups__is_set = true;
  }
  
  /**
   * element  : OptionsAllowStandardSearch of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo OptionsAllowStandardSearch__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OptionsAllowStandardSearch","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean OptionsAllowStandardSearch__is_set = false;

  private java.lang.Boolean OptionsAllowStandardSearch;

  public java.lang.Boolean getOptionsAllowStandardSearch() {
    return OptionsAllowStandardSearch;
  }

  

  public void setOptionsAllowStandardSearch(java.lang.Boolean OptionsAllowStandardSearch) {
    this.OptionsAllowStandardSearch = OptionsAllowStandardSearch;
    OptionsAllowStandardSearch__is_set = true;
  }
  
  /**
   * element  : OptionsEnableFeeds of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo OptionsEnableFeeds__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OptionsEnableFeeds","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean OptionsEnableFeeds__is_set = false;

  private java.lang.Boolean OptionsEnableFeeds;

  public java.lang.Boolean getOptionsEnableFeeds() {
    return OptionsEnableFeeds;
  }

  

  public void setOptionsEnableFeeds(java.lang.Boolean OptionsEnableFeeds) {
    this.OptionsEnableFeeds = OptionsEnableFeeds;
    OptionsEnableFeeds__is_set = true;
  }
  
  /**
   * element  : OptionsRequireHttps of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo OptionsRequireHttps__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OptionsRequireHttps","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean OptionsRequireHttps__is_set = false;

  private java.lang.Boolean OptionsRequireHttps;

  public java.lang.Boolean getOptionsRequireHttps() {
    return OptionsRequireHttps;
  }

  

  public void setOptionsRequireHttps(java.lang.Boolean OptionsRequireHttps) {
    this.OptionsRequireHttps = OptionsRequireHttps;
    OptionsRequireHttps__is_set = true;
  }
  
  /**
   * element  : SiteDomainPaths of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo SiteDomainPaths__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SiteDomainPaths","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean SiteDomainPaths__is_set = false;

  private com.sforce.soap.enterprise.QueryResult SiteDomainPaths;

  public com.sforce.soap.enterprise.QueryResult getSiteDomainPaths() {
    return SiteDomainPaths;
  }

  

  public void setSiteDomainPaths(com.sforce.soap.enterprise.QueryResult SiteDomainPaths) {
    this.SiteDomainPaths = SiteDomainPaths;
    SiteDomainPaths__is_set = true;
  }
  
  /**
   * element  : SiteType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo SiteType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SiteType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean SiteType__is_set = false;

  private java.lang.String SiteType;

  public java.lang.String getSiteType() {
    return SiteType;
  }

  

  public void setSiteType(java.lang.String SiteType) {
    this.SiteType = SiteType;
    SiteType__is_set = true;
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
   * element  : Subdomain of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Subdomain__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Subdomain","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Subdomain__is_set = false;

  private java.lang.String Subdomain;

  public java.lang.String getSubdomain() {
    return Subdomain;
  }

  

  public void setSubdomain(java.lang.String Subdomain) {
    this.Subdomain = Subdomain;
    Subdomain__is_set = true;
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
   * element  : UrlPathPrefix of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo UrlPathPrefix__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UrlPathPrefix","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean UrlPathPrefix__is_set = false;

  private java.lang.String UrlPathPrefix;

  public java.lang.String getUrlPathPrefix() {
    return UrlPathPrefix;
  }

  

  public void setUrlPathPrefix(java.lang.String UrlPathPrefix) {
    this.UrlPathPrefix = UrlPathPrefix;
    UrlPathPrefix__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "Site");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, Admin__typeInfo, Admin, Admin__is_set);
    __typeMapper.writeString(__out, AdminId__typeInfo, AdminId, AdminId__is_set);
    __typeMapper.writeString(__out, AnalyticsTrackingCode__typeInfo, AnalyticsTrackingCode, AnalyticsTrackingCode__is_set);
    __typeMapper.writeObject(__out, AttachedContentDocuments__typeInfo, AttachedContentDocuments, AttachedContentDocuments__is_set);
    __typeMapper.writeObject(__out, AttachedContentNotes__typeInfo, AttachedContentNotes, AttachedContentNotes__is_set);
    __typeMapper.writeString(__out, ClickjackProtectionLevel__typeInfo, ClickjackProtectionLevel, ClickjackProtectionLevel__is_set);
    __typeMapper.writeObject(__out, CombinedAttachments__typeInfo, CombinedAttachments, CombinedAttachments__is_set);
    __typeMapper.writeObject(__out, ContentDocumentLinks__typeInfo, ContentDocumentLinks, ContentDocumentLinks__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeObject(__out, DailyBandwidthLimit__typeInfo, DailyBandwidthLimit, DailyBandwidthLimit__is_set);
    __typeMapper.writeObject(__out, DailyBandwidthUsed__typeInfo, DailyBandwidthUsed, DailyBandwidthUsed__is_set);
    __typeMapper.writeObject(__out, DailyRequestTimeLimit__typeInfo, DailyRequestTimeLimit, DailyRequestTimeLimit__is_set);
    __typeMapper.writeObject(__out, DailyRequestTimeUsed__typeInfo, DailyRequestTimeUsed, DailyRequestTimeUsed__is_set);
    __typeMapper.writeString(__out, Description__typeInfo, Description, Description__is_set);
    __typeMapper.writeObject(__out, FeedSubscriptionsForEntity__typeInfo, FeedSubscriptionsForEntity, FeedSubscriptionsForEntity__is_set);
    __typeMapper.writeObject(__out, Feeds__typeInfo, Feeds, Feeds__is_set);
    __typeMapper.writeObject(__out, GuestUser__typeInfo, GuestUser, GuestUser__is_set);
    __typeMapper.writeString(__out, GuestUserId__typeInfo, GuestUserId, GuestUserId__is_set);
    __typeMapper.writeObject(__out, Histories__typeInfo, Histories, Histories__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeString(__out, MasterLabel__typeInfo, MasterLabel, MasterLabel__is_set);
    __typeMapper.writeObject(__out, MonthlyPageViewsEntitlement__typeInfo, MonthlyPageViewsEntitlement, MonthlyPageViewsEntitlement__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeObject(__out, OptionsAllowGuestSupportApi__typeInfo, OptionsAllowGuestSupportApi, OptionsAllowGuestSupportApi__is_set);
    __typeMapper.writeObject(__out, OptionsAllowHomePage__typeInfo, OptionsAllowHomePage, OptionsAllowHomePage__is_set);
    __typeMapper.writeObject(__out, OptionsAllowStandardAnswersPages__typeInfo, OptionsAllowStandardAnswersPages, OptionsAllowStandardAnswersPages__is_set);
    __typeMapper.writeObject(__out, OptionsAllowStandardIdeasPages__typeInfo, OptionsAllowStandardIdeasPages, OptionsAllowStandardIdeasPages__is_set);
    __typeMapper.writeObject(__out, OptionsAllowStandardLookups__typeInfo, OptionsAllowStandardLookups, OptionsAllowStandardLookups__is_set);
    __typeMapper.writeObject(__out, OptionsAllowStandardSearch__typeInfo, OptionsAllowStandardSearch, OptionsAllowStandardSearch__is_set);
    __typeMapper.writeObject(__out, OptionsEnableFeeds__typeInfo, OptionsEnableFeeds, OptionsEnableFeeds__is_set);
    __typeMapper.writeObject(__out, OptionsRequireHttps__typeInfo, OptionsRequireHttps, OptionsRequireHttps__is_set);
    __typeMapper.writeObject(__out, SiteDomainPaths__typeInfo, SiteDomainPaths, SiteDomainPaths__is_set);
    __typeMapper.writeString(__out, SiteType__typeInfo, SiteType, SiteType__is_set);
    __typeMapper.writeString(__out, Status__typeInfo, Status, Status__is_set);
    __typeMapper.writeString(__out, Subdomain__typeInfo, Subdomain, Subdomain__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeString(__out, UrlPathPrefix__typeInfo, UrlPathPrefix, UrlPathPrefix__is_set);
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
    if (__typeMapper.isElement(__in, Admin__typeInfo)) {
      setAdmin((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, Admin__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AdminId__typeInfo)) {
      setAdminId((java.lang.String)__typeMapper.readString(__in, AdminId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AnalyticsTrackingCode__typeInfo)) {
      setAnalyticsTrackingCode((java.lang.String)__typeMapper.readString(__in, AnalyticsTrackingCode__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, ClickjackProtectionLevel__typeInfo)) {
      setClickjackProtectionLevel((java.lang.String)__typeMapper.readString(__in, ClickjackProtectionLevel__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, DailyBandwidthLimit__typeInfo)) {
      setDailyBandwidthLimit((java.lang.Integer)__typeMapper.readObject(__in, DailyBandwidthLimit__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DailyBandwidthUsed__typeInfo)) {
      setDailyBandwidthUsed((java.lang.Integer)__typeMapper.readObject(__in, DailyBandwidthUsed__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DailyRequestTimeLimit__typeInfo)) {
      setDailyRequestTimeLimit((java.lang.Integer)__typeMapper.readObject(__in, DailyRequestTimeLimit__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DailyRequestTimeUsed__typeInfo)) {
      setDailyRequestTimeUsed((java.lang.Integer)__typeMapper.readObject(__in, DailyRequestTimeUsed__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Description__typeInfo)) {
      setDescription((java.lang.String)__typeMapper.readString(__in, Description__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FeedSubscriptionsForEntity__typeInfo)) {
      setFeedSubscriptionsForEntity((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, FeedSubscriptionsForEntity__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Feeds__typeInfo)) {
      setFeeds((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Feeds__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, GuestUser__typeInfo)) {
      setGuestUser((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, GuestUser__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, GuestUserId__typeInfo)) {
      setGuestUserId((java.lang.String)__typeMapper.readString(__in, GuestUserId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Histories__typeInfo)) {
      setHistories((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Histories__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    if (__typeMapper.isElement(__in, MasterLabel__typeInfo)) {
      setMasterLabel((java.lang.String)__typeMapper.readString(__in, MasterLabel__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MonthlyPageViewsEntitlement__typeInfo)) {
      setMonthlyPageViewsEntitlement((java.lang.Integer)__typeMapper.readObject(__in, MonthlyPageViewsEntitlement__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Name__typeInfo)) {
      setName((java.lang.String)__typeMapper.readString(__in, Name__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OptionsAllowGuestSupportApi__typeInfo)) {
      setOptionsAllowGuestSupportApi((java.lang.Boolean)__typeMapper.readObject(__in, OptionsAllowGuestSupportApi__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OptionsAllowHomePage__typeInfo)) {
      setOptionsAllowHomePage((java.lang.Boolean)__typeMapper.readObject(__in, OptionsAllowHomePage__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OptionsAllowStandardAnswersPages__typeInfo)) {
      setOptionsAllowStandardAnswersPages((java.lang.Boolean)__typeMapper.readObject(__in, OptionsAllowStandardAnswersPages__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OptionsAllowStandardIdeasPages__typeInfo)) {
      setOptionsAllowStandardIdeasPages((java.lang.Boolean)__typeMapper.readObject(__in, OptionsAllowStandardIdeasPages__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OptionsAllowStandardLookups__typeInfo)) {
      setOptionsAllowStandardLookups((java.lang.Boolean)__typeMapper.readObject(__in, OptionsAllowStandardLookups__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OptionsAllowStandardSearch__typeInfo)) {
      setOptionsAllowStandardSearch((java.lang.Boolean)__typeMapper.readObject(__in, OptionsAllowStandardSearch__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OptionsEnableFeeds__typeInfo)) {
      setOptionsEnableFeeds((java.lang.Boolean)__typeMapper.readObject(__in, OptionsEnableFeeds__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OptionsRequireHttps__typeInfo)) {
      setOptionsRequireHttps((java.lang.Boolean)__typeMapper.readObject(__in, OptionsRequireHttps__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SiteDomainPaths__typeInfo)) {
      setSiteDomainPaths((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, SiteDomainPaths__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SiteType__typeInfo)) {
      setSiteType((java.lang.String)__typeMapper.readString(__in, SiteType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Status__typeInfo)) {
      setStatus((java.lang.String)__typeMapper.readString(__in, Status__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Subdomain__typeInfo)) {
      setSubdomain((java.lang.String)__typeMapper.readString(__in, Subdomain__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UrlPathPrefix__typeInfo)) {
      setUrlPathPrefix((java.lang.String)__typeMapper.readString(__in, UrlPathPrefix__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[Site ");
    sb.append(super.toString());
    sb.append(" Admin=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Admin)+"'\n");
    sb.append(" AdminId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AdminId)+"'\n");
    sb.append(" AnalyticsTrackingCode=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AnalyticsTrackingCode)+"'\n");
    sb.append(" AttachedContentDocuments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentDocuments)+"'\n");
    sb.append(" AttachedContentNotes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentNotes)+"'\n");
    sb.append(" ClickjackProtectionLevel=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ClickjackProtectionLevel)+"'\n");
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
    sb.append(" DailyBandwidthLimit=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DailyBandwidthLimit)+"'\n");
    sb.append(" DailyBandwidthUsed=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DailyBandwidthUsed)+"'\n");
    sb.append(" DailyRequestTimeLimit=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DailyRequestTimeLimit)+"'\n");
    sb.append(" DailyRequestTimeUsed=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DailyRequestTimeUsed)+"'\n");
    sb.append(" Description=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Description)+"'\n");
    sb.append(" FeedSubscriptionsForEntity=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FeedSubscriptionsForEntity)+"'\n");
    sb.append(" Feeds=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Feeds)+"'\n");
    sb.append(" GuestUser=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(GuestUser)+"'\n");
    sb.append(" GuestUserId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(GuestUserId)+"'\n");
    sb.append(" Histories=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Histories)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" MasterLabel=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MasterLabel)+"'\n");
    sb.append(" MonthlyPageViewsEntitlement=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MonthlyPageViewsEntitlement)+"'\n");
    sb.append(" Name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");
    sb.append(" OptionsAllowGuestSupportApi=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OptionsAllowGuestSupportApi)+"'\n");
    sb.append(" OptionsAllowHomePage=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OptionsAllowHomePage)+"'\n");
    sb.append(" OptionsAllowStandardAnswersPages=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OptionsAllowStandardAnswersPages)+"'\n");
    sb.append(" OptionsAllowStandardIdeasPages=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OptionsAllowStandardIdeasPages)+"'\n");
    sb.append(" OptionsAllowStandardLookups=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OptionsAllowStandardLookups)+"'\n");
    sb.append(" OptionsAllowStandardSearch=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OptionsAllowStandardSearch)+"'\n");
    sb.append(" OptionsEnableFeeds=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OptionsEnableFeeds)+"'\n");
    sb.append(" OptionsRequireHttps=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OptionsRequireHttps)+"'\n");
    sb.append(" SiteDomainPaths=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SiteDomainPaths)+"'\n");
    sb.append(" SiteType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SiteType)+"'\n");
    sb.append(" Status=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Status)+"'\n");
    sb.append(" Subdomain=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Subdomain)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" UrlPathPrefix=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UrlPathPrefix)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}