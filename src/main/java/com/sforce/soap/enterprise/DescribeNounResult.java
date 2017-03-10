package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class DescribeNounResult implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public DescribeNounResult() {
  }
    
  
  /**
   * element  : caseValues of type {urn:enterprise.soap.sforce.com}NameCaseValue
   * java type: com.sforce.soap.enterprise.NameCaseValue[]
   */
  private static final com.sforce.ws.bind.TypeInfo caseValues__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","caseValues","urn:enterprise.soap.sforce.com","NameCaseValue",0,-1,true);

  private boolean caseValues__is_set = false;

  private com.sforce.soap.enterprise.NameCaseValue[] caseValues = new com.sforce.soap.enterprise.NameCaseValue[0];

  public com.sforce.soap.enterprise.NameCaseValue[] getCaseValues() {
    return caseValues;
  }

  

  public void setCaseValues(com.sforce.soap.enterprise.NameCaseValue[] caseValues) {
    this.caseValues = caseValues;
    caseValues__is_set = true;
  }
  
  /**
   * element  : developerName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo developerName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","developerName","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean developerName__is_set = false;

  private java.lang.String developerName;

  public java.lang.String getDeveloperName() {
    return developerName;
  }

  

  public void setDeveloperName(java.lang.String developerName) {
    this.developerName = developerName;
    developerName__is_set = true;
  }
  
  /**
   * element  : gender of type {urn:enterprise.soap.sforce.com}Gender
   * java type: com.sforce.soap.enterprise.Gender
   */
  private static final com.sforce.ws.bind.TypeInfo gender__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","gender","urn:enterprise.soap.sforce.com","Gender",1,1,true);

  private boolean gender__is_set = false;

  private com.sforce.soap.enterprise.Gender gender;

  public com.sforce.soap.enterprise.Gender getGender() {
    return gender;
  }

  

  public void setGender(com.sforce.soap.enterprise.Gender gender) {
    this.gender = gender;
    gender__is_set = true;
  }
  
  /**
   * element  : name of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo name__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","name","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean name__is_set = false;

  private java.lang.String name;

  public java.lang.String getName() {
    return name;
  }

  

  public void setName(java.lang.String name) {
    this.name = name;
    name__is_set = true;
  }
  
  /**
   * element  : pluralAlias of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo pluralAlias__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","pluralAlias","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean pluralAlias__is_set = false;

  private java.lang.String pluralAlias;

  public java.lang.String getPluralAlias() {
    return pluralAlias;
  }

  

  public void setPluralAlias(java.lang.String pluralAlias) {
    this.pluralAlias = pluralAlias;
    pluralAlias__is_set = true;
  }
  
  /**
   * element  : startsWith of type {urn:enterprise.soap.sforce.com}StartsWith
   * java type: com.sforce.soap.enterprise.StartsWith
   */
  private static final com.sforce.ws.bind.TypeInfo startsWith__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","startsWith","urn:enterprise.soap.sforce.com","StartsWith",1,1,true);

  private boolean startsWith__is_set = false;

  private com.sforce.soap.enterprise.StartsWith startsWith;

  public com.sforce.soap.enterprise.StartsWith getStartsWith() {
    return startsWith;
  }

  

  public void setStartsWith(com.sforce.soap.enterprise.StartsWith startsWith) {
    this.startsWith = startsWith;
    startsWith__is_set = true;
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
   
    __typeMapper.writeObject(__out, caseValues__typeInfo, caseValues, caseValues__is_set);
    __typeMapper.writeString(__out, developerName__typeInfo, developerName, developerName__is_set);
    __typeMapper.writeObject(__out, gender__typeInfo, gender, gender__is_set);
    __typeMapper.writeString(__out, name__typeInfo, name, name__is_set);
    __typeMapper.writeString(__out, pluralAlias__typeInfo, pluralAlias, pluralAlias__is_set);
    __typeMapper.writeObject(__out, startsWith__typeInfo, startsWith, startsWith__is_set);
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
    if (__typeMapper.isElement(__in, caseValues__typeInfo)) {
      setCaseValues((com.sforce.soap.enterprise.NameCaseValue[])__typeMapper.readObject(__in, caseValues__typeInfo, com.sforce.soap.enterprise.NameCaseValue[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, developerName__typeInfo)) {
      setDeveloperName((java.lang.String)__typeMapper.readString(__in, developerName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, gender__typeInfo)) {
      setGender((com.sforce.soap.enterprise.Gender)__typeMapper.readObject(__in, gender__typeInfo, com.sforce.soap.enterprise.Gender.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, name__typeInfo)) {
      setName((java.lang.String)__typeMapper.readString(__in, name__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, pluralAlias__typeInfo)) {
      setPluralAlias((java.lang.String)__typeMapper.readString(__in, pluralAlias__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, startsWith__typeInfo)) {
      setStartsWith((com.sforce.soap.enterprise.StartsWith)__typeMapper.readObject(__in, startsWith__typeInfo, com.sforce.soap.enterprise.StartsWith.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeNounResult ");
    
    sb.append(" caseValues=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(caseValues)+"'\n");
    sb.append(" developerName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(developerName)+"'\n");
    sb.append(" gender=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(gender)+"'\n");
    sb.append(" name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(name)+"'\n");
    sb.append(" pluralAlias=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(pluralAlias)+"'\n");
    sb.append(" startsWith=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(startsWith)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}