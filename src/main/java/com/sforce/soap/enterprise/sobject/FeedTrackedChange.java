package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class FeedTrackedChange extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public FeedTrackedChange() {
  }
    
  
  /**
   * element  : FeedItemId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo FeedItemId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FeedItemId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean FeedItemId__is_set = false;

  private java.lang.String FeedItemId;

  public java.lang.String getFeedItemId() {
    return FeedItemId;
  }

  

  public void setFeedItemId(java.lang.String FeedItemId) {
    this.FeedItemId = FeedItemId;
    FeedItemId__is_set = true;
  }
  
  /**
   * element  : FieldName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo FieldName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FieldName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean FieldName__is_set = false;

  private java.lang.String FieldName;

  public java.lang.String getFieldName() {
    return FieldName;
  }

  

  public void setFieldName(java.lang.String FieldName) {
    this.FieldName = FieldName;
    FieldName__is_set = true;
  }
  
  /**
   * element  : NewValue of type {http://www.w3.org/2001/XMLSchema}anyType
   * java type: java.lang.Object
   */
  private static final com.sforce.ws.bind.TypeInfo NewValue__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","NewValue","http://www.w3.org/2001/XMLSchema","anyType",0,1,true);

  private boolean NewValue__is_set = false;

  private java.lang.Object NewValue;

  public java.lang.Object getNewValue() {
    return NewValue;
  }

  

  public void setNewValue(java.lang.Object NewValue) {
    this.NewValue = NewValue;
    NewValue__is_set = true;
  }
  
  /**
   * element  : OldValue of type {http://www.w3.org/2001/XMLSchema}anyType
   * java type: java.lang.Object
   */
  private static final com.sforce.ws.bind.TypeInfo OldValue__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OldValue","http://www.w3.org/2001/XMLSchema","anyType",0,1,true);

  private boolean OldValue__is_set = false;

  private java.lang.Object OldValue;

  public java.lang.Object getOldValue() {
    return OldValue;
  }

  

  public void setOldValue(java.lang.Object OldValue) {
    this.OldValue = OldValue;
    OldValue__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "FeedTrackedChange");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, FeedItemId__typeInfo, FeedItemId, FeedItemId__is_set);
    __typeMapper.writeString(__out, FieldName__typeInfo, FieldName, FieldName__is_set);
    __typeMapper.writeObject(__out, NewValue__typeInfo, NewValue, NewValue__is_set);
    __typeMapper.writeObject(__out, OldValue__typeInfo, OldValue, OldValue__is_set);
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
    if (__typeMapper.isElement(__in, FeedItemId__typeInfo)) {
      setFeedItemId((java.lang.String)__typeMapper.readString(__in, FeedItemId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FieldName__typeInfo)) {
      setFieldName((java.lang.String)__typeMapper.readString(__in, FieldName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, NewValue__typeInfo)) {
      setNewValue((java.lang.Object)__typeMapper.readObject(__in, NewValue__typeInfo, java.lang.Object.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OldValue__typeInfo)) {
      setOldValue((java.lang.Object)__typeMapper.readObject(__in, OldValue__typeInfo, java.lang.Object.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[FeedTrackedChange ");
    sb.append(super.toString());
    sb.append(" FeedItemId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FeedItemId)+"'\n");
    sb.append(" FieldName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FieldName)+"'\n");
    sb.append(" NewValue=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NewValue)+"'\n");
    sb.append(" OldValue=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OldValue)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}