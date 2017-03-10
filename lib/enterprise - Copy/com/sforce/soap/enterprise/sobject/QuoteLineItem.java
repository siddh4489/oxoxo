package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class QuoteLineItem extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public QuoteLineItem() {
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
   * element  : Discount of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Discount__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Discount","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Discount__is_set = false;

  private java.lang.Double Discount;

  public java.lang.Double getDiscount() {
    return Discount;
  }

  

  public void setDiscount(java.lang.Double Discount) {
    this.Discount = Discount;
    Discount__is_set = true;
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
   * element  : LineNumber of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LineNumber__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LineNumber","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean LineNumber__is_set = false;

  private java.lang.String LineNumber;

  public java.lang.String getLineNumber() {
    return LineNumber;
  }

  

  public void setLineNumber(java.lang.String LineNumber) {
    this.LineNumber = LineNumber;
    LineNumber__is_set = true;
  }
  
  /**
   * element  : ListPrice of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo ListPrice__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ListPrice","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean ListPrice__is_set = false;

  private java.lang.Double ListPrice;

  public java.lang.Double getListPrice() {
    return ListPrice;
  }

  

  public void setListPrice(java.lang.Double ListPrice) {
    this.ListPrice = ListPrice;
    ListPrice__is_set = true;
  }
  
  /**
   * element  : PricebookEntry of type {urn:sobject.enterprise.soap.sforce.com}PricebookEntry
   * java type: com.sforce.soap.enterprise.sobject.PricebookEntry
   */
  private static final com.sforce.ws.bind.TypeInfo PricebookEntry__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PricebookEntry","urn:sobject.enterprise.soap.sforce.com","PricebookEntry",0,1,true);

  private boolean PricebookEntry__is_set = false;

  private com.sforce.soap.enterprise.sobject.PricebookEntry PricebookEntry;

  public com.sforce.soap.enterprise.sobject.PricebookEntry getPricebookEntry() {
    return PricebookEntry;
  }

  

  public void setPricebookEntry(com.sforce.soap.enterprise.sobject.PricebookEntry PricebookEntry) {
    this.PricebookEntry = PricebookEntry;
    PricebookEntry__is_set = true;
  }
  
  /**
   * element  : PricebookEntryId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo PricebookEntryId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PricebookEntryId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean PricebookEntryId__is_set = false;

  private java.lang.String PricebookEntryId;

  public java.lang.String getPricebookEntryId() {
    return PricebookEntryId;
  }

  

  public void setPricebookEntryId(java.lang.String PricebookEntryId) {
    this.PricebookEntryId = PricebookEntryId;
    PricebookEntryId__is_set = true;
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
   * element  : Quantity of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Quantity__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Quantity","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Quantity__is_set = false;

  private java.lang.Double Quantity;

  public java.lang.Double getQuantity() {
    return Quantity;
  }

  

  public void setQuantity(java.lang.Double Quantity) {
    this.Quantity = Quantity;
    Quantity__is_set = true;
  }
  
  /**
   * element  : Quote of type {urn:sobject.enterprise.soap.sforce.com}Quote
   * java type: com.sforce.soap.enterprise.sobject.Quote
   */
  private static final com.sforce.ws.bind.TypeInfo Quote__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Quote","urn:sobject.enterprise.soap.sforce.com","Quote",0,1,true);

  private boolean Quote__is_set = false;

  private com.sforce.soap.enterprise.sobject.Quote Quote;

  public com.sforce.soap.enterprise.sobject.Quote getQuote() {
    return Quote;
  }

  

  public void setQuote(com.sforce.soap.enterprise.sobject.Quote Quote) {
    this.Quote = Quote;
    Quote__is_set = true;
  }
  
  /**
   * element  : QuoteId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo QuoteId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","QuoteId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean QuoteId__is_set = false;

  private java.lang.String QuoteId;

  public java.lang.String getQuoteId() {
    return QuoteId;
  }

  

  public void setQuoteId(java.lang.String QuoteId) {
    this.QuoteId = QuoteId;
    QuoteId__is_set = true;
  }
  
  /**
   * element  : ServiceDate of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo ServiceDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ServiceDate","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean ServiceDate__is_set = false;

  private java.util.Calendar ServiceDate;

  public java.util.Calendar getServiceDate() {
    return ServiceDate;
  }

  

  public void setServiceDate(java.util.Calendar ServiceDate) {
    this.ServiceDate = ServiceDate;
    ServiceDate__is_set = true;
  }
  
  /**
   * element  : SortOrder of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo SortOrder__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SortOrder","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean SortOrder__is_set = false;

  private java.lang.Integer SortOrder;

  public java.lang.Integer getSortOrder() {
    return SortOrder;
  }

  

  public void setSortOrder(java.lang.Integer SortOrder) {
    this.SortOrder = SortOrder;
    SortOrder__is_set = true;
  }
  
  /**
   * element  : Subtotal of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Subtotal__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Subtotal","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Subtotal__is_set = false;

  private java.lang.Double Subtotal;

  public java.lang.Double getSubtotal() {
    return Subtotal;
  }

  

  public void setSubtotal(java.lang.Double Subtotal) {
    this.Subtotal = Subtotal;
    Subtotal__is_set = true;
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
   * element  : TotalPrice of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo TotalPrice__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TotalPrice","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean TotalPrice__is_set = false;

  private java.lang.Double TotalPrice;

  public java.lang.Double getTotalPrice() {
    return TotalPrice;
  }

  

  public void setTotalPrice(java.lang.Double TotalPrice) {
    this.TotalPrice = TotalPrice;
    TotalPrice__is_set = true;
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
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "QuoteLineItem");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, Description__typeInfo, Description, Description__is_set);
    __typeMapper.writeObject(__out, Discount__typeInfo, Discount, Discount__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeString(__out, LineNumber__typeInfo, LineNumber, LineNumber__is_set);
    __typeMapper.writeObject(__out, ListPrice__typeInfo, ListPrice, ListPrice__is_set);
    __typeMapper.writeObject(__out, PricebookEntry__typeInfo, PricebookEntry, PricebookEntry__is_set);
    __typeMapper.writeString(__out, PricebookEntryId__typeInfo, PricebookEntryId, PricebookEntryId__is_set);
    __typeMapper.writeObject(__out, Product2__typeInfo, Product2, Product2__is_set);
    __typeMapper.writeString(__out, Product2Id__typeInfo, Product2Id, Product2Id__is_set);
    __typeMapper.writeObject(__out, Quantity__typeInfo, Quantity, Quantity__is_set);
    __typeMapper.writeObject(__out, Quote__typeInfo, Quote, Quote__is_set);
    __typeMapper.writeString(__out, QuoteId__typeInfo, QuoteId, QuoteId__is_set);
    __typeMapper.writeObject(__out, ServiceDate__typeInfo, ServiceDate, ServiceDate__is_set);
    __typeMapper.writeObject(__out, SortOrder__typeInfo, SortOrder, SortOrder__is_set);
    __typeMapper.writeObject(__out, Subtotal__typeInfo, Subtotal, Subtotal__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeObject(__out, TotalPrice__typeInfo, TotalPrice, TotalPrice__is_set);
    __typeMapper.writeObject(__out, UnitPrice__typeInfo, UnitPrice, UnitPrice__is_set);
    __typeMapper.writeObject(__out, UserRecordAccess__typeInfo, UserRecordAccess, UserRecordAccess__is_set);
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
    if (__typeMapper.isElement(__in, Description__typeInfo)) {
      setDescription((java.lang.String)__typeMapper.readString(__in, Description__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Discount__typeInfo)) {
      setDiscount((java.lang.Double)__typeMapper.readObject(__in, Discount__typeInfo, java.lang.Double.class));
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
    if (__typeMapper.isElement(__in, LineNumber__typeInfo)) {
      setLineNumber((java.lang.String)__typeMapper.readString(__in, LineNumber__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ListPrice__typeInfo)) {
      setListPrice((java.lang.Double)__typeMapper.readObject(__in, ListPrice__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PricebookEntry__typeInfo)) {
      setPricebookEntry((com.sforce.soap.enterprise.sobject.PricebookEntry)__typeMapper.readObject(__in, PricebookEntry__typeInfo, com.sforce.soap.enterprise.sobject.PricebookEntry.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PricebookEntryId__typeInfo)) {
      setPricebookEntryId((java.lang.String)__typeMapper.readString(__in, PricebookEntryId__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Quantity__typeInfo)) {
      setQuantity((java.lang.Double)__typeMapper.readObject(__in, Quantity__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Quote__typeInfo)) {
      setQuote((com.sforce.soap.enterprise.sobject.Quote)__typeMapper.readObject(__in, Quote__typeInfo, com.sforce.soap.enterprise.sobject.Quote.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, QuoteId__typeInfo)) {
      setQuoteId((java.lang.String)__typeMapper.readString(__in, QuoteId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ServiceDate__typeInfo)) {
      setServiceDate((java.util.Calendar)__typeMapper.readObject(__in, ServiceDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SortOrder__typeInfo)) {
      setSortOrder((java.lang.Integer)__typeMapper.readObject(__in, SortOrder__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Subtotal__typeInfo)) {
      setSubtotal((java.lang.Double)__typeMapper.readObject(__in, Subtotal__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TotalPrice__typeInfo)) {
      setTotalPrice((java.lang.Double)__typeMapper.readObject(__in, TotalPrice__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UnitPrice__typeInfo)) {
      setUnitPrice((java.lang.Double)__typeMapper.readObject(__in, UnitPrice__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserRecordAccess__typeInfo)) {
      setUserRecordAccess((com.sforce.soap.enterprise.sobject.UserRecordAccess)__typeMapper.readObject(__in, UserRecordAccess__typeInfo, com.sforce.soap.enterprise.sobject.UserRecordAccess.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[QuoteLineItem ");
    sb.append(super.toString());
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" Description=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Description)+"'\n");
    sb.append(" Discount=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Discount)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" LineNumber=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LineNumber)+"'\n");
    sb.append(" ListPrice=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ListPrice)+"'\n");
    sb.append(" PricebookEntry=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PricebookEntry)+"'\n");
    sb.append(" PricebookEntryId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PricebookEntryId)+"'\n");
    sb.append(" Product2=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Product2)+"'\n");
    sb.append(" Product2Id=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Product2Id)+"'\n");
    sb.append(" Quantity=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Quantity)+"'\n");
    sb.append(" Quote=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Quote)+"'\n");
    sb.append(" QuoteId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(QuoteId)+"'\n");
    sb.append(" ServiceDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ServiceDate)+"'\n");
    sb.append(" SortOrder=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SortOrder)+"'\n");
    sb.append(" Subtotal=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Subtotal)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" TotalPrice=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TotalPrice)+"'\n");
    sb.append(" UnitPrice=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UnitPrice)+"'\n");
    sb.append(" UserRecordAccess=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserRecordAccess)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}