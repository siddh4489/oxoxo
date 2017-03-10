package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class TenantUsageEntitlement extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public TenantUsageEntitlement() {
  }
    
  
  /**
   * element  : AmountUsed of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo AmountUsed__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AmountUsed","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean AmountUsed__is_set = false;

  private java.lang.Double AmountUsed;

  public java.lang.Double getAmountUsed() {
    return AmountUsed;
  }

  

  public void setAmountUsed(java.lang.Double AmountUsed) {
    this.AmountUsed = AmountUsed;
    AmountUsed__is_set = true;
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
   * element  : CurrentAmountAllowed of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo CurrentAmountAllowed__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CurrentAmountAllowed","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean CurrentAmountAllowed__is_set = false;

  private java.lang.Double CurrentAmountAllowed;

  public java.lang.Double getCurrentAmountAllowed() {
    return CurrentAmountAllowed;
  }

  

  public void setCurrentAmountAllowed(java.lang.Double CurrentAmountAllowed) {
    this.CurrentAmountAllowed = CurrentAmountAllowed;
    CurrentAmountAllowed__is_set = true;
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
   * element  : Frequency of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Frequency__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Frequency","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Frequency__is_set = false;

  private java.lang.String Frequency;

  public java.lang.String getFrequency() {
    return Frequency;
  }

  

  public void setFrequency(java.lang.String Frequency) {
    this.Frequency = Frequency;
    Frequency__is_set = true;
  }
  
  /**
   * element  : HasRollover of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo HasRollover__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","HasRollover","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean HasRollover__is_set = false;

  private java.lang.Boolean HasRollover;

  public java.lang.Boolean getHasRollover() {
    return HasRollover;
  }

  

  public void setHasRollover(java.lang.Boolean HasRollover) {
    this.HasRollover = HasRollover;
    HasRollover__is_set = true;
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
   * element  : IsPersistentResource of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsPersistentResource__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsPersistentResource","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsPersistentResource__is_set = false;

  private java.lang.Boolean IsPersistentResource;

  public java.lang.Boolean getIsPersistentResource() {
    return IsPersistentResource;
  }

  

  public void setIsPersistentResource(java.lang.Boolean IsPersistentResource) {
    this.IsPersistentResource = IsPersistentResource;
    IsPersistentResource__is_set = true;
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
   * element  : MasterLabel of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo MasterLabel__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MasterLabel","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean MasterLabel__is_set = false;

  private java.lang.String MasterLabel;

  public java.lang.String getMasterLabel() {
    return MasterLabel;
  }

  

  public void setMasterLabel(java.lang.String MasterLabel) {
    this.MasterLabel = MasterLabel;
    MasterLabel__is_set = true;
  }
  
  /**
   * element  : OverageGrace of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo OverageGrace__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OverageGrace","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean OverageGrace__is_set = false;

  private java.lang.Double OverageGrace;

  public java.lang.Double getOverageGrace() {
    return OverageGrace;
  }

  

  public void setOverageGrace(java.lang.Double OverageGrace) {
    this.OverageGrace = OverageGrace;
    OverageGrace__is_set = true;
  }
  
  /**
   * element  : ResourceGroupKey of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ResourceGroupKey__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ResourceGroupKey","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ResourceGroupKey__is_set = false;

  private java.lang.String ResourceGroupKey;

  public java.lang.String getResourceGroupKey() {
    return ResourceGroupKey;
  }

  

  public void setResourceGroupKey(java.lang.String ResourceGroupKey) {
    this.ResourceGroupKey = ResourceGroupKey;
    ResourceGroupKey__is_set = true;
  }
  
  /**
   * element  : Setting of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Setting__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Setting","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Setting__is_set = false;

  private java.lang.String Setting;

  public java.lang.String getSetting() {
    return Setting;
  }

  

  public void setSetting(java.lang.String Setting) {
    this.Setting = Setting;
    Setting__is_set = true;
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
   * element  : UsageDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo UsageDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UsageDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean UsageDate__is_set = false;

  private java.util.Calendar UsageDate;

  public java.util.Calendar getUsageDate() {
    return UsageDate;
  }

  

  public void setUsageDate(java.util.Calendar UsageDate) {
    this.UsageDate = UsageDate;
    UsageDate__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "TenantUsageEntitlement");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, AmountUsed__typeInfo, AmountUsed, AmountUsed__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeObject(__out, CurrentAmountAllowed__typeInfo, CurrentAmountAllowed, CurrentAmountAllowed__is_set);
    __typeMapper.writeObject(__out, EndDate__typeInfo, EndDate, EndDate__is_set);
    __typeMapper.writeString(__out, Frequency__typeInfo, Frequency, Frequency__is_set);
    __typeMapper.writeObject(__out, HasRollover__typeInfo, HasRollover, HasRollover__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, IsPersistentResource__typeInfo, IsPersistentResource, IsPersistentResource__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeString(__out, MasterLabel__typeInfo, MasterLabel, MasterLabel__is_set);
    __typeMapper.writeObject(__out, OverageGrace__typeInfo, OverageGrace, OverageGrace__is_set);
    __typeMapper.writeString(__out, ResourceGroupKey__typeInfo, ResourceGroupKey, ResourceGroupKey__is_set);
    __typeMapper.writeString(__out, Setting__typeInfo, Setting, Setting__is_set);
    __typeMapper.writeObject(__out, StartDate__typeInfo, StartDate, StartDate__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeObject(__out, UsageDate__typeInfo, UsageDate, UsageDate__is_set);
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
    if (__typeMapper.isElement(__in, AmountUsed__typeInfo)) {
      setAmountUsed((java.lang.Double)__typeMapper.readObject(__in, AmountUsed__typeInfo, java.lang.Double.class));
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
    if (__typeMapper.isElement(__in, CurrentAmountAllowed__typeInfo)) {
      setCurrentAmountAllowed((java.lang.Double)__typeMapper.readObject(__in, CurrentAmountAllowed__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, EndDate__typeInfo)) {
      setEndDate((java.util.Calendar)__typeMapper.readObject(__in, EndDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Frequency__typeInfo)) {
      setFrequency((java.lang.String)__typeMapper.readString(__in, Frequency__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, HasRollover__typeInfo)) {
      setHasRollover((java.lang.Boolean)__typeMapper.readObject(__in, HasRollover__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {
      setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, IsDeleted__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsPersistentResource__typeInfo)) {
      setIsPersistentResource((java.lang.Boolean)__typeMapper.readObject(__in, IsPersistentResource__typeInfo, java.lang.Boolean.class));
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
    if (__typeMapper.isElement(__in, MasterLabel__typeInfo)) {
      setMasterLabel((java.lang.String)__typeMapper.readString(__in, MasterLabel__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OverageGrace__typeInfo)) {
      setOverageGrace((java.lang.Double)__typeMapper.readObject(__in, OverageGrace__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ResourceGroupKey__typeInfo)) {
      setResourceGroupKey((java.lang.String)__typeMapper.readString(__in, ResourceGroupKey__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Setting__typeInfo)) {
      setSetting((java.lang.String)__typeMapper.readString(__in, Setting__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, StartDate__typeInfo)) {
      setStartDate((java.util.Calendar)__typeMapper.readObject(__in, StartDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UsageDate__typeInfo)) {
      setUsageDate((java.util.Calendar)__typeMapper.readObject(__in, UsageDate__typeInfo, java.util.Calendar.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[TenantUsageEntitlement ");
    sb.append(super.toString());
    sb.append(" AmountUsed=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AmountUsed)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" CurrentAmountAllowed=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CurrentAmountAllowed)+"'\n");
    sb.append(" EndDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EndDate)+"'\n");
    sb.append(" Frequency=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Frequency)+"'\n");
    sb.append(" HasRollover=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(HasRollover)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" IsPersistentResource=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsPersistentResource)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" MasterLabel=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MasterLabel)+"'\n");
    sb.append(" OverageGrace=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OverageGrace)+"'\n");
    sb.append(" ResourceGroupKey=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ResourceGroupKey)+"'\n");
    sb.append(" Setting=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Setting)+"'\n");
    sb.append(" StartDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(StartDate)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" UsageDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UsageDate)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}