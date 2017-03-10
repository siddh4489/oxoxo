package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class CustomBrandAsset extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public CustomBrandAsset() {
  }
    
  
  /**
   * element  : AssetCategory of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AssetCategory__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AssetCategory","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean AssetCategory__is_set = false;

  private java.lang.String AssetCategory;

  public java.lang.String getAssetCategory() {
    return AssetCategory;
  }

  

  public void setAssetCategory(java.lang.String AssetCategory) {
    this.AssetCategory = AssetCategory;
    AssetCategory__is_set = true;
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
   * element  : CustomBrand of type {urn:sobject.enterprise.soap.sforce.com}CustomBrand
   * java type: com.sforce.soap.enterprise.sobject.CustomBrand
   */
  private static final com.sforce.ws.bind.TypeInfo CustomBrand__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CustomBrand","urn:sobject.enterprise.soap.sforce.com","CustomBrand",0,1,true);

  private boolean CustomBrand__is_set = false;

  private com.sforce.soap.enterprise.sobject.CustomBrand CustomBrand;

  public com.sforce.soap.enterprise.sobject.CustomBrand getCustomBrand() {
    return CustomBrand;
  }

  

  public void setCustomBrand(com.sforce.soap.enterprise.sobject.CustomBrand CustomBrand) {
    this.CustomBrand = CustomBrand;
    CustomBrand__is_set = true;
  }
  
  /**
   * element  : CustomBrandId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CustomBrandId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CustomBrandId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean CustomBrandId__is_set = false;

  private java.lang.String CustomBrandId;

  public java.lang.String getCustomBrandId() {
    return CustomBrandId;
  }

  

  public void setCustomBrandId(java.lang.String CustomBrandId) {
    this.CustomBrandId = CustomBrandId;
    CustomBrandId__is_set = true;
  }
  
  /**
   * element  : ForeignKeyAssetId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ForeignKeyAssetId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ForeignKeyAssetId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ForeignKeyAssetId__is_set = false;

  private java.lang.String ForeignKeyAssetId;

  public java.lang.String getForeignKeyAssetId() {
    return ForeignKeyAssetId;
  }

  

  public void setForeignKeyAssetId(java.lang.String ForeignKeyAssetId) {
    this.ForeignKeyAssetId = ForeignKeyAssetId;
    ForeignKeyAssetId__is_set = true;
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
   * element  : TextAsset of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo TextAsset__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TextAsset","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean TextAsset__is_set = false;

  private java.lang.String TextAsset;

  public java.lang.String getTextAsset() {
    return TextAsset;
  }

  

  public void setTextAsset(java.lang.String TextAsset) {
    this.TextAsset = TextAsset;
    TextAsset__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "CustomBrandAsset");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, AssetCategory__typeInfo, AssetCategory, AssetCategory__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeObject(__out, CustomBrand__typeInfo, CustomBrand, CustomBrand__is_set);
    __typeMapper.writeString(__out, CustomBrandId__typeInfo, CustomBrandId, CustomBrandId__is_set);
    __typeMapper.writeString(__out, ForeignKeyAssetId__typeInfo, ForeignKeyAssetId, ForeignKeyAssetId__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeString(__out, TextAsset__typeInfo, TextAsset, TextAsset__is_set);
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
    if (__typeMapper.isElement(__in, AssetCategory__typeInfo)) {
      setAssetCategory((java.lang.String)__typeMapper.readString(__in, AssetCategory__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, CustomBrand__typeInfo)) {
      setCustomBrand((com.sforce.soap.enterprise.sobject.CustomBrand)__typeMapper.readObject(__in, CustomBrand__typeInfo, com.sforce.soap.enterprise.sobject.CustomBrand.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CustomBrandId__typeInfo)) {
      setCustomBrandId((java.lang.String)__typeMapper.readString(__in, CustomBrandId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ForeignKeyAssetId__typeInfo)) {
      setForeignKeyAssetId((java.lang.String)__typeMapper.readString(__in, ForeignKeyAssetId__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, TextAsset__typeInfo)) {
      setTextAsset((java.lang.String)__typeMapper.readString(__in, TextAsset__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[CustomBrandAsset ");
    sb.append(super.toString());
    sb.append(" AssetCategory=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AssetCategory)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" CustomBrand=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CustomBrand)+"'\n");
    sb.append(" CustomBrandId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CustomBrandId)+"'\n");
    sb.append(" ForeignKeyAssetId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ForeignKeyAssetId)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" TextAsset=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TextAsset)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}