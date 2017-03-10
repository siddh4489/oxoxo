package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class SoqlConditionGroup extends com.sforce.soap.enterprise.SoqlWhereCondition {
  /**
   * Constructor
   */
  public SoqlConditionGroup() {
  }
    
  
  /**
   * element  : conditions of type {urn:enterprise.soap.sforce.com}SoqlWhereCondition
   * java type: com.sforce.soap.enterprise.SoqlWhereCondition[]
   */
  private static final com.sforce.ws.bind.TypeInfo conditions__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","conditions","urn:enterprise.soap.sforce.com","SoqlWhereCondition",0,-1,true);

  private boolean conditions__is_set = false;

  private com.sforce.soap.enterprise.SoqlWhereCondition[] conditions = new com.sforce.soap.enterprise.SoqlWhereCondition[0];

  public com.sforce.soap.enterprise.SoqlWhereCondition[] getConditions() {
    return conditions;
  }

  

  public void setConditions(com.sforce.soap.enterprise.SoqlWhereCondition[] conditions) {
    this.conditions = conditions;
    conditions__is_set = true;
  }
  
  /**
   * element  : conjunction of type {urn:enterprise.soap.sforce.com}soqlConjunction
   * java type: com.sforce.soap.enterprise.SoqlConjunction
   */
  private static final com.sforce.ws.bind.TypeInfo conjunction__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","conjunction","urn:enterprise.soap.sforce.com","soqlConjunction",1,1,true);

  private boolean conjunction__is_set = false;

  private com.sforce.soap.enterprise.SoqlConjunction conjunction;

  public com.sforce.soap.enterprise.SoqlConjunction getConjunction() {
    return conjunction;
  }

  

  public void setConjunction(com.sforce.soap.enterprise.SoqlConjunction conjunction) {
    this.conjunction = conjunction;
    conjunction__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:enterprise.soap.sforce.com", "SoqlConditionGroup");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, conditions__typeInfo, conditions, conditions__is_set);
    __typeMapper.writeObject(__out, conjunction__typeInfo, conjunction, conjunction__is_set);
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
    if (__typeMapper.isElement(__in, conditions__typeInfo)) {
      setConditions((com.sforce.soap.enterprise.SoqlWhereCondition[])__typeMapper.readObject(__in, conditions__typeInfo, com.sforce.soap.enterprise.SoqlWhereCondition[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, conjunction__typeInfo)) {
      setConjunction((com.sforce.soap.enterprise.SoqlConjunction)__typeMapper.readObject(__in, conjunction__typeInfo, com.sforce.soap.enterprise.SoqlConjunction.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[SoqlConditionGroup ");
    sb.append(super.toString());
    sb.append(" conditions=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(conditions)+"'\n");
    sb.append(" conjunction=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(conjunction)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}