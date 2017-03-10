package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class Publisher extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public Publisher() {
  }
    
  
  /**
   * element  : DurableId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo DurableId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DurableId","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean DurableId__is_set = false;

  private java.lang.String DurableId;

  public java.lang.String getDurableId() {
    return DurableId;
  }

  

  public void setDurableId(java.lang.String DurableId) {
    this.DurableId = DurableId;
    DurableId__is_set = true;
  }
  
  /**
   * element  : InstalledEntityDefinitions of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo InstalledEntityDefinitions__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","InstalledEntityDefinitions","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean InstalledEntityDefinitions__is_set = false;

  private com.sforce.soap.enterprise.QueryResult InstalledEntityDefinitions;

  public com.sforce.soap.enterprise.QueryResult getInstalledEntityDefinitions() {
    return InstalledEntityDefinitions;
  }

  

  public void setInstalledEntityDefinitions(com.sforce.soap.enterprise.QueryResult InstalledEntityDefinitions) {
    this.InstalledEntityDefinitions = InstalledEntityDefinitions;
    InstalledEntityDefinitions__is_set = true;
  }
  
  /**
   * element  : InstalledFieldDefinitions of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo InstalledFieldDefinitions__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","InstalledFieldDefinitions","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean InstalledFieldDefinitions__is_set = false;

  private com.sforce.soap.enterprise.QueryResult InstalledFieldDefinitions;

  public com.sforce.soap.enterprise.QueryResult getInstalledFieldDefinitions() {
    return InstalledFieldDefinitions;
  }

  

  public void setInstalledFieldDefinitions(com.sforce.soap.enterprise.QueryResult InstalledFieldDefinitions) {
    this.InstalledFieldDefinitions = InstalledFieldDefinitions;
    InstalledFieldDefinitions__is_set = true;
  }
  
  /**
   * element  : IsSalesforce of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsSalesforce__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsSalesforce","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsSalesforce__is_set = false;

  private java.lang.Boolean IsSalesforce;

  public java.lang.Boolean getIsSalesforce() {
    return IsSalesforce;
  }

  

  public void setIsSalesforce(java.lang.Boolean IsSalesforce) {
    this.IsSalesforce = IsSalesforce;
    IsSalesforce__is_set = true;
  }
  
  /**
   * element  : MajorVersion of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo MajorVersion__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MajorVersion","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean MajorVersion__is_set = false;

  private java.lang.Integer MajorVersion;

  public java.lang.Integer getMajorVersion() {
    return MajorVersion;
  }

  

  public void setMajorVersion(java.lang.Integer MajorVersion) {
    this.MajorVersion = MajorVersion;
    MajorVersion__is_set = true;
  }
  
  /**
   * element  : MinorVersion of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo MinorVersion__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MinorVersion","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean MinorVersion__is_set = false;

  private java.lang.Integer MinorVersion;

  public java.lang.Integer getMinorVersion() {
    return MinorVersion;
  }

  

  public void setMinorVersion(java.lang.Integer MinorVersion) {
    this.MinorVersion = MinorVersion;
    MinorVersion__is_set = true;
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
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "Publisher");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, DurableId__typeInfo, DurableId, DurableId__is_set);
    __typeMapper.writeObject(__out, InstalledEntityDefinitions__typeInfo, InstalledEntityDefinitions, InstalledEntityDefinitions__is_set);
    __typeMapper.writeObject(__out, InstalledFieldDefinitions__typeInfo, InstalledFieldDefinitions, InstalledFieldDefinitions__is_set);
    __typeMapper.writeObject(__out, IsSalesforce__typeInfo, IsSalesforce, IsSalesforce__is_set);
    __typeMapper.writeObject(__out, MajorVersion__typeInfo, MajorVersion, MajorVersion__is_set);
    __typeMapper.writeObject(__out, MinorVersion__typeInfo, MinorVersion, MinorVersion__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeString(__out, NamespacePrefix__typeInfo, NamespacePrefix, NamespacePrefix__is_set);
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
    if (__typeMapper.isElement(__in, DurableId__typeInfo)) {
      setDurableId((java.lang.String)__typeMapper.readString(__in, DurableId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, InstalledEntityDefinitions__typeInfo)) {
      setInstalledEntityDefinitions((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, InstalledEntityDefinitions__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, InstalledFieldDefinitions__typeInfo)) {
      setInstalledFieldDefinitions((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, InstalledFieldDefinitions__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsSalesforce__typeInfo)) {
      setIsSalesforce((java.lang.Boolean)__typeMapper.readObject(__in, IsSalesforce__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MajorVersion__typeInfo)) {
      setMajorVersion((java.lang.Integer)__typeMapper.readObject(__in, MajorVersion__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MinorVersion__typeInfo)) {
      setMinorVersion((java.lang.Integer)__typeMapper.readObject(__in, MinorVersion__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Name__typeInfo)) {
      setName((java.lang.String)__typeMapper.readString(__in, Name__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, NamespacePrefix__typeInfo)) {
      setNamespacePrefix((java.lang.String)__typeMapper.readString(__in, NamespacePrefix__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[Publisher ");
    sb.append(super.toString());
    sb.append(" DurableId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DurableId)+"'\n");
    sb.append(" InstalledEntityDefinitions=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(InstalledEntityDefinitions)+"'\n");
    sb.append(" InstalledFieldDefinitions=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(InstalledFieldDefinitions)+"'\n");
    sb.append(" IsSalesforce=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsSalesforce)+"'\n");
    sb.append(" MajorVersion=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MajorVersion)+"'\n");
    sb.append(" MinorVersion=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MinorVersion)+"'\n");
    sb.append(" Name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");
    sb.append(" NamespacePrefix=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NamespacePrefix)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}