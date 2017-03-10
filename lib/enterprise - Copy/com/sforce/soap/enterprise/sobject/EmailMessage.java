package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class EmailMessage extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public EmailMessage() {
  }
    
  
  /**
   * element  : ActivityId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ActivityId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ActivityId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ActivityId__is_set = false;

  private java.lang.String ActivityId;

  public java.lang.String getActivityId() {
    return ActivityId;
  }

  

  public void setActivityId(java.lang.String ActivityId) {
    this.ActivityId = ActivityId;
    ActivityId__is_set = true;
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
   * element  : BccAddress of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo BccAddress__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","BccAddress","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean BccAddress__is_set = false;

  private java.lang.String BccAddress;

  public java.lang.String getBccAddress() {
    return BccAddress;
  }

  

  public void setBccAddress(java.lang.String BccAddress) {
    this.BccAddress = BccAddress;
    BccAddress__is_set = true;
  }
  
  /**
   * element  : BccIds of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String[]
   */
  private static final com.sforce.ws.bind.TypeInfo BccIds__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","BccIds","urn:enterprise.soap.sforce.com","ID",0,-1,true);

  private boolean BccIds__is_set = false;

  private java.lang.String[] BccIds = new java.lang.String[0];

  public java.lang.String[] getBccIds() {
    return BccIds;
  }

  

  public void setBccIds(java.lang.String[] BccIds) {
    this.BccIds = BccIds;
    BccIds__is_set = true;
  }
  
  /**
   * element  : CcAddress of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CcAddress__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CcAddress","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean CcAddress__is_set = false;

  private java.lang.String CcAddress;

  public java.lang.String getCcAddress() {
    return CcAddress;
  }

  

  public void setCcAddress(java.lang.String CcAddress) {
    this.CcAddress = CcAddress;
    CcAddress__is_set = true;
  }
  
  /**
   * element  : CcIds of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String[]
   */
  private static final com.sforce.ws.bind.TypeInfo CcIds__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CcIds","urn:enterprise.soap.sforce.com","ID",0,-1,true);

  private boolean CcIds__is_set = false;

  private java.lang.String[] CcIds = new java.lang.String[0];

  public java.lang.String[] getCcIds() {
    return CcIds;
  }

  

  public void setCcIds(java.lang.String[] CcIds) {
    this.CcIds = CcIds;
    CcIds__is_set = true;
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
   * element  : ContentDocumentIds of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String[]
   */
  private static final com.sforce.ws.bind.TypeInfo ContentDocumentIds__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ContentDocumentIds","urn:enterprise.soap.sforce.com","ID",0,-1,true);

  private boolean ContentDocumentIds__is_set = false;

  private java.lang.String[] ContentDocumentIds = new java.lang.String[0];

  public java.lang.String[] getContentDocumentIds() {
    return ContentDocumentIds;
  }

  

  public void setContentDocumentIds(java.lang.String[] ContentDocumentIds) {
    this.ContentDocumentIds = ContentDocumentIds;
    ContentDocumentIds__is_set = true;
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
   * element  : EmailMessageRelations of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo EmailMessageRelations__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","EmailMessageRelations","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean EmailMessageRelations__is_set = false;

  private com.sforce.soap.enterprise.QueryResult EmailMessageRelations;

  public com.sforce.soap.enterprise.QueryResult getEmailMessageRelations() {
    return EmailMessageRelations;
  }

  

  public void setEmailMessageRelations(com.sforce.soap.enterprise.QueryResult EmailMessageRelations) {
    this.EmailMessageRelations = EmailMessageRelations;
    EmailMessageRelations__is_set = true;
  }
  
  /**
   * element  : FromAddress of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo FromAddress__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FromAddress","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean FromAddress__is_set = false;

  private java.lang.String FromAddress;

  public java.lang.String getFromAddress() {
    return FromAddress;
  }

  

  public void setFromAddress(java.lang.String FromAddress) {
    this.FromAddress = FromAddress;
    FromAddress__is_set = true;
  }
  
  /**
   * element  : FromName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo FromName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FromName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean FromName__is_set = false;

  private java.lang.String FromName;

  public java.lang.String getFromName() {
    return FromName;
  }

  

  public void setFromName(java.lang.String FromName) {
    this.FromName = FromName;
    FromName__is_set = true;
  }
  
  /**
   * element  : HasAttachment of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo HasAttachment__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","HasAttachment","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean HasAttachment__is_set = false;

  private java.lang.Boolean HasAttachment;

  public java.lang.Boolean getHasAttachment() {
    return HasAttachment;
  }

  

  public void setHasAttachment(java.lang.Boolean HasAttachment) {
    this.HasAttachment = HasAttachment;
    HasAttachment__is_set = true;
  }
  
  /**
   * element  : Headers of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Headers__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Headers","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Headers__is_set = false;

  private java.lang.String Headers;

  public java.lang.String getHeaders() {
    return Headers;
  }

  

  public void setHeaders(java.lang.String Headers) {
    this.Headers = Headers;
    Headers__is_set = true;
  }
  
  /**
   * element  : HtmlBody of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo HtmlBody__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","HtmlBody","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean HtmlBody__is_set = false;

  private java.lang.String HtmlBody;

  public java.lang.String getHtmlBody() {
    return HtmlBody;
  }

  

  public void setHtmlBody(java.lang.String HtmlBody) {
    this.HtmlBody = HtmlBody;
    HtmlBody__is_set = true;
  }
  
  /**
   * element  : Incoming of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Incoming__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Incoming","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Incoming__is_set = false;

  private java.lang.Boolean Incoming;

  public java.lang.Boolean getIncoming() {
    return Incoming;
  }

  

  public void setIncoming(java.lang.Boolean Incoming) {
    this.Incoming = Incoming;
    Incoming__is_set = true;
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
   * element  : IsExternallyVisible of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsExternallyVisible__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsExternallyVisible","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsExternallyVisible__is_set = false;

  private java.lang.Boolean IsExternallyVisible;

  public java.lang.Boolean getIsExternallyVisible() {
    return IsExternallyVisible;
  }

  

  public void setIsExternallyVisible(java.lang.Boolean IsExternallyVisible) {
    this.IsExternallyVisible = IsExternallyVisible;
    IsExternallyVisible__is_set = true;
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
   * element  : MessageDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo MessageDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MessageDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean MessageDate__is_set = false;

  private java.util.Calendar MessageDate;

  public java.util.Calendar getMessageDate() {
    return MessageDate;
  }

  

  public void setMessageDate(java.util.Calendar MessageDate) {
    this.MessageDate = MessageDate;
    MessageDate__is_set = true;
  }
  
  /**
   * element  : Parent of type {urn:sobject.enterprise.soap.sforce.com}Case
   * java type: com.sforce.soap.enterprise.sobject.Case
   */
  private static final com.sforce.ws.bind.TypeInfo Parent__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Parent","urn:sobject.enterprise.soap.sforce.com","Case",0,1,true);

  private boolean Parent__is_set = false;

  private com.sforce.soap.enterprise.sobject.Case Parent;

  public com.sforce.soap.enterprise.sobject.Case getParent() {
    return Parent;
  }

  

  public void setParent(com.sforce.soap.enterprise.sobject.Case Parent) {
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
   * element  : RelatedTo of type {urn:sobject.enterprise.soap.sforce.com}Name
   * java type: com.sforce.soap.enterprise.sobject.Name
   */
  private static final com.sforce.ws.bind.TypeInfo RelatedTo__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RelatedTo","urn:sobject.enterprise.soap.sforce.com","Name",0,1,true);

  private boolean RelatedTo__is_set = false;

  private com.sforce.soap.enterprise.sobject.Name RelatedTo;

  public com.sforce.soap.enterprise.sobject.Name getRelatedTo() {
    return RelatedTo;
  }

  

  public void setRelatedTo(com.sforce.soap.enterprise.sobject.Name RelatedTo) {
    this.RelatedTo = RelatedTo;
    RelatedTo__is_set = true;
  }
  
  /**
   * element  : RelatedToId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo RelatedToId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RelatedToId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean RelatedToId__is_set = false;

  private java.lang.String RelatedToId;

  public java.lang.String getRelatedToId() {
    return RelatedToId;
  }

  

  public void setRelatedToId(java.lang.String RelatedToId) {
    this.RelatedToId = RelatedToId;
    RelatedToId__is_set = true;
  }
  
  /**
   * element  : ReplyToEmailMessage of type {urn:sobject.enterprise.soap.sforce.com}EmailMessage
   * java type: com.sforce.soap.enterprise.sobject.EmailMessage
   */
  private static final com.sforce.ws.bind.TypeInfo ReplyToEmailMessage__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ReplyToEmailMessage","urn:sobject.enterprise.soap.sforce.com","EmailMessage",0,1,true);

  private boolean ReplyToEmailMessage__is_set = false;

  private com.sforce.soap.enterprise.sobject.EmailMessage ReplyToEmailMessage;

  public com.sforce.soap.enterprise.sobject.EmailMessage getReplyToEmailMessage() {
    return ReplyToEmailMessage;
  }

  

  public void setReplyToEmailMessage(com.sforce.soap.enterprise.sobject.EmailMessage ReplyToEmailMessage) {
    this.ReplyToEmailMessage = ReplyToEmailMessage;
    ReplyToEmailMessage__is_set = true;
  }
  
  /**
   * element  : ReplyToEmailMessageId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ReplyToEmailMessageId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ReplyToEmailMessageId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ReplyToEmailMessageId__is_set = false;

  private java.lang.String ReplyToEmailMessageId;

  public java.lang.String getReplyToEmailMessageId() {
    return ReplyToEmailMessageId;
  }

  

  public void setReplyToEmailMessageId(java.lang.String ReplyToEmailMessageId) {
    this.ReplyToEmailMessageId = ReplyToEmailMessageId;
    ReplyToEmailMessageId__is_set = true;
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
   * element  : TextBody of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo TextBody__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TextBody","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean TextBody__is_set = false;

  private java.lang.String TextBody;

  public java.lang.String getTextBody() {
    return TextBody;
  }

  

  public void setTextBody(java.lang.String TextBody) {
    this.TextBody = TextBody;
    TextBody__is_set = true;
  }
  
  /**
   * element  : ToAddress of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ToAddress__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ToAddress","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ToAddress__is_set = false;

  private java.lang.String ToAddress;

  public java.lang.String getToAddress() {
    return ToAddress;
  }

  

  public void setToAddress(java.lang.String ToAddress) {
    this.ToAddress = ToAddress;
    ToAddress__is_set = true;
  }
  
  /**
   * element  : ToIds of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String[]
   */
  private static final com.sforce.ws.bind.TypeInfo ToIds__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ToIds","urn:enterprise.soap.sforce.com","ID",0,-1,true);

  private boolean ToIds__is_set = false;

  private java.lang.String[] ToIds = new java.lang.String[0];

  public java.lang.String[] getToIds() {
    return ToIds;
  }

  

  public void setToIds(java.lang.String[] ToIds) {
    this.ToIds = ToIds;
    ToIds__is_set = true;
  }
  
  /**
   * element  : ValidatedFromAddress of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ValidatedFromAddress__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ValidatedFromAddress","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ValidatedFromAddress__is_set = false;

  private java.lang.String ValidatedFromAddress;

  public java.lang.String getValidatedFromAddress() {
    return ValidatedFromAddress;
  }

  

  public void setValidatedFromAddress(java.lang.String ValidatedFromAddress) {
    this.ValidatedFromAddress = ValidatedFromAddress;
    ValidatedFromAddress__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "EmailMessage");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, ActivityId__typeInfo, ActivityId, ActivityId__is_set);
    __typeMapper.writeObject(__out, AttachedContentDocuments__typeInfo, AttachedContentDocuments, AttachedContentDocuments__is_set);
    __typeMapper.writeObject(__out, AttachedContentNotes__typeInfo, AttachedContentNotes, AttachedContentNotes__is_set);
    __typeMapper.writeObject(__out, Attachments__typeInfo, Attachments, Attachments__is_set);
    __typeMapper.writeString(__out, BccAddress__typeInfo, BccAddress, BccAddress__is_set);
    __typeMapper.writeObject(__out, BccIds__typeInfo, BccIds, BccIds__is_set);
    __typeMapper.writeString(__out, CcAddress__typeInfo, CcAddress, CcAddress__is_set);
    __typeMapper.writeObject(__out, CcIds__typeInfo, CcIds, CcIds__is_set);
    __typeMapper.writeObject(__out, CombinedAttachments__typeInfo, CombinedAttachments, CombinedAttachments__is_set);
    __typeMapper.writeObject(__out, ContentDocumentIds__typeInfo, ContentDocumentIds, ContentDocumentIds__is_set);
    __typeMapper.writeObject(__out, ContentDocumentLinks__typeInfo, ContentDocumentLinks, ContentDocumentLinks__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeObject(__out, EmailMessageRelations__typeInfo, EmailMessageRelations, EmailMessageRelations__is_set);
    __typeMapper.writeString(__out, FromAddress__typeInfo, FromAddress, FromAddress__is_set);
    __typeMapper.writeString(__out, FromName__typeInfo, FromName, FromName__is_set);
    __typeMapper.writeObject(__out, HasAttachment__typeInfo, HasAttachment, HasAttachment__is_set);
    __typeMapper.writeString(__out, Headers__typeInfo, Headers, Headers__is_set);
    __typeMapper.writeString(__out, HtmlBody__typeInfo, HtmlBody, HtmlBody__is_set);
    __typeMapper.writeObject(__out, Incoming__typeInfo, Incoming, Incoming__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, IsExternallyVisible__typeInfo, IsExternallyVisible, IsExternallyVisible__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, MessageDate__typeInfo, MessageDate, MessageDate__is_set);
    __typeMapper.writeObject(__out, Parent__typeInfo, Parent, Parent__is_set);
    __typeMapper.writeString(__out, ParentId__typeInfo, ParentId, ParentId__is_set);
    __typeMapper.writeObject(__out, ProcessInstances__typeInfo, ProcessInstances, ProcessInstances__is_set);
    __typeMapper.writeObject(__out, ProcessSteps__typeInfo, ProcessSteps, ProcessSteps__is_set);
    __typeMapper.writeObject(__out, RelatedTo__typeInfo, RelatedTo, RelatedTo__is_set);
    __typeMapper.writeString(__out, RelatedToId__typeInfo, RelatedToId, RelatedToId__is_set);
    __typeMapper.writeObject(__out, ReplyToEmailMessage__typeInfo, ReplyToEmailMessage, ReplyToEmailMessage__is_set);
    __typeMapper.writeString(__out, ReplyToEmailMessageId__typeInfo, ReplyToEmailMessageId, ReplyToEmailMessageId__is_set);
    __typeMapper.writeString(__out, Status__typeInfo, Status, Status__is_set);
    __typeMapper.writeString(__out, Subject__typeInfo, Subject, Subject__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeString(__out, TextBody__typeInfo, TextBody, TextBody__is_set);
    __typeMapper.writeString(__out, ToAddress__typeInfo, ToAddress, ToAddress__is_set);
    __typeMapper.writeObject(__out, ToIds__typeInfo, ToIds, ToIds__is_set);
    __typeMapper.writeString(__out, ValidatedFromAddress__typeInfo, ValidatedFromAddress, ValidatedFromAddress__is_set);
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
    if (__typeMapper.isElement(__in, ActivityId__typeInfo)) {
      setActivityId((java.lang.String)__typeMapper.readString(__in, ActivityId__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, BccAddress__typeInfo)) {
      setBccAddress((java.lang.String)__typeMapper.readString(__in, BccAddress__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, BccIds__typeInfo)) {
      setBccIds((java.lang.String[])__typeMapper.readObject(__in, BccIds__typeInfo, java.lang.String[].class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CcAddress__typeInfo)) {
      setCcAddress((java.lang.String)__typeMapper.readString(__in, CcAddress__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CcIds__typeInfo)) {
      setCcIds((java.lang.String[])__typeMapper.readObject(__in, CcIds__typeInfo, java.lang.String[].class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CombinedAttachments__typeInfo)) {
      setCombinedAttachments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, CombinedAttachments__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ContentDocumentIds__typeInfo)) {
      setContentDocumentIds((java.lang.String[])__typeMapper.readObject(__in, ContentDocumentIds__typeInfo, java.lang.String[].class));
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
    if (__typeMapper.isElement(__in, EmailMessageRelations__typeInfo)) {
      setEmailMessageRelations((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, EmailMessageRelations__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FromAddress__typeInfo)) {
      setFromAddress((java.lang.String)__typeMapper.readString(__in, FromAddress__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FromName__typeInfo)) {
      setFromName((java.lang.String)__typeMapper.readString(__in, FromName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, HasAttachment__typeInfo)) {
      setHasAttachment((java.lang.Boolean)__typeMapper.readObject(__in, HasAttachment__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Headers__typeInfo)) {
      setHeaders((java.lang.String)__typeMapper.readString(__in, Headers__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, HtmlBody__typeInfo)) {
      setHtmlBody((java.lang.String)__typeMapper.readString(__in, HtmlBody__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Incoming__typeInfo)) {
      setIncoming((java.lang.Boolean)__typeMapper.readObject(__in, Incoming__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {
      setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, IsDeleted__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsExternallyVisible__typeInfo)) {
      setIsExternallyVisible((java.lang.Boolean)__typeMapper.readObject(__in, IsExternallyVisible__typeInfo, java.lang.Boolean.class));
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
    if (__typeMapper.isElement(__in, MessageDate__typeInfo)) {
      setMessageDate((java.util.Calendar)__typeMapper.readObject(__in, MessageDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Parent__typeInfo)) {
      setParent((com.sforce.soap.enterprise.sobject.Case)__typeMapper.readObject(__in, Parent__typeInfo, com.sforce.soap.enterprise.sobject.Case.class));
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
    if (__typeMapper.isElement(__in, RelatedTo__typeInfo)) {
      setRelatedTo((com.sforce.soap.enterprise.sobject.Name)__typeMapper.readObject(__in, RelatedTo__typeInfo, com.sforce.soap.enterprise.sobject.Name.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RelatedToId__typeInfo)) {
      setRelatedToId((java.lang.String)__typeMapper.readString(__in, RelatedToId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ReplyToEmailMessage__typeInfo)) {
      setReplyToEmailMessage((com.sforce.soap.enterprise.sobject.EmailMessage)__typeMapper.readObject(__in, ReplyToEmailMessage__typeInfo, com.sforce.soap.enterprise.sobject.EmailMessage.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ReplyToEmailMessageId__typeInfo)) {
      setReplyToEmailMessageId((java.lang.String)__typeMapper.readString(__in, ReplyToEmailMessageId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Status__typeInfo)) {
      setStatus((java.lang.String)__typeMapper.readString(__in, Status__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, TextBody__typeInfo)) {
      setTextBody((java.lang.String)__typeMapper.readString(__in, TextBody__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ToAddress__typeInfo)) {
      setToAddress((java.lang.String)__typeMapper.readString(__in, ToAddress__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ToIds__typeInfo)) {
      setToIds((java.lang.String[])__typeMapper.readObject(__in, ToIds__typeInfo, java.lang.String[].class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ValidatedFromAddress__typeInfo)) {
      setValidatedFromAddress((java.lang.String)__typeMapper.readString(__in, ValidatedFromAddress__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[EmailMessage ");
    sb.append(super.toString());
    sb.append(" ActivityId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ActivityId)+"'\n");
    sb.append(" AttachedContentDocuments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentDocuments)+"'\n");
    sb.append(" AttachedContentNotes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentNotes)+"'\n");
    sb.append(" Attachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Attachments)+"'\n");
    sb.append(" BccAddress=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(BccAddress)+"'\n");
    sb.append(" BccIds=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(BccIds)+"'\n");
    sb.append(" CcAddress=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CcAddress)+"'\n");
    sb.append(" CcIds=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CcIds)+"'\n");
    sb.append(" CombinedAttachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CombinedAttachments)+"'\n");
    sb.append(" ContentDocumentIds=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContentDocumentIds)+"'\n");
    sb.append(" ContentDocumentLinks=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContentDocumentLinks)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" EmailMessageRelations=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EmailMessageRelations)+"'\n");
    sb.append(" FromAddress=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FromAddress)+"'\n");
    sb.append(" FromName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FromName)+"'\n");
    sb.append(" HasAttachment=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(HasAttachment)+"'\n");
    sb.append(" Headers=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Headers)+"'\n");
    sb.append(" HtmlBody=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(HtmlBody)+"'\n");
    sb.append(" Incoming=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Incoming)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" IsExternallyVisible=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsExternallyVisible)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" MessageDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MessageDate)+"'\n");
    sb.append(" Parent=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Parent)+"'\n");
    sb.append(" ParentId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ParentId)+"'\n");
    sb.append(" ProcessInstances=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessInstances)+"'\n");
    sb.append(" ProcessSteps=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessSteps)+"'\n");
    sb.append(" RelatedTo=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RelatedTo)+"'\n");
    sb.append(" RelatedToId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RelatedToId)+"'\n");
    sb.append(" ReplyToEmailMessage=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ReplyToEmailMessage)+"'\n");
    sb.append(" ReplyToEmailMessageId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ReplyToEmailMessageId)+"'\n");
    sb.append(" Status=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Status)+"'\n");
    sb.append(" Subject=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Subject)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" TextBody=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TextBody)+"'\n");
    sb.append(" ToAddress=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ToAddress)+"'\n");
    sb.append(" ToIds=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ToIds)+"'\n");
    sb.append(" ValidatedFromAddress=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ValidatedFromAddress)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}