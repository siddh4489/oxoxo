package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class Revenue__c extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public Revenue__c() {
  }
    
  
  /**
   * element  : Account__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Account__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Account__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean Account__c__is_set = false;

  private java.lang.String Account__c;

  public java.lang.String getAccount__c() {
    return Account__c;
  }

  

  public void setAccount__c(java.lang.String Account__c) {
    this.Account__c = Account__c;
    Account__c__is_set = true;
  }
  
  /**
   * element  : Account__r of type {urn:sobject.enterprise.soap.sforce.com}Account
   * java type: com.sforce.soap.enterprise.sobject.Account
   */
  private static final com.sforce.ws.bind.TypeInfo Account__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Account__r","urn:sobject.enterprise.soap.sforce.com","Account",0,1,true);

  private boolean Account__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.Account Account__r;

  public com.sforce.soap.enterprise.sobject.Account getAccount__r() {
    return Account__r;
  }

  

  public void setAccount__r(com.sforce.soap.enterprise.sobject.Account Account__r) {
    this.Account__r = Account__r;
    Account__r__is_set = true;
  }
  
  /**
   * element  : Aging__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Aging__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Aging__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Aging__c__is_set = false;

  private java.lang.Double Aging__c;

  public java.lang.Double getAging__c() {
    return Aging__c;
  }

  

  public void setAging__c(java.lang.Double Aging__c) {
    this.Aging__c = Aging__c;
    Aging__c__is_set = true;
  }
  
  /**
   * element  : Amount_Paid__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Amount_Paid__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Amount_Paid__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Amount_Paid__c__is_set = false;

  private java.lang.Double Amount_Paid__c;

  public java.lang.Double getAmount_Paid__c() {
    return Amount_Paid__c;
  }

  

  public void setAmount_Paid__c(java.lang.Double Amount_Paid__c) {
    this.Amount_Paid__c = Amount_Paid__c;
    Amount_Paid__c__is_set = true;
  }
  
  /**
   * element  : Assignment__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Assignment__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Assignment__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean Assignment__c__is_set = false;

  private java.lang.String Assignment__c;

  public java.lang.String getAssignment__c() {
    return Assignment__c;
  }

  

  public void setAssignment__c(java.lang.String Assignment__c) {
    this.Assignment__c = Assignment__c;
    Assignment__c__is_set = true;
  }
  
  /**
   * element  : Assignment__r of type {urn:sobject.enterprise.soap.sforce.com}Assignment__c
   * java type: com.sforce.soap.enterprise.sobject.Assignment__c
   */
  private static final com.sforce.ws.bind.TypeInfo Assignment__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Assignment__r","urn:sobject.enterprise.soap.sforce.com","Assignment__c",0,1,true);

  private boolean Assignment__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.Assignment__c Assignment__r;

  public com.sforce.soap.enterprise.sobject.Assignment__c getAssignment__r() {
    return Assignment__r;
  }

  

  public void setAssignment__r(com.sforce.soap.enterprise.sobject.Assignment__c Assignment__r) {
    this.Assignment__r = Assignment__r;
    Assignment__r__is_set = true;
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
   * element  : Average_Net_Profit__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Average_Net_Profit__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Average_Net_Profit__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Average_Net_Profit__c__is_set = false;

  private java.lang.Double Average_Net_Profit__c;

  public java.lang.Double getAverage_Net_Profit__c() {
    return Average_Net_Profit__c;
  }

  

  public void setAverage_Net_Profit__c(java.lang.Double Average_Net_Profit__c) {
    this.Average_Net_Profit__c = Average_Net_Profit__c;
    Average_Net_Profit__c__is_set = true;
  }
  
  /**
   * element  : Avg_Fillperson_Period_GP__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Avg_Fillperson_Period_GP__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Avg_Fillperson_Period_GP__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Avg_Fillperson_Period_GP__c__is_set = false;

  private java.lang.Double Avg_Fillperson_Period_GP__c;

  public java.lang.Double getAvg_Fillperson_Period_GP__c() {
    return Avg_Fillperson_Period_GP__c;
  }

  

  public void setAvg_Fillperson_Period_GP__c(java.lang.Double Avg_Fillperson_Period_GP__c) {
    this.Avg_Fillperson_Period_GP__c = Avg_Fillperson_Period_GP__c;
    Avg_Fillperson_Period_GP__c__is_set = true;
  }
  
  /**
   * element  : Avg_Salesperson_Period_GP__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Avg_Salesperson_Period_GP__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Avg_Salesperson_Period_GP__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Avg_Salesperson_Period_GP__c__is_set = false;

  private java.lang.Double Avg_Salesperson_Period_GP__c;

  public java.lang.Double getAvg_Salesperson_Period_GP__c() {
    return Avg_Salesperson_Period_GP__c;
  }

  

  public void setAvg_Salesperson_Period_GP__c(java.lang.Double Avg_Salesperson_Period_GP__c) {
    this.Avg_Salesperson_Period_GP__c = Avg_Salesperson_Period_GP__c;
    Avg_Salesperson_Period_GP__c__is_set = true;
  }
  
  /**
   * element  : Client_State__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Client_State__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Client_State__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Client_State__c__is_set = false;

  private java.lang.String Client_State__c;

  public java.lang.String getClient_State__c() {
    return Client_State__c;
  }

  

  public void setClient_State__c(java.lang.String Client_State__c) {
    this.Client_State__c = Client_State__c;
    Client_State__c__is_set = true;
  }
  
  /**
   * element  : Collection_Date__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Collection_Date__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Collection_Date__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Collection_Date__c__is_set = false;

  private java.util.Calendar Collection_Date__c;

  public java.util.Calendar getCollection_Date__c() {
    return Collection_Date__c;
  }

  

  public void setCollection_Date__c(java.util.Calendar Collection_Date__c) {
    this.Collection_Date__c = Collection_Date__c;
    Collection_Date__c__is_set = true;
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
   * element  : Customer_Name__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Customer_Name__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Customer_Name__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Customer_Name__c__is_set = false;

  private java.lang.String Customer_Name__c;

  public java.lang.String getCustomer_Name__c() {
    return Customer_Name__c;
  }

  

  public void setCustomer_Name__c(java.lang.String Customer_Name__c) {
    this.Customer_Name__c = Customer_Name__c;
    Customer_Name__c__is_set = true;
  }
  
  /**
   * element  : Deal_ID__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Deal_ID__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Deal_ID__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Deal_ID__c__is_set = false;

  private java.lang.String Deal_ID__c;

  public java.lang.String getDeal_ID__c() {
    return Deal_ID__c;
  }

  

  public void setDeal_ID__c(java.lang.String Deal_ID__c) {
    this.Deal_ID__c = Deal_ID__c;
    Deal_ID__c__is_set = true;
  }
  
  /**
   * element  : DuplicateRecordItems of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo DuplicateRecordItems__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DuplicateRecordItems","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean DuplicateRecordItems__is_set = false;

  private com.sforce.soap.enterprise.QueryResult DuplicateRecordItems;

  public com.sforce.soap.enterprise.QueryResult getDuplicateRecordItems() {
    return DuplicateRecordItems;
  }

  

  public void setDuplicateRecordItems(com.sforce.soap.enterprise.QueryResult DuplicateRecordItems) {
    this.DuplicateRecordItems = DuplicateRecordItems;
    DuplicateRecordItems__is_set = true;
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
   * element  : Gross_Profit__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Gross_Profit__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Gross_Profit__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Gross_Profit__c__is_set = false;

  private java.lang.Double Gross_Profit__c;

  public java.lang.Double getGross_Profit__c() {
    return Gross_Profit__c;
  }

  

  public void setGross_Profit__c(java.lang.Double Gross_Profit__c) {
    this.Gross_Profit__c = Gross_Profit__c;
    Gross_Profit__c__is_set = true;
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
   * element  : Hours_Billed__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Hours_Billed__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Hours_Billed__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Hours_Billed__c__is_set = false;

  private java.lang.Double Hours_Billed__c;

  public java.lang.Double getHours_Billed__c() {
    return Hours_Billed__c;
  }

  

  public void setHours_Billed__c(java.lang.Double Hours_Billed__c) {
    this.Hours_Billed__c = Hours_Billed__c;
    Hours_Billed__c__is_set = true;
  }
  
  /**
   * element  : Hours_Worked__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Hours_Worked__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Hours_Worked__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Hours_Worked__c__is_set = false;

  private java.lang.Double Hours_Worked__c;

  public java.lang.Double getHours_Worked__c() {
    return Hours_Worked__c;
  }

  

  public void setHours_Worked__c(java.lang.Double Hours_Worked__c) {
    this.Hours_Worked__c = Hours_Worked__c;
    Hours_Worked__c__is_set = true;
  }
  
  /**
   * element  : Invoice_Amount__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Invoice_Amount__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Invoice_Amount__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Invoice_Amount__c__is_set = false;

  private java.lang.Double Invoice_Amount__c;

  public java.lang.Double getInvoice_Amount__c() {
    return Invoice_Amount__c;
  }

  

  public void setInvoice_Amount__c(java.lang.Double Invoice_Amount__c) {
    this.Invoice_Amount__c = Invoice_Amount__c;
    Invoice_Amount__c__is_set = true;
  }
  
  /**
   * element  : Invoice_Date__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Invoice_Date__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Invoice_Date__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Invoice_Date__c__is_set = false;

  private java.util.Calendar Invoice_Date__c;

  public java.util.Calendar getInvoice_Date__c() {
    return Invoice_Date__c;
  }

  

  public void setInvoice_Date__c(java.util.Calendar Invoice_Date__c) {
    this.Invoice_Date__c = Invoice_Date__c;
    Invoice_Date__c__is_set = true;
  }
  
  /**
   * element  : Invoice_Month__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Invoice_Month__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Invoice_Month__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Invoice_Month__c__is_set = false;

  private java.lang.String Invoice_Month__c;

  public java.lang.String getInvoice_Month__c() {
    return Invoice_Month__c;
  }

  

  public void setInvoice_Month__c(java.lang.String Invoice_Month__c) {
    this.Invoice_Month__c = Invoice_Month__c;
    Invoice_Month__c__is_set = true;
  }
  
  /**
   * element  : Invoice_Number__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Invoice_Number__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Invoice_Number__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Invoice_Number__c__is_set = false;

  private java.lang.String Invoice_Number__c;

  public java.lang.String getInvoice_Number__c() {
    return Invoice_Number__c;
  }

  

  public void setInvoice_Number__c(java.lang.String Invoice_Number__c) {
    this.Invoice_Number__c = Invoice_Number__c;
    Invoice_Number__c__is_set = true;
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
   * element  : Job_GP_Pct__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Job_GP_Pct__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Job_GP_Pct__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Job_GP_Pct__c__is_set = false;

  private java.lang.Double Job_GP_Pct__c;

  public java.lang.Double getJob_GP_Pct__c() {
    return Job_GP_Pct__c;
  }

  

  public void setJob_GP_Pct__c(java.lang.Double Job_GP_Pct__c) {
    this.Job_GP_Pct__c = Job_GP_Pct__c;
    Job_GP_Pct__c__is_set = true;
  }
  
  /**
   * element  : Job_GP__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Job_GP__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Job_GP__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Job_GP__c__is_set = false;

  private java.lang.Double Job_GP__c;

  public java.lang.Double getJob_GP__c() {
    return Job_GP__c;
  }

  

  public void setJob_GP__c(java.lang.Double Job_GP__c) {
    this.Job_GP__c = Job_GP__c;
    Job_GP__c__is_set = true;
  }
  
  /**
   * element  : Job_Net__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Job_Net__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Job_Net__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Job_Net__c__is_set = false;

  private java.lang.Double Job_Net__c;

  public java.lang.Double getJob_Net__c() {
    return Job_Net__c;
  }

  

  public void setJob_Net__c(java.lang.Double Job_Net__c) {
    this.Job_Net__c = Job_Net__c;
    Job_Net__c__is_set = true;
  }
  
  /**
   * element  : Job_Number__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Job_Number__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Job_Number__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Job_Number__c__is_set = false;

  private java.lang.String Job_Number__c;

  public java.lang.String getJob_Number__c() {
    return Job_Number__c;
  }

  

  public void setJob_Number__c(java.lang.String Job_Number__c) {
    this.Job_Number__c = Job_Number__c;
    Job_Number__c__is_set = true;
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
   * element  : Notes of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Notes__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Notes","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Notes__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Notes;

  public com.sforce.soap.enterprise.QueryResult getNotes() {
    return Notes;
  }

  

  public void setNotes(com.sforce.soap.enterprise.QueryResult Notes) {
    this.Notes = Notes;
    Notes__is_set = true;
  }
  
  /**
   * element  : NotesAndAttachments of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo NotesAndAttachments__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","NotesAndAttachments","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean NotesAndAttachments__is_set = false;

  private com.sforce.soap.enterprise.QueryResult NotesAndAttachments;

  public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
    return NotesAndAttachments;
  }

  

  public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult NotesAndAttachments) {
    this.NotesAndAttachments = NotesAndAttachments;
    NotesAndAttachments__is_set = true;
  }
  
  /**
   * element  : Outstanding_Balance__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Outstanding_Balance__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Outstanding_Balance__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Outstanding_Balance__c__is_set = false;

  private java.lang.Double Outstanding_Balance__c;

  public java.lang.Double getOutstanding_Balance__c() {
    return Outstanding_Balance__c;
  }

  

  public void setOutstanding_Balance__c(java.lang.Double Outstanding_Balance__c) {
    this.Outstanding_Balance__c = Outstanding_Balance__c;
    Outstanding_Balance__c__is_set = true;
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
   * element  : Recruiter_Credit_Manager_ID__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Recruiter_Credit_Manager_ID__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Recruiter_Credit_Manager_ID__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Recruiter_Credit_Manager_ID__c__is_set = false;

  private java.lang.String Recruiter_Credit_Manager_ID__c;

  public java.lang.String getRecruiter_Credit_Manager_ID__c() {
    return Recruiter_Credit_Manager_ID__c;
  }

  

  public void setRecruiter_Credit_Manager_ID__c(java.lang.String Recruiter_Credit_Manager_ID__c) {
    this.Recruiter_Credit_Manager_ID__c = Recruiter_Credit_Manager_ID__c;
    Recruiter_Credit_Manager_ID__c__is_set = true;
  }
  
  /**
   * element  : Recruiter_Invoice_Net__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Recruiter_Invoice_Net__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Recruiter_Invoice_Net__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Recruiter_Invoice_Net__c__is_set = false;

  private java.lang.Double Recruiter_Invoice_Net__c;

  public java.lang.Double getRecruiter_Invoice_Net__c() {
    return Recruiter_Invoice_Net__c;
  }

  

  public void setRecruiter_Invoice_Net__c(java.lang.Double Recruiter_Invoice_Net__c) {
    this.Recruiter_Invoice_Net__c = Recruiter_Invoice_Net__c;
    Recruiter_Invoice_Net__c__is_set = true;
  }
  
  /**
   * element  : Recruiter_Manager_Credit__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Recruiter_Manager_Credit__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Recruiter_Manager_Credit__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Recruiter_Manager_Credit__c__is_set = false;

  private java.lang.String Recruiter_Manager_Credit__c;

  public java.lang.String getRecruiter_Manager_Credit__c() {
    return Recruiter_Manager_Credit__c;
  }

  

  public void setRecruiter_Manager_Credit__c(java.lang.String Recruiter_Manager_Credit__c) {
    this.Recruiter_Manager_Credit__c = Recruiter_Manager_Credit__c;
    Recruiter_Manager_Credit__c__is_set = true;
  }
  
  /**
   * element  : Recruiter__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Recruiter__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Recruiter__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean Recruiter__c__is_set = false;

  private java.lang.String Recruiter__c;

  public java.lang.String getRecruiter__c() {
    return Recruiter__c;
  }

  

  public void setRecruiter__c(java.lang.String Recruiter__c) {
    this.Recruiter__c = Recruiter__c;
    Recruiter__c__is_set = true;
  }
  
  /**
   * element  : Recruiter__r of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo Recruiter__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Recruiter__r","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean Recruiter__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.User Recruiter__r;

  public com.sforce.soap.enterprise.sobject.User getRecruiter__r() {
    return Recruiter__r;
  }

  

  public void setRecruiter__r(com.sforce.soap.enterprise.sobject.User Recruiter__r) {
    this.Recruiter__r = Recruiter__r;
    Recruiter__r__is_set = true;
  }
  
  /**
   * element  : Sales_Invoice_Net__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Sales_Invoice_Net__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Sales_Invoice_Net__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Sales_Invoice_Net__c__is_set = false;

  private java.lang.Double Sales_Invoice_Net__c;

  public java.lang.Double getSales_Invoice_Net__c() {
    return Sales_Invoice_Net__c;
  }

  

  public void setSales_Invoice_Net__c(java.lang.Double Sales_Invoice_Net__c) {
    this.Sales_Invoice_Net__c = Sales_Invoice_Net__c;
    Sales_Invoice_Net__c__is_set = true;
  }
  
  /**
   * element  : Sales_Manager__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Sales_Manager__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Sales_Manager__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Sales_Manager__c__is_set = false;

  private java.lang.String Sales_Manager__c;

  public java.lang.String getSales_Manager__c() {
    return Sales_Manager__c;
  }

  

  public void setSales_Manager__c(java.lang.String Sales_Manager__c) {
    this.Sales_Manager__c = Sales_Manager__c;
    Sales_Manager__c__is_set = true;
  }
  
  /**
   * element  : Salesperson__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Salesperson__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Salesperson__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean Salesperson__c__is_set = false;

  private java.lang.String Salesperson__c;

  public java.lang.String getSalesperson__c() {
    return Salesperson__c;
  }

  

  public void setSalesperson__c(java.lang.String Salesperson__c) {
    this.Salesperson__c = Salesperson__c;
    Salesperson__c__is_set = true;
  }
  
  /**
   * element  : Salesperson__r of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo Salesperson__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Salesperson__r","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean Salesperson__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.User Salesperson__r;

  public com.sforce.soap.enterprise.sobject.User getSalesperson__r() {
    return Salesperson__r;
  }

  

  public void setSalesperson__r(com.sforce.soap.enterprise.sobject.User Salesperson__r) {
    this.Salesperson__r = Salesperson__r;
    Salesperson__r__is_set = true;
  }
  
  /**
   * element  : State__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo State__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","State__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean State__c__is_set = false;

  private java.lang.String State__c;

  public java.lang.String getState__c() {
    return State__c;
  }

  

  public void setState__c(java.lang.String State__c) {
    this.State__c = State__c;
    State__c__is_set = true;
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
   * element  : Trade__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Trade__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Trade__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Trade__c__is_set = false;

  private java.lang.String Trade__c;

  public java.lang.String getTrade__c() {
    return Trade__c;
  }

  

  public void setTrade__c(java.lang.String Trade__c) {
    this.Trade__c = Trade__c;
    Trade__c__is_set = true;
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
   * element  : Week_Ending__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Week_Ending__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Week_Ending__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Week_Ending__c__is_set = false;

  private java.util.Calendar Week_Ending__c;

  public java.util.Calendar getWeek_Ending__c() {
    return Week_Ending__c;
  }

  

  public void setWeek_Ending__c(java.util.Calendar Week_Ending__c) {
    this.Week_Ending__c = Week_Ending__c;
    Week_Ending__c__is_set = true;
  }
  
  /**
   * element  : Work_State__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Work_State__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Work_State__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Work_State__c__is_set = false;

  private java.lang.String Work_State__c;

  public java.lang.String getWork_State__c() {
    return Work_State__c;
  }

  

  public void setWork_State__c(java.lang.String Work_State__c) {
    this.Work_State__c = Work_State__c;
    Work_State__c__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "Revenue__c");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, Account__c__typeInfo, Account__c, Account__c__is_set);
    __typeMapper.writeObject(__out, Account__r__typeInfo, Account__r, Account__r__is_set);
    __typeMapper.writeObject(__out, Aging__c__typeInfo, Aging__c, Aging__c__is_set);
    __typeMapper.writeObject(__out, Amount_Paid__c__typeInfo, Amount_Paid__c, Amount_Paid__c__is_set);
    __typeMapper.writeString(__out, Assignment__c__typeInfo, Assignment__c, Assignment__c__is_set);
    __typeMapper.writeObject(__out, Assignment__r__typeInfo, Assignment__r, Assignment__r__is_set);
    __typeMapper.writeObject(__out, AttachedContentDocuments__typeInfo, AttachedContentDocuments, AttachedContentDocuments__is_set);
    __typeMapper.writeObject(__out, AttachedContentNotes__typeInfo, AttachedContentNotes, AttachedContentNotes__is_set);
    __typeMapper.writeObject(__out, Attachments__typeInfo, Attachments, Attachments__is_set);
    __typeMapper.writeObject(__out, Average_Net_Profit__c__typeInfo, Average_Net_Profit__c, Average_Net_Profit__c__is_set);
    __typeMapper.writeObject(__out, Avg_Fillperson_Period_GP__c__typeInfo, Avg_Fillperson_Period_GP__c, Avg_Fillperson_Period_GP__c__is_set);
    __typeMapper.writeObject(__out, Avg_Salesperson_Period_GP__c__typeInfo, Avg_Salesperson_Period_GP__c, Avg_Salesperson_Period_GP__c__is_set);
    __typeMapper.writeString(__out, Client_State__c__typeInfo, Client_State__c, Client_State__c__is_set);
    __typeMapper.writeObject(__out, Collection_Date__c__typeInfo, Collection_Date__c, Collection_Date__c__is_set);
    __typeMapper.writeObject(__out, CombinedAttachments__typeInfo, CombinedAttachments, CombinedAttachments__is_set);
    __typeMapper.writeObject(__out, ContentDocumentLinks__typeInfo, ContentDocumentLinks, ContentDocumentLinks__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, Customer_Name__c__typeInfo, Customer_Name__c, Customer_Name__c__is_set);
    __typeMapper.writeString(__out, Deal_ID__c__typeInfo, Deal_ID__c, Deal_ID__c__is_set);
    __typeMapper.writeObject(__out, DuplicateRecordItems__typeInfo, DuplicateRecordItems, DuplicateRecordItems__is_set);
    __typeMapper.writeObject(__out, Emails__typeInfo, Emails, Emails__is_set);
    __typeMapper.writeObject(__out, EventRelations__typeInfo, EventRelations, EventRelations__is_set);
    __typeMapper.writeObject(__out, FeedSubscriptionsForEntity__typeInfo, FeedSubscriptionsForEntity, FeedSubscriptionsForEntity__is_set);
    __typeMapper.writeObject(__out, Gross_Profit__c__typeInfo, Gross_Profit__c, Gross_Profit__c__is_set);
    __typeMapper.writeObject(__out, Histories__typeInfo, Histories, Histories__is_set);
    __typeMapper.writeObject(__out, Hours_Billed__c__typeInfo, Hours_Billed__c, Hours_Billed__c__is_set);
    __typeMapper.writeObject(__out, Hours_Worked__c__typeInfo, Hours_Worked__c, Hours_Worked__c__is_set);
    __typeMapper.writeObject(__out, Invoice_Amount__c__typeInfo, Invoice_Amount__c, Invoice_Amount__c__is_set);
    __typeMapper.writeObject(__out, Invoice_Date__c__typeInfo, Invoice_Date__c, Invoice_Date__c__is_set);
    __typeMapper.writeString(__out, Invoice_Month__c__typeInfo, Invoice_Month__c, Invoice_Month__c__is_set);
    __typeMapper.writeString(__out, Invoice_Number__c__typeInfo, Invoice_Number__c, Invoice_Number__c__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, Job_GP_Pct__c__typeInfo, Job_GP_Pct__c, Job_GP_Pct__c__is_set);
    __typeMapper.writeObject(__out, Job_GP__c__typeInfo, Job_GP__c, Job_GP__c__is_set);
    __typeMapper.writeObject(__out, Job_Net__c__typeInfo, Job_Net__c, Job_Net__c__is_set);
    __typeMapper.writeString(__out, Job_Number__c__typeInfo, Job_Number__c, Job_Number__c__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, LastReferencedDate__typeInfo, LastReferencedDate, LastReferencedDate__is_set);
    __typeMapper.writeObject(__out, LastViewedDate__typeInfo, LastViewedDate, LastViewedDate__is_set);
    __typeMapper.writeObject(__out, LookedUpFromActivities__typeInfo, LookedUpFromActivities, LookedUpFromActivities__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeObject(__out, Notes__typeInfo, Notes, Notes__is_set);
    __typeMapper.writeObject(__out, NotesAndAttachments__typeInfo, NotesAndAttachments, NotesAndAttachments__is_set);
    __typeMapper.writeObject(__out, Outstanding_Balance__c__typeInfo, Outstanding_Balance__c, Outstanding_Balance__c__is_set);
    __typeMapper.writeObject(__out, ProcessInstances__typeInfo, ProcessInstances, ProcessInstances__is_set);
    __typeMapper.writeObject(__out, ProcessSteps__typeInfo, ProcessSteps, ProcessSteps__is_set);
    __typeMapper.writeObject(__out, RecordAssociatedGroups__typeInfo, RecordAssociatedGroups, RecordAssociatedGroups__is_set);
    __typeMapper.writeString(__out, Recruiter_Credit_Manager_ID__c__typeInfo, Recruiter_Credit_Manager_ID__c, Recruiter_Credit_Manager_ID__c__is_set);
    __typeMapper.writeObject(__out, Recruiter_Invoice_Net__c__typeInfo, Recruiter_Invoice_Net__c, Recruiter_Invoice_Net__c__is_set);
    __typeMapper.writeString(__out, Recruiter_Manager_Credit__c__typeInfo, Recruiter_Manager_Credit__c, Recruiter_Manager_Credit__c__is_set);
    __typeMapper.writeString(__out, Recruiter__c__typeInfo, Recruiter__c, Recruiter__c__is_set);
    __typeMapper.writeObject(__out, Recruiter__r__typeInfo, Recruiter__r, Recruiter__r__is_set);
    __typeMapper.writeObject(__out, Sales_Invoice_Net__c__typeInfo, Sales_Invoice_Net__c, Sales_Invoice_Net__c__is_set);
    __typeMapper.writeString(__out, Sales_Manager__c__typeInfo, Sales_Manager__c, Sales_Manager__c__is_set);
    __typeMapper.writeString(__out, Salesperson__c__typeInfo, Salesperson__c, Salesperson__c__is_set);
    __typeMapper.writeObject(__out, Salesperson__r__typeInfo, Salesperson__r, Salesperson__r__is_set);
    __typeMapper.writeString(__out, State__c__typeInfo, State__c, State__c__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeObject(__out, Tags__typeInfo, Tags, Tags__is_set);
    __typeMapper.writeObject(__out, TaskRelations__typeInfo, TaskRelations, TaskRelations__is_set);
    __typeMapper.writeObject(__out, TopicAssignments__typeInfo, TopicAssignments, TopicAssignments__is_set);
    __typeMapper.writeString(__out, Trade__c__typeInfo, Trade__c, Trade__c__is_set);
    __typeMapper.writeObject(__out, UserRecordAccess__typeInfo, UserRecordAccess, UserRecordAccess__is_set);
    __typeMapper.writeObject(__out, Week_Ending__c__typeInfo, Week_Ending__c, Week_Ending__c__is_set);
    __typeMapper.writeString(__out, Work_State__c__typeInfo, Work_State__c, Work_State__c__is_set);
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
    if (__typeMapper.isElement(__in, Account__c__typeInfo)) {
      setAccount__c((java.lang.String)__typeMapper.readString(__in, Account__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Account__r__typeInfo)) {
      setAccount__r((com.sforce.soap.enterprise.sobject.Account)__typeMapper.readObject(__in, Account__r__typeInfo, com.sforce.soap.enterprise.sobject.Account.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Aging__c__typeInfo)) {
      setAging__c((java.lang.Double)__typeMapper.readObject(__in, Aging__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Amount_Paid__c__typeInfo)) {
      setAmount_Paid__c((java.lang.Double)__typeMapper.readObject(__in, Amount_Paid__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Assignment__c__typeInfo)) {
      setAssignment__c((java.lang.String)__typeMapper.readString(__in, Assignment__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Assignment__r__typeInfo)) {
      setAssignment__r((com.sforce.soap.enterprise.sobject.Assignment__c)__typeMapper.readObject(__in, Assignment__r__typeInfo, com.sforce.soap.enterprise.sobject.Assignment__c.class));
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
    if (__typeMapper.isElement(__in, Average_Net_Profit__c__typeInfo)) {
      setAverage_Net_Profit__c((java.lang.Double)__typeMapper.readObject(__in, Average_Net_Profit__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Avg_Fillperson_Period_GP__c__typeInfo)) {
      setAvg_Fillperson_Period_GP__c((java.lang.Double)__typeMapper.readObject(__in, Avg_Fillperson_Period_GP__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Avg_Salesperson_Period_GP__c__typeInfo)) {
      setAvg_Salesperson_Period_GP__c((java.lang.Double)__typeMapper.readObject(__in, Avg_Salesperson_Period_GP__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Client_State__c__typeInfo)) {
      setClient_State__c((java.lang.String)__typeMapper.readString(__in, Client_State__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Collection_Date__c__typeInfo)) {
      setCollection_Date__c((java.util.Calendar)__typeMapper.readObject(__in, Collection_Date__c__typeInfo, java.util.Calendar.class));
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
    if (__typeMapper.isElement(__in, Customer_Name__c__typeInfo)) {
      setCustomer_Name__c((java.lang.String)__typeMapper.readString(__in, Customer_Name__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Deal_ID__c__typeInfo)) {
      setDeal_ID__c((java.lang.String)__typeMapper.readString(__in, Deal_ID__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DuplicateRecordItems__typeInfo)) {
      setDuplicateRecordItems((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, DuplicateRecordItems__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Emails__typeInfo)) {
      setEmails((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Emails__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, EventRelations__typeInfo)) {
      setEventRelations((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, EventRelations__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FeedSubscriptionsForEntity__typeInfo)) {
      setFeedSubscriptionsForEntity((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, FeedSubscriptionsForEntity__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Gross_Profit__c__typeInfo)) {
      setGross_Profit__c((java.lang.Double)__typeMapper.readObject(__in, Gross_Profit__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Histories__typeInfo)) {
      setHistories((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Histories__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Hours_Billed__c__typeInfo)) {
      setHours_Billed__c((java.lang.Double)__typeMapper.readObject(__in, Hours_Billed__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Hours_Worked__c__typeInfo)) {
      setHours_Worked__c((java.lang.Double)__typeMapper.readObject(__in, Hours_Worked__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Invoice_Amount__c__typeInfo)) {
      setInvoice_Amount__c((java.lang.Double)__typeMapper.readObject(__in, Invoice_Amount__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Invoice_Date__c__typeInfo)) {
      setInvoice_Date__c((java.util.Calendar)__typeMapper.readObject(__in, Invoice_Date__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Invoice_Month__c__typeInfo)) {
      setInvoice_Month__c((java.lang.String)__typeMapper.readString(__in, Invoice_Month__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Invoice_Number__c__typeInfo)) {
      setInvoice_Number__c((java.lang.String)__typeMapper.readString(__in, Invoice_Number__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {
      setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, IsDeleted__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Job_GP_Pct__c__typeInfo)) {
      setJob_GP_Pct__c((java.lang.Double)__typeMapper.readObject(__in, Job_GP_Pct__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Job_GP__c__typeInfo)) {
      setJob_GP__c((java.lang.Double)__typeMapper.readObject(__in, Job_GP__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Job_Net__c__typeInfo)) {
      setJob_Net__c((java.lang.Double)__typeMapper.readObject(__in, Job_Net__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Job_Number__c__typeInfo)) {
      setJob_Number__c((java.lang.String)__typeMapper.readString(__in, Job_Number__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, LookedUpFromActivities__typeInfo)) {
      setLookedUpFromActivities((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, LookedUpFromActivities__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Name__typeInfo)) {
      setName((java.lang.String)__typeMapper.readString(__in, Name__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Notes__typeInfo)) {
      setNotes((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Notes__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, NotesAndAttachments__typeInfo)) {
      setNotesAndAttachments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, NotesAndAttachments__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Outstanding_Balance__c__typeInfo)) {
      setOutstanding_Balance__c((java.lang.Double)__typeMapper.readObject(__in, Outstanding_Balance__c__typeInfo, java.lang.Double.class));
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
    if (__typeMapper.isElement(__in, Recruiter_Credit_Manager_ID__c__typeInfo)) {
      setRecruiter_Credit_Manager_ID__c((java.lang.String)__typeMapper.readString(__in, Recruiter_Credit_Manager_ID__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Recruiter_Invoice_Net__c__typeInfo)) {
      setRecruiter_Invoice_Net__c((java.lang.Double)__typeMapper.readObject(__in, Recruiter_Invoice_Net__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Recruiter_Manager_Credit__c__typeInfo)) {
      setRecruiter_Manager_Credit__c((java.lang.String)__typeMapper.readString(__in, Recruiter_Manager_Credit__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Recruiter__c__typeInfo)) {
      setRecruiter__c((java.lang.String)__typeMapper.readString(__in, Recruiter__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Recruiter__r__typeInfo)) {
      setRecruiter__r((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, Recruiter__r__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Sales_Invoice_Net__c__typeInfo)) {
      setSales_Invoice_Net__c((java.lang.Double)__typeMapper.readObject(__in, Sales_Invoice_Net__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Sales_Manager__c__typeInfo)) {
      setSales_Manager__c((java.lang.String)__typeMapper.readString(__in, Sales_Manager__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Salesperson__c__typeInfo)) {
      setSalesperson__c((java.lang.String)__typeMapper.readString(__in, Salesperson__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Salesperson__r__typeInfo)) {
      setSalesperson__r((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, Salesperson__r__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, State__c__typeInfo)) {
      setState__c((java.lang.String)__typeMapper.readString(__in, State__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, TopicAssignments__typeInfo)) {
      setTopicAssignments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, TopicAssignments__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Trade__c__typeInfo)) {
      setTrade__c((java.lang.String)__typeMapper.readString(__in, Trade__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserRecordAccess__typeInfo)) {
      setUserRecordAccess((com.sforce.soap.enterprise.sobject.UserRecordAccess)__typeMapper.readObject(__in, UserRecordAccess__typeInfo, com.sforce.soap.enterprise.sobject.UserRecordAccess.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Week_Ending__c__typeInfo)) {
      setWeek_Ending__c((java.util.Calendar)__typeMapper.readObject(__in, Week_Ending__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Work_State__c__typeInfo)) {
      setWork_State__c((java.lang.String)__typeMapper.readString(__in, Work_State__c__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[Revenue__c ");
    sb.append(super.toString());
    sb.append(" Account__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Account__c)+"'\n");
    sb.append(" Account__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Account__r)+"'\n");
    sb.append(" Aging__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Aging__c)+"'\n");
    sb.append(" Amount_Paid__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Amount_Paid__c)+"'\n");
    sb.append(" Assignment__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Assignment__c)+"'\n");
    sb.append(" Assignment__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Assignment__r)+"'\n");
    sb.append(" AttachedContentDocuments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentDocuments)+"'\n");
    sb.append(" AttachedContentNotes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentNotes)+"'\n");
    sb.append(" Attachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Attachments)+"'\n");
    sb.append(" Average_Net_Profit__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Average_Net_Profit__c)+"'\n");
    sb.append(" Avg_Fillperson_Period_GP__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Avg_Fillperson_Period_GP__c)+"'\n");
    sb.append(" Avg_Salesperson_Period_GP__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Avg_Salesperson_Period_GP__c)+"'\n");
    sb.append(" Client_State__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Client_State__c)+"'\n");
    sb.append(" Collection_Date__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Collection_Date__c)+"'\n");
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
    sb.append(" Customer_Name__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Customer_Name__c)+"'\n");
    sb.append(" Deal_ID__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Deal_ID__c)+"'\n");
    sb.append(" DuplicateRecordItems=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DuplicateRecordItems)+"'\n");
    sb.append(" Emails=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Emails)+"'\n");
    sb.append(" EventRelations=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EventRelations)+"'\n");
    sb.append(" FeedSubscriptionsForEntity=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FeedSubscriptionsForEntity)+"'\n");
    sb.append(" Gross_Profit__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Gross_Profit__c)+"'\n");
    sb.append(" Histories=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Histories)+"'\n");
    sb.append(" Hours_Billed__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Hours_Billed__c)+"'\n");
    sb.append(" Hours_Worked__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Hours_Worked__c)+"'\n");
    sb.append(" Invoice_Amount__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Invoice_Amount__c)+"'\n");
    sb.append(" Invoice_Date__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Invoice_Date__c)+"'\n");
    sb.append(" Invoice_Month__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Invoice_Month__c)+"'\n");
    sb.append(" Invoice_Number__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Invoice_Number__c)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" Job_GP_Pct__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Job_GP_Pct__c)+"'\n");
    sb.append(" Job_GP__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Job_GP__c)+"'\n");
    sb.append(" Job_Net__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Job_Net__c)+"'\n");
    sb.append(" Job_Number__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Job_Number__c)+"'\n");
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
    sb.append(" LookedUpFromActivities=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LookedUpFromActivities)+"'\n");
    sb.append(" Name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");
    sb.append(" Notes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Notes)+"'\n");
    sb.append(" NotesAndAttachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NotesAndAttachments)+"'\n");
    sb.append(" Outstanding_Balance__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Outstanding_Balance__c)+"'\n");
    sb.append(" ProcessInstances=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessInstances)+"'\n");
    sb.append(" ProcessSteps=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessSteps)+"'\n");
    sb.append(" RecordAssociatedGroups=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecordAssociatedGroups)+"'\n");
    sb.append(" Recruiter_Credit_Manager_ID__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Recruiter_Credit_Manager_ID__c)+"'\n");
    sb.append(" Recruiter_Invoice_Net__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Recruiter_Invoice_Net__c)+"'\n");
    sb.append(" Recruiter_Manager_Credit__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Recruiter_Manager_Credit__c)+"'\n");
    sb.append(" Recruiter__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Recruiter__c)+"'\n");
    sb.append(" Recruiter__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Recruiter__r)+"'\n");
    sb.append(" Sales_Invoice_Net__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Sales_Invoice_Net__c)+"'\n");
    sb.append(" Sales_Manager__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Sales_Manager__c)+"'\n");
    sb.append(" Salesperson__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Salesperson__c)+"'\n");
    sb.append(" Salesperson__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Salesperson__r)+"'\n");
    sb.append(" State__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(State__c)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" Tags=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Tags)+"'\n");
    sb.append(" TaskRelations=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TaskRelations)+"'\n");
    sb.append(" TopicAssignments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TopicAssignments)+"'\n");
    sb.append(" Trade__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Trade__c)+"'\n");
    sb.append(" UserRecordAccess=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserRecordAccess)+"'\n");
    sb.append(" Week_Ending__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Week_Ending__c)+"'\n");
    sb.append(" Work_State__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Work_State__c)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}