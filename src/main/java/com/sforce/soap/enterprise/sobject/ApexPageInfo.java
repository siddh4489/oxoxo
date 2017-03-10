package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class ApexPageInfo extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public ApexPageInfo() {
  }
    
  
  /**
   * element  : ApexPageId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ApexPageId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ApexPageId","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ApexPageId__is_set = false;

  private java.lang.String ApexPageId;

  public java.lang.String getApexPageId() {
    return ApexPageId;
  }

  

  public void setApexPageId(java.lang.String ApexPageId) {
    this.ApexPageId = ApexPageId;
    ApexPageId__is_set = true;
  }
  
  /**
   * element  : ApiVersion of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo ApiVersion__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ApiVersion","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean ApiVersion__is_set = false;

  private java.lang.Double ApiVersion;

  public java.lang.Double getApiVersion() {
    return ApiVersion;
  }

  

  public void setApiVersion(java.lang.Double ApiVersion) {
    this.ApiVersion = ApiVersion;
    ApiVersion__is_set = true;
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
   * element  : IsAvailableInTouch of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsAvailableInTouch__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsAvailableInTouch","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsAvailableInTouch__is_set = false;

  private java.lang.Boolean IsAvailableInTouch;

  public java.lang.Boolean getIsAvailableInTouch() {
    return IsAvailableInTouch;
  }

  

  public void setIsAvailableInTouch(java.lang.Boolean IsAvailableInTouch) {
    this.IsAvailableInTouch = IsAvailableInTouch;
    IsAvailableInTouch__is_set = true;
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
   * element  : NameSpacePrefix of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo NameSpacePrefix__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","NameSpacePrefix","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean NameSpacePrefix__is_set = false;

  private java.lang.String NameSpacePrefix;

  public java.lang.String getNameSpacePrefix() {
    return NameSpacePrefix;
  }

  

  public void setNameSpacePrefix(java.lang.String NameSpacePrefix) {
    this.NameSpacePrefix = NameSpacePrefix;
    NameSpacePrefix__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "ApexPageInfo");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, ApexPageId__typeInfo, ApexPageId, ApexPageId__is_set);
    __typeMapper.writeObject(__out, ApiVersion__typeInfo, ApiVersion, ApiVersion__is_set);
    __typeMapper.writeString(__out, Description__typeInfo, Description, Description__is_set);
    __typeMapper.writeString(__out, DurableId__typeInfo, DurableId, DurableId__is_set);
    __typeMapper.writeObject(__out, IsAvailableInTouch__typeInfo, IsAvailableInTouch, IsAvailableInTouch__is_set);
    __typeMapper.writeString(__out, MasterLabel__typeInfo, MasterLabel, MasterLabel__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeString(__out, NameSpacePrefix__typeInfo, NameSpacePrefix, NameSpacePrefix__is_set);
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
    if (__typeMapper.isElement(__in, ApexPageId__typeInfo)) {
      setApexPageId((java.lang.String)__typeMapper.readString(__in, ApexPageId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ApiVersion__typeInfo)) {
      setApiVersion((java.lang.Double)__typeMapper.readObject(__in, ApiVersion__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Description__typeInfo)) {
      setDescription((java.lang.String)__typeMapper.readString(__in, Description__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DurableId__typeInfo)) {
      setDurableId((java.lang.String)__typeMapper.readString(__in, DurableId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsAvailableInTouch__typeInfo)) {
      setIsAvailableInTouch((java.lang.Boolean)__typeMapper.readObject(__in, IsAvailableInTouch__typeInfo, java.lang.Boolean.class));
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
    if (__typeMapper.isElement(__in, NameSpacePrefix__typeInfo)) {
      setNameSpacePrefix((java.lang.String)__typeMapper.readString(__in, NameSpacePrefix__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[ApexPageInfo ");
    sb.append(super.toString());
    sb.append(" ApexPageId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ApexPageId)+"'\n");
    sb.append(" ApiVersion=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ApiVersion)+"'\n");
    sb.append(" Description=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Description)+"'\n");
    sb.append(" DurableId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DurableId)+"'\n");
    sb.append(" IsAvailableInTouch=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsAvailableInTouch)+"'\n");
    sb.append(" MasterLabel=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MasterLabel)+"'\n");
    sb.append(" Name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");
    sb.append(" NameSpacePrefix=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NameSpacePrefix)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}