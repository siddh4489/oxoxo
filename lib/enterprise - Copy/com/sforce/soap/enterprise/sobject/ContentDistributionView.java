package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class ContentDistributionView extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public ContentDistributionView() {
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
   * element  : Distribution of type {urn:sobject.enterprise.soap.sforce.com}ContentDistribution
   * java type: com.sforce.soap.enterprise.sobject.ContentDistribution
   */
  private static final com.sforce.ws.bind.TypeInfo Distribution__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Distribution","urn:sobject.enterprise.soap.sforce.com","ContentDistribution",0,1,true);

  private boolean Distribution__is_set = false;

  private com.sforce.soap.enterprise.sobject.ContentDistribution Distribution;

  public com.sforce.soap.enterprise.sobject.ContentDistribution getDistribution() {
    return Distribution;
  }

  

  public void setDistribution(com.sforce.soap.enterprise.sobject.ContentDistribution Distribution) {
    this.Distribution = Distribution;
    Distribution__is_set = true;
  }
  
  /**
   * element  : DistributionId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo DistributionId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DistributionId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean DistributionId__is_set = false;

  private java.lang.String DistributionId;

  public java.lang.String getDistributionId() {
    return DistributionId;
  }

  

  public void setDistributionId(java.lang.String DistributionId) {
    this.DistributionId = DistributionId;
    DistributionId__is_set = true;
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
   * element  : IsDownload of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsDownload__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsDownload","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsDownload__is_set = false;

  private java.lang.Boolean IsDownload;

  public java.lang.Boolean getIsDownload() {
    return IsDownload;
  }

  

  public void setIsDownload(java.lang.Boolean IsDownload) {
    this.IsDownload = IsDownload;
    IsDownload__is_set = true;
  }
  
  /**
   * element  : IsInternal of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsInternal__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsInternal","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsInternal__is_set = false;

  private java.lang.Boolean IsInternal;

  public java.lang.Boolean getIsInternal() {
    return IsInternal;
  }

  

  public void setIsInternal(java.lang.Boolean IsInternal) {
    this.IsInternal = IsInternal;
    IsInternal__is_set = true;
  }
  
  /**
   * element  : ParentViewId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ParentViewId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ParentViewId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ParentViewId__is_set = false;

  private java.lang.String ParentViewId;

  public java.lang.String getParentViewId() {
    return ParentViewId;
  }

  

  public void setParentViewId(java.lang.String ParentViewId) {
    this.ParentViewId = ParentViewId;
    ParentViewId__is_set = true;
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
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "ContentDistributionView");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeObject(__out, Distribution__typeInfo, Distribution, Distribution__is_set);
    __typeMapper.writeString(__out, DistributionId__typeInfo, DistributionId, DistributionId__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, IsDownload__typeInfo, IsDownload, IsDownload__is_set);
    __typeMapper.writeObject(__out, IsInternal__typeInfo, IsInternal, IsInternal__is_set);
    __typeMapper.writeString(__out, ParentViewId__typeInfo, ParentViewId, ParentViewId__is_set);
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
    if (__typeMapper.isElement(__in, Distribution__typeInfo)) {
      setDistribution((com.sforce.soap.enterprise.sobject.ContentDistribution)__typeMapper.readObject(__in, Distribution__typeInfo, com.sforce.soap.enterprise.sobject.ContentDistribution.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DistributionId__typeInfo)) {
      setDistributionId((java.lang.String)__typeMapper.readString(__in, DistributionId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {
      setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, IsDeleted__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsDownload__typeInfo)) {
      setIsDownload((java.lang.Boolean)__typeMapper.readObject(__in, IsDownload__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsInternal__typeInfo)) {
      setIsInternal((java.lang.Boolean)__typeMapper.readObject(__in, IsInternal__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ParentViewId__typeInfo)) {
      setParentViewId((java.lang.String)__typeMapper.readString(__in, ParentViewId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[ContentDistributionView ");
    sb.append(super.toString());
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" Distribution=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Distribution)+"'\n");
    sb.append(" DistributionId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DistributionId)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" IsDownload=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDownload)+"'\n");
    sb.append(" IsInternal=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsInternal)+"'\n");
    sb.append(" ParentViewId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ParentViewId)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}