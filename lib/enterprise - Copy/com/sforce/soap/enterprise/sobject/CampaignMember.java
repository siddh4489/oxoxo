package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class CampaignMember extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public CampaignMember() {
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
   * element  : CompanyOrAccount of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CompanyOrAccount__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CompanyOrAccount","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean CompanyOrAccount__is_set = false;

  private java.lang.String CompanyOrAccount;

  public java.lang.String getCompanyOrAccount() {
    return CompanyOrAccount;
  }

  

  public void setCompanyOrAccount(java.lang.String CompanyOrAccount) {
    this.CompanyOrAccount = CompanyOrAccount;
    CompanyOrAccount__is_set = true;
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
   * element  : DoNotCall of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo DoNotCall__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DoNotCall","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean DoNotCall__is_set = false;

  private java.lang.Boolean DoNotCall;

  public java.lang.Boolean getDoNotCall() {
    return DoNotCall;
  }

  

  public void setDoNotCall(java.lang.Boolean DoNotCall) {
    this.DoNotCall = DoNotCall;
    DoNotCall__is_set = true;
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
   * element  : FirstRespondedDate of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo FirstRespondedDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FirstRespondedDate","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean FirstRespondedDate__is_set = false;

  private java.util.Calendar FirstRespondedDate;

  public java.util.Calendar getFirstRespondedDate() {
    return FirstRespondedDate;
  }

  

  public void setFirstRespondedDate(java.util.Calendar FirstRespondedDate) {
    this.FirstRespondedDate = FirstRespondedDate;
    FirstRespondedDate__is_set = true;
  }
  
  /**
   * element  : HasOptedOutOfEmail of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo HasOptedOutOfEmail__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","HasOptedOutOfEmail","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean HasOptedOutOfEmail__is_set = false;

  private java.lang.Boolean HasOptedOutOfEmail;

  public java.lang.Boolean getHasOptedOutOfEmail() {
    return HasOptedOutOfEmail;
  }

  

  public void setHasOptedOutOfEmail(java.lang.Boolean HasOptedOutOfEmail) {
    this.HasOptedOutOfEmail = HasOptedOutOfEmail;
    HasOptedOutOfEmail__is_set = true;
  }
  
  /**
   * element  : HasOptedOutOfFax of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo HasOptedOutOfFax__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","HasOptedOutOfFax","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean HasOptedOutOfFax__is_set = false;

  private java.lang.Boolean HasOptedOutOfFax;

  public java.lang.Boolean getHasOptedOutOfFax() {
    return HasOptedOutOfFax;
  }

  

  public void setHasOptedOutOfFax(java.lang.Boolean HasOptedOutOfFax) {
    this.HasOptedOutOfFax = HasOptedOutOfFax;
    HasOptedOutOfFax__is_set = true;
  }
  
  /**
   * element  : HasResponded of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo HasResponded__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","HasResponded","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean HasResponded__is_set = false;

  private java.lang.Boolean HasResponded;

  public java.lang.Boolean getHasResponded() {
    return HasResponded;
  }

  

  public void setHasResponded(java.lang.Boolean HasResponded) {
    this.HasResponded = HasResponded;
    HasResponded__is_set = true;
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
   * element  : Lead of type {urn:sobject.enterprise.soap.sforce.com}Lead
   * java type: com.sforce.soap.enterprise.sobject.Lead
   */
  private static final com.sforce.ws.bind.TypeInfo Lead__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Lead","urn:sobject.enterprise.soap.sforce.com","Lead",0,1,true);

  private boolean Lead__is_set = false;

  private com.sforce.soap.enterprise.sobject.Lead Lead;

  public com.sforce.soap.enterprise.sobject.Lead getLead() {
    return Lead;
  }

  

  public void setLead(com.sforce.soap.enterprise.sobject.Lead Lead) {
    this.Lead = Lead;
    Lead__is_set = true;
  }
  
  /**
   * element  : LeadId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LeadId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LeadId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean LeadId__is_set = false;

  private java.lang.String LeadId;

  public java.lang.String getLeadId() {
    return LeadId;
  }

  

  public void setLeadId(java.lang.String LeadId) {
    this.LeadId = LeadId;
    LeadId__is_set = true;
  }
  
  /**
   * element  : LeadOrContactId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LeadOrContactId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LeadOrContactId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean LeadOrContactId__is_set = false;

  private java.lang.String LeadOrContactId;

  public java.lang.String getLeadOrContactId() {
    return LeadOrContactId;
  }

  

  public void setLeadOrContactId(java.lang.String LeadOrContactId) {
    this.LeadOrContactId = LeadOrContactId;
    LeadOrContactId__is_set = true;
  }
  
  /**
   * element  : LeadOrContactOwner of type {urn:sobject.enterprise.soap.sforce.com}Name
   * java type: com.sforce.soap.enterprise.sobject.Name
   */
  private static final com.sforce.ws.bind.TypeInfo LeadOrContactOwner__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LeadOrContactOwner","urn:sobject.enterprise.soap.sforce.com","Name",0,1,true);

  private boolean LeadOrContactOwner__is_set = false;

  private com.sforce.soap.enterprise.sobject.Name LeadOrContactOwner;

  public com.sforce.soap.enterprise.sobject.Name getLeadOrContactOwner() {
    return LeadOrContactOwner;
  }

  

  public void setLeadOrContactOwner(com.sforce.soap.enterprise.sobject.Name LeadOrContactOwner) {
    this.LeadOrContactOwner = LeadOrContactOwner;
    LeadOrContactOwner__is_set = true;
  }
  
  /**
   * element  : LeadOrContactOwnerId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LeadOrContactOwnerId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LeadOrContactOwnerId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean LeadOrContactOwnerId__is_set = false;

  private java.lang.String LeadOrContactOwnerId;

  public java.lang.String getLeadOrContactOwnerId() {
    return LeadOrContactOwnerId;
  }

  

  public void setLeadOrContactOwnerId(java.lang.String LeadOrContactOwnerId) {
    this.LeadOrContactOwnerId = LeadOrContactOwnerId;
    LeadOrContactOwnerId__is_set = true;
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
   * element  : Salutation of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Salutation__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Salutation","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Salutation__is_set = false;

  private java.lang.String Salutation;

  public java.lang.String getSalutation() {
    return Salutation;
  }

  

  public void setSalutation(java.lang.String Salutation) {
    this.Salutation = Salutation;
    Salutation__is_set = true;
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
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "CampaignMember");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, Campaign__typeInfo, Campaign, Campaign__is_set);
    __typeMapper.writeString(__out, CampaignId__typeInfo, CampaignId, CampaignId__is_set);
    __typeMapper.writeString(__out, City__typeInfo, City, City__is_set);
    __typeMapper.writeString(__out, CompanyOrAccount__typeInfo, CompanyOrAccount, CompanyOrAccount__is_set);
    __typeMapper.writeObject(__out, Contact__typeInfo, Contact, Contact__is_set);
    __typeMapper.writeString(__out, ContactId__typeInfo, ContactId, ContactId__is_set);
    __typeMapper.writeString(__out, Country__typeInfo, Country, Country__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, Description__typeInfo, Description, Description__is_set);
    __typeMapper.writeObject(__out, DoNotCall__typeInfo, DoNotCall, DoNotCall__is_set);
    __typeMapper.writeString(__out, Email__typeInfo, Email, Email__is_set);
    __typeMapper.writeString(__out, Fax__typeInfo, Fax, Fax__is_set);
    __typeMapper.writeString(__out, FirstName__typeInfo, FirstName, FirstName__is_set);
    __typeMapper.writeObject(__out, FirstRespondedDate__typeInfo, FirstRespondedDate, FirstRespondedDate__is_set);
    __typeMapper.writeObject(__out, HasOptedOutOfEmail__typeInfo, HasOptedOutOfEmail, HasOptedOutOfEmail__is_set);
    __typeMapper.writeObject(__out, HasOptedOutOfFax__typeInfo, HasOptedOutOfFax, HasOptedOutOfFax__is_set);
    __typeMapper.writeObject(__out, HasResponded__typeInfo, HasResponded, HasResponded__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeString(__out, LastName__typeInfo, LastName, LastName__is_set);
    __typeMapper.writeObject(__out, Lead__typeInfo, Lead, Lead__is_set);
    __typeMapper.writeString(__out, LeadId__typeInfo, LeadId, LeadId__is_set);
    __typeMapper.writeString(__out, LeadOrContactId__typeInfo, LeadOrContactId, LeadOrContactId__is_set);
    __typeMapper.writeObject(__out, LeadOrContactOwner__typeInfo, LeadOrContactOwner, LeadOrContactOwner__is_set);
    __typeMapper.writeString(__out, LeadOrContactOwnerId__typeInfo, LeadOrContactOwnerId, LeadOrContactOwnerId__is_set);
    __typeMapper.writeString(__out, LeadSource__typeInfo, LeadSource, LeadSource__is_set);
    __typeMapper.writeString(__out, MobilePhone__typeInfo, MobilePhone, MobilePhone__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeString(__out, Phone__typeInfo, Phone, Phone__is_set);
    __typeMapper.writeString(__out, PostalCode__typeInfo, PostalCode, PostalCode__is_set);
    __typeMapper.writeString(__out, Salutation__typeInfo, Salutation, Salutation__is_set);
    __typeMapper.writeString(__out, State__typeInfo, State, State__is_set);
    __typeMapper.writeString(__out, Status__typeInfo, Status, Status__is_set);
    __typeMapper.writeString(__out, Street__typeInfo, Street, Street__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeString(__out, Title__typeInfo, Title, Title__is_set);
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
    if (__typeMapper.isElement(__in, Campaign__typeInfo)) {
      setCampaign((com.sforce.soap.enterprise.sobject.Campaign)__typeMapper.readObject(__in, Campaign__typeInfo, com.sforce.soap.enterprise.sobject.Campaign.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CampaignId__typeInfo)) {
      setCampaignId((java.lang.String)__typeMapper.readString(__in, CampaignId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, City__typeInfo)) {
      setCity((java.lang.String)__typeMapper.readString(__in, City__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CompanyOrAccount__typeInfo)) {
      setCompanyOrAccount((java.lang.String)__typeMapper.readString(__in, CompanyOrAccount__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Description__typeInfo)) {
      setDescription((java.lang.String)__typeMapper.readString(__in, Description__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DoNotCall__typeInfo)) {
      setDoNotCall((java.lang.Boolean)__typeMapper.readObject(__in, DoNotCall__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Email__typeInfo)) {
      setEmail((java.lang.String)__typeMapper.readString(__in, Email__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Fax__typeInfo)) {
      setFax((java.lang.String)__typeMapper.readString(__in, Fax__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FirstName__typeInfo)) {
      setFirstName((java.lang.String)__typeMapper.readString(__in, FirstName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FirstRespondedDate__typeInfo)) {
      setFirstRespondedDate((java.util.Calendar)__typeMapper.readObject(__in, FirstRespondedDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, HasOptedOutOfEmail__typeInfo)) {
      setHasOptedOutOfEmail((java.lang.Boolean)__typeMapper.readObject(__in, HasOptedOutOfEmail__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, HasOptedOutOfFax__typeInfo)) {
      setHasOptedOutOfFax((java.lang.Boolean)__typeMapper.readObject(__in, HasOptedOutOfFax__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, HasResponded__typeInfo)) {
      setHasResponded((java.lang.Boolean)__typeMapper.readObject(__in, HasResponded__typeInfo, java.lang.Boolean.class));
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
    if (__typeMapper.isElement(__in, LastName__typeInfo)) {
      setLastName((java.lang.String)__typeMapper.readString(__in, LastName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Lead__typeInfo)) {
      setLead((com.sforce.soap.enterprise.sobject.Lead)__typeMapper.readObject(__in, Lead__typeInfo, com.sforce.soap.enterprise.sobject.Lead.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LeadId__typeInfo)) {
      setLeadId((java.lang.String)__typeMapper.readString(__in, LeadId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LeadOrContactId__typeInfo)) {
      setLeadOrContactId((java.lang.String)__typeMapper.readString(__in, LeadOrContactId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LeadOrContactOwner__typeInfo)) {
      setLeadOrContactOwner((com.sforce.soap.enterprise.sobject.Name)__typeMapper.readObject(__in, LeadOrContactOwner__typeInfo, com.sforce.soap.enterprise.sobject.Name.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LeadOrContactOwnerId__typeInfo)) {
      setLeadOrContactOwnerId((java.lang.String)__typeMapper.readString(__in, LeadOrContactOwnerId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LeadSource__typeInfo)) {
      setLeadSource((java.lang.String)__typeMapper.readString(__in, LeadSource__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Phone__typeInfo)) {
      setPhone((java.lang.String)__typeMapper.readString(__in, Phone__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PostalCode__typeInfo)) {
      setPostalCode((java.lang.String)__typeMapper.readString(__in, PostalCode__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Salutation__typeInfo)) {
      setSalutation((java.lang.String)__typeMapper.readString(__in, Salutation__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, State__typeInfo)) {
      setState((java.lang.String)__typeMapper.readString(__in, State__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Status__typeInfo)) {
      setStatus((java.lang.String)__typeMapper.readString(__in, Status__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Street__typeInfo)) {
      setStreet((java.lang.String)__typeMapper.readString(__in, Street__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Title__typeInfo)) {
      setTitle((java.lang.String)__typeMapper.readString(__in, Title__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Type__typeInfo)) {
      setType((java.lang.String)__typeMapper.readString(__in, Type__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[CampaignMember ");
    sb.append(super.toString());
    sb.append(" Campaign=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Campaign)+"'\n");
    sb.append(" CampaignId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CampaignId)+"'\n");
    sb.append(" City=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(City)+"'\n");
    sb.append(" CompanyOrAccount=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CompanyOrAccount)+"'\n");
    sb.append(" Contact=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Contact)+"'\n");
    sb.append(" ContactId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContactId)+"'\n");
    sb.append(" Country=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Country)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" Description=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Description)+"'\n");
    sb.append(" DoNotCall=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DoNotCall)+"'\n");
    sb.append(" Email=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Email)+"'\n");
    sb.append(" Fax=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Fax)+"'\n");
    sb.append(" FirstName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FirstName)+"'\n");
    sb.append(" FirstRespondedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FirstRespondedDate)+"'\n");
    sb.append(" HasOptedOutOfEmail=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(HasOptedOutOfEmail)+"'\n");
    sb.append(" HasOptedOutOfFax=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(HasOptedOutOfFax)+"'\n");
    sb.append(" HasResponded=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(HasResponded)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" LastName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastName)+"'\n");
    sb.append(" Lead=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Lead)+"'\n");
    sb.append(" LeadId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LeadId)+"'\n");
    sb.append(" LeadOrContactId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LeadOrContactId)+"'\n");
    sb.append(" LeadOrContactOwner=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LeadOrContactOwner)+"'\n");
    sb.append(" LeadOrContactOwnerId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LeadOrContactOwnerId)+"'\n");
    sb.append(" LeadSource=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LeadSource)+"'\n");
    sb.append(" MobilePhone=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MobilePhone)+"'\n");
    sb.append(" Name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");
    sb.append(" Phone=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Phone)+"'\n");
    sb.append(" PostalCode=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PostalCode)+"'\n");
    sb.append(" Salutation=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Salutation)+"'\n");
    sb.append(" State=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(State)+"'\n");
    sb.append(" Status=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Status)+"'\n");
    sb.append(" Street=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Street)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" Title=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Title)+"'\n");
    sb.append(" Type=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Type)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}