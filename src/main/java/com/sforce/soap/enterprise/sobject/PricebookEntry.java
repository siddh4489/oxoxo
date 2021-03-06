package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class PricebookEntry extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public PricebookEntry() {
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
   * element  : Product2 of type {urn:sobject.enterprise.soap.sforce.com}Product2
   * java type: com.sforce.soap.enterprise.sobject.Product2
   */
  private static final com.sforce.ws.bind.TypeInfo Product2__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Product2","urn:sobject.enterprise.soap.sforce.com","Product2",0,1,true);

  private boolean Product2__is_set = false;

  private com.sforce.soap.enterprise.sobject.Product2 Product2;

  public com.sforce.soap.enterprise.sobject.Product2 getProduct2() {
    return Product2;
  }

  

  public void setProduct2(com.sforce.soap.enterprise.sobject.Product2 Product2) {
    this.Product2 = Product2;
    Product2__is_set = true;
  }
  
  /**
   * element  : Product2Id of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Product2Id__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Product2Id","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean Product2Id__is_set = false;

  private java.lang.String Product2Id;

  public java.lang.String getProduct2Id() {
    return Product2Id;
  }

  

  public void setProduct2Id(java.lang.String Product2Id) {
    this.Product2Id = Product2Id;
    Product2Id__is_set = true;
  }
  
  /**
   * element  : ProductCode of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ProductCode__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ProductCode","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ProductCode__is_set = false;

  private java.lang.String ProductCode;

  public java.lang.String getProductCode() {
    return ProductCode;
  }

  

  public void setProductCode(java.lang.String ProductCode) {
    this.ProductCode = ProductCode;
    ProductCode__is_set = true;
  }
  
  /**
   * element  : QuoteLineItems of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo QuoteLineItems__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","QuoteLineItems","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean QuoteLineItems__is_set = false;

  private com.sforce.soap.enterprise.QueryResult QuoteLineItems;

  public com.sforce.soap.enterprise.QueryResult getQuoteLineItems() {
    return QuoteLineItems;
  }

  

  public void setQuoteLineItems(com.sforce.soap.enterprise.QueryResult QuoteLineItems) {
    this.QuoteLineItems = QuoteLineItems;
    QuoteLineItems__is_set = true;
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
   * element  : UnitPrice of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo UnitPrice__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UnitPrice","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean UnitPrice__is_set = false;

  private java.lang.Double UnitPrice;

  public java.lang.Double getUnitPrice() {
    return UnitPrice;
  }

  

  public void setUnitPrice(java.lang.Double UnitPrice) {
    this.UnitPrice = UnitPrice;
    UnitPrice__is_set = true;
  }
  
  /**
   * element  : UseStandardPrice of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UseStandardPrice__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UseStandardPrice","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UseStandardPrice__is_set = false;

  private java.lang.Boolean UseStandardPrice;

  public java.lang.Boolean getUseStandardPrice() {
    return UseStandardPrice;
  }

  

  public void setUseStandardPrice(java.lang.Boolean UseStandardPrice) {
    this.UseStandardPrice = UseStandardPrice;
    UseStandardPrice__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "PricebookEntry");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeObject(__out, IsActive__typeInfo, IsActive, IsActive__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeObject(__out, OpportunityLineItems__typeInfo, OpportunityLineItems, OpportunityLineItems__is_set);
    __typeMapper.writeObject(__out, Pricebook2__typeInfo, Pricebook2, Pricebook2__is_set);
    __typeMapper.writeString(__out, Pricebook2Id__typeInfo, Pricebook2Id, Pricebook2Id__is_set);
    __typeMapper.writeObject(__out, Product2__typeInfo, Product2, Product2__is_set);
    __typeMapper.writeString(__out, Product2Id__typeInfo, Product2Id, Product2Id__is_set);
    __typeMapper.writeString(__out, ProductCode__typeInfo, ProductCode, ProductCode__is_set);
    __typeMapper.writeObject(__out, QuoteLineItems__typeInfo, QuoteLineItems, QuoteLineItems__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeObject(__out, UnitPrice__typeInfo, UnitPrice, UnitPrice__is_set);
    __typeMapper.writeObject(__out, UseStandardPrice__typeInfo, UseStandardPrice, UseStandardPrice__is_set);
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
    if (__typeMapper.isElement(__in, IsActive__typeInfo)) {
      setIsActive((java.lang.Boolean)__typeMapper.readObject(__in, IsActive__typeInfo, java.lang.Boolean.class));
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
    if (__typeMapper.isElement(__in, Name__typeInfo)) {
      setName((java.lang.String)__typeMapper.readString(__in, Name__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OpportunityLineItems__typeInfo)) {
      setOpportunityLineItems((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, OpportunityLineItems__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    if (__typeMapper.isElement(__in, Product2__typeInfo)) {
      setProduct2((com.sforce.soap.enterprise.sobject.Product2)__typeMapper.readObject(__in, Product2__typeInfo, com.sforce.soap.enterprise.sobject.Product2.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Product2Id__typeInfo)) {
      setProduct2Id((java.lang.String)__typeMapper.readString(__in, Product2Id__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ProductCode__typeInfo)) {
      setProductCode((java.lang.String)__typeMapper.readString(__in, ProductCode__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, QuoteLineItems__typeInfo)) {
      setQuoteLineItems((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, QuoteLineItems__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UnitPrice__typeInfo)) {
      setUnitPrice((java.lang.Double)__typeMapper.readObject(__in, UnitPrice__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UseStandardPrice__typeInfo)) {
      setUseStandardPrice((java.lang.Boolean)__typeMapper.readObject(__in, UseStandardPrice__typeInfo, java.lang.Boolean.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[PricebookEntry ");
    sb.append(super.toString());
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" IsActive=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsActive)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" Name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");
    sb.append(" OpportunityLineItems=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OpportunityLineItems)+"'\n");
    sb.append(" Pricebook2=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Pricebook2)+"'\n");
    sb.append(" Pricebook2Id=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Pricebook2Id)+"'\n");
    sb.append(" Product2=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Product2)+"'\n");
    sb.append(" Product2Id=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Product2Id)+"'\n");
    sb.append(" ProductCode=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProductCode)+"'\n");
    sb.append(" QuoteLineItems=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(QuoteLineItems)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" UnitPrice=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UnitPrice)+"'\n");
    sb.append(" UseStandardPrice=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UseStandardPrice)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}