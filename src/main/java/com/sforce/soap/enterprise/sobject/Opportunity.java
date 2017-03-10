package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class Opportunity extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public Opportunity() {
  }
    
  
  /**
   * element  : Account of type {urn:sobject.enterprise.soap.sforce.com}Account
   * java type: com.sforce.soap.enterprise.sobject.Account
   */
  private static final com.sforce.ws.bind.TypeInfo Account__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Account","urn:sobject.enterprise.soap.sforce.com","Account",0,1,true);

  private boolean Account__is_set = false;

  private com.sforce.soap.enterprise.sobject.Account Account;

  public com.sforce.soap.enterprise.sobject.Account getAccount() {
    return Account;
  }

  

  public void setAccount(com.sforce.soap.enterprise.sobject.Account Account) {
    this.Account = Account;
    Account__is_set = true;
  }
  
  /**
   * element  : AccountId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AccountId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AccountId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean AccountId__is_set = false;

  private java.lang.String AccountId;

  public java.lang.String getAccountId() {
    return AccountId;
  }

  

  public void setAccountId(java.lang.String AccountId) {
    this.AccountId = AccountId;
    AccountId__is_set = true;
  }
  
  /**
   * element  : AccountPartners of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo AccountPartners__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AccountPartners","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean AccountPartners__is_set = false;

  private com.sforce.soap.enterprise.QueryResult AccountPartners;

  public com.sforce.soap.enterprise.QueryResult getAccountPartners() {
    return AccountPartners;
  }

  

  public void setAccountPartners(com.sforce.soap.enterprise.QueryResult AccountPartners) {
    this.AccountPartners = AccountPartners;
    AccountPartners__is_set = true;
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
   * element  : Actual_Duration_Period__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Actual_Duration_Period__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Actual_Duration_Period__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Actual_Duration_Period__c__is_set = false;

  private java.lang.String Actual_Duration_Period__c;

  public java.lang.String getActual_Duration_Period__c() {
    return Actual_Duration_Period__c;
  }

  

  public void setActual_Duration_Period__c(java.lang.String Actual_Duration_Period__c) {
    this.Actual_Duration_Period__c = Actual_Duration_Period__c;
    Actual_Duration_Period__c__is_set = true;
  }
  
  /**
   * element  : Actual_Duration__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Actual_Duration__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Actual_Duration__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Actual_Duration__c__is_set = false;

  private java.lang.Double Actual_Duration__c;

  public java.lang.Double getActual_Duration__c() {
    return Actual_Duration__c;
  }

  

  public void setActual_Duration__c(java.lang.Double Actual_Duration__c) {
    this.Actual_Duration__c = Actual_Duration__c;
    Actual_Duration__c__is_set = true;
  }
  
  /**
   * element  : Actual_Headcount__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Actual_Headcount__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Actual_Headcount__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Actual_Headcount__c__is_set = false;

  private java.lang.Double Actual_Headcount__c;

  public java.lang.Double getActual_Headcount__c() {
    return Actual_Headcount__c;
  }

  

  public void setActual_Headcount__c(java.lang.Double Actual_Headcount__c) {
    this.Actual_Headcount__c = Actual_Headcount__c;
    Actual_Headcount__c__is_set = true;
  }
  
  /**
   * element  : Actual_Project_Duration__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Actual_Project_Duration__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Actual_Project_Duration__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Actual_Project_Duration__c__is_set = false;

  private java.lang.Double Actual_Project_Duration__c;

  public java.lang.Double getActual_Project_Duration__c() {
    return Actual_Project_Duration__c;
  }

  

  public void setActual_Project_Duration__c(java.lang.Double Actual_Project_Duration__c) {
    this.Actual_Project_Duration__c = Actual_Project_Duration__c;
    Actual_Project_Duration__c__is_set = true;
  }
  
  /**
   * element  : Actual_Project_End_Date__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Actual_Project_End_Date__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Actual_Project_End_Date__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Actual_Project_End_Date__c__is_set = false;

  private java.util.Calendar Actual_Project_End_Date__c;

  public java.util.Calendar getActual_Project_End_Date__c() {
    return Actual_Project_End_Date__c;
  }

  

  public void setActual_Project_End_Date__c(java.util.Calendar Actual_Project_End_Date__c) {
    this.Actual_Project_End_Date__c = Actual_Project_End_Date__c;
    Actual_Project_End_Date__c__is_set = true;
  }
  
  /**
   * element  : Actual_Start_Date__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Actual_Start_Date__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Actual_Start_Date__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Actual_Start_Date__c__is_set = false;

  private java.util.Calendar Actual_Start_Date__c;

  public java.util.Calendar getActual_Start_Date__c() {
    return Actual_Start_Date__c;
  }

  

  public void setActual_Start_Date__c(java.util.Calendar Actual_Start_Date__c) {
    this.Actual_Start_Date__c = Actual_Start_Date__c;
    Actual_Start_Date__c__is_set = true;
  }
  
  /**
   * element  : Actual_Start_Time__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Actual_Start_Time__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Actual_Start_Time__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Actual_Start_Time__c__is_set = false;

  private java.lang.String Actual_Start_Time__c;

  public java.lang.String getActual_Start_Time__c() {
    return Actual_Start_Time__c;
  }

  

  public void setActual_Start_Time__c(java.lang.String Actual_Start_Time__c) {
    this.Actual_Start_Time__c = Actual_Start_Time__c;
    Actual_Start_Time__c__is_set = true;
  }
  
  /**
   * element  : Address_Location_of_Project__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Address_Location_of_Project__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Address_Location_of_Project__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Address_Location_of_Project__c__is_set = false;

  private java.lang.String Address_Location_of_Project__c;

  public java.lang.String getAddress_Location_of_Project__c() {
    return Address_Location_of_Project__c;
  }

  

  public void setAddress_Location_of_Project__c(java.lang.String Address_Location_of_Project__c) {
    this.Address_Location_of_Project__c = Address_Location_of_Project__c;
    Address_Location_of_Project__c__is_set = true;
  }
  
  /**
   * element  : Amount of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Amount__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Amount","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Amount__is_set = false;

  private java.lang.Double Amount;

  public java.lang.Double getAmount() {
    return Amount;
  }

  

  public void setAmount(java.lang.Double Amount) {
    this.Amount = Amount;
    Amount__is_set = true;
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
   * element  : Bill_Rate_s__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Bill_Rate_s__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Bill_Rate_s__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Bill_Rate_s__c__is_set = false;

  private java.lang.String Bill_Rate_s__c;

  public java.lang.String getBill_Rate_s__c() {
    return Bill_Rate_s__c;
  }

  

  public void setBill_Rate_s__c(java.lang.String Bill_Rate_s__c) {
    this.Bill_Rate_s__c = Bill_Rate_s__c;
    Bill_Rate_s__c__is_set = true;
  }
  
  /**
   * element  : Bonus_Amount__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Bonus_Amount__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Bonus_Amount__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Bonus_Amount__c__is_set = false;

  private java.lang.String Bonus_Amount__c;

  public java.lang.String getBonus_Amount__c() {
    return Bonus_Amount__c;
  }

  

  public void setBonus_Amount__c(java.lang.String Bonus_Amount__c) {
    this.Bonus_Amount__c = Bonus_Amount__c;
    Bonus_Amount__c__is_set = true;
  }
  
  /**
   * element  : Bonus_Y_N__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Bonus_Y_N__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Bonus_Y_N__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Bonus_Y_N__c__is_set = false;

  private java.lang.String Bonus_Y_N__c;

  public java.lang.String getBonus_Y_N__c() {
    return Bonus_Y_N__c;
  }

  

  public void setBonus_Y_N__c(java.lang.String Bonus_Y_N__c) {
    this.Bonus_Y_N__c = Bonus_Y_N__c;
    Bonus_Y_N__c__is_set = true;
  }
  
  /**
   * element  : Campaign of type {urn:sobject.enterprise.soap.sforce.com}Campaign
   * java type: com.sforce.soap.enterprise.sobject.Campaign
   */
  private static final com.sforce.ws.bind.TypeInfo Campaign__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Campaign","urn:sobject.enterprise.soap.sforce.com","Campaign",0,1,true);

  private boolean Campaign__is_set = false;

  private com.sforce.soap.enterprise.sobject.Campaign Campaign;

  public com.sforce.soap.enterprise.sobject.Campaign getCampaign() {
    return Campaign;
  }

  

  public void setCampaign(com.sforce.soap.enterprise.sobject.Campaign Campaign) {
    this.Campaign = Campaign;
    Campaign__is_set = true;
  }
  
  /**
   * element  : CampaignId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CampaignId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CampaignId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean CampaignId__is_set = false;

  private java.lang.String CampaignId;

  public java.lang.String getCampaignId() {
    return CampaignId;
  }

  

  public void setCampaignId(java.lang.String CampaignId) {
    this.CampaignId = CampaignId;
    CampaignId__is_set = true;
  }
  
  /**
   * element  : Check_Here_If_Background_Check_Required__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Check_Here_If_Background_Check_Required__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Check_Here_If_Background_Check_Required__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Check_Here_If_Background_Check_Required__c__is_set = false;

  private java.lang.Boolean Check_Here_If_Background_Check_Required__c;

  public java.lang.Boolean getCheck_Here_If_Background_Check_Required__c() {
    return Check_Here_If_Background_Check_Required__c;
  }

  

  public void setCheck_Here_If_Background_Check_Required__c(java.lang.Boolean Check_Here_If_Background_Check_Required__c) {
    this.Check_Here_If_Background_Check_Required__c = Check_Here_If_Background_Check_Required__c;
    Check_Here_If_Background_Check_Required__c__is_set = true;
  }
  
  /**
   * element  : Check_Here_If_Drug_Test_Required__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Check_Here_If_Drug_Test_Required__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Check_Here_If_Drug_Test_Required__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Check_Here_If_Drug_Test_Required__c__is_set = false;

  private java.lang.Boolean Check_Here_If_Drug_Test_Required__c;

  public java.lang.Boolean getCheck_Here_If_Drug_Test_Required__c() {
    return Check_Here_If_Drug_Test_Required__c;
  }

  

  public void setCheck_Here_If_Drug_Test_Required__c(java.lang.Boolean Check_Here_If_Drug_Test_Required__c) {
    this.Check_Here_If_Drug_Test_Required__c = Check_Here_If_Drug_Test_Required__c;
    Check_Here_If_Drug_Test_Required__c__is_set = true;
  }
  
  /**
   * element  : Client_Onwer_ID__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Client_Onwer_ID__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Client_Onwer_ID__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Client_Onwer_ID__c__is_set = false;

  private java.lang.String Client_Onwer_ID__c;

  public java.lang.String getClient_Onwer_ID__c() {
    return Client_Onwer_ID__c;
  }

  

  public void setClient_Onwer_ID__c(java.lang.String Client_Onwer_ID__c) {
    this.Client_Onwer_ID__c = Client_Onwer_ID__c;
    Client_Onwer_ID__c__is_set = true;
  }
  
  /**
   * element  : CloseDate of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo CloseDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CloseDate","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean CloseDate__is_set = false;

  private java.util.Calendar CloseDate;

  public java.util.Calendar getCloseDate() {
    return CloseDate;
  }

  

  public void setCloseDate(java.util.Calendar CloseDate) {
    this.CloseDate = CloseDate;
    CloseDate__is_set = true;
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
   * element  : Comments__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Comments__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Comments__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Comments__c__is_set = false;

  private java.lang.String Comments__c;

  public java.lang.String getComments__c() {
    return Comments__c;
  }

  

  public void setComments__c(java.lang.String Comments__c) {
    this.Comments__c = Comments__c;
    Comments__c__is_set = true;
  }
  
  /**
   * element  : Contact_Lookup__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Contact_Lookup__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Contact_Lookup__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean Contact_Lookup__c__is_set = false;

  private java.lang.String Contact_Lookup__c;

  public java.lang.String getContact_Lookup__c() {
    return Contact_Lookup__c;
  }

  

  public void setContact_Lookup__c(java.lang.String Contact_Lookup__c) {
    this.Contact_Lookup__c = Contact_Lookup__c;
    Contact_Lookup__c__is_set = true;
  }
  
  /**
   * element  : Contact_Lookup__r of type {urn:sobject.enterprise.soap.sforce.com}Contact
   * java type: com.sforce.soap.enterprise.sobject.Contact
   */
  private static final com.sforce.ws.bind.TypeInfo Contact_Lookup__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Contact_Lookup__r","urn:sobject.enterprise.soap.sforce.com","Contact",0,1,true);

  private boolean Contact_Lookup__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.Contact Contact_Lookup__r;

  public com.sforce.soap.enterprise.sobject.Contact getContact_Lookup__r() {
    return Contact_Lookup__r;
  }

  

  public void setContact_Lookup__r(com.sforce.soap.enterprise.sobject.Contact Contact_Lookup__r) {
    this.Contact_Lookup__r = Contact_Lookup__r;
    Contact_Lookup__r__is_set = true;
  }
  
  /**
   * element  : Contact_Owner__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Contact_Owner__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Contact_Owner__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Contact_Owner__c__is_set = false;

  private java.lang.String Contact_Owner__c;

  public java.lang.String getContact_Owner__c() {
    return Contact_Owner__c;
  }

  

  public void setContact_Owner__c(java.lang.String Contact_Owner__c) {
    this.Contact_Owner__c = Contact_Owner__c;
    Contact_Owner__c__is_set = true;
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
   * element  : Credit_Limit__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Credit_Limit__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Credit_Limit__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Credit_Limit__c__is_set = false;

  private java.lang.Double Credit_Limit__c;

  public java.lang.Double getCredit_Limit__c() {
    return Credit_Limit__c;
  }

  

  public void setCredit_Limit__c(java.lang.Double Credit_Limit__c) {
    this.Credit_Limit__c = Credit_Limit__c;
    Credit_Limit__c__is_set = true;
  }
  
  /**
   * element  : Credit_Rating__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Credit_Rating__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Credit_Rating__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Credit_Rating__c__is_set = false;

  private java.lang.String Credit_Rating__c;

  public java.lang.String getCredit_Rating__c() {
    return Credit_Rating__c;
  }

  

  public void setCredit_Rating__c(java.lang.String Credit_Rating__c) {
    this.Credit_Rating__c = Credit_Rating__c;
    Credit_Rating__c__is_set = true;
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
   * element  : Employee_Names_and_Notes__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Employee_Names_and_Notes__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Employee_Names_and_Notes__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Employee_Names_and_Notes__c__is_set = false;

  private java.lang.String Employee_Names_and_Notes__c;

  public java.lang.String getEmployee_Names_and_Notes__c() {
    return Employee_Names_and_Notes__c;
  }

  

  public void setEmployee_Names_and_Notes__c(java.lang.String Employee_Names_and_Notes__c) {
    this.Employee_Names_and_Notes__c = Employee_Names_and_Notes__c;
    Employee_Names_and_Notes__c__is_set = true;
  }
  
  /**
   * element  : Estimated_Duration_Days__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Estimated_Duration_Days__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Estimated_Duration_Days__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Estimated_Duration_Days__c__is_set = false;

  private java.lang.Double Estimated_Duration_Days__c;

  public java.lang.Double getEstimated_Duration_Days__c() {
    return Estimated_Duration_Days__c;
  }

  

  public void setEstimated_Duration_Days__c(java.lang.Double Estimated_Duration_Days__c) {
    this.Estimated_Duration_Days__c = Estimated_Duration_Days__c;
    Estimated_Duration_Days__c__is_set = true;
  }
  
  /**
   * element  : Estimated_Project_End_Date__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Estimated_Project_End_Date__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Estimated_Project_End_Date__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Estimated_Project_End_Date__c__is_set = false;

  private java.util.Calendar Estimated_Project_End_Date__c;

  public java.util.Calendar getEstimated_Project_End_Date__c() {
    return Estimated_Project_End_Date__c;
  }

  

  public void setEstimated_Project_End_Date__c(java.util.Calendar Estimated_Project_End_Date__c) {
    this.Estimated_Project_End_Date__c = Estimated_Project_End_Date__c;
    Estimated_Project_End_Date__c__is_set = true;
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
   * element  : Fee_Agreement_Sent__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Fee_Agreement_Sent__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Fee_Agreement_Sent__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Fee_Agreement_Sent__c__is_set = false;

  private java.lang.String Fee_Agreement_Sent__c;

  public java.lang.String getFee_Agreement_Sent__c() {
    return Fee_Agreement_Sent__c;
  }

  

  public void setFee_Agreement_Sent__c(java.lang.String Fee_Agreement_Sent__c) {
    this.Fee_Agreement_Sent__c = Fee_Agreement_Sent__c;
    Fee_Agreement_Sent__c__is_set = true;
  }
  
  /**
   * element  : Fee_Agreement_Signed__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Fee_Agreement_Signed__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Fee_Agreement_Signed__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Fee_Agreement_Signed__c__is_set = false;

  private java.lang.String Fee_Agreement_Signed__c;

  public java.lang.String getFee_Agreement_Signed__c() {
    return Fee_Agreement_Signed__c;
  }

  

  public void setFee_Agreement_Signed__c(java.lang.String Fee_Agreement_Signed__c) {
    this.Fee_Agreement_Signed__c = Fee_Agreement_Signed__c;
    Fee_Agreement_Signed__c__is_set = true;
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
   * element  : Fiscal of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Fiscal__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Fiscal","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Fiscal__is_set = false;

  private java.lang.String Fiscal;

  public java.lang.String getFiscal() {
    return Fiscal;
  }

  

  public void setFiscal(java.lang.String Fiscal) {
    this.Fiscal = Fiscal;
    Fiscal__is_set = true;
  }
  
  /**
   * element  : FiscalQuarter of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo FiscalQuarter__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FiscalQuarter","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean FiscalQuarter__is_set = false;

  private java.lang.Integer FiscalQuarter;

  public java.lang.Integer getFiscalQuarter() {
    return FiscalQuarter;
  }

  

  public void setFiscalQuarter(java.lang.Integer FiscalQuarter) {
    this.FiscalQuarter = FiscalQuarter;
    FiscalQuarter__is_set = true;
  }
  
  /**
   * element  : FiscalYear of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo FiscalYear__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FiscalYear","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean FiscalYear__is_set = false;

  private java.lang.Integer FiscalYear;

  public java.lang.Integer getFiscalYear() {
    return FiscalYear;
  }

  

  public void setFiscalYear(java.lang.Integer FiscalYear) {
    this.FiscalYear = FiscalYear;
    FiscalYear__is_set = true;
  }
  
  /**
   * element  : ForecastCategory of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ForecastCategory__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ForecastCategory","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ForecastCategory__is_set = false;

  private java.lang.String ForecastCategory;

  public java.lang.String getForecastCategory() {
    return ForecastCategory;
  }

  

  public void setForecastCategory(java.lang.String ForecastCategory) {
    this.ForecastCategory = ForecastCategory;
    ForecastCategory__is_set = true;
  }
  
  /**
   * element  : ForecastCategoryName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ForecastCategoryName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ForecastCategoryName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ForecastCategoryName__is_set = false;

  private java.lang.String ForecastCategoryName;

  public java.lang.String getForecastCategoryName() {
    return ForecastCategoryName;
  }

  

  public void setForecastCategoryName(java.lang.String ForecastCategoryName) {
    this.ForecastCategoryName = ForecastCategoryName;
    ForecastCategoryName__is_set = true;
  }
  
  /**
   * element  : Global_s_Take_of_GP__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Global_s_Take_of_GP__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Global_s_Take_of_GP__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Global_s_Take_of_GP__c__is_set = false;

  private java.lang.String Global_s_Take_of_GP__c;

  public java.lang.String getGlobal_s_Take_of_GP__c() {
    return Global_s_Take_of_GP__c;
  }

  

  public void setGlobal_s_Take_of_GP__c(java.lang.String Global_s_Take_of_GP__c) {
    this.Global_s_Take_of_GP__c = Global_s_Take_of_GP__c;
    Global_s_Take_of_GP__c__is_set = true;
  }
  
  /**
   * element  : HasOpenActivity of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo HasOpenActivity__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","HasOpenActivity","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean HasOpenActivity__is_set = false;

  private java.lang.Boolean HasOpenActivity;

  public java.lang.Boolean getHasOpenActivity() {
    return HasOpenActivity;
  }

  

  public void setHasOpenActivity(java.lang.Boolean HasOpenActivity) {
    this.HasOpenActivity = HasOpenActivity;
    HasOpenActivity__is_set = true;
  }
  
  /**
   * element  : HasOpportunityLineItem of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo HasOpportunityLineItem__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","HasOpportunityLineItem","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean HasOpportunityLineItem__is_set = false;

  private java.lang.Boolean HasOpportunityLineItem;

  public java.lang.Boolean getHasOpportunityLineItem() {
    return HasOpportunityLineItem;
  }

  

  public void setHasOpportunityLineItem(java.lang.Boolean HasOpportunityLineItem) {
    this.HasOpportunityLineItem = HasOpportunityLineItem;
    HasOpportunityLineItem__is_set = true;
  }
  
  /**
   * element  : HasOverdueTask of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo HasOverdueTask__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","HasOverdueTask","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean HasOverdueTask__is_set = false;

  private java.lang.Boolean HasOverdueTask;

  public java.lang.Boolean getHasOverdueTask() {
    return HasOverdueTask;
  }

  

  public void setHasOverdueTask(java.lang.Boolean HasOverdueTask) {
    this.HasOverdueTask = HasOverdueTask;
    HasOverdueTask__is_set = true;
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
   * element  : If_Background_Ck_required_is_it_BILLED__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo If_Background_Ck_required_is_it_BILLED__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","If_Background_Ck_required_is_it_BILLED__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean If_Background_Ck_required_is_it_BILLED__c__is_set = false;

  private java.lang.String If_Background_Ck_required_is_it_BILLED__c;

  public java.lang.String getIf_Background_Ck_required_is_it_BILLED__c() {
    return If_Background_Ck_required_is_it_BILLED__c;
  }

  

  public void setIf_Background_Ck_required_is_it_BILLED__c(java.lang.String If_Background_Ck_required_is_it_BILLED__c) {
    this.If_Background_Ck_required_is_it_BILLED__c = If_Background_Ck_required_is_it_BILLED__c;
    If_Background_Ck_required_is_it_BILLED__c__is_set = true;
  }
  
  /**
   * element  : If_Drug_Test_required_is_it_BILLED__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo If_Drug_Test_required_is_it_BILLED__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","If_Drug_Test_required_is_it_BILLED__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean If_Drug_Test_required_is_it_BILLED__c__is_set = false;

  private java.lang.String If_Drug_Test_required_is_it_BILLED__c;

  public java.lang.String getIf_Drug_Test_required_is_it_BILLED__c() {
    return If_Drug_Test_required_is_it_BILLED__c;
  }

  

  public void setIf_Drug_Test_required_is_it_BILLED__c(java.lang.String If_Drug_Test_required_is_it_BILLED__c) {
    this.If_Drug_Test_required_is_it_BILLED__c = If_Drug_Test_required_is_it_BILLED__c;
    If_Drug_Test_required_is_it_BILLED__c__is_set = true;
  }
  
  /**
   * element  : IsClosed of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsClosed__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsClosed","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsClosed__is_set = false;

  private java.lang.Boolean IsClosed;

  public java.lang.Boolean getIsClosed() {
    return IsClosed;
  }

  

  public void setIsClosed(java.lang.Boolean IsClosed) {
    this.IsClosed = IsClosed;
    IsClosed__is_set = true;
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
   * element  : IsWon of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsWon__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsWon","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsWon__is_set = false;

  private java.lang.Boolean IsWon;

  public java.lang.Boolean getIsWon() {
    return IsWon;
  }

  

  public void setIsWon(java.lang.Boolean IsWon) {
    this.IsWon = IsWon;
    IsWon__is_set = true;
  }
  
  /**
   * element  : Is_a_Background_Check_Required__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Is_a_Background_Check_Required__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Is_a_Background_Check_Required__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Is_a_Background_Check_Required__c__is_set = false;

  private java.lang.String Is_a_Background_Check_Required__c;

  public java.lang.String getIs_a_Background_Check_Required__c() {
    return Is_a_Background_Check_Required__c;
  }

  

  public void setIs_a_Background_Check_Required__c(java.lang.String Is_a_Background_Check_Required__c) {
    this.Is_a_Background_Check_Required__c = Is_a_Background_Check_Required__c;
    Is_a_Background_Check_Required__c__is_set = true;
  }
  
  /**
   * element  : Is_a_Drug_Test_Required__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Is_a_Drug_Test_Required__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Is_a_Drug_Test_Required__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Is_a_Drug_Test_Required__c__is_set = false;

  private java.lang.String Is_a_Drug_Test_Required__c;

  public java.lang.String getIs_a_Drug_Test_Required__c() {
    return Is_a_Drug_Test_Required__c;
  }

  

  public void setIs_a_Drug_Test_Required__c(java.lang.String Is_a_Drug_Test_Required__c) {
    this.Is_a_Drug_Test_Required__c = Is_a_Drug_Test_Required__c;
    Is_a_Drug_Test_Required__c__is_set = true;
  }
  
  /**
   * element  : Job_Requirements__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Job_Requirements__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Job_Requirements__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Job_Requirements__c__is_set = false;

  private java.lang.String Job_Requirements__c;

  public java.lang.String getJob_Requirements__c() {
    return Job_Requirements__c;
  }

  

  public void setJob_Requirements__c(java.lang.String Job_Requirements__c) {
    this.Job_Requirements__c = Job_Requirements__c;
    Job_Requirements__c__is_set = true;
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
   * element  : LeadSource of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LeadSource__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LeadSource","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean LeadSource__is_set = false;

  private java.lang.String LeadSource;

  public java.lang.String getLeadSource() {
    return LeadSource;
  }

  

  public void setLeadSource(java.lang.String LeadSource) {
    this.LeadSource = LeadSource;
    LeadSource__is_set = true;
  }
  
  /**
   * element  : Licenses_Certifications_Required__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Licenses_Certifications_Required__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Licenses_Certifications_Required__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Licenses_Certifications_Required__c__is_set = false;

  private java.lang.String Licenses_Certifications_Required__c;

  public java.lang.String getLicenses_Certifications_Required__c() {
    return Licenses_Certifications_Required__c;
  }

  

  public void setLicenses_Certifications_Required__c(java.lang.String Licenses_Certifications_Required__c) {
    this.Licenses_Certifications_Required__c = Licenses_Certifications_Required__c;
    Licenses_Certifications_Required__c__is_set = true;
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
   * element  : MME__EmailMessages__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo MME__EmailMessages__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MME__EmailMessages__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean MME__EmailMessages__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult MME__EmailMessages__r;

  public com.sforce.soap.enterprise.QueryResult getMME__EmailMessages__r() {
    return MME__EmailMessages__r;
  }

  

  public void setMME__EmailMessages__r(com.sforce.soap.enterprise.QueryResult MME__EmailMessages__r) {
    this.MME__EmailMessages__r = MME__EmailMessages__r;
    MME__EmailMessages__r__is_set = true;
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
   * element  : NextStep of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo NextStep__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","NextStep","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean NextStep__is_set = false;

  private java.lang.String NextStep;

  public java.lang.String getNextStep() {
    return NextStep;
  }

  

  public void setNextStep(java.lang.String NextStep) {
    this.NextStep = NextStep;
    NextStep__is_set = true;
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
   * element  : OpportunityCompetitors of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo OpportunityCompetitors__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OpportunityCompetitors","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean OpportunityCompetitors__is_set = false;

  private com.sforce.soap.enterprise.QueryResult OpportunityCompetitors;

  public com.sforce.soap.enterprise.QueryResult getOpportunityCompetitors() {
    return OpportunityCompetitors;
  }

  

  public void setOpportunityCompetitors(com.sforce.soap.enterprise.QueryResult OpportunityCompetitors) {
    this.OpportunityCompetitors = OpportunityCompetitors;
    OpportunityCompetitors__is_set = true;
  }
  
  /**
   * element  : OpportunityContactRoles of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo OpportunityContactRoles__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OpportunityContactRoles","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean OpportunityContactRoles__is_set = false;

  private com.sforce.soap.enterprise.QueryResult OpportunityContactRoles;

  public com.sforce.soap.enterprise.QueryResult getOpportunityContactRoles() {
    return OpportunityContactRoles;
  }

  

  public void setOpportunityContactRoles(com.sforce.soap.enterprise.QueryResult OpportunityContactRoles) {
    this.OpportunityContactRoles = OpportunityContactRoles;
    OpportunityContactRoles__is_set = true;
  }
  
  /**
   * element  : OpportunityHistories of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo OpportunityHistories__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OpportunityHistories","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean OpportunityHistories__is_set = false;

  private com.sforce.soap.enterprise.QueryResult OpportunityHistories;

  public com.sforce.soap.enterprise.QueryResult getOpportunityHistories() {
    return OpportunityHistories;
  }

  

  public void setOpportunityHistories(com.sforce.soap.enterprise.QueryResult OpportunityHistories) {
    this.OpportunityHistories = OpportunityHistories;
    OpportunityHistories__is_set = true;
  }
  
  /**
   * element  : OpportunityLineItems of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo OpportunityLineItems__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OpportunityLineItems","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean OpportunityLineItems__is_set = false;

  private com.sforce.soap.enterprise.QueryResult OpportunityLineItems;

  public com.sforce.soap.enterprise.QueryResult getOpportunityLineItems() {
    return OpportunityLineItems;
  }

  

  public void setOpportunityLineItems(com.sforce.soap.enterprise.QueryResult OpportunityLineItems) {
    this.OpportunityLineItems = OpportunityLineItems;
    OpportunityLineItems__is_set = true;
  }
  
  /**
   * element  : OpportunityPartnersFrom of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo OpportunityPartnersFrom__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OpportunityPartnersFrom","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean OpportunityPartnersFrom__is_set = false;

  private com.sforce.soap.enterprise.QueryResult OpportunityPartnersFrom;

  public com.sforce.soap.enterprise.QueryResult getOpportunityPartnersFrom() {
    return OpportunityPartnersFrom;
  }

  

  public void setOpportunityPartnersFrom(com.sforce.soap.enterprise.QueryResult OpportunityPartnersFrom) {
    this.OpportunityPartnersFrom = OpportunityPartnersFrom;
    OpportunityPartnersFrom__is_set = true;
  }
  
  /**
   * element  : Ops_Team_s_to_Assign__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Ops_Team_s_to_Assign__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Ops_Team_s_to_Assign__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Ops_Team_s_to_Assign__c__is_set = false;

  private java.lang.String Ops_Team_s_to_Assign__c;

  public java.lang.String getOps_Team_s_to_Assign__c() {
    return Ops_Team_s_to_Assign__c;
  }

  

  public void setOps_Team_s_to_Assign__c(java.lang.String Ops_Team_s_to_Assign__c) {
    this.Ops_Team_s_to_Assign__c = Ops_Team_s_to_Assign__c;
    Ops_Team_s_to_Assign__c__is_set = true;
  }
  
  /**
   * element  : Order_City__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Order_City__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Order_City__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Order_City__c__is_set = false;

  private java.lang.String Order_City__c;

  public java.lang.String getOrder_City__c() {
    return Order_City__c;
  }

  

  public void setOrder_City__c(java.lang.String Order_City__c) {
    this.Order_City__c = Order_City__c;
    Order_City__c__is_set = true;
  }
  
  /**
   * element  : Other_Special_Instructions__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Other_Special_Instructions__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Other_Special_Instructions__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Other_Special_Instructions__c__is_set = false;

  private java.lang.String Other_Special_Instructions__c;

  public java.lang.String getOther_Special_Instructions__c() {
    return Other_Special_Instructions__c;
  }

  

  public void setOther_Special_Instructions__c(java.lang.String Other_Special_Instructions__c) {
    this.Other_Special_Instructions__c = Other_Special_Instructions__c;
    Other_Special_Instructions__c__is_set = true;
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
   * element  : Partners of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Partners__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Partners","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Partners__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Partners;

  public com.sforce.soap.enterprise.QueryResult getPartners() {
    return Partners;
  }

  

  public void setPartners(com.sforce.soap.enterprise.QueryResult Partners) {
    this.Partners = Partners;
    Partners__is_set = true;
  }
  
  /**
   * element  : Pay_Rate_s__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Pay_Rate_s__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Pay_Rate_s__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Pay_Rate_s__c__is_set = false;

  private java.lang.String Pay_Rate_s__c;

  public java.lang.String getPay_Rate_s__c() {
    return Pay_Rate_s__c;
  }

  

  public void setPay_Rate_s__c(java.lang.String Pay_Rate_s__c) {
    this.Pay_Rate_s__c = Pay_Rate_s__c;
    Pay_Rate_s__c__is_set = true;
  }
  
  /**
   * element  : Per_Diem__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Per_Diem__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Per_Diem__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Per_Diem__c__is_set = false;

  private java.lang.String Per_Diem__c;

  public java.lang.String getPer_Diem__c() {
    return Per_Diem__c;
  }

  

  public void setPer_Diem__c(java.lang.String Per_Diem__c) {
    this.Per_Diem__c = Per_Diem__c;
    Per_Diem__c__is_set = true;
  }
  
  /**
   * element  : Pre_Pay_Client__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Pre_Pay_Client__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Pre_Pay_Client__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Pre_Pay_Client__c__is_set = false;

  private java.lang.String Pre_Pay_Client__c;

  public java.lang.String getPre_Pay_Client__c() {
    return Pre_Pay_Client__c;
  }

  

  public void setPre_Pay_Client__c(java.lang.String Pre_Pay_Client__c) {
    this.Pre_Pay_Client__c = Pre_Pay_Client__c;
    Pre_Pay_Client__c__is_set = true;
  }
  
  /**
   * element  : Prevailing_Wage_Project__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Prevailing_Wage_Project__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Prevailing_Wage_Project__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Prevailing_Wage_Project__c__is_set = false;

  private java.lang.String Prevailing_Wage_Project__c;

  public java.lang.String getPrevailing_Wage_Project__c() {
    return Prevailing_Wage_Project__c;
  }

  

  public void setPrevailing_Wage_Project__c(java.lang.String Prevailing_Wage_Project__c) {
    this.Prevailing_Wage_Project__c = Prevailing_Wage_Project__c;
    Prevailing_Wage_Project__c__is_set = true;
  }
  
  /**
   * element  : Prevailing_Wage__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Prevailing_Wage__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Prevailing_Wage__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Prevailing_Wage__c__is_set = false;

  private java.lang.Boolean Prevailing_Wage__c;

  public java.lang.Boolean getPrevailing_Wage__c() {
    return Prevailing_Wage__c;
  }

  

  public void setPrevailing_Wage__c(java.lang.Boolean Prevailing_Wage__c) {
    this.Prevailing_Wage__c = Prevailing_Wage__c;
    Prevailing_Wage__c__is_set = true;
  }
  
  /**
   * element  : Pricebook2 of type {urn:sobject.enterprise.soap.sforce.com}Pricebook2
   * java type: com.sforce.soap.enterprise.sobject.Pricebook2
   */
  private static final com.sforce.ws.bind.TypeInfo Pricebook2__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Pricebook2","urn:sobject.enterprise.soap.sforce.com","Pricebook2",0,1,true);

  private boolean Pricebook2__is_set = false;

  private com.sforce.soap.enterprise.sobject.Pricebook2 Pricebook2;

  public com.sforce.soap.enterprise.sobject.Pricebook2 getPricebook2() {
    return Pricebook2;
  }

  

  public void setPricebook2(com.sforce.soap.enterprise.sobject.Pricebook2 Pricebook2) {
    this.Pricebook2 = Pricebook2;
    Pricebook2__is_set = true;
  }
  
  /**
   * element  : Pricebook2Id of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Pricebook2Id__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Pricebook2Id","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean Pricebook2Id__is_set = false;

  private java.lang.String Pricebook2Id;

  public java.lang.String getPricebook2Id() {
    return Pricebook2Id;
  }

  

  public void setPricebook2Id(java.lang.String Pricebook2Id) {
    this.Pricebook2Id = Pricebook2Id;
    Pricebook2Id__is_set = true;
  }
  
  /**
   * element  : Probability of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Probability__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Probability","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Probability__is_set = false;

  private java.lang.Double Probability;

  public java.lang.Double getProbability() {
    return Probability;
  }

  

  public void setProbability(java.lang.Double Probability) {
    this.Probability = Probability;
    Probability__is_set = true;
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
   * element  : Project_Contact__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Project_Contact__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Project_Contact__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Project_Contact__c__is_set = false;

  private java.lang.String Project_Contact__c;

  public java.lang.String getProject_Contact__c() {
    return Project_Contact__c;
  }

  

  public void setProject_Contact__c(java.lang.String Project_Contact__c) {
    this.Project_Contact__c = Project_Contact__c;
    Project_Contact__c__is_set = true;
  }
  
  /**
   * element  : Project_GC_Address__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Project_GC_Address__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Project_GC_Address__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Project_GC_Address__c__is_set = false;

  private java.lang.String Project_GC_Address__c;

  public java.lang.String getProject_GC_Address__c() {
    return Project_GC_Address__c;
  }

  

  public void setProject_GC_Address__c(java.lang.String Project_GC_Address__c) {
    this.Project_GC_Address__c = Project_GC_Address__c;
    Project_GC_Address__c__is_set = true;
  }
  
  /**
   * element  : Project_GC_Name__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Project_GC_Name__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Project_GC_Name__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Project_GC_Name__c__is_set = false;

  private java.lang.String Project_GC_Name__c;

  public java.lang.String getProject_GC_Name__c() {
    return Project_GC_Name__c;
  }

  

  public void setProject_GC_Name__c(java.lang.String Project_GC_Name__c) {
    this.Project_GC_Name__c = Project_GC_Name__c;
    Project_GC_Name__c__is_set = true;
  }
  
  /**
   * element  : Project_Owner_Address__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Project_Owner_Address__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Project_Owner_Address__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Project_Owner_Address__c__is_set = false;

  private java.lang.String Project_Owner_Address__c;

  public java.lang.String getProject_Owner_Address__c() {
    return Project_Owner_Address__c;
  }

  

  public void setProject_Owner_Address__c(java.lang.String Project_Owner_Address__c) {
    this.Project_Owner_Address__c = Project_Owner_Address__c;
    Project_Owner_Address__c__is_set = true;
  }
  
  /**
   * element  : Project_Owner_Name__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Project_Owner_Name__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Project_Owner_Name__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Project_Owner_Name__c__is_set = false;

  private java.lang.String Project_Owner_Name__c;

  public java.lang.String getProject_Owner_Name__c() {
    return Project_Owner_Name__c;
  }

  

  public void setProject_Owner_Name__c(java.lang.String Project_Owner_Name__c) {
    this.Project_Owner_Name__c = Project_Owner_Name__c;
    Project_Owner_Name__c__is_set = true;
  }
  
  /**
   * element  : Project_Start_Date__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Project_Start_Date__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Project_Start_Date__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Project_Start_Date__c__is_set = false;

  private java.util.Calendar Project_Start_Date__c;

  public java.util.Calendar getProject_Start_Date__c() {
    return Project_Start_Date__c;
  }

  

  public void setProject_Start_Date__c(java.util.Calendar Project_Start_Date__c) {
    this.Project_Start_Date__c = Project_Start_Date__c;
    Project_Start_Date__c__is_set = true;
  }
  
  /**
   * element  : Public_Project__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Public_Project__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Public_Project__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Public_Project__c__is_set = false;

  private java.lang.Boolean Public_Project__c;

  public java.lang.Boolean getPublic_Project__c() {
    return Public_Project__c;
  }

  

  public void setPublic_Project__c(java.lang.Boolean Public_Project__c) {
    this.Public_Project__c = Public_Project__c;
    Public_Project__c__is_set = true;
  }
  
  /**
   * element  : Quotes of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Quotes__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Quotes","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Quotes__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Quotes;

  public com.sforce.soap.enterprise.QueryResult getQuotes() {
    return Quotes;
  }

  

  public void setQuotes(com.sforce.soap.enterprise.QueryResult Quotes) {
    this.Quotes = Quotes;
    Quotes__is_set = true;
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
   * element  : Regional_Manager__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Regional_Manager__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Regional_Manager__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean Regional_Manager__c__is_set = false;

  private java.lang.String Regional_Manager__c;

  public java.lang.String getRegional_Manager__c() {
    return Regional_Manager__c;
  }

  

  public void setRegional_Manager__c(java.lang.String Regional_Manager__c) {
    this.Regional_Manager__c = Regional_Manager__c;
    Regional_Manager__c__is_set = true;
  }
  
  /**
   * element  : Regional_Manager__r of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo Regional_Manager__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Regional_Manager__r","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean Regional_Manager__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.User Regional_Manager__r;

  public com.sforce.soap.enterprise.sobject.User getRegional_Manager__r() {
    return Regional_Manager__r;
  }

  

  public void setRegional_Manager__r(com.sforce.soap.enterprise.sobject.User Regional_Manager__r) {
    this.Regional_Manager__r = Regional_Manager__r;
    Regional_Manager__r__is_set = true;
  }
  
  /**
   * element  : Relocation_Assistance_Available__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Relocation_Assistance_Available__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Relocation_Assistance_Available__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Relocation_Assistance_Available__c__is_set = false;

  private java.lang.String Relocation_Assistance_Available__c;

  public java.lang.String getRelocation_Assistance_Available__c() {
    return Relocation_Assistance_Available__c;
  }

  

  public void setRelocation_Assistance_Available__c(java.lang.String Relocation_Assistance_Available__c) {
    this.Relocation_Assistance_Available__c = Relocation_Assistance_Available__c;
    Relocation_Assistance_Available__c__is_set = true;
  }
  
  /**
   * element  : Remaining_EEs_Needed__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Remaining_EEs_Needed__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Remaining_EEs_Needed__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Remaining_EEs_Needed__c__is_set = false;

  private java.lang.Double Remaining_EEs_Needed__c;

  public java.lang.Double getRemaining_EEs_Needed__c() {
    return Remaining_EEs_Needed__c;
  }

  

  public void setRemaining_EEs_Needed__c(java.lang.Double Remaining_EEs_Needed__c) {
    this.Remaining_EEs_Needed__c = Remaining_EEs_Needed__c;
    Remaining_EEs_Needed__c__is_set = true;
  }
  
  /**
   * element  : Requested_Headcount__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Requested_Headcount__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Requested_Headcount__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Requested_Headcount__c__is_set = false;

  private java.lang.Double Requested_Headcount__c;

  public java.lang.Double getRequested_Headcount__c() {
    return Requested_Headcount__c;
  }

  

  public void setRequested_Headcount__c(java.lang.Double Requested_Headcount__c) {
    this.Requested_Headcount__c = Requested_Headcount__c;
    Requested_Headcount__c__is_set = true;
  }
  
  /**
   * element  : Requested_Start_Time__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Requested_Start_Time__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Requested_Start_Time__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Requested_Start_Time__c__is_set = false;

  private java.lang.String Requested_Start_Time__c;

  public java.lang.String getRequested_Start_Time__c() {
    return Requested_Start_Time__c;
  }

  

  public void setRequested_Start_Time__c(java.lang.String Requested_Start_Time__c) {
    this.Requested_Start_Time__c = Requested_Start_Time__c;
    Requested_Start_Time__c__is_set = true;
  }
  
  /**
   * element  : Required_Travel_for_Perm_Placement_Job__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Required_Travel_for_Perm_Placement_Job__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Required_Travel_for_Perm_Placement_Job__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Required_Travel_for_Perm_Placement_Job__c__is_set = false;

  private java.lang.Double Required_Travel_for_Perm_Placement_Job__c;

  public java.lang.Double getRequired_Travel_for_Perm_Placement_Job__c() {
    return Required_Travel_for_Perm_Placement_Job__c;
  }

  

  public void setRequired_Travel_for_Perm_Placement_Job__c(java.lang.Double Required_Travel_for_Perm_Placement_Job__c) {
    this.Required_Travel_for_Perm_Placement_Job__c = Required_Travel_for_Perm_Placement_Job__c;
    Required_Travel_for_Perm_Placement_Job__c__is_set = true;
  }
  
  /**
   * element  : S4STEO__Transferring_History__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo S4STEO__Transferring_History__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","S4STEO__Transferring_History__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean S4STEO__Transferring_History__c__is_set = false;

  private java.lang.String S4STEO__Transferring_History__c;

  public java.lang.String getS4STEO__Transferring_History__c() {
    return S4STEO__Transferring_History__c;
  }

  

  public void setS4STEO__Transferring_History__c(java.lang.String S4STEO__Transferring_History__c) {
    this.S4STEO__Transferring_History__c = S4STEO__Transferring_History__c;
    S4STEO__Transferring_History__c__is_set = true;
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
   * element  : Special_Appearance_Instructions__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Special_Appearance_Instructions__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Special_Appearance_Instructions__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Special_Appearance_Instructions__c__is_set = false;

  private java.lang.String Special_Appearance_Instructions__c;

  public java.lang.String getSpecial_Appearance_Instructions__c() {
    return Special_Appearance_Instructions__c;
  }

  

  public void setSpecial_Appearance_Instructions__c(java.lang.String Special_Appearance_Instructions__c) {
    this.Special_Appearance_Instructions__c = Special_Appearance_Instructions__c;
    Special_Appearance_Instructions__c__is_set = true;
  }
  
  /**
   * element  : Special_Billing_Instructions__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Special_Billing_Instructions__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Special_Billing_Instructions__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Special_Billing_Instructions__c__is_set = false;

  private java.lang.String Special_Billing_Instructions__c;

  public java.lang.String getSpecial_Billing_Instructions__c() {
    return Special_Billing_Instructions__c;
  }

  

  public void setSpecial_Billing_Instructions__c(java.lang.String Special_Billing_Instructions__c) {
    this.Special_Billing_Instructions__c = Special_Billing_Instructions__c;
    Special_Billing_Instructions__c__is_set = true;
  }
  
  /**
   * element  : Special_Requirements__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Special_Requirements__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Special_Requirements__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Special_Requirements__c__is_set = false;

  private java.lang.String Special_Requirements__c;

  public java.lang.String getSpecial_Requirements__c() {
    return Special_Requirements__c;
  }

  

  public void setSpecial_Requirements__c(java.lang.String Special_Requirements__c) {
    this.Special_Requirements__c = Special_Requirements__c;
    Special_Requirements__c__is_set = true;
  }
  
  /**
   * element  : Special_Safety_Instructions__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Special_Safety_Instructions__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Special_Safety_Instructions__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Special_Safety_Instructions__c__is_set = false;

  private java.lang.String Special_Safety_Instructions__c;

  public java.lang.String getSpecial_Safety_Instructions__c() {
    return Special_Safety_Instructions__c;
  }

  

  public void setSpecial_Safety_Instructions__c(java.lang.String Special_Safety_Instructions__c) {
    this.Special_Safety_Instructions__c = Special_Safety_Instructions__c;
    Special_Safety_Instructions__c__is_set = true;
  }
  
  /**
   * element  : Special_Tools_Equipment_Instructions__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Special_Tools_Equipment_Instructions__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Special_Tools_Equipment_Instructions__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Special_Tools_Equipment_Instructions__c__is_set = false;

  private java.lang.String Special_Tools_Equipment_Instructions__c;

  public java.lang.String getSpecial_Tools_Equipment_Instructions__c() {
    return Special_Tools_Equipment_Instructions__c;
  }

  

  public void setSpecial_Tools_Equipment_Instructions__c(java.lang.String Special_Tools_Equipment_Instructions__c) {
    this.Special_Tools_Equipment_Instructions__c = Special_Tools_Equipment_Instructions__c;
    Special_Tools_Equipment_Instructions__c__is_set = true;
  }
  
  /**
   * element  : Special_Travel_Instructions__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Special_Travel_Instructions__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Special_Travel_Instructions__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Special_Travel_Instructions__c__is_set = false;

  private java.lang.String Special_Travel_Instructions__c;

  public java.lang.String getSpecial_Travel_Instructions__c() {
    return Special_Travel_Instructions__c;
  }

  

  public void setSpecial_Travel_Instructions__c(java.lang.String Special_Travel_Instructions__c) {
    this.Special_Travel_Instructions__c = Special_Travel_Instructions__c;
    Special_Travel_Instructions__c__is_set = true;
  }
  
  /**
   * element  : StageName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo StageName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","StageName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean StageName__is_set = false;

  private java.lang.String StageName;

  public java.lang.String getStageName() {
    return StageName;
  }

  

  public void setStageName(java.lang.String StageName) {
    this.StageName = StageName;
    StageName__is_set = true;
  }
  
  /**
   * element  : SyncedQuote of type {urn:sobject.enterprise.soap.sforce.com}Quote
   * java type: com.sforce.soap.enterprise.sobject.Quote
   */
  private static final com.sforce.ws.bind.TypeInfo SyncedQuote__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SyncedQuote","urn:sobject.enterprise.soap.sforce.com","Quote",0,1,true);

  private boolean SyncedQuote__is_set = false;

  private com.sforce.soap.enterprise.sobject.Quote SyncedQuote;

  public com.sforce.soap.enterprise.sobject.Quote getSyncedQuote() {
    return SyncedQuote;
  }

  

  public void setSyncedQuote(com.sforce.soap.enterprise.sobject.Quote SyncedQuote) {
    this.SyncedQuote = SyncedQuote;
    SyncedQuote__is_set = true;
  }
  
  /**
   * element  : SyncedQuoteId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo SyncedQuoteId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SyncedQuoteId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean SyncedQuoteId__is_set = false;

  private java.lang.String SyncedQuoteId;

  public java.lang.String getSyncedQuoteId() {
    return SyncedQuoteId;
  }

  

  public void setSyncedQuoteId(java.lang.String SyncedQuoteId) {
    this.SyncedQuoteId = SyncedQuoteId;
    SyncedQuoteId__is_set = true;
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
   * element  : Trade_and_WC_Code__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Trade_and_WC_Code__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Trade_and_WC_Code__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Trade_and_WC_Code__c__is_set = false;

  private java.lang.String Trade_and_WC_Code__c;

  public java.lang.String getTrade_and_WC_Code__c() {
    return Trade_and_WC_Code__c;
  }

  

  public void setTrade_and_WC_Code__c(java.lang.String Trade_and_WC_Code__c) {
    this.Trade_and_WC_Code__c = Trade_and_WC_Code__c;
    Trade_and_WC_Code__c__is_set = true;
  }
  
  /**
   * element  : Trade_s_Skill_Levels__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Trade_s_Skill_Levels__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Trade_s_Skill_Levels__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Trade_s_Skill_Levels__c__is_set = false;

  private java.lang.String Trade_s_Skill_Levels__c;

  public java.lang.String getTrade_s_Skill_Levels__c() {
    return Trade_s_Skill_Levels__c;
  }

  

  public void setTrade_s_Skill_Levels__c(java.lang.String Trade_s_Skill_Levels__c) {
    this.Trade_s_Skill_Levels__c = Trade_s_Skill_Levels__c;
    Trade_s_Skill_Levels__c__is_set = true;
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
   * element  : Used_Management_Placement_Service_Before__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Used_Management_Placement_Service_Before__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Used_Management_Placement_Service_Before__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Used_Management_Placement_Service_Before__c__is_set = false;

  private java.lang.String Used_Management_Placement_Service_Before__c;

  public java.lang.String getUsed_Management_Placement_Service_Before__c() {
    return Used_Management_Placement_Service_Before__c;
  }

  

  public void setUsed_Management_Placement_Service_Before__c(java.lang.String Used_Management_Placement_Service_Before__c) {
    this.Used_Management_Placement_Service_Before__c = Used_Management_Placement_Service_Before__c;
    Used_Management_Placement_Service_Before__c__is_set = true;
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
   * element  : VCSSAP__VCSEmails__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__VCSEmails__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__VCSEmails__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean VCSSAP__VCSEmails__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult VCSSAP__VCSEmails__r;

  public com.sforce.soap.enterprise.QueryResult getVCSSAP__VCSEmails__r() {
    return VCSSAP__VCSEmails__r;
  }

  

  public void setVCSSAP__VCSEmails__r(com.sforce.soap.enterprise.QueryResult VCSSAP__VCSEmails__r) {
    this.VCSSAP__VCSEmails__r = VCSSAP__VCSEmails__r;
    VCSSAP__VCSEmails__r__is_set = true;
  }
  
  /**
   * element  : Work_State2__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Work_State2__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Work_State2__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Work_State2__c__is_set = false;

  private java.lang.String Work_State2__c;

  public java.lang.String getWork_State2__c() {
    return Work_State2__c;
  }

  

  public void setWork_State2__c(java.lang.String Work_State2__c) {
    this.Work_State2__c = Work_State2__c;
    Work_State2__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__R00N70000001hM2REAU__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__R00N70000001hM2REAU__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__R00N70000001hM2REAU__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean echosign_dev1__R00N70000001hM2REAU__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult echosign_dev1__R00N70000001hM2REAU__r;

  public com.sforce.soap.enterprise.QueryResult getEchosign_dev1__R00N70000001hM2REAU__r() {
    return echosign_dev1__R00N70000001hM2REAU__r;
  }

  

  public void setEchosign_dev1__R00N70000001hM2REAU__r(com.sforce.soap.enterprise.QueryResult echosign_dev1__R00N70000001hM2REAU__r) {
    this.echosign_dev1__R00N70000001hM2REAU__r = echosign_dev1__R00N70000001hM2REAU__r;
    echosign_dev1__R00N70000001hM2REAU__r__is_set = true;
  }
  
  /**
   * element  : i__DaysSinceLastMail__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo i__DaysSinceLastMail__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__DaysSinceLastMail__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean i__DaysSinceLastMail__c__is_set = false;

  private java.lang.Double i__DaysSinceLastMail__c;

  public java.lang.Double getI__DaysSinceLastMail__c() {
    return i__DaysSinceLastMail__c;
  }

  

  public void setI__DaysSinceLastMail__c(java.lang.Double i__DaysSinceLastMail__c) {
    this.i__DaysSinceLastMail__c = i__DaysSinceLastMail__c;
    i__DaysSinceLastMail__c__is_set = true;
  }
  
  /**
   * element  : i__Emails__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo i__Emails__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__Emails__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean i__Emails__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult i__Emails__r;

  public com.sforce.soap.enterprise.QueryResult getI__Emails__r() {
    return i__Emails__r;
  }

  

  public void setI__Emails__r(com.sforce.soap.enterprise.QueryResult i__Emails__r) {
    this.i__Emails__r = i__Emails__r;
    i__Emails__r__is_set = true;
  }
  
  /**
   * element  : i__LastInboundMail__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo i__LastInboundMail__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__LastInboundMail__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean i__LastInboundMail__c__is_set = false;

  private java.lang.String i__LastInboundMail__c;

  public java.lang.String getI__LastInboundMail__c() {
    return i__LastInboundMail__c;
  }

  

  public void setI__LastInboundMail__c(java.lang.String i__LastInboundMail__c) {
    this.i__LastInboundMail__c = i__LastInboundMail__c;
    i__LastInboundMail__c__is_set = true;
  }
  
  /**
   * element  : i__LastInboundMail__r of type {urn:sobject.enterprise.soap.sforce.com}i__Email__c
   * java type: com.sforce.soap.enterprise.sobject.I__Email__c
   */
  private static final com.sforce.ws.bind.TypeInfo i__LastInboundMail__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__LastInboundMail__r","urn:sobject.enterprise.soap.sforce.com","i__Email__c",0,1,true);

  private boolean i__LastInboundMail__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.I__Email__c i__LastInboundMail__r;

  public com.sforce.soap.enterprise.sobject.I__Email__c getI__LastInboundMail__r() {
    return i__LastInboundMail__r;
  }

  

  public void setI__LastInboundMail__r(com.sforce.soap.enterprise.sobject.I__Email__c i__LastInboundMail__r) {
    this.i__LastInboundMail__r = i__LastInboundMail__r;
    i__LastInboundMail__r__is_set = true;
  }
  
  /**
   * element  : i__LastInboundSent__c of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo i__LastInboundSent__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__LastInboundSent__c","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean i__LastInboundSent__c__is_set = false;

  private java.util.Calendar i__LastInboundSent__c;

  public java.util.Calendar getI__LastInboundSent__c() {
    return i__LastInboundSent__c;
  }

  

  public void setI__LastInboundSent__c(java.util.Calendar i__LastInboundSent__c) {
    this.i__LastInboundSent__c = i__LastInboundSent__c;
    i__LastInboundSent__c__is_set = true;
  }
  
  /**
   * element  : i__LastInboundTime__c of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo i__LastInboundTime__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__LastInboundTime__c","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean i__LastInboundTime__c__is_set = false;

  private java.util.Calendar i__LastInboundTime__c;

  public java.util.Calendar getI__LastInboundTime__c() {
    return i__LastInboundTime__c;
  }

  

  public void setI__LastInboundTime__c(java.util.Calendar i__LastInboundTime__c) {
    this.i__LastInboundTime__c = i__LastInboundTime__c;
    i__LastInboundTime__c__is_set = true;
  }
  
  /**
   * element  : i__LastMailSent__c of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo i__LastMailSent__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__LastMailSent__c","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean i__LastMailSent__c__is_set = false;

  private java.util.Calendar i__LastMailSent__c;

  public java.util.Calendar getI__LastMailSent__c() {
    return i__LastMailSent__c;
  }

  

  public void setI__LastMailSent__c(java.util.Calendar i__LastMailSent__c) {
    this.i__LastMailSent__c = i__LastMailSent__c;
    i__LastMailSent__c__is_set = true;
  }
  
  /**
   * element  : i__LastMailTimeDelta__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo i__LastMailTimeDelta__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__LastMailTimeDelta__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean i__LastMailTimeDelta__c__is_set = false;

  private java.lang.Double i__LastMailTimeDelta__c;

  public java.lang.Double getI__LastMailTimeDelta__c() {
    return i__LastMailTimeDelta__c;
  }

  

  public void setI__LastMailTimeDelta__c(java.lang.Double i__LastMailTimeDelta__c) {
    this.i__LastMailTimeDelta__c = i__LastMailTimeDelta__c;
    i__LastMailTimeDelta__c__is_set = true;
  }
  
  /**
   * element  : i__LastMailTime__c of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo i__LastMailTime__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__LastMailTime__c","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean i__LastMailTime__c__is_set = false;

  private java.util.Calendar i__LastMailTime__c;

  public java.util.Calendar getI__LastMailTime__c() {
    return i__LastMailTime__c;
  }

  

  public void setI__LastMailTime__c(java.util.Calendar i__LastMailTime__c) {
    this.i__LastMailTime__c = i__LastMailTime__c;
    i__LastMailTime__c__is_set = true;
  }
  
  /**
   * element  : i__LastMail__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo i__LastMail__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__LastMail__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean i__LastMail__c__is_set = false;

  private java.lang.String i__LastMail__c;

  public java.lang.String getI__LastMail__c() {
    return i__LastMail__c;
  }

  

  public void setI__LastMail__c(java.lang.String i__LastMail__c) {
    this.i__LastMail__c = i__LastMail__c;
    i__LastMail__c__is_set = true;
  }
  
  /**
   * element  : i__LastMail__r of type {urn:sobject.enterprise.soap.sforce.com}i__Email__c
   * java type: com.sforce.soap.enterprise.sobject.I__Email__c
   */
  private static final com.sforce.ws.bind.TypeInfo i__LastMail__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__LastMail__r","urn:sobject.enterprise.soap.sforce.com","i__Email__c",0,1,true);

  private boolean i__LastMail__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.I__Email__c i__LastMail__r;

  public com.sforce.soap.enterprise.sobject.I__Email__c getI__LastMail__r() {
    return i__LastMail__r;
  }

  

  public void setI__LastMail__r(com.sforce.soap.enterprise.sobject.I__Email__c i__LastMail__r) {
    this.i__LastMail__r = i__LastMail__r;
    i__LastMail__r__is_set = true;
  }
  
  /**
   * element  : i__LastOutboundMail__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo i__LastOutboundMail__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__LastOutboundMail__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean i__LastOutboundMail__c__is_set = false;

  private java.lang.String i__LastOutboundMail__c;

  public java.lang.String getI__LastOutboundMail__c() {
    return i__LastOutboundMail__c;
  }

  

  public void setI__LastOutboundMail__c(java.lang.String i__LastOutboundMail__c) {
    this.i__LastOutboundMail__c = i__LastOutboundMail__c;
    i__LastOutboundMail__c__is_set = true;
  }
  
  /**
   * element  : i__LastOutboundMail__r of type {urn:sobject.enterprise.soap.sforce.com}i__Email__c
   * java type: com.sforce.soap.enterprise.sobject.I__Email__c
   */
  private static final com.sforce.ws.bind.TypeInfo i__LastOutboundMail__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__LastOutboundMail__r","urn:sobject.enterprise.soap.sforce.com","i__Email__c",0,1,true);

  private boolean i__LastOutboundMail__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.I__Email__c i__LastOutboundMail__r;

  public com.sforce.soap.enterprise.sobject.I__Email__c getI__LastOutboundMail__r() {
    return i__LastOutboundMail__r;
  }

  

  public void setI__LastOutboundMail__r(com.sforce.soap.enterprise.sobject.I__Email__c i__LastOutboundMail__r) {
    this.i__LastOutboundMail__r = i__LastOutboundMail__r;
    i__LastOutboundMail__r__is_set = true;
  }
  
  /**
   * element  : i__LastOutboundSent__c of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo i__LastOutboundSent__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__LastOutboundSent__c","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean i__LastOutboundSent__c__is_set = false;

  private java.util.Calendar i__LastOutboundSent__c;

  public java.util.Calendar getI__LastOutboundSent__c() {
    return i__LastOutboundSent__c;
  }

  

  public void setI__LastOutboundSent__c(java.util.Calendar i__LastOutboundSent__c) {
    this.i__LastOutboundSent__c = i__LastOutboundSent__c;
    i__LastOutboundSent__c__is_set = true;
  }
  
  /**
   * element  : i__LastOutboundTime__c of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo i__LastOutboundTime__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__LastOutboundTime__c","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean i__LastOutboundTime__c__is_set = false;

  private java.util.Calendar i__LastOutboundTime__c;

  public java.util.Calendar getI__LastOutboundTime__c() {
    return i__LastOutboundTime__c;
  }

  

  public void setI__LastOutboundTime__c(java.util.Calendar i__LastOutboundTime__c) {
    this.i__LastOutboundTime__c = i__LastOutboundTime__c;
    i__LastOutboundTime__c__is_set = true;
  }
  
  /**
   * element  : webm__Webmerge_Documents__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo webm__Webmerge_Documents__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","webm__Webmerge_Documents__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean webm__Webmerge_Documents__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult webm__Webmerge_Documents__r;

  public com.sforce.soap.enterprise.QueryResult getWebm__Webmerge_Documents__r() {
    return webm__Webmerge_Documents__r;
  }

  

  public void setWebm__Webmerge_Documents__r(com.sforce.soap.enterprise.QueryResult webm__Webmerge_Documents__r) {
    this.webm__Webmerge_Documents__r = webm__Webmerge_Documents__r;
    webm__Webmerge_Documents__r__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "Opportunity");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, Account__typeInfo, Account, Account__is_set);
    __typeMapper.writeString(__out, AccountId__typeInfo, AccountId, AccountId__is_set);
    __typeMapper.writeObject(__out, AccountPartners__typeInfo, AccountPartners, AccountPartners__is_set);
    __typeMapper.writeObject(__out, ActivityHistories__typeInfo, ActivityHistories, ActivityHistories__is_set);
    __typeMapper.writeString(__out, Actual_Duration_Period__c__typeInfo, Actual_Duration_Period__c, Actual_Duration_Period__c__is_set);
    __typeMapper.writeObject(__out, Actual_Duration__c__typeInfo, Actual_Duration__c, Actual_Duration__c__is_set);
    __typeMapper.writeObject(__out, Actual_Headcount__c__typeInfo, Actual_Headcount__c, Actual_Headcount__c__is_set);
    __typeMapper.writeObject(__out, Actual_Project_Duration__c__typeInfo, Actual_Project_Duration__c, Actual_Project_Duration__c__is_set);
    __typeMapper.writeObject(__out, Actual_Project_End_Date__c__typeInfo, Actual_Project_End_Date__c, Actual_Project_End_Date__c__is_set);
    __typeMapper.writeObject(__out, Actual_Start_Date__c__typeInfo, Actual_Start_Date__c, Actual_Start_Date__c__is_set);
    __typeMapper.writeString(__out, Actual_Start_Time__c__typeInfo, Actual_Start_Time__c, Actual_Start_Time__c__is_set);
    __typeMapper.writeString(__out, Address_Location_of_Project__c__typeInfo, Address_Location_of_Project__c, Address_Location_of_Project__c__is_set);
    __typeMapper.writeObject(__out, Amount__typeInfo, Amount, Amount__is_set);
    __typeMapper.writeObject(__out, AttachedContentDocuments__typeInfo, AttachedContentDocuments, AttachedContentDocuments__is_set);
    __typeMapper.writeObject(__out, AttachedContentNotes__typeInfo, AttachedContentNotes, AttachedContentNotes__is_set);
    __typeMapper.writeObject(__out, Attachments__typeInfo, Attachments, Attachments__is_set);
    __typeMapper.writeString(__out, Bill_Rate_s__c__typeInfo, Bill_Rate_s__c, Bill_Rate_s__c__is_set);
    __typeMapper.writeString(__out, Bonus_Amount__c__typeInfo, Bonus_Amount__c, Bonus_Amount__c__is_set);
    __typeMapper.writeString(__out, Bonus_Y_N__c__typeInfo, Bonus_Y_N__c, Bonus_Y_N__c__is_set);
    __typeMapper.writeObject(__out, Campaign__typeInfo, Campaign, Campaign__is_set);
    __typeMapper.writeString(__out, CampaignId__typeInfo, CampaignId, CampaignId__is_set);
    __typeMapper.writeObject(__out, Check_Here_If_Background_Check_Required__c__typeInfo, Check_Here_If_Background_Check_Required__c, Check_Here_If_Background_Check_Required__c__is_set);
    __typeMapper.writeObject(__out, Check_Here_If_Drug_Test_Required__c__typeInfo, Check_Here_If_Drug_Test_Required__c, Check_Here_If_Drug_Test_Required__c__is_set);
    __typeMapper.writeString(__out, Client_Onwer_ID__c__typeInfo, Client_Onwer_ID__c, Client_Onwer_ID__c__is_set);
    __typeMapper.writeObject(__out, CloseDate__typeInfo, CloseDate, CloseDate__is_set);
    __typeMapper.writeObject(__out, CombinedAttachments__typeInfo, CombinedAttachments, CombinedAttachments__is_set);
    __typeMapper.writeString(__out, Comments__c__typeInfo, Comments__c, Comments__c__is_set);
    __typeMapper.writeString(__out, Contact_Lookup__c__typeInfo, Contact_Lookup__c, Contact_Lookup__c__is_set);
    __typeMapper.writeObject(__out, Contact_Lookup__r__typeInfo, Contact_Lookup__r, Contact_Lookup__r__is_set);
    __typeMapper.writeString(__out, Contact_Owner__c__typeInfo, Contact_Owner__c, Contact_Owner__c__is_set);
    __typeMapper.writeObject(__out, ContentDocumentLinks__typeInfo, ContentDocumentLinks, ContentDocumentLinks__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeObject(__out, Credit_Limit__c__typeInfo, Credit_Limit__c, Credit_Limit__c__is_set);
    __typeMapper.writeString(__out, Credit_Rating__c__typeInfo, Credit_Rating__c, Credit_Rating__c__is_set);
    __typeMapper.writeString(__out, Description__typeInfo, Description, Description__is_set);
    __typeMapper.writeObject(__out, Emails__typeInfo, Emails, Emails__is_set);
    __typeMapper.writeString(__out, Employee_Names_and_Notes__c__typeInfo, Employee_Names_and_Notes__c, Employee_Names_and_Notes__c__is_set);
    __typeMapper.writeObject(__out, Estimated_Duration_Days__c__typeInfo, Estimated_Duration_Days__c, Estimated_Duration_Days__c__is_set);
    __typeMapper.writeObject(__out, Estimated_Project_End_Date__c__typeInfo, Estimated_Project_End_Date__c, Estimated_Project_End_Date__c__is_set);
    __typeMapper.writeObject(__out, EventRelations__typeInfo, EventRelations, EventRelations__is_set);
    __typeMapper.writeObject(__out, Events__typeInfo, Events, Events__is_set);
    __typeMapper.writeString(__out, Fee_Agreement_Sent__c__typeInfo, Fee_Agreement_Sent__c, Fee_Agreement_Sent__c__is_set);
    __typeMapper.writeString(__out, Fee_Agreement_Signed__c__typeInfo, Fee_Agreement_Signed__c, Fee_Agreement_Signed__c__is_set);
    __typeMapper.writeObject(__out, FeedSubscriptionsForEntity__typeInfo, FeedSubscriptionsForEntity, FeedSubscriptionsForEntity__is_set);
    __typeMapper.writeObject(__out, Feeds__typeInfo, Feeds, Feeds__is_set);
    __typeMapper.writeString(__out, Fiscal__typeInfo, Fiscal, Fiscal__is_set);
    __typeMapper.writeObject(__out, FiscalQuarter__typeInfo, FiscalQuarter, FiscalQuarter__is_set);
    __typeMapper.writeObject(__out, FiscalYear__typeInfo, FiscalYear, FiscalYear__is_set);
    __typeMapper.writeString(__out, ForecastCategory__typeInfo, ForecastCategory, ForecastCategory__is_set);
    __typeMapper.writeString(__out, ForecastCategoryName__typeInfo, ForecastCategoryName, ForecastCategoryName__is_set);
    __typeMapper.writeString(__out, Global_s_Take_of_GP__c__typeInfo, Global_s_Take_of_GP__c, Global_s_Take_of_GP__c__is_set);
    __typeMapper.writeObject(__out, HasOpenActivity__typeInfo, HasOpenActivity, HasOpenActivity__is_set);
    __typeMapper.writeObject(__out, HasOpportunityLineItem__typeInfo, HasOpportunityLineItem, HasOpportunityLineItem__is_set);
    __typeMapper.writeObject(__out, HasOverdueTask__typeInfo, HasOverdueTask, HasOverdueTask__is_set);
    __typeMapper.writeObject(__out, Histories__typeInfo, Histories, Histories__is_set);
    __typeMapper.writeString(__out, If_Background_Ck_required_is_it_BILLED__c__typeInfo, If_Background_Ck_required_is_it_BILLED__c, If_Background_Ck_required_is_it_BILLED__c__is_set);
    __typeMapper.writeString(__out, If_Drug_Test_required_is_it_BILLED__c__typeInfo, If_Drug_Test_required_is_it_BILLED__c, If_Drug_Test_required_is_it_BILLED__c__is_set);
    __typeMapper.writeObject(__out, IsClosed__typeInfo, IsClosed, IsClosed__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, IsWon__typeInfo, IsWon, IsWon__is_set);
    __typeMapper.writeString(__out, Is_a_Background_Check_Required__c__typeInfo, Is_a_Background_Check_Required__c, Is_a_Background_Check_Required__c__is_set);
    __typeMapper.writeString(__out, Is_a_Drug_Test_Required__c__typeInfo, Is_a_Drug_Test_Required__c, Is_a_Drug_Test_Required__c__is_set);
    __typeMapper.writeString(__out, Job_Requirements__c__typeInfo, Job_Requirements__c, Job_Requirements__c__is_set);
    __typeMapper.writeObject(__out, LastActivityDate__typeInfo, LastActivityDate, LastActivityDate__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, LastReferencedDate__typeInfo, LastReferencedDate, LastReferencedDate__is_set);
    __typeMapper.writeObject(__out, LastViewedDate__typeInfo, LastViewedDate, LastViewedDate__is_set);
    __typeMapper.writeString(__out, LeadSource__typeInfo, LeadSource, LeadSource__is_set);
    __typeMapper.writeString(__out, Licenses_Certifications_Required__c__typeInfo, Licenses_Certifications_Required__c, Licenses_Certifications_Required__c__is_set);
    __typeMapper.writeObject(__out, LookedUpFromActivities__typeInfo, LookedUpFromActivities, LookedUpFromActivities__is_set);
    __typeMapper.writeObject(__out, MME__EmailMessages__r__typeInfo, MME__EmailMessages__r, MME__EmailMessages__r__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeString(__out, NextStep__typeInfo, NextStep, NextStep__is_set);
    __typeMapper.writeObject(__out, Notes__typeInfo, Notes, Notes__is_set);
    __typeMapper.writeObject(__out, NotesAndAttachments__typeInfo, NotesAndAttachments, NotesAndAttachments__is_set);
    __typeMapper.writeObject(__out, OpenActivities__typeInfo, OpenActivities, OpenActivities__is_set);
    __typeMapper.writeObject(__out, OpportunityCompetitors__typeInfo, OpportunityCompetitors, OpportunityCompetitors__is_set);
    __typeMapper.writeObject(__out, OpportunityContactRoles__typeInfo, OpportunityContactRoles, OpportunityContactRoles__is_set);
    __typeMapper.writeObject(__out, OpportunityHistories__typeInfo, OpportunityHistories, OpportunityHistories__is_set);
    __typeMapper.writeObject(__out, OpportunityLineItems__typeInfo, OpportunityLineItems, OpportunityLineItems__is_set);
    __typeMapper.writeObject(__out, OpportunityPartnersFrom__typeInfo, OpportunityPartnersFrom, OpportunityPartnersFrom__is_set);
    __typeMapper.writeString(__out, Ops_Team_s_to_Assign__c__typeInfo, Ops_Team_s_to_Assign__c, Ops_Team_s_to_Assign__c__is_set);
    __typeMapper.writeString(__out, Order_City__c__typeInfo, Order_City__c, Order_City__c__is_set);
    __typeMapper.writeString(__out, Other_Special_Instructions__c__typeInfo, Other_Special_Instructions__c, Other_Special_Instructions__c__is_set);
    __typeMapper.writeObject(__out, Owner__typeInfo, Owner, Owner__is_set);
    __typeMapper.writeString(__out, OwnerId__typeInfo, OwnerId, OwnerId__is_set);
    __typeMapper.writeObject(__out, Partners__typeInfo, Partners, Partners__is_set);
    __typeMapper.writeString(__out, Pay_Rate_s__c__typeInfo, Pay_Rate_s__c, Pay_Rate_s__c__is_set);
    __typeMapper.writeString(__out, Per_Diem__c__typeInfo, Per_Diem__c, Per_Diem__c__is_set);
    __typeMapper.writeString(__out, Pre_Pay_Client__c__typeInfo, Pre_Pay_Client__c, Pre_Pay_Client__c__is_set);
    __typeMapper.writeString(__out, Prevailing_Wage_Project__c__typeInfo, Prevailing_Wage_Project__c, Prevailing_Wage_Project__c__is_set);
    __typeMapper.writeObject(__out, Prevailing_Wage__c__typeInfo, Prevailing_Wage__c, Prevailing_Wage__c__is_set);
    __typeMapper.writeObject(__out, Pricebook2__typeInfo, Pricebook2, Pricebook2__is_set);
    __typeMapper.writeString(__out, Pricebook2Id__typeInfo, Pricebook2Id, Pricebook2Id__is_set);
    __typeMapper.writeObject(__out, Probability__typeInfo, Probability, Probability__is_set);
    __typeMapper.writeObject(__out, ProcessInstances__typeInfo, ProcessInstances, ProcessInstances__is_set);
    __typeMapper.writeObject(__out, ProcessSteps__typeInfo, ProcessSteps, ProcessSteps__is_set);
    __typeMapper.writeString(__out, Project_Contact__c__typeInfo, Project_Contact__c, Project_Contact__c__is_set);
    __typeMapper.writeString(__out, Project_GC_Address__c__typeInfo, Project_GC_Address__c, Project_GC_Address__c__is_set);
    __typeMapper.writeString(__out, Project_GC_Name__c__typeInfo, Project_GC_Name__c, Project_GC_Name__c__is_set);
    __typeMapper.writeString(__out, Project_Owner_Address__c__typeInfo, Project_Owner_Address__c, Project_Owner_Address__c__is_set);
    __typeMapper.writeString(__out, Project_Owner_Name__c__typeInfo, Project_Owner_Name__c, Project_Owner_Name__c__is_set);
    __typeMapper.writeObject(__out, Project_Start_Date__c__typeInfo, Project_Start_Date__c, Project_Start_Date__c__is_set);
    __typeMapper.writeObject(__out, Public_Project__c__typeInfo, Public_Project__c, Public_Project__c__is_set);
    __typeMapper.writeObject(__out, Quotes__typeInfo, Quotes, Quotes__is_set);
    __typeMapper.writeObject(__out, RecordAssociatedGroups__typeInfo, RecordAssociatedGroups, RecordAssociatedGroups__is_set);
    __typeMapper.writeString(__out, Regional_Manager__c__typeInfo, Regional_Manager__c, Regional_Manager__c__is_set);
    __typeMapper.writeObject(__out, Regional_Manager__r__typeInfo, Regional_Manager__r, Regional_Manager__r__is_set);
    __typeMapper.writeString(__out, Relocation_Assistance_Available__c__typeInfo, Relocation_Assistance_Available__c, Relocation_Assistance_Available__c__is_set);
    __typeMapper.writeObject(__out, Remaining_EEs_Needed__c__typeInfo, Remaining_EEs_Needed__c, Remaining_EEs_Needed__c__is_set);
    __typeMapper.writeObject(__out, Requested_Headcount__c__typeInfo, Requested_Headcount__c, Requested_Headcount__c__is_set);
    __typeMapper.writeString(__out, Requested_Start_Time__c__typeInfo, Requested_Start_Time__c, Requested_Start_Time__c__is_set);
    __typeMapper.writeObject(__out, Required_Travel_for_Perm_Placement_Job__c__typeInfo, Required_Travel_for_Perm_Placement_Job__c, Required_Travel_for_Perm_Placement_Job__c__is_set);
    __typeMapper.writeString(__out, S4STEO__Transferring_History__c__typeInfo, S4STEO__Transferring_History__c, S4STEO__Transferring_History__c__is_set);
    __typeMapper.writeObject(__out, Shares__typeInfo, Shares, Shares__is_set);
    __typeMapper.writeString(__out, Special_Appearance_Instructions__c__typeInfo, Special_Appearance_Instructions__c, Special_Appearance_Instructions__c__is_set);
    __typeMapper.writeString(__out, Special_Billing_Instructions__c__typeInfo, Special_Billing_Instructions__c, Special_Billing_Instructions__c__is_set);
    __typeMapper.writeString(__out, Special_Requirements__c__typeInfo, Special_Requirements__c, Special_Requirements__c__is_set);
    __typeMapper.writeString(__out, Special_Safety_Instructions__c__typeInfo, Special_Safety_Instructions__c, Special_Safety_Instructions__c__is_set);
    __typeMapper.writeString(__out, Special_Tools_Equipment_Instructions__c__typeInfo, Special_Tools_Equipment_Instructions__c, Special_Tools_Equipment_Instructions__c__is_set);
    __typeMapper.writeString(__out, Special_Travel_Instructions__c__typeInfo, Special_Travel_Instructions__c, Special_Travel_Instructions__c__is_set);
    __typeMapper.writeString(__out, StageName__typeInfo, StageName, StageName__is_set);
    __typeMapper.writeObject(__out, SyncedQuote__typeInfo, SyncedQuote, SyncedQuote__is_set);
    __typeMapper.writeString(__out, SyncedQuoteId__typeInfo, SyncedQuoteId, SyncedQuoteId__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeObject(__out, Tags__typeInfo, Tags, Tags__is_set);
    __typeMapper.writeObject(__out, TaskRelations__typeInfo, TaskRelations, TaskRelations__is_set);
    __typeMapper.writeObject(__out, Tasks__typeInfo, Tasks, Tasks__is_set);
    __typeMapper.writeObject(__out, TopicAssignments__typeInfo, TopicAssignments, TopicAssignments__is_set);
    __typeMapper.writeString(__out, Trade_and_WC_Code__c__typeInfo, Trade_and_WC_Code__c, Trade_and_WC_Code__c__is_set);
    __typeMapper.writeString(__out, Trade_s_Skill_Levels__c__typeInfo, Trade_s_Skill_Levels__c, Trade_s_Skill_Levels__c__is_set);
    __typeMapper.writeString(__out, Type__typeInfo, Type, Type__is_set);
    __typeMapper.writeString(__out, Used_Management_Placement_Service_Before__c__typeInfo, Used_Management_Placement_Service_Before__c, Used_Management_Placement_Service_Before__c__is_set);
    __typeMapper.writeObject(__out, UserRecordAccess__typeInfo, UserRecordAccess, UserRecordAccess__is_set);
    __typeMapper.writeObject(__out, VCSSAP__VCSEmails__r__typeInfo, VCSSAP__VCSEmails__r, VCSSAP__VCSEmails__r__is_set);
    __typeMapper.writeString(__out, Work_State2__c__typeInfo, Work_State2__c, Work_State2__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__R00N70000001hM2REAU__r__typeInfo, echosign_dev1__R00N70000001hM2REAU__r, echosign_dev1__R00N70000001hM2REAU__r__is_set);
    __typeMapper.writeObject(__out, i__DaysSinceLastMail__c__typeInfo, i__DaysSinceLastMail__c, i__DaysSinceLastMail__c__is_set);
    __typeMapper.writeObject(__out, i__Emails__r__typeInfo, i__Emails__r, i__Emails__r__is_set);
    __typeMapper.writeString(__out, i__LastInboundMail__c__typeInfo, i__LastInboundMail__c, i__LastInboundMail__c__is_set);
    __typeMapper.writeObject(__out, i__LastInboundMail__r__typeInfo, i__LastInboundMail__r, i__LastInboundMail__r__is_set);
    __typeMapper.writeObject(__out, i__LastInboundSent__c__typeInfo, i__LastInboundSent__c, i__LastInboundSent__c__is_set);
    __typeMapper.writeObject(__out, i__LastInboundTime__c__typeInfo, i__LastInboundTime__c, i__LastInboundTime__c__is_set);
    __typeMapper.writeObject(__out, i__LastMailSent__c__typeInfo, i__LastMailSent__c, i__LastMailSent__c__is_set);
    __typeMapper.writeObject(__out, i__LastMailTimeDelta__c__typeInfo, i__LastMailTimeDelta__c, i__LastMailTimeDelta__c__is_set);
    __typeMapper.writeObject(__out, i__LastMailTime__c__typeInfo, i__LastMailTime__c, i__LastMailTime__c__is_set);
    __typeMapper.writeString(__out, i__LastMail__c__typeInfo, i__LastMail__c, i__LastMail__c__is_set);
    __typeMapper.writeObject(__out, i__LastMail__r__typeInfo, i__LastMail__r, i__LastMail__r__is_set);
    __typeMapper.writeString(__out, i__LastOutboundMail__c__typeInfo, i__LastOutboundMail__c, i__LastOutboundMail__c__is_set);
    __typeMapper.writeObject(__out, i__LastOutboundMail__r__typeInfo, i__LastOutboundMail__r, i__LastOutboundMail__r__is_set);
    __typeMapper.writeObject(__out, i__LastOutboundSent__c__typeInfo, i__LastOutboundSent__c, i__LastOutboundSent__c__is_set);
    __typeMapper.writeObject(__out, i__LastOutboundTime__c__typeInfo, i__LastOutboundTime__c, i__LastOutboundTime__c__is_set);
    __typeMapper.writeObject(__out, webm__Webmerge_Documents__r__typeInfo, webm__Webmerge_Documents__r, webm__Webmerge_Documents__r__is_set);
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
    if (__typeMapper.isElement(__in, Account__typeInfo)) {
      setAccount((com.sforce.soap.enterprise.sobject.Account)__typeMapper.readObject(__in, Account__typeInfo, com.sforce.soap.enterprise.sobject.Account.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AccountId__typeInfo)) {
      setAccountId((java.lang.String)__typeMapper.readString(__in, AccountId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AccountPartners__typeInfo)) {
      setAccountPartners((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, AccountPartners__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ActivityHistories__typeInfo)) {
      setActivityHistories((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, ActivityHistories__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Actual_Duration_Period__c__typeInfo)) {
      setActual_Duration_Period__c((java.lang.String)__typeMapper.readString(__in, Actual_Duration_Period__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Actual_Duration__c__typeInfo)) {
      setActual_Duration__c((java.lang.Double)__typeMapper.readObject(__in, Actual_Duration__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Actual_Headcount__c__typeInfo)) {
      setActual_Headcount__c((java.lang.Double)__typeMapper.readObject(__in, Actual_Headcount__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Actual_Project_Duration__c__typeInfo)) {
      setActual_Project_Duration__c((java.lang.Double)__typeMapper.readObject(__in, Actual_Project_Duration__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Actual_Project_End_Date__c__typeInfo)) {
      setActual_Project_End_Date__c((java.util.Calendar)__typeMapper.readObject(__in, Actual_Project_End_Date__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Actual_Start_Date__c__typeInfo)) {
      setActual_Start_Date__c((java.util.Calendar)__typeMapper.readObject(__in, Actual_Start_Date__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Actual_Start_Time__c__typeInfo)) {
      setActual_Start_Time__c((java.lang.String)__typeMapper.readString(__in, Actual_Start_Time__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Address_Location_of_Project__c__typeInfo)) {
      setAddress_Location_of_Project__c((java.lang.String)__typeMapper.readString(__in, Address_Location_of_Project__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Amount__typeInfo)) {
      setAmount((java.lang.Double)__typeMapper.readObject(__in, Amount__typeInfo, java.lang.Double.class));
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
    if (__typeMapper.isElement(__in, Bill_Rate_s__c__typeInfo)) {
      setBill_Rate_s__c((java.lang.String)__typeMapper.readString(__in, Bill_Rate_s__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Bonus_Amount__c__typeInfo)) {
      setBonus_Amount__c((java.lang.String)__typeMapper.readString(__in, Bonus_Amount__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Bonus_Y_N__c__typeInfo)) {
      setBonus_Y_N__c((java.lang.String)__typeMapper.readString(__in, Bonus_Y_N__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Campaign__typeInfo)) {
      setCampaign((com.sforce.soap.enterprise.sobject.Campaign)__typeMapper.readObject(__in, Campaign__typeInfo, com.sforce.soap.enterprise.sobject.Campaign.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CampaignId__typeInfo)) {
      setCampaignId((java.lang.String)__typeMapper.readString(__in, CampaignId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Check_Here_If_Background_Check_Required__c__typeInfo)) {
      setCheck_Here_If_Background_Check_Required__c((java.lang.Boolean)__typeMapper.readObject(__in, Check_Here_If_Background_Check_Required__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Check_Here_If_Drug_Test_Required__c__typeInfo)) {
      setCheck_Here_If_Drug_Test_Required__c((java.lang.Boolean)__typeMapper.readObject(__in, Check_Here_If_Drug_Test_Required__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Client_Onwer_ID__c__typeInfo)) {
      setClient_Onwer_ID__c((java.lang.String)__typeMapper.readString(__in, Client_Onwer_ID__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CloseDate__typeInfo)) {
      setCloseDate((java.util.Calendar)__typeMapper.readObject(__in, CloseDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CombinedAttachments__typeInfo)) {
      setCombinedAttachments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, CombinedAttachments__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Comments__c__typeInfo)) {
      setComments__c((java.lang.String)__typeMapper.readString(__in, Comments__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Contact_Lookup__c__typeInfo)) {
      setContact_Lookup__c((java.lang.String)__typeMapper.readString(__in, Contact_Lookup__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Contact_Lookup__r__typeInfo)) {
      setContact_Lookup__r((com.sforce.soap.enterprise.sobject.Contact)__typeMapper.readObject(__in, Contact_Lookup__r__typeInfo, com.sforce.soap.enterprise.sobject.Contact.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Contact_Owner__c__typeInfo)) {
      setContact_Owner__c((java.lang.String)__typeMapper.readString(__in, Contact_Owner__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Credit_Limit__c__typeInfo)) {
      setCredit_Limit__c((java.lang.Double)__typeMapper.readObject(__in, Credit_Limit__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Credit_Rating__c__typeInfo)) {
      setCredit_Rating__c((java.lang.String)__typeMapper.readString(__in, Credit_Rating__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Employee_Names_and_Notes__c__typeInfo)) {
      setEmployee_Names_and_Notes__c((java.lang.String)__typeMapper.readString(__in, Employee_Names_and_Notes__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Estimated_Duration_Days__c__typeInfo)) {
      setEstimated_Duration_Days__c((java.lang.Double)__typeMapper.readObject(__in, Estimated_Duration_Days__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Estimated_Project_End_Date__c__typeInfo)) {
      setEstimated_Project_End_Date__c((java.util.Calendar)__typeMapper.readObject(__in, Estimated_Project_End_Date__c__typeInfo, java.util.Calendar.class));
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
    if (__typeMapper.isElement(__in, Fee_Agreement_Sent__c__typeInfo)) {
      setFee_Agreement_Sent__c((java.lang.String)__typeMapper.readString(__in, Fee_Agreement_Sent__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Fee_Agreement_Signed__c__typeInfo)) {
      setFee_Agreement_Signed__c((java.lang.String)__typeMapper.readString(__in, Fee_Agreement_Signed__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Fiscal__typeInfo)) {
      setFiscal((java.lang.String)__typeMapper.readString(__in, Fiscal__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FiscalQuarter__typeInfo)) {
      setFiscalQuarter((java.lang.Integer)__typeMapper.readObject(__in, FiscalQuarter__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FiscalYear__typeInfo)) {
      setFiscalYear((java.lang.Integer)__typeMapper.readObject(__in, FiscalYear__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ForecastCategory__typeInfo)) {
      setForecastCategory((java.lang.String)__typeMapper.readString(__in, ForecastCategory__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ForecastCategoryName__typeInfo)) {
      setForecastCategoryName((java.lang.String)__typeMapper.readString(__in, ForecastCategoryName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Global_s_Take_of_GP__c__typeInfo)) {
      setGlobal_s_Take_of_GP__c((java.lang.String)__typeMapper.readString(__in, Global_s_Take_of_GP__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, HasOpenActivity__typeInfo)) {
      setHasOpenActivity((java.lang.Boolean)__typeMapper.readObject(__in, HasOpenActivity__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, HasOpportunityLineItem__typeInfo)) {
      setHasOpportunityLineItem((java.lang.Boolean)__typeMapper.readObject(__in, HasOpportunityLineItem__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, HasOverdueTask__typeInfo)) {
      setHasOverdueTask((java.lang.Boolean)__typeMapper.readObject(__in, HasOverdueTask__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Histories__typeInfo)) {
      setHistories((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Histories__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, If_Background_Ck_required_is_it_BILLED__c__typeInfo)) {
      setIf_Background_Ck_required_is_it_BILLED__c((java.lang.String)__typeMapper.readString(__in, If_Background_Ck_required_is_it_BILLED__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, If_Drug_Test_required_is_it_BILLED__c__typeInfo)) {
      setIf_Drug_Test_required_is_it_BILLED__c((java.lang.String)__typeMapper.readString(__in, If_Drug_Test_required_is_it_BILLED__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsClosed__typeInfo)) {
      setIsClosed((java.lang.Boolean)__typeMapper.readObject(__in, IsClosed__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {
      setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, IsDeleted__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsWon__typeInfo)) {
      setIsWon((java.lang.Boolean)__typeMapper.readObject(__in, IsWon__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Is_a_Background_Check_Required__c__typeInfo)) {
      setIs_a_Background_Check_Required__c((java.lang.String)__typeMapper.readString(__in, Is_a_Background_Check_Required__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Is_a_Drug_Test_Required__c__typeInfo)) {
      setIs_a_Drug_Test_Required__c((java.lang.String)__typeMapper.readString(__in, Is_a_Drug_Test_Required__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Job_Requirements__c__typeInfo)) {
      setJob_Requirements__c((java.lang.String)__typeMapper.readString(__in, Job_Requirements__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, LeadSource__typeInfo)) {
      setLeadSource((java.lang.String)__typeMapper.readString(__in, LeadSource__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Licenses_Certifications_Required__c__typeInfo)) {
      setLicenses_Certifications_Required__c((java.lang.String)__typeMapper.readString(__in, Licenses_Certifications_Required__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LookedUpFromActivities__typeInfo)) {
      setLookedUpFromActivities((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, LookedUpFromActivities__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MME__EmailMessages__r__typeInfo)) {
      setMME__EmailMessages__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, MME__EmailMessages__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Name__typeInfo)) {
      setName((java.lang.String)__typeMapper.readString(__in, Name__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, NextStep__typeInfo)) {
      setNextStep((java.lang.String)__typeMapper.readString(__in, NextStep__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, OpenActivities__typeInfo)) {
      setOpenActivities((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, OpenActivities__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OpportunityCompetitors__typeInfo)) {
      setOpportunityCompetitors((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, OpportunityCompetitors__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OpportunityContactRoles__typeInfo)) {
      setOpportunityContactRoles((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, OpportunityContactRoles__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OpportunityHistories__typeInfo)) {
      setOpportunityHistories((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, OpportunityHistories__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OpportunityLineItems__typeInfo)) {
      setOpportunityLineItems((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, OpportunityLineItems__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OpportunityPartnersFrom__typeInfo)) {
      setOpportunityPartnersFrom((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, OpportunityPartnersFrom__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Ops_Team_s_to_Assign__c__typeInfo)) {
      setOps_Team_s_to_Assign__c((java.lang.String)__typeMapper.readString(__in, Ops_Team_s_to_Assign__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Order_City__c__typeInfo)) {
      setOrder_City__c((java.lang.String)__typeMapper.readString(__in, Order_City__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Other_Special_Instructions__c__typeInfo)) {
      setOther_Special_Instructions__c((java.lang.String)__typeMapper.readString(__in, Other_Special_Instructions__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Partners__typeInfo)) {
      setPartners((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Partners__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Pay_Rate_s__c__typeInfo)) {
      setPay_Rate_s__c((java.lang.String)__typeMapper.readString(__in, Pay_Rate_s__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Per_Diem__c__typeInfo)) {
      setPer_Diem__c((java.lang.String)__typeMapper.readString(__in, Per_Diem__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Pre_Pay_Client__c__typeInfo)) {
      setPre_Pay_Client__c((java.lang.String)__typeMapper.readString(__in, Pre_Pay_Client__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Prevailing_Wage_Project__c__typeInfo)) {
      setPrevailing_Wage_Project__c((java.lang.String)__typeMapper.readString(__in, Prevailing_Wage_Project__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Prevailing_Wage__c__typeInfo)) {
      setPrevailing_Wage__c((java.lang.Boolean)__typeMapper.readObject(__in, Prevailing_Wage__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Pricebook2__typeInfo)) {
      setPricebook2((com.sforce.soap.enterprise.sobject.Pricebook2)__typeMapper.readObject(__in, Pricebook2__typeInfo, com.sforce.soap.enterprise.sobject.Pricebook2.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Pricebook2Id__typeInfo)) {
      setPricebook2Id((java.lang.String)__typeMapper.readString(__in, Pricebook2Id__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Probability__typeInfo)) {
      setProbability((java.lang.Double)__typeMapper.readObject(__in, Probability__typeInfo, java.lang.Double.class));
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
    if (__typeMapper.isElement(__in, Project_Contact__c__typeInfo)) {
      setProject_Contact__c((java.lang.String)__typeMapper.readString(__in, Project_Contact__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Project_GC_Address__c__typeInfo)) {
      setProject_GC_Address__c((java.lang.String)__typeMapper.readString(__in, Project_GC_Address__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Project_GC_Name__c__typeInfo)) {
      setProject_GC_Name__c((java.lang.String)__typeMapper.readString(__in, Project_GC_Name__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Project_Owner_Address__c__typeInfo)) {
      setProject_Owner_Address__c((java.lang.String)__typeMapper.readString(__in, Project_Owner_Address__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Project_Owner_Name__c__typeInfo)) {
      setProject_Owner_Name__c((java.lang.String)__typeMapper.readString(__in, Project_Owner_Name__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Project_Start_Date__c__typeInfo)) {
      setProject_Start_Date__c((java.util.Calendar)__typeMapper.readObject(__in, Project_Start_Date__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Public_Project__c__typeInfo)) {
      setPublic_Project__c((java.lang.Boolean)__typeMapper.readObject(__in, Public_Project__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Quotes__typeInfo)) {
      setQuotes((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Quotes__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RecordAssociatedGroups__typeInfo)) {
      setRecordAssociatedGroups((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, RecordAssociatedGroups__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Regional_Manager__c__typeInfo)) {
      setRegional_Manager__c((java.lang.String)__typeMapper.readString(__in, Regional_Manager__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Regional_Manager__r__typeInfo)) {
      setRegional_Manager__r((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, Regional_Manager__r__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Relocation_Assistance_Available__c__typeInfo)) {
      setRelocation_Assistance_Available__c((java.lang.String)__typeMapper.readString(__in, Relocation_Assistance_Available__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Remaining_EEs_Needed__c__typeInfo)) {
      setRemaining_EEs_Needed__c((java.lang.Double)__typeMapper.readObject(__in, Remaining_EEs_Needed__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Requested_Headcount__c__typeInfo)) {
      setRequested_Headcount__c((java.lang.Double)__typeMapper.readObject(__in, Requested_Headcount__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Requested_Start_Time__c__typeInfo)) {
      setRequested_Start_Time__c((java.lang.String)__typeMapper.readString(__in, Requested_Start_Time__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Required_Travel_for_Perm_Placement_Job__c__typeInfo)) {
      setRequired_Travel_for_Perm_Placement_Job__c((java.lang.Double)__typeMapper.readObject(__in, Required_Travel_for_Perm_Placement_Job__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, S4STEO__Transferring_History__c__typeInfo)) {
      setS4STEO__Transferring_History__c((java.lang.String)__typeMapper.readString(__in, S4STEO__Transferring_History__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Shares__typeInfo)) {
      setShares((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Shares__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Special_Appearance_Instructions__c__typeInfo)) {
      setSpecial_Appearance_Instructions__c((java.lang.String)__typeMapper.readString(__in, Special_Appearance_Instructions__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Special_Billing_Instructions__c__typeInfo)) {
      setSpecial_Billing_Instructions__c((java.lang.String)__typeMapper.readString(__in, Special_Billing_Instructions__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Special_Requirements__c__typeInfo)) {
      setSpecial_Requirements__c((java.lang.String)__typeMapper.readString(__in, Special_Requirements__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Special_Safety_Instructions__c__typeInfo)) {
      setSpecial_Safety_Instructions__c((java.lang.String)__typeMapper.readString(__in, Special_Safety_Instructions__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Special_Tools_Equipment_Instructions__c__typeInfo)) {
      setSpecial_Tools_Equipment_Instructions__c((java.lang.String)__typeMapper.readString(__in, Special_Tools_Equipment_Instructions__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Special_Travel_Instructions__c__typeInfo)) {
      setSpecial_Travel_Instructions__c((java.lang.String)__typeMapper.readString(__in, Special_Travel_Instructions__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, StageName__typeInfo)) {
      setStageName((java.lang.String)__typeMapper.readString(__in, StageName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SyncedQuote__typeInfo)) {
      setSyncedQuote((com.sforce.soap.enterprise.sobject.Quote)__typeMapper.readObject(__in, SyncedQuote__typeInfo, com.sforce.soap.enterprise.sobject.Quote.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SyncedQuoteId__typeInfo)) {
      setSyncedQuoteId((java.lang.String)__typeMapper.readString(__in, SyncedQuoteId__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Trade_and_WC_Code__c__typeInfo)) {
      setTrade_and_WC_Code__c((java.lang.String)__typeMapper.readString(__in, Trade_and_WC_Code__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Trade_s_Skill_Levels__c__typeInfo)) {
      setTrade_s_Skill_Levels__c((java.lang.String)__typeMapper.readString(__in, Trade_s_Skill_Levels__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Type__typeInfo)) {
      setType((java.lang.String)__typeMapper.readString(__in, Type__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Used_Management_Placement_Service_Before__c__typeInfo)) {
      setUsed_Management_Placement_Service_Before__c((java.lang.String)__typeMapper.readString(__in, Used_Management_Placement_Service_Before__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserRecordAccess__typeInfo)) {
      setUserRecordAccess((com.sforce.soap.enterprise.sobject.UserRecordAccess)__typeMapper.readObject(__in, UserRecordAccess__typeInfo, com.sforce.soap.enterprise.sobject.UserRecordAccess.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__VCSEmails__r__typeInfo)) {
      setVCSSAP__VCSEmails__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, VCSSAP__VCSEmails__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Work_State2__c__typeInfo)) {
      setWork_State2__c((java.lang.String)__typeMapper.readString(__in, Work_State2__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__R00N70000001hM2REAU__r__typeInfo)) {
      setEchosign_dev1__R00N70000001hM2REAU__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, echosign_dev1__R00N70000001hM2REAU__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__DaysSinceLastMail__c__typeInfo)) {
      setI__DaysSinceLastMail__c((java.lang.Double)__typeMapper.readObject(__in, i__DaysSinceLastMail__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__Emails__r__typeInfo)) {
      setI__Emails__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, i__Emails__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__LastInboundMail__c__typeInfo)) {
      setI__LastInboundMail__c((java.lang.String)__typeMapper.readString(__in, i__LastInboundMail__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__LastInboundMail__r__typeInfo)) {
      setI__LastInboundMail__r((com.sforce.soap.enterprise.sobject.I__Email__c)__typeMapper.readObject(__in, i__LastInboundMail__r__typeInfo, com.sforce.soap.enterprise.sobject.I__Email__c.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__LastInboundSent__c__typeInfo)) {
      setI__LastInboundSent__c((java.util.Calendar)__typeMapper.readObject(__in, i__LastInboundSent__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__LastInboundTime__c__typeInfo)) {
      setI__LastInboundTime__c((java.util.Calendar)__typeMapper.readObject(__in, i__LastInboundTime__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__LastMailSent__c__typeInfo)) {
      setI__LastMailSent__c((java.util.Calendar)__typeMapper.readObject(__in, i__LastMailSent__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__LastMailTimeDelta__c__typeInfo)) {
      setI__LastMailTimeDelta__c((java.lang.Double)__typeMapper.readObject(__in, i__LastMailTimeDelta__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__LastMailTime__c__typeInfo)) {
      setI__LastMailTime__c((java.util.Calendar)__typeMapper.readObject(__in, i__LastMailTime__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__LastMail__c__typeInfo)) {
      setI__LastMail__c((java.lang.String)__typeMapper.readString(__in, i__LastMail__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__LastMail__r__typeInfo)) {
      setI__LastMail__r((com.sforce.soap.enterprise.sobject.I__Email__c)__typeMapper.readObject(__in, i__LastMail__r__typeInfo, com.sforce.soap.enterprise.sobject.I__Email__c.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__LastOutboundMail__c__typeInfo)) {
      setI__LastOutboundMail__c((java.lang.String)__typeMapper.readString(__in, i__LastOutboundMail__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__LastOutboundMail__r__typeInfo)) {
      setI__LastOutboundMail__r((com.sforce.soap.enterprise.sobject.I__Email__c)__typeMapper.readObject(__in, i__LastOutboundMail__r__typeInfo, com.sforce.soap.enterprise.sobject.I__Email__c.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__LastOutboundSent__c__typeInfo)) {
      setI__LastOutboundSent__c((java.util.Calendar)__typeMapper.readObject(__in, i__LastOutboundSent__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__LastOutboundTime__c__typeInfo)) {
      setI__LastOutboundTime__c((java.util.Calendar)__typeMapper.readObject(__in, i__LastOutboundTime__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, webm__Webmerge_Documents__r__typeInfo)) {
      setWebm__Webmerge_Documents__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, webm__Webmerge_Documents__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[Opportunity ");
    sb.append(super.toString());
    sb.append(" Account=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Account)+"'\n");
    sb.append(" AccountId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AccountId)+"'\n");
    sb.append(" AccountPartners=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AccountPartners)+"'\n");
    sb.append(" ActivityHistories=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ActivityHistories)+"'\n");
    sb.append(" Actual_Duration_Period__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Actual_Duration_Period__c)+"'\n");
    sb.append(" Actual_Duration__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Actual_Duration__c)+"'\n");
    sb.append(" Actual_Headcount__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Actual_Headcount__c)+"'\n");
    sb.append(" Actual_Project_Duration__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Actual_Project_Duration__c)+"'\n");
    sb.append(" Actual_Project_End_Date__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Actual_Project_End_Date__c)+"'\n");
    sb.append(" Actual_Start_Date__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Actual_Start_Date__c)+"'\n");
    sb.append(" Actual_Start_Time__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Actual_Start_Time__c)+"'\n");
    sb.append(" Address_Location_of_Project__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Address_Location_of_Project__c)+"'\n");
    sb.append(" Amount=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Amount)+"'\n");
    sb.append(" AttachedContentDocuments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentDocuments)+"'\n");
    sb.append(" AttachedContentNotes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentNotes)+"'\n");
    sb.append(" Attachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Attachments)+"'\n");
    sb.append(" Bill_Rate_s__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Bill_Rate_s__c)+"'\n");
    sb.append(" Bonus_Amount__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Bonus_Amount__c)+"'\n");
    sb.append(" Bonus_Y_N__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Bonus_Y_N__c)+"'\n");
    sb.append(" Campaign=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Campaign)+"'\n");
    sb.append(" CampaignId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CampaignId)+"'\n");
    sb.append(" Check_Here_If_Background_Check_Required__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Check_Here_If_Background_Check_Required__c)+"'\n");
    sb.append(" Check_Here_If_Drug_Test_Required__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Check_Here_If_Drug_Test_Required__c)+"'\n");
    sb.append(" Client_Onwer_ID__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Client_Onwer_ID__c)+"'\n");
    sb.append(" CloseDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CloseDate)+"'\n");
    sb.append(" CombinedAttachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CombinedAttachments)+"'\n");
    sb.append(" Comments__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Comments__c)+"'\n");
    sb.append(" Contact_Lookup__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Contact_Lookup__c)+"'\n");
    sb.append(" Contact_Lookup__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Contact_Lookup__r)+"'\n");
    sb.append(" Contact_Owner__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Contact_Owner__c)+"'\n");
    sb.append(" ContentDocumentLinks=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContentDocumentLinks)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" Credit_Limit__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Credit_Limit__c)+"'\n");
    sb.append(" Credit_Rating__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Credit_Rating__c)+"'\n");
    sb.append(" Description=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Description)+"'\n");
    sb.append(" Emails=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Emails)+"'\n");
    sb.append(" Employee_Names_and_Notes__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Employee_Names_and_Notes__c)+"'\n");
    sb.append(" Estimated_Duration_Days__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Estimated_Duration_Days__c)+"'\n");
    sb.append(" Estimated_Project_End_Date__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Estimated_Project_End_Date__c)+"'\n");
    sb.append(" EventRelations=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EventRelations)+"'\n");
    sb.append(" Events=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Events)+"'\n");
    sb.append(" Fee_Agreement_Sent__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Fee_Agreement_Sent__c)+"'\n");
    sb.append(" Fee_Agreement_Signed__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Fee_Agreement_Signed__c)+"'\n");
    sb.append(" FeedSubscriptionsForEntity=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FeedSubscriptionsForEntity)+"'\n");
    sb.append(" Feeds=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Feeds)+"'\n");
    sb.append(" Fiscal=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Fiscal)+"'\n");
    sb.append(" FiscalQuarter=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FiscalQuarter)+"'\n");
    sb.append(" FiscalYear=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FiscalYear)+"'\n");
    sb.append(" ForecastCategory=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ForecastCategory)+"'\n");
    sb.append(" ForecastCategoryName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ForecastCategoryName)+"'\n");
    sb.append(" Global_s_Take_of_GP__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Global_s_Take_of_GP__c)+"'\n");
    sb.append(" HasOpenActivity=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(HasOpenActivity)+"'\n");
    sb.append(" HasOpportunityLineItem=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(HasOpportunityLineItem)+"'\n");
    sb.append(" HasOverdueTask=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(HasOverdueTask)+"'\n");
    sb.append(" Histories=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Histories)+"'\n");
    sb.append(" If_Background_Ck_required_is_it_BILLED__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(If_Background_Ck_required_is_it_BILLED__c)+"'\n");
    sb.append(" If_Drug_Test_required_is_it_BILLED__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(If_Drug_Test_required_is_it_BILLED__c)+"'\n");
    sb.append(" IsClosed=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsClosed)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" IsWon=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsWon)+"'\n");
    sb.append(" Is_a_Background_Check_Required__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Is_a_Background_Check_Required__c)+"'\n");
    sb.append(" Is_a_Drug_Test_Required__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Is_a_Drug_Test_Required__c)+"'\n");
    sb.append(" Job_Requirements__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Job_Requirements__c)+"'\n");
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
    sb.append(" LeadSource=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LeadSource)+"'\n");
    sb.append(" Licenses_Certifications_Required__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Licenses_Certifications_Required__c)+"'\n");
    sb.append(" LookedUpFromActivities=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LookedUpFromActivities)+"'\n");
    sb.append(" MME__EmailMessages__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MME__EmailMessages__r)+"'\n");
    sb.append(" Name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");
    sb.append(" NextStep=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NextStep)+"'\n");
    sb.append(" Notes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Notes)+"'\n");
    sb.append(" NotesAndAttachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NotesAndAttachments)+"'\n");
    sb.append(" OpenActivities=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OpenActivities)+"'\n");
    sb.append(" OpportunityCompetitors=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OpportunityCompetitors)+"'\n");
    sb.append(" OpportunityContactRoles=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OpportunityContactRoles)+"'\n");
    sb.append(" OpportunityHistories=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OpportunityHistories)+"'\n");
    sb.append(" OpportunityLineItems=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OpportunityLineItems)+"'\n");
    sb.append(" OpportunityPartnersFrom=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OpportunityPartnersFrom)+"'\n");
    sb.append(" Ops_Team_s_to_Assign__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Ops_Team_s_to_Assign__c)+"'\n");
    sb.append(" Order_City__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Order_City__c)+"'\n");
    sb.append(" Other_Special_Instructions__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Other_Special_Instructions__c)+"'\n");
    sb.append(" Owner=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Owner)+"'\n");
    sb.append(" OwnerId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OwnerId)+"'\n");
    sb.append(" Partners=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Partners)+"'\n");
    sb.append(" Pay_Rate_s__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Pay_Rate_s__c)+"'\n");
    sb.append(" Per_Diem__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Per_Diem__c)+"'\n");
    sb.append(" Pre_Pay_Client__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Pre_Pay_Client__c)+"'\n");
    sb.append(" Prevailing_Wage_Project__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Prevailing_Wage_Project__c)+"'\n");
    sb.append(" Prevailing_Wage__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Prevailing_Wage__c)+"'\n");
    sb.append(" Pricebook2=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Pricebook2)+"'\n");
    sb.append(" Pricebook2Id=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Pricebook2Id)+"'\n");
    sb.append(" Probability=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Probability)+"'\n");
    sb.append(" ProcessInstances=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessInstances)+"'\n");
    sb.append(" ProcessSteps=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessSteps)+"'\n");
    sb.append(" Project_Contact__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Project_Contact__c)+"'\n");
    sb.append(" Project_GC_Address__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Project_GC_Address__c)+"'\n");
    sb.append(" Project_GC_Name__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Project_GC_Name__c)+"'\n");
    sb.append(" Project_Owner_Address__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Project_Owner_Address__c)+"'\n");
    sb.append(" Project_Owner_Name__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Project_Owner_Name__c)+"'\n");
    sb.append(" Project_Start_Date__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Project_Start_Date__c)+"'\n");
    sb.append(" Public_Project__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Public_Project__c)+"'\n");
    sb.append(" Quotes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Quotes)+"'\n");
    sb.append(" RecordAssociatedGroups=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecordAssociatedGroups)+"'\n");
    sb.append(" Regional_Manager__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Regional_Manager__c)+"'\n");
    sb.append(" Regional_Manager__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Regional_Manager__r)+"'\n");
    sb.append(" Relocation_Assistance_Available__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Relocation_Assistance_Available__c)+"'\n");
    sb.append(" Remaining_EEs_Needed__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Remaining_EEs_Needed__c)+"'\n");
    sb.append(" Requested_Headcount__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Requested_Headcount__c)+"'\n");
    sb.append(" Requested_Start_Time__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Requested_Start_Time__c)+"'\n");
    sb.append(" Required_Travel_for_Perm_Placement_Job__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Required_Travel_for_Perm_Placement_Job__c)+"'\n");
    sb.append(" S4STEO__Transferring_History__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(S4STEO__Transferring_History__c)+"'\n");
    sb.append(" Shares=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Shares)+"'\n");
    sb.append(" Special_Appearance_Instructions__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Special_Appearance_Instructions__c)+"'\n");
    sb.append(" Special_Billing_Instructions__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Special_Billing_Instructions__c)+"'\n");
    sb.append(" Special_Requirements__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Special_Requirements__c)+"'\n");
    sb.append(" Special_Safety_Instructions__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Special_Safety_Instructions__c)+"'\n");
    sb.append(" Special_Tools_Equipment_Instructions__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Special_Tools_Equipment_Instructions__c)+"'\n");
    sb.append(" Special_Travel_Instructions__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Special_Travel_Instructions__c)+"'\n");
    sb.append(" StageName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(StageName)+"'\n");
    sb.append(" SyncedQuote=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SyncedQuote)+"'\n");
    sb.append(" SyncedQuoteId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SyncedQuoteId)+"'\n");
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
    sb.append(" Trade_and_WC_Code__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Trade_and_WC_Code__c)+"'\n");
    sb.append(" Trade_s_Skill_Levels__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Trade_s_Skill_Levels__c)+"'\n");
    sb.append(" Type=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Type)+"'\n");
    sb.append(" Used_Management_Placement_Service_Before__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Used_Management_Placement_Service_Before__c)+"'\n");
    sb.append(" UserRecordAccess=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserRecordAccess)+"'\n");
    sb.append(" VCSSAP__VCSEmails__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__VCSEmails__r)+"'\n");
    sb.append(" Work_State2__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Work_State2__c)+"'\n");
    sb.append(" echosign_dev1__R00N70000001hM2REAU__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__R00N70000001hM2REAU__r)+"'\n");
    sb.append(" i__DaysSinceLastMail__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__DaysSinceLastMail__c)+"'\n");
    sb.append(" i__Emails__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__Emails__r)+"'\n");
    sb.append(" i__LastInboundMail__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__LastInboundMail__c)+"'\n");
    sb.append(" i__LastInboundMail__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__LastInboundMail__r)+"'\n");
    sb.append(" i__LastInboundSent__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__LastInboundSent__c)+"'\n");
    sb.append(" i__LastInboundTime__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__LastInboundTime__c)+"'\n");
    sb.append(" i__LastMailSent__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__LastMailSent__c)+"'\n");
    sb.append(" i__LastMailTimeDelta__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__LastMailTimeDelta__c)+"'\n");
    sb.append(" i__LastMailTime__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__LastMailTime__c)+"'\n");
    sb.append(" i__LastMail__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__LastMail__c)+"'\n");
    sb.append(" i__LastMail__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__LastMail__r)+"'\n");
    sb.append(" i__LastOutboundMail__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__LastOutboundMail__c)+"'\n");
    sb.append(" i__LastOutboundMail__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__LastOutboundMail__r)+"'\n");
    sb.append(" i__LastOutboundSent__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__LastOutboundSent__c)+"'\n");
    sb.append(" i__LastOutboundTime__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__LastOutboundTime__c)+"'\n");
    sb.append(" webm__Webmerge_Documents__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(webm__Webmerge_Documents__r)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}