package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class OpportunityHistory extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public OpportunityHistory() {
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
   * element  : ExpectedRevenue of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo ExpectedRevenue__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ExpectedRevenue","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean ExpectedRevenue__is_set = false;

  private java.lang.Double ExpectedRevenue;

  public java.lang.Double getExpectedRevenue() {
    return ExpectedRevenue;
  }

  

  public void setExpectedRevenue(java.lang.Double ExpectedRevenue) {
    this.ExpectedRevenue = ExpectedRevenue;
    ExpectedRevenue__is_set = true;
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
   * element  : Opportunity of type {urn:sobject.enterprise.soap.sforce.com}Opportunity
   * java type: com.sforce.soap.enterprise.sobject.Opportunity
   */
  private static final com.sforce.ws.bind.TypeInfo Opportunity__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Opportunity","urn:sobject.enterprise.soap.sforce.com","Opportunity",0,1,true);

  private boolean Opportunity__is_set = false;

  private com.sforce.soap.enterprise.sobject.Opportunity Opportunity;

  public com.sforce.soap.enterprise.sobject.Opportunity getOpportunity() {
    return Opportunity;
  }

  

  public void setOpportunity(com.sforce.soap.enterprise.sobject.Opportunity Opportunity) {
    this.Opportunity = Opportunity;
    Opportunity__is_set = true;
  }
  
  /**
   * element  : OpportunityId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo OpportunityId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OpportunityId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean OpportunityId__is_set = false;

  private java.lang.String OpportunityId;

  public java.lang.String getOpportunityId() {
    return OpportunityId;
  }

  

  public void setOpportunityId(java.lang.String OpportunityId) {
    this.OpportunityId = OpportunityId;
    OpportunityId__is_set = true;
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
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "OpportunityHistory");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, Amount__typeInfo, Amount, Amount__is_set);
    __typeMapper.writeObject(__out, CloseDate__typeInfo, CloseDate, CloseDate__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeObject(__out, ExpectedRevenue__typeInfo, ExpectedRevenue, ExpectedRevenue__is_set);
    __typeMapper.writeString(__out, ForecastCategory__typeInfo, ForecastCategory, ForecastCategory__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, Opportunity__typeInfo, Opportunity, Opportunity__is_set);
    __typeMapper.writeString(__out, OpportunityId__typeInfo, OpportunityId, OpportunityId__is_set);
    __typeMapper.writeObject(__out, Probability__typeInfo, Probability, Probability__is_set);
    __typeMapper.writeString(__out, StageName__typeInfo, StageName, StageName__is_set);
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
    if (__typeMapper.isElement(__in, Amount__typeInfo)) {
      setAmount((java.lang.Double)__typeMapper.readObject(__in, Amount__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CloseDate__typeInfo)) {
      setCloseDate((java.util.Calendar)__typeMapper.readObject(__in, CloseDate__typeInfo, java.util.Calendar.class));
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
    if (__typeMapper.isElement(__in, ExpectedRevenue__typeInfo)) {
      setExpectedRevenue((java.lang.Double)__typeMapper.readObject(__in, ExpectedRevenue__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ForecastCategory__typeInfo)) {
      setForecastCategory((java.lang.String)__typeMapper.readString(__in, ForecastCategory__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {
      setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, IsDeleted__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Opportunity__typeInfo)) {
      setOpportunity((com.sforce.soap.enterprise.sobject.Opportunity)__typeMapper.readObject(__in, Opportunity__typeInfo, com.sforce.soap.enterprise.sobject.Opportunity.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OpportunityId__typeInfo)) {
      setOpportunityId((java.lang.String)__typeMapper.readString(__in, OpportunityId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Probability__typeInfo)) {
      setProbability((java.lang.Double)__typeMapper.readObject(__in, Probability__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, StageName__typeInfo)) {
      setStageName((java.lang.String)__typeMapper.readString(__in, StageName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[OpportunityHistory ");
    sb.append(super.toString());
    sb.append(" Amount=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Amount)+"'\n");
    sb.append(" CloseDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CloseDate)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" ExpectedRevenue=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ExpectedRevenue)+"'\n");
    sb.append(" ForecastCategory=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ForecastCategory)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" Opportunity=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Opportunity)+"'\n");
    sb.append(" OpportunityId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OpportunityId)+"'\n");
    sb.append(" Probability=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Probability)+"'\n");
    sb.append(" StageName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(StageName)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}