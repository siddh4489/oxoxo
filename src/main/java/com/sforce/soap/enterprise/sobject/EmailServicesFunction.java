package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class EmailServicesFunction extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public EmailServicesFunction() {
  }
    
  
  /**
   * element  : AddressInactiveAction of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AddressInactiveAction__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AddressInactiveAction","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean AddressInactiveAction__is_set = false;

  private java.lang.String AddressInactiveAction;

  public java.lang.String getAddressInactiveAction() {
    return AddressInactiveAction;
  }

  

  public void setAddressInactiveAction(java.lang.String AddressInactiveAction) {
    this.AddressInactiveAction = AddressInactiveAction;
    AddressInactiveAction__is_set = true;
  }
  
  /**
   * element  : Addresses of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Addresses__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Addresses","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Addresses__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Addresses;

  public com.sforce.soap.enterprise.QueryResult getAddresses() {
    return Addresses;
  }

  

  public void setAddresses(com.sforce.soap.enterprise.QueryResult Addresses) {
    this.Addresses = Addresses;
    Addresses__is_set = true;
  }
  
  /**
   * element  : ApexClassId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ApexClassId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ApexClassId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ApexClassId__is_set = false;

  private java.lang.String ApexClassId;

  public java.lang.String getApexClassId() {
    return ApexClassId;
  }

  

  public void setApexClassId(java.lang.String ApexClassId) {
    this.ApexClassId = ApexClassId;
    ApexClassId__is_set = true;
  }
  
  /**
   * element  : AttachmentOption of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AttachmentOption__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AttachmentOption","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean AttachmentOption__is_set = false;

  private java.lang.String AttachmentOption;

  public java.lang.String getAttachmentOption() {
    return AttachmentOption;
  }

  

  public void setAttachmentOption(java.lang.String AttachmentOption) {
    this.AttachmentOption = AttachmentOption;
    AttachmentOption__is_set = true;
  }
  
  /**
   * element  : AuthenticationFailureAction of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AuthenticationFailureAction__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AuthenticationFailureAction","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean AuthenticationFailureAction__is_set = false;

  private java.lang.String AuthenticationFailureAction;

  public java.lang.String getAuthenticationFailureAction() {
    return AuthenticationFailureAction;
  }

  

  public void setAuthenticationFailureAction(java.lang.String AuthenticationFailureAction) {
    this.AuthenticationFailureAction = AuthenticationFailureAction;
    AuthenticationFailureAction__is_set = true;
  }
  
  /**
   * element  : AuthorizationFailureAction of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AuthorizationFailureAction__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AuthorizationFailureAction","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean AuthorizationFailureAction__is_set = false;

  private java.lang.String AuthorizationFailureAction;

  public java.lang.String getAuthorizationFailureAction() {
    return AuthorizationFailureAction;
  }

  

  public void setAuthorizationFailureAction(java.lang.String AuthorizationFailureAction) {
    this.AuthorizationFailureAction = AuthorizationFailureAction;
    AuthorizationFailureAction__is_set = true;
  }
  
  /**
   * element  : AuthorizedSenders of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AuthorizedSenders__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AuthorizedSenders","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean AuthorizedSenders__is_set = false;

  private java.lang.String AuthorizedSenders;

  public java.lang.String getAuthorizedSenders() {
    return AuthorizedSenders;
  }

  

  public void setAuthorizedSenders(java.lang.String AuthorizedSenders) {
    this.AuthorizedSenders = AuthorizedSenders;
    AuthorizedSenders__is_set = true;
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
   * element  : ErrorRoutingAddress of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ErrorRoutingAddress__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ErrorRoutingAddress","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ErrorRoutingAddress__is_set = false;

  private java.lang.String ErrorRoutingAddress;

  public java.lang.String getErrorRoutingAddress() {
    return ErrorRoutingAddress;
  }

  

  public void setErrorRoutingAddress(java.lang.String ErrorRoutingAddress) {
    this.ErrorRoutingAddress = ErrorRoutingAddress;
    ErrorRoutingAddress__is_set = true;
  }
  
  /**
   * element  : FunctionInactiveAction of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo FunctionInactiveAction__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FunctionInactiveAction","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean FunctionInactiveAction__is_set = false;

  private java.lang.String FunctionInactiveAction;

  public java.lang.String getFunctionInactiveAction() {
    return FunctionInactiveAction;
  }

  

  public void setFunctionInactiveAction(java.lang.String FunctionInactiveAction) {
    this.FunctionInactiveAction = FunctionInactiveAction;
    FunctionInactiveAction__is_set = true;
  }
  
  /**
   * element  : FunctionName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo FunctionName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FunctionName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean FunctionName__is_set = false;

  private java.lang.String FunctionName;

  public java.lang.String getFunctionName() {
    return FunctionName;
  }

  

  public void setFunctionName(java.lang.String FunctionName) {
    this.FunctionName = FunctionName;
    FunctionName__is_set = true;
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
   * element  : IsAuthenticationRequired of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsAuthenticationRequired__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsAuthenticationRequired","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsAuthenticationRequired__is_set = false;

  private java.lang.Boolean IsAuthenticationRequired;

  public java.lang.Boolean getIsAuthenticationRequired() {
    return IsAuthenticationRequired;
  }

  

  public void setIsAuthenticationRequired(java.lang.Boolean IsAuthenticationRequired) {
    this.IsAuthenticationRequired = IsAuthenticationRequired;
    IsAuthenticationRequired__is_set = true;
  }
  
  /**
   * element  : IsErrorRoutingEnabled of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsErrorRoutingEnabled__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsErrorRoutingEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsErrorRoutingEnabled__is_set = false;

  private java.lang.Boolean IsErrorRoutingEnabled;

  public java.lang.Boolean getIsErrorRoutingEnabled() {
    return IsErrorRoutingEnabled;
  }

  

  public void setIsErrorRoutingEnabled(java.lang.Boolean IsErrorRoutingEnabled) {
    this.IsErrorRoutingEnabled = IsErrorRoutingEnabled;
    IsErrorRoutingEnabled__is_set = true;
  }
  
  /**
   * element  : IsTextAttachmentsAsBinary of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsTextAttachmentsAsBinary__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsTextAttachmentsAsBinary","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsTextAttachmentsAsBinary__is_set = false;

  private java.lang.Boolean IsTextAttachmentsAsBinary;

  public java.lang.Boolean getIsTextAttachmentsAsBinary() {
    return IsTextAttachmentsAsBinary;
  }

  

  public void setIsTextAttachmentsAsBinary(java.lang.Boolean IsTextAttachmentsAsBinary) {
    this.IsTextAttachmentsAsBinary = IsTextAttachmentsAsBinary;
    IsTextAttachmentsAsBinary__is_set = true;
  }
  
  /**
   * element  : IsTlsRequired of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsTlsRequired__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsTlsRequired","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsTlsRequired__is_set = false;

  private java.lang.Boolean IsTlsRequired;

  public java.lang.Boolean getIsTlsRequired() {
    return IsTlsRequired;
  }

  

  public void setIsTlsRequired(java.lang.Boolean IsTlsRequired) {
    this.IsTlsRequired = IsTlsRequired;
    IsTlsRequired__is_set = true;
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
   * element  : OverLimitAction of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo OverLimitAction__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OverLimitAction","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean OverLimitAction__is_set = false;

  private java.lang.String OverLimitAction;

  public java.lang.String getOverLimitAction() {
    return OverLimitAction;
  }

  

  public void setOverLimitAction(java.lang.String OverLimitAction) {
    this.OverLimitAction = OverLimitAction;
    OverLimitAction__is_set = true;
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
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "EmailServicesFunction");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, AddressInactiveAction__typeInfo, AddressInactiveAction, AddressInactiveAction__is_set);
    __typeMapper.writeObject(__out, Addresses__typeInfo, Addresses, Addresses__is_set);
    __typeMapper.writeString(__out, ApexClassId__typeInfo, ApexClassId, ApexClassId__is_set);
    __typeMapper.writeString(__out, AttachmentOption__typeInfo, AttachmentOption, AttachmentOption__is_set);
    __typeMapper.writeString(__out, AuthenticationFailureAction__typeInfo, AuthenticationFailureAction, AuthenticationFailureAction__is_set);
    __typeMapper.writeString(__out, AuthorizationFailureAction__typeInfo, AuthorizationFailureAction, AuthorizationFailureAction__is_set);
    __typeMapper.writeString(__out, AuthorizedSenders__typeInfo, AuthorizedSenders, AuthorizedSenders__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, ErrorRoutingAddress__typeInfo, ErrorRoutingAddress, ErrorRoutingAddress__is_set);
    __typeMapper.writeString(__out, FunctionInactiveAction__typeInfo, FunctionInactiveAction, FunctionInactiveAction__is_set);
    __typeMapper.writeString(__out, FunctionName__typeInfo, FunctionName, FunctionName__is_set);
    __typeMapper.writeObject(__out, IsActive__typeInfo, IsActive, IsActive__is_set);
    __typeMapper.writeObject(__out, IsAuthenticationRequired__typeInfo, IsAuthenticationRequired, IsAuthenticationRequired__is_set);
    __typeMapper.writeObject(__out, IsErrorRoutingEnabled__typeInfo, IsErrorRoutingEnabled, IsErrorRoutingEnabled__is_set);
    __typeMapper.writeObject(__out, IsTextAttachmentsAsBinary__typeInfo, IsTextAttachmentsAsBinary, IsTextAttachmentsAsBinary__is_set);
    __typeMapper.writeObject(__out, IsTlsRequired__typeInfo, IsTlsRequired, IsTlsRequired__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeString(__out, OverLimitAction__typeInfo, OverLimitAction, OverLimitAction__is_set);
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
    if (__typeMapper.isElement(__in, AddressInactiveAction__typeInfo)) {
      setAddressInactiveAction((java.lang.String)__typeMapper.readString(__in, AddressInactiveAction__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Addresses__typeInfo)) {
      setAddresses((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Addresses__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ApexClassId__typeInfo)) {
      setApexClassId((java.lang.String)__typeMapper.readString(__in, ApexClassId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AttachmentOption__typeInfo)) {
      setAttachmentOption((java.lang.String)__typeMapper.readString(__in, AttachmentOption__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AuthenticationFailureAction__typeInfo)) {
      setAuthenticationFailureAction((java.lang.String)__typeMapper.readString(__in, AuthenticationFailureAction__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AuthorizationFailureAction__typeInfo)) {
      setAuthorizationFailureAction((java.lang.String)__typeMapper.readString(__in, AuthorizationFailureAction__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AuthorizedSenders__typeInfo)) {
      setAuthorizedSenders((java.lang.String)__typeMapper.readString(__in, AuthorizedSenders__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, ErrorRoutingAddress__typeInfo)) {
      setErrorRoutingAddress((java.lang.String)__typeMapper.readString(__in, ErrorRoutingAddress__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FunctionInactiveAction__typeInfo)) {
      setFunctionInactiveAction((java.lang.String)__typeMapper.readString(__in, FunctionInactiveAction__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FunctionName__typeInfo)) {
      setFunctionName((java.lang.String)__typeMapper.readString(__in, FunctionName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsActive__typeInfo)) {
      setIsActive((java.lang.Boolean)__typeMapper.readObject(__in, IsActive__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsAuthenticationRequired__typeInfo)) {
      setIsAuthenticationRequired((java.lang.Boolean)__typeMapper.readObject(__in, IsAuthenticationRequired__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsErrorRoutingEnabled__typeInfo)) {
      setIsErrorRoutingEnabled((java.lang.Boolean)__typeMapper.readObject(__in, IsErrorRoutingEnabled__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsTextAttachmentsAsBinary__typeInfo)) {
      setIsTextAttachmentsAsBinary((java.lang.Boolean)__typeMapper.readObject(__in, IsTextAttachmentsAsBinary__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsTlsRequired__typeInfo)) {
      setIsTlsRequired((java.lang.Boolean)__typeMapper.readObject(__in, IsTlsRequired__typeInfo, java.lang.Boolean.class));
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
    if (__typeMapper.isElement(__in, OverLimitAction__typeInfo)) {
      setOverLimitAction((java.lang.String)__typeMapper.readString(__in, OverLimitAction__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[EmailServicesFunction ");
    sb.append(super.toString());
    sb.append(" AddressInactiveAction=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AddressInactiveAction)+"'\n");
    sb.append(" Addresses=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Addresses)+"'\n");
    sb.append(" ApexClassId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ApexClassId)+"'\n");
    sb.append(" AttachmentOption=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachmentOption)+"'\n");
    sb.append(" AuthenticationFailureAction=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AuthenticationFailureAction)+"'\n");
    sb.append(" AuthorizationFailureAction=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AuthorizationFailureAction)+"'\n");
    sb.append(" AuthorizedSenders=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AuthorizedSenders)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" ErrorRoutingAddress=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ErrorRoutingAddress)+"'\n");
    sb.append(" FunctionInactiveAction=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FunctionInactiveAction)+"'\n");
    sb.append(" FunctionName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FunctionName)+"'\n");
    sb.append(" IsActive=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsActive)+"'\n");
    sb.append(" IsAuthenticationRequired=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsAuthenticationRequired)+"'\n");
    sb.append(" IsErrorRoutingEnabled=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsErrorRoutingEnabled)+"'\n");
    sb.append(" IsTextAttachmentsAsBinary=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsTextAttachmentsAsBinary)+"'\n");
    sb.append(" IsTlsRequired=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsTlsRequired)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" OverLimitAction=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OverLimitAction)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}