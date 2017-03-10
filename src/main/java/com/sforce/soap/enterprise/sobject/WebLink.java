package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class WebLink extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public WebLink() {
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
   * element  : DisplayType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo DisplayType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DisplayType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean DisplayType__is_set = false;

  private java.lang.String DisplayType;

  public java.lang.String getDisplayType() {
    return DisplayType;
  }

  

  public void setDisplayType(java.lang.String DisplayType) {
    this.DisplayType = DisplayType;
    DisplayType__is_set = true;
  }
  
  /**
   * element  : EncodingKey of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo EncodingKey__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","EncodingKey","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean EncodingKey__is_set = false;

  private java.lang.String EncodingKey;

  public java.lang.String getEncodingKey() {
    return EncodingKey;
  }

  

  public void setEncodingKey(java.lang.String EncodingKey) {
    this.EncodingKey = EncodingKey;
    EncodingKey__is_set = true;
  }
  
  /**
   * element  : HasMenubar of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo HasMenubar__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","HasMenubar","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean HasMenubar__is_set = false;

  private java.lang.Boolean HasMenubar;

  public java.lang.Boolean getHasMenubar() {
    return HasMenubar;
  }

  

  public void setHasMenubar(java.lang.Boolean HasMenubar) {
    this.HasMenubar = HasMenubar;
    HasMenubar__is_set = true;
  }
  
  /**
   * element  : HasScrollbars of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo HasScrollbars__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","HasScrollbars","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean HasScrollbars__is_set = false;

  private java.lang.Boolean HasScrollbars;

  public java.lang.Boolean getHasScrollbars() {
    return HasScrollbars;
  }

  

  public void setHasScrollbars(java.lang.Boolean HasScrollbars) {
    this.HasScrollbars = HasScrollbars;
    HasScrollbars__is_set = true;
  }
  
  /**
   * element  : HasToolbar of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo HasToolbar__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","HasToolbar","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean HasToolbar__is_set = false;

  private java.lang.Boolean HasToolbar;

  public java.lang.Boolean getHasToolbar() {
    return HasToolbar;
  }

  

  public void setHasToolbar(java.lang.Boolean HasToolbar) {
    this.HasToolbar = HasToolbar;
    HasToolbar__is_set = true;
  }
  
  /**
   * element  : Height of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo Height__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Height","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean Height__is_set = false;

  private java.lang.Integer Height;

  public java.lang.Integer getHeight() {
    return Height;
  }

  

  public void setHeight(java.lang.Integer Height) {
    this.Height = Height;
    Height__is_set = true;
  }
  
  /**
   * element  : IsProtected of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsProtected__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsProtected","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsProtected__is_set = false;

  private java.lang.Boolean IsProtected;

  public java.lang.Boolean getIsProtected() {
    return IsProtected;
  }

  

  public void setIsProtected(java.lang.Boolean IsProtected) {
    this.IsProtected = IsProtected;
    IsProtected__is_set = true;
  }
  
  /**
   * element  : IsResizable of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsResizable__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsResizable","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsResizable__is_set = false;

  private java.lang.Boolean IsResizable;

  public java.lang.Boolean getIsResizable() {
    return IsResizable;
  }

  

  public void setIsResizable(java.lang.Boolean IsResizable) {
    this.IsResizable = IsResizable;
    IsResizable__is_set = true;
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
   * element  : Localization of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Localization__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Localization","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Localization__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Localization;

  public com.sforce.soap.enterprise.QueryResult getLocalization() {
    return Localization;
  }

  

  public void setLocalization(com.sforce.soap.enterprise.QueryResult Localization) {
    this.Localization = Localization;
    Localization__is_set = true;
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
   * element  : NamespacePrefix of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo NamespacePrefix__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","NamespacePrefix","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean NamespacePrefix__is_set = false;

  private java.lang.String NamespacePrefix;

  public java.lang.String getNamespacePrefix() {
    return NamespacePrefix;
  }

  

  public void setNamespacePrefix(java.lang.String NamespacePrefix) {
    this.NamespacePrefix = NamespacePrefix;
    NamespacePrefix__is_set = true;
  }
  
  /**
   * element  : OpenType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo OpenType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OpenType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean OpenType__is_set = false;

  private java.lang.String OpenType;

  public java.lang.String getOpenType() {
    return OpenType;
  }

  

  public void setOpenType(java.lang.String OpenType) {
    this.OpenType = OpenType;
    OpenType__is_set = true;
  }
  
  /**
   * element  : PageOrSobjectType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo PageOrSobjectType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PageOrSobjectType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean PageOrSobjectType__is_set = false;

  private java.lang.String PageOrSobjectType;

  public java.lang.String getPageOrSobjectType() {
    return PageOrSobjectType;
  }

  

  public void setPageOrSobjectType(java.lang.String PageOrSobjectType) {
    this.PageOrSobjectType = PageOrSobjectType;
    PageOrSobjectType__is_set = true;
  }
  
  /**
   * element  : Position of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Position__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Position","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Position__is_set = false;

  private java.lang.String Position;

  public java.lang.String getPosition() {
    return Position;
  }

  

  public void setPosition(java.lang.String Position) {
    this.Position = Position;
    Position__is_set = true;
  }
  
  /**
   * element  : RequireRowSelection of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo RequireRowSelection__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RequireRowSelection","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean RequireRowSelection__is_set = false;

  private java.lang.Boolean RequireRowSelection;

  public java.lang.Boolean getRequireRowSelection() {
    return RequireRowSelection;
  }

  

  public void setRequireRowSelection(java.lang.Boolean RequireRowSelection) {
    this.RequireRowSelection = RequireRowSelection;
    RequireRowSelection__is_set = true;
  }
  
  /**
   * element  : ScontrolId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ScontrolId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ScontrolId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ScontrolId__is_set = false;

  private java.lang.String ScontrolId;

  public java.lang.String getScontrolId() {
    return ScontrolId;
  }

  

  public void setScontrolId(java.lang.String ScontrolId) {
    this.ScontrolId = ScontrolId;
    ScontrolId__is_set = true;
  }
  
  /**
   * element  : ShowsLocation of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo ShowsLocation__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ShowsLocation","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean ShowsLocation__is_set = false;

  private java.lang.Boolean ShowsLocation;

  public java.lang.Boolean getShowsLocation() {
    return ShowsLocation;
  }

  

  public void setShowsLocation(java.lang.Boolean ShowsLocation) {
    this.ShowsLocation = ShowsLocation;
    ShowsLocation__is_set = true;
  }
  
  /**
   * element  : ShowsStatus of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo ShowsStatus__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ShowsStatus","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean ShowsStatus__is_set = false;

  private java.lang.Boolean ShowsStatus;

  public java.lang.Boolean getShowsStatus() {
    return ShowsStatus;
  }

  

  public void setShowsStatus(java.lang.Boolean ShowsStatus) {
    this.ShowsStatus = ShowsStatus;
    ShowsStatus__is_set = true;
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
   * element  : Url of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Url__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Url","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Url__is_set = false;

  private java.lang.String Url;

  public java.lang.String getUrl() {
    return Url;
  }

  

  public void setUrl(java.lang.String Url) {
    this.Url = Url;
    Url__is_set = true;
  }
  
  /**
   * element  : Width of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo Width__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Width","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean Width__is_set = false;

  private java.lang.Integer Width;

  public java.lang.Integer getWidth() {
    return Width;
  }

  

  public void setWidth(java.lang.Integer Width) {
    this.Width = Width;
    Width__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "WebLink");
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
    __typeMapper.writeString(__out, DisplayType__typeInfo, DisplayType, DisplayType__is_set);
    __typeMapper.writeString(__out, EncodingKey__typeInfo, EncodingKey, EncodingKey__is_set);
    __typeMapper.writeObject(__out, HasMenubar__typeInfo, HasMenubar, HasMenubar__is_set);
    __typeMapper.writeObject(__out, HasScrollbars__typeInfo, HasScrollbars, HasScrollbars__is_set);
    __typeMapper.writeObject(__out, HasToolbar__typeInfo, HasToolbar, HasToolbar__is_set);
    __typeMapper.writeObject(__out, Height__typeInfo, Height, Height__is_set);
    __typeMapper.writeObject(__out, IsProtected__typeInfo, IsProtected, IsProtected__is_set);
    __typeMapper.writeObject(__out, IsResizable__typeInfo, IsResizable, IsResizable__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeString(__out, LinkType__typeInfo, LinkType, LinkType__is_set);
    __typeMapper.writeObject(__out, Localization__typeInfo, Localization, Localization__is_set);
    __typeMapper.writeString(__out, MasterLabel__typeInfo, MasterLabel, MasterLabel__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeString(__out, NamespacePrefix__typeInfo, NamespacePrefix, NamespacePrefix__is_set);
    __typeMapper.writeString(__out, OpenType__typeInfo, OpenType, OpenType__is_set);
    __typeMapper.writeString(__out, PageOrSobjectType__typeInfo, PageOrSobjectType, PageOrSobjectType__is_set);
    __typeMapper.writeString(__out, Position__typeInfo, Position, Position__is_set);
    __typeMapper.writeObject(__out, RequireRowSelection__typeInfo, RequireRowSelection, RequireRowSelection__is_set);
    __typeMapper.writeString(__out, ScontrolId__typeInfo, ScontrolId, ScontrolId__is_set);
    __typeMapper.writeObject(__out, ShowsLocation__typeInfo, ShowsLocation, ShowsLocation__is_set);
    __typeMapper.writeObject(__out, ShowsStatus__typeInfo, ShowsStatus, ShowsStatus__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeString(__out, Url__typeInfo, Url, Url__is_set);
    __typeMapper.writeObject(__out, Width__typeInfo, Width, Width__is_set);
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
    if (__typeMapper.isElement(__in, DisplayType__typeInfo)) {
      setDisplayType((java.lang.String)__typeMapper.readString(__in, DisplayType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, EncodingKey__typeInfo)) {
      setEncodingKey((java.lang.String)__typeMapper.readString(__in, EncodingKey__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, HasMenubar__typeInfo)) {
      setHasMenubar((java.lang.Boolean)__typeMapper.readObject(__in, HasMenubar__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, HasScrollbars__typeInfo)) {
      setHasScrollbars((java.lang.Boolean)__typeMapper.readObject(__in, HasScrollbars__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, HasToolbar__typeInfo)) {
      setHasToolbar((java.lang.Boolean)__typeMapper.readObject(__in, HasToolbar__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Height__typeInfo)) {
      setHeight((java.lang.Integer)__typeMapper.readObject(__in, Height__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsProtected__typeInfo)) {
      setIsProtected((java.lang.Boolean)__typeMapper.readObject(__in, IsProtected__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsResizable__typeInfo)) {
      setIsResizable((java.lang.Boolean)__typeMapper.readObject(__in, IsResizable__typeInfo, java.lang.Boolean.class));
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
    if (__typeMapper.isElement(__in, Localization__typeInfo)) {
      setLocalization((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Localization__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MasterLabel__typeInfo)) {
      setMasterLabel((java.lang.String)__typeMapper.readString(__in, MasterLabel__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Name__typeInfo)) {
      setName((java.lang.String)__typeMapper.readString(__in, Name__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, NamespacePrefix__typeInfo)) {
      setNamespacePrefix((java.lang.String)__typeMapper.readString(__in, NamespacePrefix__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OpenType__typeInfo)) {
      setOpenType((java.lang.String)__typeMapper.readString(__in, OpenType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PageOrSobjectType__typeInfo)) {
      setPageOrSobjectType((java.lang.String)__typeMapper.readString(__in, PageOrSobjectType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Position__typeInfo)) {
      setPosition((java.lang.String)__typeMapper.readString(__in, Position__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RequireRowSelection__typeInfo)) {
      setRequireRowSelection((java.lang.Boolean)__typeMapper.readObject(__in, RequireRowSelection__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ScontrolId__typeInfo)) {
      setScontrolId((java.lang.String)__typeMapper.readString(__in, ScontrolId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ShowsLocation__typeInfo)) {
      setShowsLocation((java.lang.Boolean)__typeMapper.readObject(__in, ShowsLocation__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ShowsStatus__typeInfo)) {
      setShowsStatus((java.lang.Boolean)__typeMapper.readObject(__in, ShowsStatus__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Url__typeInfo)) {
      setUrl((java.lang.String)__typeMapper.readString(__in, Url__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Width__typeInfo)) {
      setWidth((java.lang.Integer)__typeMapper.readObject(__in, Width__typeInfo, java.lang.Integer.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[WebLink ");
    sb.append(super.toString());
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" Description=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Description)+"'\n");
    sb.append(" DisplayType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DisplayType)+"'\n");
    sb.append(" EncodingKey=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EncodingKey)+"'\n");
    sb.append(" HasMenubar=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(HasMenubar)+"'\n");
    sb.append(" HasScrollbars=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(HasScrollbars)+"'\n");
    sb.append(" HasToolbar=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(HasToolbar)+"'\n");
    sb.append(" Height=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Height)+"'\n");
    sb.append(" IsProtected=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsProtected)+"'\n");
    sb.append(" IsResizable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsResizable)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" LinkType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LinkType)+"'\n");
    sb.append(" Localization=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Localization)+"'\n");
    sb.append(" MasterLabel=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MasterLabel)+"'\n");
    sb.append(" Name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");
    sb.append(" NamespacePrefix=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NamespacePrefix)+"'\n");
    sb.append(" OpenType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OpenType)+"'\n");
    sb.append(" PageOrSobjectType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PageOrSobjectType)+"'\n");
    sb.append(" Position=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Position)+"'\n");
    sb.append(" RequireRowSelection=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RequireRowSelection)+"'\n");
    sb.append(" ScontrolId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ScontrolId)+"'\n");
    sb.append(" ShowsLocation=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ShowsLocation)+"'\n");
    sb.append(" ShowsStatus=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ShowsStatus)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" Url=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Url)+"'\n");
    sb.append(" Width=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Width)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}