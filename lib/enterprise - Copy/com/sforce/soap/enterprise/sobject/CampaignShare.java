package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class CampaignShare extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public CampaignShare() {
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
   * element  : CampaignAccessLevel of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CampaignAccessLevel__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CampaignAccessLevel","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean CampaignAccessLevel__is_set = false;

  private java.lang.String CampaignAccessLevel;

  public java.lang.String getCampaignAccessLevel() {
    return CampaignAccessLevel;
  }

  

  public void setCampaignAccessLevel(java.lang.String CampaignAccessLevel) {
    this.CampaignAccessLevel = CampaignAccessLevel;
    CampaignAccessLevel__is_set = true;
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
   * element  : RowCause of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo RowCause__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RowCause","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean RowCause__is_set = false;

  private java.lang.String RowCause;

  public java.lang.String getRowCause() {
    return RowCause;
  }

  

  public void setRowCause(java.lang.String RowCause) {
    this.RowCause = RowCause;
    RowCause__is_set = true;
  }
  
  /**
   * element  : UserOrGroup of type {urn:sobject.enterprise.soap.sforce.com}Name
   * java type: com.sforce.soap.enterprise.sobject.Name
   */
  private static final com.sforce.ws.bind.TypeInfo UserOrGroup__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserOrGroup","urn:sobject.enterprise.soap.sforce.com","Name",0,1,true);

  private boolean UserOrGroup__is_set = false;

  private com.sforce.soap.enterprise.sobject.Name UserOrGroup;

  public com.sforce.soap.enterprise.sobject.Name getUserOrGroup() {
    return UserOrGroup;
  }

  

  public void setUserOrGroup(com.sforce.soap.enterprise.sobject.Name UserOrGroup) {
    this.UserOrGroup = UserOrGroup;
    UserOrGroup__is_set = true;
  }
  
  /**
   * element  : UserOrGroupId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo UserOrGroupId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserOrGroupId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean UserOrGroupId__is_set = false;

  private java.lang.String UserOrGroupId;

  public java.lang.String getUserOrGroupId() {
    return UserOrGroupId;
  }

  

  public void setUserOrGroupId(java.lang.String UserOrGroupId) {
    this.UserOrGroupId = UserOrGroupId;
    UserOrGroupId__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "CampaignShare");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, Campaign__typeInfo, Campaign, Campaign__is_set);
    __typeMapper.writeString(__out, CampaignAccessLevel__typeInfo, CampaignAccessLevel, CampaignAccessLevel__is_set);
    __typeMapper.writeString(__out, CampaignId__typeInfo, CampaignId, CampaignId__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeString(__out, RowCause__typeInfo, RowCause, RowCause__is_set);
    __typeMapper.writeObject(__out, UserOrGroup__typeInfo, UserOrGroup, UserOrGroup__is_set);
    __typeMapper.writeString(__out, UserOrGroupId__typeInfo, UserOrGroupId, UserOrGroupId__is_set);
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
    if (__typeMapper.isElement(__in, CampaignAccessLevel__typeInfo)) {
      setCampaignAccessLevel((java.lang.String)__typeMapper.readString(__in, CampaignAccessLevel__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CampaignId__typeInfo)) {
      setCampaignId((java.lang.String)__typeMapper.readString(__in, CampaignId__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, RowCause__typeInfo)) {
      setRowCause((java.lang.String)__typeMapper.readString(__in, RowCause__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserOrGroup__typeInfo)) {
      setUserOrGroup((com.sforce.soap.enterprise.sobject.Name)__typeMapper.readObject(__in, UserOrGroup__typeInfo, com.sforce.soap.enterprise.sobject.Name.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserOrGroupId__typeInfo)) {
      setUserOrGroupId((java.lang.String)__typeMapper.readString(__in, UserOrGroupId__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[CampaignShare ");
    sb.append(super.toString());
    sb.append(" Campaign=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Campaign)+"'\n");
    sb.append(" CampaignAccessLevel=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CampaignAccessLevel)+"'\n");
    sb.append(" CampaignId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CampaignId)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" RowCause=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RowCause)+"'\n");
    sb.append(" UserOrGroup=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserOrGroup)+"'\n");
    sb.append(" UserOrGroupId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserOrGroupId)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}