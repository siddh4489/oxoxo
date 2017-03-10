package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class ActionLinkTemplate extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public ActionLinkTemplate() {
  }
    
  
  /**
   * element  : ActionLinkGroupTemplate of type {urn:sobject.enterprise.soap.sforce.com}ActionLinkGroupTemplate
   * java type: com.sforce.soap.enterprise.sobject.ActionLinkGroupTemplate
   */
  private static final com.sforce.ws.bind.TypeInfo ActionLinkGroupTemplate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ActionLinkGroupTemplate","urn:sobject.enterprise.soap.sforce.com","ActionLinkGroupTemplate",0,1,true);

  private boolean ActionLinkGroupTemplate__is_set = false;

  private com.sforce.soap.enterprise.sobject.ActionLinkGroupTemplate ActionLinkGroupTemplate;

  public com.sforce.soap.enterprise.sobject.ActionLinkGroupTemplate getActionLinkGroupTemplate() {
    return ActionLinkGroupTemplate;
  }

  

  public void setActionLinkGroupTemplate(com.sforce.soap.enterprise.sobject.ActionLinkGroupTemplate ActionLinkGroupTemplate) {
    this.ActionLinkGroupTemplate = ActionLinkGroupTemplate;
    ActionLinkGroupTemplate__is_set = true;
  }
  
  /**
   * element  : ActionLinkGroupTemplateId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ActionLinkGroupTemplateId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ActionLinkGroupTemplateId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ActionLinkGroupTemplateId__is_set = false;

  private java.lang.String ActionLinkGroupTemplateId;

  public java.lang.String getActionLinkGroupTemplateId() {
    return ActionLinkGroupTemplateId;
  }

  

  public void setActionLinkGroupTemplateId(java.lang.String ActionLinkGroupTemplateId) {
    this.ActionLinkGroupTemplateId = ActionLinkGroupTemplateId;
    ActionLinkGroupTemplateId__is_set = true;
  }
  
  /**
   * element  : ActionUrl of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ActionUrl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ActionUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ActionUrl__is_set = false;

  private java.lang.String ActionUrl;

  public java.lang.String getActionUrl() {
    return ActionUrl;
  }

  

  public void setActionUrl(java.lang.String ActionUrl) {
    this.ActionUrl = ActionUrl;
    ActionUrl__is_set = true;
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
   * element  : IsConfirmationRequired of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsConfirmationRequired__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsConfirmationRequired","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsConfirmationRequired__is_set = false;

  private java.lang.Boolean IsConfirmationRequired;

  public java.lang.Boolean getIsConfirmationRequired() {
    return IsConfirmationRequired;
  }

  

  public void setIsConfirmationRequired(java.lang.Boolean IsConfirmationRequired) {
    this.IsConfirmationRequired = IsConfirmationRequired;
    IsConfirmationRequired__is_set = true;
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
   * element  : IsGroupDefault of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsGroupDefault__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsGroupDefault","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsGroupDefault__is_set = false;

  private java.lang.Boolean IsGroupDefault;

  public java.lang.Boolean getIsGroupDefault() {
    return IsGroupDefault;
  }

  

  public void setIsGroupDefault(java.lang.Boolean IsGroupDefault) {
    this.IsGroupDefault = IsGroupDefault;
    IsGroupDefault__is_set = true;
  }
  
  /**
   * element  : Label of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Label__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Label","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Label__is_set = false;

  private java.lang.String Label;

  public java.lang.String getLabel() {
    return Label;
  }

  

  public void setLabel(java.lang.String Label) {
    this.Label = Label;
    Label__is_set = true;
  }
  
  /**
   * element  : LabelKey of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LabelKey__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LabelKey","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean LabelKey__is_set = false;

  private java.lang.String LabelKey;

  public java.lang.String getLabelKey() {
    return LabelKey;
  }

  

  public void setLabelKey(java.lang.String LabelKey) {
    this.LabelKey = LabelKey;
    LabelKey__is_set = true;
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
   * element  : LinkType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LinkType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LinkType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean LinkType__is_set = false;

  private java.lang.String LinkType;

  public java.lang.String getLinkType() {
    return LinkType;
  }

  

  public void setLinkType(java.lang.String LinkType) {
    this.LinkType = LinkType;
    LinkType__is_set = true;
  }
  
  /**
   * element  : Method of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Method__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Method","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Method__is_set = false;

  private java.lang.String Method;

  public java.lang.String getMethod() {
    return Method;
  }

  

  public void setMethod(java.lang.String Method) {
    this.Method = Method;
    Method__is_set = true;
  }
  
  /**
   * element  : Position of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo Position__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Position","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean Position__is_set = false;

  private java.lang.Integer Position;

  public java.lang.Integer getPosition() {
    return Position;
  }

  

  public void setPosition(java.lang.Integer Position) {
    this.Position = Position;
    Position__is_set = true;
  }
  
  /**
   * element  : RequestBody of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo RequestBody__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RequestBody","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean RequestBody__is_set = false;

  private java.lang.String RequestBody;

  public java.lang.String getRequestBody() {
    return RequestBody;
  }

  

  public void setRequestBody(java.lang.String RequestBody) {
    this.RequestBody = RequestBody;
    RequestBody__is_set = true;
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
   * element  : UserAlias of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo UserAlias__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserAlias","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean UserAlias__is_set = false;

  private java.lang.String UserAlias;

  public java.lang.String getUserAlias() {
    return UserAlias;
  }

  

  public void setUserAlias(java.lang.String UserAlias) {
    this.UserAlias = UserAlias;
    UserAlias__is_set = true;
  }
  
  /**
   * element  : UserVisibility of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo UserVisibility__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserVisibility","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean UserVisibility__is_set = false;

  private java.lang.String UserVisibility;

  public java.lang.String getUserVisibility() {
    return UserVisibility;
  }

  

  public void setUserVisibility(java.lang.String UserVisibility) {
    this.UserVisibility = UserVisibility;
    UserVisibility__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "ActionLinkTemplate");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, ActionLinkGroupTemplate__typeInfo, ActionLinkGroupTemplate, ActionLinkGroupTemplate__is_set);
    __typeMapper.writeString(__out, ActionLinkGroupTemplateId__typeInfo, ActionLinkGroupTemplateId, ActionLinkGroupTemplateId__is_set);
    __typeMapper.writeString(__out, ActionUrl__typeInfo, ActionUrl, ActionUrl__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, Headers__typeInfo, Headers, Headers__is_set);
    __typeMapper.writeObject(__out, IsConfirmationRequired__typeInfo, IsConfirmationRequired, IsConfirmationRequired__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, IsGroupDefault__typeInfo, IsGroupDefault, IsGroupDefault__is_set);
    __typeMapper.writeString(__out, Label__typeInfo, Label, Label__is_set);
    __typeMapper.writeString(__out, LabelKey__typeInfo, LabelKey, LabelKey__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeString(__out, LinkType__typeInfo, LinkType, LinkType__is_set);
    __typeMapper.writeString(__out, Method__typeInfo, Method, Method__is_set);
    __typeMapper.writeObject(__out, Position__typeInfo, Position, Position__is_set);
    __typeMapper.writeString(__out, RequestBody__typeInfo, RequestBody, RequestBody__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeString(__out, UserAlias__typeInfo, UserAlias, UserAlias__is_set);
    __typeMapper.writeString(__out, UserVisibility__typeInfo, UserVisibility, UserVisibility__is_set);
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
    if (__typeMapper.isElement(__in, ActionLinkGroupTemplate__typeInfo)) {
      setActionLinkGroupTemplate((com.sforce.soap.enterprise.sobject.ActionLinkGroupTemplate)__typeMapper.readObject(__in, ActionLinkGroupTemplate__typeInfo, com.sforce.soap.enterprise.sobject.ActionLinkGroupTemplate.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ActionLinkGroupTemplateId__typeInfo)) {
      setActionLinkGroupTemplateId((java.lang.String)__typeMapper.readString(__in, ActionLinkGroupTemplateId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ActionUrl__typeInfo)) {
      setActionUrl((java.lang.String)__typeMapper.readString(__in, ActionUrl__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Headers__typeInfo)) {
      setHeaders((java.lang.String)__typeMapper.readString(__in, Headers__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsConfirmationRequired__typeInfo)) {
      setIsConfirmationRequired((java.lang.Boolean)__typeMapper.readObject(__in, IsConfirmationRequired__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {
      setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, IsDeleted__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsGroupDefault__typeInfo)) {
      setIsGroupDefault((java.lang.Boolean)__typeMapper.readObject(__in, IsGroupDefault__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Label__typeInfo)) {
      setLabel((java.lang.String)__typeMapper.readString(__in, Label__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LabelKey__typeInfo)) {
      setLabelKey((java.lang.String)__typeMapper.readString(__in, LabelKey__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, LinkType__typeInfo)) {
      setLinkType((java.lang.String)__typeMapper.readString(__in, LinkType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Method__typeInfo)) {
      setMethod((java.lang.String)__typeMapper.readString(__in, Method__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Position__typeInfo)) {
      setPosition((java.lang.Integer)__typeMapper.readObject(__in, Position__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RequestBody__typeInfo)) {
      setRequestBody((java.lang.String)__typeMapper.readString(__in, RequestBody__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserAlias__typeInfo)) {
      setUserAlias((java.lang.String)__typeMapper.readString(__in, UserAlias__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserVisibility__typeInfo)) {
      setUserVisibility((java.lang.String)__typeMapper.readString(__in, UserVisibility__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[ActionLinkTemplate ");
    sb.append(super.toString());
    sb.append(" ActionLinkGroupTemplate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ActionLinkGroupTemplate)+"'\n");
    sb.append(" ActionLinkGroupTemplateId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ActionLinkGroupTemplateId)+"'\n");
    sb.append(" ActionUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ActionUrl)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" Headers=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Headers)+"'\n");
    sb.append(" IsConfirmationRequired=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsConfirmationRequired)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" IsGroupDefault=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsGroupDefault)+"'\n");
    sb.append(" Label=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Label)+"'\n");
    sb.append(" LabelKey=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LabelKey)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" LinkType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LinkType)+"'\n");
    sb.append(" Method=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Method)+"'\n");
    sb.append(" Position=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Position)+"'\n");
    sb.append(" RequestBody=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RequestBody)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" UserAlias=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserAlias)+"'\n");
    sb.append(" UserVisibility=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserVisibility)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}