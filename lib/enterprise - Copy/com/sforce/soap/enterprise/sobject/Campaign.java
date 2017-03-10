package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class Campaign extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public Campaign() {
  }
    
  
  /**
   * element  : ActivityHistories of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo ActivityHistories__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ActivityHistories","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean ActivityHistories__is_set = false;

  private com.sforce.soap.enterprise.QueryResult ActivityHistories;

  public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
    return ActivityHistories;
  }

  

  public void setActivityHistories(com.sforce.soap.enterprise.QueryResult ActivityHistories) {
    this.ActivityHistories = ActivityHistories;
    ActivityHistories__is_set = true;
  }
  
  /**
   * element  : ActualCost of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo ActualCost__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ActualCost","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean ActualCost__is_set = false;

  private java.lang.Double ActualCost;

  public java.lang.Double getActualCost() {
    return ActualCost;
  }

  

  public void setActualCost(java.lang.Double ActualCost) {
    this.ActualCost = ActualCost;
    ActualCost__is_set = true;
  }
  
  /**
   * element  : AmountAllOpportunities of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo AmountAllOpportunities__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AmountAllOpportunities","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean AmountAllOpportunities__is_set = false;

  private java.lang.Double AmountAllOpportunities;

  public java.lang.Double getAmountAllOpportunities() {
    return AmountAllOpportunities;
  }

  

  public void setAmountAllOpportunities(java.lang.Double AmountAllOpportunities) {
    this.AmountAllOpportunities = AmountAllOpportunities;
    AmountAllOpportunities__is_set = true;
  }
  
  /**
   * element  : AmountWonOpportunities of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo AmountWonOpportunities__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AmountWonOpportunities","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean AmountWonOpportunities__is_set = false;

  private java.lang.Double AmountWonOpportunities;

  public java.lang.Double getAmountWonOpportunities() {
    return AmountWonOpportunities;
  }

  

  public void setAmountWonOpportunities(java.lang.Double AmountWonOpportunities) {
    this.AmountWonOpportunities = AmountWonOpportunities;
    AmountWonOpportunities__is_set = true;
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
   * element  : BudgetedCost of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo BudgetedCost__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","BudgetedCost","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean BudgetedCost__is_set = false;

  private java.lang.Double BudgetedCost;

  public java.lang.Double getBudgetedCost() {
    return BudgetedCost;
  }

  

  public void setBudgetedCost(java.lang.Double BudgetedCost) {
    this.BudgetedCost = BudgetedCost;
    BudgetedCost__is_set = true;
  }
  
  /**
   * element  : CampaignMemberRecordType of type {urn:sobject.enterprise.soap.sforce.com}RecordType
   * java type: com.sforce.soap.enterprise.sobject.RecordType
   */
  private static final com.sforce.ws.bind.TypeInfo CampaignMemberRecordType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CampaignMemberRecordType","urn:sobject.enterprise.soap.sforce.com","RecordType",0,1,true);

  private boolean CampaignMemberRecordType__is_set = false;

  private com.sforce.soap.enterprise.sobject.RecordType CampaignMemberRecordType;

  public com.sforce.soap.enterprise.sobject.RecordType getCampaignMemberRecordType() {
    return CampaignMemberRecordType;
  }

  

  public void setCampaignMemberRecordType(com.sforce.soap.enterprise.sobject.RecordType CampaignMemberRecordType) {
    this.CampaignMemberRecordType = CampaignMemberRecordType;
    CampaignMemberRecordType__is_set = true;
  }
  
  /**
   * element  : CampaignMemberRecordTypeId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CampaignMemberRecordTypeId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CampaignMemberRecordTypeId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean CampaignMemberRecordTypeId__is_set = false;

  private java.lang.String CampaignMemberRecordTypeId;

  public java.lang.String getCampaignMemberRecordTypeId() {
    return CampaignMemberRecordTypeId;
  }

  

  public void setCampaignMemberRecordTypeId(java.lang.String CampaignMemberRecordTypeId) {
    this.CampaignMemberRecordTypeId = CampaignMemberRecordTypeId;
    CampaignMemberRecordTypeId__is_set = true;
  }
  
  /**
   * element  : CampaignMembers of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo CampaignMembers__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CampaignMembers","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean CampaignMembers__is_set = false;

  private com.sforce.soap.enterprise.QueryResult CampaignMembers;

  public com.sforce.soap.enterprise.QueryResult getCampaignMembers() {
    return CampaignMembers;
  }

  

  public void setCampaignMembers(com.sforce.soap.enterprise.QueryResult CampaignMembers) {
    this.CampaignMembers = CampaignMembers;
    CampaignMembers__is_set = true;
  }
  
  /**
   * element  : ChildCampaigns of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo ChildCampaigns__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ChildCampaigns","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean ChildCampaigns__is_set = false;

  private com.sforce.soap.enterprise.QueryResult ChildCampaigns;

  public com.sforce.soap.enterprise.QueryResult getChildCampaigns() {
    return ChildCampaigns;
  }

  

  public void setChildCampaigns(com.sforce.soap.enterprise.QueryResult ChildCampaigns) {
    this.ChildCampaigns = ChildCampaigns;
    ChildCampaigns__is_set = true;
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
   * element  : Emails of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Emails__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Emails","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Emails__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Emails;

  public com.sforce.soap.enterprise.QueryResult getEmails() {
    return Emails;
  }

  

  public void setEmails(com.sforce.soap.enterprise.QueryResult Emails) {
    this.Emails = Emails;
    Emails__is_set = true;
  }
  
  /**
   * element  : EndDate of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo EndDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","EndDate","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean EndDate__is_set = false;

  private java.util.Calendar EndDate;

  public java.util.Calendar getEndDate() {
    return EndDate;
  }

  

  public void setEndDate(java.util.Calendar EndDate) {
    this.EndDate = EndDate;
    EndDate__is_set = true;
  }
  
  /**
   * element  : EventRelations of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo EventRelations__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","EventRelations","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean EventRelations__is_set = false;

  private com.sforce.soap.enterprise.QueryResult EventRelations;

  public com.sforce.soap.enterprise.QueryResult getEventRelations() {
    return EventRelations;
  }

  

  public void setEventRelations(com.sforce.soap.enterprise.QueryResult EventRelations) {
    this.EventRelations = EventRelations;
    EventRelations__is_set = true;
  }
  
  /**
   * element  : Events of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Events__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Events","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Events__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Events;

  public com.sforce.soap.enterprise.QueryResult getEvents() {
    return Events;
  }

  

  public void setEvents(com.sforce.soap.enterprise.QueryResult Events) {
    this.Events = Events;
    Events__is_set = true;
  }
  
  /**
   * element  : ExpectedResponse of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo ExpectedResponse__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ExpectedResponse","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean ExpectedResponse__is_set = false;

  private java.lang.Double ExpectedResponse;

  public java.lang.Double getExpectedResponse() {
    return ExpectedResponse;
  }

  

  public void setExpectedResponse(java.lang.Double ExpectedResponse) {
    this.ExpectedResponse = ExpectedResponse;
    ExpectedResponse__is_set = true;
  }
  
  /**
   * element  : ExpectedRevenue of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo ExpectedRevenue__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ExpectedRevenue","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean ExpectedRevenue__is_set = false;

  private java.lang.Double ExpectedRevenue;

  public java.lang.Double getExpectedRevenue() {
    return ExpectedRevenue;
  }

  

  public void setExpectedRevenue(java.lang.Double ExpectedRevenue) {
    this.ExpectedRevenue = ExpectedRevenue;
    ExpectedRevenue__is_set = true;
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
   * element  : LastActivityDate of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo LastActivityDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastActivityDate","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean LastActivityDate__is_set = false;

  private java.util.Calendar LastActivityDate;

  public java.util.Calendar getLastActivityDate() {
    return LastActivityDate;
  }

  

  public void setLastActivityDate(java.util.Calendar LastActivityDate) {
    this.LastActivityDate = LastActivityDate;
    LastActivityDate__is_set = true;
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
   * element  : Leads of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Leads__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Leads","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Leads__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Leads;

  public com.sforce.soap.enterprise.QueryResult getLeads() {
    return Leads;
  }

  

  public void setLeads(com.sforce.soap.enterprise.QueryResult Leads) {
    this.Leads = Leads;
    Leads__is_set = true;
  }
  
  /**
   * element  : LookedUpFromActivities of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo LookedUpFromActivities__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LookedUpFromActivities","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean LookedUpFromActivities__is_set = false;

  private com.sforce.soap.enterprise.QueryResult LookedUpFromActivities;

  public com.sforce.soap.enterprise.QueryResult getLookedUpFromActivities() {
    return LookedUpFromActivities;
  }

  

  public void setLookedUpFromActivities(com.sforce.soap.enterprise.QueryResult LookedUpFromActivities) {
    this.LookedUpFromActivities = LookedUpFromActivities;
    LookedUpFromActivities__is_set = true;
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
   * element  : NumberOfContacts of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo NumberOfContacts__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","NumberOfContacts","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean NumberOfContacts__is_set = false;

  private java.lang.Integer NumberOfContacts;

  public java.lang.Integer getNumberOfContacts() {
    return NumberOfContacts;
  }

  

  public void setNumberOfContacts(java.lang.Integer NumberOfContacts) {
    this.NumberOfContacts = NumberOfContacts;
    NumberOfContacts__is_set = true;
  }
  
  /**
   * element  : NumberOfConvertedLeads of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo NumberOfConvertedLeads__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","NumberOfConvertedLeads","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean NumberOfConvertedLeads__is_set = false;

  private java.lang.Integer NumberOfConvertedLeads;

  public java.lang.Integer getNumberOfConvertedLeads() {
    return NumberOfConvertedLeads;
  }

  

  public void setNumberOfConvertedLeads(java.lang.Integer NumberOfConvertedLeads) {
    this.NumberOfConvertedLeads = NumberOfConvertedLeads;
    NumberOfConvertedLeads__is_set = true;
  }
  
  /**
   * element  : NumberOfLeads of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo NumberOfLeads__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","NumberOfLeads","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean NumberOfLeads__is_set = false;

  private java.lang.Integer NumberOfLeads;

  public java.lang.Integer getNumberOfLeads() {
    return NumberOfLeads;
  }

  

  public void setNumberOfLeads(java.lang.Integer NumberOfLeads) {
    this.NumberOfLeads = NumberOfLeads;
    NumberOfLeads__is_set = true;
  }
  
  /**
   * element  : NumberOfOpportunities of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo NumberOfOpportunities__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","NumberOfOpportunities","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean NumberOfOpportunities__is_set = false;

  private java.lang.Integer NumberOfOpportunities;

  public java.lang.Integer getNumberOfOpportunities() {
    return NumberOfOpportunities;
  }

  

  public void setNumberOfOpportunities(java.lang.Integer NumberOfOpportunities) {
    this.NumberOfOpportunities = NumberOfOpportunities;
    NumberOfOpportunities__is_set = true;
  }
  
  /**
   * element  : NumberOfResponses of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo NumberOfResponses__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","NumberOfResponses","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean NumberOfResponses__is_set = false;

  private java.lang.Integer NumberOfResponses;

  public java.lang.Integer getNumberOfResponses() {
    return NumberOfResponses;
  }

  

  public void setNumberOfResponses(java.lang.Integer NumberOfResponses) {
    this.NumberOfResponses = NumberOfResponses;
    NumberOfResponses__is_set = true;
  }
  
  /**
   * element  : NumberOfWonOpportunities of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo NumberOfWonOpportunities__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","NumberOfWonOpportunities","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean NumberOfWonOpportunities__is_set = false;

  private java.lang.Integer NumberOfWonOpportunities;

  public java.lang.Integer getNumberOfWonOpportunities() {
    return NumberOfWonOpportunities;
  }

  

  public void setNumberOfWonOpportunities(java.lang.Integer NumberOfWonOpportunities) {
    this.NumberOfWonOpportunities = NumberOfWonOpportunities;
    NumberOfWonOpportunities__is_set = true;
  }
  
  /**
   * element  : NumberSent of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo NumberSent__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","NumberSent","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean NumberSent__is_set = false;

  private java.lang.Double NumberSent;

  public java.lang.Double getNumberSent() {
    return NumberSent;
  }

  

  public void setNumberSent(java.lang.Double NumberSent) {
    this.NumberSent = NumberSent;
    NumberSent__is_set = true;
  }
  
  /**
   * element  : OpenActivities of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo OpenActivities__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OpenActivities","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean OpenActivities__is_set = false;

  private com.sforce.soap.enterprise.QueryResult OpenActivities;

  public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
    return OpenActivities;
  }

  

  public void setOpenActivities(com.sforce.soap.enterprise.QueryResult OpenActivities) {
    this.OpenActivities = OpenActivities;
    OpenActivities__is_set = true;
  }
  
  /**
   * element  : Opportunities of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Opportunities__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Opportunities","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Opportunities__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Opportunities;

  public com.sforce.soap.enterprise.QueryResult getOpportunities() {
    return Opportunities;
  }

  

  public void setOpportunities(com.sforce.soap.enterprise.QueryResult Opportunities) {
    this.Opportunities = Opportunities;
    Opportunities__is_set = true;
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
   * element  : Parent of type {urn:sobject.enterprise.soap.sforce.com}Campaign
   * java type: com.sforce.soap.enterprise.sobject.Campaign
   */
  private static final com.sforce.ws.bind.TypeInfo Parent__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Parent","urn:sobject.enterprise.soap.sforce.com","Campaign",0,1,true);

  private boolean Parent__is_set = false;

  private com.sforce.soap.enterprise.sobject.Campaign Parent;

  public com.sforce.soap.enterprise.sobject.Campaign getParent() {
    return Parent;
  }

  

  public void setParent(com.sforce.soap.enterprise.sobject.Campaign Parent) {
    this.Parent = Parent;
    Parent__is_set = true;
  }
  
  /**
   * element  : ParentId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ParentId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ParentId","urn:enterprise.soap.sforce.com","ID",0,1,true);

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
   * element  : ProcessInstances of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo ProcessInstances__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ProcessInstances","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean ProcessInstances__is_set = false;

  private com.sforce.soap.enterprise.QueryResult ProcessInstances;

  public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
    return ProcessInstances;
  }

  

  public void setProcessInstances(com.sforce.soap.enterprise.QueryResult ProcessInstances) {
    this.ProcessInstances = ProcessInstances;
    ProcessInstances__is_set = true;
  }
  
  /**
   * element  : ProcessSteps of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo ProcessSteps__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ProcessSteps","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean ProcessSteps__is_set = false;

  private com.sforce.soap.enterprise.QueryResult ProcessSteps;

  public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
    return ProcessSteps;
  }

  

  public void setProcessSteps(com.sforce.soap.enterprise.QueryResult ProcessSteps) {
    this.ProcessSteps = ProcessSteps;
    ProcessSteps__is_set = true;
  }
  
  /**
   * element  : RecordAssociatedGroups of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo RecordAssociatedGroups__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RecordAssociatedGroups","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean RecordAssociatedGroups__is_set = false;

  private com.sforce.soap.enterprise.QueryResult RecordAssociatedGroups;

  public com.sforce.soap.enterprise.QueryResult getRecordAssociatedGroups() {
    return RecordAssociatedGroups;
  }

  

  public void setRecordAssociatedGroups(com.sforce.soap.enterprise.QueryResult RecordAssociatedGroups) {
    this.RecordAssociatedGroups = RecordAssociatedGroups;
    RecordAssociatedGroups__is_set = true;
  }
  
  /**
   * element  : Shares of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Shares__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Shares","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Shares__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Shares;

  public com.sforce.soap.enterprise.QueryResult getShares() {
    return Shares;
  }

  

  public void setShares(com.sforce.soap.enterprise.QueryResult Shares) {
    this.Shares = Shares;
    Shares__is_set = true;
  }
  
  /**
   * element  : StartDate of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo StartDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","StartDate","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean StartDate__is_set = false;

  private java.util.Calendar StartDate;

  public java.util.Calendar getStartDate() {
    return StartDate;
  }

  

  public void setStartDate(java.util.Calendar StartDate) {
    this.StartDate = StartDate;
    StartDate__is_set = true;
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
   * element  : TaskRelations of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo TaskRelations__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TaskRelations","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean TaskRelations__is_set = false;

  private com.sforce.soap.enterprise.QueryResult TaskRelations;

  public com.sforce.soap.enterprise.QueryResult getTaskRelations() {
    return TaskRelations;
  }

  

  public void setTaskRelations(com.sforce.soap.enterprise.QueryResult TaskRelations) {
    this.TaskRelations = TaskRelations;
    TaskRelations__is_set = true;
  }
  
  /**
   * element  : Tasks of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Tasks__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Tasks","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Tasks__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Tasks;

  public com.sforce.soap.enterprise.QueryResult getTasks() {
    return Tasks;
  }

  

  public void setTasks(com.sforce.soap.enterprise.QueryResult Tasks) {
    this.Tasks = Tasks;
    Tasks__is_set = true;
  }
  
  /**
   * element  : TopicAssignments of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo TopicAssignments__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TopicAssignments","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean TopicAssignments__is_set = false;

  private com.sforce.soap.enterprise.QueryResult TopicAssignments;

  public com.sforce.soap.enterprise.QueryResult getTopicAssignments() {
    return TopicAssignments;
  }

  

  public void setTopicAssignments(com.sforce.soap.enterprise.QueryResult TopicAssignments) {
    this.TopicAssignments = TopicAssignments;
    TopicAssignments__is_set = true;
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
   * element  : UserRecordAccess of type {urn:sobject.enterprise.soap.sforce.com}UserRecordAccess
   * java type: com.sforce.soap.enterprise.sobject.UserRecordAccess
   */
  private static final com.sforce.ws.bind.TypeInfo UserRecordAccess__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserRecordAccess","urn:sobject.enterprise.soap.sforce.com","UserRecordAccess",0,1,true);

  private boolean UserRecordAccess__is_set = false;

  private com.sforce.soap.enterprise.sobject.UserRecordAccess UserRecordAccess;

  public com.sforce.soap.enterprise.sobject.UserRecordAccess getUserRecordAccess() {
    return UserRecordAccess;
  }

  

  public void setUserRecordAccess(com.sforce.soap.enterprise.sobject.UserRecordAccess UserRecordAccess) {
    this.UserRecordAccess = UserRecordAccess;
    UserRecordAccess__is_set = true;
  }
  
  /**
   * element  : smagicinteract__SMS_Batch_Execution_Tracker__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo smagicinteract__SMS_Batch_Execution_Tracker__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","smagicinteract__SMS_Batch_Execution_Tracker__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean smagicinteract__SMS_Batch_Execution_Tracker__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult smagicinteract__SMS_Batch_Execution_Tracker__r;

  public com.sforce.soap.enterprise.QueryResult getSmagicinteract__SMS_Batch_Execution_Tracker__r() {
    return smagicinteract__SMS_Batch_Execution_Tracker__r;
  }

  

  public void setSmagicinteract__SMS_Batch_Execution_Tracker__r(com.sforce.soap.enterprise.QueryResult smagicinteract__SMS_Batch_Execution_Tracker__r) {
    this.smagicinteract__SMS_Batch_Execution_Tracker__r = smagicinteract__SMS_Batch_Execution_Tracker__r;
    smagicinteract__SMS_Batch_Execution_Tracker__r__is_set = true;
  }
  
  /**
   * element  : smagicinteract__smsMagic__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo smagicinteract__smsMagic__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","smagicinteract__smsMagic__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean smagicinteract__smsMagic__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult smagicinteract__smsMagic__r;

  public com.sforce.soap.enterprise.QueryResult getSmagicinteract__smsMagic__r() {
    return smagicinteract__smsMagic__r;
  }

  

  public void setSmagicinteract__smsMagic__r(com.sforce.soap.enterprise.QueryResult smagicinteract__smsMagic__r) {
    this.smagicinteract__smsMagic__r = smagicinteract__smsMagic__r;
    smagicinteract__smsMagic__r__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "Campaign");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, ActivityHistories__typeInfo, ActivityHistories, ActivityHistories__is_set);
    __typeMapper.writeObject(__out, ActualCost__typeInfo, ActualCost, ActualCost__is_set);
    __typeMapper.writeObject(__out, AmountAllOpportunities__typeInfo, AmountAllOpportunities, AmountAllOpportunities__is_set);
    __typeMapper.writeObject(__out, AmountWonOpportunities__typeInfo, AmountWonOpportunities, AmountWonOpportunities__is_set);
    __typeMapper.writeObject(__out, AttachedContentDocuments__typeInfo, AttachedContentDocuments, AttachedContentDocuments__is_set);
    __typeMapper.writeObject(__out, AttachedContentNotes__typeInfo, AttachedContentNotes, AttachedContentNotes__is_set);
    __typeMapper.writeObject(__out, Attachments__typeInfo, Attachments, Attachments__is_set);
    __typeMapper.writeObject(__out, BudgetedCost__typeInfo, BudgetedCost, BudgetedCost__is_set);
    __typeMapper.writeObject(__out, CampaignMemberRecordType__typeInfo, CampaignMemberRecordType, CampaignMemberRecordType__is_set);
    __typeMapper.writeString(__out, CampaignMemberRecordTypeId__typeInfo, CampaignMemberRecordTypeId, CampaignMemberRecordTypeId__is_set);
    __typeMapper.writeObject(__out, CampaignMembers__typeInfo, CampaignMembers, CampaignMembers__is_set);
    __typeMapper.writeObject(__out, ChildCampaigns__typeInfo, ChildCampaigns, ChildCampaigns__is_set);
    __typeMapper.writeObject(__out, CombinedAttachments__typeInfo, CombinedAttachments, CombinedAttachments__is_set);
    __typeMapper.writeObject(__out, ContentDocumentLinks__typeInfo, ContentDocumentLinks, ContentDocumentLinks__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, Description__typeInfo, Description, Description__is_set);
    __typeMapper.writeObject(__out, Emails__typeInfo, Emails, Emails__is_set);
    __typeMapper.writeObject(__out, EndDate__typeInfo, EndDate, EndDate__is_set);
    __typeMapper.writeObject(__out, EventRelations__typeInfo, EventRelations, EventRelations__is_set);
    __typeMapper.writeObject(__out, Events__typeInfo, Events, Events__is_set);
    __typeMapper.writeObject(__out, ExpectedResponse__typeInfo, ExpectedResponse, ExpectedResponse__is_set);
    __typeMapper.writeObject(__out, ExpectedRevenue__typeInfo, ExpectedRevenue, ExpectedRevenue__is_set);
    __typeMapper.writeObject(__out, FeedSubscriptionsForEntity__typeInfo, FeedSubscriptionsForEntity, FeedSubscriptionsForEntity__is_set);
    __typeMapper.writeObject(__out, Feeds__typeInfo, Feeds, Feeds__is_set);
    __typeMapper.writeObject(__out, IsActive__typeInfo, IsActive, IsActive__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, LastActivityDate__typeInfo, LastActivityDate, LastActivityDate__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, LastReferencedDate__typeInfo, LastReferencedDate, LastReferencedDate__is_set);
    __typeMapper.writeObject(__out, LastViewedDate__typeInfo, LastViewedDate, LastViewedDate__is_set);
    __typeMapper.writeObject(__out, Leads__typeInfo, Leads, Leads__is_set);
    __typeMapper.writeObject(__out, LookedUpFromActivities__typeInfo, LookedUpFromActivities, LookedUpFromActivities__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeObject(__out, NumberOfContacts__typeInfo, NumberOfContacts, NumberOfContacts__is_set);
    __typeMapper.writeObject(__out, NumberOfConvertedLeads__typeInfo, NumberOfConvertedLeads, NumberOfConvertedLeads__is_set);
    __typeMapper.writeObject(__out, NumberOfLeads__typeInfo, NumberOfLeads, NumberOfLeads__is_set);
    __typeMapper.writeObject(__out, NumberOfOpportunities__typeInfo, NumberOfOpportunities, NumberOfOpportunities__is_set);
    __typeMapper.writeObject(__out, NumberOfResponses__typeInfo, NumberOfResponses, NumberOfResponses__is_set);
    __typeMapper.writeObject(__out, NumberOfWonOpportunities__typeInfo, NumberOfWonOpportunities, NumberOfWonOpportunities__is_set);
    __typeMapper.writeObject(__out, NumberSent__typeInfo, NumberSent, NumberSent__is_set);
    __typeMapper.writeObject(__out, OpenActivities__typeInfo, OpenActivities, OpenActivities__is_set);
    __typeMapper.writeObject(__out, Opportunities__typeInfo, Opportunities, Opportunities__is_set);
    __typeMapper.writeObject(__out, Owner__typeInfo, Owner, Owner__is_set);
    __typeMapper.writeString(__out, OwnerId__typeInfo, OwnerId, OwnerId__is_set);
    __typeMapper.writeObject(__out, Parent__typeInfo, Parent, Parent__is_set);
    __typeMapper.writeString(__out, ParentId__typeInfo, ParentId, ParentId__is_set);
    __typeMapper.writeObject(__out, ProcessInstances__typeInfo, ProcessInstances, ProcessInstances__is_set);
    __typeMapper.writeObject(__out, ProcessSteps__typeInfo, ProcessSteps, ProcessSteps__is_set);
    __typeMapper.writeObject(__out, RecordAssociatedGroups__typeInfo, RecordAssociatedGroups, RecordAssociatedGroups__is_set);
    __typeMapper.writeObject(__out, Shares__typeInfo, Shares, Shares__is_set);
    __typeMapper.writeObject(__out, StartDate__typeInfo, StartDate, StartDate__is_set);
    __typeMapper.writeString(__out, Status__typeInfo, Status, Status__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeObject(__out, Tags__typeInfo, Tags, Tags__is_set);
    __typeMapper.writeObject(__out, TaskRelations__typeInfo, TaskRelations, TaskRelations__is_set);
    __typeMapper.writeObject(__out, Tasks__typeInfo, Tasks, Tasks__is_set);
    __typeMapper.writeObject(__out, TopicAssignments__typeInfo, TopicAssignments, TopicAssignments__is_set);
    __typeMapper.writeString(__out, Type__typeInfo, Type, Type__is_set);
    __typeMapper.writeObject(__out, UserRecordAccess__typeInfo, UserRecordAccess, UserRecordAccess__is_set);
    __typeMapper.writeObject(__out, smagicinteract__SMS_Batch_Execution_Tracker__r__typeInfo, smagicinteract__SMS_Batch_Execution_Tracker__r, smagicinteract__SMS_Batch_Execution_Tracker__r__is_set);
    __typeMapper.writeObject(__out, smagicinteract__smsMagic__r__typeInfo, smagicinteract__smsMagic__r, smagicinteract__smsMagic__r__is_set);
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
    if (__typeMapper.isElement(__in, ActivityHistories__typeInfo)) {
      setActivityHistories((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, ActivityHistories__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ActualCost__typeInfo)) {
      setActualCost((java.lang.Double)__typeMapper.readObject(__in, ActualCost__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AmountAllOpportunities__typeInfo)) {
      setAmountAllOpportunities((java.lang.Double)__typeMapper.readObject(__in, AmountAllOpportunities__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AmountWonOpportunities__typeInfo)) {
      setAmountWonOpportunities((java.lang.Double)__typeMapper.readObject(__in, AmountWonOpportunities__typeInfo, java.lang.Double.class));
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
    if (__typeMapper.isElement(__in, BudgetedCost__typeInfo)) {
      setBudgetedCost((java.lang.Double)__typeMapper.readObject(__in, BudgetedCost__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CampaignMemberRecordType__typeInfo)) {
      setCampaignMemberRecordType((com.sforce.soap.enterprise.sobject.RecordType)__typeMapper.readObject(__in, CampaignMemberRecordType__typeInfo, com.sforce.soap.enterprise.sobject.RecordType.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CampaignMemberRecordTypeId__typeInfo)) {
      setCampaignMemberRecordTypeId((java.lang.String)__typeMapper.readString(__in, CampaignMemberRecordTypeId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CampaignMembers__typeInfo)) {
      setCampaignMembers((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, CampaignMembers__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ChildCampaigns__typeInfo)) {
      setChildCampaigns((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, ChildCampaigns__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    if (__typeMapper.isElement(__in, Emails__typeInfo)) {
      setEmails((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Emails__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, EndDate__typeInfo)) {
      setEndDate((java.util.Calendar)__typeMapper.readObject(__in, EndDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, EventRelations__typeInfo)) {
      setEventRelations((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, EventRelations__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Events__typeInfo)) {
      setEvents((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Events__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ExpectedResponse__typeInfo)) {
      setExpectedResponse((java.lang.Double)__typeMapper.readObject(__in, ExpectedResponse__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ExpectedRevenue__typeInfo)) {
      setExpectedRevenue((java.lang.Double)__typeMapper.readObject(__in, ExpectedRevenue__typeInfo, java.lang.Double.class));
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
    if (__typeMapper.isElement(__in, IsActive__typeInfo)) {
      setIsActive((java.lang.Boolean)__typeMapper.readObject(__in, IsActive__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {
      setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, IsDeleted__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LastActivityDate__typeInfo)) {
      setLastActivityDate((java.util.Calendar)__typeMapper.readObject(__in, LastActivityDate__typeInfo, java.util.Calendar.class));
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
    if (__typeMapper.isElement(__in, Leads__typeInfo)) {
      setLeads((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Leads__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LookedUpFromActivities__typeInfo)) {
      setLookedUpFromActivities((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, LookedUpFromActivities__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Name__typeInfo)) {
      setName((java.lang.String)__typeMapper.readString(__in, Name__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, NumberOfContacts__typeInfo)) {
      setNumberOfContacts((java.lang.Integer)__typeMapper.readObject(__in, NumberOfContacts__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, NumberOfConvertedLeads__typeInfo)) {
      setNumberOfConvertedLeads((java.lang.Integer)__typeMapper.readObject(__in, NumberOfConvertedLeads__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, NumberOfLeads__typeInfo)) {
      setNumberOfLeads((java.lang.Integer)__typeMapper.readObject(__in, NumberOfLeads__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, NumberOfOpportunities__typeInfo)) {
      setNumberOfOpportunities((java.lang.Integer)__typeMapper.readObject(__in, NumberOfOpportunities__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, NumberOfResponses__typeInfo)) {
      setNumberOfResponses((java.lang.Integer)__typeMapper.readObject(__in, NumberOfResponses__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, NumberOfWonOpportunities__typeInfo)) {
      setNumberOfWonOpportunities((java.lang.Integer)__typeMapper.readObject(__in, NumberOfWonOpportunities__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, NumberSent__typeInfo)) {
      setNumberSent((java.lang.Double)__typeMapper.readObject(__in, NumberSent__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OpenActivities__typeInfo)) {
      setOpenActivities((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, OpenActivities__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Opportunities__typeInfo)) {
      setOpportunities((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Opportunities__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    if (__typeMapper.isElement(__in, Parent__typeInfo)) {
      setParent((com.sforce.soap.enterprise.sobject.Campaign)__typeMapper.readObject(__in, Parent__typeInfo, com.sforce.soap.enterprise.sobject.Campaign.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ParentId__typeInfo)) {
      setParentId((java.lang.String)__typeMapper.readString(__in, ParentId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ProcessInstances__typeInfo)) {
      setProcessInstances((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, ProcessInstances__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ProcessSteps__typeInfo)) {
      setProcessSteps((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, ProcessSteps__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RecordAssociatedGroups__typeInfo)) {
      setRecordAssociatedGroups((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, RecordAssociatedGroups__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Shares__typeInfo)) {
      setShares((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Shares__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, StartDate__typeInfo)) {
      setStartDate((java.util.Calendar)__typeMapper.readObject(__in, StartDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Status__typeInfo)) {
      setStatus((java.lang.String)__typeMapper.readString(__in, Status__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, TaskRelations__typeInfo)) {
      setTaskRelations((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, TaskRelations__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Tasks__typeInfo)) {
      setTasks((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Tasks__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TopicAssignments__typeInfo)) {
      setTopicAssignments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, TopicAssignments__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Type__typeInfo)) {
      setType((java.lang.String)__typeMapper.readString(__in, Type__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserRecordAccess__typeInfo)) {
      setUserRecordAccess((com.sforce.soap.enterprise.sobject.UserRecordAccess)__typeMapper.readObject(__in, UserRecordAccess__typeInfo, com.sforce.soap.enterprise.sobject.UserRecordAccess.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, smagicinteract__SMS_Batch_Execution_Tracker__r__typeInfo)) {
      setSmagicinteract__SMS_Batch_Execution_Tracker__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, smagicinteract__SMS_Batch_Execution_Tracker__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, smagicinteract__smsMagic__r__typeInfo)) {
      setSmagicinteract__smsMagic__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, smagicinteract__smsMagic__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[Campaign ");
    sb.append(super.toString());
    sb.append(" ActivityHistories=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ActivityHistories)+"'\n");
    sb.append(" ActualCost=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ActualCost)+"'\n");
    sb.append(" AmountAllOpportunities=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AmountAllOpportunities)+"'\n");
    sb.append(" AmountWonOpportunities=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AmountWonOpportunities)+"'\n");
    sb.append(" AttachedContentDocuments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentDocuments)+"'\n");
    sb.append(" AttachedContentNotes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentNotes)+"'\n");
    sb.append(" Attachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Attachments)+"'\n");
    sb.append(" BudgetedCost=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(BudgetedCost)+"'\n");
    sb.append(" CampaignMemberRecordType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CampaignMemberRecordType)+"'\n");
    sb.append(" CampaignMemberRecordTypeId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CampaignMemberRecordTypeId)+"'\n");
    sb.append(" CampaignMembers=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CampaignMembers)+"'\n");
    sb.append(" ChildCampaigns=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ChildCampaigns)+"'\n");
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
    sb.append(" Emails=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Emails)+"'\n");
    sb.append(" EndDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EndDate)+"'\n");
    sb.append(" EventRelations=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EventRelations)+"'\n");
    sb.append(" Events=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Events)+"'\n");
    sb.append(" ExpectedResponse=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ExpectedResponse)+"'\n");
    sb.append(" ExpectedRevenue=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ExpectedRevenue)+"'\n");
    sb.append(" FeedSubscriptionsForEntity=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FeedSubscriptionsForEntity)+"'\n");
    sb.append(" Feeds=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Feeds)+"'\n");
    sb.append(" IsActive=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsActive)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" LastActivityDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastActivityDate)+"'\n");
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
    sb.append(" Leads=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Leads)+"'\n");
    sb.append(" LookedUpFromActivities=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LookedUpFromActivities)+"'\n");
    sb.append(" Name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");
    sb.append(" NumberOfContacts=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NumberOfContacts)+"'\n");
    sb.append(" NumberOfConvertedLeads=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NumberOfConvertedLeads)+"'\n");
    sb.append(" NumberOfLeads=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NumberOfLeads)+"'\n");
    sb.append(" NumberOfOpportunities=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NumberOfOpportunities)+"'\n");
    sb.append(" NumberOfResponses=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NumberOfResponses)+"'\n");
    sb.append(" NumberOfWonOpportunities=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NumberOfWonOpportunities)+"'\n");
    sb.append(" NumberSent=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NumberSent)+"'\n");
    sb.append(" OpenActivities=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OpenActivities)+"'\n");
    sb.append(" Opportunities=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Opportunities)+"'\n");
    sb.append(" Owner=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Owner)+"'\n");
    sb.append(" OwnerId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OwnerId)+"'\n");
    sb.append(" Parent=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Parent)+"'\n");
    sb.append(" ParentId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ParentId)+"'\n");
    sb.append(" ProcessInstances=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessInstances)+"'\n");
    sb.append(" ProcessSteps=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessSteps)+"'\n");
    sb.append(" RecordAssociatedGroups=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecordAssociatedGroups)+"'\n");
    sb.append(" Shares=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Shares)+"'\n");
    sb.append(" StartDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(StartDate)+"'\n");
    sb.append(" Status=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Status)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" Tags=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Tags)+"'\n");
    sb.append(" TaskRelations=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TaskRelations)+"'\n");
    sb.append(" Tasks=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Tasks)+"'\n");
    sb.append(" TopicAssignments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TopicAssignments)+"'\n");
    sb.append(" Type=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Type)+"'\n");
    sb.append(" UserRecordAccess=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserRecordAccess)+"'\n");
    sb.append(" smagicinteract__SMS_Batch_Execution_Tracker__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(smagicinteract__SMS_Batch_Execution_Tracker__r)+"'\n");
    sb.append(" smagicinteract__smsMagic__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(smagicinteract__smsMagic__r)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}