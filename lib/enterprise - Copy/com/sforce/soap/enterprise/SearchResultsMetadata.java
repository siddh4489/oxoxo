package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class SearchResultsMetadata implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public SearchResultsMetadata() {
  }
    
  
  /**
   * element  : entityLabelMetadata of type {urn:enterprise.soap.sforce.com}LabelsSearchMetadata
   * java type: com.sforce.soap.enterprise.LabelsSearchMetadata[]
   */
  private static final com.sforce.ws.bind.TypeInfo entityLabelMetadata__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","entityLabelMetadata","urn:enterprise.soap.sforce.com","LabelsSearchMetadata",0,-1,true);

  private boolean entityLabelMetadata__is_set = false;

  private com.sforce.soap.enterprise.LabelsSearchMetadata[] entityLabelMetadata = new com.sforce.soap.enterprise.LabelsSearchMetadata[0];

  public com.sforce.soap.enterprise.LabelsSearchMetadata[] getEntityLabelMetadata() {
    return entityLabelMetadata;
  }

  

  public void setEntityLabelMetadata(com.sforce.soap.enterprise.LabelsSearchMetadata[] entityLabelMetadata) {
    this.entityLabelMetadata = entityLabelMetadata;
    entityLabelMetadata__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   
    __typeMapper.writeObject(__out, entityLabelMetadata__typeInfo, entityLabelMetadata, entityLabelMetadata__is_set);
  }


  public void load(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
    __typeMapper.consumeStartTag(__in);
    loadFields(__in, __typeMapper);
    __typeMapper.consumeEndTag(__in);
  }

  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
   
    __in.peekTag();
    if (__typeMapper.isElement(__in, entityLabelMetadata__typeInfo)) {
      setEntityLabelMetadata((com.sforce.soap.enterprise.LabelsSearchMetadata[])__typeMapper.readObject(__in, entityLabelMetadata__typeInfo, com.sforce.soap.enterprise.LabelsSearchMetadata[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[SearchResultsMetadata ");
    
    sb.append(" entityLabelMetadata=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(entityLabelMetadata)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}