package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class Dashboard extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public Dashboard() {
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
   * element  : BackgroundDirection of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo BackgroundDirection__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","BackgroundDirection","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean BackgroundDirection__is_set = false;

  private java.lang.String BackgroundDirection;

  public java.lang.String getBackgroundDirection() {
    return BackgroundDirection;
  }

  

  public void setBackgroundDirection(java.lang.String BackgroundDirection) {
    this.BackgroundDirection = BackgroundDirection;
    BackgroundDirection__is_set = true;
  }
  
  /**
   * element  : BackgroundEnd of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo BackgroundEnd__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","BackgroundEnd","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean BackgroundEnd__is_set = false;

  private java.lang.Integer BackgroundEnd;

  public java.lang.Integer getBackgroundEnd() {
    return BackgroundEnd;
  }

  

  public void setBackgroundEnd(java.lang.Integer BackgroundEnd) {
    this.BackgroundEnd = BackgroundEnd;
    BackgroundEnd__is_set = true;
  }
  
  /**
   * element  : BackgroundStart of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo BackgroundStart__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","BackgroundStart","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean BackgroundStart__is_set = false;

  private java.lang.Integer BackgroundStart;

  public java.lang.Integer getBackgroundStart() {
    return BackgroundStart;
  }

  

  public void setBackgroundStart(java.lang.Integer BackgroundStart) {
    this.BackgroundStart = BackgroundStart;
    BackgroundStart__is_set = true;
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
   * element  : DashboardComponents of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo DashboardComponents__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DashboardComponents","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean DashboardComponents__is_set = false;

  private com.sforce.soap.enterprise.QueryResult DashboardComponents;

  public com.sforce.soap.enterprise.QueryResult getDashboardComponents() {
    return DashboardComponents;
  }

  

  public void setDashboardComponents(com.sforce.soap.enterprise.QueryResult DashboardComponents) {
    this.DashboardComponents = DashboardComponents;
    DashboardComponents__is_set = true;
  }
  
  /**
   * element  : DashboardResultRefreshedDate of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo DashboardResultRefreshedDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DashboardResultRefreshedDate","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean DashboardResultRefreshedDate__is_set = false;

  private java.lang.String DashboardResultRefreshedDate;

  public java.lang.String getDashboardResultRefreshedDate() {
    return DashboardResultRefreshedDate;
  }

  

  public void setDashboardResultRefreshedDate(java.lang.String DashboardResultRefreshedDate) {
    this.DashboardResultRefreshedDate = DashboardResultRefreshedDate;
    DashboardResultRefreshedDate__is_set = true;
  }
  
  /**
   * element  : DashboardResultRunningUser of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo DashboardResultRunningUser__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DashboardResultRunningUser","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean DashboardResultRunningUser__is_set = false;

  private java.lang.String DashboardResultRunningUser;

  public java.lang.String getDashboardResultRunningUser() {
    return DashboardResultRunningUser;
  }

  

  public void setDashboardResultRunningUser(java.lang.String DashboardResultRunningUser) {
    this.DashboardResultRunningUser = DashboardResultRunningUser;
    DashboardResultRunningUser__is_set = true;
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
   * element  : FolderName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo FolderName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FolderName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean FolderName__is_set = false;

  private java.lang.String FolderName;

  public java.lang.String getFolderName() {
    return FolderName;
  }

  

  public void setFolderName(java.lang.String FolderName) {
    this.FolderName = FolderName;
    FolderName__is_set = true;
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
   * element  : LastReferencedDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo LastReferencedDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastReferencedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean LastReferencedDate__is_set = false;

  private java.util.Calendar LastReferencedDate;

  public java.util.Calendar getLastReferencedDate() {
    return LastReferencedDate;
  }

  

  public void setLastReferencedDate(java.util.Calendar LastReferencedDate) {
    this.LastReferencedDate = LastReferencedDate;
    LastReferencedDate__is_set = true;
  }
  
  /**
   * element  : LastViewedDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo LastViewedDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastViewedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean LastViewedDate__is_set = false;

  private java.util.Calendar LastViewedDate;

  public java.util.Calendar getLastViewedDate() {
    return LastViewedDate;
  }

  

  public void setLastViewedDate(java.util.Calendar LastViewedDate) {
    this.LastViewedDate = LastViewedDate;
    LastViewedDate__is_set = true;
  }
  
  /**
   * element  : LeftSize of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LeftSize__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LeftSize","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean LeftSize__is_set = false;

  private java.lang.String LeftSize;

  public java.lang.String getLeftSize() {
    return LeftSize;
  }

  

  public void setLeftSize(java.lang.String LeftSize) {
    this.LeftSize = LeftSize;
    LeftSize__is_set = true;
  }
  
  /**
   * element  : MiddleSize of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo MiddleSize__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MiddleSize","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean MiddleSize__is_set = false;

  private java.lang.String MiddleSize;

  public java.lang.String getMiddleSize() {
    return MiddleSize;
  }

  

  public void setMiddleSize(java.lang.String MiddleSize) {
    this.MiddleSize = MiddleSize;
    MiddleSize__is_set = true;
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
   * element  : RightSize of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo RightSize__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RightSize","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean RightSize__is_set = false;

  private java.lang.String RightSize;

  public java.lang.String getRightSize() {
    return RightSize;
  }

  

  public void setRightSize(java.lang.String RightSize) {
    this.RightSize = RightSize;
    RightSize__is_set = true;
  }
  
  /**
   * element  : RunningUser of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo RunningUser__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RunningUser","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean RunningUser__is_set = false;

  private com.sforce.soap.enterprise.sobject.User RunningUser;

  public com.sforce.soap.enterprise.sobject.User getRunningUser() {
    return RunningUser;
  }

  

  public void setRunningUser(com.sforce.soap.enterprise.sobject.User RunningUser) {
    this.RunningUser = RunningUser;
    RunningUser__is_set = true;
  }
  
  /**
   * element  : RunningUserId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo RunningUserId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RunningUserId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean RunningUserId__is_set = false;

  private java.lang.String RunningUserId;

  public java.lang.String getRunningUserId() {
    return RunningUserId;
  }

  

  public void setRunningUserId(java.lang.String RunningUserId) {
    this.RunningUserId = RunningUserId;
    RunningUserId__is_set = true;
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
   * element  : Tags of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Tags__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Tags","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Tags__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Tags;

  public com.sforce.soap.enterprise.QueryResult getTags() {
    return Tags;
  }

  

  public void setTags(com.sforce.soap.enterprise.QueryResult Tags) {
    this.Tags = Tags;
    Tags__is_set = true;
  }
  
  /**
   * element  : TextColor of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo TextColor__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TextColor","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean TextColor__is_set = false;

  private java.lang.Integer TextColor;

  public java.lang.Integer getTextColor() {
    return TextColor;
  }

  

  public void setTextColor(java.lang.Integer TextColor) {
    this.TextColor = TextColor;
    TextColor__is_set = true;
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
   * element  : TitleColor of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo TitleColor__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TitleColor","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean TitleColor__is_set = false;

  private java.lang.Integer TitleColor;

  public java.lang.Integer getTitleColor() {
    return TitleColor;
  }

  

  public void setTitleColor(java.lang.Integer TitleColor) {
    this.TitleColor = TitleColor;
    TitleColor__is_set = true;
  }
  
  /**
   * element  : TitleSize of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo TitleSize__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TitleSize","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean TitleSize__is_set = false;

  private java.lang.Integer TitleSize;

  public java.lang.Integer getTitleSize() {
    return TitleSize;
  }

  

  public void setTitleSize(java.lang.Integer TitleSize) {
    this.TitleSize = TitleSize;
    TitleSize__is_set = true;
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
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "Dashboard");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, AttachedContentDocuments__typeInfo, AttachedContentDocuments, AttachedContentDocuments__is_set);
    __typeMapper.writeObject(__out, AttachedContentNotes__typeInfo, AttachedContentNotes, AttachedContentNotes__is_set);
    __typeMapper.writeString(__out, BackgroundDirection__typeInfo, BackgroundDirection, BackgroundDirection__is_set);
    __typeMapper.writeObject(__out, BackgroundEnd__typeInfo, BackgroundEnd, BackgroundEnd__is_set);
    __typeMapper.writeObject(__out, BackgroundStart__typeInfo, BackgroundStart, BackgroundStart__is_set);
    __typeMapper.writeObject(__out, CombinedAttachments__typeInfo, CombinedAttachments, CombinedAttachments__is_set);
    __typeMapper.writeObject(__out, ContentDocumentLinks__typeInfo, ContentDocumentLinks, ContentDocumentLinks__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeObject(__out, DashboardComponents__typeInfo, DashboardComponents, DashboardComponents__is_set);
    __typeMapper.writeString(__out, DashboardResultRefreshedDate__typeInfo, DashboardResultRefreshedDate, DashboardResultRefreshedDate__is_set);
    __typeMapper.writeString(__out, DashboardResultRunningUser__typeInfo, DashboardResultRunningUser, DashboardResultRunningUser__is_set);
    __typeMapper.writeString(__out, Description__typeInfo, Description, Description__is_set);
    __typeMapper.writeString(__out, DeveloperName__typeInfo, DeveloperName, DeveloperName__is_set);
    __typeMapper.writeObject(__out, FeedSubscriptionsForEntity__typeInfo, FeedSubscriptionsForEntity, FeedSubscriptionsForEntity__is_set);
    __typeMapper.writeObject(__out, Feeds__typeInfo, Feeds, Feeds__is_set);
    __typeMapper.writeObject(__out, Folder__typeInfo, Folder, Folder__is_set);
    __typeMapper.writeString(__out, FolderId__typeInfo, FolderId, FolderId__is_set);
    __typeMapper.writeString(__out, FolderName__typeInfo, FolderName, FolderName__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, LastReferencedDate__typeInfo, LastReferencedDate, LastReferencedDate__is_set);
    __typeMapper.writeObject(__out, LastViewedDate__typeInfo, LastViewedDate, LastViewedDate__is_set);
    __typeMapper.writeString(__out, LeftSize__typeInfo, LeftSize, LeftSize__is_set);
    __typeMapper.writeString(__out, MiddleSize__typeInfo, MiddleSize, MiddleSize__is_set);
    __typeMapper.writeString(__out, NamespacePrefix__typeInfo, NamespacePrefix, NamespacePrefix__is_set);
    __typeMapper.writeString(__out, RightSize__typeInfo, RightSize, RightSize__is_set);
    __typeMapper.writeObject(__out, RunningUser__typeInfo, RunningUser, RunningUser__is_set);
    __typeMapper.writeString(__out, RunningUserId__typeInfo, RunningUserId, RunningUserId__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeObject(__out, Tags__typeInfo, Tags, Tags__is_set);
    __typeMapper.writeObject(__out, TextColor__typeInfo, TextColor, TextColor__is_set);
    __typeMapper.writeString(__out, Title__typeInfo, Title, Title__is_set);
    __typeMapper.writeObject(__out, TitleColor__typeInfo, TitleColor, TitleColor__is_set);
    __typeMapper.writeObject(__out, TitleSize__typeInfo, TitleSize, TitleSize__is_set);
    __typeMapper.writeString(__out, Type__typeInfo, Type, Type__is_set);
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
    if (__typeMapper.isElement(__in, AttachedContentDocuments__typeInfo)) {
      setAttachedContentDocuments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, AttachedContentDocuments__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AttachedContentNotes__typeInfo)) {
      setAttachedContentNotes((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, AttachedContentNotes__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, BackgroundDirection__typeInfo)) {
      setBackgroundDirection((java.lang.String)__typeMapper.readString(__in, BackgroundDirection__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, BackgroundEnd__typeInfo)) {
      setBackgroundEnd((java.lang.Integer)__typeMapper.readObject(__in, BackgroundEnd__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, BackgroundStart__typeInfo)) {
      setBackgroundStart((java.lang.Integer)__typeMapper.readObject(__in, BackgroundStart__typeInfo, java.lang.Integer.class));
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
    if (__typeMapper.isElement(__in, DashboardComponents__typeInfo)) {
      setDashboardComponents((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, DashboardComponents__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DashboardResultRefreshedDate__typeInfo)) {
      setDashboardResultRefreshedDate((java.lang.String)__typeMapper.readString(__in, DashboardResultRefreshedDate__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DashboardResultRunningUser__typeInfo)) {
      setDashboardResultRunningUser((java.lang.String)__typeMapper.readString(__in, DashboardResultRunningUser__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, FeedSubscriptionsForEntity__typeInfo)) {
      setFeedSubscriptionsForEntity((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, FeedSubscriptionsForEntity__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Feeds__typeInfo)) {
      setFeeds((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Feeds__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    if (__typeMapper.isElement(__in, FolderName__typeInfo)) {
      setFolderName((java.lang.String)__typeMapper.readString(__in, FolderName__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, LastReferencedDate__typeInfo)) {
      setLastReferencedDate((java.util.Calendar)__typeMapper.readObject(__in, LastReferencedDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LastViewedDate__typeInfo)) {
      setLastViewedDate((java.util.Calendar)__typeMapper.readObject(__in, LastViewedDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LeftSize__typeInfo)) {
      setLeftSize((java.lang.String)__typeMapper.readString(__in, LeftSize__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MiddleSize__typeInfo)) {
      setMiddleSize((java.lang.String)__typeMapper.readString(__in, MiddleSize__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, NamespacePrefix__typeInfo)) {
      setNamespacePrefix((java.lang.String)__typeMapper.readString(__in, NamespacePrefix__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RightSize__typeInfo)) {
      setRightSize((java.lang.String)__typeMapper.readString(__in, RightSize__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RunningUser__typeInfo)) {
      setRunningUser((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, RunningUser__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RunningUserId__typeInfo)) {
      setRunningUserId((java.lang.String)__typeMapper.readString(__in, RunningUserId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Tags__typeInfo)) {
      setTags((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Tags__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TextColor__typeInfo)) {
      setTextColor((java.lang.Integer)__typeMapper.readObject(__in, TextColor__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Title__typeInfo)) {
      setTitle((java.lang.String)__typeMapper.readString(__in, Title__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TitleColor__typeInfo)) {
      setTitleColor((java.lang.Integer)__typeMapper.readObject(__in, TitleColor__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TitleSize__typeInfo)) {
      setTitleSize((java.lang.Integer)__typeMapper.readObject(__in, TitleSize__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Type__typeInfo)) {
      setType((java.lang.String)__typeMapper.readString(__in, Type__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[Dashboard ");
    sb.append(super.toString());
    sb.append(" AttachedContentDocuments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentDocuments)+"'\n");
    sb.append(" AttachedContentNotes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentNotes)+"'\n");
    sb.append(" BackgroundDirection=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(BackgroundDirection)+"'\n");
    sb.append(" BackgroundEnd=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(BackgroundEnd)+"'\n");
    sb.append(" BackgroundStart=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(BackgroundStart)+"'\n");
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
    sb.append(" DashboardComponents=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DashboardComponents)+"'\n");
    sb.append(" DashboardResultRefreshedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DashboardResultRefreshedDate)+"'\n");
    sb.append(" DashboardResultRunningUser=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DashboardResultRunningUser)+"'\n");
    sb.append(" Description=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Description)+"'\n");
    sb.append(" DeveloperName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DeveloperName)+"'\n");
    sb.append(" FeedSubscriptionsForEntity=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FeedSubscriptionsForEntity)+"'\n");
    sb.append(" Feeds=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Feeds)+"'\n");
    sb.append(" Folder=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Folder)+"'\n");
    sb.append(" FolderId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FolderId)+"'\n");
    sb.append(" FolderName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FolderName)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" LastReferencedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastReferencedDate)+"'\n");
    sb.append(" LastViewedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastViewedDate)+"'\n");
    sb.append(" LeftSize=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LeftSize)+"'\n");
    sb.append(" MiddleSize=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MiddleSize)+"'\n");
    sb.append(" NamespacePrefix=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NamespacePrefix)+"'\n");
    sb.append(" RightSize=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RightSize)+"'\n");
    sb.append(" RunningUser=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RunningUser)+"'\n");
    sb.append(" RunningUserId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RunningUserId)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" Tags=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Tags)+"'\n");
    sb.append(" TextColor=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TextColor)+"'\n");
    sb.append(" Title=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Title)+"'\n");
    sb.append(" TitleColor=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TitleColor)+"'\n");
    sb.append(" TitleSize=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TitleSize)+"'\n");
    sb.append(" Type=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Type)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}