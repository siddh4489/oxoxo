package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class RenderEmailTemplateError implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public RenderEmailTemplateError() {
  }
    
  
  /**
   * element  : fieldName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo fieldName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","fieldName","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean fieldName__is_set = false;

  private java.lang.String fieldName;

  public java.lang.String getFieldName() {
    return fieldName;
  }

  

  public void setFieldName(java.lang.String fieldName) {
    this.fieldName = fieldName;
    fieldName__is_set = true;
  }
  
  /**
   * element  : message of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo message__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","message","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean message__is_set = false;

  private java.lang.String message;

  public java.lang.String getMessage() {
    return message;
  }

  

  public void setMessage(java.lang.String message) {
    this.message = message;
    message__is_set = true;
  }
  
  /**
   * element  : offset of type {http://www.w3.org/2001/XMLSchema}int
   * java type: int
   */
  private static final com.sforce.ws.bind.TypeInfo offset__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","offset","http://www.w3.org/2001/XMLSchema","int",1,1,true);

  private boolean offset__is_set = false;

  private int offset;

  public int getOffset() {
    return offset;
  }

  

  public void setOffset(int offset) {
    this.offset = offset;
    offset__is_set = true;
  }
  
  /**
   * element  : statusCode of type {urn:enterprise.soap.sforce.com}StatusCode
   * java type: com.sforce.soap.enterprise.StatusCode
   */
  private static final com.sforce.ws.bind.TypeInfo statusCode__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","statusCode","urn:enterprise.soap.sforce.com","StatusCode",1,1,true);

  private boolean statusCode__is_set = false;

  private com.sforce.soap.enterprise.StatusCode statusCode;

  public com.sforce.soap.enterprise.StatusCode getStatusCode() {
    return statusCode;
  }

  

  public void setStatusCode(com.sforce.soap.enterprise.StatusCode statusCode) {
    this.statusCode = statusCode;
    statusCode__is_set = true;
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
   
    __typeMapper.writeString(__out, fieldName__typeInfo, fieldName, fieldName__is_set);
    __typeMapper.writeString(__out, message__typeInfo, message, message__is_set);
    __typeMapper.writeInt(__out, offset__typeInfo, offset, offset__is_set);
    __typeMapper.writeObject(__out, statusCode__typeInfo, statusCode, statusCode__is_set);
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
    if (__typeMapper.verifyElement(__in, fieldName__typeInfo)) {
      setFieldName((java.lang.String)__typeMapper.readString(__in, fieldName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, message__typeInfo)) {
      setMessage((java.lang.String)__typeMapper.readString(__in, message__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, offset__typeInfo)) {
      setOffset((int)__typeMapper.readInt(__in, offset__typeInfo, int.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, statusCode__typeInfo)) {
      setStatusCode((com.sforce.soap.enterprise.StatusCode)__typeMapper.readObject(__in, statusCode__typeInfo, com.sforce.soap.enterprise.StatusCode.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[RenderEmailTemplateError ");
    
    sb.append(" fieldName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(fieldName)+"'\n");
    sb.append(" message=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(message)+"'\n");
    sb.append(" offset=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(offset)+"'\n");
    sb.append(" statusCode=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(statusCode)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}