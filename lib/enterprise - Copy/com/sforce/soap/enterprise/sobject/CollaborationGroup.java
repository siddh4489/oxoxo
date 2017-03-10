package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class CollaborationGroup extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public CollaborationGroup() {
  }
    
  
  /**
   * element  : Announcement of type {urn:sobject.enterprise.soap.sforce.com}Announcement
   * java type: com.sforce.soap.enterprise.sobject.Announcement
   */
  private static final com.sforce.ws.bind.TypeInfo Announcement__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Announcement","urn:sobject.enterprise.soap.sforce.com","Announcement",0,1,true);

  private boolean Announcement__is_set = false;

  private com.sforce.soap.enterprise.sobject.Announcement Announcement;

  public com.sforce.soap.enterprise.sobject.Announcement getAnnouncement() {
    return Announcement;
  }

  

  public void setAnnouncement(com.sforce.soap.enterprise.sobject.Announcement Announcement) {
    this.Announcement = Announcement;
    Announcement__is_set = true;
  }
  
  /**
   * element  : AnnouncementId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AnnouncementId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AnnouncementId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean AnnouncementId__is_set = false;

  private java.lang.String AnnouncementId;

  public java.lang.String getAnnouncementId() {
    return AnnouncementId;
  }

  

  public void setAnnouncementId(java.lang.String AnnouncementId) {
    this.AnnouncementId = AnnouncementId;
    AnnouncementId__is_set = true;
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
   * element  : BannerPhotoUrl of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo BannerPhotoUrl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","BannerPhotoUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean BannerPhotoUrl__is_set = false;

  private java.lang.String BannerPhotoUrl;

  public java.lang.String getBannerPhotoUrl() {
    return BannerPhotoUrl;
  }

  

  public void setBannerPhotoUrl(java.lang.String BannerPhotoUrl) {
    this.BannerPhotoUrl = BannerPhotoUrl;
    BannerPhotoUrl__is_set = true;
  }
  
  /**
   * element  : CanHaveGuests of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo CanHaveGuests__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CanHaveGuests","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean CanHaveGuests__is_set = false;

  private java.lang.Boolean CanHaveGuests;

  public java.lang.Boolean getCanHaveGuests() {
    return CanHaveGuests;
  }

  

  public void setCanHaveGuests(java.lang.Boolean CanHaveGuests) {
    this.CanHaveGuests = CanHaveGuests;
    CanHaveGuests__is_set = true;
  }
  
  /**
   * element  : CollaborationGroupRecords of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo CollaborationGroupRecords__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CollaborationGroupRecords","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean CollaborationGroupRecords__is_set = false;

  private com.sforce.soap.enterprise.QueryResult CollaborationGroupRecords;

  public com.sforce.soap.enterprise.QueryResult getCollaborationGroupRecords() {
    return CollaborationGroupRecords;
  }

  

  public void setCollaborationGroupRecords(com.sforce.soap.enterprise.QueryResult CollaborationGroupRecords) {
    this.CollaborationGroupRecords = CollaborationGroupRecords;
    CollaborationGroupRecords__is_set = true;
  }
  
  /**
   * element  : CollaborationType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CollaborationType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CollaborationType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean CollaborationType__is_set = false;

  private java.lang.String CollaborationType;

  public java.lang.String getCollaborationType() {
    return CollaborationType;
  }

  

  public void setCollaborationType(java.lang.String CollaborationType) {
    this.CollaborationType = CollaborationType;
    CollaborationType__is_set = true;
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
   * element  : FullPhotoUrl of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo FullPhotoUrl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FullPhotoUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean FullPhotoUrl__is_set = false;

  private java.lang.String FullPhotoUrl;

  public java.lang.String getFullPhotoUrl() {
    return FullPhotoUrl;
  }

  

  public void setFullPhotoUrl(java.lang.String FullPhotoUrl) {
    this.FullPhotoUrl = FullPhotoUrl;
    FullPhotoUrl__is_set = true;
  }
  
  /**
   * element  : GroupEmail of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo GroupEmail__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","GroupEmail","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean GroupEmail__is_set = false;

  private java.lang.String GroupEmail;

  public java.lang.String getGroupEmail() {
    return GroupEmail;
  }

  

  public void setGroupEmail(java.lang.String GroupEmail) {
    this.GroupEmail = GroupEmail;
    GroupEmail__is_set = true;
  }
  
  /**
   * element  : GroupMemberRequests of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo GroupMemberRequests__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","GroupMemberRequests","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean GroupMemberRequests__is_set = false;

  private com.sforce.soap.enterprise.QueryResult GroupMemberRequests;

  public com.sforce.soap.enterprise.QueryResult getGroupMemberRequests() {
    return GroupMemberRequests;
  }

  

  public void setGroupMemberRequests(com.sforce.soap.enterprise.QueryResult GroupMemberRequests) {
    this.GroupMemberRequests = GroupMemberRequests;
    GroupMemberRequests__is_set = true;
  }
  
  /**
   * element  : GroupMembers of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo GroupMembers__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","GroupMembers","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean GroupMembers__is_set = false;

  private com.sforce.soap.enterprise.QueryResult GroupMembers;

  public com.sforce.soap.enterprise.QueryResult getGroupMembers() {
    return GroupMembers;
  }

  

  public void setGroupMembers(com.sforce.soap.enterprise.QueryResult GroupMembers) {
    this.GroupMembers = GroupMembers;
    GroupMembers__is_set = true;
  }
  
  /**
   * element  : HasPrivateFieldsAccess of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo HasPrivateFieldsAccess__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","HasPrivateFieldsAccess","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean HasPrivateFieldsAccess__is_set = false;

  private java.lang.Boolean HasPrivateFieldsAccess;

  public java.lang.Boolean getHasPrivateFieldsAccess() {
    return HasPrivateFieldsAccess;
  }

  

  public void setHasPrivateFieldsAccess(java.lang.Boolean HasPrivateFieldsAccess) {
    this.HasPrivateFieldsAccess = HasPrivateFieldsAccess;
    HasPrivateFieldsAccess__is_set = true;
  }
  
  /**
   * element  : InformationBody of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo InformationBody__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","InformationBody","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean InformationBody__is_set = false;

  private java.lang.String InformationBody;

  public java.lang.String getInformationBody() {
    return InformationBody;
  }

  

  public void setInformationBody(java.lang.String InformationBody) {
    this.InformationBody = InformationBody;
    InformationBody__is_set = true;
  }
  
  /**
   * element  : InformationTitle of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo InformationTitle__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","InformationTitle","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean InformationTitle__is_set = false;

  private java.lang.String InformationTitle;

  public java.lang.String getInformationTitle() {
    return InformationTitle;
  }

  

  public void setInformationTitle(java.lang.String InformationTitle) {
    this.InformationTitle = InformationTitle;
    InformationTitle__is_set = true;
  }
  
  /**
   * element  : IsArchived of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsArchived__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsArchived","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsArchived__is_set = false;

  private java.lang.Boolean IsArchived;

  public java.lang.Boolean getIsArchived() {
    return IsArchived;
  }

  

  public void setIsArchived(java.lang.Boolean IsArchived) {
    this.IsArchived = IsArchived;
    IsArchived__is_set = true;
  }
  
  /**
   * element  : IsAutoArchiveDisabled of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsAutoArchiveDisabled__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsAutoArchiveDisabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsAutoArchiveDisabled__is_set = false;

  private java.lang.Boolean IsAutoArchiveDisabled;

  public java.lang.Boolean getIsAutoArchiveDisabled() {
    return IsAutoArchiveDisabled;
  }

  

  public void setIsAutoArchiveDisabled(java.lang.Boolean IsAutoArchiveDisabled) {
    this.IsAutoArchiveDisabled = IsAutoArchiveDisabled;
    IsAutoArchiveDisabled__is_set = true;
  }
  
  /**
   * element  : IsBroadcast of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsBroadcast__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsBroadcast","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsBroadcast__is_set = false;

  private java.lang.Boolean IsBroadcast;

  public java.lang.Boolean getIsBroadcast() {
    return IsBroadcast;
  }

  

  public void setIsBroadcast(java.lang.Boolean IsBroadcast) {
    this.IsBroadcast = IsBroadcast;
    IsBroadcast__is_set = true;
  }
  
  /**
   * element  : LastFeedModifiedDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo LastFeedModifiedDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastFeedModifiedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean LastFeedModifiedDate__is_set = false;

  private java.util.Calendar LastFeedModifiedDate;

  public java.util.Calendar getLastFeedModifiedDate() {
    return LastFeedModifiedDate;
  }

  

  public void setLastFeedModifiedDate(java.util.Calendar LastFeedModifiedDate) {
    this.LastFeedModifiedDate = LastFeedModifiedDate;
    LastFeedModifiedDate__is_set = true;
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
   * element  : MediumPhotoUrl of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo MediumPhotoUrl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MediumPhotoUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean MediumPhotoUrl__is_set = false;

  private java.lang.String MediumPhotoUrl;

  public java.lang.String getMediumPhotoUrl() {
    return MediumPhotoUrl;
  }

  

  public void setMediumPhotoUrl(java.lang.String MediumPhotoUrl) {
    this.MediumPhotoUrl = MediumPhotoUrl;
    MediumPhotoUrl__is_set = true;
  }
  
  /**
   * element  : MemberCount of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo MemberCount__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MemberCount","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean MemberCount__is_set = false;

  private java.lang.Integer MemberCount;

  public java.lang.Integer getMemberCount() {
    return MemberCount;
  }

  

  public void setMemberCount(java.lang.Integer MemberCount) {
    this.MemberCount = MemberCount;
    MemberCount__is_set = true;
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
   * element  : SmallPhotoUrl of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo SmallPhotoUrl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SmallPhotoUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean SmallPhotoUrl__is_set = false;

  private java.lang.String SmallPhotoUrl;

  public java.lang.String getSmallPhotoUrl() {
    return SmallPhotoUrl;
  }

  

  public void setSmallPhotoUrl(java.lang.String SmallPhotoUrl) {
    this.SmallPhotoUrl = SmallPhotoUrl;
    SmallPhotoUrl__is_set = true;
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
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "CollaborationGroup");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, Announcement__typeInfo, Announcement, Announcement__is_set);
    __typeMapper.writeString(__out, AnnouncementId__typeInfo, AnnouncementId, AnnouncementId__is_set);
    __typeMapper.writeObject(__out, AttachedContentDocuments__typeInfo, AttachedContentDocuments, AttachedContentDocuments__is_set);
    __typeMapper.writeObject(__out, AttachedContentNotes__typeInfo, AttachedContentNotes, AttachedContentNotes__is_set);
    __typeMapper.writeString(__out, BannerPhotoUrl__typeInfo, BannerPhotoUrl, BannerPhotoUrl__is_set);
    __typeMapper.writeObject(__out, CanHaveGuests__typeInfo, CanHaveGuests, CanHaveGuests__is_set);
    __typeMapper.writeObject(__out, CollaborationGroupRecords__typeInfo, CollaborationGroupRecords, CollaborationGroupRecords__is_set);
    __typeMapper.writeString(__out, CollaborationType__typeInfo, CollaborationType, CollaborationType__is_set);
    __typeMapper.writeObject(__out, CombinedAttachments__typeInfo, CombinedAttachments, CombinedAttachments__is_set);
    __typeMapper.writeObject(__out, ContentDocumentLinks__typeInfo, ContentDocumentLinks, ContentDocumentLinks__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, Description__typeInfo, Description, Description__is_set);
    __typeMapper.writeObject(__out, FeedSubscriptionsForEntity__typeInfo, FeedSubscriptionsForEntity, FeedSubscriptionsForEntity__is_set);
    __typeMapper.writeObject(__out, Feeds__typeInfo, Feeds, Feeds__is_set);
    __typeMapper.writeString(__out, FullPhotoUrl__typeInfo, FullPhotoUrl, FullPhotoUrl__is_set);
    __typeMapper.writeString(__out, GroupEmail__typeInfo, GroupEmail, GroupEmail__is_set);
    __typeMapper.writeObject(__out, GroupMemberRequests__typeInfo, GroupMemberRequests, GroupMemberRequests__is_set);
    __typeMapper.writeObject(__out, GroupMembers__typeInfo, GroupMembers, GroupMembers__is_set);
    __typeMapper.writeObject(__out, HasPrivateFieldsAccess__typeInfo, HasPrivateFieldsAccess, HasPrivateFieldsAccess__is_set);
    __typeMapper.writeString(__out, InformationBody__typeInfo, InformationBody, InformationBody__is_set);
    __typeMapper.writeString(__out, InformationTitle__typeInfo, InformationTitle, InformationTitle__is_set);
    __typeMapper.writeObject(__out, IsArchived__typeInfo, IsArchived, IsArchived__is_set);
    __typeMapper.writeObject(__out, IsAutoArchiveDisabled__typeInfo, IsAutoArchiveDisabled, IsAutoArchiveDisabled__is_set);
    __typeMapper.writeObject(__out, IsBroadcast__typeInfo, IsBroadcast, IsBroadcast__is_set);
    __typeMapper.writeObject(__out, LastFeedModifiedDate__typeInfo, LastFeedModifiedDate, LastFeedModifiedDate__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, LastReferencedDate__typeInfo, LastReferencedDate, LastReferencedDate__is_set);
    __typeMapper.writeObject(__out, LastViewedDate__typeInfo, LastViewedDate, LastViewedDate__is_set);
    __typeMapper.writeString(__out, MediumPhotoUrl__typeInfo, MediumPhotoUrl, MediumPhotoUrl__is_set);
    __typeMapper.writeObject(__out, MemberCount__typeInfo, MemberCount, MemberCount__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeObject(__out, Owner__typeInfo, Owner, Owner__is_set);
    __typeMapper.writeString(__out, OwnerId__typeInfo, OwnerId, OwnerId__is_set);
    __typeMapper.writeString(__out, SmallPhotoUrl__typeInfo, SmallPhotoUrl, SmallPhotoUrl__is_set);
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
    if (__typeMapper.isElement(__in, Announcement__typeInfo)) {
      setAnnouncement((com.sforce.soap.enterprise.sobject.Announcement)__typeMapper.readObject(__in, Announcement__typeInfo, com.sforce.soap.enterprise.sobject.Announcement.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AnnouncementId__typeInfo)) {
      setAnnouncementId((java.lang.String)__typeMapper.readString(__in, AnnouncementId__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, BannerPhotoUrl__typeInfo)) {
      setBannerPhotoUrl((java.lang.String)__typeMapper.readString(__in, BannerPhotoUrl__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CanHaveGuests__typeInfo)) {
      setCanHaveGuests((java.lang.Boolean)__typeMapper.readObject(__in, CanHaveGuests__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CollaborationGroupRecords__typeInfo)) {
      setCollaborationGroupRecords((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, CollaborationGroupRecords__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CollaborationType__typeInfo)) {
      setCollaborationType((java.lang.String)__typeMapper.readString(__in, CollaborationType__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, FeedSubscriptionsForEntity__typeInfo)) {
      setFeedSubscriptionsForEntity((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, FeedSubscriptionsForEntity__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Feeds__typeInfo)) {
      setFeeds((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Feeds__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FullPhotoUrl__typeInfo)) {
      setFullPhotoUrl((java.lang.String)__typeMapper.readString(__in, FullPhotoUrl__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, GroupEmail__typeInfo)) {
      setGroupEmail((java.lang.String)__typeMapper.readString(__in, GroupEmail__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, GroupMemberRequests__typeInfo)) {
      setGroupMemberRequests((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, GroupMemberRequests__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, GroupMembers__typeInfo)) {
      setGroupMembers((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, GroupMembers__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, HasPrivateFieldsAccess__typeInfo)) {
      setHasPrivateFieldsAccess((java.lang.Boolean)__typeMapper.readObject(__in, HasPrivateFieldsAccess__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, InformationBody__typeInfo)) {
      setInformationBody((java.lang.String)__typeMapper.readString(__in, InformationBody__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, InformationTitle__typeInfo)) {
      setInformationTitle((java.lang.String)__typeMapper.readString(__in, InformationTitle__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsArchived__typeInfo)) {
      setIsArchived((java.lang.Boolean)__typeMapper.readObject(__in, IsArchived__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsAutoArchiveDisabled__typeInfo)) {
      setIsAutoArchiveDisabled((java.lang.Boolean)__typeMapper.readObject(__in, IsAutoArchiveDisabled__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsBroadcast__typeInfo)) {
      setIsBroadcast((java.lang.Boolean)__typeMapper.readObject(__in, IsBroadcast__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LastFeedModifiedDate__typeInfo)) {
      setLastFeedModifiedDate((java.util.Calendar)__typeMapper.readObject(__in, LastFeedModifiedDate__typeInfo, java.util.Calendar.class));
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
    if (__typeMapper.isElement(__in, MediumPhotoUrl__typeInfo)) {
      setMediumPhotoUrl((java.lang.String)__typeMapper.readString(__in, MediumPhotoUrl__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MemberCount__typeInfo)) {
      setMemberCount((java.lang.Integer)__typeMapper.readObject(__in, MemberCount__typeInfo, java.lang.Integer.class));
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
    if (__typeMapper.isElement(__in, SmallPhotoUrl__typeInfo)) {
      setSmallPhotoUrl((java.lang.String)__typeMapper.readString(__in, SmallPhotoUrl__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[CollaborationGroup ");
    sb.append(super.toString());
    sb.append(" Announcement=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Announcement)+"'\n");
    sb.append(" AnnouncementId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AnnouncementId)+"'\n");
    sb.append(" AttachedContentDocuments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentDocuments)+"'\n");
    sb.append(" AttachedContentNotes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentNotes)+"'\n");
    sb.append(" BannerPhotoUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(BannerPhotoUrl)+"'\n");
    sb.append(" CanHaveGuests=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CanHaveGuests)+"'\n");
    sb.append(" CollaborationGroupRecords=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CollaborationGroupRecords)+"'\n");
    sb.append(" CollaborationType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CollaborationType)+"'\n");
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
    sb.append(" FeedSubscriptionsForEntity=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FeedSubscriptionsForEntity)+"'\n");
    sb.append(" Feeds=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Feeds)+"'\n");
    sb.append(" FullPhotoUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FullPhotoUrl)+"'\n");
    sb.append(" GroupEmail=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(GroupEmail)+"'\n");
    sb.append(" GroupMemberRequests=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(GroupMemberRequests)+"'\n");
    sb.append(" GroupMembers=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(GroupMembers)+"'\n");
    sb.append(" HasPrivateFieldsAccess=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(HasPrivateFieldsAccess)+"'\n");
    sb.append(" InformationBody=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(InformationBody)+"'\n");
    sb.append(" InformationTitle=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(InformationTitle)+"'\n");
    sb.append(" IsArchived=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsArchived)+"'\n");
    sb.append(" IsAutoArchiveDisabled=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsAutoArchiveDisabled)+"'\n");
    sb.append(" IsBroadcast=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsBroadcast)+"'\n");
    sb.append(" LastFeedModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastFeedModifiedDate)+"'\n");
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
    sb.append(" MediumPhotoUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MediumPhotoUrl)+"'\n");
    sb.append(" MemberCount=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MemberCount)+"'\n");
    sb.append(" Name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");
    sb.append(" Owner=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Owner)+"'\n");
    sb.append(" OwnerId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OwnerId)+"'\n");
    sb.append(" SmallPhotoUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SmallPhotoUrl)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}