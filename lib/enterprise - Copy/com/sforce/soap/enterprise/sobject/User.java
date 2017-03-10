package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class User extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public User() {
  }
    
  
  /**
   * element  : AboutMe of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AboutMe__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AboutMe","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean AboutMe__is_set = false;

  private java.lang.String AboutMe;

  public java.lang.String getAboutMe() {
    return AboutMe;
  }

  

  public void setAboutMe(java.lang.String AboutMe) {
    this.AboutMe = AboutMe;
    AboutMe__is_set = true;
  }
  
  /**
   * element  : AcceptedEventRelations of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo AcceptedEventRelations__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AcceptedEventRelations","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean AcceptedEventRelations__is_set = false;

  private com.sforce.soap.enterprise.QueryResult AcceptedEventRelations;

  public com.sforce.soap.enterprise.QueryResult getAcceptedEventRelations() {
    return AcceptedEventRelations;
  }

  

  public void setAcceptedEventRelations(com.sforce.soap.enterprise.QueryResult AcceptedEventRelations) {
    this.AcceptedEventRelations = AcceptedEventRelations;
    AcceptedEventRelations__is_set = true;
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
   * element  : Accounts__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Accounts__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Accounts__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Accounts__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Accounts__r;

  public com.sforce.soap.enterprise.QueryResult getAccounts__r() {
    return Accounts__r;
  }

  

  public void setAccounts__r(com.sforce.soap.enterprise.QueryResult Accounts__r) {
    this.Accounts__r = Accounts__r;
    Accounts__r__is_set = true;
  }
  
  /**
   * element  : Address of type {urn:enterprise.soap.sforce.com}address
   * java type: com.sforce.soap.enterprise.Address
   */
  private static final com.sforce.ws.bind.TypeInfo Address__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Address","urn:enterprise.soap.sforce.com","address",0,1,true);

  private boolean Address__is_set = false;

  private com.sforce.soap.enterprise.Address Address;

  public com.sforce.soap.enterprise.Address getAddress() {
    return Address;
  }

  

  public void setAddress(com.sforce.soap.enterprise.Address Address) {
    this.Address = Address;
    Address__is_set = true;
  }
  
  /**
   * element  : Admin_Employees__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Admin_Employees__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Admin_Employees__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Admin_Employees__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Admin_Employees__r;

  public com.sforce.soap.enterprise.QueryResult getAdmin_Employees__r() {
    return Admin_Employees__r;
  }

  

  public void setAdmin_Employees__r(com.sforce.soap.enterprise.QueryResult Admin_Employees__r) {
    this.Admin_Employees__r = Admin_Employees__r;
    Admin_Employees__r__is_set = true;
  }
  
  /**
   * element  : Alias of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Alias__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Alias","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Alias__is_set = false;

  private java.lang.String Alias;

  public java.lang.String getAlias() {
    return Alias;
  }

  

  public void setAlias(java.lang.String Alias) {
    this.Alias = Alias;
    Alias__is_set = true;
  }
  
  /**
   * element  : Applicants__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Applicants__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Applicants__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Applicants__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Applicants__r;

  public com.sforce.soap.enterprise.QueryResult getApplicants__r() {
    return Applicants__r;
  }

  

  public void setApplicants__r(com.sforce.soap.enterprise.QueryResult Applicants__r) {
    this.Applicants__r = Applicants__r;
    Applicants__r__is_set = true;
  }
  
  /**
   * element  : Assignments1__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Assignments1__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Assignments1__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Assignments1__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Assignments1__r;

  public com.sforce.soap.enterprise.QueryResult getAssignments1__r() {
    return Assignments1__r;
  }

  

  public void setAssignments1__r(com.sforce.soap.enterprise.QueryResult Assignments1__r) {
    this.Assignments1__r = Assignments1__r;
    Assignments1__r__is_set = true;
  }
  
  /**
   * element  : Assignments2__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Assignments2__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Assignments2__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Assignments2__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Assignments2__r;

  public com.sforce.soap.enterprise.QueryResult getAssignments2__r() {
    return Assignments2__r;
  }

  

  public void setAssignments2__r(com.sforce.soap.enterprise.QueryResult Assignments2__r) {
    this.Assignments2__r = Assignments2__r;
    Assignments2__r__is_set = true;
  }
  
  /**
   * element  : Assignments__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Assignments__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Assignments__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Assignments__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Assignments__r;

  public com.sforce.soap.enterprise.QueryResult getAssignments__r() {
    return Assignments__r;
  }

  

  public void setAssignments__r(com.sforce.soap.enterprise.QueryResult Assignments__r) {
    this.Assignments__r = Assignments__r;
    Assignments__r__is_set = true;
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
   * element  : BadgeText of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo BadgeText__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","BadgeText","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean BadgeText__is_set = false;

  private java.lang.String BadgeText;

  public java.lang.String getBadgeText() {
    return BadgeText;
  }

  

  public void setBadgeText(java.lang.String BadgeText) {
    this.BadgeText = BadgeText;
    BadgeText__is_set = true;
  }
  
  /**
   * element  : Badges of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Badges__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Badges","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Badges__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Badges;

  public com.sforce.soap.enterprise.QueryResult getBadges() {
    return Badges;
  }

  

  public void setBadges(com.sforce.soap.enterprise.QueryResult Badges) {
    this.Badges = Badges;
    Badges__is_set = true;
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
   * element  : Budgets_and_Actuals__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Budgets_and_Actuals__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Budgets_and_Actuals__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Budgets_and_Actuals__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Budgets_and_Actuals__r;

  public com.sforce.soap.enterprise.QueryResult getBudgets_and_Actuals__r() {
    return Budgets_and_Actuals__r;
  }

  

  public void setBudgets_and_Actuals__r(com.sforce.soap.enterprise.QueryResult Budgets_and_Actuals__r) {
    this.Budgets_and_Actuals__r = Budgets_and_Actuals__r;
    Budgets_and_Actuals__r__is_set = true;
  }
  
  /**
   * element  : Business_Services1__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Business_Services1__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Business_Services1__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Business_Services1__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Business_Services1__r;

  public com.sforce.soap.enterprise.QueryResult getBusiness_Services1__r() {
    return Business_Services1__r;
  }

  

  public void setBusiness_Services1__r(com.sforce.soap.enterprise.QueryResult Business_Services1__r) {
    this.Business_Services1__r = Business_Services1__r;
    Business_Services1__r__is_set = true;
  }
  
  /**
   * element  : Business_Services__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Business_Services__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Business_Services__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Business_Services__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Business_Services__r;

  public com.sforce.soap.enterprise.QueryResult getBusiness_Services__r() {
    return Business_Services__r;
  }

  

  public void setBusiness_Services__r(com.sforce.soap.enterprise.QueryResult Business_Services__r) {
    this.Business_Services__r = Business_Services__r;
    Business_Services__r__is_set = true;
  }
  
  /**
   * element  : CallCenterId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CallCenterId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CallCenterId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean CallCenterId__is_set = false;

  private java.lang.String CallCenterId;

  public java.lang.String getCallCenterId() {
    return CallCenterId;
  }

  

  public void setCallCenterId(java.lang.String CallCenterId) {
    this.CallCenterId = CallCenterId;
    CallCenterId__is_set = true;
  }
  
  /**
   * element  : Candidate_Geocodes__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Candidate_Geocodes__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Candidate_Geocodes__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Candidate_Geocodes__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Candidate_Geocodes__r;

  public com.sforce.soap.enterprise.QueryResult getCandidate_Geocodes__r() {
    return Candidate_Geocodes__r;
  }

  

  public void setCandidate_Geocodes__r(com.sforce.soap.enterprise.QueryResult Candidate_Geocodes__r) {
    this.Candidate_Geocodes__r = Candidate_Geocodes__r;
    Candidate_Geocodes__r__is_set = true;
  }
  
  /**
   * element  : Case_Swarm_Rules__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Case_Swarm_Rules__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Case_Swarm_Rules__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Case_Swarm_Rules__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Case_Swarm_Rules__r;

  public com.sforce.soap.enterprise.QueryResult getCase_Swarm_Rules__r() {
    return Case_Swarm_Rules__r;
  }

  

  public void setCase_Swarm_Rules__r(com.sforce.soap.enterprise.QueryResult Case_Swarm_Rules__r) {
    this.Case_Swarm_Rules__r = Case_Swarm_Rules__r;
    Case_Swarm_Rules__r__is_set = true;
  }
  
  /**
   * element  : Cases__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Cases__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Cases__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Cases__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Cases__r;

  public com.sforce.soap.enterprise.QueryResult getCases__r() {
    return Cases__r;
  }

  

  public void setCases__r(com.sforce.soap.enterprise.QueryResult Cases__r) {
    this.Cases__r = Cases__r;
    Cases__r__is_set = true;
  }
  
  /**
   * element  : City of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo City__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","City","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean City__is_set = false;

  private java.lang.String City;

  public java.lang.String getCity() {
    return City;
  }

  

  public void setCity(java.lang.String City) {
    this.City = City;
    City__is_set = true;
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
   * element  : CommunityNickname of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CommunityNickname__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CommunityNickname","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean CommunityNickname__is_set = false;

  private java.lang.String CommunityNickname;

  public java.lang.String getCommunityNickname() {
    return CommunityNickname;
  }

  

  public void setCommunityNickname(java.lang.String CommunityNickname) {
    this.CommunityNickname = CommunityNickname;
    CommunityNickname__is_set = true;
  }
  
  /**
   * element  : CompanyName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CompanyName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CompanyName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean CompanyName__is_set = false;

  private java.lang.String CompanyName;

  public java.lang.String getCompanyName() {
    return CompanyName;
  }

  

  public void setCompanyName(java.lang.String CompanyName) {
    this.CompanyName = CompanyName;
    CompanyName__is_set = true;
  }
  
  /**
   * element  : Consultant_ID__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Consultant_ID__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Consultant_ID__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Consultant_ID__c__is_set = false;

  private java.lang.String Consultant_ID__c;

  public java.lang.String getConsultant_ID__c() {
    return Consultant_ID__c;
  }

  

  public void setConsultant_ID__c(java.lang.String Consultant_ID__c) {
    this.Consultant_ID__c = Consultant_ID__c;
    Consultant_ID__c__is_set = true;
  }
  
  /**
   * element  : Contact of type {urn:sobject.enterprise.soap.sforce.com}Contact
   * java type: com.sforce.soap.enterprise.sobject.Contact
   */
  private static final com.sforce.ws.bind.TypeInfo Contact__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Contact","urn:sobject.enterprise.soap.sforce.com","Contact",0,1,true);

  private boolean Contact__is_set = false;

  private com.sforce.soap.enterprise.sobject.Contact Contact;

  public com.sforce.soap.enterprise.sobject.Contact getContact() {
    return Contact;
  }

  

  public void setContact(com.sforce.soap.enterprise.sobject.Contact Contact) {
    this.Contact = Contact;
    Contact__is_set = true;
  }
  
  /**
   * element  : ContactId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ContactId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ContactId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ContactId__is_set = false;

  private java.lang.String ContactId;

  public java.lang.String getContactId() {
    return ContactId;
  }

  

  public void setContactId(java.lang.String ContactId) {
    this.ContactId = ContactId;
    ContactId__is_set = true;
  }
  
  /**
   * element  : Contacts__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Contacts__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Contacts__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Contacts__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Contacts__r;

  public com.sforce.soap.enterprise.QueryResult getContacts__r() {
    return Contacts__r;
  }

  

  public void setContacts__r(com.sforce.soap.enterprise.QueryResult Contacts__r) {
    this.Contacts__r = Contacts__r;
    Contacts__r__is_set = true;
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
   * element  : ContractsSigned of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo ContractsSigned__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ContractsSigned","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean ContractsSigned__is_set = false;

  private com.sforce.soap.enterprise.QueryResult ContractsSigned;

  public com.sforce.soap.enterprise.QueryResult getContractsSigned() {
    return ContractsSigned;
  }

  

  public void setContractsSigned(com.sforce.soap.enterprise.QueryResult ContractsSigned) {
    this.ContractsSigned = ContractsSigned;
    ContractsSigned__is_set = true;
  }
  
  /**
   * element  : Country of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Country__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Country","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Country__is_set = false;

  private java.lang.String Country;

  public java.lang.String getCountry() {
    return Country;
  }

  

  public void setCountry(java.lang.String Country) {
    this.Country = Country;
    Country__is_set = true;
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
   * element  : DeclinedEventRelations of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo DeclinedEventRelations__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DeclinedEventRelations","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean DeclinedEventRelations__is_set = false;

  private com.sforce.soap.enterprise.QueryResult DeclinedEventRelations;

  public com.sforce.soap.enterprise.QueryResult getDeclinedEventRelations() {
    return DeclinedEventRelations;
  }

  

  public void setDeclinedEventRelations(com.sforce.soap.enterprise.QueryResult DeclinedEventRelations) {
    this.DeclinedEventRelations = DeclinedEventRelations;
    DeclinedEventRelations__is_set = true;
  }
  
  /**
   * element  : DefaultGroupNotificationFrequency of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo DefaultGroupNotificationFrequency__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DefaultGroupNotificationFrequency","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean DefaultGroupNotificationFrequency__is_set = false;

  private java.lang.String DefaultGroupNotificationFrequency;

  public java.lang.String getDefaultGroupNotificationFrequency() {
    return DefaultGroupNotificationFrequency;
  }

  

  public void setDefaultGroupNotificationFrequency(java.lang.String DefaultGroupNotificationFrequency) {
    this.DefaultGroupNotificationFrequency = DefaultGroupNotificationFrequency;
    DefaultGroupNotificationFrequency__is_set = true;
  }
  
  /**
   * element  : DelegatedApproverId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo DelegatedApproverId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DelegatedApproverId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean DelegatedApproverId__is_set = false;

  private java.lang.String DelegatedApproverId;

  public java.lang.String getDelegatedApproverId() {
    return DelegatedApproverId;
  }

  

  public void setDelegatedApproverId(java.lang.String DelegatedApproverId) {
    this.DelegatedApproverId = DelegatedApproverId;
    DelegatedApproverId__is_set = true;
  }
  
  /**
   * element  : DelegatedUsers of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo DelegatedUsers__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DelegatedUsers","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean DelegatedUsers__is_set = false;

  private com.sforce.soap.enterprise.QueryResult DelegatedUsers;

  public com.sforce.soap.enterprise.QueryResult getDelegatedUsers() {
    return DelegatedUsers;
  }

  

  public void setDelegatedUsers(com.sforce.soap.enterprise.QueryResult DelegatedUsers) {
    this.DelegatedUsers = DelegatedUsers;
    DelegatedUsers__is_set = true;
  }
  
  /**
   * element  : Department of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Department__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Department","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Department__is_set = false;

  private java.lang.String Department;

  public java.lang.String getDepartment() {
    return Department;
  }

  

  public void setDepartment(java.lang.String Department) {
    this.Department = Department;
    Department__is_set = true;
  }
  
  /**
   * element  : DigestFrequency of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo DigestFrequency__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DigestFrequency","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean DigestFrequency__is_set = false;

  private java.lang.String DigestFrequency;

  public java.lang.String getDigestFrequency() {
    return DigestFrequency;
  }

  

  public void setDigestFrequency(java.lang.String DigestFrequency) {
    this.DigestFrequency = DigestFrequency;
    DigestFrequency__is_set = true;
  }
  
  /**
   * element  : Division of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Division__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Division","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Division__is_set = false;

  private java.lang.String Division;

  public java.lang.String getDivision() {
    return Division;
  }

  

  public void setDivision(java.lang.String Division) {
    this.Division = Division;
    Division__is_set = true;
  }
  
  /**
   * element  : Email of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Email__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Email","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Email__is_set = false;

  private java.lang.String Email;

  public java.lang.String getEmail() {
    return Email;
  }

  

  public void setEmail(java.lang.String Email) {
    this.Email = Email;
    Email__is_set = true;
  }
  
  /**
   * element  : EmailEncodingKey of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo EmailEncodingKey__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","EmailEncodingKey","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean EmailEncodingKey__is_set = false;

  private java.lang.String EmailEncodingKey;

  public java.lang.String getEmailEncodingKey() {
    return EmailEncodingKey;
  }

  

  public void setEmailEncodingKey(java.lang.String EmailEncodingKey) {
    this.EmailEncodingKey = EmailEncodingKey;
    EmailEncodingKey__is_set = true;
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
   * element  : EmailPreferencesAutoBcc of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo EmailPreferencesAutoBcc__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","EmailPreferencesAutoBcc","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean EmailPreferencesAutoBcc__is_set = false;

  private java.lang.Boolean EmailPreferencesAutoBcc;

  public java.lang.Boolean getEmailPreferencesAutoBcc() {
    return EmailPreferencesAutoBcc;
  }

  

  public void setEmailPreferencesAutoBcc(java.lang.Boolean EmailPreferencesAutoBcc) {
    this.EmailPreferencesAutoBcc = EmailPreferencesAutoBcc;
    EmailPreferencesAutoBcc__is_set = true;
  }
  
  /**
   * element  : EmailPreferencesAutoBccStayInTouch of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo EmailPreferencesAutoBccStayInTouch__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","EmailPreferencesAutoBccStayInTouch","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean EmailPreferencesAutoBccStayInTouch__is_set = false;

  private java.lang.Boolean EmailPreferencesAutoBccStayInTouch;

  public java.lang.Boolean getEmailPreferencesAutoBccStayInTouch() {
    return EmailPreferencesAutoBccStayInTouch;
  }

  

  public void setEmailPreferencesAutoBccStayInTouch(java.lang.Boolean EmailPreferencesAutoBccStayInTouch) {
    this.EmailPreferencesAutoBccStayInTouch = EmailPreferencesAutoBccStayInTouch;
    EmailPreferencesAutoBccStayInTouch__is_set = true;
  }
  
  /**
   * element  : EmailPreferencesStayInTouchReminder of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo EmailPreferencesStayInTouchReminder__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","EmailPreferencesStayInTouchReminder","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean EmailPreferencesStayInTouchReminder__is_set = false;

  private java.lang.Boolean EmailPreferencesStayInTouchReminder;

  public java.lang.Boolean getEmailPreferencesStayInTouchReminder() {
    return EmailPreferencesStayInTouchReminder;
  }

  

  public void setEmailPreferencesStayInTouchReminder(java.lang.Boolean EmailPreferencesStayInTouchReminder) {
    this.EmailPreferencesStayInTouchReminder = EmailPreferencesStayInTouchReminder;
    EmailPreferencesStayInTouchReminder__is_set = true;
  }
  
  /**
   * element  : EmployeeNumber of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo EmployeeNumber__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","EmployeeNumber","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean EmployeeNumber__is_set = false;

  private java.lang.String EmployeeNumber;

  public java.lang.String getEmployeeNumber() {
    return EmployeeNumber;
  }

  

  public void setEmployeeNumber(java.lang.String EmployeeNumber) {
    this.EmployeeNumber = EmployeeNumber;
    EmployeeNumber__is_set = true;
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
   * element  : Extension of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Extension__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Extension","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Extension__is_set = false;

  private java.lang.String Extension;

  public java.lang.String getExtension() {
    return Extension;
  }

  

  public void setExtension(java.lang.String Extension) {
    this.Extension = Extension;
    Extension__is_set = true;
  }
  
  /**
   * element  : ExternalDataUserAuths of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo ExternalDataUserAuths__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ExternalDataUserAuths","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean ExternalDataUserAuths__is_set = false;

  private com.sforce.soap.enterprise.QueryResult ExternalDataUserAuths;

  public com.sforce.soap.enterprise.QueryResult getExternalDataUserAuths() {
    return ExternalDataUserAuths;
  }

  

  public void setExternalDataUserAuths(com.sforce.soap.enterprise.QueryResult ExternalDataUserAuths) {
    this.ExternalDataUserAuths = ExternalDataUserAuths;
    ExternalDataUserAuths__is_set = true;
  }
  
  /**
   * element  : Fax of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Fax__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Fax","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Fax__is_set = false;

  private java.lang.String Fax;

  public java.lang.String getFax() {
    return Fax;
  }

  

  public void setFax(java.lang.String Fax) {
    this.Fax = Fax;
    Fax__is_set = true;
  }
  
  /**
   * element  : FederationIdentifier of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo FederationIdentifier__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FederationIdentifier","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean FederationIdentifier__is_set = false;

  private java.lang.String FederationIdentifier;

  public java.lang.String getFederationIdentifier() {
    return FederationIdentifier;
  }

  

  public void setFederationIdentifier(java.lang.String FederationIdentifier) {
    this.FederationIdentifier = FederationIdentifier;
    FederationIdentifier__is_set = true;
  }
  
  /**
   * element  : FeedSubscriptions of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo FeedSubscriptions__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FeedSubscriptions","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean FeedSubscriptions__is_set = false;

  private com.sforce.soap.enterprise.QueryResult FeedSubscriptions;

  public com.sforce.soap.enterprise.QueryResult getFeedSubscriptions() {
    return FeedSubscriptions;
  }

  

  public void setFeedSubscriptions(com.sforce.soap.enterprise.QueryResult FeedSubscriptions) {
    this.FeedSubscriptions = FeedSubscriptions;
    FeedSubscriptions__is_set = true;
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
   * element  : Feed_Post_Swarm_Rules__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Feed_Post_Swarm_Rules__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Feed_Post_Swarm_Rules__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Feed_Post_Swarm_Rules__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Feed_Post_Swarm_Rules__r;

  public com.sforce.soap.enterprise.QueryResult getFeed_Post_Swarm_Rules__r() {
    return Feed_Post_Swarm_Rules__r;
  }

  

  public void setFeed_Post_Swarm_Rules__r(com.sforce.soap.enterprise.QueryResult Feed_Post_Swarm_Rules__r) {
    this.Feed_Post_Swarm_Rules__r = Feed_Post_Swarm_Rules__r;
    Feed_Post_Swarm_Rules__r__is_set = true;
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
   * element  : FirstName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo FirstName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FirstName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean FirstName__is_set = false;

  private java.lang.String FirstName;

  public java.lang.String getFirstName() {
    return FirstName;
  }

  

  public void setFirstName(java.lang.String FirstName) {
    this.FirstName = FirstName;
    FirstName__is_set = true;
  }
  
  /**
   * element  : ForecastEnabled of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo ForecastEnabled__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ForecastEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean ForecastEnabled__is_set = false;

  private java.lang.Boolean ForecastEnabled;

  public java.lang.Boolean getForecastEnabled() {
    return ForecastEnabled;
  }

  

  public void setForecastEnabled(java.lang.Boolean ForecastEnabled) {
    this.ForecastEnabled = ForecastEnabled;
    ForecastEnabled__is_set = true;
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
   * element  : GeocodeAccuracy of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo GeocodeAccuracy__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","GeocodeAccuracy","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean GeocodeAccuracy__is_set = false;

  private java.lang.String GeocodeAccuracy;

  public java.lang.String getGeocodeAccuracy() {
    return GeocodeAccuracy;
  }

  

  public void setGeocodeAccuracy(java.lang.String GeocodeAccuracy) {
    this.GeocodeAccuracy = GeocodeAccuracy;
    GeocodeAccuracy__is_set = true;
  }
  
  /**
   * element  : GivenThanks of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo GivenThanks__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","GivenThanks","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean GivenThanks__is_set = false;

  private com.sforce.soap.enterprise.QueryResult GivenThanks;

  public com.sforce.soap.enterprise.QueryResult getGivenThanks() {
    return GivenThanks;
  }

  

  public void setGivenThanks(com.sforce.soap.enterprise.QueryResult GivenThanks) {
    this.GivenThanks = GivenThanks;
    GivenThanks__is_set = true;
  }
  
  /**
   * element  : GroupMembershipRequests of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo GroupMembershipRequests__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","GroupMembershipRequests","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean GroupMembershipRequests__is_set = false;

  private com.sforce.soap.enterprise.QueryResult GroupMembershipRequests;

  public com.sforce.soap.enterprise.QueryResult getGroupMembershipRequests() {
    return GroupMembershipRequests;
  }

  

  public void setGroupMembershipRequests(com.sforce.soap.enterprise.QueryResult GroupMembershipRequests) {
    this.GroupMembershipRequests = GroupMembershipRequests;
    GroupMembershipRequests__is_set = true;
  }
  
  /**
   * element  : GroupMemberships of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo GroupMemberships__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","GroupMemberships","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean GroupMemberships__is_set = false;

  private com.sforce.soap.enterprise.QueryResult GroupMemberships;

  public com.sforce.soap.enterprise.QueryResult getGroupMemberships() {
    return GroupMemberships;
  }

  

  public void setGroupMemberships(com.sforce.soap.enterprise.QueryResult GroupMemberships) {
    this.GroupMemberships = GroupMemberships;
    GroupMemberships__is_set = true;
  }
  
  /**
   * element  : InstalledMobileApps of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo InstalledMobileApps__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","InstalledMobileApps","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean InstalledMobileApps__is_set = false;

  private com.sforce.soap.enterprise.QueryResult InstalledMobileApps;

  public com.sforce.soap.enterprise.QueryResult getInstalledMobileApps() {
    return InstalledMobileApps;
  }

  

  public void setInstalledMobileApps(com.sforce.soap.enterprise.QueryResult InstalledMobileApps) {
    this.InstalledMobileApps = InstalledMobileApps;
    InstalledMobileApps__is_set = true;
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
   * element  : IsPortalEnabled of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsPortalEnabled__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsPortalEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsPortalEnabled__is_set = false;

  private java.lang.Boolean IsPortalEnabled;

  public java.lang.Boolean getIsPortalEnabled() {
    return IsPortalEnabled;
  }

  

  public void setIsPortalEnabled(java.lang.Boolean IsPortalEnabled) {
    this.IsPortalEnabled = IsPortalEnabled;
    IsPortalEnabled__is_set = true;
  }
  
  /**
   * element  : IsProfilePhotoActive of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsProfilePhotoActive__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsProfilePhotoActive","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsProfilePhotoActive__is_set = false;

  private java.lang.Boolean IsProfilePhotoActive;

  public java.lang.Boolean getIsProfilePhotoActive() {
    return IsProfilePhotoActive;
  }

  

  public void setIsProfilePhotoActive(java.lang.Boolean IsProfilePhotoActive) {
    this.IsProfilePhotoActive = IsProfilePhotoActive;
    IsProfilePhotoActive__is_set = true;
  }
  
  /**
   * element  : LanguageLocaleKey of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LanguageLocaleKey__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LanguageLocaleKey","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean LanguageLocaleKey__is_set = false;

  private java.lang.String LanguageLocaleKey;

  public java.lang.String getLanguageLocaleKey() {
    return LanguageLocaleKey;
  }

  

  public void setLanguageLocaleKey(java.lang.String LanguageLocaleKey) {
    this.LanguageLocaleKey = LanguageLocaleKey;
    LanguageLocaleKey__is_set = true;
  }
  
  /**
   * element  : LastLoginDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo LastLoginDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastLoginDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean LastLoginDate__is_set = false;

  private java.util.Calendar LastLoginDate;

  public java.util.Calendar getLastLoginDate() {
    return LastLoginDate;
  }

  

  public void setLastLoginDate(java.util.Calendar LastLoginDate) {
    this.LastLoginDate = LastLoginDate;
    LastLoginDate__is_set = true;
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
   * element  : LastName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LastName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean LastName__is_set = false;

  private java.lang.String LastName;

  public java.lang.String getLastName() {
    return LastName;
  }

  

  public void setLastName(java.lang.String LastName) {
    this.LastName = LastName;
    LastName__is_set = true;
  }
  
  /**
   * element  : LastPasswordChangeDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo LastPasswordChangeDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastPasswordChangeDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean LastPasswordChangeDate__is_set = false;

  private java.util.Calendar LastPasswordChangeDate;

  public java.util.Calendar getLastPasswordChangeDate() {
    return LastPasswordChangeDate;
  }

  

  public void setLastPasswordChangeDate(java.util.Calendar LastPasswordChangeDate) {
    this.LastPasswordChangeDate = LastPasswordChangeDate;
    LastPasswordChangeDate__is_set = true;
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
   * element  : Latitude of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Latitude__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Latitude","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Latitude__is_set = false;

  private java.lang.Double Latitude;

  public java.lang.Double getLatitude() {
    return Latitude;
  }

  

  public void setLatitude(java.lang.Double Latitude) {
    this.Latitude = Latitude;
    Latitude__is_set = true;
  }
  
  /**
   * element  : Lead_Swarm_Rules__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Lead_Swarm_Rules__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Lead_Swarm_Rules__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Lead_Swarm_Rules__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Lead_Swarm_Rules__r;

  public com.sforce.soap.enterprise.QueryResult getLead_Swarm_Rules__r() {
    return Lead_Swarm_Rules__r;
  }

  

  public void setLead_Swarm_Rules__r(com.sforce.soap.enterprise.QueryResult Lead_Swarm_Rules__r) {
    this.Lead_Swarm_Rules__r = Lead_Swarm_Rules__r;
    Lead_Swarm_Rules__r__is_set = true;
  }
  
  /**
   * element  : LocaleSidKey of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LocaleSidKey__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LocaleSidKey","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean LocaleSidKey__is_set = false;

  private java.lang.String LocaleSidKey;

  public java.lang.String getLocaleSidKey() {
    return LocaleSidKey;
  }

  

  public void setLocaleSidKey(java.lang.String LocaleSidKey) {
    this.LocaleSidKey = LocaleSidKey;
    LocaleSidKey__is_set = true;
  }
  
  /**
   * element  : Longitude of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Longitude__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Longitude","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Longitude__is_set = false;

  private java.lang.Double Longitude;

  public java.lang.Double getLongitude() {
    return Longitude;
  }

  

  public void setLongitude(java.lang.Double Longitude) {
    this.Longitude = Longitude;
    Longitude__is_set = true;
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
   * element  : ManagedUsers of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo ManagedUsers__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ManagedUsers","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean ManagedUsers__is_set = false;

  private com.sforce.soap.enterprise.QueryResult ManagedUsers;

  public com.sforce.soap.enterprise.QueryResult getManagedUsers() {
    return ManagedUsers;
  }

  

  public void setManagedUsers(com.sforce.soap.enterprise.QueryResult ManagedUsers) {
    this.ManagedUsers = ManagedUsers;
    ManagedUsers__is_set = true;
  }
  
  /**
   * element  : Manager of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo Manager__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Manager","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean Manager__is_set = false;

  private com.sforce.soap.enterprise.sobject.User Manager;

  public com.sforce.soap.enterprise.sobject.User getManager() {
    return Manager;
  }

  

  public void setManager(com.sforce.soap.enterprise.sobject.User Manager) {
    this.Manager = Manager;
    Manager__is_set = true;
  }
  
  /**
   * element  : ManagerId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ManagerId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ManagerId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ManagerId__is_set = false;

  private java.lang.String ManagerId;

  public java.lang.String getManagerId() {
    return ManagerId;
  }

  

  public void setManagerId(java.lang.String ManagerId) {
    this.ManagerId = ManagerId;
    ManagerId__is_set = true;
  }
  
  /**
   * element  : MediumBannerPhotoUrl of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo MediumBannerPhotoUrl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MediumBannerPhotoUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean MediumBannerPhotoUrl__is_set = false;

  private java.lang.String MediumBannerPhotoUrl;

  public java.lang.String getMediumBannerPhotoUrl() {
    return MediumBannerPhotoUrl;
  }

  

  public void setMediumBannerPhotoUrl(java.lang.String MediumBannerPhotoUrl) {
    this.MediumBannerPhotoUrl = MediumBannerPhotoUrl;
    MediumBannerPhotoUrl__is_set = true;
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
   * element  : MobilePhone of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo MobilePhone__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MobilePhone","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean MobilePhone__is_set = false;

  private java.lang.String MobilePhone;

  public java.lang.String getMobilePhone() {
    return MobilePhone;
  }

  

  public void setMobilePhone(java.lang.String MobilePhone) {
    this.MobilePhone = MobilePhone;
    MobilePhone__is_set = true;
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
   * element  : OfflinePdaTrialExpirationDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo OfflinePdaTrialExpirationDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OfflinePdaTrialExpirationDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean OfflinePdaTrialExpirationDate__is_set = false;

  private java.util.Calendar OfflinePdaTrialExpirationDate;

  public java.util.Calendar getOfflinePdaTrialExpirationDate() {
    return OfflinePdaTrialExpirationDate;
  }

  

  public void setOfflinePdaTrialExpirationDate(java.util.Calendar OfflinePdaTrialExpirationDate) {
    this.OfflinePdaTrialExpirationDate = OfflinePdaTrialExpirationDate;
    OfflinePdaTrialExpirationDate__is_set = true;
  }
  
  /**
   * element  : OfflineTrialExpirationDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo OfflineTrialExpirationDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OfflineTrialExpirationDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean OfflineTrialExpirationDate__is_set = false;

  private java.util.Calendar OfflineTrialExpirationDate;

  public java.util.Calendar getOfflineTrialExpirationDate() {
    return OfflineTrialExpirationDate;
  }

  

  public void setOfflineTrialExpirationDate(java.util.Calendar OfflineTrialExpirationDate) {
    this.OfflineTrialExpirationDate = OfflineTrialExpirationDate;
    OfflineTrialExpirationDate__is_set = true;
  }
  
  /**
   * element  : Opportunities__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Opportunities__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Opportunities__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Opportunities__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Opportunities__r;

  public com.sforce.soap.enterprise.QueryResult getOpportunities__r() {
    return Opportunities__r;
  }

  

  public void setOpportunities__r(com.sforce.soap.enterprise.QueryResult Opportunities__r) {
    this.Opportunities__r = Opportunities__r;
    Opportunities__r__is_set = true;
  }
  
  /**
   * element  : Opportunity_Swarm_Rules__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Opportunity_Swarm_Rules__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Opportunity_Swarm_Rules__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Opportunity_Swarm_Rules__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Opportunity_Swarm_Rules__r;

  public com.sforce.soap.enterprise.QueryResult getOpportunity_Swarm_Rules__r() {
    return Opportunity_Swarm_Rules__r;
  }

  

  public void setOpportunity_Swarm_Rules__r(com.sforce.soap.enterprise.QueryResult Opportunity_Swarm_Rules__r) {
    this.Opportunity_Swarm_Rules__r = Opportunity_Swarm_Rules__r;
    Opportunity_Swarm_Rules__r__is_set = true;
  }
  
  /**
   * element  : Order_Swarm_Rules__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Order_Swarm_Rules__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Order_Swarm_Rules__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Order_Swarm_Rules__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Order_Swarm_Rules__r;

  public com.sforce.soap.enterprise.QueryResult getOrder_Swarm_Rules__r() {
    return Order_Swarm_Rules__r;
  }

  

  public void setOrder_Swarm_Rules__r(com.sforce.soap.enterprise.QueryResult Order_Swarm_Rules__r) {
    this.Order_Swarm_Rules__r = Order_Swarm_Rules__r;
    Order_Swarm_Rules__r__is_set = true;
  }
  
  /**
   * element  : Orders1__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Orders1__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Orders1__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Orders1__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Orders1__r;

  public com.sforce.soap.enterprise.QueryResult getOrders1__r() {
    return Orders1__r;
  }

  

  public void setOrders1__r(com.sforce.soap.enterprise.QueryResult Orders1__r) {
    this.Orders1__r = Orders1__r;
    Orders1__r__is_set = true;
  }
  
  /**
   * element  : Orders2__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Orders2__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Orders2__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Orders2__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Orders2__r;

  public com.sforce.soap.enterprise.QueryResult getOrders2__r() {
    return Orders2__r;
  }

  

  public void setOrders2__r(com.sforce.soap.enterprise.QueryResult Orders2__r) {
    this.Orders2__r = Orders2__r;
    Orders2__r__is_set = true;
  }
  
  /**
   * element  : Orders3__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Orders3__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Orders3__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Orders3__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Orders3__r;

  public com.sforce.soap.enterprise.QueryResult getOrders3__r() {
    return Orders3__r;
  }

  

  public void setOrders3__r(com.sforce.soap.enterprise.QueryResult Orders3__r) {
    this.Orders3__r = Orders3__r;
    Orders3__r__is_set = true;
  }
  
  /**
   * element  : Orders4__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Orders4__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Orders4__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Orders4__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Orders4__r;

  public com.sforce.soap.enterprise.QueryResult getOrders4__r() {
    return Orders4__r;
  }

  

  public void setOrders4__r(com.sforce.soap.enterprise.QueryResult Orders4__r) {
    this.Orders4__r = Orders4__r;
    Orders4__r__is_set = true;
  }
  
  /**
   * element  : Orders5__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Orders5__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Orders5__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Orders5__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Orders5__r;

  public com.sforce.soap.enterprise.QueryResult getOrders5__r() {
    return Orders5__r;
  }

  

  public void setOrders5__r(com.sforce.soap.enterprise.QueryResult Orders5__r) {
    this.Orders5__r = Orders5__r;
    Orders5__r__is_set = true;
  }
  
  /**
   * element  : Orders__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Orders__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Orders__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Orders__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Orders__r;

  public com.sforce.soap.enterprise.QueryResult getOrders__r() {
    return Orders__r;
  }

  

  public void setOrders__r(com.sforce.soap.enterprise.QueryResult Orders__r) {
    this.Orders__r = Orders__r;
    Orders__r__is_set = true;
  }
  
  /**
   * element  : OwnedContentDocuments of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo OwnedContentDocuments__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OwnedContentDocuments","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean OwnedContentDocuments__is_set = false;

  private com.sforce.soap.enterprise.QueryResult OwnedContentDocuments;

  public com.sforce.soap.enterprise.QueryResult getOwnedContentDocuments() {
    return OwnedContentDocuments;
  }

  

  public void setOwnedContentDocuments(com.sforce.soap.enterprise.QueryResult OwnedContentDocuments) {
    this.OwnedContentDocuments = OwnedContentDocuments;
    OwnedContentDocuments__is_set = true;
  }
  
  /**
   * element  : PermissionSetAssignments of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionSetAssignments__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionSetAssignments","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean PermissionSetAssignments__is_set = false;

  private com.sforce.soap.enterprise.QueryResult PermissionSetAssignments;

  public com.sforce.soap.enterprise.QueryResult getPermissionSetAssignments() {
    return PermissionSetAssignments;
  }

  

  public void setPermissionSetAssignments(com.sforce.soap.enterprise.QueryResult PermissionSetAssignments) {
    this.PermissionSetAssignments = PermissionSetAssignments;
    PermissionSetAssignments__is_set = true;
  }
  
  /**
   * element  : PermissionSetLicenseAssignments of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionSetLicenseAssignments__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionSetLicenseAssignments","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean PermissionSetLicenseAssignments__is_set = false;

  private com.sforce.soap.enterprise.QueryResult PermissionSetLicenseAssignments;

  public com.sforce.soap.enterprise.QueryResult getPermissionSetLicenseAssignments() {
    return PermissionSetLicenseAssignments;
  }

  

  public void setPermissionSetLicenseAssignments(com.sforce.soap.enterprise.QueryResult PermissionSetLicenseAssignments) {
    this.PermissionSetLicenseAssignments = PermissionSetLicenseAssignments;
    PermissionSetLicenseAssignments__is_set = true;
  }
  
  /**
   * element  : Phone of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Phone__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Phone","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Phone__is_set = false;

  private java.lang.String Phone;

  public java.lang.String getPhone() {
    return Phone;
  }

  

  public void setPhone(java.lang.String Phone) {
    this.Phone = Phone;
    Phone__is_set = true;
  }
  
  /**
   * element  : PortalRole of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo PortalRole__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PortalRole","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean PortalRole__is_set = false;

  private java.lang.String PortalRole;

  public java.lang.String getPortalRole() {
    return PortalRole;
  }

  

  public void setPortalRole(java.lang.String PortalRole) {
    this.PortalRole = PortalRole;
    PortalRole__is_set = true;
  }
  
  /**
   * element  : PostalCode of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo PostalCode__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PostalCode","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean PostalCode__is_set = false;

  private java.lang.String PostalCode;

  public java.lang.String getPostalCode() {
    return PostalCode;
  }

  

  public void setPostalCode(java.lang.String PostalCode) {
    this.PostalCode = PostalCode;
    PostalCode__is_set = true;
  }
  
  /**
   * element  : Profile of type {urn:sobject.enterprise.soap.sforce.com}Profile
   * java type: com.sforce.soap.enterprise.sobject.Profile
   */
  private static final com.sforce.ws.bind.TypeInfo Profile__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Profile","urn:sobject.enterprise.soap.sforce.com","Profile",0,1,true);

  private boolean Profile__is_set = false;

  private com.sforce.soap.enterprise.sobject.Profile Profile;

  public com.sforce.soap.enterprise.sobject.Profile getProfile() {
    return Profile;
  }

  

  public void setProfile(com.sforce.soap.enterprise.sobject.Profile Profile) {
    this.Profile = Profile;
    Profile__is_set = true;
  }
  
  /**
   * element  : ProfileId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ProfileId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ProfileId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ProfileId__is_set = false;

  private java.lang.String ProfileId;

  public java.lang.String getProfileId() {
    return ProfileId;
  }

  

  public void setProfileId(java.lang.String ProfileId) {
    this.ProfileId = ProfileId;
    ProfileId__is_set = true;
  }
  
  /**
   * element  : Proxy__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Proxy__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Proxy__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Proxy__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Proxy__r;

  public com.sforce.soap.enterprise.QueryResult getProxy__r() {
    return Proxy__r;
  }

  

  public void setProxy__r(com.sforce.soap.enterprise.QueryResult Proxy__r) {
    this.Proxy__r = Proxy__r;
    Proxy__r__is_set = true;
  }
  
  /**
   * element  : QuestionSubscriptions of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo QuestionSubscriptions__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","QuestionSubscriptions","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean QuestionSubscriptions__is_set = false;

  private com.sforce.soap.enterprise.QueryResult QuestionSubscriptions;

  public com.sforce.soap.enterprise.QueryResult getQuestionSubscriptions() {
    return QuestionSubscriptions;
  }

  

  public void setQuestionSubscriptions(com.sforce.soap.enterprise.QueryResult QuestionSubscriptions) {
    this.QuestionSubscriptions = QuestionSubscriptions;
    QuestionSubscriptions__is_set = true;
  }
  
  /**
   * element  : R00N30000001eUPVEA2__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo R00N30000001eUPVEA2__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","R00N30000001eUPVEA2__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean R00N30000001eUPVEA2__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult R00N30000001eUPVEA2__r;

  public com.sforce.soap.enterprise.QueryResult getR00N30000001eUPVEA2__r() {
    return R00N30000001eUPVEA2__r;
  }

  

  public void setR00N30000001eUPVEA2__r(com.sforce.soap.enterprise.QueryResult R00N30000001eUPVEA2__r) {
    this.R00N30000001eUPVEA2__r = R00N30000001eUPVEA2__r;
    R00N30000001eUPVEA2__r__is_set = true;
  }
  
  /**
   * element  : ReceivesAdminInfoEmails of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo ReceivesAdminInfoEmails__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ReceivesAdminInfoEmails","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean ReceivesAdminInfoEmails__is_set = false;

  private java.lang.Boolean ReceivesAdminInfoEmails;

  public java.lang.Boolean getReceivesAdminInfoEmails() {
    return ReceivesAdminInfoEmails;
  }

  

  public void setReceivesAdminInfoEmails(java.lang.Boolean ReceivesAdminInfoEmails) {
    this.ReceivesAdminInfoEmails = ReceivesAdminInfoEmails;
    ReceivesAdminInfoEmails__is_set = true;
  }
  
  /**
   * element  : ReceivesInfoEmails of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo ReceivesInfoEmails__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ReceivesInfoEmails","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean ReceivesInfoEmails__is_set = false;

  private java.lang.Boolean ReceivesInfoEmails;

  public java.lang.Boolean getReceivesInfoEmails() {
    return ReceivesInfoEmails;
  }

  

  public void setReceivesInfoEmails(java.lang.Boolean ReceivesInfoEmails) {
    this.ReceivesInfoEmails = ReceivesInfoEmails;
    ReceivesInfoEmails__is_set = true;
  }
  
  /**
   * element  : Regions1__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Regions1__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Regions1__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Regions1__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Regions1__r;

  public com.sforce.soap.enterprise.QueryResult getRegions1__r() {
    return Regions1__r;
  }

  

  public void setRegions1__r(com.sforce.soap.enterprise.QueryResult Regions1__r) {
    this.Regions1__r = Regions1__r;
    Regions1__r__is_set = true;
  }
  
  /**
   * element  : Regions2__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Regions2__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Regions2__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Regions2__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Regions2__r;

  public com.sforce.soap.enterprise.QueryResult getRegions2__r() {
    return Regions2__r;
  }

  

  public void setRegions2__r(com.sforce.soap.enterprise.QueryResult Regions2__r) {
    this.Regions2__r = Regions2__r;
    Regions2__r__is_set = true;
  }
  
  /**
   * element  : Regions__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Regions__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Regions__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Regions__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Regions__r;

  public com.sforce.soap.enterprise.QueryResult getRegions__r() {
    return Regions__r;
  }

  

  public void setRegions__r(com.sforce.soap.enterprise.QueryResult Regions__r) {
    this.Regions__r = Regions__r;
    Regions__r__is_set = true;
  }
  
  /**
   * element  : Revenues1__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Revenues1__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Revenues1__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Revenues1__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Revenues1__r;

  public com.sforce.soap.enterprise.QueryResult getRevenues1__r() {
    return Revenues1__r;
  }

  

  public void setRevenues1__r(com.sforce.soap.enterprise.QueryResult Revenues1__r) {
    this.Revenues1__r = Revenues1__r;
    Revenues1__r__is_set = true;
  }
  
  /**
   * element  : Revenues__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Revenues__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Revenues__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Revenues__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Revenues__r;

  public com.sforce.soap.enterprise.QueryResult getRevenues__r() {
    return Revenues__r;
  }

  

  public void setRevenues__r(com.sforce.soap.enterprise.QueryResult Revenues__r) {
    this.Revenues__r = Revenues__r;
    Revenues__r__is_set = true;
  }
  
  /**
   * element  : Rogue_Payment_Objects__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Rogue_Payment_Objects__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Rogue_Payment_Objects__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Rogue_Payment_Objects__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Rogue_Payment_Objects__r;

  public com.sforce.soap.enterprise.QueryResult getRogue_Payment_Objects__r() {
    return Rogue_Payment_Objects__r;
  }

  

  public void setRogue_Payment_Objects__r(com.sforce.soap.enterprise.QueryResult Rogue_Payment_Objects__r) {
    this.Rogue_Payment_Objects__r = Rogue_Payment_Objects__r;
    Rogue_Payment_Objects__r__is_set = true;
  }
  
  /**
   * element  : S4STEO__TransferOwnersNewOwner__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo S4STEO__TransferOwnersNewOwner__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","S4STEO__TransferOwnersNewOwner__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean S4STEO__TransferOwnersNewOwner__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult S4STEO__TransferOwnersNewOwner__r;

  public com.sforce.soap.enterprise.QueryResult getS4STEO__TransferOwnersNewOwner__r() {
    return S4STEO__TransferOwnersNewOwner__r;
  }

  

  public void setS4STEO__TransferOwnersNewOwner__r(com.sforce.soap.enterprise.QueryResult S4STEO__TransferOwnersNewOwner__r) {
    this.S4STEO__TransferOwnersNewOwner__r = S4STEO__TransferOwnersNewOwner__r;
    S4STEO__TransferOwnersNewOwner__r__is_set = true;
  }
  
  /**
   * element  : S4STEO__TransferOwnersOldOwner__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo S4STEO__TransferOwnersOldOwner__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","S4STEO__TransferOwnersOldOwner__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean S4STEO__TransferOwnersOldOwner__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult S4STEO__TransferOwnersOldOwner__r;

  public com.sforce.soap.enterprise.QueryResult getS4STEO__TransferOwnersOldOwner__r() {
    return S4STEO__TransferOwnersOldOwner__r;
  }

  

  public void setS4STEO__TransferOwnersOldOwner__r(com.sforce.soap.enterprise.QueryResult S4STEO__TransferOwnersOldOwner__r) {
    this.S4STEO__TransferOwnersOldOwner__r = S4STEO__TransferOwnersOldOwner__r;
    S4STEO__TransferOwnersOldOwner__r__is_set = true;
  }
  
  /**
   * element  : Safety_Actions__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Safety_Actions__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Safety_Actions__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Safety_Actions__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Safety_Actions__r;

  public com.sforce.soap.enterprise.QueryResult getSafety_Actions__r() {
    return Safety_Actions__r;
  }

  

  public void setSafety_Actions__r(com.sforce.soap.enterprise.QueryResult Safety_Actions__r) {
    this.Safety_Actions__r = Safety_Actions__r;
    Safety_Actions__r__is_set = true;
  }
  
  /**
   * element  : SenderEmail of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo SenderEmail__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SenderEmail","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean SenderEmail__is_set = false;

  private java.lang.String SenderEmail;

  public java.lang.String getSenderEmail() {
    return SenderEmail;
  }

  

  public void setSenderEmail(java.lang.String SenderEmail) {
    this.SenderEmail = SenderEmail;
    SenderEmail__is_set = true;
  }
  
  /**
   * element  : SenderName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo SenderName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SenderName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean SenderName__is_set = false;

  private java.lang.String SenderName;

  public java.lang.String getSenderName() {
    return SenderName;
  }

  

  public void setSenderName(java.lang.String SenderName) {
    this.SenderName = SenderName;
    SenderName__is_set = true;
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
   * element  : Signature of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Signature__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Signature","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Signature__is_set = false;

  private java.lang.String Signature;

  public java.lang.String getSignature() {
    return Signature;
  }

  

  public void setSignature(java.lang.String Signature) {
    this.Signature = Signature;
    Signature__is_set = true;
  }
  
  /**
   * element  : SmallBannerPhotoUrl of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo SmallBannerPhotoUrl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SmallBannerPhotoUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean SmallBannerPhotoUrl__is_set = false;

  private java.lang.String SmallBannerPhotoUrl;

  public java.lang.String getSmallBannerPhotoUrl() {
    return SmallBannerPhotoUrl;
  }

  

  public void setSmallBannerPhotoUrl(java.lang.String SmallBannerPhotoUrl) {
    this.SmallBannerPhotoUrl = SmallBannerPhotoUrl;
    SmallBannerPhotoUrl__is_set = true;
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
   * element  : State of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo State__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","State","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean State__is_set = false;

  private java.lang.String State;

  public java.lang.String getState() {
    return State;
  }

  

  public void setState(java.lang.String State) {
    this.State = State;
    State__is_set = true;
  }
  
  /**
   * element  : StayInTouchNote of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo StayInTouchNote__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","StayInTouchNote","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean StayInTouchNote__is_set = false;

  private java.lang.String StayInTouchNote;

  public java.lang.String getStayInTouchNote() {
    return StayInTouchNote;
  }

  

  public void setStayInTouchNote(java.lang.String StayInTouchNote) {
    this.StayInTouchNote = StayInTouchNote;
    StayInTouchNote__is_set = true;
  }
  
  /**
   * element  : StayInTouchSignature of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo StayInTouchSignature__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","StayInTouchSignature","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean StayInTouchSignature__is_set = false;

  private java.lang.String StayInTouchSignature;

  public java.lang.String getStayInTouchSignature() {
    return StayInTouchSignature;
  }

  

  public void setStayInTouchSignature(java.lang.String StayInTouchSignature) {
    this.StayInTouchSignature = StayInTouchSignature;
    StayInTouchSignature__is_set = true;
  }
  
  /**
   * element  : StayInTouchSubject of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo StayInTouchSubject__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","StayInTouchSubject","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean StayInTouchSubject__is_set = false;

  private java.lang.String StayInTouchSubject;

  public java.lang.String getStayInTouchSubject() {
    return StayInTouchSubject;
  }

  

  public void setStayInTouchSubject(java.lang.String StayInTouchSubject) {
    this.StayInTouchSubject = StayInTouchSubject;
    StayInTouchSubject__is_set = true;
  }
  
  /**
   * element  : Street of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Street__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Street","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Street__is_set = false;

  private java.lang.String Street;

  public java.lang.String getStreet() {
    return Street;
  }

  

  public void setStreet(java.lang.String Street) {
    this.Street = Street;
    Street__is_set = true;
  }
  
  /**
   * element  : Surveys__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Surveys__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Surveys__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Surveys__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Surveys__r;

  public com.sforce.soap.enterprise.QueryResult getSurveys__r() {
    return Surveys__r;
  }

  

  public void setSurveys__r(com.sforce.soap.enterprise.QueryResult Surveys__r) {
    this.Surveys__r = Surveys__r;
    Surveys__r__is_set = true;
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
   * element  : TimeZoneSidKey of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo TimeZoneSidKey__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TimeZoneSidKey","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean TimeZoneSidKey__is_set = false;

  private java.lang.String TimeZoneSidKey;

  public java.lang.String getTimeZoneSidKey() {
    return TimeZoneSidKey;
  }

  

  public void setTimeZoneSidKey(java.lang.String TimeZoneSidKey) {
    this.TimeZoneSidKey = TimeZoneSidKey;
    TimeZoneSidKey__is_set = true;
  }
  
  /**
   * element  : TimesheetsSubmitted__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo TimesheetsSubmitted__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TimesheetsSubmitted__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean TimesheetsSubmitted__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult TimesheetsSubmitted__r;

  public com.sforce.soap.enterprise.QueryResult getTimesheetsSubmitted__r() {
    return TimesheetsSubmitted__r;
  }

  

  public void setTimesheetsSubmitted__r(com.sforce.soap.enterprise.QueryResult TimesheetsSubmitted__r) {
    this.TimesheetsSubmitted__r = TimesheetsSubmitted__r;
    TimesheetsSubmitted__r__is_set = true;
  }
  
  /**
   * element  : Timesheets__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Timesheets__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Timesheets__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Timesheets__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Timesheets__r;

  public com.sforce.soap.enterprise.QueryResult getTimesheets__r() {
    return Timesheets__r;
  }

  

  public void setTimesheets__r(com.sforce.soap.enterprise.QueryResult Timesheets__r) {
    this.Timesheets__r = Timesheets__r;
    Timesheets__r__is_set = true;
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
   * element  : Training_Participants__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Training_Participants__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Training_Participants__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Training_Participants__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Training_Participants__r;

  public com.sforce.soap.enterprise.QueryResult getTraining_Participants__r() {
    return Training_Participants__r;
  }

  

  public void setTraining_Participants__r(com.sforce.soap.enterprise.QueryResult Training_Participants__r) {
    this.Training_Participants__r = Training_Participants__r;
    Training_Participants__r__is_set = true;
  }
  
  /**
   * element  : USERHISTORY__User_History_Changed_By__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo USERHISTORY__User_History_Changed_By__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","USERHISTORY__User_History_Changed_By__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean USERHISTORY__User_History_Changed_By__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult USERHISTORY__User_History_Changed_By__r;

  public com.sforce.soap.enterprise.QueryResult getUSERHISTORY__User_History_Changed_By__r() {
    return USERHISTORY__User_History_Changed_By__r;
  }

  

  public void setUSERHISTORY__User_History_Changed_By__r(com.sforce.soap.enterprise.QueryResult USERHISTORY__User_History_Changed_By__r) {
    this.USERHISTORY__User_History_Changed_By__r = USERHISTORY__User_History_Changed_By__r;
    USERHISTORY__User_History_Changed_By__r__is_set = true;
  }
  
  /**
   * element  : USERHISTORY__User_History_User__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo USERHISTORY__User_History_User__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","USERHISTORY__User_History_User__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean USERHISTORY__User_History_User__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult USERHISTORY__User_History_User__r;

  public com.sforce.soap.enterprise.QueryResult getUSERHISTORY__User_History_User__r() {
    return USERHISTORY__User_History_User__r;
  }

  

  public void setUSERHISTORY__User_History_User__r(com.sforce.soap.enterprise.QueryResult USERHISTORY__User_History_User__r) {
    this.USERHISTORY__User_History_User__r = USERHISTORY__User_History_User__r;
    USERHISTORY__User_History_User__r__is_set = true;
  }
  
  /**
   * element  : UndecidedEventRelations of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo UndecidedEventRelations__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UndecidedEventRelations","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean UndecidedEventRelations__is_set = false;

  private com.sforce.soap.enterprise.QueryResult UndecidedEventRelations;

  public com.sforce.soap.enterprise.QueryResult getUndecidedEventRelations() {
    return UndecidedEventRelations;
  }

  

  public void setUndecidedEventRelations(com.sforce.soap.enterprise.QueryResult UndecidedEventRelations) {
    this.UndecidedEventRelations = UndecidedEventRelations;
    UndecidedEventRelations__is_set = true;
  }
  
  /**
   * element  : Unverified_Time__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Unverified_Time__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Unverified_Time__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Unverified_Time__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Unverified_Time__r;

  public com.sforce.soap.enterprise.QueryResult getUnverified_Time__r() {
    return Unverified_Time__r;
  }

  

  public void setUnverified_Time__r(com.sforce.soap.enterprise.QueryResult Unverified_Time__r) {
    this.Unverified_Time__r = Unverified_Time__r;
    Unverified_Time__r__is_set = true;
  }
  
  /**
   * element  : UserEntityAccessRights of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo UserEntityAccessRights__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserEntityAccessRights","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean UserEntityAccessRights__is_set = false;

  private com.sforce.soap.enterprise.QueryResult UserEntityAccessRights;

  public com.sforce.soap.enterprise.QueryResult getUserEntityAccessRights() {
    return UserEntityAccessRights;
  }

  

  public void setUserEntityAccessRights(com.sforce.soap.enterprise.QueryResult UserEntityAccessRights) {
    this.UserEntityAccessRights = UserEntityAccessRights;
    UserEntityAccessRights__is_set = true;
  }
  
  /**
   * element  : UserFieldAccessRights of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo UserFieldAccessRights__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserFieldAccessRights","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean UserFieldAccessRights__is_set = false;

  private com.sforce.soap.enterprise.QueryResult UserFieldAccessRights;

  public com.sforce.soap.enterprise.QueryResult getUserFieldAccessRights() {
    return UserFieldAccessRights;
  }

  

  public void setUserFieldAccessRights(com.sforce.soap.enterprise.QueryResult UserFieldAccessRights) {
    this.UserFieldAccessRights = UserFieldAccessRights;
    UserFieldAccessRights__is_set = true;
  }
  
  /**
   * element  : UserPermissionsAvantgoUser of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPermissionsAvantgoUser__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPermissionsAvantgoUser","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPermissionsAvantgoUser__is_set = false;

  private java.lang.Boolean UserPermissionsAvantgoUser;

  public java.lang.Boolean getUserPermissionsAvantgoUser() {
    return UserPermissionsAvantgoUser;
  }

  

  public void setUserPermissionsAvantgoUser(java.lang.Boolean UserPermissionsAvantgoUser) {
    this.UserPermissionsAvantgoUser = UserPermissionsAvantgoUser;
    UserPermissionsAvantgoUser__is_set = true;
  }
  
  /**
   * element  : UserPermissionsCallCenterAutoLogin of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPermissionsCallCenterAutoLogin__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPermissionsCallCenterAutoLogin","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPermissionsCallCenterAutoLogin__is_set = false;

  private java.lang.Boolean UserPermissionsCallCenterAutoLogin;

  public java.lang.Boolean getUserPermissionsCallCenterAutoLogin() {
    return UserPermissionsCallCenterAutoLogin;
  }

  

  public void setUserPermissionsCallCenterAutoLogin(java.lang.Boolean UserPermissionsCallCenterAutoLogin) {
    this.UserPermissionsCallCenterAutoLogin = UserPermissionsCallCenterAutoLogin;
    UserPermissionsCallCenterAutoLogin__is_set = true;
  }
  
  /**
   * element  : UserPermissionsChatterAnswersUser of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPermissionsChatterAnswersUser__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPermissionsChatterAnswersUser","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPermissionsChatterAnswersUser__is_set = false;

  private java.lang.Boolean UserPermissionsChatterAnswersUser;

  public java.lang.Boolean getUserPermissionsChatterAnswersUser() {
    return UserPermissionsChatterAnswersUser;
  }

  

  public void setUserPermissionsChatterAnswersUser(java.lang.Boolean UserPermissionsChatterAnswersUser) {
    this.UserPermissionsChatterAnswersUser = UserPermissionsChatterAnswersUser;
    UserPermissionsChatterAnswersUser__is_set = true;
  }
  
  /**
   * element  : UserPermissionsInteractionUser of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPermissionsInteractionUser__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPermissionsInteractionUser","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPermissionsInteractionUser__is_set = false;

  private java.lang.Boolean UserPermissionsInteractionUser;

  public java.lang.Boolean getUserPermissionsInteractionUser() {
    return UserPermissionsInteractionUser;
  }

  

  public void setUserPermissionsInteractionUser(java.lang.Boolean UserPermissionsInteractionUser) {
    this.UserPermissionsInteractionUser = UserPermissionsInteractionUser;
    UserPermissionsInteractionUser__is_set = true;
  }
  
  /**
   * element  : UserPermissionsKnowledgeUser of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPermissionsKnowledgeUser__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPermissionsKnowledgeUser","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPermissionsKnowledgeUser__is_set = false;

  private java.lang.Boolean UserPermissionsKnowledgeUser;

  public java.lang.Boolean getUserPermissionsKnowledgeUser() {
    return UserPermissionsKnowledgeUser;
  }

  

  public void setUserPermissionsKnowledgeUser(java.lang.Boolean UserPermissionsKnowledgeUser) {
    this.UserPermissionsKnowledgeUser = UserPermissionsKnowledgeUser;
    UserPermissionsKnowledgeUser__is_set = true;
  }
  
  /**
   * element  : UserPermissionsMarketingUser of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPermissionsMarketingUser__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPermissionsMarketingUser","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPermissionsMarketingUser__is_set = false;

  private java.lang.Boolean UserPermissionsMarketingUser;

  public java.lang.Boolean getUserPermissionsMarketingUser() {
    return UserPermissionsMarketingUser;
  }

  

  public void setUserPermissionsMarketingUser(java.lang.Boolean UserPermissionsMarketingUser) {
    this.UserPermissionsMarketingUser = UserPermissionsMarketingUser;
    UserPermissionsMarketingUser__is_set = true;
  }
  
  /**
   * element  : UserPermissionsMobileUser of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPermissionsMobileUser__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPermissionsMobileUser","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPermissionsMobileUser__is_set = false;

  private java.lang.Boolean UserPermissionsMobileUser;

  public java.lang.Boolean getUserPermissionsMobileUser() {
    return UserPermissionsMobileUser;
  }

  

  public void setUserPermissionsMobileUser(java.lang.Boolean UserPermissionsMobileUser) {
    this.UserPermissionsMobileUser = UserPermissionsMobileUser;
    UserPermissionsMobileUser__is_set = true;
  }
  
  /**
   * element  : UserPermissionsOfflineUser of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPermissionsOfflineUser__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPermissionsOfflineUser","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPermissionsOfflineUser__is_set = false;

  private java.lang.Boolean UserPermissionsOfflineUser;

  public java.lang.Boolean getUserPermissionsOfflineUser() {
    return UserPermissionsOfflineUser;
  }

  

  public void setUserPermissionsOfflineUser(java.lang.Boolean UserPermissionsOfflineUser) {
    this.UserPermissionsOfflineUser = UserPermissionsOfflineUser;
    UserPermissionsOfflineUser__is_set = true;
  }
  
  /**
   * element  : UserPermissionsSFContentUser of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPermissionsSFContentUser__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPermissionsSFContentUser","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPermissionsSFContentUser__is_set = false;

  private java.lang.Boolean UserPermissionsSFContentUser;

  public java.lang.Boolean getUserPermissionsSFContentUser() {
    return UserPermissionsSFContentUser;
  }

  

  public void setUserPermissionsSFContentUser(java.lang.Boolean UserPermissionsSFContentUser) {
    this.UserPermissionsSFContentUser = UserPermissionsSFContentUser;
    UserPermissionsSFContentUser__is_set = true;
  }
  
  /**
   * element  : UserPermissionsSupportUser of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPermissionsSupportUser__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPermissionsSupportUser","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPermissionsSupportUser__is_set = false;

  private java.lang.Boolean UserPermissionsSupportUser;

  public java.lang.Boolean getUserPermissionsSupportUser() {
    return UserPermissionsSupportUser;
  }

  

  public void setUserPermissionsSupportUser(java.lang.Boolean UserPermissionsSupportUser) {
    this.UserPermissionsSupportUser = UserPermissionsSupportUser;
    UserPermissionsSupportUser__is_set = true;
  }
  
  /**
   * element  : UserPreferences of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferences__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferences","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean UserPreferences__is_set = false;

  private com.sforce.soap.enterprise.QueryResult UserPreferences;

  public com.sforce.soap.enterprise.QueryResult getUserPreferences() {
    return UserPreferences;
  }

  

  public void setUserPreferences(com.sforce.soap.enterprise.QueryResult UserPreferences) {
    this.UserPreferences = UserPreferences;
    UserPreferences__is_set = true;
  }
  
  /**
   * element  : UserPreferencesActivityRemindersPopup of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesActivityRemindersPopup__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesActivityRemindersPopup","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesActivityRemindersPopup__is_set = false;

  private java.lang.Boolean UserPreferencesActivityRemindersPopup;

  public java.lang.Boolean getUserPreferencesActivityRemindersPopup() {
    return UserPreferencesActivityRemindersPopup;
  }

  

  public void setUserPreferencesActivityRemindersPopup(java.lang.Boolean UserPreferencesActivityRemindersPopup) {
    this.UserPreferencesActivityRemindersPopup = UserPreferencesActivityRemindersPopup;
    UserPreferencesActivityRemindersPopup__is_set = true;
  }
  
  /**
   * element  : UserPreferencesApexPagesDeveloperMode of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesApexPagesDeveloperMode__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesApexPagesDeveloperMode","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesApexPagesDeveloperMode__is_set = false;

  private java.lang.Boolean UserPreferencesApexPagesDeveloperMode;

  public java.lang.Boolean getUserPreferencesApexPagesDeveloperMode() {
    return UserPreferencesApexPagesDeveloperMode;
  }

  

  public void setUserPreferencesApexPagesDeveloperMode(java.lang.Boolean UserPreferencesApexPagesDeveloperMode) {
    this.UserPreferencesApexPagesDeveloperMode = UserPreferencesApexPagesDeveloperMode;
    UserPreferencesApexPagesDeveloperMode__is_set = true;
  }
  
  /**
   * element  : UserPreferencesCacheDiagnostics of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesCacheDiagnostics__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesCacheDiagnostics","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesCacheDiagnostics__is_set = false;

  private java.lang.Boolean UserPreferencesCacheDiagnostics;

  public java.lang.Boolean getUserPreferencesCacheDiagnostics() {
    return UserPreferencesCacheDiagnostics;
  }

  

  public void setUserPreferencesCacheDiagnostics(java.lang.Boolean UserPreferencesCacheDiagnostics) {
    this.UserPreferencesCacheDiagnostics = UserPreferencesCacheDiagnostics;
    UserPreferencesCacheDiagnostics__is_set = true;
  }
  
  /**
   * element  : UserPreferencesContentEmailAsAndWhen of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesContentEmailAsAndWhen__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesContentEmailAsAndWhen","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesContentEmailAsAndWhen__is_set = false;

  private java.lang.Boolean UserPreferencesContentEmailAsAndWhen;

  public java.lang.Boolean getUserPreferencesContentEmailAsAndWhen() {
    return UserPreferencesContentEmailAsAndWhen;
  }

  

  public void setUserPreferencesContentEmailAsAndWhen(java.lang.Boolean UserPreferencesContentEmailAsAndWhen) {
    this.UserPreferencesContentEmailAsAndWhen = UserPreferencesContentEmailAsAndWhen;
    UserPreferencesContentEmailAsAndWhen__is_set = true;
  }
  
  /**
   * element  : UserPreferencesContentNoEmail of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesContentNoEmail__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesContentNoEmail","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesContentNoEmail__is_set = false;

  private java.lang.Boolean UserPreferencesContentNoEmail;

  public java.lang.Boolean getUserPreferencesContentNoEmail() {
    return UserPreferencesContentNoEmail;
  }

  

  public void setUserPreferencesContentNoEmail(java.lang.Boolean UserPreferencesContentNoEmail) {
    this.UserPreferencesContentNoEmail = UserPreferencesContentNoEmail;
    UserPreferencesContentNoEmail__is_set = true;
  }
  
  /**
   * element  : UserPreferencesCreateLEXAppsWTShown of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesCreateLEXAppsWTShown__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesCreateLEXAppsWTShown","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesCreateLEXAppsWTShown__is_set = false;

  private java.lang.Boolean UserPreferencesCreateLEXAppsWTShown;

  public java.lang.Boolean getUserPreferencesCreateLEXAppsWTShown() {
    return UserPreferencesCreateLEXAppsWTShown;
  }

  

  public void setUserPreferencesCreateLEXAppsWTShown(java.lang.Boolean UserPreferencesCreateLEXAppsWTShown) {
    this.UserPreferencesCreateLEXAppsWTShown = UserPreferencesCreateLEXAppsWTShown;
    UserPreferencesCreateLEXAppsWTShown__is_set = true;
  }
  
  /**
   * element  : UserPreferencesDisCommentAfterLikeEmail of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesDisCommentAfterLikeEmail__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesDisCommentAfterLikeEmail","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesDisCommentAfterLikeEmail__is_set = false;

  private java.lang.Boolean UserPreferencesDisCommentAfterLikeEmail;

  public java.lang.Boolean getUserPreferencesDisCommentAfterLikeEmail() {
    return UserPreferencesDisCommentAfterLikeEmail;
  }

  

  public void setUserPreferencesDisCommentAfterLikeEmail(java.lang.Boolean UserPreferencesDisCommentAfterLikeEmail) {
    this.UserPreferencesDisCommentAfterLikeEmail = UserPreferencesDisCommentAfterLikeEmail;
    UserPreferencesDisCommentAfterLikeEmail__is_set = true;
  }
  
  /**
   * element  : UserPreferencesDisMentionsCommentEmail of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesDisMentionsCommentEmail__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesDisMentionsCommentEmail","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesDisMentionsCommentEmail__is_set = false;

  private java.lang.Boolean UserPreferencesDisMentionsCommentEmail;

  public java.lang.Boolean getUserPreferencesDisMentionsCommentEmail() {
    return UserPreferencesDisMentionsCommentEmail;
  }

  

  public void setUserPreferencesDisMentionsCommentEmail(java.lang.Boolean UserPreferencesDisMentionsCommentEmail) {
    this.UserPreferencesDisMentionsCommentEmail = UserPreferencesDisMentionsCommentEmail;
    UserPreferencesDisMentionsCommentEmail__is_set = true;
  }
  
  /**
   * element  : UserPreferencesDisProfPostCommentEmail of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesDisProfPostCommentEmail__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesDisProfPostCommentEmail","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesDisProfPostCommentEmail__is_set = false;

  private java.lang.Boolean UserPreferencesDisProfPostCommentEmail;

  public java.lang.Boolean getUserPreferencesDisProfPostCommentEmail() {
    return UserPreferencesDisProfPostCommentEmail;
  }

  

  public void setUserPreferencesDisProfPostCommentEmail(java.lang.Boolean UserPreferencesDisProfPostCommentEmail) {
    this.UserPreferencesDisProfPostCommentEmail = UserPreferencesDisProfPostCommentEmail;
    UserPreferencesDisProfPostCommentEmail__is_set = true;
  }
  
  /**
   * element  : UserPreferencesDisableAllFeedsEmail of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesDisableAllFeedsEmail__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesDisableAllFeedsEmail","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesDisableAllFeedsEmail__is_set = false;

  private java.lang.Boolean UserPreferencesDisableAllFeedsEmail;

  public java.lang.Boolean getUserPreferencesDisableAllFeedsEmail() {
    return UserPreferencesDisableAllFeedsEmail;
  }

  

  public void setUserPreferencesDisableAllFeedsEmail(java.lang.Boolean UserPreferencesDisableAllFeedsEmail) {
    this.UserPreferencesDisableAllFeedsEmail = UserPreferencesDisableAllFeedsEmail;
    UserPreferencesDisableAllFeedsEmail__is_set = true;
  }
  
  /**
   * element  : UserPreferencesDisableBookmarkEmail of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesDisableBookmarkEmail__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesDisableBookmarkEmail","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesDisableBookmarkEmail__is_set = false;

  private java.lang.Boolean UserPreferencesDisableBookmarkEmail;

  public java.lang.Boolean getUserPreferencesDisableBookmarkEmail() {
    return UserPreferencesDisableBookmarkEmail;
  }

  

  public void setUserPreferencesDisableBookmarkEmail(java.lang.Boolean UserPreferencesDisableBookmarkEmail) {
    this.UserPreferencesDisableBookmarkEmail = UserPreferencesDisableBookmarkEmail;
    UserPreferencesDisableBookmarkEmail__is_set = true;
  }
  
  /**
   * element  : UserPreferencesDisableChangeCommentEmail of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesDisableChangeCommentEmail__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesDisableChangeCommentEmail","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesDisableChangeCommentEmail__is_set = false;

  private java.lang.Boolean UserPreferencesDisableChangeCommentEmail;

  public java.lang.Boolean getUserPreferencesDisableChangeCommentEmail() {
    return UserPreferencesDisableChangeCommentEmail;
  }

  

  public void setUserPreferencesDisableChangeCommentEmail(java.lang.Boolean UserPreferencesDisableChangeCommentEmail) {
    this.UserPreferencesDisableChangeCommentEmail = UserPreferencesDisableChangeCommentEmail;
    UserPreferencesDisableChangeCommentEmail__is_set = true;
  }
  
  /**
   * element  : UserPreferencesDisableEndorsementEmail of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesDisableEndorsementEmail__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesDisableEndorsementEmail","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesDisableEndorsementEmail__is_set = false;

  private java.lang.Boolean UserPreferencesDisableEndorsementEmail;

  public java.lang.Boolean getUserPreferencesDisableEndorsementEmail() {
    return UserPreferencesDisableEndorsementEmail;
  }

  

  public void setUserPreferencesDisableEndorsementEmail(java.lang.Boolean UserPreferencesDisableEndorsementEmail) {
    this.UserPreferencesDisableEndorsementEmail = UserPreferencesDisableEndorsementEmail;
    UserPreferencesDisableEndorsementEmail__is_set = true;
  }
  
  /**
   * element  : UserPreferencesDisableFileShareNotificationsForApi of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesDisableFileShareNotificationsForApi__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesDisableFileShareNotificationsForApi","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesDisableFileShareNotificationsForApi__is_set = false;

  private java.lang.Boolean UserPreferencesDisableFileShareNotificationsForApi;

  public java.lang.Boolean getUserPreferencesDisableFileShareNotificationsForApi() {
    return UserPreferencesDisableFileShareNotificationsForApi;
  }

  

  public void setUserPreferencesDisableFileShareNotificationsForApi(java.lang.Boolean UserPreferencesDisableFileShareNotificationsForApi) {
    this.UserPreferencesDisableFileShareNotificationsForApi = UserPreferencesDisableFileShareNotificationsForApi;
    UserPreferencesDisableFileShareNotificationsForApi__is_set = true;
  }
  
  /**
   * element  : UserPreferencesDisableFollowersEmail of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesDisableFollowersEmail__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesDisableFollowersEmail","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesDisableFollowersEmail__is_set = false;

  private java.lang.Boolean UserPreferencesDisableFollowersEmail;

  public java.lang.Boolean getUserPreferencesDisableFollowersEmail() {
    return UserPreferencesDisableFollowersEmail;
  }

  

  public void setUserPreferencesDisableFollowersEmail(java.lang.Boolean UserPreferencesDisableFollowersEmail) {
    this.UserPreferencesDisableFollowersEmail = UserPreferencesDisableFollowersEmail;
    UserPreferencesDisableFollowersEmail__is_set = true;
  }
  
  /**
   * element  : UserPreferencesDisableLaterCommentEmail of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesDisableLaterCommentEmail__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesDisableLaterCommentEmail","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesDisableLaterCommentEmail__is_set = false;

  private java.lang.Boolean UserPreferencesDisableLaterCommentEmail;

  public java.lang.Boolean getUserPreferencesDisableLaterCommentEmail() {
    return UserPreferencesDisableLaterCommentEmail;
  }

  

  public void setUserPreferencesDisableLaterCommentEmail(java.lang.Boolean UserPreferencesDisableLaterCommentEmail) {
    this.UserPreferencesDisableLaterCommentEmail = UserPreferencesDisableLaterCommentEmail;
    UserPreferencesDisableLaterCommentEmail__is_set = true;
  }
  
  /**
   * element  : UserPreferencesDisableLikeEmail of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesDisableLikeEmail__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesDisableLikeEmail","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesDisableLikeEmail__is_set = false;

  private java.lang.Boolean UserPreferencesDisableLikeEmail;

  public java.lang.Boolean getUserPreferencesDisableLikeEmail() {
    return UserPreferencesDisableLikeEmail;
  }

  

  public void setUserPreferencesDisableLikeEmail(java.lang.Boolean UserPreferencesDisableLikeEmail) {
    this.UserPreferencesDisableLikeEmail = UserPreferencesDisableLikeEmail;
    UserPreferencesDisableLikeEmail__is_set = true;
  }
  
  /**
   * element  : UserPreferencesDisableMentionsPostEmail of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesDisableMentionsPostEmail__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesDisableMentionsPostEmail","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesDisableMentionsPostEmail__is_set = false;

  private java.lang.Boolean UserPreferencesDisableMentionsPostEmail;

  public java.lang.Boolean getUserPreferencesDisableMentionsPostEmail() {
    return UserPreferencesDisableMentionsPostEmail;
  }

  

  public void setUserPreferencesDisableMentionsPostEmail(java.lang.Boolean UserPreferencesDisableMentionsPostEmail) {
    this.UserPreferencesDisableMentionsPostEmail = UserPreferencesDisableMentionsPostEmail;
    UserPreferencesDisableMentionsPostEmail__is_set = true;
  }
  
  /**
   * element  : UserPreferencesDisableMessageEmail of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesDisableMessageEmail__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesDisableMessageEmail","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesDisableMessageEmail__is_set = false;

  private java.lang.Boolean UserPreferencesDisableMessageEmail;

  public java.lang.Boolean getUserPreferencesDisableMessageEmail() {
    return UserPreferencesDisableMessageEmail;
  }

  

  public void setUserPreferencesDisableMessageEmail(java.lang.Boolean UserPreferencesDisableMessageEmail) {
    this.UserPreferencesDisableMessageEmail = UserPreferencesDisableMessageEmail;
    UserPreferencesDisableMessageEmail__is_set = true;
  }
  
  /**
   * element  : UserPreferencesDisableProfilePostEmail of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesDisableProfilePostEmail__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesDisableProfilePostEmail","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesDisableProfilePostEmail__is_set = false;

  private java.lang.Boolean UserPreferencesDisableProfilePostEmail;

  public java.lang.Boolean getUserPreferencesDisableProfilePostEmail() {
    return UserPreferencesDisableProfilePostEmail;
  }

  

  public void setUserPreferencesDisableProfilePostEmail(java.lang.Boolean UserPreferencesDisableProfilePostEmail) {
    this.UserPreferencesDisableProfilePostEmail = UserPreferencesDisableProfilePostEmail;
    UserPreferencesDisableProfilePostEmail__is_set = true;
  }
  
  /**
   * element  : UserPreferencesDisableSharePostEmail of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesDisableSharePostEmail__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesDisableSharePostEmail","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesDisableSharePostEmail__is_set = false;

  private java.lang.Boolean UserPreferencesDisableSharePostEmail;

  public java.lang.Boolean getUserPreferencesDisableSharePostEmail() {
    return UserPreferencesDisableSharePostEmail;
  }

  

  public void setUserPreferencesDisableSharePostEmail(java.lang.Boolean UserPreferencesDisableSharePostEmail) {
    this.UserPreferencesDisableSharePostEmail = UserPreferencesDisableSharePostEmail;
    UserPreferencesDisableSharePostEmail__is_set = true;
  }
  
  /**
   * element  : UserPreferencesEnableAutoSubForFeeds of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesEnableAutoSubForFeeds__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesEnableAutoSubForFeeds","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesEnableAutoSubForFeeds__is_set = false;

  private java.lang.Boolean UserPreferencesEnableAutoSubForFeeds;

  public java.lang.Boolean getUserPreferencesEnableAutoSubForFeeds() {
    return UserPreferencesEnableAutoSubForFeeds;
  }

  

  public void setUserPreferencesEnableAutoSubForFeeds(java.lang.Boolean UserPreferencesEnableAutoSubForFeeds) {
    this.UserPreferencesEnableAutoSubForFeeds = UserPreferencesEnableAutoSubForFeeds;
    UserPreferencesEnableAutoSubForFeeds__is_set = true;
  }
  
  /**
   * element  : UserPreferencesEventRemindersCheckboxDefault of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesEventRemindersCheckboxDefault__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesEventRemindersCheckboxDefault","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesEventRemindersCheckboxDefault__is_set = false;

  private java.lang.Boolean UserPreferencesEventRemindersCheckboxDefault;

  public java.lang.Boolean getUserPreferencesEventRemindersCheckboxDefault() {
    return UserPreferencesEventRemindersCheckboxDefault;
  }

  

  public void setUserPreferencesEventRemindersCheckboxDefault(java.lang.Boolean UserPreferencesEventRemindersCheckboxDefault) {
    this.UserPreferencesEventRemindersCheckboxDefault = UserPreferencesEventRemindersCheckboxDefault;
    UserPreferencesEventRemindersCheckboxDefault__is_set = true;
  }
  
  /**
   * element  : UserPreferencesGlobalNavBarWTShown of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesGlobalNavBarWTShown__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesGlobalNavBarWTShown","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesGlobalNavBarWTShown__is_set = false;

  private java.lang.Boolean UserPreferencesGlobalNavBarWTShown;

  public java.lang.Boolean getUserPreferencesGlobalNavBarWTShown() {
    return UserPreferencesGlobalNavBarWTShown;
  }

  

  public void setUserPreferencesGlobalNavBarWTShown(java.lang.Boolean UserPreferencesGlobalNavBarWTShown) {
    this.UserPreferencesGlobalNavBarWTShown = UserPreferencesGlobalNavBarWTShown;
    UserPreferencesGlobalNavBarWTShown__is_set = true;
  }
  
  /**
   * element  : UserPreferencesGlobalNavGridMenuWTShown of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesGlobalNavGridMenuWTShown__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesGlobalNavGridMenuWTShown","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesGlobalNavGridMenuWTShown__is_set = false;

  private java.lang.Boolean UserPreferencesGlobalNavGridMenuWTShown;

  public java.lang.Boolean getUserPreferencesGlobalNavGridMenuWTShown() {
    return UserPreferencesGlobalNavGridMenuWTShown;
  }

  

  public void setUserPreferencesGlobalNavGridMenuWTShown(java.lang.Boolean UserPreferencesGlobalNavGridMenuWTShown) {
    this.UserPreferencesGlobalNavGridMenuWTShown = UserPreferencesGlobalNavGridMenuWTShown;
    UserPreferencesGlobalNavGridMenuWTShown__is_set = true;
  }
  
  /**
   * element  : UserPreferencesHideBiggerPhotoCallout of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesHideBiggerPhotoCallout__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesHideBiggerPhotoCallout","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesHideBiggerPhotoCallout__is_set = false;

  private java.lang.Boolean UserPreferencesHideBiggerPhotoCallout;

  public java.lang.Boolean getUserPreferencesHideBiggerPhotoCallout() {
    return UserPreferencesHideBiggerPhotoCallout;
  }

  

  public void setUserPreferencesHideBiggerPhotoCallout(java.lang.Boolean UserPreferencesHideBiggerPhotoCallout) {
    this.UserPreferencesHideBiggerPhotoCallout = UserPreferencesHideBiggerPhotoCallout;
    UserPreferencesHideBiggerPhotoCallout__is_set = true;
  }
  
  /**
   * element  : UserPreferencesHideCSNDesktopTask of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesHideCSNDesktopTask__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesHideCSNDesktopTask","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesHideCSNDesktopTask__is_set = false;

  private java.lang.Boolean UserPreferencesHideCSNDesktopTask;

  public java.lang.Boolean getUserPreferencesHideCSNDesktopTask() {
    return UserPreferencesHideCSNDesktopTask;
  }

  

  public void setUserPreferencesHideCSNDesktopTask(java.lang.Boolean UserPreferencesHideCSNDesktopTask) {
    this.UserPreferencesHideCSNDesktopTask = UserPreferencesHideCSNDesktopTask;
    UserPreferencesHideCSNDesktopTask__is_set = true;
  }
  
  /**
   * element  : UserPreferencesHideCSNGetChatterMobileTask of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesHideCSNGetChatterMobileTask__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesHideCSNGetChatterMobileTask","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesHideCSNGetChatterMobileTask__is_set = false;

  private java.lang.Boolean UserPreferencesHideCSNGetChatterMobileTask;

  public java.lang.Boolean getUserPreferencesHideCSNGetChatterMobileTask() {
    return UserPreferencesHideCSNGetChatterMobileTask;
  }

  

  public void setUserPreferencesHideCSNGetChatterMobileTask(java.lang.Boolean UserPreferencesHideCSNGetChatterMobileTask) {
    this.UserPreferencesHideCSNGetChatterMobileTask = UserPreferencesHideCSNGetChatterMobileTask;
    UserPreferencesHideCSNGetChatterMobileTask__is_set = true;
  }
  
  /**
   * element  : UserPreferencesHideChatterOnboardingSplash of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesHideChatterOnboardingSplash__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesHideChatterOnboardingSplash","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesHideChatterOnboardingSplash__is_set = false;

  private java.lang.Boolean UserPreferencesHideChatterOnboardingSplash;

  public java.lang.Boolean getUserPreferencesHideChatterOnboardingSplash() {
    return UserPreferencesHideChatterOnboardingSplash;
  }

  

  public void setUserPreferencesHideChatterOnboardingSplash(java.lang.Boolean UserPreferencesHideChatterOnboardingSplash) {
    this.UserPreferencesHideChatterOnboardingSplash = UserPreferencesHideChatterOnboardingSplash;
    UserPreferencesHideChatterOnboardingSplash__is_set = true;
  }
  
  /**
   * element  : UserPreferencesHideEndUserOnboardingAssistantModal of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesHideEndUserOnboardingAssistantModal__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesHideEndUserOnboardingAssistantModal","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesHideEndUserOnboardingAssistantModal__is_set = false;

  private java.lang.Boolean UserPreferencesHideEndUserOnboardingAssistantModal;

  public java.lang.Boolean getUserPreferencesHideEndUserOnboardingAssistantModal() {
    return UserPreferencesHideEndUserOnboardingAssistantModal;
  }

  

  public void setUserPreferencesHideEndUserOnboardingAssistantModal(java.lang.Boolean UserPreferencesHideEndUserOnboardingAssistantModal) {
    this.UserPreferencesHideEndUserOnboardingAssistantModal = UserPreferencesHideEndUserOnboardingAssistantModal;
    UserPreferencesHideEndUserOnboardingAssistantModal__is_set = true;
  }
  
  /**
   * element  : UserPreferencesHideLightningMigrationModal of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesHideLightningMigrationModal__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesHideLightningMigrationModal","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesHideLightningMigrationModal__is_set = false;

  private java.lang.Boolean UserPreferencesHideLightningMigrationModal;

  public java.lang.Boolean getUserPreferencesHideLightningMigrationModal() {
    return UserPreferencesHideLightningMigrationModal;
  }

  

  public void setUserPreferencesHideLightningMigrationModal(java.lang.Boolean UserPreferencesHideLightningMigrationModal) {
    this.UserPreferencesHideLightningMigrationModal = UserPreferencesHideLightningMigrationModal;
    UserPreferencesHideLightningMigrationModal__is_set = true;
  }
  
  /**
   * element  : UserPreferencesHideS1BrowserUI of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesHideS1BrowserUI__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesHideS1BrowserUI","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesHideS1BrowserUI__is_set = false;

  private java.lang.Boolean UserPreferencesHideS1BrowserUI;

  public java.lang.Boolean getUserPreferencesHideS1BrowserUI() {
    return UserPreferencesHideS1BrowserUI;
  }

  

  public void setUserPreferencesHideS1BrowserUI(java.lang.Boolean UserPreferencesHideS1BrowserUI) {
    this.UserPreferencesHideS1BrowserUI = UserPreferencesHideS1BrowserUI;
    UserPreferencesHideS1BrowserUI__is_set = true;
  }
  
  /**
   * element  : UserPreferencesHideSecondChatterOnboardingSplash of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesHideSecondChatterOnboardingSplash__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesHideSecondChatterOnboardingSplash","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesHideSecondChatterOnboardingSplash__is_set = false;

  private java.lang.Boolean UserPreferencesHideSecondChatterOnboardingSplash;

  public java.lang.Boolean getUserPreferencesHideSecondChatterOnboardingSplash() {
    return UserPreferencesHideSecondChatterOnboardingSplash;
  }

  

  public void setUserPreferencesHideSecondChatterOnboardingSplash(java.lang.Boolean UserPreferencesHideSecondChatterOnboardingSplash) {
    this.UserPreferencesHideSecondChatterOnboardingSplash = UserPreferencesHideSecondChatterOnboardingSplash;
    UserPreferencesHideSecondChatterOnboardingSplash__is_set = true;
  }
  
  /**
   * element  : UserPreferencesHideSfxWelcomeMat of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesHideSfxWelcomeMat__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesHideSfxWelcomeMat","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesHideSfxWelcomeMat__is_set = false;

  private java.lang.Boolean UserPreferencesHideSfxWelcomeMat;

  public java.lang.Boolean getUserPreferencesHideSfxWelcomeMat() {
    return UserPreferencesHideSfxWelcomeMat;
  }

  

  public void setUserPreferencesHideSfxWelcomeMat(java.lang.Boolean UserPreferencesHideSfxWelcomeMat) {
    this.UserPreferencesHideSfxWelcomeMat = UserPreferencesHideSfxWelcomeMat;
    UserPreferencesHideSfxWelcomeMat__is_set = true;
  }
  
  /**
   * element  : UserPreferencesLightningExperiencePreferred of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesLightningExperiencePreferred__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesLightningExperiencePreferred","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesLightningExperiencePreferred__is_set = false;

  private java.lang.Boolean UserPreferencesLightningExperiencePreferred;

  public java.lang.Boolean getUserPreferencesLightningExperiencePreferred() {
    return UserPreferencesLightningExperiencePreferred;
  }

  

  public void setUserPreferencesLightningExperiencePreferred(java.lang.Boolean UserPreferencesLightningExperiencePreferred) {
    this.UserPreferencesLightningExperiencePreferred = UserPreferencesLightningExperiencePreferred;
    UserPreferencesLightningExperiencePreferred__is_set = true;
  }
  
  /**
   * element  : UserPreferencesPathAssistantCollapsed of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesPathAssistantCollapsed__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesPathAssistantCollapsed","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesPathAssistantCollapsed__is_set = false;

  private java.lang.Boolean UserPreferencesPathAssistantCollapsed;

  public java.lang.Boolean getUserPreferencesPathAssistantCollapsed() {
    return UserPreferencesPathAssistantCollapsed;
  }

  

  public void setUserPreferencesPathAssistantCollapsed(java.lang.Boolean UserPreferencesPathAssistantCollapsed) {
    this.UserPreferencesPathAssistantCollapsed = UserPreferencesPathAssistantCollapsed;
    UserPreferencesPathAssistantCollapsed__is_set = true;
  }
  
  /**
   * element  : UserPreferencesPreviewLightning of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesPreviewLightning__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesPreviewLightning","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesPreviewLightning__is_set = false;

  private java.lang.Boolean UserPreferencesPreviewLightning;

  public java.lang.Boolean getUserPreferencesPreviewLightning() {
    return UserPreferencesPreviewLightning;
  }

  

  public void setUserPreferencesPreviewLightning(java.lang.Boolean UserPreferencesPreviewLightning) {
    this.UserPreferencesPreviewLightning = UserPreferencesPreviewLightning;
    UserPreferencesPreviewLightning__is_set = true;
  }
  
  /**
   * element  : UserPreferencesReminderSoundOff of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesReminderSoundOff__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesReminderSoundOff","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesReminderSoundOff__is_set = false;

  private java.lang.Boolean UserPreferencesReminderSoundOff;

  public java.lang.Boolean getUserPreferencesReminderSoundOff() {
    return UserPreferencesReminderSoundOff;
  }

  

  public void setUserPreferencesReminderSoundOff(java.lang.Boolean UserPreferencesReminderSoundOff) {
    this.UserPreferencesReminderSoundOff = UserPreferencesReminderSoundOff;
    UserPreferencesReminderSoundOff__is_set = true;
  }
  
  /**
   * element  : UserPreferencesShowCityToExternalUsers of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesShowCityToExternalUsers__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesShowCityToExternalUsers","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesShowCityToExternalUsers__is_set = false;

  private java.lang.Boolean UserPreferencesShowCityToExternalUsers;

  public java.lang.Boolean getUserPreferencesShowCityToExternalUsers() {
    return UserPreferencesShowCityToExternalUsers;
  }

  

  public void setUserPreferencesShowCityToExternalUsers(java.lang.Boolean UserPreferencesShowCityToExternalUsers) {
    this.UserPreferencesShowCityToExternalUsers = UserPreferencesShowCityToExternalUsers;
    UserPreferencesShowCityToExternalUsers__is_set = true;
  }
  
  /**
   * element  : UserPreferencesShowCityToGuestUsers of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesShowCityToGuestUsers__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesShowCityToGuestUsers","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesShowCityToGuestUsers__is_set = false;

  private java.lang.Boolean UserPreferencesShowCityToGuestUsers;

  public java.lang.Boolean getUserPreferencesShowCityToGuestUsers() {
    return UserPreferencesShowCityToGuestUsers;
  }

  

  public void setUserPreferencesShowCityToGuestUsers(java.lang.Boolean UserPreferencesShowCityToGuestUsers) {
    this.UserPreferencesShowCityToGuestUsers = UserPreferencesShowCityToGuestUsers;
    UserPreferencesShowCityToGuestUsers__is_set = true;
  }
  
  /**
   * element  : UserPreferencesShowCountryToExternalUsers of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesShowCountryToExternalUsers__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesShowCountryToExternalUsers","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesShowCountryToExternalUsers__is_set = false;

  private java.lang.Boolean UserPreferencesShowCountryToExternalUsers;

  public java.lang.Boolean getUserPreferencesShowCountryToExternalUsers() {
    return UserPreferencesShowCountryToExternalUsers;
  }

  

  public void setUserPreferencesShowCountryToExternalUsers(java.lang.Boolean UserPreferencesShowCountryToExternalUsers) {
    this.UserPreferencesShowCountryToExternalUsers = UserPreferencesShowCountryToExternalUsers;
    UserPreferencesShowCountryToExternalUsers__is_set = true;
  }
  
  /**
   * element  : UserPreferencesShowCountryToGuestUsers of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesShowCountryToGuestUsers__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesShowCountryToGuestUsers","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesShowCountryToGuestUsers__is_set = false;

  private java.lang.Boolean UserPreferencesShowCountryToGuestUsers;

  public java.lang.Boolean getUserPreferencesShowCountryToGuestUsers() {
    return UserPreferencesShowCountryToGuestUsers;
  }

  

  public void setUserPreferencesShowCountryToGuestUsers(java.lang.Boolean UserPreferencesShowCountryToGuestUsers) {
    this.UserPreferencesShowCountryToGuestUsers = UserPreferencesShowCountryToGuestUsers;
    UserPreferencesShowCountryToGuestUsers__is_set = true;
  }
  
  /**
   * element  : UserPreferencesShowEmailToExternalUsers of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesShowEmailToExternalUsers__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesShowEmailToExternalUsers","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesShowEmailToExternalUsers__is_set = false;

  private java.lang.Boolean UserPreferencesShowEmailToExternalUsers;

  public java.lang.Boolean getUserPreferencesShowEmailToExternalUsers() {
    return UserPreferencesShowEmailToExternalUsers;
  }

  

  public void setUserPreferencesShowEmailToExternalUsers(java.lang.Boolean UserPreferencesShowEmailToExternalUsers) {
    this.UserPreferencesShowEmailToExternalUsers = UserPreferencesShowEmailToExternalUsers;
    UserPreferencesShowEmailToExternalUsers__is_set = true;
  }
  
  /**
   * element  : UserPreferencesShowEmailToGuestUsers of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesShowEmailToGuestUsers__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesShowEmailToGuestUsers","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesShowEmailToGuestUsers__is_set = false;

  private java.lang.Boolean UserPreferencesShowEmailToGuestUsers;

  public java.lang.Boolean getUserPreferencesShowEmailToGuestUsers() {
    return UserPreferencesShowEmailToGuestUsers;
  }

  

  public void setUserPreferencesShowEmailToGuestUsers(java.lang.Boolean UserPreferencesShowEmailToGuestUsers) {
    this.UserPreferencesShowEmailToGuestUsers = UserPreferencesShowEmailToGuestUsers;
    UserPreferencesShowEmailToGuestUsers__is_set = true;
  }
  
  /**
   * element  : UserPreferencesShowFaxToExternalUsers of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesShowFaxToExternalUsers__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesShowFaxToExternalUsers","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesShowFaxToExternalUsers__is_set = false;

  private java.lang.Boolean UserPreferencesShowFaxToExternalUsers;

  public java.lang.Boolean getUserPreferencesShowFaxToExternalUsers() {
    return UserPreferencesShowFaxToExternalUsers;
  }

  

  public void setUserPreferencesShowFaxToExternalUsers(java.lang.Boolean UserPreferencesShowFaxToExternalUsers) {
    this.UserPreferencesShowFaxToExternalUsers = UserPreferencesShowFaxToExternalUsers;
    UserPreferencesShowFaxToExternalUsers__is_set = true;
  }
  
  /**
   * element  : UserPreferencesShowFaxToGuestUsers of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesShowFaxToGuestUsers__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesShowFaxToGuestUsers","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesShowFaxToGuestUsers__is_set = false;

  private java.lang.Boolean UserPreferencesShowFaxToGuestUsers;

  public java.lang.Boolean getUserPreferencesShowFaxToGuestUsers() {
    return UserPreferencesShowFaxToGuestUsers;
  }

  

  public void setUserPreferencesShowFaxToGuestUsers(java.lang.Boolean UserPreferencesShowFaxToGuestUsers) {
    this.UserPreferencesShowFaxToGuestUsers = UserPreferencesShowFaxToGuestUsers;
    UserPreferencesShowFaxToGuestUsers__is_set = true;
  }
  
  /**
   * element  : UserPreferencesShowManagerToExternalUsers of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesShowManagerToExternalUsers__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesShowManagerToExternalUsers","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesShowManagerToExternalUsers__is_set = false;

  private java.lang.Boolean UserPreferencesShowManagerToExternalUsers;

  public java.lang.Boolean getUserPreferencesShowManagerToExternalUsers() {
    return UserPreferencesShowManagerToExternalUsers;
  }

  

  public void setUserPreferencesShowManagerToExternalUsers(java.lang.Boolean UserPreferencesShowManagerToExternalUsers) {
    this.UserPreferencesShowManagerToExternalUsers = UserPreferencesShowManagerToExternalUsers;
    UserPreferencesShowManagerToExternalUsers__is_set = true;
  }
  
  /**
   * element  : UserPreferencesShowManagerToGuestUsers of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesShowManagerToGuestUsers__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesShowManagerToGuestUsers","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesShowManagerToGuestUsers__is_set = false;

  private java.lang.Boolean UserPreferencesShowManagerToGuestUsers;

  public java.lang.Boolean getUserPreferencesShowManagerToGuestUsers() {
    return UserPreferencesShowManagerToGuestUsers;
  }

  

  public void setUserPreferencesShowManagerToGuestUsers(java.lang.Boolean UserPreferencesShowManagerToGuestUsers) {
    this.UserPreferencesShowManagerToGuestUsers = UserPreferencesShowManagerToGuestUsers;
    UserPreferencesShowManagerToGuestUsers__is_set = true;
  }
  
  /**
   * element  : UserPreferencesShowMobilePhoneToExternalUsers of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesShowMobilePhoneToExternalUsers__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesShowMobilePhoneToExternalUsers","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesShowMobilePhoneToExternalUsers__is_set = false;

  private java.lang.Boolean UserPreferencesShowMobilePhoneToExternalUsers;

  public java.lang.Boolean getUserPreferencesShowMobilePhoneToExternalUsers() {
    return UserPreferencesShowMobilePhoneToExternalUsers;
  }

  

  public void setUserPreferencesShowMobilePhoneToExternalUsers(java.lang.Boolean UserPreferencesShowMobilePhoneToExternalUsers) {
    this.UserPreferencesShowMobilePhoneToExternalUsers = UserPreferencesShowMobilePhoneToExternalUsers;
    UserPreferencesShowMobilePhoneToExternalUsers__is_set = true;
  }
  
  /**
   * element  : UserPreferencesShowMobilePhoneToGuestUsers of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesShowMobilePhoneToGuestUsers__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesShowMobilePhoneToGuestUsers","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesShowMobilePhoneToGuestUsers__is_set = false;

  private java.lang.Boolean UserPreferencesShowMobilePhoneToGuestUsers;

  public java.lang.Boolean getUserPreferencesShowMobilePhoneToGuestUsers() {
    return UserPreferencesShowMobilePhoneToGuestUsers;
  }

  

  public void setUserPreferencesShowMobilePhoneToGuestUsers(java.lang.Boolean UserPreferencesShowMobilePhoneToGuestUsers) {
    this.UserPreferencesShowMobilePhoneToGuestUsers = UserPreferencesShowMobilePhoneToGuestUsers;
    UserPreferencesShowMobilePhoneToGuestUsers__is_set = true;
  }
  
  /**
   * element  : UserPreferencesShowPostalCodeToExternalUsers of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesShowPostalCodeToExternalUsers__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesShowPostalCodeToExternalUsers","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesShowPostalCodeToExternalUsers__is_set = false;

  private java.lang.Boolean UserPreferencesShowPostalCodeToExternalUsers;

  public java.lang.Boolean getUserPreferencesShowPostalCodeToExternalUsers() {
    return UserPreferencesShowPostalCodeToExternalUsers;
  }

  

  public void setUserPreferencesShowPostalCodeToExternalUsers(java.lang.Boolean UserPreferencesShowPostalCodeToExternalUsers) {
    this.UserPreferencesShowPostalCodeToExternalUsers = UserPreferencesShowPostalCodeToExternalUsers;
    UserPreferencesShowPostalCodeToExternalUsers__is_set = true;
  }
  
  /**
   * element  : UserPreferencesShowPostalCodeToGuestUsers of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesShowPostalCodeToGuestUsers__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesShowPostalCodeToGuestUsers","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesShowPostalCodeToGuestUsers__is_set = false;

  private java.lang.Boolean UserPreferencesShowPostalCodeToGuestUsers;

  public java.lang.Boolean getUserPreferencesShowPostalCodeToGuestUsers() {
    return UserPreferencesShowPostalCodeToGuestUsers;
  }

  

  public void setUserPreferencesShowPostalCodeToGuestUsers(java.lang.Boolean UserPreferencesShowPostalCodeToGuestUsers) {
    this.UserPreferencesShowPostalCodeToGuestUsers = UserPreferencesShowPostalCodeToGuestUsers;
    UserPreferencesShowPostalCodeToGuestUsers__is_set = true;
  }
  
  /**
   * element  : UserPreferencesShowProfilePicToGuestUsers of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesShowProfilePicToGuestUsers__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesShowProfilePicToGuestUsers","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesShowProfilePicToGuestUsers__is_set = false;

  private java.lang.Boolean UserPreferencesShowProfilePicToGuestUsers;

  public java.lang.Boolean getUserPreferencesShowProfilePicToGuestUsers() {
    return UserPreferencesShowProfilePicToGuestUsers;
  }

  

  public void setUserPreferencesShowProfilePicToGuestUsers(java.lang.Boolean UserPreferencesShowProfilePicToGuestUsers) {
    this.UserPreferencesShowProfilePicToGuestUsers = UserPreferencesShowProfilePicToGuestUsers;
    UserPreferencesShowProfilePicToGuestUsers__is_set = true;
  }
  
  /**
   * element  : UserPreferencesShowStateToExternalUsers of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesShowStateToExternalUsers__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesShowStateToExternalUsers","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesShowStateToExternalUsers__is_set = false;

  private java.lang.Boolean UserPreferencesShowStateToExternalUsers;

  public java.lang.Boolean getUserPreferencesShowStateToExternalUsers() {
    return UserPreferencesShowStateToExternalUsers;
  }

  

  public void setUserPreferencesShowStateToExternalUsers(java.lang.Boolean UserPreferencesShowStateToExternalUsers) {
    this.UserPreferencesShowStateToExternalUsers = UserPreferencesShowStateToExternalUsers;
    UserPreferencesShowStateToExternalUsers__is_set = true;
  }
  
  /**
   * element  : UserPreferencesShowStateToGuestUsers of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesShowStateToGuestUsers__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesShowStateToGuestUsers","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesShowStateToGuestUsers__is_set = false;

  private java.lang.Boolean UserPreferencesShowStateToGuestUsers;

  public java.lang.Boolean getUserPreferencesShowStateToGuestUsers() {
    return UserPreferencesShowStateToGuestUsers;
  }

  

  public void setUserPreferencesShowStateToGuestUsers(java.lang.Boolean UserPreferencesShowStateToGuestUsers) {
    this.UserPreferencesShowStateToGuestUsers = UserPreferencesShowStateToGuestUsers;
    UserPreferencesShowStateToGuestUsers__is_set = true;
  }
  
  /**
   * element  : UserPreferencesShowStreetAddressToExternalUsers of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesShowStreetAddressToExternalUsers__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesShowStreetAddressToExternalUsers","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesShowStreetAddressToExternalUsers__is_set = false;

  private java.lang.Boolean UserPreferencesShowStreetAddressToExternalUsers;

  public java.lang.Boolean getUserPreferencesShowStreetAddressToExternalUsers() {
    return UserPreferencesShowStreetAddressToExternalUsers;
  }

  

  public void setUserPreferencesShowStreetAddressToExternalUsers(java.lang.Boolean UserPreferencesShowStreetAddressToExternalUsers) {
    this.UserPreferencesShowStreetAddressToExternalUsers = UserPreferencesShowStreetAddressToExternalUsers;
    UserPreferencesShowStreetAddressToExternalUsers__is_set = true;
  }
  
  /**
   * element  : UserPreferencesShowStreetAddressToGuestUsers of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesShowStreetAddressToGuestUsers__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesShowStreetAddressToGuestUsers","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesShowStreetAddressToGuestUsers__is_set = false;

  private java.lang.Boolean UserPreferencesShowStreetAddressToGuestUsers;

  public java.lang.Boolean getUserPreferencesShowStreetAddressToGuestUsers() {
    return UserPreferencesShowStreetAddressToGuestUsers;
  }

  

  public void setUserPreferencesShowStreetAddressToGuestUsers(java.lang.Boolean UserPreferencesShowStreetAddressToGuestUsers) {
    this.UserPreferencesShowStreetAddressToGuestUsers = UserPreferencesShowStreetAddressToGuestUsers;
    UserPreferencesShowStreetAddressToGuestUsers__is_set = true;
  }
  
  /**
   * element  : UserPreferencesShowTitleToExternalUsers of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesShowTitleToExternalUsers__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesShowTitleToExternalUsers","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesShowTitleToExternalUsers__is_set = false;

  private java.lang.Boolean UserPreferencesShowTitleToExternalUsers;

  public java.lang.Boolean getUserPreferencesShowTitleToExternalUsers() {
    return UserPreferencesShowTitleToExternalUsers;
  }

  

  public void setUserPreferencesShowTitleToExternalUsers(java.lang.Boolean UserPreferencesShowTitleToExternalUsers) {
    this.UserPreferencesShowTitleToExternalUsers = UserPreferencesShowTitleToExternalUsers;
    UserPreferencesShowTitleToExternalUsers__is_set = true;
  }
  
  /**
   * element  : UserPreferencesShowTitleToGuestUsers of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesShowTitleToGuestUsers__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesShowTitleToGuestUsers","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesShowTitleToGuestUsers__is_set = false;

  private java.lang.Boolean UserPreferencesShowTitleToGuestUsers;

  public java.lang.Boolean getUserPreferencesShowTitleToGuestUsers() {
    return UserPreferencesShowTitleToGuestUsers;
  }

  

  public void setUserPreferencesShowTitleToGuestUsers(java.lang.Boolean UserPreferencesShowTitleToGuestUsers) {
    this.UserPreferencesShowTitleToGuestUsers = UserPreferencesShowTitleToGuestUsers;
    UserPreferencesShowTitleToGuestUsers__is_set = true;
  }
  
  /**
   * element  : UserPreferencesShowWorkPhoneToExternalUsers of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesShowWorkPhoneToExternalUsers__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesShowWorkPhoneToExternalUsers","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesShowWorkPhoneToExternalUsers__is_set = false;

  private java.lang.Boolean UserPreferencesShowWorkPhoneToExternalUsers;

  public java.lang.Boolean getUserPreferencesShowWorkPhoneToExternalUsers() {
    return UserPreferencesShowWorkPhoneToExternalUsers;
  }

  

  public void setUserPreferencesShowWorkPhoneToExternalUsers(java.lang.Boolean UserPreferencesShowWorkPhoneToExternalUsers) {
    this.UserPreferencesShowWorkPhoneToExternalUsers = UserPreferencesShowWorkPhoneToExternalUsers;
    UserPreferencesShowWorkPhoneToExternalUsers__is_set = true;
  }
  
  /**
   * element  : UserPreferencesShowWorkPhoneToGuestUsers of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesShowWorkPhoneToGuestUsers__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesShowWorkPhoneToGuestUsers","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesShowWorkPhoneToGuestUsers__is_set = false;

  private java.lang.Boolean UserPreferencesShowWorkPhoneToGuestUsers;

  public java.lang.Boolean getUserPreferencesShowWorkPhoneToGuestUsers() {
    return UserPreferencesShowWorkPhoneToGuestUsers;
  }

  

  public void setUserPreferencesShowWorkPhoneToGuestUsers(java.lang.Boolean UserPreferencesShowWorkPhoneToGuestUsers) {
    this.UserPreferencesShowWorkPhoneToGuestUsers = UserPreferencesShowWorkPhoneToGuestUsers;
    UserPreferencesShowWorkPhoneToGuestUsers__is_set = true;
  }
  
  /**
   * element  : UserPreferencesSortFeedByComment of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesSortFeedByComment__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesSortFeedByComment","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesSortFeedByComment__is_set = false;

  private java.lang.Boolean UserPreferencesSortFeedByComment;

  public java.lang.Boolean getUserPreferencesSortFeedByComment() {
    return UserPreferencesSortFeedByComment;
  }

  

  public void setUserPreferencesSortFeedByComment(java.lang.Boolean UserPreferencesSortFeedByComment) {
    this.UserPreferencesSortFeedByComment = UserPreferencesSortFeedByComment;
    UserPreferencesSortFeedByComment__is_set = true;
  }
  
  /**
   * element  : UserPreferencesTaskRemindersCheckboxDefault of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UserPreferencesTaskRemindersCheckboxDefault__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserPreferencesTaskRemindersCheckboxDefault","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UserPreferencesTaskRemindersCheckboxDefault__is_set = false;

  private java.lang.Boolean UserPreferencesTaskRemindersCheckboxDefault;

  public java.lang.Boolean getUserPreferencesTaskRemindersCheckboxDefault() {
    return UserPreferencesTaskRemindersCheckboxDefault;
  }

  

  public void setUserPreferencesTaskRemindersCheckboxDefault(java.lang.Boolean UserPreferencesTaskRemindersCheckboxDefault) {
    this.UserPreferencesTaskRemindersCheckboxDefault = UserPreferencesTaskRemindersCheckboxDefault;
    UserPreferencesTaskRemindersCheckboxDefault__is_set = true;
  }
  
  /**
   * element  : UserProfileSkillChildren of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo UserProfileSkillChildren__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserProfileSkillChildren","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean UserProfileSkillChildren__is_set = false;

  private com.sforce.soap.enterprise.QueryResult UserProfileSkillChildren;

  public com.sforce.soap.enterprise.QueryResult getUserProfileSkillChildren() {
    return UserProfileSkillChildren;
  }

  

  public void setUserProfileSkillChildren(com.sforce.soap.enterprise.QueryResult UserProfileSkillChildren) {
    this.UserProfileSkillChildren = UserProfileSkillChildren;
    UserProfileSkillChildren__is_set = true;
  }
  
  /**
   * element  : UserProfileSkillUserEndorsements of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo UserProfileSkillUserEndorsements__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserProfileSkillUserEndorsements","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean UserProfileSkillUserEndorsements__is_set = false;

  private com.sforce.soap.enterprise.QueryResult UserProfileSkillUserEndorsements;

  public com.sforce.soap.enterprise.QueryResult getUserProfileSkillUserEndorsements() {
    return UserProfileSkillUserEndorsements;
  }

  

  public void setUserProfileSkillUserEndorsements(com.sforce.soap.enterprise.QueryResult UserProfileSkillUserEndorsements) {
    this.UserProfileSkillUserEndorsements = UserProfileSkillUserEndorsements;
    UserProfileSkillUserEndorsements__is_set = true;
  }
  
  /**
   * element  : UserRole of type {urn:sobject.enterprise.soap.sforce.com}UserRole
   * java type: com.sforce.soap.enterprise.sobject.UserRole
   */
  private static final com.sforce.ws.bind.TypeInfo UserRole__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserRole","urn:sobject.enterprise.soap.sforce.com","UserRole",0,1,true);

  private boolean UserRole__is_set = false;

  private com.sforce.soap.enterprise.sobject.UserRole UserRole;

  public com.sforce.soap.enterprise.sobject.UserRole getUserRole() {
    return UserRole;
  }

  

  public void setUserRole(com.sforce.soap.enterprise.sobject.UserRole UserRole) {
    this.UserRole = UserRole;
    UserRole__is_set = true;
  }
  
  /**
   * element  : UserRoleId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo UserRoleId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserRoleId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean UserRoleId__is_set = false;

  private java.lang.String UserRoleId;

  public java.lang.String getUserRoleId() {
    return UserRoleId;
  }

  

  public void setUserRoleId(java.lang.String UserRoleId) {
    this.UserRoleId = UserRoleId;
    UserRoleId__is_set = true;
  }
  
  /**
   * element  : UserSites of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo UserSites__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserSites","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean UserSites__is_set = false;

  private com.sforce.soap.enterprise.QueryResult UserSites;

  public com.sforce.soap.enterprise.QueryResult getUserSites() {
    return UserSites;
  }

  

  public void setUserSites(com.sforce.soap.enterprise.QueryResult UserSites) {
    this.UserSites = UserSites;
    UserSites__is_set = true;
  }
  
  /**
   * element  : UserType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo UserType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean UserType__is_set = false;

  private java.lang.String UserType;

  public java.lang.String getUserType() {
    return UserType;
  }

  

  public void setUserType(java.lang.String UserType) {
    this.UserType = UserType;
    UserType__is_set = true;
  }
  
  /**
   * element  : User_Code__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo User_Code__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","User_Code__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean User_Code__c__is_set = false;

  private java.lang.String User_Code__c;

  public java.lang.String getUser_Code__c() {
    return User_Code__c;
  }

  

  public void setUser_Code__c(java.lang.String User_Code__c) {
    this.User_Code__c = User_Code__c;
    User_Code__c__is_set = true;
  }
  
  /**
   * element  : Username of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Username__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Username","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Username__is_set = false;

  private java.lang.String Username;

  public java.lang.String getUsername() {
    return Username;
  }

  

  public void setUsername(java.lang.String Username) {
    this.Username = Username;
    Username__is_set = true;
  }
  
  /**
   * element  : Users__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Users__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Users__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Users__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Users__r;

  public com.sforce.soap.enterprise.QueryResult getUsers__r() {
    return Users__r;
  }

  

  public void setUsers__r(com.sforce.soap.enterprise.QueryResult Users__r) {
    this.Users__r = Users__r;
    Users__r__is_set = true;
  }
  
  /**
   * element  : VCSSAP__User_Inboxes__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__User_Inboxes__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__User_Inboxes__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean VCSSAP__User_Inboxes__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult VCSSAP__User_Inboxes__r;

  public com.sforce.soap.enterprise.QueryResult getVCSSAP__User_Inboxes__r() {
    return VCSSAP__User_Inboxes__r;
  }

  

  public void setVCSSAP__User_Inboxes__r(com.sforce.soap.enterprise.QueryResult VCSSAP__User_Inboxes__r) {
    this.VCSSAP__User_Inboxes__r = VCSSAP__User_Inboxes__r;
    VCSSAP__User_Inboxes__r__is_set = true;
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
   * element  : almond__Achievement_Assignments__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo almond__Achievement_Assignments__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","almond__Achievement_Assignments__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean almond__Achievement_Assignments__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult almond__Achievement_Assignments__r;

  public com.sforce.soap.enterprise.QueryResult getAlmond__Achievement_Assignments__r() {
    return almond__Achievement_Assignments__r;
  }

  

  public void setAlmond__Achievement_Assignments__r(com.sforce.soap.enterprise.QueryResult almond__Achievement_Assignments__r) {
    this.almond__Achievement_Assignments__r = almond__Achievement_Assignments__r;
    almond__Achievement_Assignments__r__is_set = true;
  }
  
  /**
   * element  : almond__Achievements__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo almond__Achievements__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","almond__Achievements__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean almond__Achievements__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult almond__Achievements__r;

  public com.sforce.soap.enterprise.QueryResult getAlmond__Achievements__r() {
    return almond__Achievements__r;
  }

  

  public void setAlmond__Achievements__r(com.sforce.soap.enterprise.QueryResult almond__Achievements__r) {
    this.almond__Achievements__r = almond__Achievements__r;
    almond__Achievements__r__is_set = true;
  }
  
  /**
   * element  : almond__Learning_Assignments1__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo almond__Learning_Assignments1__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","almond__Learning_Assignments1__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean almond__Learning_Assignments1__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult almond__Learning_Assignments1__r;

  public com.sforce.soap.enterprise.QueryResult getAlmond__Learning_Assignments1__r() {
    return almond__Learning_Assignments1__r;
  }

  

  public void setAlmond__Learning_Assignments1__r(com.sforce.soap.enterprise.QueryResult almond__Learning_Assignments1__r) {
    this.almond__Learning_Assignments1__r = almond__Learning_Assignments1__r;
    almond__Learning_Assignments1__r__is_set = true;
  }
  
  /**
   * element  : almond__Learning_Assignments__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo almond__Learning_Assignments__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","almond__Learning_Assignments__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean almond__Learning_Assignments__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult almond__Learning_Assignments__r;

  public com.sforce.soap.enterprise.QueryResult getAlmond__Learning_Assignments__r() {
    return almond__Learning_Assignments__r;
  }

  

  public void setAlmond__Learning_Assignments__r(com.sforce.soap.enterprise.QueryResult almond__Learning_Assignments__r) {
    this.almond__Learning_Assignments__r = almond__Learning_Assignments__r;
    almond__Learning_Assignments__r__is_set = true;
  }
  
  /**
   * element  : almond__Responses__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo almond__Responses__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","almond__Responses__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean almond__Responses__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult almond__Responses__r;

  public com.sforce.soap.enterprise.QueryResult getAlmond__Responses__r() {
    return almond__Responses__r;
  }

  

  public void setAlmond__Responses__r(com.sforce.soap.enterprise.QueryResult almond__Responses__r) {
    this.almond__Responses__r = almond__Responses__r;
    almond__Responses__r__is_set = true;
  }
  
  /**
   * element  : almond__Shared_Learning_Assignments1__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo almond__Shared_Learning_Assignments1__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","almond__Shared_Learning_Assignments1__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean almond__Shared_Learning_Assignments1__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult almond__Shared_Learning_Assignments1__r;

  public com.sforce.soap.enterprise.QueryResult getAlmond__Shared_Learning_Assignments1__r() {
    return almond__Shared_Learning_Assignments1__r;
  }

  

  public void setAlmond__Shared_Learning_Assignments1__r(com.sforce.soap.enterprise.QueryResult almond__Shared_Learning_Assignments1__r) {
    this.almond__Shared_Learning_Assignments1__r = almond__Shared_Learning_Assignments1__r;
    almond__Shared_Learning_Assignments1__r__is_set = true;
  }
  
  /**
   * element  : almond__Shared_Learning_Assignments__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo almond__Shared_Learning_Assignments__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","almond__Shared_Learning_Assignments__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean almond__Shared_Learning_Assignments__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult almond__Shared_Learning_Assignments__r;

  public com.sforce.soap.enterprise.QueryResult getAlmond__Shared_Learning_Assignments__r() {
    return almond__Shared_Learning_Assignments__r;
  }

  

  public void setAlmond__Shared_Learning_Assignments__r(com.sforce.soap.enterprise.QueryResult almond__Shared_Learning_Assignments__r) {
    this.almond__Shared_Learning_Assignments__r = almond__Shared_Learning_Assignments__r;
    almond__Shared_Learning_Assignments__r__is_set = true;
  }
  
  /**
   * element  : almond__Task_Approvers__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo almond__Task_Approvers__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","almond__Task_Approvers__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean almond__Task_Approvers__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult almond__Task_Approvers__r;

  public com.sforce.soap.enterprise.QueryResult getAlmond__Task_Approvers__r() {
    return almond__Task_Approvers__r;
  }

  

  public void setAlmond__Task_Approvers__r(com.sforce.soap.enterprise.QueryResult almond__Task_Approvers__r) {
    this.almond__Task_Approvers__r = almond__Task_Approvers__r;
    almond__Task_Approvers__r__is_set = true;
  }
  
  /**
   * element  : almond__Training_Plan_Access_Requests__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo almond__Training_Plan_Access_Requests__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","almond__Training_Plan_Access_Requests__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean almond__Training_Plan_Access_Requests__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult almond__Training_Plan_Access_Requests__r;

  public com.sforce.soap.enterprise.QueryResult getAlmond__Training_Plan_Access_Requests__r() {
    return almond__Training_Plan_Access_Requests__r;
  }

  

  public void setAlmond__Training_Plan_Access_Requests__r(com.sforce.soap.enterprise.QueryResult almond__Training_Plan_Access_Requests__r) {
    this.almond__Training_Plan_Access_Requests__r = almond__Training_Plan_Access_Requests__r;
    almond__Training_Plan_Access_Requests__r__is_set = true;
  }
  
  /**
   * element  : almond__Training_Plan_Assignments__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo almond__Training_Plan_Assignments__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","almond__Training_Plan_Assignments__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean almond__Training_Plan_Assignments__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult almond__Training_Plan_Assignments__r;

  public com.sforce.soap.enterprise.QueryResult getAlmond__Training_Plan_Assignments__r() {
    return almond__Training_Plan_Assignments__r;
  }

  

  public void setAlmond__Training_Plan_Assignments__r(com.sforce.soap.enterprise.QueryResult almond__Training_Plan_Assignments__r) {
    this.almond__Training_Plan_Assignments__r = almond__Training_Plan_Assignments__r;
    almond__Training_Plan_Assignments__r__is_set = true;
  }
  
  /**
   * element  : almond__Training_Plan_Feedbacks__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo almond__Training_Plan_Feedbacks__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","almond__Training_Plan_Feedbacks__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean almond__Training_Plan_Feedbacks__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult almond__Training_Plan_Feedbacks__r;

  public com.sforce.soap.enterprise.QueryResult getAlmond__Training_Plan_Feedbacks__r() {
    return almond__Training_Plan_Feedbacks__r;
  }

  

  public void setAlmond__Training_Plan_Feedbacks__r(com.sforce.soap.enterprise.QueryResult almond__Training_Plan_Feedbacks__r) {
    this.almond__Training_Plan_Feedbacks__r = almond__Training_Plan_Feedbacks__r;
    almond__Training_Plan_Feedbacks__r__is_set = true;
  }
  
  /**
   * element  : almond__Training_Plan_Section_Assignments__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo almond__Training_Plan_Section_Assignments__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","almond__Training_Plan_Section_Assignments__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean almond__Training_Plan_Section_Assignments__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult almond__Training_Plan_Section_Assignments__r;

  public com.sforce.soap.enterprise.QueryResult getAlmond__Training_Plan_Section_Assignments__r() {
    return almond__Training_Plan_Section_Assignments__r;
  }

  

  public void setAlmond__Training_Plan_Section_Assignments__r(com.sforce.soap.enterprise.QueryResult almond__Training_Plan_Section_Assignments__r) {
    this.almond__Training_Plan_Section_Assignments__r = almond__Training_Plan_Section_Assignments__r;
    almond__Training_Plan_Section_Assignments__r__is_set = true;
  }
  
  /**
   * element  : aos__X50_Point_Roles__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo aos__X50_Point_Roles__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","aos__X50_Point_Roles__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean aos__X50_Point_Roles__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult aos__X50_Point_Roles__r;

  public com.sforce.soap.enterprise.QueryResult getAos__X50_Point_Roles__r() {
    return aos__X50_Point_Roles__r;
  }

  

  public void setAos__X50_Point_Roles__r(com.sforce.soap.enterprise.QueryResult aos__X50_Point_Roles__r) {
    this.aos__X50_Point_Roles__r = aos__X50_Point_Roles__r;
    aos__X50_Point_Roles__r__is_set = true;
  }
  
  /**
   * element  : client_approval__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo client_approval__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","client_approval__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean client_approval__c__is_set = false;

  private java.lang.String client_approval__c;

  public java.lang.String getClient_approval__c() {
    return client_approval__c;
  }

  

  public void setClient_approval__c(java.lang.String client_approval__c) {
    this.client_approval__c = client_approval__c;
    client_approval__c__is_set = true;
  }
  
  /**
   * element  : client_approval__r of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo client_approval__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","client_approval__r","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean client_approval__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.User client_approval__r;

  public com.sforce.soap.enterprise.sobject.User getClient_approval__r() {
    return client_approval__r;
  }

  

  public void setClient_approval__r(com.sforce.soap.enterprise.sobject.User client_approval__r) {
    this.client_approval__r = client_approval__r;
    client_approval__r__is_set = true;
  }
  
  /**
   * element  : dupcheck__Duplicate_Check_Audits__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo dupcheck__Duplicate_Check_Audits__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dupcheck__Duplicate_Check_Audits__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean dupcheck__Duplicate_Check_Audits__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult dupcheck__Duplicate_Check_Audits__r;

  public com.sforce.soap.enterprise.QueryResult getDupcheck__Duplicate_Check_Audits__r() {
    return dupcheck__Duplicate_Check_Audits__r;
  }

  

  public void setDupcheck__Duplicate_Check_Audits__r(com.sforce.soap.enterprise.QueryResult dupcheck__Duplicate_Check_Audits__r) {
    this.dupcheck__Duplicate_Check_Audits__r = dupcheck__Duplicate_Check_Audits__r;
    dupcheck__Duplicate_Check_Audits__r__is_set = true;
  }
  
  /**
   * element  : dupcheck__dc3DisableDuplicateCheck__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo dupcheck__dc3DisableDuplicateCheck__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dupcheck__dc3DisableDuplicateCheck__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean dupcheck__dc3DisableDuplicateCheck__c__is_set = false;

  private java.lang.Boolean dupcheck__dc3DisableDuplicateCheck__c;

  public java.lang.Boolean getDupcheck__dc3DisableDuplicateCheck__c() {
    return dupcheck__dc3DisableDuplicateCheck__c;
  }

  

  public void setDupcheck__dc3DisableDuplicateCheck__c(java.lang.Boolean dupcheck__dc3DisableDuplicateCheck__c) {
    this.dupcheck__dc3DisableDuplicateCheck__c = dupcheck__dc3DisableDuplicateCheck__c;
    dupcheck__dc3DisableDuplicateCheck__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Agreements1__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Agreements1__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Agreements1__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean echosign_dev1__Agreements1__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult echosign_dev1__Agreements1__r;

  public com.sforce.soap.enterprise.QueryResult getEchosign_dev1__Agreements1__r() {
    return echosign_dev1__Agreements1__r;
  }

  

  public void setEchosign_dev1__Agreements1__r(com.sforce.soap.enterprise.QueryResult echosign_dev1__Agreements1__r) {
    this.echosign_dev1__Agreements1__r = echosign_dev1__Agreements1__r;
    echosign_dev1__Agreements1__r__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Agreements2__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Agreements2__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Agreements2__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean echosign_dev1__Agreements2__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult echosign_dev1__Agreements2__r;

  public com.sforce.soap.enterprise.QueryResult getEchosign_dev1__Agreements2__r() {
    return echosign_dev1__Agreements2__r;
  }

  

  public void setEchosign_dev1__Agreements2__r(com.sforce.soap.enterprise.QueryResult echosign_dev1__Agreements2__r) {
    this.echosign_dev1__Agreements2__r = echosign_dev1__Agreements2__r;
    echosign_dev1__Agreements2__r__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Agreements3__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Agreements3__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Agreements3__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean echosign_dev1__Agreements3__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult echosign_dev1__Agreements3__r;

  public com.sforce.soap.enterprise.QueryResult getEchosign_dev1__Agreements3__r() {
    return echosign_dev1__Agreements3__r;
  }

  

  public void setEchosign_dev1__Agreements3__r(com.sforce.soap.enterprise.QueryResult echosign_dev1__Agreements3__r) {
    this.echosign_dev1__Agreements3__r = echosign_dev1__Agreements3__r;
    echosign_dev1__Agreements3__r__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Agreements_Senders__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Agreements_Senders__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Agreements_Senders__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean echosign_dev1__Agreements_Senders__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult echosign_dev1__Agreements_Senders__r;

  public com.sforce.soap.enterprise.QueryResult getEchosign_dev1__Agreements_Senders__r() {
    return echosign_dev1__Agreements_Senders__r;
  }

  

  public void setEchosign_dev1__Agreements_Senders__r(com.sforce.soap.enterprise.QueryResult echosign_dev1__Agreements_Senders__r) {
    this.echosign_dev1__Agreements_Senders__r = echosign_dev1__Agreements_Senders__r;
    echosign_dev1__Agreements_Senders__r__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Agreements__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Agreements__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Agreements__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean echosign_dev1__Agreements__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult echosign_dev1__Agreements__r;

  public com.sforce.soap.enterprise.QueryResult getEchosign_dev1__Agreements__r() {
    return echosign_dev1__Agreements__r;
  }

  

  public void setEchosign_dev1__Agreements__r(com.sforce.soap.enterprise.QueryResult echosign_dev1__Agreements__r) {
    this.echosign_dev1__Agreements__r = echosign_dev1__Agreements__r;
    echosign_dev1__Agreements__r__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__EchoSign_Allow_Delegated_Sending__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__EchoSign_Allow_Delegated_Sending__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__EchoSign_Allow_Delegated_Sending__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean echosign_dev1__EchoSign_Allow_Delegated_Sending__c__is_set = false;

  private java.lang.Boolean echosign_dev1__EchoSign_Allow_Delegated_Sending__c;

  public java.lang.Boolean getEchosign_dev1__EchoSign_Allow_Delegated_Sending__c() {
    return echosign_dev1__EchoSign_Allow_Delegated_Sending__c;
  }

  

  public void setEchosign_dev1__EchoSign_Allow_Delegated_Sending__c(java.lang.Boolean echosign_dev1__EchoSign_Allow_Delegated_Sending__c) {
    this.echosign_dev1__EchoSign_Allow_Delegated_Sending__c = echosign_dev1__EchoSign_Allow_Delegated_Sending__c;
    echosign_dev1__EchoSign_Allow_Delegated_Sending__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__EchoSign_Email_Verified__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__EchoSign_Email_Verified__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__EchoSign_Email_Verified__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean echosign_dev1__EchoSign_Email_Verified__c__is_set = false;

  private java.lang.Boolean echosign_dev1__EchoSign_Email_Verified__c;

  public java.lang.Boolean getEchosign_dev1__EchoSign_Email_Verified__c() {
    return echosign_dev1__EchoSign_Email_Verified__c;
  }

  

  public void setEchosign_dev1__EchoSign_Email_Verified__c(java.lang.Boolean echosign_dev1__EchoSign_Email_Verified__c) {
    this.echosign_dev1__EchoSign_Email_Verified__c = echosign_dev1__EchoSign_Email_Verified__c;
    echosign_dev1__EchoSign_Email_Verified__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Echosign_Recipients__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Echosign_Recipients__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Echosign_Recipients__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean echosign_dev1__Echosign_Recipients__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult echosign_dev1__Echosign_Recipients__r;

  public com.sforce.soap.enterprise.QueryResult getEchosign_dev1__Echosign_Recipients__r() {
    return echosign_dev1__Echosign_Recipients__r;
  }

  

  public void setEchosign_dev1__Echosign_Recipients__r(com.sforce.soap.enterprise.QueryResult echosign_dev1__Echosign_Recipients__r) {
    this.echosign_dev1__Echosign_Recipients__r = echosign_dev1__Echosign_Recipients__r;
    echosign_dev1__Echosign_Recipients__r__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Process_Templates__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Process_Templates__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Process_Templates__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean echosign_dev1__Process_Templates__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult echosign_dev1__Process_Templates__r;

  public com.sforce.soap.enterprise.QueryResult getEchosign_dev1__Process_Templates__r() {
    return echosign_dev1__Process_Templates__r;
  }

  

  public void setEchosign_dev1__Process_Templates__r(com.sforce.soap.enterprise.QueryResult echosign_dev1__Process_Templates__r) {
    this.echosign_dev1__Process_Templates__r = echosign_dev1__Process_Templates__r;
    echosign_dev1__Process_Templates__r__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Recipient_Templates__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Recipient_Templates__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Recipient_Templates__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean echosign_dev1__Recipient_Templates__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult echosign_dev1__Recipient_Templates__r;

  public com.sforce.soap.enterprise.QueryResult getEchosign_dev1__Recipient_Templates__r() {
    return echosign_dev1__Recipient_Templates__r;
  }

  

  public void setEchosign_dev1__Recipient_Templates__r(com.sforce.soap.enterprise.QueryResult echosign_dev1__Recipient_Templates__r) {
    this.echosign_dev1__Recipient_Templates__r = echosign_dev1__Recipient_Templates__r;
    echosign_dev1__Recipient_Templates__r__is_set = true;
  }
  
  /**
   * element  : i__AAUserPrefs__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo i__AAUserPrefs__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__AAUserPrefs__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean i__AAUserPrefs__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult i__AAUserPrefs__r;

  public com.sforce.soap.enterprise.QueryResult getI__AAUserPrefs__r() {
    return i__AAUserPrefs__r;
  }

  

  public void setI__AAUserPrefs__r(com.sforce.soap.enterprise.QueryResult i__AAUserPrefs__r) {
    this.i__AAUserPrefs__r = i__AAUserPrefs__r;
    i__AAUserPrefs__r__is_set = true;
  }
  
  /**
   * element  : i__EmailAddrs__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo i__EmailAddrs__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__EmailAddrs__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean i__EmailAddrs__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult i__EmailAddrs__r;

  public com.sforce.soap.enterprise.QueryResult getI__EmailAddrs__r() {
    return i__EmailAddrs__r;
  }

  

  public void setI__EmailAddrs__r(com.sforce.soap.enterprise.QueryResult i__EmailAddrs__r) {
    this.i__EmailAddrs__r = i__EmailAddrs__r;
    i__EmailAddrs__r__is_set = true;
  }
  
  /**
   * element  : i__R00N700000028MRVEA2__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo i__R00N700000028MRVEA2__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__R00N700000028MRVEA2__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean i__R00N700000028MRVEA2__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult i__R00N700000028MRVEA2__r;

  public com.sforce.soap.enterprise.QueryResult getI__R00N700000028MRVEA2__r() {
    return i__R00N700000028MRVEA2__r;
  }

  

  public void setI__R00N700000028MRVEA2__r(com.sforce.soap.enterprise.QueryResult i__R00N700000028MRVEA2__r) {
    this.i__R00N700000028MRVEA2__r = i__R00N700000028MRVEA2__r;
    i__R00N700000028MRVEA2__r__is_set = true;
  }
  
  /**
   * element  : i__R00N700000028MSBEA2__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo i__R00N700000028MSBEA2__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__R00N700000028MSBEA2__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean i__R00N700000028MSBEA2__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult i__R00N700000028MSBEA2__r;

  public com.sforce.soap.enterprise.QueryResult getI__R00N700000028MSBEA2__r() {
    return i__R00N700000028MSBEA2__r;
  }

  

  public void setI__R00N700000028MSBEA2__r(com.sforce.soap.enterprise.QueryResult i__R00N700000028MSBEA2__r) {
    this.i__R00N700000028MSBEA2__r = i__R00N700000028MSBEA2__r;
    i__R00N700000028MSBEA2__r__is_set = true;
  }
  
  /**
   * element  : i__R00N700000028QWKEA2__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo i__R00N700000028QWKEA2__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__R00N700000028QWKEA2__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean i__R00N700000028QWKEA2__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult i__R00N700000028QWKEA2__r;

  public com.sforce.soap.enterprise.QueryResult getI__R00N700000028QWKEA2__r() {
    return i__R00N700000028QWKEA2__r;
  }

  

  public void setI__R00N700000028QWKEA2__r(com.sforce.soap.enterprise.QueryResult i__R00N700000028QWKEA2__r) {
    this.i__R00N700000028QWKEA2__r = i__R00N700000028QWKEA2__r;
    i__R00N700000028QWKEA2__r__is_set = true;
  }
  
  /**
   * element  : i__R00N700000028QWREA2__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo i__R00N700000028QWREA2__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__R00N700000028QWREA2__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean i__R00N700000028QWREA2__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult i__R00N700000028QWREA2__r;

  public com.sforce.soap.enterprise.QueryResult getI__R00N700000028QWREA2__r() {
    return i__R00N700000028QWREA2__r;
  }

  

  public void setI__R00N700000028QWREA2__r(com.sforce.soap.enterprise.QueryResult i__R00N700000028QWREA2__r) {
    this.i__R00N700000028QWREA2__r = i__R00N700000028QWREA2__r;
    i__R00N700000028QWREA2__r__is_set = true;
  }
  
  /**
   * element  : punch__HideOnPunchboard__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo punch__HideOnPunchboard__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","punch__HideOnPunchboard__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean punch__HideOnPunchboard__c__is_set = false;

  private java.lang.Boolean punch__HideOnPunchboard__c;

  public java.lang.Boolean getPunch__HideOnPunchboard__c() {
    return punch__HideOnPunchboard__c;
  }

  

  public void setPunch__HideOnPunchboard__c(java.lang.Boolean punch__HideOnPunchboard__c) {
    this.punch__HideOnPunchboard__c = punch__HideOnPunchboard__c;
    punch__HideOnPunchboard__c__is_set = true;
  }
  
  /**
   * element  : punch__LastDate__c of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo punch__LastDate__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","punch__LastDate__c","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean punch__LastDate__c__is_set = false;

  private java.util.Calendar punch__LastDate__c;

  public java.util.Calendar getPunch__LastDate__c() {
    return punch__LastDate__c;
  }

  

  public void setPunch__LastDate__c(java.util.Calendar punch__LastDate__c) {
    this.punch__LastDate__c = punch__LastDate__c;
    punch__LastDate__c__is_set = true;
  }
  
  /**
   * element  : punch__LastDescription__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo punch__LastDescription__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","punch__LastDescription__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean punch__LastDescription__c__is_set = false;

  private java.lang.String punch__LastDescription__c;

  public java.lang.String getPunch__LastDescription__c() {
    return punch__LastDescription__c;
  }

  

  public void setPunch__LastDescription__c(java.lang.String punch__LastDescription__c) {
    this.punch__LastDescription__c = punch__LastDescription__c;
    punch__LastDescription__c__is_set = true;
  }
  
  /**
   * element  : punch__LastEstimatedReturn__c of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo punch__LastEstimatedReturn__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","punch__LastEstimatedReturn__c","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean punch__LastEstimatedReturn__c__is_set = false;

  private java.util.Calendar punch__LastEstimatedReturn__c;

  public java.util.Calendar getPunch__LastEstimatedReturn__c() {
    return punch__LastEstimatedReturn__c;
  }

  

  public void setPunch__LastEstimatedReturn__c(java.util.Calendar punch__LastEstimatedReturn__c) {
    this.punch__LastEstimatedReturn__c = punch__LastEstimatedReturn__c;
    punch__LastEstimatedReturn__c__is_set = true;
  }
  
  /**
   * element  : punch__LastStatus__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo punch__LastStatus__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","punch__LastStatus__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean punch__LastStatus__c__is_set = false;

  private java.lang.String punch__LastStatus__c;

  public java.lang.String getPunch__LastStatus__c() {
    return punch__LastStatus__c;
  }

  

  public void setPunch__LastStatus__c(java.lang.String punch__LastStatus__c) {
    this.punch__LastStatus__c = punch__LastStatus__c;
    punch__LastStatus__c__is_set = true;
  }
  
  /**
   * element  : rh2__Describes__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Describes__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Describes__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean rh2__Describes__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult rh2__Describes__r;

  public com.sforce.soap.enterprise.QueryResult getRh2__Describes__r() {
    return rh2__Describes__r;
  }

  

  public void setRh2__Describes__r(com.sforce.soap.enterprise.QueryResult rh2__Describes__r) {
    this.rh2__Describes__r = rh2__Describes__r;
    rh2__Describes__r__is_set = true;
  }
  
  /**
   * element  : simplesurvey__Survey_Configurations__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo simplesurvey__Survey_Configurations__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","simplesurvey__Survey_Configurations__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean simplesurvey__Survey_Configurations__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult simplesurvey__Survey_Configurations__r;

  public com.sforce.soap.enterprise.QueryResult getSimplesurvey__Survey_Configurations__r() {
    return simplesurvey__Survey_Configurations__r;
  }

  

  public void setSimplesurvey__Survey_Configurations__r(com.sforce.soap.enterprise.QueryResult simplesurvey__Survey_Configurations__r) {
    this.simplesurvey__Survey_Configurations__r = simplesurvey__Survey_Configurations__r;
    simplesurvey__Survey_Configurations__r__is_set = true;
  }
  
  /**
   * element  : simplesurvey__Surveys__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo simplesurvey__Surveys__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","simplesurvey__Surveys__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean simplesurvey__Surveys__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult simplesurvey__Surveys__r;

  public com.sforce.soap.enterprise.QueryResult getSimplesurvey__Surveys__r() {
    return simplesurvey__Surveys__r;
  }

  

  public void setSimplesurvey__Surveys__r(com.sforce.soap.enterprise.QueryResult simplesurvey__Surveys__r) {
    this.simplesurvey__Surveys__r = simplesurvey__Surveys__r;
    simplesurvey__Surveys__r__is_set = true;
  }
  
  /**
   * element  : smagicinteract__SMS_History__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo smagicinteract__SMS_History__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","smagicinteract__SMS_History__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean smagicinteract__SMS_History__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult smagicinteract__SMS_History__r;

  public com.sforce.soap.enterprise.QueryResult getSmagicinteract__SMS_History__r() {
    return smagicinteract__SMS_History__r;
  }

  

  public void setSmagicinteract__SMS_History__r(com.sforce.soap.enterprise.QueryResult smagicinteract__SMS_History__r) {
    this.smagicinteract__SMS_History__r = smagicinteract__SMS_History__r;
    smagicinteract__SMS_History__r__is_set = true;
  }
  
  /**
   * element  : smagicinteract__forward_configs__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo smagicinteract__forward_configs__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","smagicinteract__forward_configs__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean smagicinteract__forward_configs__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult smagicinteract__forward_configs__r;

  public com.sforce.soap.enterprise.QueryResult getSmagicinteract__forward_configs__r() {
    return smagicinteract__forward_configs__r;
  }

  

  public void setSmagicinteract__forward_configs__r(com.sforce.soap.enterprise.QueryResult smagicinteract__forward_configs__r) {
    this.smagicinteract__forward_configs__r = smagicinteract__forward_configs__r;
    smagicinteract__forward_configs__r__is_set = true;
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
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "User");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, AboutMe__typeInfo, AboutMe, AboutMe__is_set);
    __typeMapper.writeObject(__out, AcceptedEventRelations__typeInfo, AcceptedEventRelations, AcceptedEventRelations__is_set);
    __typeMapper.writeObject(__out, Account__typeInfo, Account, Account__is_set);
    __typeMapper.writeString(__out, AccountId__typeInfo, AccountId, AccountId__is_set);
    __typeMapper.writeObject(__out, Accounts__r__typeInfo, Accounts__r, Accounts__r__is_set);
    __typeMapper.writeObject(__out, Address__typeInfo, Address, Address__is_set);
    __typeMapper.writeObject(__out, Admin_Employees__r__typeInfo, Admin_Employees__r, Admin_Employees__r__is_set);
    __typeMapper.writeString(__out, Alias__typeInfo, Alias, Alias__is_set);
    __typeMapper.writeObject(__out, Applicants__r__typeInfo, Applicants__r, Applicants__r__is_set);
    __typeMapper.writeObject(__out, Assignments1__r__typeInfo, Assignments1__r, Assignments1__r__is_set);
    __typeMapper.writeObject(__out, Assignments2__r__typeInfo, Assignments2__r, Assignments2__r__is_set);
    __typeMapper.writeObject(__out, Assignments__r__typeInfo, Assignments__r, Assignments__r__is_set);
    __typeMapper.writeObject(__out, AttachedContentDocuments__typeInfo, AttachedContentDocuments, AttachedContentDocuments__is_set);
    __typeMapper.writeObject(__out, AttachedContentNotes__typeInfo, AttachedContentNotes, AttachedContentNotes__is_set);
    __typeMapper.writeString(__out, BadgeText__typeInfo, BadgeText, BadgeText__is_set);
    __typeMapper.writeObject(__out, Badges__typeInfo, Badges, Badges__is_set);
    __typeMapper.writeString(__out, BannerPhotoUrl__typeInfo, BannerPhotoUrl, BannerPhotoUrl__is_set);
    __typeMapper.writeObject(__out, Budgets_and_Actuals__r__typeInfo, Budgets_and_Actuals__r, Budgets_and_Actuals__r__is_set);
    __typeMapper.writeObject(__out, Business_Services1__r__typeInfo, Business_Services1__r, Business_Services1__r__is_set);
    __typeMapper.writeObject(__out, Business_Services__r__typeInfo, Business_Services__r, Business_Services__r__is_set);
    __typeMapper.writeString(__out, CallCenterId__typeInfo, CallCenterId, CallCenterId__is_set);
    __typeMapper.writeObject(__out, Candidate_Geocodes__r__typeInfo, Candidate_Geocodes__r, Candidate_Geocodes__r__is_set);
    __typeMapper.writeObject(__out, Case_Swarm_Rules__r__typeInfo, Case_Swarm_Rules__r, Case_Swarm_Rules__r__is_set);
    __typeMapper.writeObject(__out, Cases__r__typeInfo, Cases__r, Cases__r__is_set);
    __typeMapper.writeString(__out, City__typeInfo, City, City__is_set);
    __typeMapper.writeObject(__out, CombinedAttachments__typeInfo, CombinedAttachments, CombinedAttachments__is_set);
    __typeMapper.writeString(__out, CommunityNickname__typeInfo, CommunityNickname, CommunityNickname__is_set);
    __typeMapper.writeString(__out, CompanyName__typeInfo, CompanyName, CompanyName__is_set);
    __typeMapper.writeString(__out, Consultant_ID__c__typeInfo, Consultant_ID__c, Consultant_ID__c__is_set);
    __typeMapper.writeObject(__out, Contact__typeInfo, Contact, Contact__is_set);
    __typeMapper.writeString(__out, ContactId__typeInfo, ContactId, ContactId__is_set);
    __typeMapper.writeObject(__out, Contacts__r__typeInfo, Contacts__r, Contacts__r__is_set);
    __typeMapper.writeObject(__out, ContentDocumentLinks__typeInfo, ContentDocumentLinks, ContentDocumentLinks__is_set);
    __typeMapper.writeObject(__out, ContractsSigned__typeInfo, ContractsSigned, ContractsSigned__is_set);
    __typeMapper.writeString(__out, Country__typeInfo, Country, Country__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeObject(__out, DeclinedEventRelations__typeInfo, DeclinedEventRelations, DeclinedEventRelations__is_set);
    __typeMapper.writeString(__out, DefaultGroupNotificationFrequency__typeInfo, DefaultGroupNotificationFrequency, DefaultGroupNotificationFrequency__is_set);
    __typeMapper.writeString(__out, DelegatedApproverId__typeInfo, DelegatedApproverId, DelegatedApproverId__is_set);
    __typeMapper.writeObject(__out, DelegatedUsers__typeInfo, DelegatedUsers, DelegatedUsers__is_set);
    __typeMapper.writeString(__out, Department__typeInfo, Department, Department__is_set);
    __typeMapper.writeString(__out, DigestFrequency__typeInfo, DigestFrequency, DigestFrequency__is_set);
    __typeMapper.writeString(__out, Division__typeInfo, Division, Division__is_set);
    __typeMapper.writeString(__out, Email__typeInfo, Email, Email__is_set);
    __typeMapper.writeString(__out, EmailEncodingKey__typeInfo, EmailEncodingKey, EmailEncodingKey__is_set);
    __typeMapper.writeObject(__out, EmailMessageRelations__typeInfo, EmailMessageRelations, EmailMessageRelations__is_set);
    __typeMapper.writeObject(__out, EmailPreferencesAutoBcc__typeInfo, EmailPreferencesAutoBcc, EmailPreferencesAutoBcc__is_set);
    __typeMapper.writeObject(__out, EmailPreferencesAutoBccStayInTouch__typeInfo, EmailPreferencesAutoBccStayInTouch, EmailPreferencesAutoBccStayInTouch__is_set);
    __typeMapper.writeObject(__out, EmailPreferencesStayInTouchReminder__typeInfo, EmailPreferencesStayInTouchReminder, EmailPreferencesStayInTouchReminder__is_set);
    __typeMapper.writeString(__out, EmployeeNumber__typeInfo, EmployeeNumber, EmployeeNumber__is_set);
    __typeMapper.writeObject(__out, EventRelations__typeInfo, EventRelations, EventRelations__is_set);
    __typeMapper.writeString(__out, Extension__typeInfo, Extension, Extension__is_set);
    __typeMapper.writeObject(__out, ExternalDataUserAuths__typeInfo, ExternalDataUserAuths, ExternalDataUserAuths__is_set);
    __typeMapper.writeString(__out, Fax__typeInfo, Fax, Fax__is_set);
    __typeMapper.writeString(__out, FederationIdentifier__typeInfo, FederationIdentifier, FederationIdentifier__is_set);
    __typeMapper.writeObject(__out, FeedSubscriptions__typeInfo, FeedSubscriptions, FeedSubscriptions__is_set);
    __typeMapper.writeObject(__out, FeedSubscriptionsForEntity__typeInfo, FeedSubscriptionsForEntity, FeedSubscriptionsForEntity__is_set);
    __typeMapper.writeObject(__out, Feed_Post_Swarm_Rules__r__typeInfo, Feed_Post_Swarm_Rules__r, Feed_Post_Swarm_Rules__r__is_set);
    __typeMapper.writeObject(__out, Feeds__typeInfo, Feeds, Feeds__is_set);
    __typeMapper.writeString(__out, FirstName__typeInfo, FirstName, FirstName__is_set);
    __typeMapper.writeObject(__out, ForecastEnabled__typeInfo, ForecastEnabled, ForecastEnabled__is_set);
    __typeMapper.writeString(__out, FullPhotoUrl__typeInfo, FullPhotoUrl, FullPhotoUrl__is_set);
    __typeMapper.writeString(__out, GeocodeAccuracy__typeInfo, GeocodeAccuracy, GeocodeAccuracy__is_set);
    __typeMapper.writeObject(__out, GivenThanks__typeInfo, GivenThanks, GivenThanks__is_set);
    __typeMapper.writeObject(__out, GroupMembershipRequests__typeInfo, GroupMembershipRequests, GroupMembershipRequests__is_set);
    __typeMapper.writeObject(__out, GroupMemberships__typeInfo, GroupMemberships, GroupMemberships__is_set);
    __typeMapper.writeObject(__out, InstalledMobileApps__typeInfo, InstalledMobileApps, InstalledMobileApps__is_set);
    __typeMapper.writeObject(__out, IsActive__typeInfo, IsActive, IsActive__is_set);
    __typeMapper.writeObject(__out, IsPortalEnabled__typeInfo, IsPortalEnabled, IsPortalEnabled__is_set);
    __typeMapper.writeObject(__out, IsProfilePhotoActive__typeInfo, IsProfilePhotoActive, IsProfilePhotoActive__is_set);
    __typeMapper.writeString(__out, LanguageLocaleKey__typeInfo, LanguageLocaleKey, LanguageLocaleKey__is_set);
    __typeMapper.writeObject(__out, LastLoginDate__typeInfo, LastLoginDate, LastLoginDate__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeString(__out, LastName__typeInfo, LastName, LastName__is_set);
    __typeMapper.writeObject(__out, LastPasswordChangeDate__typeInfo, LastPasswordChangeDate, LastPasswordChangeDate__is_set);
    __typeMapper.writeObject(__out, LastReferencedDate__typeInfo, LastReferencedDate, LastReferencedDate__is_set);
    __typeMapper.writeObject(__out, LastViewedDate__typeInfo, LastViewedDate, LastViewedDate__is_set);
    __typeMapper.writeObject(__out, Latitude__typeInfo, Latitude, Latitude__is_set);
    __typeMapper.writeObject(__out, Lead_Swarm_Rules__r__typeInfo, Lead_Swarm_Rules__r, Lead_Swarm_Rules__r__is_set);
    __typeMapper.writeString(__out, LocaleSidKey__typeInfo, LocaleSidKey, LocaleSidKey__is_set);
    __typeMapper.writeObject(__out, Longitude__typeInfo, Longitude, Longitude__is_set);
    __typeMapper.writeObject(__out, MME__EmailMessages__r__typeInfo, MME__EmailMessages__r, MME__EmailMessages__r__is_set);
    __typeMapper.writeObject(__out, ManagedUsers__typeInfo, ManagedUsers, ManagedUsers__is_set);
    __typeMapper.writeObject(__out, Manager__typeInfo, Manager, Manager__is_set);
    __typeMapper.writeString(__out, ManagerId__typeInfo, ManagerId, ManagerId__is_set);
    __typeMapper.writeString(__out, MediumBannerPhotoUrl__typeInfo, MediumBannerPhotoUrl, MediumBannerPhotoUrl__is_set);
    __typeMapper.writeString(__out, MediumPhotoUrl__typeInfo, MediumPhotoUrl, MediumPhotoUrl__is_set);
    __typeMapper.writeString(__out, MobilePhone__typeInfo, MobilePhone, MobilePhone__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeObject(__out, OfflinePdaTrialExpirationDate__typeInfo, OfflinePdaTrialExpirationDate, OfflinePdaTrialExpirationDate__is_set);
    __typeMapper.writeObject(__out, OfflineTrialExpirationDate__typeInfo, OfflineTrialExpirationDate, OfflineTrialExpirationDate__is_set);
    __typeMapper.writeObject(__out, Opportunities__r__typeInfo, Opportunities__r, Opportunities__r__is_set);
    __typeMapper.writeObject(__out, Opportunity_Swarm_Rules__r__typeInfo, Opportunity_Swarm_Rules__r, Opportunity_Swarm_Rules__r__is_set);
    __typeMapper.writeObject(__out, Order_Swarm_Rules__r__typeInfo, Order_Swarm_Rules__r, Order_Swarm_Rules__r__is_set);
    __typeMapper.writeObject(__out, Orders1__r__typeInfo, Orders1__r, Orders1__r__is_set);
    __typeMapper.writeObject(__out, Orders2__r__typeInfo, Orders2__r, Orders2__r__is_set);
    __typeMapper.writeObject(__out, Orders3__r__typeInfo, Orders3__r, Orders3__r__is_set);
    __typeMapper.writeObject(__out, Orders4__r__typeInfo, Orders4__r, Orders4__r__is_set);
    __typeMapper.writeObject(__out, Orders5__r__typeInfo, Orders5__r, Orders5__r__is_set);
    __typeMapper.writeObject(__out, Orders__r__typeInfo, Orders__r, Orders__r__is_set);
    __typeMapper.writeObject(__out, OwnedContentDocuments__typeInfo, OwnedContentDocuments, OwnedContentDocuments__is_set);
    __typeMapper.writeObject(__out, PermissionSetAssignments__typeInfo, PermissionSetAssignments, PermissionSetAssignments__is_set);
    __typeMapper.writeObject(__out, PermissionSetLicenseAssignments__typeInfo, PermissionSetLicenseAssignments, PermissionSetLicenseAssignments__is_set);
    __typeMapper.writeString(__out, Phone__typeInfo, Phone, Phone__is_set);
    __typeMapper.writeString(__out, PortalRole__typeInfo, PortalRole, PortalRole__is_set);
    __typeMapper.writeString(__out, PostalCode__typeInfo, PostalCode, PostalCode__is_set);
    __typeMapper.writeObject(__out, Profile__typeInfo, Profile, Profile__is_set);
    __typeMapper.writeString(__out, ProfileId__typeInfo, ProfileId, ProfileId__is_set);
    __typeMapper.writeObject(__out, Proxy__r__typeInfo, Proxy__r, Proxy__r__is_set);
    __typeMapper.writeObject(__out, QuestionSubscriptions__typeInfo, QuestionSubscriptions, QuestionSubscriptions__is_set);
    __typeMapper.writeObject(__out, R00N30000001eUPVEA2__r__typeInfo, R00N30000001eUPVEA2__r, R00N30000001eUPVEA2__r__is_set);
    __typeMapper.writeObject(__out, ReceivesAdminInfoEmails__typeInfo, ReceivesAdminInfoEmails, ReceivesAdminInfoEmails__is_set);
    __typeMapper.writeObject(__out, ReceivesInfoEmails__typeInfo, ReceivesInfoEmails, ReceivesInfoEmails__is_set);
    __typeMapper.writeObject(__out, Regions1__r__typeInfo, Regions1__r, Regions1__r__is_set);
    __typeMapper.writeObject(__out, Regions2__r__typeInfo, Regions2__r, Regions2__r__is_set);
    __typeMapper.writeObject(__out, Regions__r__typeInfo, Regions__r, Regions__r__is_set);
    __typeMapper.writeObject(__out, Revenues1__r__typeInfo, Revenues1__r, Revenues1__r__is_set);
    __typeMapper.writeObject(__out, Revenues__r__typeInfo, Revenues__r, Revenues__r__is_set);
    __typeMapper.writeObject(__out, Rogue_Payment_Objects__r__typeInfo, Rogue_Payment_Objects__r, Rogue_Payment_Objects__r__is_set);
    __typeMapper.writeObject(__out, S4STEO__TransferOwnersNewOwner__r__typeInfo, S4STEO__TransferOwnersNewOwner__r, S4STEO__TransferOwnersNewOwner__r__is_set);
    __typeMapper.writeObject(__out, S4STEO__TransferOwnersOldOwner__r__typeInfo, S4STEO__TransferOwnersOldOwner__r, S4STEO__TransferOwnersOldOwner__r__is_set);
    __typeMapper.writeObject(__out, Safety_Actions__r__typeInfo, Safety_Actions__r, Safety_Actions__r__is_set);
    __typeMapper.writeString(__out, SenderEmail__typeInfo, SenderEmail, SenderEmail__is_set);
    __typeMapper.writeString(__out, SenderName__typeInfo, SenderName, SenderName__is_set);
    __typeMapper.writeObject(__out, Shares__typeInfo, Shares, Shares__is_set);
    __typeMapper.writeString(__out, Signature__typeInfo, Signature, Signature__is_set);
    __typeMapper.writeString(__out, SmallBannerPhotoUrl__typeInfo, SmallBannerPhotoUrl, SmallBannerPhotoUrl__is_set);
    __typeMapper.writeString(__out, SmallPhotoUrl__typeInfo, SmallPhotoUrl, SmallPhotoUrl__is_set);
    __typeMapper.writeString(__out, State__typeInfo, State, State__is_set);
    __typeMapper.writeString(__out, StayInTouchNote__typeInfo, StayInTouchNote, StayInTouchNote__is_set);
    __typeMapper.writeString(__out, StayInTouchSignature__typeInfo, StayInTouchSignature, StayInTouchSignature__is_set);
    __typeMapper.writeString(__out, StayInTouchSubject__typeInfo, StayInTouchSubject, StayInTouchSubject__is_set);
    __typeMapper.writeString(__out, Street__typeInfo, Street, Street__is_set);
    __typeMapper.writeObject(__out, Surveys__r__typeInfo, Surveys__r, Surveys__r__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeString(__out, TimeZoneSidKey__typeInfo, TimeZoneSidKey, TimeZoneSidKey__is_set);
    __typeMapper.writeObject(__out, TimesheetsSubmitted__r__typeInfo, TimesheetsSubmitted__r, TimesheetsSubmitted__r__is_set);
    __typeMapper.writeObject(__out, Timesheets__r__typeInfo, Timesheets__r, Timesheets__r__is_set);
    __typeMapper.writeString(__out, Title__typeInfo, Title, Title__is_set);
    __typeMapper.writeObject(__out, Training_Participants__r__typeInfo, Training_Participants__r, Training_Participants__r__is_set);
    __typeMapper.writeObject(__out, USERHISTORY__User_History_Changed_By__r__typeInfo, USERHISTORY__User_History_Changed_By__r, USERHISTORY__User_History_Changed_By__r__is_set);
    __typeMapper.writeObject(__out, USERHISTORY__User_History_User__r__typeInfo, USERHISTORY__User_History_User__r, USERHISTORY__User_History_User__r__is_set);
    __typeMapper.writeObject(__out, UndecidedEventRelations__typeInfo, UndecidedEventRelations, UndecidedEventRelations__is_set);
    __typeMapper.writeObject(__out, Unverified_Time__r__typeInfo, Unverified_Time__r, Unverified_Time__r__is_set);
    __typeMapper.writeObject(__out, UserEntityAccessRights__typeInfo, UserEntityAccessRights, UserEntityAccessRights__is_set);
    __typeMapper.writeObject(__out, UserFieldAccessRights__typeInfo, UserFieldAccessRights, UserFieldAccessRights__is_set);
    __typeMapper.writeObject(__out, UserPermissionsAvantgoUser__typeInfo, UserPermissionsAvantgoUser, UserPermissionsAvantgoUser__is_set);
    __typeMapper.writeObject(__out, UserPermissionsCallCenterAutoLogin__typeInfo, UserPermissionsCallCenterAutoLogin, UserPermissionsCallCenterAutoLogin__is_set);
    __typeMapper.writeObject(__out, UserPermissionsChatterAnswersUser__typeInfo, UserPermissionsChatterAnswersUser, UserPermissionsChatterAnswersUser__is_set);
    __typeMapper.writeObject(__out, UserPermissionsInteractionUser__typeInfo, UserPermissionsInteractionUser, UserPermissionsInteractionUser__is_set);
    __typeMapper.writeObject(__out, UserPermissionsKnowledgeUser__typeInfo, UserPermissionsKnowledgeUser, UserPermissionsKnowledgeUser__is_set);
    __typeMapper.writeObject(__out, UserPermissionsMarketingUser__typeInfo, UserPermissionsMarketingUser, UserPermissionsMarketingUser__is_set);
    __typeMapper.writeObject(__out, UserPermissionsMobileUser__typeInfo, UserPermissionsMobileUser, UserPermissionsMobileUser__is_set);
    __typeMapper.writeObject(__out, UserPermissionsOfflineUser__typeInfo, UserPermissionsOfflineUser, UserPermissionsOfflineUser__is_set);
    __typeMapper.writeObject(__out, UserPermissionsSFContentUser__typeInfo, UserPermissionsSFContentUser, UserPermissionsSFContentUser__is_set);
    __typeMapper.writeObject(__out, UserPermissionsSupportUser__typeInfo, UserPermissionsSupportUser, UserPermissionsSupportUser__is_set);
    __typeMapper.writeObject(__out, UserPreferences__typeInfo, UserPreferences, UserPreferences__is_set);
    __typeMapper.writeObject(__out, UserPreferencesActivityRemindersPopup__typeInfo, UserPreferencesActivityRemindersPopup, UserPreferencesActivityRemindersPopup__is_set);
    __typeMapper.writeObject(__out, UserPreferencesApexPagesDeveloperMode__typeInfo, UserPreferencesApexPagesDeveloperMode, UserPreferencesApexPagesDeveloperMode__is_set);
    __typeMapper.writeObject(__out, UserPreferencesCacheDiagnostics__typeInfo, UserPreferencesCacheDiagnostics, UserPreferencesCacheDiagnostics__is_set);
    __typeMapper.writeObject(__out, UserPreferencesContentEmailAsAndWhen__typeInfo, UserPreferencesContentEmailAsAndWhen, UserPreferencesContentEmailAsAndWhen__is_set);
    __typeMapper.writeObject(__out, UserPreferencesContentNoEmail__typeInfo, UserPreferencesContentNoEmail, UserPreferencesContentNoEmail__is_set);
    __typeMapper.writeObject(__out, UserPreferencesCreateLEXAppsWTShown__typeInfo, UserPreferencesCreateLEXAppsWTShown, UserPreferencesCreateLEXAppsWTShown__is_set);
    __typeMapper.writeObject(__out, UserPreferencesDisCommentAfterLikeEmail__typeInfo, UserPreferencesDisCommentAfterLikeEmail, UserPreferencesDisCommentAfterLikeEmail__is_set);
    __typeMapper.writeObject(__out, UserPreferencesDisMentionsCommentEmail__typeInfo, UserPreferencesDisMentionsCommentEmail, UserPreferencesDisMentionsCommentEmail__is_set);
    __typeMapper.writeObject(__out, UserPreferencesDisProfPostCommentEmail__typeInfo, UserPreferencesDisProfPostCommentEmail, UserPreferencesDisProfPostCommentEmail__is_set);
    __typeMapper.writeObject(__out, UserPreferencesDisableAllFeedsEmail__typeInfo, UserPreferencesDisableAllFeedsEmail, UserPreferencesDisableAllFeedsEmail__is_set);
    __typeMapper.writeObject(__out, UserPreferencesDisableBookmarkEmail__typeInfo, UserPreferencesDisableBookmarkEmail, UserPreferencesDisableBookmarkEmail__is_set);
    __typeMapper.writeObject(__out, UserPreferencesDisableChangeCommentEmail__typeInfo, UserPreferencesDisableChangeCommentEmail, UserPreferencesDisableChangeCommentEmail__is_set);
    __typeMapper.writeObject(__out, UserPreferencesDisableEndorsementEmail__typeInfo, UserPreferencesDisableEndorsementEmail, UserPreferencesDisableEndorsementEmail__is_set);
    __typeMapper.writeObject(__out, UserPreferencesDisableFileShareNotificationsForApi__typeInfo, UserPreferencesDisableFileShareNotificationsForApi, UserPreferencesDisableFileShareNotificationsForApi__is_set);
    __typeMapper.writeObject(__out, UserPreferencesDisableFollowersEmail__typeInfo, UserPreferencesDisableFollowersEmail, UserPreferencesDisableFollowersEmail__is_set);
    __typeMapper.writeObject(__out, UserPreferencesDisableLaterCommentEmail__typeInfo, UserPreferencesDisableLaterCommentEmail, UserPreferencesDisableLaterCommentEmail__is_set);
    __typeMapper.writeObject(__out, UserPreferencesDisableLikeEmail__typeInfo, UserPreferencesDisableLikeEmail, UserPreferencesDisableLikeEmail__is_set);
    __typeMapper.writeObject(__out, UserPreferencesDisableMentionsPostEmail__typeInfo, UserPreferencesDisableMentionsPostEmail, UserPreferencesDisableMentionsPostEmail__is_set);
    __typeMapper.writeObject(__out, UserPreferencesDisableMessageEmail__typeInfo, UserPreferencesDisableMessageEmail, UserPreferencesDisableMessageEmail__is_set);
    __typeMapper.writeObject(__out, UserPreferencesDisableProfilePostEmail__typeInfo, UserPreferencesDisableProfilePostEmail, UserPreferencesDisableProfilePostEmail__is_set);
    __typeMapper.writeObject(__out, UserPreferencesDisableSharePostEmail__typeInfo, UserPreferencesDisableSharePostEmail, UserPreferencesDisableSharePostEmail__is_set);
    __typeMapper.writeObject(__out, UserPreferencesEnableAutoSubForFeeds__typeInfo, UserPreferencesEnableAutoSubForFeeds, UserPreferencesEnableAutoSubForFeeds__is_set);
    __typeMapper.writeObject(__out, UserPreferencesEventRemindersCheckboxDefault__typeInfo, UserPreferencesEventRemindersCheckboxDefault, UserPreferencesEventRemindersCheckboxDefault__is_set);
    __typeMapper.writeObject(__out, UserPreferencesGlobalNavBarWTShown__typeInfo, UserPreferencesGlobalNavBarWTShown, UserPreferencesGlobalNavBarWTShown__is_set);
    __typeMapper.writeObject(__out, UserPreferencesGlobalNavGridMenuWTShown__typeInfo, UserPreferencesGlobalNavGridMenuWTShown, UserPreferencesGlobalNavGridMenuWTShown__is_set);
    __typeMapper.writeObject(__out, UserPreferencesHideBiggerPhotoCallout__typeInfo, UserPreferencesHideBiggerPhotoCallout, UserPreferencesHideBiggerPhotoCallout__is_set);
    __typeMapper.writeObject(__out, UserPreferencesHideCSNDesktopTask__typeInfo, UserPreferencesHideCSNDesktopTask, UserPreferencesHideCSNDesktopTask__is_set);
    __typeMapper.writeObject(__out, UserPreferencesHideCSNGetChatterMobileTask__typeInfo, UserPreferencesHideCSNGetChatterMobileTask, UserPreferencesHideCSNGetChatterMobileTask__is_set);
    __typeMapper.writeObject(__out, UserPreferencesHideChatterOnboardingSplash__typeInfo, UserPreferencesHideChatterOnboardingSplash, UserPreferencesHideChatterOnboardingSplash__is_set);
    __typeMapper.writeObject(__out, UserPreferencesHideEndUserOnboardingAssistantModal__typeInfo, UserPreferencesHideEndUserOnboardingAssistantModal, UserPreferencesHideEndUserOnboardingAssistantModal__is_set);
    __typeMapper.writeObject(__out, UserPreferencesHideLightningMigrationModal__typeInfo, UserPreferencesHideLightningMigrationModal, UserPreferencesHideLightningMigrationModal__is_set);
    __typeMapper.writeObject(__out, UserPreferencesHideS1BrowserUI__typeInfo, UserPreferencesHideS1BrowserUI, UserPreferencesHideS1BrowserUI__is_set);
    __typeMapper.writeObject(__out, UserPreferencesHideSecondChatterOnboardingSplash__typeInfo, UserPreferencesHideSecondChatterOnboardingSplash, UserPreferencesHideSecondChatterOnboardingSplash__is_set);
    __typeMapper.writeObject(__out, UserPreferencesHideSfxWelcomeMat__typeInfo, UserPreferencesHideSfxWelcomeMat, UserPreferencesHideSfxWelcomeMat__is_set);
    __typeMapper.writeObject(__out, UserPreferencesLightningExperiencePreferred__typeInfo, UserPreferencesLightningExperiencePreferred, UserPreferencesLightningExperiencePreferred__is_set);
    __typeMapper.writeObject(__out, UserPreferencesPathAssistantCollapsed__typeInfo, UserPreferencesPathAssistantCollapsed, UserPreferencesPathAssistantCollapsed__is_set);
    __typeMapper.writeObject(__out, UserPreferencesPreviewLightning__typeInfo, UserPreferencesPreviewLightning, UserPreferencesPreviewLightning__is_set);
    __typeMapper.writeObject(__out, UserPreferencesReminderSoundOff__typeInfo, UserPreferencesReminderSoundOff, UserPreferencesReminderSoundOff__is_set);
    __typeMapper.writeObject(__out, UserPreferencesShowCityToExternalUsers__typeInfo, UserPreferencesShowCityToExternalUsers, UserPreferencesShowCityToExternalUsers__is_set);
    __typeMapper.writeObject(__out, UserPreferencesShowCityToGuestUsers__typeInfo, UserPreferencesShowCityToGuestUsers, UserPreferencesShowCityToGuestUsers__is_set);
    __typeMapper.writeObject(__out, UserPreferencesShowCountryToExternalUsers__typeInfo, UserPreferencesShowCountryToExternalUsers, UserPreferencesShowCountryToExternalUsers__is_set);
    __typeMapper.writeObject(__out, UserPreferencesShowCountryToGuestUsers__typeInfo, UserPreferencesShowCountryToGuestUsers, UserPreferencesShowCountryToGuestUsers__is_set);
    __typeMapper.writeObject(__out, UserPreferencesShowEmailToExternalUsers__typeInfo, UserPreferencesShowEmailToExternalUsers, UserPreferencesShowEmailToExternalUsers__is_set);
    __typeMapper.writeObject(__out, UserPreferencesShowEmailToGuestUsers__typeInfo, UserPreferencesShowEmailToGuestUsers, UserPreferencesShowEmailToGuestUsers__is_set);
    __typeMapper.writeObject(__out, UserPreferencesShowFaxToExternalUsers__typeInfo, UserPreferencesShowFaxToExternalUsers, UserPreferencesShowFaxToExternalUsers__is_set);
    __typeMapper.writeObject(__out, UserPreferencesShowFaxToGuestUsers__typeInfo, UserPreferencesShowFaxToGuestUsers, UserPreferencesShowFaxToGuestUsers__is_set);
    __typeMapper.writeObject(__out, UserPreferencesShowManagerToExternalUsers__typeInfo, UserPreferencesShowManagerToExternalUsers, UserPreferencesShowManagerToExternalUsers__is_set);
    __typeMapper.writeObject(__out, UserPreferencesShowManagerToGuestUsers__typeInfo, UserPreferencesShowManagerToGuestUsers, UserPreferencesShowManagerToGuestUsers__is_set);
    __typeMapper.writeObject(__out, UserPreferencesShowMobilePhoneToExternalUsers__typeInfo, UserPreferencesShowMobilePhoneToExternalUsers, UserPreferencesShowMobilePhoneToExternalUsers__is_set);
    __typeMapper.writeObject(__out, UserPreferencesShowMobilePhoneToGuestUsers__typeInfo, UserPreferencesShowMobilePhoneToGuestUsers, UserPreferencesShowMobilePhoneToGuestUsers__is_set);
    __typeMapper.writeObject(__out, UserPreferencesShowPostalCodeToExternalUsers__typeInfo, UserPreferencesShowPostalCodeToExternalUsers, UserPreferencesShowPostalCodeToExternalUsers__is_set);
    __typeMapper.writeObject(__out, UserPreferencesShowPostalCodeToGuestUsers__typeInfo, UserPreferencesShowPostalCodeToGuestUsers, UserPreferencesShowPostalCodeToGuestUsers__is_set);
    __typeMapper.writeObject(__out, UserPreferencesShowProfilePicToGuestUsers__typeInfo, UserPreferencesShowProfilePicToGuestUsers, UserPreferencesShowProfilePicToGuestUsers__is_set);
    __typeMapper.writeObject(__out, UserPreferencesShowStateToExternalUsers__typeInfo, UserPreferencesShowStateToExternalUsers, UserPreferencesShowStateToExternalUsers__is_set);
    __typeMapper.writeObject(__out, UserPreferencesShowStateToGuestUsers__typeInfo, UserPreferencesShowStateToGuestUsers, UserPreferencesShowStateToGuestUsers__is_set);
    __typeMapper.writeObject(__out, UserPreferencesShowStreetAddressToExternalUsers__typeInfo, UserPreferencesShowStreetAddressToExternalUsers, UserPreferencesShowStreetAddressToExternalUsers__is_set);
    __typeMapper.writeObject(__out, UserPreferencesShowStreetAddressToGuestUsers__typeInfo, UserPreferencesShowStreetAddressToGuestUsers, UserPreferencesShowStreetAddressToGuestUsers__is_set);
    __typeMapper.writeObject(__out, UserPreferencesShowTitleToExternalUsers__typeInfo, UserPreferencesShowTitleToExternalUsers, UserPreferencesShowTitleToExternalUsers__is_set);
    __typeMapper.writeObject(__out, UserPreferencesShowTitleToGuestUsers__typeInfo, UserPreferencesShowTitleToGuestUsers, UserPreferencesShowTitleToGuestUsers__is_set);
    __typeMapper.writeObject(__out, UserPreferencesShowWorkPhoneToExternalUsers__typeInfo, UserPreferencesShowWorkPhoneToExternalUsers, UserPreferencesShowWorkPhoneToExternalUsers__is_set);
    __typeMapper.writeObject(__out, UserPreferencesShowWorkPhoneToGuestUsers__typeInfo, UserPreferencesShowWorkPhoneToGuestUsers, UserPreferencesShowWorkPhoneToGuestUsers__is_set);
    __typeMapper.writeObject(__out, UserPreferencesSortFeedByComment__typeInfo, UserPreferencesSortFeedByComment, UserPreferencesSortFeedByComment__is_set);
    __typeMapper.writeObject(__out, UserPreferencesTaskRemindersCheckboxDefault__typeInfo, UserPreferencesTaskRemindersCheckboxDefault, UserPreferencesTaskRemindersCheckboxDefault__is_set);
    __typeMapper.writeObject(__out, UserProfileSkillChildren__typeInfo, UserProfileSkillChildren, UserProfileSkillChildren__is_set);
    __typeMapper.writeObject(__out, UserProfileSkillUserEndorsements__typeInfo, UserProfileSkillUserEndorsements, UserProfileSkillUserEndorsements__is_set);
    __typeMapper.writeObject(__out, UserRole__typeInfo, UserRole, UserRole__is_set);
    __typeMapper.writeString(__out, UserRoleId__typeInfo, UserRoleId, UserRoleId__is_set);
    __typeMapper.writeObject(__out, UserSites__typeInfo, UserSites, UserSites__is_set);
    __typeMapper.writeString(__out, UserType__typeInfo, UserType, UserType__is_set);
    __typeMapper.writeString(__out, User_Code__c__typeInfo, User_Code__c, User_Code__c__is_set);
    __typeMapper.writeString(__out, Username__typeInfo, Username, Username__is_set);
    __typeMapper.writeObject(__out, Users__r__typeInfo, Users__r, Users__r__is_set);
    __typeMapper.writeObject(__out, VCSSAP__User_Inboxes__r__typeInfo, VCSSAP__User_Inboxes__r, VCSSAP__User_Inboxes__r__is_set);
    __typeMapper.writeObject(__out, VCSSAP__VCSEmails__r__typeInfo, VCSSAP__VCSEmails__r, VCSSAP__VCSEmails__r__is_set);
    __typeMapper.writeObject(__out, almond__Achievement_Assignments__r__typeInfo, almond__Achievement_Assignments__r, almond__Achievement_Assignments__r__is_set);
    __typeMapper.writeObject(__out, almond__Achievements__r__typeInfo, almond__Achievements__r, almond__Achievements__r__is_set);
    __typeMapper.writeObject(__out, almond__Learning_Assignments1__r__typeInfo, almond__Learning_Assignments1__r, almond__Learning_Assignments1__r__is_set);
    __typeMapper.writeObject(__out, almond__Learning_Assignments__r__typeInfo, almond__Learning_Assignments__r, almond__Learning_Assignments__r__is_set);
    __typeMapper.writeObject(__out, almond__Responses__r__typeInfo, almond__Responses__r, almond__Responses__r__is_set);
    __typeMapper.writeObject(__out, almond__Shared_Learning_Assignments1__r__typeInfo, almond__Shared_Learning_Assignments1__r, almond__Shared_Learning_Assignments1__r__is_set);
    __typeMapper.writeObject(__out, almond__Shared_Learning_Assignments__r__typeInfo, almond__Shared_Learning_Assignments__r, almond__Shared_Learning_Assignments__r__is_set);
    __typeMapper.writeObject(__out, almond__Task_Approvers__r__typeInfo, almond__Task_Approvers__r, almond__Task_Approvers__r__is_set);
    __typeMapper.writeObject(__out, almond__Training_Plan_Access_Requests__r__typeInfo, almond__Training_Plan_Access_Requests__r, almond__Training_Plan_Access_Requests__r__is_set);
    __typeMapper.writeObject(__out, almond__Training_Plan_Assignments__r__typeInfo, almond__Training_Plan_Assignments__r, almond__Training_Plan_Assignments__r__is_set);
    __typeMapper.writeObject(__out, almond__Training_Plan_Feedbacks__r__typeInfo, almond__Training_Plan_Feedbacks__r, almond__Training_Plan_Feedbacks__r__is_set);
    __typeMapper.writeObject(__out, almond__Training_Plan_Section_Assignments__r__typeInfo, almond__Training_Plan_Section_Assignments__r, almond__Training_Plan_Section_Assignments__r__is_set);
    __typeMapper.writeObject(__out, aos__X50_Point_Roles__r__typeInfo, aos__X50_Point_Roles__r, aos__X50_Point_Roles__r__is_set);
    __typeMapper.writeString(__out, client_approval__c__typeInfo, client_approval__c, client_approval__c__is_set);
    __typeMapper.writeObject(__out, client_approval__r__typeInfo, client_approval__r, client_approval__r__is_set);
    __typeMapper.writeObject(__out, dupcheck__Duplicate_Check_Audits__r__typeInfo, dupcheck__Duplicate_Check_Audits__r, dupcheck__Duplicate_Check_Audits__r__is_set);
    __typeMapper.writeObject(__out, dupcheck__dc3DisableDuplicateCheck__c__typeInfo, dupcheck__dc3DisableDuplicateCheck__c, dupcheck__dc3DisableDuplicateCheck__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__Agreements1__r__typeInfo, echosign_dev1__Agreements1__r, echosign_dev1__Agreements1__r__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__Agreements2__r__typeInfo, echosign_dev1__Agreements2__r, echosign_dev1__Agreements2__r__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__Agreements3__r__typeInfo, echosign_dev1__Agreements3__r, echosign_dev1__Agreements3__r__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__Agreements_Senders__r__typeInfo, echosign_dev1__Agreements_Senders__r, echosign_dev1__Agreements_Senders__r__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__Agreements__r__typeInfo, echosign_dev1__Agreements__r, echosign_dev1__Agreements__r__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__EchoSign_Allow_Delegated_Sending__c__typeInfo, echosign_dev1__EchoSign_Allow_Delegated_Sending__c, echosign_dev1__EchoSign_Allow_Delegated_Sending__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__EchoSign_Email_Verified__c__typeInfo, echosign_dev1__EchoSign_Email_Verified__c, echosign_dev1__EchoSign_Email_Verified__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__Echosign_Recipients__r__typeInfo, echosign_dev1__Echosign_Recipients__r, echosign_dev1__Echosign_Recipients__r__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__Process_Templates__r__typeInfo, echosign_dev1__Process_Templates__r, echosign_dev1__Process_Templates__r__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__Recipient_Templates__r__typeInfo, echosign_dev1__Recipient_Templates__r, echosign_dev1__Recipient_Templates__r__is_set);
    __typeMapper.writeObject(__out, i__AAUserPrefs__r__typeInfo, i__AAUserPrefs__r, i__AAUserPrefs__r__is_set);
    __typeMapper.writeObject(__out, i__EmailAddrs__r__typeInfo, i__EmailAddrs__r, i__EmailAddrs__r__is_set);
    __typeMapper.writeObject(__out, i__R00N700000028MRVEA2__r__typeInfo, i__R00N700000028MRVEA2__r, i__R00N700000028MRVEA2__r__is_set);
    __typeMapper.writeObject(__out, i__R00N700000028MSBEA2__r__typeInfo, i__R00N700000028MSBEA2__r, i__R00N700000028MSBEA2__r__is_set);
    __typeMapper.writeObject(__out, i__R00N700000028QWKEA2__r__typeInfo, i__R00N700000028QWKEA2__r, i__R00N700000028QWKEA2__r__is_set);
    __typeMapper.writeObject(__out, i__R00N700000028QWREA2__r__typeInfo, i__R00N700000028QWREA2__r, i__R00N700000028QWREA2__r__is_set);
    __typeMapper.writeObject(__out, punch__HideOnPunchboard__c__typeInfo, punch__HideOnPunchboard__c, punch__HideOnPunchboard__c__is_set);
    __typeMapper.writeObject(__out, punch__LastDate__c__typeInfo, punch__LastDate__c, punch__LastDate__c__is_set);
    __typeMapper.writeString(__out, punch__LastDescription__c__typeInfo, punch__LastDescription__c, punch__LastDescription__c__is_set);
    __typeMapper.writeObject(__out, punch__LastEstimatedReturn__c__typeInfo, punch__LastEstimatedReturn__c, punch__LastEstimatedReturn__c__is_set);
    __typeMapper.writeString(__out, punch__LastStatus__c__typeInfo, punch__LastStatus__c, punch__LastStatus__c__is_set);
    __typeMapper.writeObject(__out, rh2__Describes__r__typeInfo, rh2__Describes__r, rh2__Describes__r__is_set);
    __typeMapper.writeObject(__out, simplesurvey__Survey_Configurations__r__typeInfo, simplesurvey__Survey_Configurations__r, simplesurvey__Survey_Configurations__r__is_set);
    __typeMapper.writeObject(__out, simplesurvey__Surveys__r__typeInfo, simplesurvey__Surveys__r, simplesurvey__Surveys__r__is_set);
    __typeMapper.writeObject(__out, smagicinteract__SMS_History__r__typeInfo, smagicinteract__SMS_History__r, smagicinteract__SMS_History__r__is_set);
    __typeMapper.writeObject(__out, smagicinteract__forward_configs__r__typeInfo, smagicinteract__forward_configs__r, smagicinteract__forward_configs__r__is_set);
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
    if (__typeMapper.isElement(__in, AboutMe__typeInfo)) {
      setAboutMe((java.lang.String)__typeMapper.readString(__in, AboutMe__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AcceptedEventRelations__typeInfo)) {
      setAcceptedEventRelations((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, AcceptedEventRelations__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Account__typeInfo)) {
      setAccount((com.sforce.soap.enterprise.sobject.Account)__typeMapper.readObject(__in, Account__typeInfo, com.sforce.soap.enterprise.sobject.Account.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AccountId__typeInfo)) {
      setAccountId((java.lang.String)__typeMapper.readString(__in, AccountId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Accounts__r__typeInfo)) {
      setAccounts__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Accounts__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Address__typeInfo)) {
      setAddress((com.sforce.soap.enterprise.Address)__typeMapper.readObject(__in, Address__typeInfo, com.sforce.soap.enterprise.Address.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Admin_Employees__r__typeInfo)) {
      setAdmin_Employees__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Admin_Employees__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Alias__typeInfo)) {
      setAlias((java.lang.String)__typeMapper.readString(__in, Alias__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Applicants__r__typeInfo)) {
      setApplicants__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Applicants__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Assignments1__r__typeInfo)) {
      setAssignments1__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Assignments1__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Assignments2__r__typeInfo)) {
      setAssignments2__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Assignments2__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Assignments__r__typeInfo)) {
      setAssignments__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Assignments__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    if (__typeMapper.isElement(__in, BadgeText__typeInfo)) {
      setBadgeText((java.lang.String)__typeMapper.readString(__in, BadgeText__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Badges__typeInfo)) {
      setBadges((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Badges__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, BannerPhotoUrl__typeInfo)) {
      setBannerPhotoUrl((java.lang.String)__typeMapper.readString(__in, BannerPhotoUrl__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Budgets_and_Actuals__r__typeInfo)) {
      setBudgets_and_Actuals__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Budgets_and_Actuals__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Business_Services1__r__typeInfo)) {
      setBusiness_Services1__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Business_Services1__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Business_Services__r__typeInfo)) {
      setBusiness_Services__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Business_Services__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CallCenterId__typeInfo)) {
      setCallCenterId((java.lang.String)__typeMapper.readString(__in, CallCenterId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Candidate_Geocodes__r__typeInfo)) {
      setCandidate_Geocodes__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Candidate_Geocodes__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Case_Swarm_Rules__r__typeInfo)) {
      setCase_Swarm_Rules__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Case_Swarm_Rules__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Cases__r__typeInfo)) {
      setCases__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Cases__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, City__typeInfo)) {
      setCity((java.lang.String)__typeMapper.readString(__in, City__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CombinedAttachments__typeInfo)) {
      setCombinedAttachments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, CombinedAttachments__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CommunityNickname__typeInfo)) {
      setCommunityNickname((java.lang.String)__typeMapper.readString(__in, CommunityNickname__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CompanyName__typeInfo)) {
      setCompanyName((java.lang.String)__typeMapper.readString(__in, CompanyName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Consultant_ID__c__typeInfo)) {
      setConsultant_ID__c((java.lang.String)__typeMapper.readString(__in, Consultant_ID__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Contact__typeInfo)) {
      setContact((com.sforce.soap.enterprise.sobject.Contact)__typeMapper.readObject(__in, Contact__typeInfo, com.sforce.soap.enterprise.sobject.Contact.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ContactId__typeInfo)) {
      setContactId((java.lang.String)__typeMapper.readString(__in, ContactId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Contacts__r__typeInfo)) {
      setContacts__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Contacts__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ContentDocumentLinks__typeInfo)) {
      setContentDocumentLinks((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, ContentDocumentLinks__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ContractsSigned__typeInfo)) {
      setContractsSigned((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, ContractsSigned__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Country__typeInfo)) {
      setCountry((java.lang.String)__typeMapper.readString(__in, Country__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, DeclinedEventRelations__typeInfo)) {
      setDeclinedEventRelations((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, DeclinedEventRelations__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DefaultGroupNotificationFrequency__typeInfo)) {
      setDefaultGroupNotificationFrequency((java.lang.String)__typeMapper.readString(__in, DefaultGroupNotificationFrequency__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DelegatedApproverId__typeInfo)) {
      setDelegatedApproverId((java.lang.String)__typeMapper.readString(__in, DelegatedApproverId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DelegatedUsers__typeInfo)) {
      setDelegatedUsers((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, DelegatedUsers__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Department__typeInfo)) {
      setDepartment((java.lang.String)__typeMapper.readString(__in, Department__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DigestFrequency__typeInfo)) {
      setDigestFrequency((java.lang.String)__typeMapper.readString(__in, DigestFrequency__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Division__typeInfo)) {
      setDivision((java.lang.String)__typeMapper.readString(__in, Division__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Email__typeInfo)) {
      setEmail((java.lang.String)__typeMapper.readString(__in, Email__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, EmailEncodingKey__typeInfo)) {
      setEmailEncodingKey((java.lang.String)__typeMapper.readString(__in, EmailEncodingKey__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, EmailMessageRelations__typeInfo)) {
      setEmailMessageRelations((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, EmailMessageRelations__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, EmailPreferencesAutoBcc__typeInfo)) {
      setEmailPreferencesAutoBcc((java.lang.Boolean)__typeMapper.readObject(__in, EmailPreferencesAutoBcc__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, EmailPreferencesAutoBccStayInTouch__typeInfo)) {
      setEmailPreferencesAutoBccStayInTouch((java.lang.Boolean)__typeMapper.readObject(__in, EmailPreferencesAutoBccStayInTouch__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, EmailPreferencesStayInTouchReminder__typeInfo)) {
      setEmailPreferencesStayInTouchReminder((java.lang.Boolean)__typeMapper.readObject(__in, EmailPreferencesStayInTouchReminder__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, EmployeeNumber__typeInfo)) {
      setEmployeeNumber((java.lang.String)__typeMapper.readString(__in, EmployeeNumber__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, EventRelations__typeInfo)) {
      setEventRelations((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, EventRelations__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Extension__typeInfo)) {
      setExtension((java.lang.String)__typeMapper.readString(__in, Extension__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ExternalDataUserAuths__typeInfo)) {
      setExternalDataUserAuths((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, ExternalDataUserAuths__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Fax__typeInfo)) {
      setFax((java.lang.String)__typeMapper.readString(__in, Fax__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FederationIdentifier__typeInfo)) {
      setFederationIdentifier((java.lang.String)__typeMapper.readString(__in, FederationIdentifier__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FeedSubscriptions__typeInfo)) {
      setFeedSubscriptions((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, FeedSubscriptions__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FeedSubscriptionsForEntity__typeInfo)) {
      setFeedSubscriptionsForEntity((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, FeedSubscriptionsForEntity__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Feed_Post_Swarm_Rules__r__typeInfo)) {
      setFeed_Post_Swarm_Rules__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Feed_Post_Swarm_Rules__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Feeds__typeInfo)) {
      setFeeds((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Feeds__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FirstName__typeInfo)) {
      setFirstName((java.lang.String)__typeMapper.readString(__in, FirstName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ForecastEnabled__typeInfo)) {
      setForecastEnabled((java.lang.Boolean)__typeMapper.readObject(__in, ForecastEnabled__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FullPhotoUrl__typeInfo)) {
      setFullPhotoUrl((java.lang.String)__typeMapper.readString(__in, FullPhotoUrl__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, GeocodeAccuracy__typeInfo)) {
      setGeocodeAccuracy((java.lang.String)__typeMapper.readString(__in, GeocodeAccuracy__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, GivenThanks__typeInfo)) {
      setGivenThanks((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, GivenThanks__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, GroupMembershipRequests__typeInfo)) {
      setGroupMembershipRequests((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, GroupMembershipRequests__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, GroupMemberships__typeInfo)) {
      setGroupMemberships((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, GroupMemberships__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, InstalledMobileApps__typeInfo)) {
      setInstalledMobileApps((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, InstalledMobileApps__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsActive__typeInfo)) {
      setIsActive((java.lang.Boolean)__typeMapper.readObject(__in, IsActive__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsPortalEnabled__typeInfo)) {
      setIsPortalEnabled((java.lang.Boolean)__typeMapper.readObject(__in, IsPortalEnabled__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsProfilePhotoActive__typeInfo)) {
      setIsProfilePhotoActive((java.lang.Boolean)__typeMapper.readObject(__in, IsProfilePhotoActive__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LanguageLocaleKey__typeInfo)) {
      setLanguageLocaleKey((java.lang.String)__typeMapper.readString(__in, LanguageLocaleKey__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LastLoginDate__typeInfo)) {
      setLastLoginDate((java.util.Calendar)__typeMapper.readObject(__in, LastLoginDate__typeInfo, java.util.Calendar.class));
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
    if (__typeMapper.isElement(__in, LastName__typeInfo)) {
      setLastName((java.lang.String)__typeMapper.readString(__in, LastName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LastPasswordChangeDate__typeInfo)) {
      setLastPasswordChangeDate((java.util.Calendar)__typeMapper.readObject(__in, LastPasswordChangeDate__typeInfo, java.util.Calendar.class));
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
    if (__typeMapper.isElement(__in, Latitude__typeInfo)) {
      setLatitude((java.lang.Double)__typeMapper.readObject(__in, Latitude__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Lead_Swarm_Rules__r__typeInfo)) {
      setLead_Swarm_Rules__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Lead_Swarm_Rules__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LocaleSidKey__typeInfo)) {
      setLocaleSidKey((java.lang.String)__typeMapper.readString(__in, LocaleSidKey__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Longitude__typeInfo)) {
      setLongitude((java.lang.Double)__typeMapper.readObject(__in, Longitude__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MME__EmailMessages__r__typeInfo)) {
      setMME__EmailMessages__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, MME__EmailMessages__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ManagedUsers__typeInfo)) {
      setManagedUsers((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, ManagedUsers__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Manager__typeInfo)) {
      setManager((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, Manager__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ManagerId__typeInfo)) {
      setManagerId((java.lang.String)__typeMapper.readString(__in, ManagerId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MediumBannerPhotoUrl__typeInfo)) {
      setMediumBannerPhotoUrl((java.lang.String)__typeMapper.readString(__in, MediumBannerPhotoUrl__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MediumPhotoUrl__typeInfo)) {
      setMediumPhotoUrl((java.lang.String)__typeMapper.readString(__in, MediumPhotoUrl__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MobilePhone__typeInfo)) {
      setMobilePhone((java.lang.String)__typeMapper.readString(__in, MobilePhone__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Name__typeInfo)) {
      setName((java.lang.String)__typeMapper.readString(__in, Name__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OfflinePdaTrialExpirationDate__typeInfo)) {
      setOfflinePdaTrialExpirationDate((java.util.Calendar)__typeMapper.readObject(__in, OfflinePdaTrialExpirationDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OfflineTrialExpirationDate__typeInfo)) {
      setOfflineTrialExpirationDate((java.util.Calendar)__typeMapper.readObject(__in, OfflineTrialExpirationDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Opportunities__r__typeInfo)) {
      setOpportunities__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Opportunities__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Opportunity_Swarm_Rules__r__typeInfo)) {
      setOpportunity_Swarm_Rules__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Opportunity_Swarm_Rules__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Order_Swarm_Rules__r__typeInfo)) {
      setOrder_Swarm_Rules__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Order_Swarm_Rules__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Orders1__r__typeInfo)) {
      setOrders1__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Orders1__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Orders2__r__typeInfo)) {
      setOrders2__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Orders2__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Orders3__r__typeInfo)) {
      setOrders3__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Orders3__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Orders4__r__typeInfo)) {
      setOrders4__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Orders4__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Orders5__r__typeInfo)) {
      setOrders5__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Orders5__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Orders__r__typeInfo)) {
      setOrders__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Orders__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OwnedContentDocuments__typeInfo)) {
      setOwnedContentDocuments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, OwnedContentDocuments__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionSetAssignments__typeInfo)) {
      setPermissionSetAssignments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, PermissionSetAssignments__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionSetLicenseAssignments__typeInfo)) {
      setPermissionSetLicenseAssignments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, PermissionSetLicenseAssignments__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Phone__typeInfo)) {
      setPhone((java.lang.String)__typeMapper.readString(__in, Phone__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PortalRole__typeInfo)) {
      setPortalRole((java.lang.String)__typeMapper.readString(__in, PortalRole__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PostalCode__typeInfo)) {
      setPostalCode((java.lang.String)__typeMapper.readString(__in, PostalCode__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Profile__typeInfo)) {
      setProfile((com.sforce.soap.enterprise.sobject.Profile)__typeMapper.readObject(__in, Profile__typeInfo, com.sforce.soap.enterprise.sobject.Profile.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ProfileId__typeInfo)) {
      setProfileId((java.lang.String)__typeMapper.readString(__in, ProfileId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Proxy__r__typeInfo)) {
      setProxy__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Proxy__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, QuestionSubscriptions__typeInfo)) {
      setQuestionSubscriptions((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, QuestionSubscriptions__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, R00N30000001eUPVEA2__r__typeInfo)) {
      setR00N30000001eUPVEA2__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, R00N30000001eUPVEA2__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ReceivesAdminInfoEmails__typeInfo)) {
      setReceivesAdminInfoEmails((java.lang.Boolean)__typeMapper.readObject(__in, ReceivesAdminInfoEmails__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ReceivesInfoEmails__typeInfo)) {
      setReceivesInfoEmails((java.lang.Boolean)__typeMapper.readObject(__in, ReceivesInfoEmails__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Regions1__r__typeInfo)) {
      setRegions1__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Regions1__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Regions2__r__typeInfo)) {
      setRegions2__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Regions2__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Regions__r__typeInfo)) {
      setRegions__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Regions__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Revenues1__r__typeInfo)) {
      setRevenues1__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Revenues1__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Revenues__r__typeInfo)) {
      setRevenues__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Revenues__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Rogue_Payment_Objects__r__typeInfo)) {
      setRogue_Payment_Objects__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Rogue_Payment_Objects__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, S4STEO__TransferOwnersNewOwner__r__typeInfo)) {
      setS4STEO__TransferOwnersNewOwner__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, S4STEO__TransferOwnersNewOwner__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, S4STEO__TransferOwnersOldOwner__r__typeInfo)) {
      setS4STEO__TransferOwnersOldOwner__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, S4STEO__TransferOwnersOldOwner__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Safety_Actions__r__typeInfo)) {
      setSafety_Actions__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Safety_Actions__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SenderEmail__typeInfo)) {
      setSenderEmail((java.lang.String)__typeMapper.readString(__in, SenderEmail__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SenderName__typeInfo)) {
      setSenderName((java.lang.String)__typeMapper.readString(__in, SenderName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Shares__typeInfo)) {
      setShares((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Shares__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Signature__typeInfo)) {
      setSignature((java.lang.String)__typeMapper.readString(__in, Signature__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SmallBannerPhotoUrl__typeInfo)) {
      setSmallBannerPhotoUrl((java.lang.String)__typeMapper.readString(__in, SmallBannerPhotoUrl__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SmallPhotoUrl__typeInfo)) {
      setSmallPhotoUrl((java.lang.String)__typeMapper.readString(__in, SmallPhotoUrl__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, State__typeInfo)) {
      setState((java.lang.String)__typeMapper.readString(__in, State__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, StayInTouchNote__typeInfo)) {
      setStayInTouchNote((java.lang.String)__typeMapper.readString(__in, StayInTouchNote__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, StayInTouchSignature__typeInfo)) {
      setStayInTouchSignature((java.lang.String)__typeMapper.readString(__in, StayInTouchSignature__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, StayInTouchSubject__typeInfo)) {
      setStayInTouchSubject((java.lang.String)__typeMapper.readString(__in, StayInTouchSubject__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Street__typeInfo)) {
      setStreet((java.lang.String)__typeMapper.readString(__in, Street__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Surveys__r__typeInfo)) {
      setSurveys__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Surveys__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TimeZoneSidKey__typeInfo)) {
      setTimeZoneSidKey((java.lang.String)__typeMapper.readString(__in, TimeZoneSidKey__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TimesheetsSubmitted__r__typeInfo)) {
      setTimesheetsSubmitted__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, TimesheetsSubmitted__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Timesheets__r__typeInfo)) {
      setTimesheets__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Timesheets__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Title__typeInfo)) {
      setTitle((java.lang.String)__typeMapper.readString(__in, Title__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Training_Participants__r__typeInfo)) {
      setTraining_Participants__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Training_Participants__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, USERHISTORY__User_History_Changed_By__r__typeInfo)) {
      setUSERHISTORY__User_History_Changed_By__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, USERHISTORY__User_History_Changed_By__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, USERHISTORY__User_History_User__r__typeInfo)) {
      setUSERHISTORY__User_History_User__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, USERHISTORY__User_History_User__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UndecidedEventRelations__typeInfo)) {
      setUndecidedEventRelations((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, UndecidedEventRelations__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Unverified_Time__r__typeInfo)) {
      setUnverified_Time__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Unverified_Time__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserEntityAccessRights__typeInfo)) {
      setUserEntityAccessRights((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, UserEntityAccessRights__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserFieldAccessRights__typeInfo)) {
      setUserFieldAccessRights((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, UserFieldAccessRights__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPermissionsAvantgoUser__typeInfo)) {
      setUserPermissionsAvantgoUser((java.lang.Boolean)__typeMapper.readObject(__in, UserPermissionsAvantgoUser__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPermissionsCallCenterAutoLogin__typeInfo)) {
      setUserPermissionsCallCenterAutoLogin((java.lang.Boolean)__typeMapper.readObject(__in, UserPermissionsCallCenterAutoLogin__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPermissionsChatterAnswersUser__typeInfo)) {
      setUserPermissionsChatterAnswersUser((java.lang.Boolean)__typeMapper.readObject(__in, UserPermissionsChatterAnswersUser__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPermissionsInteractionUser__typeInfo)) {
      setUserPermissionsInteractionUser((java.lang.Boolean)__typeMapper.readObject(__in, UserPermissionsInteractionUser__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPermissionsKnowledgeUser__typeInfo)) {
      setUserPermissionsKnowledgeUser((java.lang.Boolean)__typeMapper.readObject(__in, UserPermissionsKnowledgeUser__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPermissionsMarketingUser__typeInfo)) {
      setUserPermissionsMarketingUser((java.lang.Boolean)__typeMapper.readObject(__in, UserPermissionsMarketingUser__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPermissionsMobileUser__typeInfo)) {
      setUserPermissionsMobileUser((java.lang.Boolean)__typeMapper.readObject(__in, UserPermissionsMobileUser__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPermissionsOfflineUser__typeInfo)) {
      setUserPermissionsOfflineUser((java.lang.Boolean)__typeMapper.readObject(__in, UserPermissionsOfflineUser__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPermissionsSFContentUser__typeInfo)) {
      setUserPermissionsSFContentUser((java.lang.Boolean)__typeMapper.readObject(__in, UserPermissionsSFContentUser__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPermissionsSupportUser__typeInfo)) {
      setUserPermissionsSupportUser((java.lang.Boolean)__typeMapper.readObject(__in, UserPermissionsSupportUser__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferences__typeInfo)) {
      setUserPreferences((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, UserPreferences__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesActivityRemindersPopup__typeInfo)) {
      setUserPreferencesActivityRemindersPopup((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesActivityRemindersPopup__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesApexPagesDeveloperMode__typeInfo)) {
      setUserPreferencesApexPagesDeveloperMode((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesApexPagesDeveloperMode__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesCacheDiagnostics__typeInfo)) {
      setUserPreferencesCacheDiagnostics((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesCacheDiagnostics__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesContentEmailAsAndWhen__typeInfo)) {
      setUserPreferencesContentEmailAsAndWhen((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesContentEmailAsAndWhen__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesContentNoEmail__typeInfo)) {
      setUserPreferencesContentNoEmail((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesContentNoEmail__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesCreateLEXAppsWTShown__typeInfo)) {
      setUserPreferencesCreateLEXAppsWTShown((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesCreateLEXAppsWTShown__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesDisCommentAfterLikeEmail__typeInfo)) {
      setUserPreferencesDisCommentAfterLikeEmail((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesDisCommentAfterLikeEmail__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesDisMentionsCommentEmail__typeInfo)) {
      setUserPreferencesDisMentionsCommentEmail((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesDisMentionsCommentEmail__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesDisProfPostCommentEmail__typeInfo)) {
      setUserPreferencesDisProfPostCommentEmail((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesDisProfPostCommentEmail__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesDisableAllFeedsEmail__typeInfo)) {
      setUserPreferencesDisableAllFeedsEmail((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesDisableAllFeedsEmail__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesDisableBookmarkEmail__typeInfo)) {
      setUserPreferencesDisableBookmarkEmail((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesDisableBookmarkEmail__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesDisableChangeCommentEmail__typeInfo)) {
      setUserPreferencesDisableChangeCommentEmail((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesDisableChangeCommentEmail__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesDisableEndorsementEmail__typeInfo)) {
      setUserPreferencesDisableEndorsementEmail((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesDisableEndorsementEmail__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesDisableFileShareNotificationsForApi__typeInfo)) {
      setUserPreferencesDisableFileShareNotificationsForApi((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesDisableFileShareNotificationsForApi__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesDisableFollowersEmail__typeInfo)) {
      setUserPreferencesDisableFollowersEmail((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesDisableFollowersEmail__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesDisableLaterCommentEmail__typeInfo)) {
      setUserPreferencesDisableLaterCommentEmail((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesDisableLaterCommentEmail__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesDisableLikeEmail__typeInfo)) {
      setUserPreferencesDisableLikeEmail((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesDisableLikeEmail__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesDisableMentionsPostEmail__typeInfo)) {
      setUserPreferencesDisableMentionsPostEmail((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesDisableMentionsPostEmail__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesDisableMessageEmail__typeInfo)) {
      setUserPreferencesDisableMessageEmail((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesDisableMessageEmail__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesDisableProfilePostEmail__typeInfo)) {
      setUserPreferencesDisableProfilePostEmail((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesDisableProfilePostEmail__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesDisableSharePostEmail__typeInfo)) {
      setUserPreferencesDisableSharePostEmail((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesDisableSharePostEmail__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesEnableAutoSubForFeeds__typeInfo)) {
      setUserPreferencesEnableAutoSubForFeeds((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesEnableAutoSubForFeeds__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesEventRemindersCheckboxDefault__typeInfo)) {
      setUserPreferencesEventRemindersCheckboxDefault((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesEventRemindersCheckboxDefault__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesGlobalNavBarWTShown__typeInfo)) {
      setUserPreferencesGlobalNavBarWTShown((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesGlobalNavBarWTShown__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesGlobalNavGridMenuWTShown__typeInfo)) {
      setUserPreferencesGlobalNavGridMenuWTShown((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesGlobalNavGridMenuWTShown__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesHideBiggerPhotoCallout__typeInfo)) {
      setUserPreferencesHideBiggerPhotoCallout((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesHideBiggerPhotoCallout__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesHideCSNDesktopTask__typeInfo)) {
      setUserPreferencesHideCSNDesktopTask((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesHideCSNDesktopTask__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesHideCSNGetChatterMobileTask__typeInfo)) {
      setUserPreferencesHideCSNGetChatterMobileTask((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesHideCSNGetChatterMobileTask__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesHideChatterOnboardingSplash__typeInfo)) {
      setUserPreferencesHideChatterOnboardingSplash((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesHideChatterOnboardingSplash__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesHideEndUserOnboardingAssistantModal__typeInfo)) {
      setUserPreferencesHideEndUserOnboardingAssistantModal((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesHideEndUserOnboardingAssistantModal__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesHideLightningMigrationModal__typeInfo)) {
      setUserPreferencesHideLightningMigrationModal((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesHideLightningMigrationModal__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesHideS1BrowserUI__typeInfo)) {
      setUserPreferencesHideS1BrowserUI((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesHideS1BrowserUI__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesHideSecondChatterOnboardingSplash__typeInfo)) {
      setUserPreferencesHideSecondChatterOnboardingSplash((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesHideSecondChatterOnboardingSplash__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesHideSfxWelcomeMat__typeInfo)) {
      setUserPreferencesHideSfxWelcomeMat((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesHideSfxWelcomeMat__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesLightningExperiencePreferred__typeInfo)) {
      setUserPreferencesLightningExperiencePreferred((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesLightningExperiencePreferred__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesPathAssistantCollapsed__typeInfo)) {
      setUserPreferencesPathAssistantCollapsed((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesPathAssistantCollapsed__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesPreviewLightning__typeInfo)) {
      setUserPreferencesPreviewLightning((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesPreviewLightning__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesReminderSoundOff__typeInfo)) {
      setUserPreferencesReminderSoundOff((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesReminderSoundOff__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesShowCityToExternalUsers__typeInfo)) {
      setUserPreferencesShowCityToExternalUsers((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesShowCityToExternalUsers__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesShowCityToGuestUsers__typeInfo)) {
      setUserPreferencesShowCityToGuestUsers((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesShowCityToGuestUsers__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesShowCountryToExternalUsers__typeInfo)) {
      setUserPreferencesShowCountryToExternalUsers((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesShowCountryToExternalUsers__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesShowCountryToGuestUsers__typeInfo)) {
      setUserPreferencesShowCountryToGuestUsers((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesShowCountryToGuestUsers__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesShowEmailToExternalUsers__typeInfo)) {
      setUserPreferencesShowEmailToExternalUsers((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesShowEmailToExternalUsers__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesShowEmailToGuestUsers__typeInfo)) {
      setUserPreferencesShowEmailToGuestUsers((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesShowEmailToGuestUsers__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesShowFaxToExternalUsers__typeInfo)) {
      setUserPreferencesShowFaxToExternalUsers((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesShowFaxToExternalUsers__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesShowFaxToGuestUsers__typeInfo)) {
      setUserPreferencesShowFaxToGuestUsers((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesShowFaxToGuestUsers__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesShowManagerToExternalUsers__typeInfo)) {
      setUserPreferencesShowManagerToExternalUsers((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesShowManagerToExternalUsers__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesShowManagerToGuestUsers__typeInfo)) {
      setUserPreferencesShowManagerToGuestUsers((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesShowManagerToGuestUsers__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesShowMobilePhoneToExternalUsers__typeInfo)) {
      setUserPreferencesShowMobilePhoneToExternalUsers((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesShowMobilePhoneToExternalUsers__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesShowMobilePhoneToGuestUsers__typeInfo)) {
      setUserPreferencesShowMobilePhoneToGuestUsers((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesShowMobilePhoneToGuestUsers__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesShowPostalCodeToExternalUsers__typeInfo)) {
      setUserPreferencesShowPostalCodeToExternalUsers((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesShowPostalCodeToExternalUsers__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesShowPostalCodeToGuestUsers__typeInfo)) {
      setUserPreferencesShowPostalCodeToGuestUsers((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesShowPostalCodeToGuestUsers__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesShowProfilePicToGuestUsers__typeInfo)) {
      setUserPreferencesShowProfilePicToGuestUsers((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesShowProfilePicToGuestUsers__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesShowStateToExternalUsers__typeInfo)) {
      setUserPreferencesShowStateToExternalUsers((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesShowStateToExternalUsers__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesShowStateToGuestUsers__typeInfo)) {
      setUserPreferencesShowStateToGuestUsers((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesShowStateToGuestUsers__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesShowStreetAddressToExternalUsers__typeInfo)) {
      setUserPreferencesShowStreetAddressToExternalUsers((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesShowStreetAddressToExternalUsers__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesShowStreetAddressToGuestUsers__typeInfo)) {
      setUserPreferencesShowStreetAddressToGuestUsers((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesShowStreetAddressToGuestUsers__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesShowTitleToExternalUsers__typeInfo)) {
      setUserPreferencesShowTitleToExternalUsers((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesShowTitleToExternalUsers__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesShowTitleToGuestUsers__typeInfo)) {
      setUserPreferencesShowTitleToGuestUsers((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesShowTitleToGuestUsers__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesShowWorkPhoneToExternalUsers__typeInfo)) {
      setUserPreferencesShowWorkPhoneToExternalUsers((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesShowWorkPhoneToExternalUsers__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesShowWorkPhoneToGuestUsers__typeInfo)) {
      setUserPreferencesShowWorkPhoneToGuestUsers((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesShowWorkPhoneToGuestUsers__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesSortFeedByComment__typeInfo)) {
      setUserPreferencesSortFeedByComment((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesSortFeedByComment__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserPreferencesTaskRemindersCheckboxDefault__typeInfo)) {
      setUserPreferencesTaskRemindersCheckboxDefault((java.lang.Boolean)__typeMapper.readObject(__in, UserPreferencesTaskRemindersCheckboxDefault__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserProfileSkillChildren__typeInfo)) {
      setUserProfileSkillChildren((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, UserProfileSkillChildren__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserProfileSkillUserEndorsements__typeInfo)) {
      setUserProfileSkillUserEndorsements((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, UserProfileSkillUserEndorsements__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserRole__typeInfo)) {
      setUserRole((com.sforce.soap.enterprise.sobject.UserRole)__typeMapper.readObject(__in, UserRole__typeInfo, com.sforce.soap.enterprise.sobject.UserRole.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserRoleId__typeInfo)) {
      setUserRoleId((java.lang.String)__typeMapper.readString(__in, UserRoleId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserSites__typeInfo)) {
      setUserSites((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, UserSites__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserType__typeInfo)) {
      setUserType((java.lang.String)__typeMapper.readString(__in, UserType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, User_Code__c__typeInfo)) {
      setUser_Code__c((java.lang.String)__typeMapper.readString(__in, User_Code__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Username__typeInfo)) {
      setUsername((java.lang.String)__typeMapper.readString(__in, Username__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Users__r__typeInfo)) {
      setUsers__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Users__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__User_Inboxes__r__typeInfo)) {
      setVCSSAP__User_Inboxes__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, VCSSAP__User_Inboxes__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__VCSEmails__r__typeInfo)) {
      setVCSSAP__VCSEmails__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, VCSSAP__VCSEmails__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, almond__Achievement_Assignments__r__typeInfo)) {
      setAlmond__Achievement_Assignments__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, almond__Achievement_Assignments__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, almond__Achievements__r__typeInfo)) {
      setAlmond__Achievements__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, almond__Achievements__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, almond__Learning_Assignments1__r__typeInfo)) {
      setAlmond__Learning_Assignments1__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, almond__Learning_Assignments1__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, almond__Learning_Assignments__r__typeInfo)) {
      setAlmond__Learning_Assignments__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, almond__Learning_Assignments__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, almond__Responses__r__typeInfo)) {
      setAlmond__Responses__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, almond__Responses__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, almond__Shared_Learning_Assignments1__r__typeInfo)) {
      setAlmond__Shared_Learning_Assignments1__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, almond__Shared_Learning_Assignments1__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, almond__Shared_Learning_Assignments__r__typeInfo)) {
      setAlmond__Shared_Learning_Assignments__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, almond__Shared_Learning_Assignments__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, almond__Task_Approvers__r__typeInfo)) {
      setAlmond__Task_Approvers__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, almond__Task_Approvers__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, almond__Training_Plan_Access_Requests__r__typeInfo)) {
      setAlmond__Training_Plan_Access_Requests__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, almond__Training_Plan_Access_Requests__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, almond__Training_Plan_Assignments__r__typeInfo)) {
      setAlmond__Training_Plan_Assignments__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, almond__Training_Plan_Assignments__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, almond__Training_Plan_Feedbacks__r__typeInfo)) {
      setAlmond__Training_Plan_Feedbacks__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, almond__Training_Plan_Feedbacks__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, almond__Training_Plan_Section_Assignments__r__typeInfo)) {
      setAlmond__Training_Plan_Section_Assignments__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, almond__Training_Plan_Section_Assignments__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, aos__X50_Point_Roles__r__typeInfo)) {
      setAos__X50_Point_Roles__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, aos__X50_Point_Roles__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, client_approval__c__typeInfo)) {
      setClient_approval__c((java.lang.String)__typeMapper.readString(__in, client_approval__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, client_approval__r__typeInfo)) {
      setClient_approval__r((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, client_approval__r__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dupcheck__Duplicate_Check_Audits__r__typeInfo)) {
      setDupcheck__Duplicate_Check_Audits__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, dupcheck__Duplicate_Check_Audits__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dupcheck__dc3DisableDuplicateCheck__c__typeInfo)) {
      setDupcheck__dc3DisableDuplicateCheck__c((java.lang.Boolean)__typeMapper.readObject(__in, dupcheck__dc3DisableDuplicateCheck__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Agreements1__r__typeInfo)) {
      setEchosign_dev1__Agreements1__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, echosign_dev1__Agreements1__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Agreements2__r__typeInfo)) {
      setEchosign_dev1__Agreements2__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, echosign_dev1__Agreements2__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Agreements3__r__typeInfo)) {
      setEchosign_dev1__Agreements3__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, echosign_dev1__Agreements3__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Agreements_Senders__r__typeInfo)) {
      setEchosign_dev1__Agreements_Senders__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, echosign_dev1__Agreements_Senders__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Agreements__r__typeInfo)) {
      setEchosign_dev1__Agreements__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, echosign_dev1__Agreements__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__EchoSign_Allow_Delegated_Sending__c__typeInfo)) {
      setEchosign_dev1__EchoSign_Allow_Delegated_Sending__c((java.lang.Boolean)__typeMapper.readObject(__in, echosign_dev1__EchoSign_Allow_Delegated_Sending__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__EchoSign_Email_Verified__c__typeInfo)) {
      setEchosign_dev1__EchoSign_Email_Verified__c((java.lang.Boolean)__typeMapper.readObject(__in, echosign_dev1__EchoSign_Email_Verified__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Echosign_Recipients__r__typeInfo)) {
      setEchosign_dev1__Echosign_Recipients__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, echosign_dev1__Echosign_Recipients__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Process_Templates__r__typeInfo)) {
      setEchosign_dev1__Process_Templates__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, echosign_dev1__Process_Templates__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Recipient_Templates__r__typeInfo)) {
      setEchosign_dev1__Recipient_Templates__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, echosign_dev1__Recipient_Templates__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__AAUserPrefs__r__typeInfo)) {
      setI__AAUserPrefs__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, i__AAUserPrefs__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__EmailAddrs__r__typeInfo)) {
      setI__EmailAddrs__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, i__EmailAddrs__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__R00N700000028MRVEA2__r__typeInfo)) {
      setI__R00N700000028MRVEA2__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, i__R00N700000028MRVEA2__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__R00N700000028MSBEA2__r__typeInfo)) {
      setI__R00N700000028MSBEA2__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, i__R00N700000028MSBEA2__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__R00N700000028QWKEA2__r__typeInfo)) {
      setI__R00N700000028QWKEA2__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, i__R00N700000028QWKEA2__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__R00N700000028QWREA2__r__typeInfo)) {
      setI__R00N700000028QWREA2__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, i__R00N700000028QWREA2__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, punch__HideOnPunchboard__c__typeInfo)) {
      setPunch__HideOnPunchboard__c((java.lang.Boolean)__typeMapper.readObject(__in, punch__HideOnPunchboard__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, punch__LastDate__c__typeInfo)) {
      setPunch__LastDate__c((java.util.Calendar)__typeMapper.readObject(__in, punch__LastDate__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, punch__LastDescription__c__typeInfo)) {
      setPunch__LastDescription__c((java.lang.String)__typeMapper.readString(__in, punch__LastDescription__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, punch__LastEstimatedReturn__c__typeInfo)) {
      setPunch__LastEstimatedReturn__c((java.util.Calendar)__typeMapper.readObject(__in, punch__LastEstimatedReturn__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, punch__LastStatus__c__typeInfo)) {
      setPunch__LastStatus__c((java.lang.String)__typeMapper.readString(__in, punch__LastStatus__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Describes__r__typeInfo)) {
      setRh2__Describes__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, rh2__Describes__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, simplesurvey__Survey_Configurations__r__typeInfo)) {
      setSimplesurvey__Survey_Configurations__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, simplesurvey__Survey_Configurations__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, simplesurvey__Surveys__r__typeInfo)) {
      setSimplesurvey__Surveys__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, simplesurvey__Surveys__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, smagicinteract__SMS_History__r__typeInfo)) {
      setSmagicinteract__SMS_History__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, smagicinteract__SMS_History__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, smagicinteract__forward_configs__r__typeInfo)) {
      setSmagicinteract__forward_configs__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, smagicinteract__forward_configs__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, smagicinteract__smsMagic__r__typeInfo)) {
      setSmagicinteract__smsMagic__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, smagicinteract__smsMagic__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[User ");
    sb.append(super.toString());
    sb.append(" AboutMe=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AboutMe)+"'\n");
    sb.append(" AcceptedEventRelations=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AcceptedEventRelations)+"'\n");
    sb.append(" Account=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Account)+"'\n");
    sb.append(" AccountId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AccountId)+"'\n");
    sb.append(" Accounts__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Accounts__r)+"'\n");
    sb.append(" Address=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Address)+"'\n");
    sb.append(" Admin_Employees__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Admin_Employees__r)+"'\n");
    sb.append(" Alias=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Alias)+"'\n");
    sb.append(" Applicants__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Applicants__r)+"'\n");
    sb.append(" Assignments1__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Assignments1__r)+"'\n");
    sb.append(" Assignments2__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Assignments2__r)+"'\n");
    sb.append(" Assignments__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Assignments__r)+"'\n");
    sb.append(" AttachedContentDocuments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentDocuments)+"'\n");
    sb.append(" AttachedContentNotes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentNotes)+"'\n");
    sb.append(" BadgeText=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(BadgeText)+"'\n");
    sb.append(" Badges=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Badges)+"'\n");
    sb.append(" BannerPhotoUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(BannerPhotoUrl)+"'\n");
    sb.append(" Budgets_and_Actuals__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Budgets_and_Actuals__r)+"'\n");
    sb.append(" Business_Services1__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Business_Services1__r)+"'\n");
    sb.append(" Business_Services__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Business_Services__r)+"'\n");
    sb.append(" CallCenterId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CallCenterId)+"'\n");
    sb.append(" Candidate_Geocodes__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Candidate_Geocodes__r)+"'\n");
    sb.append(" Case_Swarm_Rules__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Case_Swarm_Rules__r)+"'\n");
    sb.append(" Cases__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Cases__r)+"'\n");
    sb.append(" City=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(City)+"'\n");
    sb.append(" CombinedAttachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CombinedAttachments)+"'\n");
    sb.append(" CommunityNickname=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CommunityNickname)+"'\n");
    sb.append(" CompanyName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CompanyName)+"'\n");
    sb.append(" Consultant_ID__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Consultant_ID__c)+"'\n");
    sb.append(" Contact=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Contact)+"'\n");
    sb.append(" ContactId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContactId)+"'\n");
    sb.append(" Contacts__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Contacts__r)+"'\n");
    sb.append(" ContentDocumentLinks=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContentDocumentLinks)+"'\n");
    sb.append(" ContractsSigned=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContractsSigned)+"'\n");
    sb.append(" Country=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Country)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" DeclinedEventRelations=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DeclinedEventRelations)+"'\n");
    sb.append(" DefaultGroupNotificationFrequency=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DefaultGroupNotificationFrequency)+"'\n");
    sb.append(" DelegatedApproverId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DelegatedApproverId)+"'\n");
    sb.append(" DelegatedUsers=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DelegatedUsers)+"'\n");
    sb.append(" Department=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Department)+"'\n");
    sb.append(" DigestFrequency=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DigestFrequency)+"'\n");
    sb.append(" Division=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Division)+"'\n");
    sb.append(" Email=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Email)+"'\n");
    sb.append(" EmailEncodingKey=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EmailEncodingKey)+"'\n");
    sb.append(" EmailMessageRelations=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EmailMessageRelations)+"'\n");
    sb.append(" EmailPreferencesAutoBcc=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EmailPreferencesAutoBcc)+"'\n");
    sb.append(" EmailPreferencesAutoBccStayInTouch=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EmailPreferencesAutoBccStayInTouch)+"'\n");
    sb.append(" EmailPreferencesStayInTouchReminder=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EmailPreferencesStayInTouchReminder)+"'\n");
    sb.append(" EmployeeNumber=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EmployeeNumber)+"'\n");
    sb.append(" EventRelations=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EventRelations)+"'\n");
    sb.append(" Extension=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Extension)+"'\n");
    sb.append(" ExternalDataUserAuths=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ExternalDataUserAuths)+"'\n");
    sb.append(" Fax=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Fax)+"'\n");
    sb.append(" FederationIdentifier=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FederationIdentifier)+"'\n");
    sb.append(" FeedSubscriptions=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FeedSubscriptions)+"'\n");
    sb.append(" FeedSubscriptionsForEntity=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FeedSubscriptionsForEntity)+"'\n");
    sb.append(" Feed_Post_Swarm_Rules__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Feed_Post_Swarm_Rules__r)+"'\n");
    sb.append(" Feeds=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Feeds)+"'\n");
    sb.append(" FirstName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FirstName)+"'\n");
    sb.append(" ForecastEnabled=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ForecastEnabled)+"'\n");
    sb.append(" FullPhotoUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FullPhotoUrl)+"'\n");
    sb.append(" GeocodeAccuracy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(GeocodeAccuracy)+"'\n");
    sb.append(" GivenThanks=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(GivenThanks)+"'\n");
    sb.append(" GroupMembershipRequests=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(GroupMembershipRequests)+"'\n");
    sb.append(" GroupMemberships=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(GroupMemberships)+"'\n");
    sb.append(" InstalledMobileApps=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(InstalledMobileApps)+"'\n");
    sb.append(" IsActive=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsActive)+"'\n");
    sb.append(" IsPortalEnabled=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsPortalEnabled)+"'\n");
    sb.append(" IsProfilePhotoActive=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsProfilePhotoActive)+"'\n");
    sb.append(" LanguageLocaleKey=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LanguageLocaleKey)+"'\n");
    sb.append(" LastLoginDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastLoginDate)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" LastName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastName)+"'\n");
    sb.append(" LastPasswordChangeDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastPasswordChangeDate)+"'\n");
    sb.append(" LastReferencedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastReferencedDate)+"'\n");
    sb.append(" LastViewedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastViewedDate)+"'\n");
    sb.append(" Latitude=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Latitude)+"'\n");
    sb.append(" Lead_Swarm_Rules__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Lead_Swarm_Rules__r)+"'\n");
    sb.append(" LocaleSidKey=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LocaleSidKey)+"'\n");
    sb.append(" Longitude=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Longitude)+"'\n");
    sb.append(" MME__EmailMessages__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MME__EmailMessages__r)+"'\n");
    sb.append(" ManagedUsers=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ManagedUsers)+"'\n");
    sb.append(" Manager=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Manager)+"'\n");
    sb.append(" ManagerId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ManagerId)+"'\n");
    sb.append(" MediumBannerPhotoUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MediumBannerPhotoUrl)+"'\n");
    sb.append(" MediumPhotoUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MediumPhotoUrl)+"'\n");
    sb.append(" MobilePhone=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MobilePhone)+"'\n");
    sb.append(" Name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");
    sb.append(" OfflinePdaTrialExpirationDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OfflinePdaTrialExpirationDate)+"'\n");
    sb.append(" OfflineTrialExpirationDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OfflineTrialExpirationDate)+"'\n");
    sb.append(" Opportunities__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Opportunities__r)+"'\n");
    sb.append(" Opportunity_Swarm_Rules__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Opportunity_Swarm_Rules__r)+"'\n");
    sb.append(" Order_Swarm_Rules__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Order_Swarm_Rules__r)+"'\n");
    sb.append(" Orders1__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Orders1__r)+"'\n");
    sb.append(" Orders2__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Orders2__r)+"'\n");
    sb.append(" Orders3__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Orders3__r)+"'\n");
    sb.append(" Orders4__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Orders4__r)+"'\n");
    sb.append(" Orders5__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Orders5__r)+"'\n");
    sb.append(" Orders__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Orders__r)+"'\n");
    sb.append(" OwnedContentDocuments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OwnedContentDocuments)+"'\n");
    sb.append(" PermissionSetAssignments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionSetAssignments)+"'\n");
    sb.append(" PermissionSetLicenseAssignments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionSetLicenseAssignments)+"'\n");
    sb.append(" Phone=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Phone)+"'\n");
    sb.append(" PortalRole=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PortalRole)+"'\n");
    sb.append(" PostalCode=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PostalCode)+"'\n");
    sb.append(" Profile=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Profile)+"'\n");
    sb.append(" ProfileId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProfileId)+"'\n");
    sb.append(" Proxy__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Proxy__r)+"'\n");
    sb.append(" QuestionSubscriptions=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(QuestionSubscriptions)+"'\n");
    sb.append(" R00N30000001eUPVEA2__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(R00N30000001eUPVEA2__r)+"'\n");
    sb.append(" ReceivesAdminInfoEmails=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ReceivesAdminInfoEmails)+"'\n");
    sb.append(" ReceivesInfoEmails=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ReceivesInfoEmails)+"'\n");
    sb.append(" Regions1__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Regions1__r)+"'\n");
    sb.append(" Regions2__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Regions2__r)+"'\n");
    sb.append(" Regions__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Regions__r)+"'\n");
    sb.append(" Revenues1__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Revenues1__r)+"'\n");
    sb.append(" Revenues__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Revenues__r)+"'\n");
    sb.append(" Rogue_Payment_Objects__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Rogue_Payment_Objects__r)+"'\n");
    sb.append(" S4STEO__TransferOwnersNewOwner__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(S4STEO__TransferOwnersNewOwner__r)+"'\n");
    sb.append(" S4STEO__TransferOwnersOldOwner__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(S4STEO__TransferOwnersOldOwner__r)+"'\n");
    sb.append(" Safety_Actions__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Safety_Actions__r)+"'\n");
    sb.append(" SenderEmail=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SenderEmail)+"'\n");
    sb.append(" SenderName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SenderName)+"'\n");
    sb.append(" Shares=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Shares)+"'\n");
    sb.append(" Signature=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Signature)+"'\n");
    sb.append(" SmallBannerPhotoUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SmallBannerPhotoUrl)+"'\n");
    sb.append(" SmallPhotoUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SmallPhotoUrl)+"'\n");
    sb.append(" State=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(State)+"'\n");
    sb.append(" StayInTouchNote=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(StayInTouchNote)+"'\n");
    sb.append(" StayInTouchSignature=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(StayInTouchSignature)+"'\n");
    sb.append(" StayInTouchSubject=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(StayInTouchSubject)+"'\n");
    sb.append(" Street=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Street)+"'\n");
    sb.append(" Surveys__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Surveys__r)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" TimeZoneSidKey=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TimeZoneSidKey)+"'\n");
    sb.append(" TimesheetsSubmitted__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TimesheetsSubmitted__r)+"'\n");
    sb.append(" Timesheets__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Timesheets__r)+"'\n");
    sb.append(" Title=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Title)+"'\n");
    sb.append(" Training_Participants__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Training_Participants__r)+"'\n");
    sb.append(" USERHISTORY__User_History_Changed_By__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(USERHISTORY__User_History_Changed_By__r)+"'\n");
    sb.append(" USERHISTORY__User_History_User__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(USERHISTORY__User_History_User__r)+"'\n");
    sb.append(" UndecidedEventRelations=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UndecidedEventRelations)+"'\n");
    sb.append(" Unverified_Time__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Unverified_Time__r)+"'\n");
    sb.append(" UserEntityAccessRights=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserEntityAccessRights)+"'\n");
    sb.append(" UserFieldAccessRights=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserFieldAccessRights)+"'\n");
    sb.append(" UserPermissionsAvantgoUser=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPermissionsAvantgoUser)+"'\n");
    sb.append(" UserPermissionsCallCenterAutoLogin=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPermissionsCallCenterAutoLogin)+"'\n");
    sb.append(" UserPermissionsChatterAnswersUser=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPermissionsChatterAnswersUser)+"'\n");
    sb.append(" UserPermissionsInteractionUser=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPermissionsInteractionUser)+"'\n");
    sb.append(" UserPermissionsKnowledgeUser=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPermissionsKnowledgeUser)+"'\n");
    sb.append(" UserPermissionsMarketingUser=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPermissionsMarketingUser)+"'\n");
    sb.append(" UserPermissionsMobileUser=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPermissionsMobileUser)+"'\n");
    sb.append(" UserPermissionsOfflineUser=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPermissionsOfflineUser)+"'\n");
    sb.append(" UserPermissionsSFContentUser=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPermissionsSFContentUser)+"'\n");
    sb.append(" UserPermissionsSupportUser=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPermissionsSupportUser)+"'\n");
    sb.append(" UserPreferences=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferences)+"'\n");
    sb.append(" UserPreferencesActivityRemindersPopup=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesActivityRemindersPopup)+"'\n");
    sb.append(" UserPreferencesApexPagesDeveloperMode=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesApexPagesDeveloperMode)+"'\n");
    sb.append(" UserPreferencesCacheDiagnostics=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesCacheDiagnostics)+"'\n");
    sb.append(" UserPreferencesContentEmailAsAndWhen=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesContentEmailAsAndWhen)+"'\n");
    sb.append(" UserPreferencesContentNoEmail=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesContentNoEmail)+"'\n");
    sb.append(" UserPreferencesCreateLEXAppsWTShown=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesCreateLEXAppsWTShown)+"'\n");
    sb.append(" UserPreferencesDisCommentAfterLikeEmail=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesDisCommentAfterLikeEmail)+"'\n");
    sb.append(" UserPreferencesDisMentionsCommentEmail=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesDisMentionsCommentEmail)+"'\n");
    sb.append(" UserPreferencesDisProfPostCommentEmail=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesDisProfPostCommentEmail)+"'\n");
    sb.append(" UserPreferencesDisableAllFeedsEmail=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesDisableAllFeedsEmail)+"'\n");
    sb.append(" UserPreferencesDisableBookmarkEmail=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesDisableBookmarkEmail)+"'\n");
    sb.append(" UserPreferencesDisableChangeCommentEmail=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesDisableChangeCommentEmail)+"'\n");
    sb.append(" UserPreferencesDisableEndorsementEmail=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesDisableEndorsementEmail)+"'\n");
    sb.append(" UserPreferencesDisableFileShareNotificationsForApi=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesDisableFileShareNotificationsForApi)+"'\n");
    sb.append(" UserPreferencesDisableFollowersEmail=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesDisableFollowersEmail)+"'\n");
    sb.append(" UserPreferencesDisableLaterCommentEmail=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesDisableLaterCommentEmail)+"'\n");
    sb.append(" UserPreferencesDisableLikeEmail=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesDisableLikeEmail)+"'\n");
    sb.append(" UserPreferencesDisableMentionsPostEmail=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesDisableMentionsPostEmail)+"'\n");
    sb.append(" UserPreferencesDisableMessageEmail=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesDisableMessageEmail)+"'\n");
    sb.append(" UserPreferencesDisableProfilePostEmail=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesDisableProfilePostEmail)+"'\n");
    sb.append(" UserPreferencesDisableSharePostEmail=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesDisableSharePostEmail)+"'\n");
    sb.append(" UserPreferencesEnableAutoSubForFeeds=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesEnableAutoSubForFeeds)+"'\n");
    sb.append(" UserPreferencesEventRemindersCheckboxDefault=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesEventRemindersCheckboxDefault)+"'\n");
    sb.append(" UserPreferencesGlobalNavBarWTShown=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesGlobalNavBarWTShown)+"'\n");
    sb.append(" UserPreferencesGlobalNavGridMenuWTShown=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesGlobalNavGridMenuWTShown)+"'\n");
    sb.append(" UserPreferencesHideBiggerPhotoCallout=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesHideBiggerPhotoCallout)+"'\n");
    sb.append(" UserPreferencesHideCSNDesktopTask=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesHideCSNDesktopTask)+"'\n");
    sb.append(" UserPreferencesHideCSNGetChatterMobileTask=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesHideCSNGetChatterMobileTask)+"'\n");
    sb.append(" UserPreferencesHideChatterOnboardingSplash=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesHideChatterOnboardingSplash)+"'\n");
    sb.append(" UserPreferencesHideEndUserOnboardingAssistantModal=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesHideEndUserOnboardingAssistantModal)+"'\n");
    sb.append(" UserPreferencesHideLightningMigrationModal=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesHideLightningMigrationModal)+"'\n");
    sb.append(" UserPreferencesHideS1BrowserUI=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesHideS1BrowserUI)+"'\n");
    sb.append(" UserPreferencesHideSecondChatterOnboardingSplash=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesHideSecondChatterOnboardingSplash)+"'\n");
    sb.append(" UserPreferencesHideSfxWelcomeMat=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesHideSfxWelcomeMat)+"'\n");
    sb.append(" UserPreferencesLightningExperiencePreferred=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesLightningExperiencePreferred)+"'\n");
    sb.append(" UserPreferencesPathAssistantCollapsed=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesPathAssistantCollapsed)+"'\n");
    sb.append(" UserPreferencesPreviewLightning=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesPreviewLightning)+"'\n");
    sb.append(" UserPreferencesReminderSoundOff=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesReminderSoundOff)+"'\n");
    sb.append(" UserPreferencesShowCityToExternalUsers=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesShowCityToExternalUsers)+"'\n");
    sb.append(" UserPreferencesShowCityToGuestUsers=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesShowCityToGuestUsers)+"'\n");
    sb.append(" UserPreferencesShowCountryToExternalUsers=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesShowCountryToExternalUsers)+"'\n");
    sb.append(" UserPreferencesShowCountryToGuestUsers=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesShowCountryToGuestUsers)+"'\n");
    sb.append(" UserPreferencesShowEmailToExternalUsers=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesShowEmailToExternalUsers)+"'\n");
    sb.append(" UserPreferencesShowEmailToGuestUsers=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesShowEmailToGuestUsers)+"'\n");
    sb.append(" UserPreferencesShowFaxToExternalUsers=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesShowFaxToExternalUsers)+"'\n");
    sb.append(" UserPreferencesShowFaxToGuestUsers=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesShowFaxToGuestUsers)+"'\n");
    sb.append(" UserPreferencesShowManagerToExternalUsers=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesShowManagerToExternalUsers)+"'\n");
    sb.append(" UserPreferencesShowManagerToGuestUsers=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesShowManagerToGuestUsers)+"'\n");
    sb.append(" UserPreferencesShowMobilePhoneToExternalUsers=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesShowMobilePhoneToExternalUsers)+"'\n");
    sb.append(" UserPreferencesShowMobilePhoneToGuestUsers=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesShowMobilePhoneToGuestUsers)+"'\n");
    sb.append(" UserPreferencesShowPostalCodeToExternalUsers=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesShowPostalCodeToExternalUsers)+"'\n");
    sb.append(" UserPreferencesShowPostalCodeToGuestUsers=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesShowPostalCodeToGuestUsers)+"'\n");
    sb.append(" UserPreferencesShowProfilePicToGuestUsers=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesShowProfilePicToGuestUsers)+"'\n");
    sb.append(" UserPreferencesShowStateToExternalUsers=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesShowStateToExternalUsers)+"'\n");
    sb.append(" UserPreferencesShowStateToGuestUsers=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesShowStateToGuestUsers)+"'\n");
    sb.append(" UserPreferencesShowStreetAddressToExternalUsers=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesShowStreetAddressToExternalUsers)+"'\n");
    sb.append(" UserPreferencesShowStreetAddressToGuestUsers=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesShowStreetAddressToGuestUsers)+"'\n");
    sb.append(" UserPreferencesShowTitleToExternalUsers=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesShowTitleToExternalUsers)+"'\n");
    sb.append(" UserPreferencesShowTitleToGuestUsers=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesShowTitleToGuestUsers)+"'\n");
    sb.append(" UserPreferencesShowWorkPhoneToExternalUsers=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesShowWorkPhoneToExternalUsers)+"'\n");
    sb.append(" UserPreferencesShowWorkPhoneToGuestUsers=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesShowWorkPhoneToGuestUsers)+"'\n");
    sb.append(" UserPreferencesSortFeedByComment=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesSortFeedByComment)+"'\n");
    sb.append(" UserPreferencesTaskRemindersCheckboxDefault=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserPreferencesTaskRemindersCheckboxDefault)+"'\n");
    sb.append(" UserProfileSkillChildren=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserProfileSkillChildren)+"'\n");
    sb.append(" UserProfileSkillUserEndorsements=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserProfileSkillUserEndorsements)+"'\n");
    sb.append(" UserRole=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserRole)+"'\n");
    sb.append(" UserRoleId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserRoleId)+"'\n");
    sb.append(" UserSites=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserSites)+"'\n");
    sb.append(" UserType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserType)+"'\n");
    sb.append(" User_Code__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(User_Code__c)+"'\n");
    sb.append(" Username=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Username)+"'\n");
    sb.append(" Users__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Users__r)+"'\n");
    sb.append(" VCSSAP__User_Inboxes__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__User_Inboxes__r)+"'\n");
    sb.append(" VCSSAP__VCSEmails__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__VCSEmails__r)+"'\n");
    sb.append(" almond__Achievement_Assignments__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(almond__Achievement_Assignments__r)+"'\n");
    sb.append(" almond__Achievements__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(almond__Achievements__r)+"'\n");
    sb.append(" almond__Learning_Assignments1__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(almond__Learning_Assignments1__r)+"'\n");
    sb.append(" almond__Learning_Assignments__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(almond__Learning_Assignments__r)+"'\n");
    sb.append(" almond__Responses__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(almond__Responses__r)+"'\n");
    sb.append(" almond__Shared_Learning_Assignments1__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(almond__Shared_Learning_Assignments1__r)+"'\n");
    sb.append(" almond__Shared_Learning_Assignments__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(almond__Shared_Learning_Assignments__r)+"'\n");
    sb.append(" almond__Task_Approvers__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(almond__Task_Approvers__r)+"'\n");
    sb.append(" almond__Training_Plan_Access_Requests__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(almond__Training_Plan_Access_Requests__r)+"'\n");
    sb.append(" almond__Training_Plan_Assignments__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(almond__Training_Plan_Assignments__r)+"'\n");
    sb.append(" almond__Training_Plan_Feedbacks__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(almond__Training_Plan_Feedbacks__r)+"'\n");
    sb.append(" almond__Training_Plan_Section_Assignments__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(almond__Training_Plan_Section_Assignments__r)+"'\n");
    sb.append(" aos__X50_Point_Roles__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(aos__X50_Point_Roles__r)+"'\n");
    sb.append(" client_approval__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(client_approval__c)+"'\n");
    sb.append(" client_approval__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(client_approval__r)+"'\n");
    sb.append(" dupcheck__Duplicate_Check_Audits__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dupcheck__Duplicate_Check_Audits__r)+"'\n");
    sb.append(" dupcheck__dc3DisableDuplicateCheck__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dupcheck__dc3DisableDuplicateCheck__c)+"'\n");
    sb.append(" echosign_dev1__Agreements1__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Agreements1__r)+"'\n");
    sb.append(" echosign_dev1__Agreements2__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Agreements2__r)+"'\n");
    sb.append(" echosign_dev1__Agreements3__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Agreements3__r)+"'\n");
    sb.append(" echosign_dev1__Agreements_Senders__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Agreements_Senders__r)+"'\n");
    sb.append(" echosign_dev1__Agreements__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Agreements__r)+"'\n");
    sb.append(" echosign_dev1__EchoSign_Allow_Delegated_Sending__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__EchoSign_Allow_Delegated_Sending__c)+"'\n");
    sb.append(" echosign_dev1__EchoSign_Email_Verified__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__EchoSign_Email_Verified__c)+"'\n");
    sb.append(" echosign_dev1__Echosign_Recipients__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Echosign_Recipients__r)+"'\n");
    sb.append(" echosign_dev1__Process_Templates__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Process_Templates__r)+"'\n");
    sb.append(" echosign_dev1__Recipient_Templates__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Recipient_Templates__r)+"'\n");
    sb.append(" i__AAUserPrefs__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__AAUserPrefs__r)+"'\n");
    sb.append(" i__EmailAddrs__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__EmailAddrs__r)+"'\n");
    sb.append(" i__R00N700000028MRVEA2__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__R00N700000028MRVEA2__r)+"'\n");
    sb.append(" i__R00N700000028MSBEA2__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__R00N700000028MSBEA2__r)+"'\n");
    sb.append(" i__R00N700000028QWKEA2__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__R00N700000028QWKEA2__r)+"'\n");
    sb.append(" i__R00N700000028QWREA2__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__R00N700000028QWREA2__r)+"'\n");
    sb.append(" punch__HideOnPunchboard__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(punch__HideOnPunchboard__c)+"'\n");
    sb.append(" punch__LastDate__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(punch__LastDate__c)+"'\n");
    sb.append(" punch__LastDescription__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(punch__LastDescription__c)+"'\n");
    sb.append(" punch__LastEstimatedReturn__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(punch__LastEstimatedReturn__c)+"'\n");
    sb.append(" punch__LastStatus__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(punch__LastStatus__c)+"'\n");
    sb.append(" rh2__Describes__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Describes__r)+"'\n");
    sb.append(" simplesurvey__Survey_Configurations__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(simplesurvey__Survey_Configurations__r)+"'\n");
    sb.append(" simplesurvey__Surveys__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(simplesurvey__Surveys__r)+"'\n");
    sb.append(" smagicinteract__SMS_History__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(smagicinteract__SMS_History__r)+"'\n");
    sb.append(" smagicinteract__forward_configs__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(smagicinteract__forward_configs__r)+"'\n");
    sb.append(" smagicinteract__smsMagic__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(smagicinteract__smsMagic__r)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}