/*
 * Copyright (c) 2026 North Dakota State University
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**

 * CampusGroupsStub.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.1
 */
package edu.ndsu.eci.midpoint.campus_groups_connector.stub;

public class CampusGroupsStub extends org.apache.axis2.client.Stub {
  protected org.apache.axis2.description.AxisOperation[] _operations;

  // hashmaps to keep the fault mapping
  private java.util.Map<org.apache.axis2.client.FaultMapKey, java.lang.String>
          faultExceptionNameMap =
          new java.util.HashMap<org.apache.axis2.client.FaultMapKey, java.lang.String>();
  private java.util.Map<org.apache.axis2.client.FaultMapKey, java.lang.String>
          faultExceptionClassNameMap =
          new java.util.HashMap<org.apache.axis2.client.FaultMapKey, java.lang.String>();
  private java.util.Map<org.apache.axis2.client.FaultMapKey, java.lang.String> faultMessageMap =
          new java.util.HashMap<org.apache.axis2.client.FaultMapKey, java.lang.String>();

  private static int counter = 0;

  private static synchronized java.lang.String getUniqueSuffix() {
    // reset the counter if it is greater than 99999
    if (counter > 99999) {
      counter = 0;
    }
    counter = counter + 1;
    return java.lang.Long.toString(java.lang.System.currentTimeMillis()) + "_" + counter;
  }

  private void populateAxisService() throws org.apache.axis2.AxisFault {

    // creating the Service with a unique name
    _service = new org.apache.axis2.description.AxisService("CampusGroups" + getUniqueSuffix());
    addAnonymousOperations();

    // creating the operations
    org.apache.axis2.description.AxisOperation __operation;

    _operations = new org.apache.axis2.description.AxisOperation[8];

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
            new javax.xml.namespace.QName("http://campusgroups.com/", "createRoomReservation"));
    _service.addOperation(__operation);

    _operations[0] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
            new javax.xml.namespace.QName("http://campusgroups.com/", "createUpdateTransaction"));
    _service.addOperation(__operation);

    _operations[1] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
            new javax.xml.namespace.QName("http://campusgroups.com/", "createUpdateEvent"));
    _service.addOperation(__operation);

    _operations[2] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
            new javax.xml.namespace.QName("http://campusgroups.com/", "createUpdateUser"));
    _service.addOperation(__operation);

    _operations[3] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
            new javax.xml.namespace.QName("http://campusgroups.com/", "createUpdateWorkExperience"));
    _service.addOperation(__operation);

    _operations[4] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
            new javax.xml.namespace.QName(
                    "http://campusgroups.com/", "createUpdateAcademicExperience"));
    _service.addOperation(__operation);

    _operations[5] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
            new javax.xml.namespace.QName("http://campusgroups.com/", "createUpdateMember"));
    _service.addOperation(__operation);

    _operations[6] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
            new javax.xml.namespace.QName("http://campusgroups.com/", "cancelRoomReservation"));
    _service.addOperation(__operation);

    _operations[7] = __operation;
  }

  // populates the faults
  private void populateFaults() {
  }

  /**
   * Constructor that takes in a configContext
   */
  public CampusGroupsStub(
          org.apache.axis2.context.ConfigurationContext configurationContext,
          java.lang.String targetEndpoint)
          throws org.apache.axis2.AxisFault {
    this(configurationContext, targetEndpoint, false);
  }

  /**
   * Constructor that takes in a configContext and useseperate listner
   */
  public CampusGroupsStub(
          org.apache.axis2.context.ConfigurationContext configurationContext,
          java.lang.String targetEndpoint,
          boolean useSeparateListener)
          throws org.apache.axis2.AxisFault {
    // To populate AxisService
    populateAxisService();
    populateFaults();

    _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext, _service);

    _serviceClient
            .getOptions()
            .setTo(new org.apache.axis2.addressing.EndpointReference(targetEndpoint));
    _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);

    // Set the soap version
    _serviceClient
            .getOptions()
            .setSoapVersionURI(org.apache.axiom.soap.SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);
  }

  /**
   * Default Constructor
   */
  public CampusGroupsStub(org.apache.axis2.context.ConfigurationContext configurationContext)
          throws org.apache.axis2.AxisFault {

    this(configurationContext, "https://ndsu.campusgroups.com/WebServices/campusgroups.asmx");
  }

  /**
   * Default Constructor
   */
  public CampusGroupsStub() throws org.apache.axis2.AxisFault {

    this("https://ndsu.campusgroups.com/WebServices/campusgroups.asmx");
  }

  /**
   * Constructor taking the target endpoint
   */
  public CampusGroupsStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
    this(null, targetEndpoint);
  }

  /**
   * Auto generated method signature
   *
   * @param createRoomReservation
   */
  public CreateRoomReservationResponse createRoomReservation(
          CreateRoomReservation createRoomReservation)
          throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
            new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
              _serviceClient.createClient(_operations[0].getName());
      _operationClient.getOptions().setAction("http://campusgroups.com/CreateRoomReservation");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
              _operationClient,
              org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
              "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
              toEnvelope(
                      getFactory(_operationClient.getOptions().getSoapVersionURI()),
                      createRoomReservation,
                      optimizeContent(
                              new javax.xml.namespace.QName(
                                      "http://campusgroups.com/", "createRoomReservation")),
                      new javax.xml.namespace.QName("http://campusgroups.com/", "CreateRoomReservation"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
              _operationClient.getMessageContext(
                      org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
              fromOM(
                      _returnEnv.getBody().getFirstElement(),
                      CreateRoomReservationResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (CreateRoomReservationResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
                new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "CreateRoomReservation"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                    faultExceptionClassNameMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "CreateRoomReservation"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                    exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                    faultMessageMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "CreateRoomReservation"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                    exceptionClass.getMethod("setFaultMessage", new java.lang.Class[]{messageClass});
            m.invoke(ex, new java.lang.Object[]{messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @param createUpdateTransaction
   */
  public CreateUpdateTransactionResponse createUpdateTransaction(
          CreateUpdateTransaction createUpdateTransaction)
          throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
            new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
              _serviceClient.createClient(_operations[1].getName());
      _operationClient.getOptions().setAction("http://campusgroups.com/CreateUpdateTransaction");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
              _operationClient,
              org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
              "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
              toEnvelope(
                      getFactory(_operationClient.getOptions().getSoapVersionURI()),
                      createUpdateTransaction,
                      optimizeContent(
                              new javax.xml.namespace.QName(
                                      "http://campusgroups.com/", "createUpdateTransaction")),
                      new javax.xml.namespace.QName("http://campusgroups.com/", "CreateUpdateTransaction"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
              _operationClient.getMessageContext(
                      org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
              fromOM(
                      _returnEnv.getBody().getFirstElement(),
                      CreateUpdateTransactionResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (CreateUpdateTransactionResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
                new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "CreateUpdateTransaction"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                    faultExceptionClassNameMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "CreateUpdateTransaction"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                    exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                    faultMessageMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "CreateUpdateTransaction"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                    exceptionClass.getMethod("setFaultMessage", new java.lang.Class[]{messageClass});
            m.invoke(ex, new java.lang.Object[]{messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @param createUpdateEvent
   */
  public CreateUpdateEventResponse createUpdateEvent(
          CreateUpdateEvent createUpdateEvent)
          throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
            new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
              _serviceClient.createClient(_operations[2].getName());
      _operationClient.getOptions().setAction("http://campusgroups.com/CreateUpdateEvent");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
              _operationClient,
              org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
              "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
              toEnvelope(
                      getFactory(_operationClient.getOptions().getSoapVersionURI()),
                      createUpdateEvent,
                      optimizeContent(
                              new javax.xml.namespace.QName("http://campusgroups.com/", "createUpdateEvent")),
                      new javax.xml.namespace.QName("http://campusgroups.com/", "CreateUpdateEvent"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
              _operationClient.getMessageContext(
                      org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
              fromOM(
                      _returnEnv.getBody().getFirstElement(),
                      CreateUpdateEventResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (CreateUpdateEventResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
                new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "CreateUpdateEvent"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                    faultExceptionClassNameMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "CreateUpdateEvent"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                    exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                    faultMessageMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "CreateUpdateEvent"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                    exceptionClass.getMethod("setFaultMessage", new java.lang.Class[]{messageClass});
            m.invoke(ex, new java.lang.Object[]{messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @param createUpdateUser
   */
  public CreateUpdateUserResponse createUpdateUser(
          CreateUpdateUser createUpdateUser)
          throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
            new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
              _serviceClient.createClient(_operations[3].getName());
      _operationClient.getOptions().setAction("http://campusgroups.com/CreateUpdateUser");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
              _operationClient,
              org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
              "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
              toEnvelope(
                      getFactory(_operationClient.getOptions().getSoapVersionURI()),
                      createUpdateUser,
                      optimizeContent(
                              new javax.xml.namespace.QName("http://campusgroups.com/", "createUpdateUser")),
                      new javax.xml.namespace.QName("http://campusgroups.com/", "CreateUpdateUser"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
              _operationClient.getMessageContext(
                      org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
              fromOM(
                      _returnEnv.getBody().getFirstElement(),
                      CreateUpdateUserResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (CreateUpdateUserResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
                new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "CreateUpdateUser"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                    faultExceptionClassNameMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "CreateUpdateUser"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                    exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                    faultMessageMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "CreateUpdateUser"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                    exceptionClass.getMethod("setFaultMessage", new java.lang.Class[]{messageClass});
            m.invoke(ex, new java.lang.Object[]{messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @param createUpdateWorkExperience
   */
  public CreateUpdateWorkExperienceResponse
  createUpdateWorkExperience(
          CreateUpdateWorkExperience createUpdateWorkExperience)
          throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
            new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
              _serviceClient.createClient(_operations[4].getName());
      _operationClient.getOptions().setAction("http://campusgroups.com/CreateUpdateWorkExperience");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
              _operationClient,
              org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
              "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
              toEnvelope(
                      getFactory(_operationClient.getOptions().getSoapVersionURI()),
                      createUpdateWorkExperience,
                      optimizeContent(
                              new javax.xml.namespace.QName(
                                      "http://campusgroups.com/", "createUpdateWorkExperience")),
                      new javax.xml.namespace.QName(
                              "http://campusgroups.com/", "CreateUpdateWorkExperience"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
              _operationClient.getMessageContext(
                      org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
              fromOM(
                      _returnEnv.getBody().getFirstElement(),
                      CreateUpdateWorkExperienceResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (CreateUpdateWorkExperienceResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
                new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "CreateUpdateWorkExperience"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                    faultExceptionClassNameMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "CreateUpdateWorkExperience"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                    exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                    faultMessageMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "CreateUpdateWorkExperience"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                    exceptionClass.getMethod("setFaultMessage", new java.lang.Class[]{messageClass});
            m.invoke(ex, new java.lang.Object[]{messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @param createUpdateAcademicExperience
   */
  public CreateUpdateAcademicExperienceResponse
  createUpdateAcademicExperience(
          CreateUpdateAcademicExperience
                  createUpdateAcademicExperience)
          throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
            new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
              _serviceClient.createClient(_operations[5].getName());
      _operationClient
              .getOptions()
              .setAction("http://campusgroups.com/CreateUpdateAcademicExperience");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
              _operationClient,
              org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
              "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
              toEnvelope(
                      getFactory(_operationClient.getOptions().getSoapVersionURI()),
                      createUpdateAcademicExperience,
                      optimizeContent(
                              new javax.xml.namespace.QName(
                                      "http://campusgroups.com/", "createUpdateAcademicExperience")),
                      new javax.xml.namespace.QName(
                              "http://campusgroups.com/", "CreateUpdateAcademicExperience"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
              _operationClient.getMessageContext(
                      org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
              fromOM(
                      _returnEnv.getBody().getFirstElement(),
                      CreateUpdateAcademicExperienceResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (CreateUpdateAcademicExperienceResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
                new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "CreateUpdateAcademicExperience"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                    faultExceptionClassNameMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "CreateUpdateAcademicExperience"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                    exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                    faultMessageMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "CreateUpdateAcademicExperience"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                    exceptionClass.getMethod("setFaultMessage", new java.lang.Class[]{messageClass});
            m.invoke(ex, new java.lang.Object[]{messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @param createUpdateMember
   */
  public CreateUpdateMemberResponse createUpdateMember(
          CreateUpdateMember createUpdateMember)
          throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
            new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
              _serviceClient.createClient(_operations[6].getName());
      _operationClient.getOptions().setAction("http://campusgroups.com/CreateUpdateMember");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
              _operationClient,
              org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
              "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
              toEnvelope(
                      getFactory(_operationClient.getOptions().getSoapVersionURI()),
                      createUpdateMember,
                      optimizeContent(
                              new javax.xml.namespace.QName("http://campusgroups.com/", "createUpdateMember")),
                      new javax.xml.namespace.QName("http://campusgroups.com/", "CreateUpdateMember"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
              _operationClient.getMessageContext(
                      org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
              fromOM(
                      _returnEnv.getBody().getFirstElement(),
                      CreateUpdateMemberResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (CreateUpdateMemberResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
                new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "CreateUpdateMember"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                    faultExceptionClassNameMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "CreateUpdateMember"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                    exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                    faultMessageMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "CreateUpdateMember"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                    exceptionClass.getMethod("setFaultMessage", new java.lang.Class[]{messageClass});
            m.invoke(ex, new java.lang.Object[]{messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @param cancelRoomReservation
   */
  public CancelRoomReservationResponse cancelRoomReservation(
          CancelRoomReservation cancelRoomReservation)
          throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
            new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
              _serviceClient.createClient(_operations[7].getName());
      _operationClient.getOptions().setAction("http://campusgroups.com/CancelRoomReservation");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
              _operationClient,
              org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
              "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
              toEnvelope(
                      getFactory(_operationClient.getOptions().getSoapVersionURI()),
                      cancelRoomReservation,
                      optimizeContent(
                              new javax.xml.namespace.QName(
                                      "http://campusgroups.com/", "cancelRoomReservation")),
                      new javax.xml.namespace.QName("http://campusgroups.com/", "CancelRoomReservation"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
              _operationClient.getMessageContext(
                      org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
              fromOM(
                      _returnEnv.getBody().getFirstElement(),
                      CancelRoomReservationResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (CancelRoomReservationResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
                new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "CancelRoomReservation"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                    faultExceptionClassNameMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "CancelRoomReservation"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                    exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                    faultMessageMap.get(
                            new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "CancelRoomReservation"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                    exceptionClass.getMethod("setFaultMessage", new java.lang.Class[]{messageClass});
            m.invoke(ex, new java.lang.Object[]{messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  private javax.xml.namespace.QName[] opNameArray = null;

  private boolean optimizeContent(javax.xml.namespace.QName opName) {

    if (opNameArray == null) {
      return false;
    }
    for (int i = 0; i < opNameArray.length; i++) {
      if (opName.equals(opNameArray[i])) {
        return true;
      }
    }
    return false;
  }

  // https://ndsu.campusgroups.com/WebServices/campusgroups.asmx
  public static class CancelRoomReservationResponse
          implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
            new javax.xml.namespace.QName(
                    "http://campusgroups.com/", "CancelRoomReservationResponse", "ns1");

    /**
     * field for CancelRoomReservationResult
     */
    protected APIExperienceResult localCancelRoomReservationResult;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCancelRoomReservationResultTracker = false;

    public boolean isCancelRoomReservationResultSpecified() {
      return localCancelRoomReservationResultTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return APIExperienceResult
     */
    public APIExperienceResult getCancelRoomReservationResult() {
      return localCancelRoomReservationResult;
    }

    /**
     * Auto generated setter method
     *
     * @param param CancelRoomReservationResult
     */
    public void setCancelRoomReservationResult(APIExperienceResult param) {
      localCancelRoomReservationResultTracker = param != null;

      this.localCancelRoomReservationResult = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
              new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
            final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
            final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter,
            boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://campusgroups.com/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
                  "xsi",
                  "http://www.w3.org/2001/XMLSchema-instance",
                  "type",
                  namespacePrefix + ":CancelRoomReservationResponse",
                  xmlWriter);
        } else {
          writeAttribute(
                  "xsi",
                  "http://www.w3.org/2001/XMLSchema-instance",
                  "type",
                  "CancelRoomReservationResponse",
                  xmlWriter);
        }
      }
      if (localCancelRoomReservationResultTracker) {
        if (localCancelRoomReservationResult == null) {
          throw new org.apache.axis2.databinding.ADBException(
                  "CancelRoomReservationResult cannot be null!!");
        }
        localCancelRoomReservationResult.serialize(
                new javax.xml.namespace.QName(
                        "http://campusgroups.com/", "CancelRoomReservationResult"),
                xmlWriter);
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://campusgroups.com/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(
            java.lang.String prefix,
            java.lang.String namespace,
            java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(
            java.lang.String prefix,
            java.lang.String namespace,
            java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(
            java.lang.String namespace,
            java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
                registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(
            java.lang.String namespace,
            java.lang.String attName,
            javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /**
     * method to handle Qnames
     */
    private void writeQName(
            javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
                  prefix
                          + ":"
                          + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
            javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                      .append(prefix)
                      .append(":")
                      .append(
                              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /**
     * Factory class that keeps the parse method
     */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
              org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static CancelRoomReservationResponse parse(javax.xml.stream.XMLStreamReader reader)
              throws java.lang.Exception {
        CancelRoomReservationResponse object = new CancelRoomReservationResponse();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
                  != null) {
            java.lang.String fullTypeName =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"CancelRoomReservationResponse".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (CancelRoomReservationResponse)
                        ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName(
                  "http://campusgroups.com/", "CancelRoomReservationResult")
                  .equals(reader.getName())) {

            object.setCancelRoomReservationResult(APIExperienceResult.Factory.parse(reader));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class APIMemberResult implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
    name = APIMemberResult
    Namespace URI = http://campusgroups.com/
    Namespace Prefix = ns1
    */

    /**
     * field for Cg_id
     */
    protected int localCg_id;

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getCg_id() {
      return localCg_id;
    }

    /**
     * Auto generated setter method
     *
     * @param param Cg_id
     */
    public void setCg_id(int param) {

      this.localCg_id = param;
    }

    /**
     * field for Cg_member_id
     */
    protected int localCg_member_id;

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getCg_member_id() {
      return localCg_member_id;
    }

    /**
     * Auto generated setter method
     *
     * @param param Cg_member_id
     */
    public void setCg_member_id(int param) {

      this.localCg_member_id = param;
    }

    /**
     * field for Cg_group_id
     */
    protected int localCg_group_id;

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getCg_group_id() {
      return localCg_group_id;
    }

    /**
     * Auto generated setter method
     *
     * @param param Cg_group_id
     */
    public void setCg_group_id(int param) {

      this.localCg_group_id = param;
    }

    /**
     * field for Message_code
     */
    protected int localMessage_code;

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getMessage_code() {
      return localMessage_code;
    }

    /**
     * Auto generated setter method
     *
     * @param param Message_code
     */
    public void setMessage_code(int param) {

      this.localMessage_code = param;
    }

    /**
     * field for Message
     */
    protected java.lang.String localMessage;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMessageTracker = false;

    public boolean isMessageSpecified() {
      return localMessageTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getMessage() {
      return localMessage;
    }

    /**
     * Auto generated setter method
     *
     * @param param Message
     */
    public void setMessage(java.lang.String param) {
      localMessageTracker = param != null;

      this.localMessage = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
              new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
    }

    public void serialize(
            final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
            final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter,
            boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://campusgroups.com/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
                  "xsi",
                  "http://www.w3.org/2001/XMLSchema-instance",
                  "type",
                  namespacePrefix + ":APIMemberResult",
                  xmlWriter);
        } else {
          writeAttribute(
                  "xsi",
                  "http://www.w3.org/2001/XMLSchema-instance",
                  "type",
                  "APIMemberResult",
                  xmlWriter);
        }
      }

      namespace = "http://campusgroups.com/";
      writeStartElement(null, namespace, "cg_id", xmlWriter);

      if (localCg_id == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("cg_id cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCg_id));
      }

      xmlWriter.writeEndElement();

      namespace = "http://campusgroups.com/";
      writeStartElement(null, namespace, "cg_member_id", xmlWriter);

      if (localCg_member_id == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("cg_member_id cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCg_member_id));
      }

      xmlWriter.writeEndElement();

      namespace = "http://campusgroups.com/";
      writeStartElement(null, namespace, "cg_group_id", xmlWriter);

      if (localCg_group_id == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("cg_group_id cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCg_group_id));
      }

      xmlWriter.writeEndElement();

      namespace = "http://campusgroups.com/";
      writeStartElement(null, namespace, "message_code", xmlWriter);

      if (localMessage_code == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("message_code cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMessage_code));
      }

      xmlWriter.writeEndElement();
      if (localMessageTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "message", xmlWriter);

        if (localMessage == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("message cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localMessage);
        }

        xmlWriter.writeEndElement();
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://campusgroups.com/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(
            java.lang.String prefix,
            java.lang.String namespace,
            java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(
            java.lang.String prefix,
            java.lang.String namespace,
            java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(
            java.lang.String namespace,
            java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
                registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(
            java.lang.String namespace,
            java.lang.String attName,
            javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /**
     * method to handle Qnames
     */
    private void writeQName(
            javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
                  prefix
                          + ":"
                          + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
            javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                      .append(prefix)
                      .append(":")
                      .append(
                              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /**
     * Factory class that keeps the parse method
     */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
              org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static APIMemberResult parse(javax.xml.stream.XMLStreamReader reader)
              throws java.lang.Exception {
        APIMemberResult object = new APIMemberResult();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
                  != null) {
            java.lang.String fullTypeName =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"APIMemberResult".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (APIMemberResult) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "cg_id")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "cg_id" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setCg_id(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "cg_member_id")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "cg_member_id" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setCg_member_id(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "cg_group_id")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "cg_group_id" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setCg_group_id(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "message_code")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "message_code" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setMessage_code(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "message")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "message" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setMessage(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class ExtensionMapper {

    public static java.lang.Object getTypeObject(
            java.lang.String namespaceURI,
            java.lang.String typeName,
            javax.xml.stream.XMLStreamReader reader)
            throws java.lang.Exception {

      if ("http://campusgroups.com/".equals(namespaceURI)
              && "APIExperienceResult".equals(typeName)) {

        return APIExperienceResult.Factory.parse(reader);
      }

      if ("http://campusgroups.com/".equals(namespaceURI) && "APIMemberResult".equals(typeName)) {

        return APIMemberResult.Factory.parse(reader);
      }

      if ("http://campusgroups.com/".equals(namespaceURI) && "APIEventResult".equals(typeName)) {

        return APIEventResult.Factory.parse(reader);
      }

      if ("http://campusgroups.com/".equals(namespaceURI) && "custom_field".equals(typeName)) {

        return Custom_field.Factory.parse(reader);
      }

      if ("http://campusgroups.com/".equals(namespaceURI) && "APIUserResult".equals(typeName)) {

        return APIUserResult.Factory.parse(reader);
      }

      if ("http://campusgroups.com/".equals(namespaceURI)
              && "ArrayOfCustom_field".equals(typeName)) {

        return ArrayOfCustom_field.Factory.parse(reader);
      }

      if ("http://campusgroups.com/".equals(namespaceURI)
              && "APITransactionResult".equals(typeName)) {

        return APITransactionResult.Factory.parse(reader);
      }

      throw new org.apache.axis2.databinding.ADBException(
              "Unsupported type " + namespaceURI + " " + typeName);
    }
  }

  public static class CreateUpdateMemberResponse implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
            new javax.xml.namespace.QName(
                    "http://campusgroups.com/", "CreateUpdateMemberResponse", "ns1");

    /**
     * field for CreateUpdateMemberResult
     */
    protected APIMemberResult localCreateUpdateMemberResult;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCreateUpdateMemberResultTracker = false;

    public boolean isCreateUpdateMemberResultSpecified() {
      return localCreateUpdateMemberResultTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return APIMemberResult
     */
    public APIMemberResult getCreateUpdateMemberResult() {
      return localCreateUpdateMemberResult;
    }

    /**
     * Auto generated setter method
     *
     * @param param CreateUpdateMemberResult
     */
    public void setCreateUpdateMemberResult(APIMemberResult param) {
      localCreateUpdateMemberResultTracker = param != null;

      this.localCreateUpdateMemberResult = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
              new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
            final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
            final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter,
            boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://campusgroups.com/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
                  "xsi",
                  "http://www.w3.org/2001/XMLSchema-instance",
                  "type",
                  namespacePrefix + ":CreateUpdateMemberResponse",
                  xmlWriter);
        } else {
          writeAttribute(
                  "xsi",
                  "http://www.w3.org/2001/XMLSchema-instance",
                  "type",
                  "CreateUpdateMemberResponse",
                  xmlWriter);
        }
      }
      if (localCreateUpdateMemberResultTracker) {
        if (localCreateUpdateMemberResult == null) {
          throw new org.apache.axis2.databinding.ADBException(
                  "CreateUpdateMemberResult cannot be null!!");
        }
        localCreateUpdateMemberResult.serialize(
                new javax.xml.namespace.QName("http://campusgroups.com/", "CreateUpdateMemberResult"),
                xmlWriter);
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://campusgroups.com/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(
            java.lang.String prefix,
            java.lang.String namespace,
            java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(
            java.lang.String prefix,
            java.lang.String namespace,
            java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(
            java.lang.String namespace,
            java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
                registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(
            java.lang.String namespace,
            java.lang.String attName,
            javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /**
     * method to handle Qnames
     */
    private void writeQName(
            javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
                  prefix
                          + ":"
                          + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
            javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                      .append(prefix)
                      .append(":")
                      .append(
                              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /**
     * Factory class that keeps the parse method
     */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
              org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static CreateUpdateMemberResponse parse(javax.xml.stream.XMLStreamReader reader)
              throws java.lang.Exception {
        CreateUpdateMemberResponse object = new CreateUpdateMemberResponse();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
                  != null) {
            java.lang.String fullTypeName =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"CreateUpdateMemberResponse".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (CreateUpdateMemberResponse)
                        ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName(
                  "http://campusgroups.com/", "CreateUpdateMemberResult")
                  .equals(reader.getName())) {

            object.setCreateUpdateMemberResult(APIMemberResult.Factory.parse(reader));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class CreateUpdateUserResponse implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
            new javax.xml.namespace.QName(
                    "http://campusgroups.com/", "CreateUpdateUserResponse", "ns1");

    /**
     * field for CreateUpdateUserResult
     */
    protected APIUserResult localCreateUpdateUserResult;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCreateUpdateUserResultTracker = false;

    public boolean isCreateUpdateUserResultSpecified() {
      return localCreateUpdateUserResultTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return APIUserResult
     */
    public APIUserResult getCreateUpdateUserResult() {
      return localCreateUpdateUserResult;
    }

    /**
     * Auto generated setter method
     *
     * @param param CreateUpdateUserResult
     */
    public void setCreateUpdateUserResult(APIUserResult param) {
      localCreateUpdateUserResultTracker = param != null;

      this.localCreateUpdateUserResult = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
              new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
            final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
            final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter,
            boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://campusgroups.com/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
                  "xsi",
                  "http://www.w3.org/2001/XMLSchema-instance",
                  "type",
                  namespacePrefix + ":CreateUpdateUserResponse",
                  xmlWriter);
        } else {
          writeAttribute(
                  "xsi",
                  "http://www.w3.org/2001/XMLSchema-instance",
                  "type",
                  "CreateUpdateUserResponse",
                  xmlWriter);
        }
      }
      if (localCreateUpdateUserResultTracker) {
        if (localCreateUpdateUserResult == null) {
          throw new org.apache.axis2.databinding.ADBException(
                  "CreateUpdateUserResult cannot be null!!");
        }
        localCreateUpdateUserResult.serialize(
                new javax.xml.namespace.QName("http://campusgroups.com/", "CreateUpdateUserResult"),
                xmlWriter);
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://campusgroups.com/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(
            java.lang.String prefix,
            java.lang.String namespace,
            java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(
            java.lang.String prefix,
            java.lang.String namespace,
            java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(
            java.lang.String namespace,
            java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
                registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(
            java.lang.String namespace,
            java.lang.String attName,
            javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /**
     * method to handle Qnames
     */
    private void writeQName(
            javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
                  prefix
                          + ":"
                          + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
            javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                      .append(prefix)
                      .append(":")
                      .append(
                              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /**
     * Factory class that keeps the parse method
     */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
              org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static CreateUpdateUserResponse parse(javax.xml.stream.XMLStreamReader reader)
              throws java.lang.Exception {
        CreateUpdateUserResponse object = new CreateUpdateUserResponse();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
                  != null) {
            java.lang.String fullTypeName =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"CreateUpdateUserResponse".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (CreateUpdateUserResponse)
                        ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "CreateUpdateUserResult")
                  .equals(reader.getName())) {

            object.setCreateUpdateUserResult(APIUserResult.Factory.parse(reader));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class CreateUpdateTransactionResponse
          implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
            new javax.xml.namespace.QName(
                    "http://campusgroups.com/", "CreateUpdateTransactionResponse", "ns1");

    /**
     * field for CreateUpdateTransactionResult
     */
    protected APITransactionResult localCreateUpdateTransactionResult;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCreateUpdateTransactionResultTracker = false;

    public boolean isCreateUpdateTransactionResultSpecified() {
      return localCreateUpdateTransactionResultTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return APITransactionResult
     */
    public APITransactionResult getCreateUpdateTransactionResult() {
      return localCreateUpdateTransactionResult;
    }

    /**
     * Auto generated setter method
     *
     * @param param CreateUpdateTransactionResult
     */
    public void setCreateUpdateTransactionResult(APITransactionResult param) {
      localCreateUpdateTransactionResultTracker = param != null;

      this.localCreateUpdateTransactionResult = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
              new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
            final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
            final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter,
            boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://campusgroups.com/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
                  "xsi",
                  "http://www.w3.org/2001/XMLSchema-instance",
                  "type",
                  namespacePrefix + ":CreateUpdateTransactionResponse",
                  xmlWriter);
        } else {
          writeAttribute(
                  "xsi",
                  "http://www.w3.org/2001/XMLSchema-instance",
                  "type",
                  "CreateUpdateTransactionResponse",
                  xmlWriter);
        }
      }
      if (localCreateUpdateTransactionResultTracker) {
        if (localCreateUpdateTransactionResult == null) {
          throw new org.apache.axis2.databinding.ADBException(
                  "CreateUpdateTransactionResult cannot be null!!");
        }
        localCreateUpdateTransactionResult.serialize(
                new javax.xml.namespace.QName(
                        "http://campusgroups.com/", "CreateUpdateTransactionResult"),
                xmlWriter);
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://campusgroups.com/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(
            java.lang.String prefix,
            java.lang.String namespace,
            java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(
            java.lang.String prefix,
            java.lang.String namespace,
            java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(
            java.lang.String namespace,
            java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
                registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(
            java.lang.String namespace,
            java.lang.String attName,
            javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /**
     * method to handle Qnames
     */
    private void writeQName(
            javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
                  prefix
                          + ":"
                          + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
            javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                      .append(prefix)
                      .append(":")
                      .append(
                              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /**
     * Factory class that keeps the parse method
     */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
              org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static CreateUpdateTransactionResponse parse(javax.xml.stream.XMLStreamReader reader)
              throws java.lang.Exception {
        CreateUpdateTransactionResponse object = new CreateUpdateTransactionResponse();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
                  != null) {
            java.lang.String fullTypeName =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"CreateUpdateTransactionResponse".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (CreateUpdateTransactionResponse)
                        ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName(
                  "http://campusgroups.com/", "CreateUpdateTransactionResult")
                  .equals(reader.getName())) {

            object.setCreateUpdateTransactionResult(APITransactionResult.Factory.parse(reader));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class CreateUpdateUser implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
            new javax.xml.namespace.QName("http://campusgroups.com/", "CreateUpdateUser", "ns1");

    /**
     * field for School
     */
    protected java.lang.String localSchool;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSchoolTracker = false;

    public boolean isSchoolSpecified() {
      return localSchoolTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getSchool() {
      return localSchool;
    }

    /**
     * Auto generated setter method
     *
     * @param param School
     */
    public void setSchool(java.lang.String param) {
      localSchoolTracker = param != null;

      this.localSchool = param;
    }

    /**
     * field for Api_key
     */
    protected java.lang.String localApi_key;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localApi_keyTracker = false;

    public boolean isApi_keySpecified() {
      return localApi_keyTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getApi_key() {
      return localApi_key;
    }

    /**
     * Auto generated setter method
     *
     * @param param Api_key
     */
    public void setApi_key(java.lang.String param) {
      localApi_keyTracker = param != null;

      this.localApi_key = param;
    }

    /**
     * field for Timestamp
     */
    protected java.lang.String localTimestamp;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTimestampTracker = false;

    public boolean isTimestampSpecified() {
      return localTimestampTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getTimestamp() {
      return localTimestamp;
    }

    /**
     * Auto generated setter method
     *
     * @param param Timestamp
     */
    public void setTimestamp(java.lang.String param) {
      localTimestampTracker = param != null;

      this.localTimestamp = param;
    }

    /**
     * field for Auth_token
     */
    protected java.lang.String localAuth_token;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAuth_tokenTracker = false;

    public boolean isAuth_tokenSpecified() {
      return localAuth_tokenTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getAuth_token() {
      return localAuth_token;
    }

    /**
     * Auto generated setter method
     *
     * @param param Auth_token
     */
    public void setAuth_token(java.lang.String param) {
      localAuth_tokenTracker = param != null;

      this.localAuth_token = param;
    }

    /**
     * field for Api_secret
     */
    protected java.lang.String localApi_secret;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localApi_secretTracker = false;

    public boolean isApi_secretSpecified() {
      return localApi_secretTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getApi_secret() {
      return localApi_secret;
    }

    /**
     * Auto generated setter method
     *
     * @param param Api_secret
     */
    public void setApi_secret(java.lang.String param) {
      localApi_secretTracker = param != null;

      this.localApi_secret = param;
    }

    /**
     * field for Cg_id
     */
    protected java.lang.String localCg_id;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCg_idTracker = false;

    public boolean isCg_idSpecified() {
      return localCg_idTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCg_id() {
      return localCg_id;
    }

    /**
     * Auto generated setter method
     *
     * @param param Cg_id
     */
    public void setCg_id(java.lang.String param) {
      localCg_idTracker = param != null;

      this.localCg_id = param;
    }

    /**
     * field for Email
     */
    protected java.lang.String localEmail;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEmailTracker = false;

    public boolean isEmailSpecified() {
      return localEmailTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getEmail() {
      return localEmail;
    }

    /**
     * Auto generated setter method
     *
     * @param param Email
     */
    public void setEmail(java.lang.String param) {
      localEmailTracker = param != null;

      this.localEmail = param;
    }

    /**
     * field for Alumni_email
     */
    protected java.lang.String localAlumni_email;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAlumni_emailTracker = false;

    public boolean isAlumni_emailSpecified() {
      return localAlumni_emailTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getAlumni_email() {
      return localAlumni_email;
    }

    /**
     * Auto generated setter method
     *
     * @param param Alumni_email
     */
    public void setAlumni_email(java.lang.String param) {
      localAlumni_emailTracker = param != null;

      this.localAlumni_email = param;
    }

    /**
     * field for First_name
     */
    protected java.lang.String localFirst_name;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFirst_nameTracker = false;

    public boolean isFirst_nameSpecified() {
      return localFirst_nameTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getFirst_name() {
      return localFirst_name;
    }

    /**
     * Auto generated setter method
     *
     * @param param First_name
     */
    public void setFirst_name(java.lang.String param) {
      localFirst_nameTracker = param != null;

      this.localFirst_name = param;
    }

    /**
     * field for Last_name
     */
    protected java.lang.String localLast_name;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localLast_nameTracker = false;

    public boolean isLast_nameSpecified() {
      return localLast_nameTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getLast_name() {
      return localLast_name;
    }

    /**
     * Auto generated setter method
     *
     * @param param Last_name
     */
    public void setLast_name(java.lang.String param) {
      localLast_nameTracker = param != null;

      this.localLast_name = param;
    }

    /**
     * field for Middle_initial
     */
    protected java.lang.String localMiddle_initial;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMiddle_initialTracker = false;

    public boolean isMiddle_initialSpecified() {
      return localMiddle_initialTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getMiddle_initial() {
      return localMiddle_initial;
    }

    /**
     * Auto generated setter method
     *
     * @param param Middle_initial
     */
    public void setMiddle_initial(java.lang.String param) {
      localMiddle_initialTracker = param != null;

      this.localMiddle_initial = param;
    }

    /**
     * field for Gender_lookup
     */
    protected java.lang.String localGender_lookup;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localGender_lookupTracker = false;

    public boolean isGender_lookupSpecified() {
      return localGender_lookupTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getGender_lookup() {
      return localGender_lookup;
    }

    /**
     * Auto generated setter method
     *
     * @param param Gender_lookup
     */
    public void setGender_lookup(java.lang.String param) {
      localGender_lookupTracker = param != null;

      this.localGender_lookup = param;
    }

    /**
     * field for Gender_pronoun_lookup
     */
    protected java.lang.String localGender_pronoun_lookup;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localGender_pronoun_lookupTracker = false;

    public boolean isGender_pronoun_lookupSpecified() {
      return localGender_pronoun_lookupTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getGender_pronoun_lookup() {
      return localGender_pronoun_lookup;
    }

    /**
     * Auto generated setter method
     *
     * @param param Gender_pronoun_lookup
     */
    public void setGender_pronoun_lookup(java.lang.String param) {
      localGender_pronoun_lookupTracker = param != null;

      this.localGender_pronoun_lookup = param;
    }

    /**
     * field for Account_type_lookup
     */
    protected java.lang.String localAccount_type_lookup;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAccount_type_lookupTracker = false;

    public boolean isAccount_type_lookupSpecified() {
      return localAccount_type_lookupTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getAccount_type_lookup() {
      return localAccount_type_lookup;
    }

    /**
     * Auto generated setter method
     *
     * @param param Account_type_lookup
     */
    public void setAccount_type_lookup(java.lang.String param) {
      localAccount_type_lookupTracker = param != null;

      this.localAccount_type_lookup = param;
    }

    /**
     * field for School_program
     */
    protected java.lang.String localSchool_program;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSchool_programTracker = false;

    public boolean isSchool_programSpecified() {
      return localSchool_programTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getSchool_program() {
      return localSchool_program;
    }

    /**
     * Auto generated setter method
     *
     * @param param School_program
     */
    public void setSchool_program(java.lang.String param) {
      localSchool_programTracker = param != null;

      this.localSchool_program = param;
    }

    /**
     * field for Degree
     */
    protected java.lang.String localDegree;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDegreeTracker = false;

    public boolean isDegreeSpecified() {
      return localDegreeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getDegree() {
      return localDegree;
    }

    /**
     * Auto generated setter method
     *
     * @param param Degree
     */
    public void setDegree(java.lang.String param) {
      localDegreeTracker = param != null;

      this.localDegree = param;
    }

    /**
     * field for Month_of_entry_lookup
     */
    protected java.lang.String localMonth_of_entry_lookup;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMonth_of_entry_lookupTracker = false;

    public boolean isMonth_of_entry_lookupSpecified() {
      return localMonth_of_entry_lookupTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getMonth_of_entry_lookup() {
      return localMonth_of_entry_lookup;
    }

    /**
     * Auto generated setter method
     *
     * @param param Month_of_entry_lookup
     */
    public void setMonth_of_entry_lookup(java.lang.String param) {
      localMonth_of_entry_lookupTracker = param != null;

      this.localMonth_of_entry_lookup = param;
    }

    /**
     * field for Year_of_entry_lookup
     */
    protected java.lang.String localYear_of_entry_lookup;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localYear_of_entry_lookupTracker = false;

    public boolean isYear_of_entry_lookupSpecified() {
      return localYear_of_entry_lookupTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getYear_of_entry_lookup() {
      return localYear_of_entry_lookup;
    }

    /**
     * Auto generated setter method
     *
     * @param param Year_of_entry_lookup
     */
    public void setYear_of_entry_lookup(java.lang.String param) {
      localYear_of_entry_lookupTracker = param != null;

      this.localYear_of_entry_lookup = param;
    }

    /**
     * field for Month_of_grad_lookup
     */
    protected java.lang.String localMonth_of_grad_lookup;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMonth_of_grad_lookupTracker = false;

    public boolean isMonth_of_grad_lookupSpecified() {
      return localMonth_of_grad_lookupTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getMonth_of_grad_lookup() {
      return localMonth_of_grad_lookup;
    }

    /**
     * Auto generated setter method
     *
     * @param param Month_of_grad_lookup
     */
    public void setMonth_of_grad_lookup(java.lang.String param) {
      localMonth_of_grad_lookupTracker = param != null;

      this.localMonth_of_grad_lookup = param;
    }

    /**
     * field for Year_of_grad_lookup
     */
    protected java.lang.String localYear_of_grad_lookup;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localYear_of_grad_lookupTracker = false;

    public boolean isYear_of_grad_lookupSpecified() {
      return localYear_of_grad_lookupTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getYear_of_grad_lookup() {
      return localYear_of_grad_lookup;
    }

    /**
     * Auto generated setter method
     *
     * @param param Year_of_grad_lookup
     */
    public void setYear_of_grad_lookup(java.lang.String param) {
      localYear_of_grad_lookupTracker = param != null;

      this.localYear_of_grad_lookup = param;
    }

    /**
     * field for Phone_number
     */
    protected java.lang.String localPhone_number;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPhone_numberTracker = false;

    public boolean isPhone_numberSpecified() {
      return localPhone_numberTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getPhone_number() {
      return localPhone_number;
    }

    /**
     * Auto generated setter method
     *
     * @param param Phone_number
     */
    public void setPhone_number(java.lang.String param) {
      localPhone_numberTracker = param != null;

      this.localPhone_number = param;
    }

    /**
     * field for Mobile_number
     */
    protected java.lang.String localMobile_number;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMobile_numberTracker = false;

    public boolean isMobile_numberSpecified() {
      return localMobile_numberTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getMobile_number() {
      return localMobile_number;
    }

    /**
     * Auto generated setter method
     *
     * @param param Mobile_number
     */
    public void setMobile_number(java.lang.String param) {
      localMobile_numberTracker = param != null;

      this.localMobile_number = param;
    }

    /**
     * field for Street_address
     */
    protected java.lang.String localStreet_address;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localStreet_addressTracker = false;

    public boolean isStreet_addressSpecified() {
      return localStreet_addressTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getStreet_address() {
      return localStreet_address;
    }

    /**
     * Auto generated setter method
     *
     * @param param Street_address
     */
    public void setStreet_address(java.lang.String param) {
      localStreet_addressTracker = param != null;

      this.localStreet_address = param;
    }

    /**
     * field for City
     */
    protected java.lang.String localCity;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCityTracker = false;

    public boolean isCitySpecified() {
      return localCityTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCity() {
      return localCity;
    }

    /**
     * Auto generated setter method
     *
     * @param param City
     */
    public void setCity(java.lang.String param) {
      localCityTracker = param != null;

      this.localCity = param;
    }

    /**
     * field for State
     */
    protected java.lang.String localState;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localStateTracker = false;

    public boolean isStateSpecified() {
      return localStateTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getState() {
      return localState;
    }

    /**
     * Auto generated setter method
     *
     * @param param State
     */
    public void setState(java.lang.String param) {
      localStateTracker = param != null;

      this.localState = param;
    }

    /**
     * field for Zipcode
     */
    protected java.lang.String localZipcode;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localZipcodeTracker = false;

    public boolean isZipcodeSpecified() {
      return localZipcodeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getZipcode() {
      return localZipcode;
    }

    /**
     * Auto generated setter method
     *
     * @param param Zipcode
     */
    public void setZipcode(java.lang.String param) {
      localZipcodeTracker = param != null;

      this.localZipcode = param;
    }

    /**
     * field for Country_lookup
     */
    protected java.lang.String localCountry_lookup;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCountry_lookupTracker = false;

    public boolean isCountry_lookupSpecified() {
      return localCountry_lookupTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCountry_lookup() {
      return localCountry_lookup;
    }

    /**
     * Auto generated setter method
     *
     * @param param Country_lookup
     */
    public void setCountry_lookup(java.lang.String param) {
      localCountry_lookupTracker = param != null;

      this.localCountry_lookup = param;
    }

    /**
     * field for Nationality_lookup
     */
    protected java.lang.String localNationality_lookup;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNationality_lookupTracker = false;

    public boolean isNationality_lookupSpecified() {
      return localNationality_lookupTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getNationality_lookup() {
      return localNationality_lookup;
    }

    /**
     * Auto generated setter method
     *
     * @param param Nationality_lookup
     */
    public void setNationality_lookup(java.lang.String param) {
      localNationality_lookupTracker = param != null;

      this.localNationality_lookup = param;
    }

    /**
     * field for Account_status
     */
    protected int localAccount_status;

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getAccount_status() {
      return localAccount_status;
    }

    /**
     * Auto generated setter method
     *
     * @param param Account_status
     */
    public void setAccount_status(int param) {

      this.localAccount_status = param;
    }

    /**
     * field for Company_name
     */
    protected java.lang.String localCompany_name;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCompany_nameTracker = false;

    public boolean isCompany_nameSpecified() {
      return localCompany_nameTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCompany_name() {
      return localCompany_name;
    }

    /**
     * Auto generated setter method
     *
     * @param param Company_name
     */
    public void setCompany_name(java.lang.String param) {
      localCompany_nameTracker = param != null;

      this.localCompany_name = param;
    }

    /**
     * field for Work_title
     */
    protected java.lang.String localWork_title;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localWork_titleTracker = false;

    public boolean isWork_titleSpecified() {
      return localWork_titleTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getWork_title() {
      return localWork_title;
    }

    /**
     * Auto generated setter method
     *
     * @param param Work_title
     */
    public void setWork_title(java.lang.String param) {
      localWork_titleTracker = param != null;

      this.localWork_title = param;
    }

    /**
     * field for Bio
     */
    protected java.lang.String localBio;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localBioTracker = false;

    public boolean isBioSpecified() {
      return localBioTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getBio() {
      return localBio;
    }

    /**
     * Auto generated setter method
     *
     * @param param Bio
     */
    public void setBio(java.lang.String param) {
      localBioTracker = param != null;

      this.localBio = param;
    }

    /**
     * field for Linkedin
     */
    protected java.lang.String localLinkedin;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localLinkedinTracker = false;

    public boolean isLinkedinSpecified() {
      return localLinkedinTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getLinkedin() {
      return localLinkedin;
    }

    /**
     * Auto generated setter method
     *
     * @param param Linkedin
     */
    public void setLinkedin(java.lang.String param) {
      localLinkedinTracker = param != null;

      this.localLinkedin = param;
    }

    /**
     * field for Facebook
     */
    protected java.lang.String localFacebook;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFacebookTracker = false;

    public boolean isFacebookSpecified() {
      return localFacebookTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getFacebook() {
      return localFacebook;
    }

    /**
     * Auto generated setter method
     *
     * @param param Facebook
     */
    public void setFacebook(java.lang.String param) {
      localFacebookTracker = param != null;

      this.localFacebook = param;
    }

    /**
     * field for Twitter
     */
    protected java.lang.String localTwitter;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTwitterTracker = false;

    public boolean isTwitterSpecified() {
      return localTwitterTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getTwitter() {
      return localTwitter;
    }

    /**
     * Auto generated setter method
     *
     * @param param Twitter
     */
    public void setTwitter(java.lang.String param) {
      localTwitterTracker = param != null;

      this.localTwitter = param;
    }

    /**
     * field for Google_plus
     */
    protected java.lang.String localGoogle_plus;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localGoogle_plusTracker = false;

    public boolean isGoogle_plusSpecified() {
      return localGoogle_plusTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getGoogle_plus() {
      return localGoogle_plus;
    }

    /**
     * Auto generated setter method
     *
     * @param param Google_plus
     */
    public void setGoogle_plus(java.lang.String param) {
      localGoogle_plusTracker = param != null;

      this.localGoogle_plus = param;
    }

    /**
     * field for Netid
     */
    protected java.lang.String localNetid;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNetidTracker = false;

    public boolean isNetidSpecified() {
      return localNetidTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getNetid() {
      return localNetid;
    }

    /**
     * Auto generated setter method
     *
     * @param param Netid
     */
    public void setNetid(java.lang.String param) {
      localNetidTracker = param != null;

      this.localNetid = param;
    }

    /**
     * field for Netid2
     */
    protected java.lang.String localNetid2;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNetid2Tracker = false;

    public boolean isNetid2Specified() {
      return localNetid2Tracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getNetid2() {
      return localNetid2;
    }

    /**
     * Auto generated setter method
     *
     * @param param Netid2
     */
    public void setNetid2(java.lang.String param) {
      localNetid2Tracker = param != null;

      this.localNetid2 = param;
    }

    /**
     * field for SwipeId
     */
    protected java.lang.String localSwipeId;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSwipeIdTracker = false;

    public boolean isSwipeIdSpecified() {
      return localSwipeIdTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getSwipeId() {
      return localSwipeId;
    }

    /**
     * Auto generated setter method
     *
     * @param param SwipeId
     */
    public void setSwipeId(java.lang.String param) {
      localSwipeIdTracker = param != null;

      this.localSwipeId = param;
    }

    /**
     * field for Rfid
     */
    protected java.lang.String localRfid;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRfidTracker = false;

    public boolean isRfidSpecified() {
      return localRfidTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getRfid() {
      return localRfid;
    }

    /**
     * Auto generated setter method
     *
     * @param param Rfid
     */
    public void setRfid(java.lang.String param) {
      localRfidTracker = param != null;

      this.localRfid = param;
    }

    /**
     * field for Business_street_address
     */
    protected java.lang.String localBusiness_street_address;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localBusiness_street_addressTracker = false;

    public boolean isBusiness_street_addressSpecified() {
      return localBusiness_street_addressTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getBusiness_street_address() {
      return localBusiness_street_address;
    }

    /**
     * Auto generated setter method
     *
     * @param param Business_street_address
     */
    public void setBusiness_street_address(java.lang.String param) {
      localBusiness_street_addressTracker = param != null;

      this.localBusiness_street_address = param;
    }

    /**
     * field for Business_department
     */
    protected java.lang.String localBusiness_department;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localBusiness_departmentTracker = false;

    public boolean isBusiness_departmentSpecified() {
      return localBusiness_departmentTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getBusiness_department() {
      return localBusiness_department;
    }

    /**
     * Auto generated setter method
     *
     * @param param Business_department
     */
    public void setBusiness_department(java.lang.String param) {
      localBusiness_departmentTracker = param != null;

      this.localBusiness_department = param;
    }

    /**
     * field for Business_phone_number
     */
    protected java.lang.String localBusiness_phone_number;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localBusiness_phone_numberTracker = false;

    public boolean isBusiness_phone_numberSpecified() {
      return localBusiness_phone_numberTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getBusiness_phone_number() {
      return localBusiness_phone_number;
    }

    /**
     * Auto generated setter method
     *
     * @param param Business_phone_number
     */
    public void setBusiness_phone_number(java.lang.String param) {
      localBusiness_phone_numberTracker = param != null;

      this.localBusiness_phone_number = param;
    }

    /**
     * field for Languages_selection
     */
    protected java.lang.String localLanguages_selection;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localLanguages_selectionTracker = false;

    public boolean isLanguages_selectionSpecified() {
      return localLanguages_selectionTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getLanguages_selection() {
      return localLanguages_selection;
    }

    /**
     * Auto generated setter method
     *
     * @param param Languages_selection
     */
    public void setLanguages_selection(java.lang.String param) {
      localLanguages_selectionTracker = param != null;

      this.localLanguages_selection = param;
    }

    /**
     * field for Nationalities_selection
     */
    protected java.lang.String localNationalities_selection;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNationalities_selectionTracker = false;

    public boolean isNationalities_selectionSpecified() {
      return localNationalities_selectionTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getNationalities_selection() {
      return localNationalities_selection;
    }

    /**
     * Auto generated setter method
     *
     * @param param Nationalities_selection
     */
    public void setNationalities_selection(java.lang.String param) {
      localNationalities_selectionTracker = param != null;

      this.localNationalities_selection = param;
    }

    /**
     * field for User_tags
     */
    protected java.lang.String localUser_tags;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localUser_tagsTracker = false;

    public boolean isUser_tagsSpecified() {
      return localUser_tagsTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getUser_tags() {
      return localUser_tags;
    }

    /**
     * Auto generated setter method
     *
     * @param param User_tags
     */
    public void setUser_tags(java.lang.String param) {
      localUser_tagsTracker = param != null;

      this.localUser_tags = param;
    }

    /**
     * field for Keep_existing_user_tags
     */
    protected java.lang.String localKeep_existing_user_tags;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localKeep_existing_user_tagsTracker = false;

    public boolean isKeep_existing_user_tagsSpecified() {
      return localKeep_existing_user_tagsTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getKeep_existing_user_tags() {
      return localKeep_existing_user_tags;
    }

    /**
     * Auto generated setter method
     *
     * @param param Keep_existing_user_tags
     */
    public void setKeep_existing_user_tags(java.lang.String param) {
      localKeep_existing_user_tagsTracker = param != null;

      this.localKeep_existing_user_tags = param;
    }

    /**
     * field for New_user_tags_are_admin_only
     */
    protected java.lang.String localNew_user_tags_are_admin_only;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNew_user_tags_are_admin_onlyTracker = false;

    public boolean isNew_user_tags_are_admin_onlySpecified() {
      return localNew_user_tags_are_admin_onlyTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getNew_user_tags_are_admin_only() {
      return localNew_user_tags_are_admin_only;
    }

    /**
     * Auto generated setter method
     *
     * @param param New_user_tags_are_admin_only
     */
    public void setNew_user_tags_are_admin_only(java.lang.String param) {
      localNew_user_tags_are_admin_onlyTracker = param != null;

      this.localNew_user_tags_are_admin_only = param;
    }

    /**
     * field for External_id
     */
    protected java.lang.String localExternal_id;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localExternal_idTracker = false;

    public boolean isExternal_idSpecified() {
      return localExternal_idTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getExternal_id() {
      return localExternal_id;
    }

    /**
     * Auto generated setter method
     *
     * @param param External_id
     */
    public void setExternal_id(java.lang.String param) {
      localExternal_idTracker = param != null;

      this.localExternal_id = param;
    }

    /**
     * field for Netid3
     */
    protected java.lang.String localNetid3;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNetid3Tracker = false;

    public boolean isNetid3Specified() {
      return localNetid3Tracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getNetid3() {
      return localNetid3;
    }

    /**
     * Auto generated setter method
     *
     * @param param Netid3
     */
    public void setNetid3(java.lang.String param) {
      localNetid3Tracker = param != null;

      this.localNetid3 = param;
    }

    /**
     * field for External_guid
     */
    protected java.lang.String localExternal_guid;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localExternal_guidTracker = false;

    public boolean isExternal_guidSpecified() {
      return localExternal_guidTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getExternal_guid() {
      return localExternal_guid;
    }

    /**
     * Auto generated setter method
     *
     * @param param External_guid
     */
    public void setExternal_guid(java.lang.String param) {
      localExternal_guidTracker = param != null;

      this.localExternal_guid = param;
    }

    /**
     * field for Hide_profile_page
     */
    protected java.lang.String localHide_profile_page;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localHide_profile_pageTracker = false;

    public boolean isHide_profile_pageSpecified() {
      return localHide_profile_pageTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getHide_profile_page() {
      return localHide_profile_page;
    }

    /**
     * Auto generated setter method
     *
     * @param param Hide_profile_page
     */
    public void setHide_profile_page(java.lang.String param) {
      localHide_profile_pageTracker = param != null;

      this.localHide_profile_page = param;
    }

    /**
     * field for Hide_from_directory
     */
    protected java.lang.String localHide_from_directory;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localHide_from_directoryTracker = false;

    public boolean isHide_from_directorySpecified() {
      return localHide_from_directoryTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getHide_from_directory() {
      return localHide_from_directory;
    }

    /**
     * Auto generated setter method
     *
     * @param param Hide_from_directory
     */
    public void setHide_from_directory(java.lang.String param) {
      localHide_from_directoryTracker = param != null;

      this.localHide_from_directory = param;
    }

    /**
     * field for Unsubscribe_all_group_emails
     */
    protected java.lang.String localUnsubscribe_all_group_emails;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localUnsubscribe_all_group_emailsTracker = false;

    public boolean isUnsubscribe_all_group_emailsSpecified() {
      return localUnsubscribe_all_group_emailsTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getUnsubscribe_all_group_emails() {
      return localUnsubscribe_all_group_emails;
    }

    /**
     * Auto generated setter method
     *
     * @param param Unsubscribe_all_group_emails
     */
    public void setUnsubscribe_all_group_emails(java.lang.String param) {
      localUnsubscribe_all_group_emailsTracker = param != null;

      this.localUnsubscribe_all_group_emails = param;
    }

    /**
     * field for Other_email
     */
    protected java.lang.String localOther_email;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localOther_emailTracker = false;

    public boolean isOther_emailSpecified() {
      return localOther_emailTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getOther_email() {
      return localOther_email;
    }

    /**
     * Auto generated setter method
     *
     * @param param Other_email
     */
    public void setOther_email(java.lang.String param) {
      localOther_emailTracker = param != null;

      this.localOther_email = param;
    }

    /**
     * field for Custom_fields
     */
    protected ArrayOfCustom_field localCustom_fields;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCustom_fieldsTracker = false;

    public boolean isCustom_fieldsSpecified() {
      return localCustom_fieldsTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return ArrayOfCustom_field
     */
    public ArrayOfCustom_field getCustom_fields() {
      return localCustom_fields;
    }

    /**
     * Auto generated setter method
     *
     * @param param Custom_fields
     */
    public void setCustom_fields(ArrayOfCustom_field param) {
      localCustom_fieldsTracker = param != null;

      this.localCustom_fields = param;
    }

    /**
     * field for Official_name
     */
    protected java.lang.String localOfficial_name;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localOfficial_nameTracker = false;

    public boolean isOfficial_nameSpecified() {
      return localOfficial_nameTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getOfficial_name() {
      return localOfficial_name;
    }

    /**
     * Auto generated setter method
     *
     * @param param Official_name
     */
    public void setOfficial_name(java.lang.String param) {
      localOfficial_nameTracker = param != null;

      this.localOfficial_name = param;
    }

    /**
     * field for Legal_first_name
     */
    protected java.lang.String localLegal_first_name;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localLegal_first_nameTracker = false;

    public boolean isLegal_first_nameSpecified() {
      return localLegal_first_nameTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getLegal_first_name() {
      return localLegal_first_name;
    }

    /**
     * Auto generated setter method
     *
     * @param param Legal_first_name
     */
    public void setLegal_first_name(java.lang.String param) {
      localLegal_first_nameTracker = param != null;

      this.localLegal_first_name = param;
    }

    /**
     * field for Maiden_name
     */
    protected java.lang.String localMaiden_name;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMaiden_nameTracker = false;

    public boolean isMaiden_nameSpecified() {
      return localMaiden_nameTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getMaiden_name() {
      return localMaiden_name;
    }

    /**
     * Auto generated setter method
     *
     * @param param Maiden_name
     */
    public void setMaiden_name(java.lang.String param) {
      localMaiden_nameTracker = param != null;

      this.localMaiden_name = param;
    }

    /**
     * field for Date_of_birth
     */
    protected java.lang.String localDate_of_birth;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDate_of_birthTracker = false;

    public boolean isDate_of_birthSpecified() {
      return localDate_of_birthTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getDate_of_birth() {
      return localDate_of_birth;
    }

    /**
     * Auto generated setter method
     *
     * @param param Date_of_birth
     */
    public void setDate_of_birth(java.lang.String param) {
      localDate_of_birthTracker = param != null;

      this.localDate_of_birth = param;
    }

    /**
     * field for Check_existing_deactivated_users_if_needed
     */
    protected java.lang.String localCheck_existing_deactivated_users_if_needed;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCheck_existing_deactivated_users_if_neededTracker = false;

    public boolean isCheck_existing_deactivated_users_if_neededSpecified() {
      return localCheck_existing_deactivated_users_if_neededTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCheck_existing_deactivated_users_if_needed() {
      return localCheck_existing_deactivated_users_if_needed;
    }

    /**
     * Auto generated setter method
     *
     * @param param Check_existing_deactivated_users_if_needed
     */
    public void setCheck_existing_deactivated_users_if_needed(java.lang.String param) {
      localCheck_existing_deactivated_users_if_neededTracker = param != null;

      this.localCheck_existing_deactivated_users_if_needed = param;
    }

    /**
     * field for Force_overwrite_of_data_even_if_not_flagged_read_only
     */
    protected java.lang.String localForce_overwrite_of_data_even_if_not_flagged_read_only;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localForce_overwrite_of_data_even_if_not_flagged_read_onlyTracker = false;

    public boolean isForce_overwrite_of_data_even_if_not_flagged_read_onlySpecified() {
      return localForce_overwrite_of_data_even_if_not_flagged_read_onlyTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getForce_overwrite_of_data_even_if_not_flagged_read_only() {
      return localForce_overwrite_of_data_even_if_not_flagged_read_only;
    }

    /**
     * Auto generated setter method
     *
     * @param param Force_overwrite_of_data_even_if_not_flagged_read_only
     */
    public void setForce_overwrite_of_data_even_if_not_flagged_read_only(java.lang.String param) {
      localForce_overwrite_of_data_even_if_not_flagged_read_onlyTracker = param != null;

      this.localForce_overwrite_of_data_even_if_not_flagged_read_only = param;
    }

    /**
     * field for Over_21
     */
    protected java.lang.String localOver_21;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localOver_21Tracker = false;

    public boolean isOver_21Specified() {
      return localOver_21Tracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getOver_21() {
      return localOver_21;
    }

    /**
     * Auto generated setter method
     *
     * @param param Over_21
     */
    public void setOver_21(java.lang.String param) {
      localOver_21Tracker = param != null;

      this.localOver_21 = param;
    }

    /**
     * field for Qrcode
     */
    protected java.lang.String localQrcode;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localQrcodeTracker = false;

    public boolean isQrcodeSpecified() {
      return localQrcodeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getQrcode() {
      return localQrcode;
    }

    /**
     * Auto generated setter method
     *
     * @param param Qrcode
     */
    public void setQrcode(java.lang.String param) {
      localQrcodeTracker = param != null;

      this.localQrcode = param;
    }

    /**
     * field for Barcode
     */
    protected java.lang.String localBarcode;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localBarcodeTracker = false;

    public boolean isBarcodeSpecified() {
      return localBarcodeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getBarcode() {
      return localBarcode;
    }

    /**
     * Auto generated setter method
     *
     * @param param Barcode
     */
    public void setBarcode(java.lang.String param) {
      localBarcodeTracker = param != null;

      this.localBarcode = param;
    }

    /**
     * field for Preferred_email
     */
    protected java.lang.String localPreferred_email;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPreferred_emailTracker = false;

    public boolean isPreferred_emailSpecified() {
      return localPreferred_emailTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getPreferred_email() {
      return localPreferred_email;
    }

    /**
     * Auto generated setter method
     *
     * @param param Preferred_email
     */
    public void setPreferred_email(java.lang.String param) {
      localPreferred_emailTracker = param != null;

      this.localPreferred_email = param;
    }

    /**
     * field for Career_interests
     */
    protected java.lang.String localCareer_interests;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCareer_interestsTracker = false;

    public boolean isCareer_interestsSpecified() {
      return localCareer_interestsTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCareer_interests() {
      return localCareer_interests;
    }

    /**
     * Auto generated setter method
     *
     * @param param Career_interests
     */
    public void setCareer_interests(java.lang.String param) {
      localCareer_interestsTracker = param != null;

      this.localCareer_interests = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
              new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
            final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
            final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter,
            boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://campusgroups.com/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
                  "xsi",
                  "http://www.w3.org/2001/XMLSchema-instance",
                  "type",
                  namespacePrefix + ":CreateUpdateUser",
                  xmlWriter);
        } else {
          writeAttribute(
                  "xsi",
                  "http://www.w3.org/2001/XMLSchema-instance",
                  "type",
                  "CreateUpdateUser",
                  xmlWriter);
        }
      }
      if (localSchoolTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "school", xmlWriter);

        if (localSchool == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("school cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localSchool);
        }

        xmlWriter.writeEndElement();
      }
      if (localApi_keyTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "api_key", xmlWriter);

        if (localApi_key == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("api_key cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localApi_key);
        }

        xmlWriter.writeEndElement();
      }
      if (localTimestampTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "timestamp", xmlWriter);

        if (localTimestamp == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("timestamp cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localTimestamp);
        }

        xmlWriter.writeEndElement();
      }
      if (localAuth_tokenTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "auth_token", xmlWriter);

        if (localAuth_token == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("auth_token cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localAuth_token);
        }

        xmlWriter.writeEndElement();
      }
      if (localApi_secretTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "api_secret", xmlWriter);

        if (localApi_secret == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("api_secret cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localApi_secret);
        }

        xmlWriter.writeEndElement();
      }
      if (localCg_idTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "cg_id", xmlWriter);

        if (localCg_id == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("cg_id cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localCg_id);
        }

        xmlWriter.writeEndElement();
      }
      if (localEmailTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "email", xmlWriter);

        if (localEmail == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("email cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localEmail);
        }

        xmlWriter.writeEndElement();
      }
      if (localAlumni_emailTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "alumni_email", xmlWriter);

        if (localAlumni_email == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("alumni_email cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localAlumni_email);
        }

        xmlWriter.writeEndElement();
      }
      if (localFirst_nameTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "first_name", xmlWriter);

        if (localFirst_name == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("first_name cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localFirst_name);
        }

        xmlWriter.writeEndElement();
      }
      if (localLast_nameTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "last_name", xmlWriter);

        if (localLast_name == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("last_name cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localLast_name);
        }

        xmlWriter.writeEndElement();
      }
      if (localMiddle_initialTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "middle_initial", xmlWriter);

        if (localMiddle_initial == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("middle_initial cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localMiddle_initial);
        }

        xmlWriter.writeEndElement();
      }
      if (localGender_lookupTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "gender_lookup", xmlWriter);

        if (localGender_lookup == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("gender_lookup cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localGender_lookup);
        }

        xmlWriter.writeEndElement();
      }
      if (localGender_pronoun_lookupTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "gender_pronoun_lookup", xmlWriter);

        if (localGender_pronoun_lookup == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException(
                  "gender_pronoun_lookup cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localGender_pronoun_lookup);
        }

        xmlWriter.writeEndElement();
      }
      if (localAccount_type_lookupTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "account_type_lookup", xmlWriter);

        if (localAccount_type_lookup == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException(
                  "account_type_lookup cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localAccount_type_lookup);
        }

        xmlWriter.writeEndElement();
      }
      if (localSchool_programTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "school_program", xmlWriter);

        if (localSchool_program == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("school_program cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localSchool_program);
        }

        xmlWriter.writeEndElement();
      }
      if (localDegreeTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "degree", xmlWriter);

        if (localDegree == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("degree cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localDegree);
        }

        xmlWriter.writeEndElement();
      }
      if (localMonth_of_entry_lookupTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "month_of_entry_lookup", xmlWriter);

        if (localMonth_of_entry_lookup == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException(
                  "month_of_entry_lookup cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localMonth_of_entry_lookup);
        }

        xmlWriter.writeEndElement();
      }
      if (localYear_of_entry_lookupTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "year_of_entry_lookup", xmlWriter);

        if (localYear_of_entry_lookup == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException(
                  "year_of_entry_lookup cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localYear_of_entry_lookup);
        }

        xmlWriter.writeEndElement();
      }
      if (localMonth_of_grad_lookupTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "month_of_grad_lookup", xmlWriter);

        if (localMonth_of_grad_lookup == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException(
                  "month_of_grad_lookup cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localMonth_of_grad_lookup);
        }

        xmlWriter.writeEndElement();
      }
      if (localYear_of_grad_lookupTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "year_of_grad_lookup", xmlWriter);

        if (localYear_of_grad_lookup == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException(
                  "year_of_grad_lookup cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localYear_of_grad_lookup);
        }

        xmlWriter.writeEndElement();
      }
      if (localPhone_numberTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "phone_number", xmlWriter);

        if (localPhone_number == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("phone_number cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localPhone_number);
        }

        xmlWriter.writeEndElement();
      }
      if (localMobile_numberTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "mobile_number", xmlWriter);

        if (localMobile_number == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("mobile_number cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localMobile_number);
        }

        xmlWriter.writeEndElement();
      }
      if (localStreet_addressTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "street_address", xmlWriter);

        if (localStreet_address == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("street_address cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localStreet_address);
        }

        xmlWriter.writeEndElement();
      }
      if (localCityTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "city", xmlWriter);

        if (localCity == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("city cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localCity);
        }

        xmlWriter.writeEndElement();
      }
      if (localStateTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "state", xmlWriter);

        if (localState == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("state cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localState);
        }

        xmlWriter.writeEndElement();
      }
      if (localZipcodeTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "zipcode", xmlWriter);

        if (localZipcode == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("zipcode cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localZipcode);
        }

        xmlWriter.writeEndElement();
      }
      if (localCountry_lookupTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "country_lookup", xmlWriter);

        if (localCountry_lookup == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("country_lookup cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localCountry_lookup);
        }

        xmlWriter.writeEndElement();
      }
      if (localNationality_lookupTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "nationality_lookup", xmlWriter);

        if (localNationality_lookup == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException(
                  "nationality_lookup cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localNationality_lookup);
        }

        xmlWriter.writeEndElement();
      }
      namespace = "http://campusgroups.com/";
      writeStartElement(null, namespace, "account_status", xmlWriter);

      if (localAccount_status == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("account_status cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAccount_status));
      }

      xmlWriter.writeEndElement();
      if (localCompany_nameTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "company_name", xmlWriter);

        if (localCompany_name == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("company_name cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localCompany_name);
        }

        xmlWriter.writeEndElement();
      }
      if (localWork_titleTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "work_title", xmlWriter);

        if (localWork_title == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("work_title cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localWork_title);
        }

        xmlWriter.writeEndElement();
      }
      if (localBioTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "bio", xmlWriter);

        if (localBio == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("bio cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localBio);
        }

        xmlWriter.writeEndElement();
      }
      if (localLinkedinTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "linkedin", xmlWriter);

        if (localLinkedin == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("linkedin cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localLinkedin);
        }

        xmlWriter.writeEndElement();
      }
      if (localFacebookTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "facebook", xmlWriter);

        if (localFacebook == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("facebook cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localFacebook);
        }

        xmlWriter.writeEndElement();
      }
      if (localTwitterTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "twitter", xmlWriter);

        if (localTwitter == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("twitter cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localTwitter);
        }

        xmlWriter.writeEndElement();
      }
      if (localGoogle_plusTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "google_plus", xmlWriter);

        if (localGoogle_plus == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("google_plus cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localGoogle_plus);
        }

        xmlWriter.writeEndElement();
      }
      if (localNetidTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "netid", xmlWriter);

        if (localNetid == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("netid cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localNetid);
        }

        xmlWriter.writeEndElement();
      }
      if (localNetid2Tracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "netid2", xmlWriter);

        if (localNetid2 == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("netid2 cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localNetid2);
        }

        xmlWriter.writeEndElement();
      }
      if (localSwipeIdTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "swipeId", xmlWriter);

        if (localSwipeId == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("swipeId cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localSwipeId);
        }

        xmlWriter.writeEndElement();
      }
      if (localRfidTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "rfid", xmlWriter);

        if (localRfid == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("rfid cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localRfid);
        }

        xmlWriter.writeEndElement();
      }
      if (localBusiness_street_addressTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "business_street_address", xmlWriter);

        if (localBusiness_street_address == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException(
                  "business_street_address cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localBusiness_street_address);
        }

        xmlWriter.writeEndElement();
      }
      if (localBusiness_departmentTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "business_department", xmlWriter);

        if (localBusiness_department == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException(
                  "business_department cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localBusiness_department);
        }

        xmlWriter.writeEndElement();
      }
      if (localBusiness_phone_numberTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "business_phone_number", xmlWriter);

        if (localBusiness_phone_number == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException(
                  "business_phone_number cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localBusiness_phone_number);
        }

        xmlWriter.writeEndElement();
      }
      if (localLanguages_selectionTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "languages_selection", xmlWriter);

        if (localLanguages_selection == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException(
                  "languages_selection cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localLanguages_selection);
        }

        xmlWriter.writeEndElement();
      }
      if (localNationalities_selectionTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "nationalities_selection", xmlWriter);

        if (localNationalities_selection == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException(
                  "nationalities_selection cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localNationalities_selection);
        }

        xmlWriter.writeEndElement();
      }
      if (localUser_tagsTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "user_tags", xmlWriter);

        if (localUser_tags == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("user_tags cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localUser_tags);
        }

        xmlWriter.writeEndElement();
      }
      if (localKeep_existing_user_tagsTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "keep_existing_user_tags", xmlWriter);

        if (localKeep_existing_user_tags == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException(
                  "keep_existing_user_tags cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localKeep_existing_user_tags);
        }

        xmlWriter.writeEndElement();
      }
      if (localNew_user_tags_are_admin_onlyTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "new_user_tags_are_admin_only", xmlWriter);

        if (localNew_user_tags_are_admin_only == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException(
                  "new_user_tags_are_admin_only cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localNew_user_tags_are_admin_only);
        }

        xmlWriter.writeEndElement();
      }
      if (localExternal_idTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "external_id", xmlWriter);

        if (localExternal_id == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("external_id cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localExternal_id);
        }

        xmlWriter.writeEndElement();
      }
      if (localNetid3Tracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "netid3", xmlWriter);

        if (localNetid3 == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("netid3 cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localNetid3);
        }

        xmlWriter.writeEndElement();
      }
      if (localExternal_guidTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "external_guid", xmlWriter);

        if (localExternal_guid == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("external_guid cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localExternal_guid);
        }

        xmlWriter.writeEndElement();
      }
      if (localHide_profile_pageTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "hide_profile_page", xmlWriter);

        if (localHide_profile_page == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("hide_profile_page cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localHide_profile_page);
        }

        xmlWriter.writeEndElement();
      }
      if (localHide_from_directoryTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "hide_from_directory", xmlWriter);

        if (localHide_from_directory == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException(
                  "hide_from_directory cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localHide_from_directory);
        }

        xmlWriter.writeEndElement();
      }
      if (localUnsubscribe_all_group_emailsTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "unsubscribe_all_group_emails", xmlWriter);

        if (localUnsubscribe_all_group_emails == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException(
                  "unsubscribe_all_group_emails cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localUnsubscribe_all_group_emails);
        }

        xmlWriter.writeEndElement();
      }
      if (localOther_emailTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "other_email", xmlWriter);

        if (localOther_email == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("other_email cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localOther_email);
        }

        xmlWriter.writeEndElement();
      }
      if (localCustom_fieldsTracker) {
        if (localCustom_fields == null) {
          throw new org.apache.axis2.databinding.ADBException("custom_fields cannot be null!!");
        }
        localCustom_fields.serialize(
                new javax.xml.namespace.QName("http://campusgroups.com/", "custom_fields"), xmlWriter);
      }
      if (localOfficial_nameTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "official_name", xmlWriter);

        if (localOfficial_name == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("official_name cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localOfficial_name);
        }

        xmlWriter.writeEndElement();
      }
      if (localLegal_first_nameTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "legal_first_name", xmlWriter);

        if (localLegal_first_name == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("legal_first_name cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localLegal_first_name);
        }

        xmlWriter.writeEndElement();
      }
      if (localMaiden_nameTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "maiden_name", xmlWriter);

        if (localMaiden_name == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("maiden_name cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localMaiden_name);
        }

        xmlWriter.writeEndElement();
      }
      if (localDate_of_birthTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "date_of_birth", xmlWriter);

        if (localDate_of_birth == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("date_of_birth cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localDate_of_birth);
        }

        xmlWriter.writeEndElement();
      }
      if (localCheck_existing_deactivated_users_if_neededTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "check_existing_deactivated_users_if_needed", xmlWriter);

        if (localCheck_existing_deactivated_users_if_needed == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException(
                  "check_existing_deactivated_users_if_needed cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localCheck_existing_deactivated_users_if_needed);
        }

        xmlWriter.writeEndElement();
      }
      if (localForce_overwrite_of_data_even_if_not_flagged_read_onlyTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(
                null, namespace, "force_overwrite_of_data_even_if_not_flagged_read_only", xmlWriter);

        if (localForce_overwrite_of_data_even_if_not_flagged_read_only == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException(
                  "force_overwrite_of_data_even_if_not_flagged_read_only cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localForce_overwrite_of_data_even_if_not_flagged_read_only);
        }

        xmlWriter.writeEndElement();
      }
      if (localOver_21Tracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "over_21", xmlWriter);

        if (localOver_21 == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("over_21 cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localOver_21);
        }

        xmlWriter.writeEndElement();
      }
      if (localQrcodeTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "qrcode", xmlWriter);

        if (localQrcode == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("qrcode cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localQrcode);
        }

        xmlWriter.writeEndElement();
      }
      if (localBarcodeTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "barcode", xmlWriter);

        if (localBarcode == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("barcode cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localBarcode);
        }

        xmlWriter.writeEndElement();
      }
      if (localPreferred_emailTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "preferred_email", xmlWriter);

        if (localPreferred_email == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("preferred_email cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localPreferred_email);
        }

        xmlWriter.writeEndElement();
      }
      if (localCareer_interestsTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "career_interests", xmlWriter);

        if (localCareer_interests == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("career_interests cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localCareer_interests);
        }

        xmlWriter.writeEndElement();
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://campusgroups.com/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(
            java.lang.String prefix,
            java.lang.String namespace,
            java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(
            java.lang.String prefix,
            java.lang.String namespace,
            java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(
            java.lang.String namespace,
            java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
                registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(
            java.lang.String namespace,
            java.lang.String attName,
            javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /**
     * method to handle Qnames
     */
    private void writeQName(
            javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
                  prefix
                          + ":"
                          + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
            javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                      .append(prefix)
                      .append(":")
                      .append(
                              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /**
     * Factory class that keeps the parse method
     */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
              org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static CreateUpdateUser parse(javax.xml.stream.XMLStreamReader reader)
              throws java.lang.Exception {
        CreateUpdateUser object = new CreateUpdateUser();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
                  != null) {
            java.lang.String fullTypeName =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"CreateUpdateUser".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (CreateUpdateUser) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "school")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "school" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setSchool(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "api_key")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "api_key" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setApi_key(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "timestamp")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "timestamp" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setTimestamp(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "auth_token")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "auth_token" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setAuth_token(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "api_secret")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "api_secret" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setApi_secret(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "cg_id")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "cg_id" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setCg_id(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "email")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "email" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setEmail(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "alumni_email")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "alumni_email" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setAlumni_email(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "first_name")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "first_name" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setFirst_name(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "last_name")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "last_name" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setLast_name(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "middle_initial")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "middle_initial" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setMiddle_initial(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "gender_lookup")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "gender_lookup" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setGender_lookup(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "gender_pronoun_lookup")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "gender_pronoun_lookup" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setGender_pronoun_lookup(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "account_type_lookup")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "account_type_lookup" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setAccount_type_lookup(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "school_program")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "school_program" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setSchool_program(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "degree")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "degree" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setDegree(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "month_of_entry_lookup")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "month_of_entry_lookup" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setMonth_of_entry_lookup(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "year_of_entry_lookup")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "year_of_entry_lookup" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setYear_of_entry_lookup(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "month_of_grad_lookup")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "month_of_grad_lookup" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setMonth_of_grad_lookup(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "year_of_grad_lookup")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "year_of_grad_lookup" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setYear_of_grad_lookup(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "phone_number")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "phone_number" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setPhone_number(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "mobile_number")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "mobile_number" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setMobile_number(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "street_address")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "street_address" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setStreet_address(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "city")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "city" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setCity(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "state")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "state" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setState(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "zipcode")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "zipcode" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setZipcode(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "country_lookup")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "country_lookup" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setCountry_lookup(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "nationality_lookup")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "nationality_lookup" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setNationality_lookup(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "account_status")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "account_status" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setAccount_status(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "company_name")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "company_name" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setCompany_name(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "work_title")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "work_title" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setWork_title(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "bio")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "bio" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setBio(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "linkedin")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "linkedin" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setLinkedin(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "facebook")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "facebook" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setFacebook(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "twitter")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "twitter" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setTwitter(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "google_plus")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "google_plus" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setGoogle_plus(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "netid")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "netid" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setNetid(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "netid2")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "netid2" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setNetid2(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "swipeId")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "swipeId" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setSwipeId(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "rfid")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "rfid" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setRfid(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName(
                  "http://campusgroups.com/", "business_street_address")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "business_street_address" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setBusiness_street_address(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "business_department")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "business_department" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setBusiness_department(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "business_phone_number")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "business_phone_number" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setBusiness_phone_number(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "languages_selection")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "languages_selection" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setLanguages_selection(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName(
                  "http://campusgroups.com/", "nationalities_selection")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "nationalities_selection" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setNationalities_selection(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "user_tags")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "user_tags" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setUser_tags(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName(
                  "http://campusgroups.com/", "keep_existing_user_tags")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "keep_existing_user_tags" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setKeep_existing_user_tags(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName(
                  "http://campusgroups.com/", "new_user_tags_are_admin_only")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "new_user_tags_are_admin_only" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setNew_user_tags_are_admin_only(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "external_id")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "external_id" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setExternal_id(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "netid3")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "netid3" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setNetid3(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "external_guid")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "external_guid" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setExternal_guid(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "hide_profile_page")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "hide_profile_page" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setHide_profile_page(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "hide_from_directory")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "hide_from_directory" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setHide_from_directory(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName(
                  "http://campusgroups.com/", "unsubscribe_all_group_emails")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "unsubscribe_all_group_emails" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setUnsubscribe_all_group_emails(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "other_email")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "other_email" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setOther_email(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "custom_fields")
                  .equals(reader.getName())) {

            object.setCustom_fields(ArrayOfCustom_field.Factory.parse(reader));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "official_name")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "official_name" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setOfficial_name(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "legal_first_name")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "legal_first_name" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setLegal_first_name(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "maiden_name")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "maiden_name" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setMaiden_name(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "date_of_birth")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "date_of_birth" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setDate_of_birth(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName(
                  "http://campusgroups.com/", "check_existing_deactivated_users_if_needed")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: "
                              + "check_existing_deactivated_users_if_needed"
                              + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setCheck_existing_deactivated_users_if_needed(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName(
                  "http://campusgroups.com/",
                  "force_overwrite_of_data_even_if_not_flagged_read_only")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: "
                              + "force_overwrite_of_data_even_if_not_flagged_read_only"
                              + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setForce_overwrite_of_data_even_if_not_flagged_read_only(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "over_21")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "over_21" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setOver_21(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "qrcode")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "qrcode" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setQrcode(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "barcode")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "barcode" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setBarcode(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "preferred_email")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "preferred_email" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setPreferred_email(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "career_interests")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "career_interests" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setCareer_interests(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class CreateUpdateWorkExperience implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
            new javax.xml.namespace.QName(
                    "http://campusgroups.com/", "CreateUpdateWorkExperience", "ns1");

    /**
     * field for School
     */
    protected java.lang.String localSchool;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSchoolTracker = false;

    public boolean isSchoolSpecified() {
      return localSchoolTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getSchool() {
      return localSchool;
    }

    /**
     * Auto generated setter method
     *
     * @param param School
     */
    public void setSchool(java.lang.String param) {
      localSchoolTracker = param != null;

      this.localSchool = param;
    }

    /**
     * field for Timestamp
     */
    protected java.lang.String localTimestamp;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTimestampTracker = false;

    public boolean isTimestampSpecified() {
      return localTimestampTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getTimestamp() {
      return localTimestamp;
    }

    /**
     * Auto generated setter method
     *
     * @param param Timestamp
     */
    public void setTimestamp(java.lang.String param) {
      localTimestampTracker = param != null;

      this.localTimestamp = param;
    }

    /**
     * field for Auth_token
     */
    protected java.lang.String localAuth_token;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAuth_tokenTracker = false;

    public boolean isAuth_tokenSpecified() {
      return localAuth_tokenTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getAuth_token() {
      return localAuth_token;
    }

    /**
     * Auto generated setter method
     *
     * @param param Auth_token
     */
    public void setAuth_token(java.lang.String param) {
      localAuth_tokenTracker = param != null;

      this.localAuth_token = param;
    }

    /**
     * field for Experience_cgid
     */
    protected java.lang.String localExperience_cgid;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localExperience_cgidTracker = false;

    public boolean isExperience_cgidSpecified() {
      return localExperience_cgidTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getExperience_cgid() {
      return localExperience_cgid;
    }

    /**
     * Auto generated setter method
     *
     * @param param Experience_cgid
     */
    public void setExperience_cgid(java.lang.String param) {
      localExperience_cgidTracker = param != null;

      this.localExperience_cgid = param;
    }

    /**
     * field for Experience_externalid
     */
    protected java.lang.String localExperience_externalid;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localExperience_externalidTracker = false;

    public boolean isExperience_externalidSpecified() {
      return localExperience_externalidTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getExperience_externalid() {
      return localExperience_externalid;
    }

    /**
     * Auto generated setter method
     *
     * @param param Experience_externalid
     */
    public void setExperience_externalid(java.lang.String param) {
      localExperience_externalidTracker = param != null;

      this.localExperience_externalid = param;
    }

    /**
     * field for User_cgid
     */
    protected java.lang.String localUser_cgid;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localUser_cgidTracker = false;

    public boolean isUser_cgidSpecified() {
      return localUser_cgidTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getUser_cgid() {
      return localUser_cgid;
    }

    /**
     * Auto generated setter method
     *
     * @param param User_cgid
     */
    public void setUser_cgid(java.lang.String param) {
      localUser_cgidTracker = param != null;

      this.localUser_cgid = param;
    }

    /**
     * field for User_email
     */
    protected java.lang.String localUser_email;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localUser_emailTracker = false;

    public boolean isUser_emailSpecified() {
      return localUser_emailTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getUser_email() {
      return localUser_email;
    }

    /**
     * Auto generated setter method
     *
     * @param param User_email
     */
    public void setUser_email(java.lang.String param) {
      localUser_emailTracker = param != null;

      this.localUser_email = param;
    }

    /**
     * field for User_netid
     */
    protected java.lang.String localUser_netid;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localUser_netidTracker = false;

    public boolean isUser_netidSpecified() {
      return localUser_netidTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getUser_netid() {
      return localUser_netid;
    }

    /**
     * Auto generated setter method
     *
     * @param param User_netid
     */
    public void setUser_netid(java.lang.String param) {
      localUser_netidTracker = param != null;

      this.localUser_netid = param;
    }

    /**
     * field for User_netid2
     */
    protected java.lang.String localUser_netid2;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localUser_netid2Tracker = false;

    public boolean isUser_netid2Specified() {
      return localUser_netid2Tracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getUser_netid2() {
      return localUser_netid2;
    }

    /**
     * Auto generated setter method
     *
     * @param param User_netid2
     */
    public void setUser_netid2(java.lang.String param) {
      localUser_netid2Tracker = param != null;

      this.localUser_netid2 = param;
    }

    /**
     * field for User_netid3
     */
    protected java.lang.String localUser_netid3;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localUser_netid3Tracker = false;

    public boolean isUser_netid3Specified() {
      return localUser_netid3Tracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getUser_netid3() {
      return localUser_netid3;
    }

    /**
     * Auto generated setter method
     *
     * @param param User_netid3
     */
    public void setUser_netid3(java.lang.String param) {
      localUser_netid3Tracker = param != null;

      this.localUser_netid3 = param;
    }

    /**
     * field for User_externalid
     */
    protected java.lang.String localUser_externalid;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localUser_externalidTracker = false;

    public boolean isUser_externalidSpecified() {
      return localUser_externalidTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getUser_externalid() {
      return localUser_externalid;
    }

    /**
     * Auto generated setter method
     *
     * @param param User_externalid
     */
    public void setUser_externalid(java.lang.String param) {
      localUser_externalidTracker = param != null;

      this.localUser_externalid = param;
    }

    /**
     * field for User_externalguid
     */
    protected java.lang.String localUser_externalguid;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localUser_externalguidTracker = false;

    public boolean isUser_externalguidSpecified() {
      return localUser_externalguidTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getUser_externalguid() {
      return localUser_externalguid;
    }

    /**
     * Auto generated setter method
     *
     * @param param User_externalguid
     */
    public void setUser_externalguid(java.lang.String param) {
      localUser_externalguidTracker = param != null;

      this.localUser_externalguid = param;
    }

    /**
     * field for Company_name
     */
    protected java.lang.String localCompany_name;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCompany_nameTracker = false;

    public boolean isCompany_nameSpecified() {
      return localCompany_nameTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCompany_name() {
      return localCompany_name;
    }

    /**
     * Auto generated setter method
     *
     * @param param Company_name
     */
    public void setCompany_name(java.lang.String param) {
      localCompany_nameTracker = param != null;

      this.localCompany_name = param;
    }

    /**
     * field for Industry
     */
    protected java.lang.String localIndustry;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localIndustryTracker = false;

    public boolean isIndustrySpecified() {
      return localIndustryTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getIndustry() {
      return localIndustry;
    }

    /**
     * Auto generated setter method
     *
     * @param param Industry
     */
    public void setIndustry(java.lang.String param) {
      localIndustryTracker = param != null;

      this.localIndustry = param;
    }

    /**
     * field for Department
     */
    protected java.lang.String localDepartment;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDepartmentTracker = false;

    public boolean isDepartmentSpecified() {
      return localDepartmentTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getDepartment() {
      return localDepartment;
    }

    /**
     * Auto generated setter method
     *
     * @param param Department
     */
    public void setDepartment(java.lang.String param) {
      localDepartmentTracker = param != null;

      this.localDepartment = param;
    }

    /**
     * field for Title
     */
    protected java.lang.String localTitle;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTitleTracker = false;

    public boolean isTitleSpecified() {
      return localTitleTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getTitle() {
      return localTitle;
    }

    /**
     * Auto generated setter method
     *
     * @param param Title
     */
    public void setTitle(java.lang.String param) {
      localTitleTracker = param != null;

      this.localTitle = param;
    }

    /**
     * field for Location
     */
    protected java.lang.String localLocation;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localLocationTracker = false;

    public boolean isLocationSpecified() {
      return localLocationTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getLocation() {
      return localLocation;
    }

    /**
     * Auto generated setter method
     *
     * @param param Location
     */
    public void setLocation(java.lang.String param) {
      localLocationTracker = param != null;

      this.localLocation = param;
    }

    /**
     * field for Country
     */
    protected java.lang.String localCountry;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCountryTracker = false;

    public boolean isCountrySpecified() {
      return localCountryTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCountry() {
      return localCountry;
    }

    /**
     * Auto generated setter method
     *
     * @param param Country
     */
    public void setCountry(java.lang.String param) {
      localCountryTracker = param != null;

      this.localCountry = param;
    }

    /**
     * field for Start_month
     */
    protected java.lang.String localStart_month;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localStart_monthTracker = false;

    public boolean isStart_monthSpecified() {
      return localStart_monthTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getStart_month() {
      return localStart_month;
    }

    /**
     * Auto generated setter method
     *
     * @param param Start_month
     */
    public void setStart_month(java.lang.String param) {
      localStart_monthTracker = param != null;

      this.localStart_month = param;
    }

    /**
     * field for Start_year
     */
    protected java.lang.String localStart_year;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localStart_yearTracker = false;

    public boolean isStart_yearSpecified() {
      return localStart_yearTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getStart_year() {
      return localStart_year;
    }

    /**
     * Auto generated setter method
     *
     * @param param Start_year
     */
    public void setStart_year(java.lang.String param) {
      localStart_yearTracker = param != null;

      this.localStart_year = param;
    }

    /**
     * field for End_month
     */
    protected java.lang.String localEnd_month;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEnd_monthTracker = false;

    public boolean isEnd_monthSpecified() {
      return localEnd_monthTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getEnd_month() {
      return localEnd_month;
    }

    /**
     * Auto generated setter method
     *
     * @param param End_month
     */
    public void setEnd_month(java.lang.String param) {
      localEnd_monthTracker = param != null;

      this.localEnd_month = param;
    }

    /**
     * field for End_year
     */
    protected java.lang.String localEnd_year;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEnd_yearTracker = false;

    public boolean isEnd_yearSpecified() {
      return localEnd_yearTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getEnd_year() {
      return localEnd_year;
    }

    /**
     * Auto generated setter method
     *
     * @param param End_year
     */
    public void setEnd_year(java.lang.String param) {
      localEnd_yearTracker = param != null;

      this.localEnd_year = param;
    }

    /**
     * field for Delete
     */
    protected java.lang.String localDelete;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDeleteTracker = false;

    public boolean isDeleteSpecified() {
      return localDeleteTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getDelete() {
      return localDelete;
    }

    /**
     * Auto generated setter method
     *
     * @param param Delete
     */
    public void setDelete(java.lang.String param) {
      localDeleteTracker = param != null;

      this.localDelete = param;
    }

    /**
     * field for Custom_fields
     */
    protected ArrayOfCustom_field localCustom_fields;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCustom_fieldsTracker = false;

    public boolean isCustom_fieldsSpecified() {
      return localCustom_fieldsTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return ArrayOfCustom_field
     */
    public ArrayOfCustom_field getCustom_fields() {
      return localCustom_fields;
    }

    /**
     * Auto generated setter method
     *
     * @param param Custom_fields
     */
    public void setCustom_fields(ArrayOfCustom_field param) {
      localCustom_fieldsTracker = param != null;

      this.localCustom_fields = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
              new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
            final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
            final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter,
            boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://campusgroups.com/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
                  "xsi",
                  "http://www.w3.org/2001/XMLSchema-instance",
                  "type",
                  namespacePrefix + ":CreateUpdateWorkExperience",
                  xmlWriter);
        } else {
          writeAttribute(
                  "xsi",
                  "http://www.w3.org/2001/XMLSchema-instance",
                  "type",
                  "CreateUpdateWorkExperience",
                  xmlWriter);
        }
      }
      if (localSchoolTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "school", xmlWriter);

        if (localSchool == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("school cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localSchool);
        }

        xmlWriter.writeEndElement();
      }
      if (localTimestampTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "timestamp", xmlWriter);

        if (localTimestamp == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("timestamp cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localTimestamp);
        }

        xmlWriter.writeEndElement();
      }
      if (localAuth_tokenTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "auth_token", xmlWriter);

        if (localAuth_token == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("auth_token cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localAuth_token);
        }

        xmlWriter.writeEndElement();
      }
      if (localExperience_cgidTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "experience_cgid", xmlWriter);

        if (localExperience_cgid == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("experience_cgid cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localExperience_cgid);
        }

        xmlWriter.writeEndElement();
      }
      if (localExperience_externalidTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "experience_externalid", xmlWriter);

        if (localExperience_externalid == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException(
                  "experience_externalid cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localExperience_externalid);
        }

        xmlWriter.writeEndElement();
      }
      if (localUser_cgidTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "user_cgid", xmlWriter);

        if (localUser_cgid == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("user_cgid cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localUser_cgid);
        }

        xmlWriter.writeEndElement();
      }
      if (localUser_emailTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "user_email", xmlWriter);

        if (localUser_email == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("user_email cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localUser_email);
        }

        xmlWriter.writeEndElement();
      }
      if (localUser_netidTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "user_netid", xmlWriter);

        if (localUser_netid == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("user_netid cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localUser_netid);
        }

        xmlWriter.writeEndElement();
      }
      if (localUser_netid2Tracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "user_netid2", xmlWriter);

        if (localUser_netid2 == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("user_netid2 cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localUser_netid2);
        }

        xmlWriter.writeEndElement();
      }
      if (localUser_netid3Tracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "user_netid3", xmlWriter);

        if (localUser_netid3 == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("user_netid3 cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localUser_netid3);
        }

        xmlWriter.writeEndElement();
      }
      if (localUser_externalidTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "user_externalid", xmlWriter);

        if (localUser_externalid == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("user_externalid cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localUser_externalid);
        }

        xmlWriter.writeEndElement();
      }
      if (localUser_externalguidTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "user_externalguid", xmlWriter);

        if (localUser_externalguid == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("user_externalguid cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localUser_externalguid);
        }

        xmlWriter.writeEndElement();
      }
      if (localCompany_nameTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "company_name", xmlWriter);

        if (localCompany_name == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("company_name cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localCompany_name);
        }

        xmlWriter.writeEndElement();
      }
      if (localIndustryTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "industry", xmlWriter);

        if (localIndustry == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("industry cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localIndustry);
        }

        xmlWriter.writeEndElement();
      }
      if (localDepartmentTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "department", xmlWriter);

        if (localDepartment == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("department cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localDepartment);
        }

        xmlWriter.writeEndElement();
      }
      if (localTitleTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "title", xmlWriter);

        if (localTitle == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("title cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localTitle);
        }

        xmlWriter.writeEndElement();
      }
      if (localLocationTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "location", xmlWriter);

        if (localLocation == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("location cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localLocation);
        }

        xmlWriter.writeEndElement();
      }
      if (localCountryTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "country", xmlWriter);

        if (localCountry == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("country cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localCountry);
        }

        xmlWriter.writeEndElement();
      }
      if (localStart_monthTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "start_month", xmlWriter);

        if (localStart_month == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("start_month cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localStart_month);
        }

        xmlWriter.writeEndElement();
      }
      if (localStart_yearTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "start_year", xmlWriter);

        if (localStart_year == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("start_year cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localStart_year);
        }

        xmlWriter.writeEndElement();
      }
      if (localEnd_monthTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "end_month", xmlWriter);

        if (localEnd_month == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("end_month cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localEnd_month);
        }

        xmlWriter.writeEndElement();
      }
      if (localEnd_yearTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "end_year", xmlWriter);

        if (localEnd_year == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("end_year cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localEnd_year);
        }

        xmlWriter.writeEndElement();
      }
      if (localDeleteTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "delete", xmlWriter);

        if (localDelete == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("delete cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localDelete);
        }

        xmlWriter.writeEndElement();
      }
      if (localCustom_fieldsTracker) {
        if (localCustom_fields == null) {
          throw new org.apache.axis2.databinding.ADBException("custom_fields cannot be null!!");
        }
        localCustom_fields.serialize(
                new javax.xml.namespace.QName("http://campusgroups.com/", "custom_fields"), xmlWriter);
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://campusgroups.com/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(
            java.lang.String prefix,
            java.lang.String namespace,
            java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(
            java.lang.String prefix,
            java.lang.String namespace,
            java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(
            java.lang.String namespace,
            java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
                registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(
            java.lang.String namespace,
            java.lang.String attName,
            javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /**
     * method to handle Qnames
     */
    private void writeQName(
            javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
                  prefix
                          + ":"
                          + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
            javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                      .append(prefix)
                      .append(":")
                      .append(
                              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /**
     * Factory class that keeps the parse method
     */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
              org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static CreateUpdateWorkExperience parse(javax.xml.stream.XMLStreamReader reader)
              throws java.lang.Exception {
        CreateUpdateWorkExperience object = new CreateUpdateWorkExperience();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
                  != null) {
            java.lang.String fullTypeName =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"CreateUpdateWorkExperience".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (CreateUpdateWorkExperience)
                        ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "school")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "school" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setSchool(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "timestamp")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "timestamp" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setTimestamp(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "auth_token")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "auth_token" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setAuth_token(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "experience_cgid")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "experience_cgid" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setExperience_cgid(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "experience_externalid")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "experience_externalid" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setExperience_externalid(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "user_cgid")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "user_cgid" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setUser_cgid(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "user_email")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "user_email" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setUser_email(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "user_netid")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "user_netid" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setUser_netid(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "user_netid2")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "user_netid2" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setUser_netid2(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "user_netid3")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "user_netid3" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setUser_netid3(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "user_externalid")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "user_externalid" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setUser_externalid(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "user_externalguid")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "user_externalguid" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setUser_externalguid(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "company_name")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "company_name" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setCompany_name(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "industry")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "industry" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setIndustry(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "department")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "department" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setDepartment(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "title")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "title" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setTitle(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "location")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "location" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setLocation(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "country")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "country" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setCountry(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "start_month")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "start_month" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setStart_month(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "start_year")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "start_year" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setStart_year(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "end_month")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "end_month" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setEnd_month(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "end_year")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "end_year" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setEnd_year(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "delete")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "delete" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setDelete(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "custom_fields")
                  .equals(reader.getName())) {

            object.setCustom_fields(ArrayOfCustom_field.Factory.parse(reader));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class CreateUpdateWorkExperienceResponse
          implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
            new javax.xml.namespace.QName(
                    "http://campusgroups.com/", "CreateUpdateWorkExperienceResponse", "ns1");

    /**
     * field for CreateUpdateWorkExperienceResult
     */
    protected APIExperienceResult localCreateUpdateWorkExperienceResult;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCreateUpdateWorkExperienceResultTracker = false;

    public boolean isCreateUpdateWorkExperienceResultSpecified() {
      return localCreateUpdateWorkExperienceResultTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return APIExperienceResult
     */
    public APIExperienceResult getCreateUpdateWorkExperienceResult() {
      return localCreateUpdateWorkExperienceResult;
    }

    /**
     * Auto generated setter method
     *
     * @param param CreateUpdateWorkExperienceResult
     */
    public void setCreateUpdateWorkExperienceResult(APIExperienceResult param) {
      localCreateUpdateWorkExperienceResultTracker = param != null;

      this.localCreateUpdateWorkExperienceResult = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
              new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
            final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
            final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter,
            boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://campusgroups.com/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
                  "xsi",
                  "http://www.w3.org/2001/XMLSchema-instance",
                  "type",
                  namespacePrefix + ":CreateUpdateWorkExperienceResponse",
                  xmlWriter);
        } else {
          writeAttribute(
                  "xsi",
                  "http://www.w3.org/2001/XMLSchema-instance",
                  "type",
                  "CreateUpdateWorkExperienceResponse",
                  xmlWriter);
        }
      }
      if (localCreateUpdateWorkExperienceResultTracker) {
        if (localCreateUpdateWorkExperienceResult == null) {
          throw new org.apache.axis2.databinding.ADBException(
                  "CreateUpdateWorkExperienceResult cannot be null!!");
        }
        localCreateUpdateWorkExperienceResult.serialize(
                new javax.xml.namespace.QName(
                        "http://campusgroups.com/", "CreateUpdateWorkExperienceResult"),
                xmlWriter);
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://campusgroups.com/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(
            java.lang.String prefix,
            java.lang.String namespace,
            java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(
            java.lang.String prefix,
            java.lang.String namespace,
            java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(
            java.lang.String namespace,
            java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
                registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(
            java.lang.String namespace,
            java.lang.String attName,
            javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /**
     * method to handle Qnames
     */
    private void writeQName(
            javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
                  prefix
                          + ":"
                          + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
            javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                      .append(prefix)
                      .append(":")
                      .append(
                              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /**
     * Factory class that keeps the parse method
     */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
              org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static CreateUpdateWorkExperienceResponse parse(
              javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
        CreateUpdateWorkExperienceResponse object = new CreateUpdateWorkExperienceResponse();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
                  != null) {
            java.lang.String fullTypeName =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"CreateUpdateWorkExperienceResponse".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (CreateUpdateWorkExperienceResponse)
                        ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName(
                  "http://campusgroups.com/", "CreateUpdateWorkExperienceResult")
                  .equals(reader.getName())) {

            object.setCreateUpdateWorkExperienceResult(APIExperienceResult.Factory.parse(reader));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class CreateUpdateAcademicExperience
          implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
            new javax.xml.namespace.QName(
                    "http://campusgroups.com/", "CreateUpdateAcademicExperience", "ns1");

    /**
     * field for School
     */
    protected java.lang.String localSchool;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSchoolTracker = false;

    public boolean isSchoolSpecified() {
      return localSchoolTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getSchool() {
      return localSchool;
    }

    /**
     * Auto generated setter method
     *
     * @param param School
     */
    public void setSchool(java.lang.String param) {
      localSchoolTracker = param != null;

      this.localSchool = param;
    }

    /**
     * field for Timestamp
     */
    protected java.lang.String localTimestamp;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTimestampTracker = false;

    public boolean isTimestampSpecified() {
      return localTimestampTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getTimestamp() {
      return localTimestamp;
    }

    /**
     * Auto generated setter method
     *
     * @param param Timestamp
     */
    public void setTimestamp(java.lang.String param) {
      localTimestampTracker = param != null;

      this.localTimestamp = param;
    }

    /**
     * field for Auth_token
     */
    protected java.lang.String localAuth_token;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAuth_tokenTracker = false;

    public boolean isAuth_tokenSpecified() {
      return localAuth_tokenTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getAuth_token() {
      return localAuth_token;
    }

    /**
     * Auto generated setter method
     *
     * @param param Auth_token
     */
    public void setAuth_token(java.lang.String param) {
      localAuth_tokenTracker = param != null;

      this.localAuth_token = param;
    }

    /**
     * field for Experience_cgid
     */
    protected java.lang.String localExperience_cgid;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localExperience_cgidTracker = false;

    public boolean isExperience_cgidSpecified() {
      return localExperience_cgidTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getExperience_cgid() {
      return localExperience_cgid;
    }

    /**
     * Auto generated setter method
     *
     * @param param Experience_cgid
     */
    public void setExperience_cgid(java.lang.String param) {
      localExperience_cgidTracker = param != null;

      this.localExperience_cgid = param;
    }

    /**
     * field for Experience_externalid
     */
    protected java.lang.String localExperience_externalid;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localExperience_externalidTracker = false;

    public boolean isExperience_externalidSpecified() {
      return localExperience_externalidTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getExperience_externalid() {
      return localExperience_externalid;
    }

    /**
     * Auto generated setter method
     *
     * @param param Experience_externalid
     */
    public void setExperience_externalid(java.lang.String param) {
      localExperience_externalidTracker = param != null;

      this.localExperience_externalid = param;
    }

    /**
     * field for User_cgid
     */
    protected java.lang.String localUser_cgid;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localUser_cgidTracker = false;

    public boolean isUser_cgidSpecified() {
      return localUser_cgidTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getUser_cgid() {
      return localUser_cgid;
    }

    /**
     * Auto generated setter method
     *
     * @param param User_cgid
     */
    public void setUser_cgid(java.lang.String param) {
      localUser_cgidTracker = param != null;

      this.localUser_cgid = param;
    }

    /**
     * field for User_email
     */
    protected java.lang.String localUser_email;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localUser_emailTracker = false;

    public boolean isUser_emailSpecified() {
      return localUser_emailTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getUser_email() {
      return localUser_email;
    }

    /**
     * Auto generated setter method
     *
     * @param param User_email
     */
    public void setUser_email(java.lang.String param) {
      localUser_emailTracker = param != null;

      this.localUser_email = param;
    }

    /**
     * field for User_netid
     */
    protected java.lang.String localUser_netid;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localUser_netidTracker = false;

    public boolean isUser_netidSpecified() {
      return localUser_netidTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getUser_netid() {
      return localUser_netid;
    }

    /**
     * Auto generated setter method
     *
     * @param param User_netid
     */
    public void setUser_netid(java.lang.String param) {
      localUser_netidTracker = param != null;

      this.localUser_netid = param;
    }

    /**
     * field for User_netid2
     */
    protected java.lang.String localUser_netid2;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localUser_netid2Tracker = false;

    public boolean isUser_netid2Specified() {
      return localUser_netid2Tracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getUser_netid2() {
      return localUser_netid2;
    }

    /**
     * Auto generated setter method
     *
     * @param param User_netid2
     */
    public void setUser_netid2(java.lang.String param) {
      localUser_netid2Tracker = param != null;

      this.localUser_netid2 = param;
    }

    /**
     * field for User_netid3
     */
    protected java.lang.String localUser_netid3;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localUser_netid3Tracker = false;

    public boolean isUser_netid3Specified() {
      return localUser_netid3Tracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getUser_netid3() {
      return localUser_netid3;
    }

    /**
     * Auto generated setter method
     *
     * @param param User_netid3
     */
    public void setUser_netid3(java.lang.String param) {
      localUser_netid3Tracker = param != null;

      this.localUser_netid3 = param;
    }

    /**
     * field for User_externalid
     */
    protected java.lang.String localUser_externalid;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localUser_externalidTracker = false;

    public boolean isUser_externalidSpecified() {
      return localUser_externalidTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getUser_externalid() {
      return localUser_externalid;
    }

    /**
     * Auto generated setter method
     *
     * @param param User_externalid
     */
    public void setUser_externalid(java.lang.String param) {
      localUser_externalidTracker = param != null;

      this.localUser_externalid = param;
    }

    /**
     * field for User_externalguid
     */
    protected java.lang.String localUser_externalguid;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localUser_externalguidTracker = false;

    public boolean isUser_externalguidSpecified() {
      return localUser_externalguidTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getUser_externalguid() {
      return localUser_externalguid;
    }

    /**
     * Auto generated setter method
     *
     * @param param User_externalguid
     */
    public void setUser_externalguid(java.lang.String param) {
      localUser_externalguidTracker = param != null;

      this.localUser_externalguid = param;
    }

    /**
     * field for University
     */
    protected java.lang.String localUniversity;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localUniversityTracker = false;

    public boolean isUniversitySpecified() {
      return localUniversityTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getUniversity() {
      return localUniversity;
    }

    /**
     * Auto generated setter method
     *
     * @param param University
     */
    public void setUniversity(java.lang.String param) {
      localUniversityTracker = param != null;

      this.localUniversity = param;
    }

    /**
     * field for Degree
     */
    protected java.lang.String localDegree;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDegreeTracker = false;

    public boolean isDegreeSpecified() {
      return localDegreeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getDegree() {
      return localDegree;
    }

    /**
     * Auto generated setter method
     *
     * @param param Degree
     */
    public void setDegree(java.lang.String param) {
      localDegreeTracker = param != null;

      this.localDegree = param;
    }

    /**
     * field for Study_field
     */
    protected java.lang.String localStudy_field;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localStudy_fieldTracker = false;

    public boolean isStudy_fieldSpecified() {
      return localStudy_fieldTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getStudy_field() {
      return localStudy_field;
    }

    /**
     * Auto generated setter method
     *
     * @param param Study_field
     */
    public void setStudy_field(java.lang.String param) {
      localStudy_fieldTracker = param != null;

      this.localStudy_field = param;
    }

    /**
     * field for Location
     */
    protected java.lang.String localLocation;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localLocationTracker = false;

    public boolean isLocationSpecified() {
      return localLocationTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getLocation() {
      return localLocation;
    }

    /**
     * Auto generated setter method
     *
     * @param param Location
     */
    public void setLocation(java.lang.String param) {
      localLocationTracker = param != null;

      this.localLocation = param;
    }

    /**
     * field for Activities
     */
    protected java.lang.String localActivities;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localActivitiesTracker = false;

    public boolean isActivitiesSpecified() {
      return localActivitiesTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getActivities() {
      return localActivities;
    }

    /**
     * Auto generated setter method
     *
     * @param param Activities
     */
    public void setActivities(java.lang.String param) {
      localActivitiesTracker = param != null;

      this.localActivities = param;
    }

    /**
     * field for Start_year
     */
    protected java.lang.String localStart_year;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localStart_yearTracker = false;

    public boolean isStart_yearSpecified() {
      return localStart_yearTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getStart_year() {
      return localStart_year;
    }

    /**
     * Auto generated setter method
     *
     * @param param Start_year
     */
    public void setStart_year(java.lang.String param) {
      localStart_yearTracker = param != null;

      this.localStart_year = param;
    }

    /**
     * field for End_year
     */
    protected java.lang.String localEnd_year;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEnd_yearTracker = false;

    public boolean isEnd_yearSpecified() {
      return localEnd_yearTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getEnd_year() {
      return localEnd_year;
    }

    /**
     * Auto generated setter method
     *
     * @param param End_year
     */
    public void setEnd_year(java.lang.String param) {
      localEnd_yearTracker = param != null;

      this.localEnd_year = param;
    }

    /**
     * field for Delete
     */
    protected java.lang.String localDelete;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDeleteTracker = false;

    public boolean isDeleteSpecified() {
      return localDeleteTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getDelete() {
      return localDelete;
    }

    /**
     * Auto generated setter method
     *
     * @param param Delete
     */
    public void setDelete(java.lang.String param) {
      localDeleteTracker = param != null;

      this.localDelete = param;
    }

    /**
     * field for Custom_fields
     */
    protected ArrayOfCustom_field localCustom_fields;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCustom_fieldsTracker = false;

    public boolean isCustom_fieldsSpecified() {
      return localCustom_fieldsTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return ArrayOfCustom_field
     */
    public ArrayOfCustom_field getCustom_fields() {
      return localCustom_fields;
    }

    /**
     * Auto generated setter method
     *
     * @param param Custom_fields
     */
    public void setCustom_fields(ArrayOfCustom_field param) {
      localCustom_fieldsTracker = param != null;

      this.localCustom_fields = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
              new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
            final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
            final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter,
            boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://campusgroups.com/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
                  "xsi",
                  "http://www.w3.org/2001/XMLSchema-instance",
                  "type",
                  namespacePrefix + ":CreateUpdateAcademicExperience",
                  xmlWriter);
        } else {
          writeAttribute(
                  "xsi",
                  "http://www.w3.org/2001/XMLSchema-instance",
                  "type",
                  "CreateUpdateAcademicExperience",
                  xmlWriter);
        }
      }
      if (localSchoolTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "school", xmlWriter);

        if (localSchool == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("school cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localSchool);
        }

        xmlWriter.writeEndElement();
      }
      if (localTimestampTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "timestamp", xmlWriter);

        if (localTimestamp == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("timestamp cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localTimestamp);
        }

        xmlWriter.writeEndElement();
      }
      if (localAuth_tokenTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "auth_token", xmlWriter);

        if (localAuth_token == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("auth_token cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localAuth_token);
        }

        xmlWriter.writeEndElement();
      }
      if (localExperience_cgidTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "experience_cgid", xmlWriter);

        if (localExperience_cgid == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("experience_cgid cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localExperience_cgid);
        }

        xmlWriter.writeEndElement();
      }
      if (localExperience_externalidTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "experience_externalid", xmlWriter);

        if (localExperience_externalid == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException(
                  "experience_externalid cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localExperience_externalid);
        }

        xmlWriter.writeEndElement();
      }
      if (localUser_cgidTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "user_cgid", xmlWriter);

        if (localUser_cgid == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("user_cgid cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localUser_cgid);
        }

        xmlWriter.writeEndElement();
      }
      if (localUser_emailTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "user_email", xmlWriter);

        if (localUser_email == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("user_email cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localUser_email);
        }

        xmlWriter.writeEndElement();
      }
      if (localUser_netidTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "user_netid", xmlWriter);

        if (localUser_netid == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("user_netid cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localUser_netid);
        }

        xmlWriter.writeEndElement();
      }
      if (localUser_netid2Tracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "user_netid2", xmlWriter);

        if (localUser_netid2 == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("user_netid2 cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localUser_netid2);
        }

        xmlWriter.writeEndElement();
      }
      if (localUser_netid3Tracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "user_netid3", xmlWriter);

        if (localUser_netid3 == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("user_netid3 cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localUser_netid3);
        }

        xmlWriter.writeEndElement();
      }
      if (localUser_externalidTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "user_externalid", xmlWriter);

        if (localUser_externalid == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("user_externalid cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localUser_externalid);
        }

        xmlWriter.writeEndElement();
      }
      if (localUser_externalguidTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "user_externalguid", xmlWriter);

        if (localUser_externalguid == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("user_externalguid cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localUser_externalguid);
        }

        xmlWriter.writeEndElement();
      }
      if (localUniversityTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "university", xmlWriter);

        if (localUniversity == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("university cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localUniversity);
        }

        xmlWriter.writeEndElement();
      }
      if (localDegreeTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "degree", xmlWriter);

        if (localDegree == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("degree cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localDegree);
        }

        xmlWriter.writeEndElement();
      }
      if (localStudy_fieldTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "study_field", xmlWriter);

        if (localStudy_field == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("study_field cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localStudy_field);
        }

        xmlWriter.writeEndElement();
      }
      if (localLocationTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "location", xmlWriter);

        if (localLocation == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("location cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localLocation);
        }

        xmlWriter.writeEndElement();
      }
      if (localActivitiesTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "activities", xmlWriter);

        if (localActivities == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("activities cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localActivities);
        }

        xmlWriter.writeEndElement();
      }
      if (localStart_yearTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "start_year", xmlWriter);

        if (localStart_year == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("start_year cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localStart_year);
        }

        xmlWriter.writeEndElement();
      }
      if (localEnd_yearTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "end_year", xmlWriter);

        if (localEnd_year == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("end_year cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localEnd_year);
        }

        xmlWriter.writeEndElement();
      }
      if (localDeleteTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "delete", xmlWriter);

        if (localDelete == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("delete cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localDelete);
        }

        xmlWriter.writeEndElement();
      }
      if (localCustom_fieldsTracker) {
        if (localCustom_fields == null) {
          throw new org.apache.axis2.databinding.ADBException("custom_fields cannot be null!!");
        }
        localCustom_fields.serialize(
                new javax.xml.namespace.QName("http://campusgroups.com/", "custom_fields"), xmlWriter);
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://campusgroups.com/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(
            java.lang.String prefix,
            java.lang.String namespace,
            java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(
            java.lang.String prefix,
            java.lang.String namespace,
            java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(
            java.lang.String namespace,
            java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
                registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(
            java.lang.String namespace,
            java.lang.String attName,
            javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /**
     * method to handle Qnames
     */
    private void writeQName(
            javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
                  prefix
                          + ":"
                          + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
            javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                      .append(prefix)
                      .append(":")
                      .append(
                              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /**
     * Factory class that keeps the parse method
     */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
              org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static CreateUpdateAcademicExperience parse(javax.xml.stream.XMLStreamReader reader)
              throws java.lang.Exception {
        CreateUpdateAcademicExperience object = new CreateUpdateAcademicExperience();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
                  != null) {
            java.lang.String fullTypeName =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"CreateUpdateAcademicExperience".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (CreateUpdateAcademicExperience)
                        ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "school")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "school" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setSchool(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "timestamp")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "timestamp" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setTimestamp(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "auth_token")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "auth_token" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setAuth_token(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "experience_cgid")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "experience_cgid" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setExperience_cgid(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "experience_externalid")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "experience_externalid" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setExperience_externalid(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "user_cgid")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "user_cgid" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setUser_cgid(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "user_email")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "user_email" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setUser_email(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "user_netid")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "user_netid" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setUser_netid(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "user_netid2")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "user_netid2" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setUser_netid2(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "user_netid3")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "user_netid3" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setUser_netid3(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "user_externalid")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "user_externalid" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setUser_externalid(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "user_externalguid")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "user_externalguid" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setUser_externalguid(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "university")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "university" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setUniversity(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "degree")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "degree" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setDegree(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "study_field")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "study_field" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setStudy_field(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "location")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "location" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setLocation(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "activities")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "activities" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setActivities(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "start_year")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "start_year" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setStart_year(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "end_year")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "end_year" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setEnd_year(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "delete")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "delete" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setDelete(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "custom_fields")
                  .equals(reader.getName())) {

            object.setCustom_fields(ArrayOfCustom_field.Factory.parse(reader));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class APIUserResult implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
    name = APIUserResult
    Namespace URI = http://campusgroups.com/
    Namespace Prefix = ns1
    */

    /**
     * field for School_identifier
     */
    protected java.lang.String localSchool_identifier;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSchool_identifierTracker = false;

    public boolean isSchool_identifierSpecified() {
      return localSchool_identifierTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getSchool_identifier() {
      return localSchool_identifier;
    }

    /**
     * Auto generated setter method
     *
     * @param param School_identifier
     */
    public void setSchool_identifier(java.lang.String param) {
      localSchool_identifierTracker = param != null;

      this.localSchool_identifier = param;
    }

    /**
     * field for Cg_id
     */
    protected int localCg_id;

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getCg_id() {
      return localCg_id;
    }

    /**
     * Auto generated setter method
     *
     * @param param Cg_id
     */
    public void setCg_id(int param) {

      this.localCg_id = param;
    }

    /**
     * field for Message_code
     */
    protected int localMessage_code;

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getMessage_code() {
      return localMessage_code;
    }

    /**
     * Auto generated setter method
     *
     * @param param Message_code
     */
    public void setMessage_code(int param) {

      this.localMessage_code = param;
    }

    /**
     * field for Message
     */
    protected java.lang.String localMessage;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMessageTracker = false;

    public boolean isMessageSpecified() {
      return localMessageTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getMessage() {
      return localMessage;
    }

    /**
     * Auto generated setter method
     *
     * @param param Message
     */
    public void setMessage(java.lang.String param) {
      localMessageTracker = param != null;

      this.localMessage = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
              new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
    }

    public void serialize(
            final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
            final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter,
            boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://campusgroups.com/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
                  "xsi",
                  "http://www.w3.org/2001/XMLSchema-instance",
                  "type",
                  namespacePrefix + ":APIUserResult",
                  xmlWriter);
        } else {
          writeAttribute(
                  "xsi",
                  "http://www.w3.org/2001/XMLSchema-instance",
                  "type",
                  "APIUserResult",
                  xmlWriter);
        }
      }
      if (localSchool_identifierTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "school_identifier", xmlWriter);

        if (localSchool_identifier == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("school_identifier cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localSchool_identifier);
        }

        xmlWriter.writeEndElement();
      }
      namespace = "http://campusgroups.com/";
      writeStartElement(null, namespace, "cg_id", xmlWriter);

      if (localCg_id == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("cg_id cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCg_id));
      }

      xmlWriter.writeEndElement();

      namespace = "http://campusgroups.com/";
      writeStartElement(null, namespace, "message_code", xmlWriter);

      if (localMessage_code == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("message_code cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMessage_code));
      }

      xmlWriter.writeEndElement();
      if (localMessageTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "message", xmlWriter);

        if (localMessage == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("message cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localMessage);
        }

        xmlWriter.writeEndElement();
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://campusgroups.com/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(
            java.lang.String prefix,
            java.lang.String namespace,
            java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(
            java.lang.String prefix,
            java.lang.String namespace,
            java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(
            java.lang.String namespace,
            java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
                registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(
            java.lang.String namespace,
            java.lang.String attName,
            javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /**
     * method to handle Qnames
     */
    private void writeQName(
            javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
                  prefix
                          + ":"
                          + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
            javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                      .append(prefix)
                      .append(":")
                      .append(
                              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /**
     * Factory class that keeps the parse method
     */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
              org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static APIUserResult parse(javax.xml.stream.XMLStreamReader reader)
              throws java.lang.Exception {
        APIUserResult object = new APIUserResult();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
                  != null) {
            java.lang.String fullTypeName =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"APIUserResult".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (APIUserResult) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "school_identifier")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "school_identifier" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setSchool_identifier(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "cg_id")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "cg_id" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setCg_id(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "message_code")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "message_code" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setMessage_code(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "message")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "message" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setMessage(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class CreateUpdateAcademicExperienceResponse
          implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
            new javax.xml.namespace.QName(
                    "http://campusgroups.com/", "CreateUpdateAcademicExperienceResponse", "ns1");

    /**
     * field for CreateUpdateAcademicExperienceResult
     */
    protected APIExperienceResult localCreateUpdateAcademicExperienceResult;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCreateUpdateAcademicExperienceResultTracker = false;

    public boolean isCreateUpdateAcademicExperienceResultSpecified() {
      return localCreateUpdateAcademicExperienceResultTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return APIExperienceResult
     */
    public APIExperienceResult getCreateUpdateAcademicExperienceResult() {
      return localCreateUpdateAcademicExperienceResult;
    }

    /**
     * Auto generated setter method
     *
     * @param param CreateUpdateAcademicExperienceResult
     */
    public void setCreateUpdateAcademicExperienceResult(APIExperienceResult param) {
      localCreateUpdateAcademicExperienceResultTracker = param != null;

      this.localCreateUpdateAcademicExperienceResult = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
              new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
            final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
            final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter,
            boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://campusgroups.com/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
                  "xsi",
                  "http://www.w3.org/2001/XMLSchema-instance",
                  "type",
                  namespacePrefix + ":CreateUpdateAcademicExperienceResponse",
                  xmlWriter);
        } else {
          writeAttribute(
                  "xsi",
                  "http://www.w3.org/2001/XMLSchema-instance",
                  "type",
                  "CreateUpdateAcademicExperienceResponse",
                  xmlWriter);
        }
      }
      if (localCreateUpdateAcademicExperienceResultTracker) {
        if (localCreateUpdateAcademicExperienceResult == null) {
          throw new org.apache.axis2.databinding.ADBException(
                  "CreateUpdateAcademicExperienceResult cannot be null!!");
        }
        localCreateUpdateAcademicExperienceResult.serialize(
                new javax.xml.namespace.QName(
                        "http://campusgroups.com/", "CreateUpdateAcademicExperienceResult"),
                xmlWriter);
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://campusgroups.com/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(
            java.lang.String prefix,
            java.lang.String namespace,
            java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(
            java.lang.String prefix,
            java.lang.String namespace,
            java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(
            java.lang.String namespace,
            java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
                registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(
            java.lang.String namespace,
            java.lang.String attName,
            javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /**
     * method to handle Qnames
     */
    private void writeQName(
            javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
                  prefix
                          + ":"
                          + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
            javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                      .append(prefix)
                      .append(":")
                      .append(
                              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /**
     * Factory class that keeps the parse method
     */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
              org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static CreateUpdateAcademicExperienceResponse parse(
              javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
        CreateUpdateAcademicExperienceResponse object =
                new CreateUpdateAcademicExperienceResponse();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
                  != null) {
            java.lang.String fullTypeName =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"CreateUpdateAcademicExperienceResponse".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (CreateUpdateAcademicExperienceResponse)
                        ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName(
                  "http://campusgroups.com/", "CreateUpdateAcademicExperienceResult")
                  .equals(reader.getName())) {

            object.setCreateUpdateAcademicExperienceResult(
                    APIExperienceResult.Factory.parse(reader));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class ArrayOfCustom_field implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
    name = ArrayOfCustom_field
    Namespace URI = http://campusgroups.com/
    Namespace Prefix = ns1
    */

    /**
     * field for Custom_field This was an Array!
     */
    protected Custom_field[] localCustom_field;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCustom_fieldTracker = false;

    public boolean isCustom_fieldSpecified() {
      return localCustom_fieldTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return Custom_field[]
     */
    public Custom_field[] getCustom_field() {
      return localCustom_field;
    }

    /**
     * validate the array for Custom_field
     */
    protected void validateCustom_field(Custom_field[] param) {
    }

    /**
     * Auto generated setter method
     *
     * @param param Custom_field
     */
    public void setCustom_field(Custom_field[] param) {

      validateCustom_field(param);

      localCustom_fieldTracker = param != null;

      this.localCustom_field = param;
    }

    /**
     * Auto generated add method for the array for convenience
     *
     * @param param Custom_field
     */
    public void addCustom_field(Custom_field param) {
      if (localCustom_field == null) {
        localCustom_field = new Custom_field[]{};
      }

      // update the setting tracker
      localCustom_fieldTracker = true;

      java.util.List list =
              org.apache.axis2.databinding.utils.ConverterUtil.toList(localCustom_field);
      list.add(param);
      this.localCustom_field = (Custom_field[]) list.toArray(new Custom_field[list.size()]);
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
              new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
    }

    public void serialize(
            final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
            final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter,
            boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://campusgroups.com/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
                  "xsi",
                  "http://www.w3.org/2001/XMLSchema-instance",
                  "type",
                  namespacePrefix + ":ArrayOfCustom_field",
                  xmlWriter);
        } else {
          writeAttribute(
                  "xsi",
                  "http://www.w3.org/2001/XMLSchema-instance",
                  "type",
                  "ArrayOfCustom_field",
                  xmlWriter);
        }
      }
      if (localCustom_fieldTracker) {
        if (localCustom_field != null) {
          for (int i = 0; i < localCustom_field.length; i++) {
            if (localCustom_field[i] != null) {
              localCustom_field[i].serialize(
                      new javax.xml.namespace.QName("http://campusgroups.com/", "custom_field"),
                      xmlWriter);
            } else {

              // we don't have to do any thing since minOccures is zero

            }
          }
        } else {

          throw new org.apache.axis2.databinding.ADBException("custom_field cannot be null!!");
        }
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://campusgroups.com/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(
            java.lang.String prefix,
            java.lang.String namespace,
            java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(
            java.lang.String prefix,
            java.lang.String namespace,
            java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(
            java.lang.String namespace,
            java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
                registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(
            java.lang.String namespace,
            java.lang.String attName,
            javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /**
     * method to handle Qnames
     */
    private void writeQName(
            javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
                  prefix
                          + ":"
                          + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
            javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                      .append(prefix)
                      .append(":")
                      .append(
                              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /**
     * Factory class that keeps the parse method
     */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
              org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static ArrayOfCustom_field parse(javax.xml.stream.XMLStreamReader reader)
              throws java.lang.Exception {
        ArrayOfCustom_field object = new ArrayOfCustom_field();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
                  != null) {
            java.lang.String fullTypeName =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"ArrayOfCustom_field".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (ArrayOfCustom_field) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          java.util.ArrayList list1 = new java.util.ArrayList();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "custom_field")
                  .equals(reader.getName())) {

            // Process the array and step past its final element's end.

            list1.add(Custom_field.Factory.parse(reader));

            // loop until we find a start element that is not part of this array
            boolean loopDone1 = false;
            while (!loopDone1) {
              // We should be at the end element, but make sure
              while (!reader.isEndElement()) reader.next();
              // Step out of this element
              reader.next();
              // Step to next element event.
              while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
              if (reader.isEndElement()) {
                // two continuous end elements means we are exiting the xml structure
                loopDone1 = true;
              } else {
                if (new javax.xml.namespace.QName("http://campusgroups.com/", "custom_field")
                        .equals(reader.getName())) {
                  list1.add(Custom_field.Factory.parse(reader));

                } else {
                  loopDone1 = true;
                }
              }
            }
            // call the converter utility  to convert and set the array

            object.setCustom_field(
                    (Custom_field[])
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                    Custom_field.class, list1));

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class CreateUpdateEventResponse implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
            new javax.xml.namespace.QName(
                    "http://campusgroups.com/", "CreateUpdateEventResponse", "ns1");

    /**
     * field for CreateUpdateEventResult
     */
    protected APIEventResult localCreateUpdateEventResult;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCreateUpdateEventResultTracker = false;

    public boolean isCreateUpdateEventResultSpecified() {
      return localCreateUpdateEventResultTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return APIEventResult
     */
    public APIEventResult getCreateUpdateEventResult() {
      return localCreateUpdateEventResult;
    }

    /**
     * Auto generated setter method
     *
     * @param param CreateUpdateEventResult
     */
    public void setCreateUpdateEventResult(APIEventResult param) {
      localCreateUpdateEventResultTracker = param != null;

      this.localCreateUpdateEventResult = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
              new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
            final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
            final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter,
            boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://campusgroups.com/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
                  "xsi",
                  "http://www.w3.org/2001/XMLSchema-instance",
                  "type",
                  namespacePrefix + ":CreateUpdateEventResponse",
                  xmlWriter);
        } else {
          writeAttribute(
                  "xsi",
                  "http://www.w3.org/2001/XMLSchema-instance",
                  "type",
                  "CreateUpdateEventResponse",
                  xmlWriter);
        }
      }
      if (localCreateUpdateEventResultTracker) {
        if (localCreateUpdateEventResult == null) {
          throw new org.apache.axis2.databinding.ADBException(
                  "CreateUpdateEventResult cannot be null!!");
        }
        localCreateUpdateEventResult.serialize(
                new javax.xml.namespace.QName("http://campusgroups.com/", "CreateUpdateEventResult"),
                xmlWriter);
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://campusgroups.com/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(
            java.lang.String prefix,
            java.lang.String namespace,
            java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(
            java.lang.String prefix,
            java.lang.String namespace,
            java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(
            java.lang.String namespace,
            java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
                registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(
            java.lang.String namespace,
            java.lang.String attName,
            javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /**
     * method to handle Qnames
     */
    private void writeQName(
            javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
                  prefix
                          + ":"
                          + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
            javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                      .append(prefix)
                      .append(":")
                      .append(
                              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /**
     * Factory class that keeps the parse method
     */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
              org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static CreateUpdateEventResponse parse(javax.xml.stream.XMLStreamReader reader)
              throws java.lang.Exception {
        CreateUpdateEventResponse object = new CreateUpdateEventResponse();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
                  != null) {
            java.lang.String fullTypeName =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"CreateUpdateEventResponse".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (CreateUpdateEventResponse)
                        ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName(
                  "http://campusgroups.com/", "CreateUpdateEventResult")
                  .equals(reader.getName())) {

            object.setCreateUpdateEventResult(APIEventResult.Factory.parse(reader));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class CreateRoomReservationResponse
          implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
            new javax.xml.namespace.QName(
                    "http://campusgroups.com/", "CreateRoomReservationResponse", "ns1");

    /**
     * field for CreateRoomReservationResult
     */
    protected APIExperienceResult localCreateRoomReservationResult;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCreateRoomReservationResultTracker = false;

    public boolean isCreateRoomReservationResultSpecified() {
      return localCreateRoomReservationResultTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return APIExperienceResult
     */
    public APIExperienceResult getCreateRoomReservationResult() {
      return localCreateRoomReservationResult;
    }

    /**
     * Auto generated setter method
     *
     * @param param CreateRoomReservationResult
     */
    public void setCreateRoomReservationResult(APIExperienceResult param) {
      localCreateRoomReservationResultTracker = param != null;

      this.localCreateRoomReservationResult = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
              new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
            final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
            final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter,
            boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://campusgroups.com/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
                  "xsi",
                  "http://www.w3.org/2001/XMLSchema-instance",
                  "type",
                  namespacePrefix + ":CreateRoomReservationResponse",
                  xmlWriter);
        } else {
          writeAttribute(
                  "xsi",
                  "http://www.w3.org/2001/XMLSchema-instance",
                  "type",
                  "CreateRoomReservationResponse",
                  xmlWriter);
        }
      }
      if (localCreateRoomReservationResultTracker) {
        if (localCreateRoomReservationResult == null) {
          throw new org.apache.axis2.databinding.ADBException(
                  "CreateRoomReservationResult cannot be null!!");
        }
        localCreateRoomReservationResult.serialize(
                new javax.xml.namespace.QName(
                        "http://campusgroups.com/", "CreateRoomReservationResult"),
                xmlWriter);
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://campusgroups.com/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(
            java.lang.String prefix,
            java.lang.String namespace,
            java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(
            java.lang.String prefix,
            java.lang.String namespace,
            java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(
            java.lang.String namespace,
            java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
                registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(
            java.lang.String namespace,
            java.lang.String attName,
            javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /**
     * method to handle Qnames
     */
    private void writeQName(
            javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
                  prefix
                          + ":"
                          + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
            javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                      .append(prefix)
                      .append(":")
                      .append(
                              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /**
     * Factory class that keeps the parse method
     */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
              org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static CreateRoomReservationResponse parse(javax.xml.stream.XMLStreamReader reader)
              throws java.lang.Exception {
        CreateRoomReservationResponse object = new CreateRoomReservationResponse();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
                  != null) {
            java.lang.String fullTypeName =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"CreateRoomReservationResponse".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (CreateRoomReservationResponse)
                        ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName(
                  "http://campusgroups.com/", "CreateRoomReservationResult")
                  .equals(reader.getName())) {

            object.setCreateRoomReservationResult(APIExperienceResult.Factory.parse(reader));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class APITransactionResult implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
    name = APITransactionResult
    Namespace URI = http://campusgroups.com/
    Namespace Prefix = ns1
    */

    /**
     * field for Cg_transaction_id
     */
    protected int localCg_transaction_id;

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getCg_transaction_id() {
      return localCg_transaction_id;
    }

    /**
     * Auto generated setter method
     *
     * @param param Cg_transaction_id
     */
    public void setCg_transaction_id(int param) {

      this.localCg_transaction_id = param;
    }

    /**
     * field for Message_code
     */
    protected int localMessage_code;

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getMessage_code() {
      return localMessage_code;
    }

    /**
     * Auto generated setter method
     *
     * @param param Message_code
     */
    public void setMessage_code(int param) {

      this.localMessage_code = param;
    }

    /**
     * field for Message
     */
    protected java.lang.String localMessage;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMessageTracker = false;

    public boolean isMessageSpecified() {
      return localMessageTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getMessage() {
      return localMessage;
    }

    /**
     * Auto generated setter method
     *
     * @param param Message
     */
    public void setMessage(java.lang.String param) {
      localMessageTracker = param != null;

      this.localMessage = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
              new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
    }

    public void serialize(
            final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
            final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter,
            boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://campusgroups.com/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
                  "xsi",
                  "http://www.w3.org/2001/XMLSchema-instance",
                  "type",
                  namespacePrefix + ":APITransactionResult",
                  xmlWriter);
        } else {
          writeAttribute(
                  "xsi",
                  "http://www.w3.org/2001/XMLSchema-instance",
                  "type",
                  "APITransactionResult",
                  xmlWriter);
        }
      }

      namespace = "http://campusgroups.com/";
      writeStartElement(null, namespace, "cg_transaction_id", xmlWriter);

      if (localCg_transaction_id == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("cg_transaction_id cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localCg_transaction_id));
      }

      xmlWriter.writeEndElement();

      namespace = "http://campusgroups.com/";
      writeStartElement(null, namespace, "message_code", xmlWriter);

      if (localMessage_code == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("message_code cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMessage_code));
      }

      xmlWriter.writeEndElement();
      if (localMessageTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "message", xmlWriter);

        if (localMessage == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("message cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localMessage);
        }

        xmlWriter.writeEndElement();
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://campusgroups.com/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(
            java.lang.String prefix,
            java.lang.String namespace,
            java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(
            java.lang.String prefix,
            java.lang.String namespace,
            java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(
            java.lang.String namespace,
            java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
                registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(
            java.lang.String namespace,
            java.lang.String attName,
            javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /**
     * method to handle Qnames
     */
    private void writeQName(
            javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
                  prefix
                          + ":"
                          + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
            javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                      .append(prefix)
                      .append(":")
                      .append(
                              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /**
     * Factory class that keeps the parse method
     */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
              org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static APITransactionResult parse(javax.xml.stream.XMLStreamReader reader)
              throws java.lang.Exception {
        APITransactionResult object = new APITransactionResult();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
                  != null) {
            java.lang.String fullTypeName =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"APITransactionResult".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (APITransactionResult) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "cg_transaction_id")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "cg_transaction_id" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setCg_transaction_id(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "message_code")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "message_code" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setMessage_code(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "message")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "message" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setMessage(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class CreateRoomReservation implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
            new javax.xml.namespace.QName("http://campusgroups.com/", "CreateRoomReservation", "ns1");

    /**
     * field for School
     */
    protected java.lang.String localSchool;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSchoolTracker = false;

    public boolean isSchoolSpecified() {
      return localSchoolTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getSchool() {
      return localSchool;
    }

    /**
     * Auto generated setter method
     *
     * @param param School
     */
    public void setSchool(java.lang.String param) {
      localSchoolTracker = param != null;

      this.localSchool = param;
    }

    /**
     * field for Timestamp
     */
    protected java.lang.String localTimestamp;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTimestampTracker = false;

    public boolean isTimestampSpecified() {
      return localTimestampTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getTimestamp() {
      return localTimestamp;
    }

    /**
     * Auto generated setter method
     *
     * @param param Timestamp
     */
    public void setTimestamp(java.lang.String param) {
      localTimestampTracker = param != null;

      this.localTimestamp = param;
    }

    /**
     * field for Auth_token
     */
    protected java.lang.String localAuth_token;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAuth_tokenTracker = false;

    public boolean isAuth_tokenSpecified() {
      return localAuth_tokenTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getAuth_token() {
      return localAuth_token;
    }

    /**
     * Auto generated setter method
     *
     * @param param Auth_token
     */
    public void setAuth_token(java.lang.String param) {
      localAuth_tokenTracker = param != null;

      this.localAuth_token = param;
    }

    /**
     * field for Event_id
     */
    protected java.lang.String localEvent_id;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEvent_idTracker = false;

    public boolean isEvent_idSpecified() {
      return localEvent_idTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getEvent_id() {
      return localEvent_id;
    }

    /**
     * Auto generated setter method
     *
     * @param param Event_id
     */
    public void setEvent_id(java.lang.String param) {
      localEvent_idTracker = param != null;

      this.localEvent_id = param;
    }

    /**
     * field for External_event_id
     */
    protected java.lang.String localExternal_event_id;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localExternal_event_idTracker = false;

    public boolean isExternal_event_idSpecified() {
      return localExternal_event_idTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getExternal_event_id() {
      return localExternal_event_id;
    }

    /**
     * Auto generated setter method
     *
     * @param param External_event_id
     */
    public void setExternal_event_id(java.lang.String param) {
      localExternal_event_idTracker = param != null;

      this.localExternal_event_id = param;
    }

    /**
     * field for User_cgid
     */
    protected java.lang.String localUser_cgid;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localUser_cgidTracker = false;

    public boolean isUser_cgidSpecified() {
      return localUser_cgidTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getUser_cgid() {
      return localUser_cgid;
    }

    /**
     * Auto generated setter method
     *
     * @param param User_cgid
     */
    public void setUser_cgid(java.lang.String param) {
      localUser_cgidTracker = param != null;

      this.localUser_cgid = param;
    }

    /**
     * field for User_email
     */
    protected java.lang.String localUser_email;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localUser_emailTracker = false;

    public boolean isUser_emailSpecified() {
      return localUser_emailTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getUser_email() {
      return localUser_email;
    }

    /**
     * Auto generated setter method
     *
     * @param param User_email
     */
    public void setUser_email(java.lang.String param) {
      localUser_emailTracker = param != null;

      this.localUser_email = param;
    }

    /**
     * field for User_netid
     */
    protected java.lang.String localUser_netid;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localUser_netidTracker = false;

    public boolean isUser_netidSpecified() {
      return localUser_netidTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getUser_netid() {
      return localUser_netid;
    }

    /**
     * Auto generated setter method
     *
     * @param param User_netid
     */
    public void setUser_netid(java.lang.String param) {
      localUser_netidTracker = param != null;

      this.localUser_netid = param;
    }

    /**
     * field for User_netid2
     */
    protected java.lang.String localUser_netid2;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localUser_netid2Tracker = false;

    public boolean isUser_netid2Specified() {
      return localUser_netid2Tracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getUser_netid2() {
      return localUser_netid2;
    }

    /**
     * Auto generated setter method
     *
     * @param param User_netid2
     */
    public void setUser_netid2(java.lang.String param) {
      localUser_netid2Tracker = param != null;

      this.localUser_netid2 = param;
    }

    /**
     * field for User_netid3
     */
    protected java.lang.String localUser_netid3;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localUser_netid3Tracker = false;

    public boolean isUser_netid3Specified() {
      return localUser_netid3Tracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getUser_netid3() {
      return localUser_netid3;
    }

    /**
     * Auto generated setter method
     *
     * @param param User_netid3
     */
    public void setUser_netid3(java.lang.String param) {
      localUser_netid3Tracker = param != null;

      this.localUser_netid3 = param;
    }

    /**
     * field for Room_id
     */
    protected java.lang.String localRoom_id;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRoom_idTracker = false;

    public boolean isRoom_idSpecified() {
      return localRoom_idTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getRoom_id() {
      return localRoom_id;
    }

    /**
     * Auto generated setter method
     *
     * @param param Room_id
     */
    public void setRoom_id(java.lang.String param) {
      localRoom_idTracker = param != null;

      this.localRoom_id = param;
    }

    /**
     * field for External_room_id
     */
    protected java.lang.String localExternal_room_id;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localExternal_room_idTracker = false;

    public boolean isExternal_room_idSpecified() {
      return localExternal_room_idTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getExternal_room_id() {
      return localExternal_room_id;
    }

    /**
     * Auto generated setter method
     *
     * @param param External_room_id
     */
    public void setExternal_room_id(java.lang.String param) {
      localExternal_room_idTracker = param != null;

      this.localExternal_room_id = param;
    }

    /**
     * field for Start
     */
    protected java.lang.String localStart;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localStartTracker = false;

    public boolean isStartSpecified() {
      return localStartTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getStart() {
      return localStart;
    }

    /**
     * Auto generated setter method
     *
     * @param param Start
     */
    public void setStart(java.lang.String param) {
      localStartTracker = param != null;

      this.localStart = param;
    }

    /**
     * field for End
     */
    protected java.lang.String localEnd;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEndTracker = false;

    public boolean isEndSpecified() {
      return localEndTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getEnd() {
      return localEnd;
    }

    /**
     * Auto generated setter method
     *
     * @param param End
     */
    public void setEnd(java.lang.String param) {
      localEndTracker = param != null;

      this.localEnd = param;
    }

    /**
     * field for Setup_minutes
     */
    protected java.lang.String localSetup_minutes;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSetup_minutesTracker = false;

    public boolean isSetup_minutesSpecified() {
      return localSetup_minutesTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getSetup_minutes() {
      return localSetup_minutes;
    }

    /**
     * Auto generated setter method
     *
     * @param param Setup_minutes
     */
    public void setSetup_minutes(java.lang.String param) {
      localSetup_minutesTracker = param != null;

      this.localSetup_minutes = param;
    }

    /**
     * field for Breakout_minutes
     */
    protected java.lang.String localBreakout_minutes;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localBreakout_minutesTracker = false;

    public boolean isBreakout_minutesSpecified() {
      return localBreakout_minutesTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getBreakout_minutes() {
      return localBreakout_minutes;
    }

    /**
     * Auto generated setter method
     *
     * @param param Breakout_minutes
     */
    public void setBreakout_minutes(java.lang.String param) {
      localBreakout_minutesTracker = param != null;

      this.localBreakout_minutes = param;
    }

    /**
     * field for Ignore_rules_privacy
     */
    protected java.lang.String localIgnore_rules_privacy;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localIgnore_rules_privacyTracker = false;

    public boolean isIgnore_rules_privacySpecified() {
      return localIgnore_rules_privacyTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getIgnore_rules_privacy() {
      return localIgnore_rules_privacy;
    }

    /**
     * Auto generated setter method
     *
     * @param param Ignore_rules_privacy
     */
    public void setIgnore_rules_privacy(java.lang.String param) {
      localIgnore_rules_privacyTracker = param != null;

      this.localIgnore_rules_privacy = param;
    }

    /**
     * field for Ignore_availability_rules
     */
    protected java.lang.String localIgnore_availability_rules;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localIgnore_availability_rulesTracker = false;

    public boolean isIgnore_availability_rulesSpecified() {
      return localIgnore_availability_rulesTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getIgnore_availability_rules() {
      return localIgnore_availability_rules;
    }

    /**
     * Auto generated setter method
     *
     * @param param Ignore_availability_rules
     */
    public void setIgnore_availability_rules(java.lang.String param) {
      localIgnore_availability_rulesTracker = param != null;

      this.localIgnore_availability_rules = param;
    }

    /**
     * field for Ignore_blocks
     */
    protected java.lang.String localIgnore_blocks;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localIgnore_blocksTracker = false;

    public boolean isIgnore_blocksSpecified() {
      return localIgnore_blocksTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getIgnore_blocks() {
      return localIgnore_blocks;
    }

    /**
     * Auto generated setter method
     *
     * @param param Ignore_blocks
     */
    public void setIgnore_blocks(java.lang.String param) {
      localIgnore_blocksTracker = param != null;

      this.localIgnore_blocks = param;
    }

    /**
     * field for Auto_approve
     */
    protected java.lang.String localAuto_approve;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAuto_approveTracker = false;

    public boolean isAuto_approveSpecified() {
      return localAuto_approveTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getAuto_approve() {
      return localAuto_approve;
    }

    /**
     * Auto generated setter method
     *
     * @param param Auto_approve
     */
    public void setAuto_approve(java.lang.String param) {
      localAuto_approveTracker = param != null;

      this.localAuto_approve = param;
    }

    /**
     * field for External_room_reservation_id
     */
    protected java.lang.String localExternal_room_reservation_id;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localExternal_room_reservation_idTracker = false;

    public boolean isExternal_room_reservation_idSpecified() {
      return localExternal_room_reservation_idTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getExternal_room_reservation_id() {
      return localExternal_room_reservation_id;
    }

    /**
     * Auto generated setter method
     *
     * @param param External_room_reservation_id
     */
    public void setExternal_room_reservation_id(java.lang.String param) {
      localExternal_room_reservation_idTracker = param != null;

      this.localExternal_room_reservation_id = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
              new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
            final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
            final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter,
            boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://campusgroups.com/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
                  "xsi",
                  "http://www.w3.org/2001/XMLSchema-instance",
                  "type",
                  namespacePrefix + ":CreateRoomReservation",
                  xmlWriter);
        } else {
          writeAttribute(
                  "xsi",
                  "http://www.w3.org/2001/XMLSchema-instance",
                  "type",
                  "CreateRoomReservation",
                  xmlWriter);
        }
      }
      if (localSchoolTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "school", xmlWriter);

        if (localSchool == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("school cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localSchool);
        }

        xmlWriter.writeEndElement();
      }
      if (localTimestampTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "timestamp", xmlWriter);

        if (localTimestamp == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("timestamp cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localTimestamp);
        }

        xmlWriter.writeEndElement();
      }
      if (localAuth_tokenTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "auth_token", xmlWriter);

        if (localAuth_token == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("auth_token cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localAuth_token);
        }

        xmlWriter.writeEndElement();
      }
      if (localEvent_idTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "event_id", xmlWriter);

        if (localEvent_id == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("event_id cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localEvent_id);
        }

        xmlWriter.writeEndElement();
      }
      if (localExternal_event_idTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "external_event_id", xmlWriter);

        if (localExternal_event_id == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("external_event_id cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localExternal_event_id);
        }

        xmlWriter.writeEndElement();
      }
      if (localUser_cgidTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "user_cgid", xmlWriter);

        if (localUser_cgid == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("user_cgid cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localUser_cgid);
        }

        xmlWriter.writeEndElement();
      }
      if (localUser_emailTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "user_email", xmlWriter);

        if (localUser_email == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("user_email cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localUser_email);
        }

        xmlWriter.writeEndElement();
      }
      if (localUser_netidTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "user_netid", xmlWriter);

        if (localUser_netid == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("user_netid cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localUser_netid);
        }

        xmlWriter.writeEndElement();
      }
      if (localUser_netid2Tracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "user_netid2", xmlWriter);

        if (localUser_netid2 == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("user_netid2 cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localUser_netid2);
        }

        xmlWriter.writeEndElement();
      }
      if (localUser_netid3Tracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "user_netid3", xmlWriter);

        if (localUser_netid3 == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("user_netid3 cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localUser_netid3);
        }

        xmlWriter.writeEndElement();
      }
      if (localRoom_idTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "room_id", xmlWriter);

        if (localRoom_id == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("room_id cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localRoom_id);
        }

        xmlWriter.writeEndElement();
      }
      if (localExternal_room_idTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "external_room_id", xmlWriter);

        if (localExternal_room_id == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("external_room_id cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localExternal_room_id);
        }

        xmlWriter.writeEndElement();
      }
      if (localStartTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "start", xmlWriter);

        if (localStart == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("start cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localStart);
        }

        xmlWriter.writeEndElement();
      }
      if (localEndTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "end", xmlWriter);

        if (localEnd == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("end cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localEnd);
        }

        xmlWriter.writeEndElement();
      }
      if (localSetup_minutesTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "setup_minutes", xmlWriter);

        if (localSetup_minutes == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("setup_minutes cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localSetup_minutes);
        }

        xmlWriter.writeEndElement();
      }
      if (localBreakout_minutesTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "breakout_minutes", xmlWriter);

        if (localBreakout_minutes == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("breakout_minutes cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localBreakout_minutes);
        }

        xmlWriter.writeEndElement();
      }
      if (localIgnore_rules_privacyTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "ignore_rules_privacy", xmlWriter);

        if (localIgnore_rules_privacy == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException(
                  "ignore_rules_privacy cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localIgnore_rules_privacy);
        }

        xmlWriter.writeEndElement();
      }
      if (localIgnore_availability_rulesTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "ignore_availability_rules", xmlWriter);

        if (localIgnore_availability_rules == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException(
                  "ignore_availability_rules cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localIgnore_availability_rules);
        }

        xmlWriter.writeEndElement();
      }
      if (localIgnore_blocksTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "ignore_blocks", xmlWriter);

        if (localIgnore_blocks == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("ignore_blocks cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localIgnore_blocks);
        }

        xmlWriter.writeEndElement();
      }
      if (localAuto_approveTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "auto_approve", xmlWriter);

        if (localAuto_approve == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("auto_approve cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localAuto_approve);
        }

        xmlWriter.writeEndElement();
      }
      if (localExternal_room_reservation_idTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "external_room_reservation_id", xmlWriter);

        if (localExternal_room_reservation_id == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException(
                  "external_room_reservation_id cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localExternal_room_reservation_id);
        }

        xmlWriter.writeEndElement();
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://campusgroups.com/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(
            java.lang.String prefix,
            java.lang.String namespace,
            java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(
            java.lang.String prefix,
            java.lang.String namespace,
            java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(
            java.lang.String namespace,
            java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
                registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(
            java.lang.String namespace,
            java.lang.String attName,
            javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /**
     * method to handle Qnames
     */
    private void writeQName(
            javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
                  prefix
                          + ":"
                          + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
            javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                      .append(prefix)
                      .append(":")
                      .append(
                              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /**
     * Factory class that keeps the parse method
     */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
              org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static CreateRoomReservation parse(javax.xml.stream.XMLStreamReader reader)
              throws java.lang.Exception {
        CreateRoomReservation object = new CreateRoomReservation();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
                  != null) {
            java.lang.String fullTypeName =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"CreateRoomReservation".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (CreateRoomReservation) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "school")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "school" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setSchool(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "timestamp")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "timestamp" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setTimestamp(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "auth_token")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "auth_token" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setAuth_token(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "event_id")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "event_id" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setEvent_id(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "external_event_id")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "external_event_id" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setExternal_event_id(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "user_cgid")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "user_cgid" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setUser_cgid(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "user_email")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "user_email" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setUser_email(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "user_netid")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "user_netid" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setUser_netid(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "user_netid2")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "user_netid2" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setUser_netid2(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "user_netid3")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "user_netid3" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setUser_netid3(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "room_id")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "room_id" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setRoom_id(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "external_room_id")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "external_room_id" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setExternal_room_id(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "start")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "start" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setStart(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "end")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "end" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setEnd(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "setup_minutes")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "setup_minutes" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setSetup_minutes(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "breakout_minutes")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "breakout_minutes" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setBreakout_minutes(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "ignore_rules_privacy")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "ignore_rules_privacy" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setIgnore_rules_privacy(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName(
                  "http://campusgroups.com/", "ignore_availability_rules")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "ignore_availability_rules" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setIgnore_availability_rules(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "ignore_blocks")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "ignore_blocks" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setIgnore_blocks(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "auto_approve")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "auto_approve" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setAuto_approve(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName(
                  "http://campusgroups.com/", "external_room_reservation_id")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "external_room_reservation_id" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setExternal_room_reservation_id(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class APIExperienceResult implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
    name = APIExperienceResult
    Namespace URI = http://campusgroups.com/
    Namespace Prefix = ns1
    */

    /**
     * field for Cg_id
     */
    protected long localCg_id;

    /**
     * Auto generated getter method
     *
     * @return long
     */
    public long getCg_id() {
      return localCg_id;
    }

    /**
     * Auto generated setter method
     *
     * @param param Cg_id
     */
    public void setCg_id(long param) {

      this.localCg_id = param;
    }

    /**
     * field for Message_code
     */
    protected int localMessage_code;

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getMessage_code() {
      return localMessage_code;
    }

    /**
     * Auto generated setter method
     *
     * @param param Message_code
     */
    public void setMessage_code(int param) {

      this.localMessage_code = param;
    }

    /**
     * field for Message
     */
    protected java.lang.String localMessage;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMessageTracker = false;

    public boolean isMessageSpecified() {
      return localMessageTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getMessage() {
      return localMessage;
    }

    /**
     * Auto generated setter method
     *
     * @param param Message
     */
    public void setMessage(java.lang.String param) {
      localMessageTracker = param != null;

      this.localMessage = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
              new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
    }

    public void serialize(
            final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
            final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter,
            boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://campusgroups.com/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
                  "xsi",
                  "http://www.w3.org/2001/XMLSchema-instance",
                  "type",
                  namespacePrefix + ":APIExperienceResult",
                  xmlWriter);
        } else {
          writeAttribute(
                  "xsi",
                  "http://www.w3.org/2001/XMLSchema-instance",
                  "type",
                  "APIExperienceResult",
                  xmlWriter);
        }
      }

      namespace = "http://campusgroups.com/";
      writeStartElement(null, namespace, "cg_id", xmlWriter);

      if (localCg_id == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("cg_id cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCg_id));
      }

      xmlWriter.writeEndElement();

      namespace = "http://campusgroups.com/";
      writeStartElement(null, namespace, "message_code", xmlWriter);

      if (localMessage_code == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("message_code cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMessage_code));
      }

      xmlWriter.writeEndElement();
      if (localMessageTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "message", xmlWriter);

        if (localMessage == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("message cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localMessage);
        }

        xmlWriter.writeEndElement();
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://campusgroups.com/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(
            java.lang.String prefix,
            java.lang.String namespace,
            java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(
            java.lang.String prefix,
            java.lang.String namespace,
            java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(
            java.lang.String namespace,
            java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
                registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(
            java.lang.String namespace,
            java.lang.String attName,
            javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /**
     * method to handle Qnames
     */
    private void writeQName(
            javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
                  prefix
                          + ":"
                          + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
            javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                      .append(prefix)
                      .append(":")
                      .append(
                              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /**
     * Factory class that keeps the parse method
     */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
              org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static APIExperienceResult parse(javax.xml.stream.XMLStreamReader reader)
              throws java.lang.Exception {
        APIExperienceResult object = new APIExperienceResult();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
                  != null) {
            java.lang.String fullTypeName =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"APIExperienceResult".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (APIExperienceResult) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "cg_id")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "cg_id" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setCg_id(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "message_code")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "message_code" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setMessage_code(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "message")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "message" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setMessage(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class CreateUpdateTransaction implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
            new javax.xml.namespace.QName("http://campusgroups.com/", "CreateUpdateTransaction", "ns1");

    /**
     * field for School
     */
    protected java.lang.String localSchool;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSchoolTracker = false;

    public boolean isSchoolSpecified() {
      return localSchoolTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getSchool() {
      return localSchool;
    }

    /**
     * Auto generated setter method
     *
     * @param param School
     */
    public void setSchool(java.lang.String param) {
      localSchoolTracker = param != null;

      this.localSchool = param;
    }

    /**
     * field for Api_key
     */
    protected java.lang.String localApi_key;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localApi_keyTracker = false;

    public boolean isApi_keySpecified() {
      return localApi_keyTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getApi_key() {
      return localApi_key;
    }

    /**
     * Auto generated setter method
     *
     * @param param Api_key
     */
    public void setApi_key(java.lang.String param) {
      localApi_keyTracker = param != null;

      this.localApi_key = param;
    }

    /**
     * field for Timestamp
     */
    protected java.lang.String localTimestamp;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTimestampTracker = false;

    public boolean isTimestampSpecified() {
      return localTimestampTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getTimestamp() {
      return localTimestamp;
    }

    /**
     * Auto generated setter method
     *
     * @param param Timestamp
     */
    public void setTimestamp(java.lang.String param) {
      localTimestampTracker = param != null;

      this.localTimestamp = param;
    }

    /**
     * field for Auth_token
     */
    protected java.lang.String localAuth_token;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAuth_tokenTracker = false;

    public boolean isAuth_tokenSpecified() {
      return localAuth_tokenTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getAuth_token() {
      return localAuth_token;
    }

    /**
     * Auto generated setter method
     *
     * @param param Auth_token
     */
    public void setAuth_token(java.lang.String param) {
      localAuth_tokenTracker = param != null;

      this.localAuth_token = param;
    }

    /**
     * field for Group_acronym
     */
    protected java.lang.String localGroup_acronym;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localGroup_acronymTracker = false;

    public boolean isGroup_acronymSpecified() {
      return localGroup_acronymTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getGroup_acronym() {
      return localGroup_acronym;
    }

    /**
     * Auto generated setter method
     *
     * @param param Group_acronym
     */
    public void setGroup_acronym(java.lang.String param) {
      localGroup_acronymTracker = param != null;

      this.localGroup_acronym = param;
    }

    /**
     * field for Budget
     */
    protected java.lang.String localBudget;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localBudgetTracker = false;

    public boolean isBudgetSpecified() {
      return localBudgetTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getBudget() {
      return localBudget;
    }

    /**
     * Auto generated setter method
     *
     * @param param Budget
     */
    public void setBudget(java.lang.String param) {
      localBudgetTracker = param != null;

      this.localBudget = param;
    }

    /**
     * field for Description
     */
    protected java.lang.String localDescription;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDescriptionTracker = false;

    public boolean isDescriptionSpecified() {
      return localDescriptionTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getDescription() {
      return localDescription;
    }

    /**
     * Auto generated setter method
     *
     * @param param Description
     */
    public void setDescription(java.lang.String param) {
      localDescriptionTracker = param != null;

      this.localDescription = param;
    }

    /**
     * field for Type
     */
    protected java.lang.String localType;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTypeTracker = false;

    public boolean isTypeSpecified() {
      return localTypeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getType() {
      return localType;
    }

    /**
     * Auto generated setter method
     *
     * @param param Type
     */
    public void setType(java.lang.String param) {
      localTypeTracker = param != null;

      this.localType = param;
    }

    /**
     * field for Category
     */
    protected java.lang.String localCategory;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCategoryTracker = false;

    public boolean isCategorySpecified() {
      return localCategoryTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCategory() {
      return localCategory;
    }

    /**
     * Auto generated setter method
     *
     * @param param Category
     */
    public void setCategory(java.lang.String param) {
      localCategoryTracker = param != null;

      this.localCategory = param;
    }

    /**
     * field for Amount
     */
    protected java.lang.String localAmount;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAmountTracker = false;

    public boolean isAmountSpecified() {
      return localAmountTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getAmount() {
      return localAmount;
    }

    /**
     * Auto generated setter method
     *
     * @param param Amount
     */
    public void setAmount(java.lang.String param) {
      localAmountTracker = param != null;

      this.localAmount = param;
    }

    /**
     * field for Amount_group_funds
     */
    protected java.lang.String localAmount_group_funds;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAmount_group_fundsTracker = false;

    public boolean isAmount_group_fundsSpecified() {
      return localAmount_group_fundsTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getAmount_group_funds() {
      return localAmount_group_funds;
    }

    /**
     * Auto generated setter method
     *
     * @param param Amount_group_funds
     */
    public void setAmount_group_funds(java.lang.String param) {
      localAmount_group_fundsTracker = param != null;

      this.localAmount_group_funds = param;
    }

    /**
     * field for Transaction_date
     */
    protected java.lang.String localTransaction_date;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTransaction_dateTracker = false;

    public boolean isTransaction_dateSpecified() {
      return localTransaction_dateTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getTransaction_date() {
      return localTransaction_date;
    }

    /**
     * Auto generated setter method
     *
     * @param param Transaction_date
     */
    public void setTransaction_date(java.lang.String param) {
      localTransaction_dateTracker = param != null;

      this.localTransaction_date = param;
    }

    /**
     * field for Status
     */
    protected java.lang.String localStatus;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localStatusTracker = false;

    public boolean isStatusSpecified() {
      return localStatusTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getStatus() {
      return localStatus;
    }

    /**
     * Auto generated setter method
     *
     * @param param Status
     */
    public void setStatus(java.lang.String param) {
      localStatusTracker = param != null;

      this.localStatus = param;
    }

    /**
     * field for Payment_method
     */
    protected java.lang.String localPayment_method;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPayment_methodTracker = false;

    public boolean isPayment_methodSpecified() {
      return localPayment_methodTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getPayment_method() {
      return localPayment_method;
    }

    /**
     * Auto generated setter method
     *
     * @param param Payment_method
     */
    public void setPayment_method(java.lang.String param) {
      localPayment_methodTracker = param != null;

      this.localPayment_method = param;
    }

    /**
     * field for Vendor
     */
    protected java.lang.String localVendor;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localVendorTracker = false;

    public boolean isVendorSpecified() {
      return localVendorTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getVendor() {
      return localVendor;
    }

    /**
     * Auto generated setter method
     *
     * @param param Vendor
     */
    public void setVendor(java.lang.String param) {
      localVendorTracker = param != null;

      this.localVendor = param;
    }

    /**
     * field for Reference_number
     */
    protected java.lang.String localReference_number;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localReference_numberTracker = false;

    public boolean isReference_numberSpecified() {
      return localReference_numberTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getReference_number() {
      return localReference_number;
    }

    /**
     * Auto generated setter method
     *
     * @param param Reference_number
     */
    public void setReference_number(java.lang.String param) {
      localReference_numberTracker = param != null;

      this.localReference_number = param;
    }

    /**
     * field for Additional_notes
     */
    protected java.lang.String localAdditional_notes;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAdditional_notesTracker = false;

    public boolean isAdditional_notesSpecified() {
      return localAdditional_notesTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getAdditional_notes() {
      return localAdditional_notes;
    }

    /**
     * Auto generated setter method
     *
     * @param param Additional_notes
     */
    public void setAdditional_notes(java.lang.String param) {
      localAdditional_notesTracker = param != null;

      this.localAdditional_notes = param;
    }

    /**
     * field for External_transaction_id
     */
    protected java.lang.String localExternal_transaction_id;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localExternal_transaction_idTracker = false;

    public boolean isExternal_transaction_idSpecified() {
      return localExternal_transaction_idTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getExternal_transaction_id() {
      return localExternal_transaction_id;
    }

    /**
     * Auto generated setter method
     *
     * @param param External_transaction_id
     */
    public void setExternal_transaction_id(java.lang.String param) {
      localExternal_transaction_idTracker = param != null;

      this.localExternal_transaction_id = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
              new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
            final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
            final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter,
            boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://campusgroups.com/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
                  "xsi",
                  "http://www.w3.org/2001/XMLSchema-instance",
                  "type",
                  namespacePrefix + ":CreateUpdateTransaction",
                  xmlWriter);
        } else {
          writeAttribute(
                  "xsi",
                  "http://www.w3.org/2001/XMLSchema-instance",
                  "type",
                  "CreateUpdateTransaction",
                  xmlWriter);
        }
      }
      if (localSchoolTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "school", xmlWriter);

        if (localSchool == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("school cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localSchool);
        }

        xmlWriter.writeEndElement();
      }
      if (localApi_keyTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "api_key", xmlWriter);

        if (localApi_key == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("api_key cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localApi_key);
        }

        xmlWriter.writeEndElement();
      }
      if (localTimestampTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "timestamp", xmlWriter);

        if (localTimestamp == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("timestamp cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localTimestamp);
        }

        xmlWriter.writeEndElement();
      }
      if (localAuth_tokenTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "auth_token", xmlWriter);

        if (localAuth_token == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("auth_token cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localAuth_token);
        }

        xmlWriter.writeEndElement();
      }
      if (localGroup_acronymTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "group_acronym", xmlWriter);

        if (localGroup_acronym == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("group_acronym cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localGroup_acronym);
        }

        xmlWriter.writeEndElement();
      }
      if (localBudgetTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "budget", xmlWriter);

        if (localBudget == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("budget cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localBudget);
        }

        xmlWriter.writeEndElement();
      }
      if (localDescriptionTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "description", xmlWriter);

        if (localDescription == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("description cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localDescription);
        }

        xmlWriter.writeEndElement();
      }
      if (localTypeTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "type", xmlWriter);

        if (localType == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("type cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localType);
        }

        xmlWriter.writeEndElement();
      }
      if (localCategoryTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "category", xmlWriter);

        if (localCategory == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("category cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localCategory);
        }

        xmlWriter.writeEndElement();
      }
      if (localAmountTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "amount", xmlWriter);

        if (localAmount == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("amount cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localAmount);
        }

        xmlWriter.writeEndElement();
      }
      if (localAmount_group_fundsTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "amount_group_funds", xmlWriter);

        if (localAmount_group_funds == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException(
                  "amount_group_funds cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localAmount_group_funds);
        }

        xmlWriter.writeEndElement();
      }
      if (localTransaction_dateTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "transaction_date", xmlWriter);

        if (localTransaction_date == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("transaction_date cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localTransaction_date);
        }

        xmlWriter.writeEndElement();
      }
      if (localStatusTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "status", xmlWriter);

        if (localStatus == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("status cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localStatus);
        }

        xmlWriter.writeEndElement();
      }
      if (localPayment_methodTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "payment_method", xmlWriter);

        if (localPayment_method == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("payment_method cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localPayment_method);
        }

        xmlWriter.writeEndElement();
      }
      if (localVendorTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "vendor", xmlWriter);

        if (localVendor == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("vendor cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localVendor);
        }

        xmlWriter.writeEndElement();
      }
      if (localReference_numberTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "reference_number", xmlWriter);

        if (localReference_number == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("reference_number cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localReference_number);
        }

        xmlWriter.writeEndElement();
      }
      if (localAdditional_notesTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "additional_notes", xmlWriter);

        if (localAdditional_notes == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("additional_notes cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localAdditional_notes);
        }

        xmlWriter.writeEndElement();
      }
      if (localExternal_transaction_idTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "external_transaction_id", xmlWriter);

        if (localExternal_transaction_id == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException(
                  "external_transaction_id cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localExternal_transaction_id);
        }

        xmlWriter.writeEndElement();
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://campusgroups.com/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(
            java.lang.String prefix,
            java.lang.String namespace,
            java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(
            java.lang.String prefix,
            java.lang.String namespace,
            java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(
            java.lang.String namespace,
            java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
                registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(
            java.lang.String namespace,
            java.lang.String attName,
            javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /**
     * method to handle Qnames
     */
    private void writeQName(
            javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
                  prefix
                          + ":"
                          + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
            javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                      .append(prefix)
                      .append(":")
                      .append(
                              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /**
     * Factory class that keeps the parse method
     */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
              org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static CreateUpdateTransaction parse(javax.xml.stream.XMLStreamReader reader)
              throws java.lang.Exception {
        CreateUpdateTransaction object = new CreateUpdateTransaction();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
                  != null) {
            java.lang.String fullTypeName =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"CreateUpdateTransaction".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (CreateUpdateTransaction) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "school")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "school" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setSchool(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "api_key")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "api_key" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setApi_key(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "timestamp")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "timestamp" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setTimestamp(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "auth_token")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "auth_token" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setAuth_token(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "group_acronym")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "group_acronym" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setGroup_acronym(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "budget")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "budget" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setBudget(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "description")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "description" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setDescription(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "type")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "type" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setType(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "category")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "category" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setCategory(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "amount")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "amount" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setAmount(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "amount_group_funds")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "amount_group_funds" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setAmount_group_funds(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "transaction_date")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "transaction_date" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setTransaction_date(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "status")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "status" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setStatus(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "payment_method")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "payment_method" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setPayment_method(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "vendor")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "vendor" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setVendor(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "reference_number")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "reference_number" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setReference_number(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "additional_notes")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "additional_notes" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setAdditional_notes(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName(
                  "http://campusgroups.com/", "external_transaction_id")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "external_transaction_id" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setExternal_transaction_id(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class Custom_field implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
    name = custom_field
    Namespace URI = http://campusgroups.com/
    Namespace Prefix = ns1
    */

    /**
     * field for Custom_field_id
     */
    protected int localCustom_field_id;

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getCustom_field_id() {
      return localCustom_field_id;
    }

    /**
     * Auto generated setter method
     *
     * @param param Custom_field_id
     */
    public void setCustom_field_id(int param) {

      this.localCustom_field_id = param;
    }

    /**
     * field for Custom_field_value
     */
    protected java.lang.String localCustom_field_value;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCustom_field_valueTracker = false;

    public boolean isCustom_field_valueSpecified() {
      return localCustom_field_valueTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCustom_field_value() {
      return localCustom_field_value;
    }

    /**
     * Auto generated setter method
     *
     * @param param Custom_field_value
     */
    public void setCustom_field_value(java.lang.String param) {
      localCustom_field_valueTracker = param != null;

      this.localCustom_field_value = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
              new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
    }

    public void serialize(
            final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
            final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter,
            boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://campusgroups.com/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
                  "xsi",
                  "http://www.w3.org/2001/XMLSchema-instance",
                  "type",
                  namespacePrefix + ":custom_field",
                  xmlWriter);
        } else {
          writeAttribute(
                  "xsi",
                  "http://www.w3.org/2001/XMLSchema-instance",
                  "type",
                  "custom_field",
                  xmlWriter);
        }
      }

      namespace = "http://campusgroups.com/";
      writeStartElement(null, namespace, "custom_field_id", xmlWriter);

      if (localCustom_field_id == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("custom_field_id cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCustom_field_id));
      }

      xmlWriter.writeEndElement();
      if (localCustom_field_valueTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "custom_field_value", xmlWriter);

        if (localCustom_field_value == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException(
                  "custom_field_value cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localCustom_field_value);
        }

        xmlWriter.writeEndElement();
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://campusgroups.com/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(
            java.lang.String prefix,
            java.lang.String namespace,
            java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(
            java.lang.String prefix,
            java.lang.String namespace,
            java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(
            java.lang.String namespace,
            java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
                registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(
            java.lang.String namespace,
            java.lang.String attName,
            javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /**
     * method to handle Qnames
     */
    private void writeQName(
            javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
                  prefix
                          + ":"
                          + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
            javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                      .append(prefix)
                      .append(":")
                      .append(
                              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /**
     * Factory class that keeps the parse method
     */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
              org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static Custom_field parse(javax.xml.stream.XMLStreamReader reader)
              throws java.lang.Exception {
        Custom_field object = new Custom_field();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
                  != null) {
            java.lang.String fullTypeName =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"custom_field".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (Custom_field) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "custom_field_id")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "custom_field_id" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setCustom_field_id(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "custom_field_value")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "custom_field_value" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setCustom_field_value(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class APIEventResult implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
    name = APIEventResult
    Namespace URI = http://campusgroups.com/
    Namespace Prefix = ns1
    */

    /**
     * field for Cg_event_id
     */
    protected int localCg_event_id;

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getCg_event_id() {
      return localCg_event_id;
    }

    /**
     * Auto generated setter method
     *
     * @param param Cg_event_id
     */
    public void setCg_event_id(int param) {

      this.localCg_event_id = param;
    }

    /**
     * field for Message_code
     */
    protected int localMessage_code;

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getMessage_code() {
      return localMessage_code;
    }

    /**
     * Auto generated setter method
     *
     * @param param Message_code
     */
    public void setMessage_code(int param) {

      this.localMessage_code = param;
    }

    /**
     * field for Message
     */
    protected java.lang.String localMessage;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMessageTracker = false;

    public boolean isMessageSpecified() {
      return localMessageTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getMessage() {
      return localMessage;
    }

    /**
     * Auto generated setter method
     *
     * @param param Message
     */
    public void setMessage(java.lang.String param) {
      localMessageTracker = param != null;

      this.localMessage = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
              new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
    }

    public void serialize(
            final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
            final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter,
            boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://campusgroups.com/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
                  "xsi",
                  "http://www.w3.org/2001/XMLSchema-instance",
                  "type",
                  namespacePrefix + ":APIEventResult",
                  xmlWriter);
        } else {
          writeAttribute(
                  "xsi",
                  "http://www.w3.org/2001/XMLSchema-instance",
                  "type",
                  "APIEventResult",
                  xmlWriter);
        }
      }

      namespace = "http://campusgroups.com/";
      writeStartElement(null, namespace, "cg_event_id", xmlWriter);

      if (localCg_event_id == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("cg_event_id cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCg_event_id));
      }

      xmlWriter.writeEndElement();

      namespace = "http://campusgroups.com/";
      writeStartElement(null, namespace, "message_code", xmlWriter);

      if (localMessage_code == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("message_code cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMessage_code));
      }

      xmlWriter.writeEndElement();
      if (localMessageTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "message", xmlWriter);

        if (localMessage == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("message cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localMessage);
        }

        xmlWriter.writeEndElement();
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://campusgroups.com/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(
            java.lang.String prefix,
            java.lang.String namespace,
            java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(
            java.lang.String prefix,
            java.lang.String namespace,
            java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(
            java.lang.String namespace,
            java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
                registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(
            java.lang.String namespace,
            java.lang.String attName,
            javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /**
     * method to handle Qnames
     */
    private void writeQName(
            javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
                  prefix
                          + ":"
                          + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
            javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                      .append(prefix)
                      .append(":")
                      .append(
                              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /**
     * Factory class that keeps the parse method
     */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
              org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static APIEventResult parse(javax.xml.stream.XMLStreamReader reader)
              throws java.lang.Exception {
        APIEventResult object = new APIEventResult();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
                  != null) {
            java.lang.String fullTypeName =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"APIEventResult".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (APIEventResult) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "cg_event_id")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "cg_event_id" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setCg_event_id(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "message_code")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "message_code" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setMessage_code(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "message")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "message" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setMessage(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class CreateUpdateEvent implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
            new javax.xml.namespace.QName("http://campusgroups.com/", "CreateUpdateEvent", "ns1");

    /**
     * field for School
     */
    protected java.lang.String localSchool;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSchoolTracker = false;

    public boolean isSchoolSpecified() {
      return localSchoolTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getSchool() {
      return localSchool;
    }

    /**
     * Auto generated setter method
     *
     * @param param School
     */
    public void setSchool(java.lang.String param) {
      localSchoolTracker = param != null;

      this.localSchool = param;
    }

    /**
     * field for Api_key
     */
    protected java.lang.String localApi_key;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localApi_keyTracker = false;

    public boolean isApi_keySpecified() {
      return localApi_keyTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getApi_key() {
      return localApi_key;
    }

    /**
     * Auto generated setter method
     *
     * @param param Api_key
     */
    public void setApi_key(java.lang.String param) {
      localApi_keyTracker = param != null;

      this.localApi_key = param;
    }

    /**
     * field for Timestamp
     */
    protected java.lang.String localTimestamp;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTimestampTracker = false;

    public boolean isTimestampSpecified() {
      return localTimestampTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getTimestamp() {
      return localTimestamp;
    }

    /**
     * Auto generated setter method
     *
     * @param param Timestamp
     */
    public void setTimestamp(java.lang.String param) {
      localTimestampTracker = param != null;

      this.localTimestamp = param;
    }

    /**
     * field for Auth_token
     */
    protected java.lang.String localAuth_token;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAuth_tokenTracker = false;

    public boolean isAuth_tokenSpecified() {
      return localAuth_tokenTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getAuth_token() {
      return localAuth_token;
    }

    /**
     * Auto generated setter method
     *
     * @param param Auth_token
     */
    public void setAuth_token(java.lang.String param) {
      localAuth_tokenTracker = param != null;

      this.localAuth_token = param;
    }

    /**
     * field for Cg_event_id
     */
    protected java.lang.String localCg_event_id;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCg_event_idTracker = false;

    public boolean isCg_event_idSpecified() {
      return localCg_event_idTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCg_event_id() {
      return localCg_event_id;
    }

    /**
     * Auto generated setter method
     *
     * @param param Cg_event_id
     */
    public void setCg_event_id(java.lang.String param) {
      localCg_event_idTracker = param != null;

      this.localCg_event_id = param;
    }

    /**
     * field for Cg_group_acronym
     */
    protected java.lang.String localCg_group_acronym;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCg_group_acronymTracker = false;

    public boolean isCg_group_acronymSpecified() {
      return localCg_group_acronymTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCg_group_acronym() {
      return localCg_group_acronym;
    }

    /**
     * Auto generated setter method
     *
     * @param param Cg_group_acronym
     */
    public void setCg_group_acronym(java.lang.String param) {
      localCg_group_acronymTracker = param != null;

      this.localCg_group_acronym = param;
    }

    /**
     * field for External_event_id
     */
    protected java.lang.String localExternal_event_id;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localExternal_event_idTracker = false;

    public boolean isExternal_event_idSpecified() {
      return localExternal_event_idTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getExternal_event_id() {
      return localExternal_event_id;
    }

    /**
     * Auto generated setter method
     *
     * @param param External_event_id
     */
    public void setExternal_event_id(java.lang.String param) {
      localExternal_event_idTracker = param != null;

      this.localExternal_event_id = param;
    }

    /**
     * field for Event_coordinator
     */
    protected java.lang.String localEvent_coordinator;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEvent_coordinatorTracker = false;

    public boolean isEvent_coordinatorSpecified() {
      return localEvent_coordinatorTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getEvent_coordinator() {
      return localEvent_coordinator;
    }

    /**
     * Auto generated setter method
     *
     * @param param Event_coordinator
     */
    public void setEvent_coordinator(java.lang.String param) {
      localEvent_coordinatorTracker = param != null;

      this.localEvent_coordinator = param;
    }

    /**
     * field for Event_name
     */
    protected java.lang.String localEvent_name;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEvent_nameTracker = false;

    public boolean isEvent_nameSpecified() {
      return localEvent_nameTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getEvent_name() {
      return localEvent_name;
    }

    /**
     * Auto generated setter method
     *
     * @param param Event_name
     */
    public void setEvent_name(java.lang.String param) {
      localEvent_nameTracker = param != null;

      this.localEvent_name = param;
    }

    /**
     * field for Quick_description
     */
    protected java.lang.String localQuick_description;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localQuick_descriptionTracker = false;

    public boolean isQuick_descriptionSpecified() {
      return localQuick_descriptionTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getQuick_description() {
      return localQuick_description;
    }

    /**
     * Auto generated setter method
     *
     * @param param Quick_description
     */
    public void setQuick_description(java.lang.String param) {
      localQuick_descriptionTracker = param != null;

      this.localQuick_description = param;
    }

    /**
     * field for Event_start_date
     */
    protected java.lang.String localEvent_start_date;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEvent_start_dateTracker = false;

    public boolean isEvent_start_dateSpecified() {
      return localEvent_start_dateTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getEvent_start_date() {
      return localEvent_start_date;
    }

    /**
     * Auto generated setter method
     *
     * @param param Event_start_date
     */
    public void setEvent_start_date(java.lang.String param) {
      localEvent_start_dateTracker = param != null;

      this.localEvent_start_date = param;
    }

    /**
     * field for Event_start_time
     */
    protected java.lang.String localEvent_start_time;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEvent_start_timeTracker = false;

    public boolean isEvent_start_timeSpecified() {
      return localEvent_start_timeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getEvent_start_time() {
      return localEvent_start_time;
    }

    /**
     * Auto generated setter method
     *
     * @param param Event_start_time
     */
    public void setEvent_start_time(java.lang.String param) {
      localEvent_start_timeTracker = param != null;

      this.localEvent_start_time = param;
    }

    /**
     * field for Event_end_date
     */
    protected java.lang.String localEvent_end_date;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEvent_end_dateTracker = false;

    public boolean isEvent_end_dateSpecified() {
      return localEvent_end_dateTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getEvent_end_date() {
      return localEvent_end_date;
    }

    /**
     * Auto generated setter method
     *
     * @param param Event_end_date
     */
    public void setEvent_end_date(java.lang.String param) {
      localEvent_end_dateTracker = param != null;

      this.localEvent_end_date = param;
    }

    /**
     * field for Event_end_time
     */
    protected java.lang.String localEvent_end_time;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEvent_end_timeTracker = false;

    public boolean isEvent_end_timeSpecified() {
      return localEvent_end_timeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getEvent_end_time() {
      return localEvent_end_time;
    }

    /**
     * Auto generated setter method
     *
     * @param param Event_end_time
     */
    public void setEvent_end_time(java.lang.String param) {
      localEvent_end_timeTracker = param != null;

      this.localEvent_end_time = param;
    }

    /**
     * field for Event_location
     */
    protected java.lang.String localEvent_location;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEvent_locationTracker = false;

    public boolean isEvent_locationSpecified() {
      return localEvent_locationTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getEvent_location() {
      return localEvent_location;
    }

    /**
     * Auto generated setter method
     *
     * @param param Event_location
     */
    public void setEvent_location(java.lang.String param) {
      localEvent_locationTracker = param != null;

      this.localEvent_location = param;
    }

    /**
     * field for Room_id
     */
    protected java.lang.String localRoom_id;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRoom_idTracker = false;

    public boolean isRoom_idSpecified() {
      return localRoom_idTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getRoom_id() {
      return localRoom_id;
    }

    /**
     * Auto generated setter method
     *
     * @param param Room_id
     */
    public void setRoom_id(java.lang.String param) {
      localRoom_idTracker = param != null;

      this.localRoom_id = param;
    }

    /**
     * field for Event_display_to
     */
    protected java.lang.String localEvent_display_to;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEvent_display_toTracker = false;

    public boolean isEvent_display_toSpecified() {
      return localEvent_display_toTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getEvent_display_to() {
      return localEvent_display_to;
    }

    /**
     * Auto generated setter method
     *
     * @param param Event_display_to
     */
    public void setEvent_display_to(java.lang.String param) {
      localEvent_display_toTracker = param != null;

      this.localEvent_display_to = param;
    }

    /**
     * field for Allow_rsvp
     */
    protected java.lang.String localAllow_rsvp;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAllow_rsvpTracker = false;

    public boolean isAllow_rsvpSpecified() {
      return localAllow_rsvpTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getAllow_rsvp() {
      return localAllow_rsvp;
    }

    /**
     * Auto generated setter method
     *
     * @param param Allow_rsvp
     */
    public void setAllow_rsvp(java.lang.String param) {
      localAllow_rsvpTracker = param != null;

      this.localAllow_rsvp = param;
    }

    /**
     * field for Event_type
     */
    protected java.lang.String localEvent_type;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEvent_typeTracker = false;

    public boolean isEvent_typeSpecified() {
      return localEvent_typeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getEvent_type() {
      return localEvent_type;
    }

    /**
     * Auto generated setter method
     *
     * @param param Event_type
     */
    public void setEvent_type(java.lang.String param) {
      localEvent_typeTracker = param != null;

      this.localEvent_type = param;
    }

    /**
     * field for Event_open_to
     */
    protected java.lang.String localEvent_open_to;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEvent_open_toTracker = false;

    public boolean isEvent_open_toSpecified() {
      return localEvent_open_toTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getEvent_open_to() {
      return localEvent_open_to;
    }

    /**
     * Auto generated setter method
     *
     * @param param Event_open_to
     */
    public void setEvent_open_to(java.lang.String param) {
      localEvent_open_toTracker = param != null;

      this.localEvent_open_to = param;
    }

    /**
     * field for Delete_event
     */
    protected java.lang.String localDelete_event;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDelete_eventTracker = false;

    public boolean isDelete_eventSpecified() {
      return localDelete_eventTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getDelete_event() {
      return localDelete_event;
    }

    /**
     * Auto generated setter method
     *
     * @param param Delete_event
     */
    public void setDelete_event(java.lang.String param) {
      localDelete_eventTracker = param != null;

      this.localDelete_event = param;
    }

    /**
     * field for Hide_from_events_slider
     */
    protected java.lang.String localHide_from_events_slider;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localHide_from_events_sliderTracker = false;

    public boolean isHide_from_events_sliderSpecified() {
      return localHide_from_events_sliderTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getHide_from_events_slider() {
      return localHide_from_events_slider;
    }

    /**
     * Auto generated setter method
     *
     * @param param Hide_from_events_slider
     */
    public void setHide_from_events_slider(java.lang.String param) {
      localHide_from_events_sliderTracker = param != null;

      this.localHide_from_events_slider = param;
    }

    /**
     * field for Force_display_on_rooms_schedule
     */
    protected java.lang.String localForce_display_on_rooms_schedule;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localForce_display_on_rooms_scheduleTracker = false;

    public boolean isForce_display_on_rooms_scheduleSpecified() {
      return localForce_display_on_rooms_scheduleTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getForce_display_on_rooms_schedule() {
      return localForce_display_on_rooms_schedule;
    }

    /**
     * Auto generated setter method
     *
     * @param param Force_display_on_rooms_schedule
     */
    public void setForce_display_on_rooms_schedule(java.lang.String param) {
      localForce_display_on_rooms_scheduleTracker = param != null;

      this.localForce_display_on_rooms_schedule = param;
    }

    /**
     * field for External_registration_link
     */
    protected java.lang.String localExternal_registration_link;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localExternal_registration_linkTracker = false;

    public boolean isExternal_registration_linkSpecified() {
      return localExternal_registration_linkTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getExternal_registration_link() {
      return localExternal_registration_link;
    }

    /**
     * Auto generated setter method
     *
     * @param param External_registration_link
     */
    public void setExternal_registration_link(java.lang.String param) {
      localExternal_registration_linkTracker = param != null;

      this.localExternal_registration_link = param;
    }

    /**
     * field for Location_type
     */
    protected java.lang.String localLocation_type;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localLocation_typeTracker = false;

    public boolean isLocation_typeSpecified() {
      return localLocation_typeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getLocation_type() {
      return localLocation_type;
    }

    /**
     * Auto generated setter method
     *
     * @param param Location_type
     */
    public void setLocation_type(java.lang.String param) {
      localLocation_typeTracker = param != null;

      this.localLocation_type = param;
    }

    /**
     * field for Event_audience
     */
    protected java.lang.String localEvent_audience;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEvent_audienceTracker = false;

    public boolean isEvent_audienceSpecified() {
      return localEvent_audienceTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getEvent_audience() {
      return localEvent_audience;
    }

    /**
     * Auto generated setter method
     *
     * @param param Event_audience
     */
    public void setEvent_audience(java.lang.String param) {
      localEvent_audienceTracker = param != null;

      this.localEvent_audience = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
              new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
            final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
            final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter,
            boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://campusgroups.com/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
                  "xsi",
                  "http://www.w3.org/2001/XMLSchema-instance",
                  "type",
                  namespacePrefix + ":CreateUpdateEvent",
                  xmlWriter);
        } else {
          writeAttribute(
                  "xsi",
                  "http://www.w3.org/2001/XMLSchema-instance",
                  "type",
                  "CreateUpdateEvent",
                  xmlWriter);
        }
      }
      if (localSchoolTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "school", xmlWriter);

        if (localSchool == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("school cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localSchool);
        }

        xmlWriter.writeEndElement();
      }
      if (localApi_keyTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "api_key", xmlWriter);

        if (localApi_key == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("api_key cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localApi_key);
        }

        xmlWriter.writeEndElement();
      }
      if (localTimestampTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "timestamp", xmlWriter);

        if (localTimestamp == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("timestamp cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localTimestamp);
        }

        xmlWriter.writeEndElement();
      }
      if (localAuth_tokenTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "auth_token", xmlWriter);

        if (localAuth_token == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("auth_token cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localAuth_token);
        }

        xmlWriter.writeEndElement();
      }
      if (localCg_event_idTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "cg_event_id", xmlWriter);

        if (localCg_event_id == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("cg_event_id cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localCg_event_id);
        }

        xmlWriter.writeEndElement();
      }
      if (localCg_group_acronymTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "cg_group_acronym", xmlWriter);

        if (localCg_group_acronym == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("cg_group_acronym cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localCg_group_acronym);
        }

        xmlWriter.writeEndElement();
      }
      if (localExternal_event_idTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "external_event_id", xmlWriter);

        if (localExternal_event_id == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("external_event_id cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localExternal_event_id);
        }

        xmlWriter.writeEndElement();
      }
      if (localEvent_coordinatorTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "event_coordinator", xmlWriter);

        if (localEvent_coordinator == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("event_coordinator cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localEvent_coordinator);
        }

        xmlWriter.writeEndElement();
      }
      if (localEvent_nameTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "event_name", xmlWriter);

        if (localEvent_name == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("event_name cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localEvent_name);
        }

        xmlWriter.writeEndElement();
      }
      if (localQuick_descriptionTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "quick_description", xmlWriter);

        if (localQuick_description == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("quick_description cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localQuick_description);
        }

        xmlWriter.writeEndElement();
      }
      if (localEvent_start_dateTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "event_start_date", xmlWriter);

        if (localEvent_start_date == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("event_start_date cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localEvent_start_date);
        }

        xmlWriter.writeEndElement();
      }
      if (localEvent_start_timeTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "event_start_time", xmlWriter);

        if (localEvent_start_time == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("event_start_time cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localEvent_start_time);
        }

        xmlWriter.writeEndElement();
      }
      if (localEvent_end_dateTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "event_end_date", xmlWriter);

        if (localEvent_end_date == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("event_end_date cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localEvent_end_date);
        }

        xmlWriter.writeEndElement();
      }
      if (localEvent_end_timeTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "event_end_time", xmlWriter);

        if (localEvent_end_time == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("event_end_time cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localEvent_end_time);
        }

        xmlWriter.writeEndElement();
      }
      if (localEvent_locationTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "event_location", xmlWriter);

        if (localEvent_location == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("event_location cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localEvent_location);
        }

        xmlWriter.writeEndElement();
      }
      if (localRoom_idTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "room_id", xmlWriter);

        if (localRoom_id == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("room_id cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localRoom_id);
        }

        xmlWriter.writeEndElement();
      }
      if (localEvent_display_toTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "event_display_to", xmlWriter);

        if (localEvent_display_to == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("event_display_to cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localEvent_display_to);
        }

        xmlWriter.writeEndElement();
      }
      if (localAllow_rsvpTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "allow_rsvp", xmlWriter);

        if (localAllow_rsvp == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("allow_rsvp cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localAllow_rsvp);
        }

        xmlWriter.writeEndElement();
      }
      if (localEvent_typeTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "event_type", xmlWriter);

        if (localEvent_type == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("event_type cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localEvent_type);
        }

        xmlWriter.writeEndElement();
      }
      if (localEvent_open_toTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "event_open_to", xmlWriter);

        if (localEvent_open_to == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("event_open_to cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localEvent_open_to);
        }

        xmlWriter.writeEndElement();
      }
      if (localDelete_eventTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "delete_event", xmlWriter);

        if (localDelete_event == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("delete_event cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localDelete_event);
        }

        xmlWriter.writeEndElement();
      }
      if (localHide_from_events_sliderTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "hide_from_events_slider", xmlWriter);

        if (localHide_from_events_slider == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException(
                  "hide_from_events_slider cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localHide_from_events_slider);
        }

        xmlWriter.writeEndElement();
      }
      if (localForce_display_on_rooms_scheduleTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "force_display_on_rooms_schedule", xmlWriter);

        if (localForce_display_on_rooms_schedule == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException(
                  "force_display_on_rooms_schedule cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localForce_display_on_rooms_schedule);
        }

        xmlWriter.writeEndElement();
      }
      if (localExternal_registration_linkTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "external_registration_link", xmlWriter);

        if (localExternal_registration_link == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException(
                  "external_registration_link cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localExternal_registration_link);
        }

        xmlWriter.writeEndElement();
      }
      if (localLocation_typeTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "location_type", xmlWriter);

        if (localLocation_type == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("location_type cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localLocation_type);
        }

        xmlWriter.writeEndElement();
      }
      if (localEvent_audienceTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "event_audience", xmlWriter);

        if (localEvent_audience == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("event_audience cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localEvent_audience);
        }

        xmlWriter.writeEndElement();
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://campusgroups.com/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(
            java.lang.String prefix,
            java.lang.String namespace,
            java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(
            java.lang.String prefix,
            java.lang.String namespace,
            java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(
            java.lang.String namespace,
            java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
                registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(
            java.lang.String namespace,
            java.lang.String attName,
            javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /**
     * method to handle Qnames
     */
    private void writeQName(
            javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
                  prefix
                          + ":"
                          + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
            javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                      .append(prefix)
                      .append(":")
                      .append(
                              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /**
     * Factory class that keeps the parse method
     */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
              org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static CreateUpdateEvent parse(javax.xml.stream.XMLStreamReader reader)
              throws java.lang.Exception {
        CreateUpdateEvent object = new CreateUpdateEvent();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
                  != null) {
            java.lang.String fullTypeName =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"CreateUpdateEvent".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (CreateUpdateEvent) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "school")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "school" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setSchool(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "api_key")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "api_key" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setApi_key(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "timestamp")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "timestamp" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setTimestamp(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "auth_token")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "auth_token" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setAuth_token(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "cg_event_id")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "cg_event_id" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setCg_event_id(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "cg_group_acronym")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "cg_group_acronym" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setCg_group_acronym(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "external_event_id")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "external_event_id" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setExternal_event_id(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "event_coordinator")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "event_coordinator" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setEvent_coordinator(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "event_name")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "event_name" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setEvent_name(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "quick_description")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "quick_description" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setQuick_description(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "event_start_date")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "event_start_date" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setEvent_start_date(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "event_start_time")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "event_start_time" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setEvent_start_time(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "event_end_date")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "event_end_date" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setEvent_end_date(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "event_end_time")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "event_end_time" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setEvent_end_time(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "event_location")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "event_location" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setEvent_location(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "room_id")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "room_id" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setRoom_id(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "event_display_to")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "event_display_to" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setEvent_display_to(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "allow_rsvp")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "allow_rsvp" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setAllow_rsvp(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "event_type")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "event_type" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setEvent_type(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "event_open_to")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "event_open_to" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setEvent_open_to(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "delete_event")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "delete_event" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setDelete_event(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName(
                  "http://campusgroups.com/", "hide_from_events_slider")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "hide_from_events_slider" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setHide_from_events_slider(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName(
                  "http://campusgroups.com/", "force_display_on_rooms_schedule")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "force_display_on_rooms_schedule" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setForce_display_on_rooms_schedule(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName(
                  "http://campusgroups.com/", "external_registration_link")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "external_registration_link" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setExternal_registration_link(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "location_type")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "location_type" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setLocation_type(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "event_audience")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "event_audience" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setEvent_audience(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class CreateUpdateMember implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
            new javax.xml.namespace.QName("http://campusgroups.com/", "CreateUpdateMember", "ns1");

    /**
     * field for School
     */
    protected java.lang.String localSchool;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSchoolTracker = false;

    public boolean isSchoolSpecified() {
      return localSchoolTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getSchool() {
      return localSchool;
    }

    /**
     * Auto generated setter method
     *
     * @param param School
     */
    public void setSchool(java.lang.String param) {
      localSchoolTracker = param != null;

      this.localSchool = param;
    }

    /**
     * field for Api_key
     */
    protected java.lang.String localApi_key;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localApi_keyTracker = false;

    public boolean isApi_keySpecified() {
      return localApi_keyTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getApi_key() {
      return localApi_key;
    }

    /**
     * Auto generated setter method
     *
     * @param param Api_key
     */
    public void setApi_key(java.lang.String param) {
      localApi_keyTracker = param != null;

      this.localApi_key = param;
    }

    /**
     * field for Timestamp
     */
    protected java.lang.String localTimestamp;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTimestampTracker = false;

    public boolean isTimestampSpecified() {
      return localTimestampTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getTimestamp() {
      return localTimestamp;
    }

    /**
     * Auto generated setter method
     *
     * @param param Timestamp
     */
    public void setTimestamp(java.lang.String param) {
      localTimestampTracker = param != null;

      this.localTimestamp = param;
    }

    /**
     * field for Auth_token
     */
    protected java.lang.String localAuth_token;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAuth_tokenTracker = false;

    public boolean isAuth_tokenSpecified() {
      return localAuth_tokenTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getAuth_token() {
      return localAuth_token;
    }

    /**
     * Auto generated setter method
     *
     * @param param Auth_token
     */
    public void setAuth_token(java.lang.String param) {
      localAuth_tokenTracker = param != null;

      this.localAuth_token = param;
    }

    /**
     * field for Cg_id
     */
    protected java.lang.String localCg_id;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCg_idTracker = false;

    public boolean isCg_idSpecified() {
      return localCg_idTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCg_id() {
      return localCg_id;
    }

    /**
     * Auto generated setter method
     *
     * @param param Cg_id
     */
    public void setCg_id(java.lang.String param) {
      localCg_idTracker = param != null;

      this.localCg_id = param;
    }

    /**
     * field for Cg_group_id
     */
    protected java.lang.String localCg_group_id;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCg_group_idTracker = false;

    public boolean isCg_group_idSpecified() {
      return localCg_group_idTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCg_group_id() {
      return localCg_group_id;
    }

    /**
     * Auto generated setter method
     *
     * @param param Cg_group_id
     */
    public void setCg_group_id(java.lang.String param) {
      localCg_group_idTracker = param != null;

      this.localCg_group_id = param;
    }

    /**
     * field for Main_contact
     */
    protected java.lang.String localMain_contact;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMain_contactTracker = false;

    public boolean isMain_contactSpecified() {
      return localMain_contactTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getMain_contact() {
      return localMain_contact;
    }

    /**
     * Auto generated setter method
     *
     * @param param Main_contact
     */
    public void setMain_contact(java.lang.String param) {
      localMain_contactTracker = param != null;

      this.localMain_contact = param;
    }

    /**
     * field for Member
     */
    protected java.lang.String localMember;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMemberTracker = false;

    public boolean isMemberSpecified() {
      return localMemberTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getMember() {
      return localMember;
    }

    /**
     * Auto generated setter method
     *
     * @param param Member
     */
    public void setMember(java.lang.String param) {
      localMemberTracker = param != null;

      this.localMember = param;
    }

    /**
     * field for Officer
     */
    protected java.lang.String localOfficer;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localOfficerTracker = false;

    public boolean isOfficerSpecified() {
      return localOfficerTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getOfficer() {
      return localOfficer;
    }

    /**
     * Auto generated setter method
     *
     * @param param Officer
     */
    public void setOfficer(java.lang.String param) {
      localOfficerTracker = param != null;

      this.localOfficer = param;
    }

    /**
     * field for Active_officer
     */
    protected java.lang.String localActive_officer;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localActive_officerTracker = false;

    public boolean isActive_officerSpecified() {
      return localActive_officerTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getActive_officer() {
      return localActive_officer;
    }

    /**
     * Auto generated setter method
     *
     * @param param Active_officer
     */
    public void setActive_officer(java.lang.String param) {
      localActive_officerTracker = param != null;

      this.localActive_officer = param;
    }

    /**
     * field for Cannot_leave_group
     */
    protected java.lang.String localCannot_leave_group;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCannot_leave_groupTracker = false;

    public boolean isCannot_leave_groupSpecified() {
      return localCannot_leave_groupTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCannot_leave_group() {
      return localCannot_leave_group;
    }

    /**
     * Auto generated setter method
     *
     * @param param Cannot_leave_group
     */
    public void setCannot_leave_group(java.lang.String param) {
      localCannot_leave_groupTracker = param != null;

      this.localCannot_leave_group = param;
    }

    /**
     * field for Membership_end_date
     */
    protected java.lang.String localMembership_end_date;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMembership_end_dateTracker = false;

    public boolean isMembership_end_dateSpecified() {
      return localMembership_end_dateTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getMembership_end_date() {
      return localMembership_end_date;
    }

    /**
     * Auto generated setter method
     *
     * @param param Membership_end_date
     */
    public void setMembership_end_date(java.lang.String param) {
      localMembership_end_dateTracker = param != null;

      this.localMembership_end_date = param;
    }

    /**
     * field for Student_netid
     */
    protected java.lang.String localStudent_netid;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localStudent_netidTracker = false;

    public boolean isStudent_netidSpecified() {
      return localStudent_netidTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getStudent_netid() {
      return localStudent_netid;
    }

    /**
     * Auto generated setter method
     *
     * @param param Student_netid
     */
    public void setStudent_netid(java.lang.String param) {
      localStudent_netidTracker = param != null;

      this.localStudent_netid = param;
    }

    /**
     * field for Group_acronym
     */
    protected java.lang.String localGroup_acronym;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localGroup_acronymTracker = false;

    public boolean isGroup_acronymSpecified() {
      return localGroup_acronymTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getGroup_acronym() {
      return localGroup_acronym;
    }

    /**
     * Auto generated setter method
     *
     * @param param Group_acronym
     */
    public void setGroup_acronym(java.lang.String param) {
      localGroup_acronymTracker = param != null;

      this.localGroup_acronym = param;
    }

    /**
     * field for Member_tags
     */
    protected java.lang.String localMember_tags;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMember_tagsTracker = false;

    public boolean isMember_tagsSpecified() {
      return localMember_tagsTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getMember_tags() {
      return localMember_tags;
    }

    /**
     * Auto generated setter method
     *
     * @param param Member_tags
     */
    public void setMember_tags(java.lang.String param) {
      localMember_tagsTracker = param != null;

      this.localMember_tags = param;
    }

    /**
     * field for Does_not_receive_group_emails
     */
    protected java.lang.String localDoes_not_receive_group_emails;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDoes_not_receive_group_emailsTracker = false;

    public boolean isDoes_not_receive_group_emailsSpecified() {
      return localDoes_not_receive_group_emailsTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getDoes_not_receive_group_emails() {
      return localDoes_not_receive_group_emails;
    }

    /**
     * Auto generated setter method
     *
     * @param param Does_not_receive_group_emails
     */
    public void setDoes_not_receive_group_emails(java.lang.String param) {
      localDoes_not_receive_group_emailsTracker = param != null;

      this.localDoes_not_receive_group_emails = param;
    }

    /**
     * field for Custom_fields
     */
    protected ArrayOfCustom_field localCustom_fields;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCustom_fieldsTracker = false;

    public boolean isCustom_fieldsSpecified() {
      return localCustom_fieldsTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return ArrayOfCustom_field
     */
    public ArrayOfCustom_field getCustom_fields() {
      return localCustom_fields;
    }

    /**
     * Auto generated setter method
     *
     * @param param Custom_fields
     */
    public void setCustom_fields(ArrayOfCustom_field param) {
      localCustom_fieldsTracker = param != null;

      this.localCustom_fields = param;
    }

    /**
     * field for Deleted
     */
    protected java.lang.String localDeleted;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDeletedTracker = false;

    public boolean isDeletedSpecified() {
      return localDeletedTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getDeleted() {
      return localDeleted;
    }

    /**
     * Auto generated setter method
     *
     * @param param Deleted
     */
    public void setDeleted(java.lang.String param) {
      localDeletedTracker = param != null;

      this.localDeleted = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
              new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
            final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
            final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter,
            boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://campusgroups.com/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
                  "xsi",
                  "http://www.w3.org/2001/XMLSchema-instance",
                  "type",
                  namespacePrefix + ":CreateUpdateMember",
                  xmlWriter);
        } else {
          writeAttribute(
                  "xsi",
                  "http://www.w3.org/2001/XMLSchema-instance",
                  "type",
                  "CreateUpdateMember",
                  xmlWriter);
        }
      }
      if (localSchoolTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "school", xmlWriter);

        if (localSchool == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("school cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localSchool);
        }

        xmlWriter.writeEndElement();
      }
      if (localApi_keyTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "api_key", xmlWriter);

        if (localApi_key == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("api_key cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localApi_key);
        }

        xmlWriter.writeEndElement();
      }
      if (localTimestampTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "timestamp", xmlWriter);

        if (localTimestamp == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("timestamp cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localTimestamp);
        }

        xmlWriter.writeEndElement();
      }
      if (localAuth_tokenTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "auth_token", xmlWriter);

        if (localAuth_token == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("auth_token cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localAuth_token);
        }

        xmlWriter.writeEndElement();
      }
      if (localCg_idTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "cg_id", xmlWriter);

        if (localCg_id == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("cg_id cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localCg_id);
        }

        xmlWriter.writeEndElement();
      }
      if (localCg_group_idTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "cg_group_id", xmlWriter);

        if (localCg_group_id == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("cg_group_id cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localCg_group_id);
        }

        xmlWriter.writeEndElement();
      }
      if (localMain_contactTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "main_contact", xmlWriter);

        if (localMain_contact == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("main_contact cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localMain_contact);
        }

        xmlWriter.writeEndElement();
      }
      if (localMemberTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "member", xmlWriter);

        if (localMember == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("member cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localMember);
        }

        xmlWriter.writeEndElement();
      }
      if (localOfficerTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "officer", xmlWriter);

        if (localOfficer == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("officer cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localOfficer);
        }

        xmlWriter.writeEndElement();
      }
      if (localActive_officerTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "active_officer", xmlWriter);

        if (localActive_officer == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("active_officer cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localActive_officer);
        }

        xmlWriter.writeEndElement();
      }
      if (localCannot_leave_groupTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "cannot_leave_group", xmlWriter);

        if (localCannot_leave_group == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException(
                  "cannot_leave_group cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localCannot_leave_group);
        }

        xmlWriter.writeEndElement();
      }
      if (localMembership_end_dateTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "membership_end_date", xmlWriter);

        if (localMembership_end_date == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException(
                  "membership_end_date cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localMembership_end_date);
        }

        xmlWriter.writeEndElement();
      }
      if (localStudent_netidTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "student_netid", xmlWriter);

        if (localStudent_netid == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("student_netid cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localStudent_netid);
        }

        xmlWriter.writeEndElement();
      }
      if (localGroup_acronymTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "group_acronym", xmlWriter);

        if (localGroup_acronym == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("group_acronym cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localGroup_acronym);
        }

        xmlWriter.writeEndElement();
      }
      if (localMember_tagsTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "member_tags", xmlWriter);

        if (localMember_tags == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("member_tags cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localMember_tags);
        }

        xmlWriter.writeEndElement();
      }
      if (localDoes_not_receive_group_emailsTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "does_not_receive_group_emails", xmlWriter);

        if (localDoes_not_receive_group_emails == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException(
                  "does_not_receive_group_emails cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localDoes_not_receive_group_emails);
        }

        xmlWriter.writeEndElement();
      }
      if (localCustom_fieldsTracker) {
        if (localCustom_fields == null) {
          throw new org.apache.axis2.databinding.ADBException("custom_fields cannot be null!!");
        }
        localCustom_fields.serialize(
                new javax.xml.namespace.QName("http://campusgroups.com/", "custom_fields"), xmlWriter);
      }
      if (localDeletedTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "deleted", xmlWriter);

        if (localDeleted == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("deleted cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localDeleted);
        }

        xmlWriter.writeEndElement();
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://campusgroups.com/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(
            java.lang.String prefix,
            java.lang.String namespace,
            java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(
            java.lang.String prefix,
            java.lang.String namespace,
            java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(
            java.lang.String namespace,
            java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
                registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(
            java.lang.String namespace,
            java.lang.String attName,
            javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /**
     * method to handle Qnames
     */
    private void writeQName(
            javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
                  prefix
                          + ":"
                          + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
            javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                      .append(prefix)
                      .append(":")
                      .append(
                              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /**
     * Factory class that keeps the parse method
     */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
              org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static CreateUpdateMember parse(javax.xml.stream.XMLStreamReader reader)
              throws java.lang.Exception {
        CreateUpdateMember object = new CreateUpdateMember();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
                  != null) {
            java.lang.String fullTypeName =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"CreateUpdateMember".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (CreateUpdateMember) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "school")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "school" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setSchool(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "api_key")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "api_key" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setApi_key(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "timestamp")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "timestamp" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setTimestamp(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "auth_token")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "auth_token" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setAuth_token(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "cg_id")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "cg_id" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setCg_id(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "cg_group_id")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "cg_group_id" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setCg_group_id(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "main_contact")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "main_contact" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setMain_contact(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "member")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "member" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setMember(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "officer")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "officer" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setOfficer(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "active_officer")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "active_officer" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setActive_officer(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "cannot_leave_group")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "cannot_leave_group" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setCannot_leave_group(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "membership_end_date")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "membership_end_date" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setMembership_end_date(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "student_netid")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "student_netid" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setStudent_netid(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "group_acronym")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "group_acronym" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setGroup_acronym(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "member_tags")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "member_tags" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setMember_tags(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName(
                  "http://campusgroups.com/", "does_not_receive_group_emails")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "does_not_receive_group_emails" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setDoes_not_receive_group_emails(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "custom_fields")
                  .equals(reader.getName())) {

            object.setCustom_fields(ArrayOfCustom_field.Factory.parse(reader));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "deleted")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "deleted" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setDeleted(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class CancelRoomReservation implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
            new javax.xml.namespace.QName("http://campusgroups.com/", "CancelRoomReservation", "ns1");

    /**
     * field for School
     */
    protected java.lang.String localSchool;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSchoolTracker = false;

    public boolean isSchoolSpecified() {
      return localSchoolTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getSchool() {
      return localSchool;
    }

    /**
     * Auto generated setter method
     *
     * @param param School
     */
    public void setSchool(java.lang.String param) {
      localSchoolTracker = param != null;

      this.localSchool = param;
    }

    /**
     * field for Timestamp
     */
    protected java.lang.String localTimestamp;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTimestampTracker = false;

    public boolean isTimestampSpecified() {
      return localTimestampTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getTimestamp() {
      return localTimestamp;
    }

    /**
     * Auto generated setter method
     *
     * @param param Timestamp
     */
    public void setTimestamp(java.lang.String param) {
      localTimestampTracker = param != null;

      this.localTimestamp = param;
    }

    /**
     * field for Auth_token
     */
    protected java.lang.String localAuth_token;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAuth_tokenTracker = false;

    public boolean isAuth_tokenSpecified() {
      return localAuth_tokenTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getAuth_token() {
      return localAuth_token;
    }

    /**
     * Auto generated setter method
     *
     * @param param Auth_token
     */
    public void setAuth_token(java.lang.String param) {
      localAuth_tokenTracker = param != null;

      this.localAuth_token = param;
    }

    /**
     * field for Room_reservation_id
     */
    protected java.lang.String localRoom_reservation_id;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRoom_reservation_idTracker = false;

    public boolean isRoom_reservation_idSpecified() {
      return localRoom_reservation_idTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getRoom_reservation_id() {
      return localRoom_reservation_id;
    }

    /**
     * Auto generated setter method
     *
     * @param param Room_reservation_id
     */
    public void setRoom_reservation_id(java.lang.String param) {
      localRoom_reservation_idTracker = param != null;

      this.localRoom_reservation_id = param;
    }

    /**
     * field for External_room_reservation_id
     */
    protected java.lang.String localExternal_room_reservation_id;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localExternal_room_reservation_idTracker = false;

    public boolean isExternal_room_reservation_idSpecified() {
      return localExternal_room_reservation_idTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getExternal_room_reservation_id() {
      return localExternal_room_reservation_id;
    }

    /**
     * Auto generated setter method
     *
     * @param param External_room_reservation_id
     */
    public void setExternal_room_reservation_id(java.lang.String param) {
      localExternal_room_reservation_idTracker = param != null;

      this.localExternal_room_reservation_id = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
            throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
              new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
            final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
            final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter,
            boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://campusgroups.com/");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
                  "xsi",
                  "http://www.w3.org/2001/XMLSchema-instance",
                  "type",
                  namespacePrefix + ":CancelRoomReservation",
                  xmlWriter);
        } else {
          writeAttribute(
                  "xsi",
                  "http://www.w3.org/2001/XMLSchema-instance",
                  "type",
                  "CancelRoomReservation",
                  xmlWriter);
        }
      }
      if (localSchoolTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "school", xmlWriter);

        if (localSchool == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("school cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localSchool);
        }

        xmlWriter.writeEndElement();
      }
      if (localTimestampTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "timestamp", xmlWriter);

        if (localTimestamp == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("timestamp cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localTimestamp);
        }

        xmlWriter.writeEndElement();
      }
      if (localAuth_tokenTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "auth_token", xmlWriter);

        if (localAuth_token == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException("auth_token cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localAuth_token);
        }

        xmlWriter.writeEndElement();
      }
      if (localRoom_reservation_idTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "room_reservation_id", xmlWriter);

        if (localRoom_reservation_id == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException(
                  "room_reservation_id cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localRoom_reservation_id);
        }

        xmlWriter.writeEndElement();
      }
      if (localExternal_room_reservation_idTracker) {
        namespace = "http://campusgroups.com/";
        writeStartElement(null, namespace, "external_room_reservation_id", xmlWriter);

        if (localExternal_room_reservation_id == null) {
          // write the nil attribute

          throw new org.apache.axis2.databinding.ADBException(
                  "external_room_reservation_id cannot be null!!");

        } else {

          xmlWriter.writeCharacters(localExternal_room_reservation_id);
        }

        xmlWriter.writeEndElement();
      }
      xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://campusgroups.com/")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(
            java.lang.String prefix,
            java.lang.String namespace,
            java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(
            java.lang.String prefix,
            java.lang.String namespace,
            java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(
            java.lang.String namespace,
            java.lang.String attName,
            java.lang.String attValue,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
                registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(
            java.lang.String namespace,
            java.lang.String attName,
            javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      java.lang.String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }

    /**
     * method to handle Qnames
     */
    private void writeQName(
            javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
                  prefix
                          + ":"
                          + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
            javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
        java.lang.String namespaceURI = null;
        java.lang.String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                      .append(prefix)
                      .append(":")
                      .append(
                              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(
            javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          java.lang.String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /**
     * Factory class that keeps the parse method
     */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
              org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static CancelRoomReservation parse(javax.xml.stream.XMLStreamReader reader)
              throws java.lang.Exception {
        CancelRoomReservation object = new CancelRoomReservation();

        int event;
        javax.xml.namespace.QName currentQName = null;
        java.lang.String nillableValue = null;
        java.lang.String prefix = "";
        java.lang.String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
                  != null) {
            java.lang.String fullTypeName =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              java.lang.String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"CancelRoomReservation".equals(type)) {
                // find namespace for the prefix
                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (CancelRoomReservation) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "school")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "school" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setSchool(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "timestamp")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "timestamp" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setTimestamp(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "auth_token")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "auth_token" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setAuth_token(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName("http://campusgroups.com/", "room_reservation_id")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "room_reservation_id" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setRoom_reservation_id(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
                  && new javax.xml.namespace.QName(
                  "http://campusgroups.com/", "external_room_reservation_id")
                  .equals(reader.getName())) {

            nillableValue =
                    reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                      "The element: " + "external_room_reservation_id" + "  cannot be null");
            }

            java.lang.String content = reader.getElementText();

            object.setExternal_room_reservation_id(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                    "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new java.lang.Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  private org.apache.axiom.om.OMElement toOM(
          CreateRoomReservation param, boolean optimizeContent)
          throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
              CreateRoomReservation.MY_QNAME,
              org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
          CreateRoomReservationResponse param,
          boolean optimizeContent)
          throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
              CreateRoomReservationResponse.MY_QNAME,
              org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
          CreateUpdateTransaction param, boolean optimizeContent)
          throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
              CreateUpdateTransaction.MY_QNAME,
              org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
          CreateUpdateTransactionResponse param,
          boolean optimizeContent)
          throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
              CreateUpdateTransactionResponse.MY_QNAME,
              org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
          CreateUpdateEvent param, boolean optimizeContent)
          throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
              CreateUpdateEvent.MY_QNAME,
              org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
          CreateUpdateEventResponse param, boolean optimizeContent)
          throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
              CreateUpdateEventResponse.MY_QNAME,
              org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
          CreateUpdateUser param, boolean optimizeContent)
          throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
              CreateUpdateUser.MY_QNAME,
              org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
          CreateUpdateUserResponse param, boolean optimizeContent)
          throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
              CreateUpdateUserResponse.MY_QNAME,
              org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
          CreateUpdateWorkExperience param, boolean optimizeContent)
          throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
              CreateUpdateWorkExperience.MY_QNAME,
              org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
          CreateUpdateWorkExperienceResponse param,
          boolean optimizeContent)
          throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
              CreateUpdateWorkExperienceResponse.MY_QNAME,
              org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
          CreateUpdateAcademicExperience param,
          boolean optimizeContent)
          throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
              CreateUpdateAcademicExperience.MY_QNAME,
              org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
          CreateUpdateAcademicExperienceResponse param,
          boolean optimizeContent)
          throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
              CreateUpdateAcademicExperienceResponse.MY_QNAME,
              org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
          CreateUpdateMember param, boolean optimizeContent)
          throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
              CreateUpdateMember.MY_QNAME,
              org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
          CreateUpdateMemberResponse param, boolean optimizeContent)
          throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
              CreateUpdateMemberResponse.MY_QNAME,
              org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
          CancelRoomReservation param, boolean optimizeContent)
          throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
              CancelRoomReservation.MY_QNAME,
              org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
          CancelRoomReservationResponse param,
          boolean optimizeContent)
          throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
              CancelRoomReservationResponse.MY_QNAME,
              org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
          org.apache.axiom.soap.SOAPFactory factory,
          CreateRoomReservation param,
          boolean optimizeContent,
          javax.xml.namespace.QName elementQName)
          throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
              .getBody()
              .addChild(
                      param.getOMElement(
                              CreateRoomReservation.MY_QNAME, factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
          org.apache.axiom.soap.SOAPFactory factory,
          CreateUpdateTransaction param,
          boolean optimizeContent,
          javax.xml.namespace.QName elementQName)
          throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
              .getBody()
              .addChild(
                      param.getOMElement(
                              CreateUpdateTransaction.MY_QNAME, factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
          org.apache.axiom.soap.SOAPFactory factory,
          CreateUpdateEvent param,
          boolean optimizeContent,
          javax.xml.namespace.QName elementQName)
          throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
              .getBody()
              .addChild(
                      param.getOMElement(
                              CreateUpdateEvent.MY_QNAME, factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
          org.apache.axiom.soap.SOAPFactory factory,
          CreateUpdateUser param,
          boolean optimizeContent,
          javax.xml.namespace.QName elementQName)
          throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
              .getBody()
              .addChild(
                      param.getOMElement(
                              CreateUpdateUser.MY_QNAME, factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
          org.apache.axiom.soap.SOAPFactory factory,
          CreateUpdateWorkExperience param,
          boolean optimizeContent,
          javax.xml.namespace.QName elementQName)
          throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
              .getBody()
              .addChild(
                      param.getOMElement(
                              CreateUpdateWorkExperience.MY_QNAME, factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
          org.apache.axiom.soap.SOAPFactory factory,
          CreateUpdateAcademicExperience param,
          boolean optimizeContent,
          javax.xml.namespace.QName elementQName)
          throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
              .getBody()
              .addChild(
                      param.getOMElement(
                              CreateUpdateAcademicExperience.MY_QNAME,
                              factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
          org.apache.axiom.soap.SOAPFactory factory,
          CreateUpdateMember param,
          boolean optimizeContent,
          javax.xml.namespace.QName elementQName)
          throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
              .getBody()
              .addChild(
                      param.getOMElement(
                              CreateUpdateMember.MY_QNAME, factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
          org.apache.axiom.soap.SOAPFactory factory,
          CancelRoomReservation param,
          boolean optimizeContent,
          javax.xml.namespace.QName elementQName)
          throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
              .getBody()
              .addChild(
                      param.getOMElement(
                              CancelRoomReservation.MY_QNAME, factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  /**
   * get the default envelope
   */
  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory) {
    return factory.getDefaultEnvelope();
  }

  private java.lang.Object fromOM(org.apache.axiom.om.OMElement param, java.lang.Class type)
          throws org.apache.axis2.AxisFault {

    try {

      if (CancelRoomReservation.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
                CancelRoomReservation.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (CancelRoomReservationResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
                CancelRoomReservationResponse.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (CreateRoomReservation.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
                CreateRoomReservation.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (CreateRoomReservationResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
                CreateRoomReservationResponse.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (CreateUpdateAcademicExperience.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
                CreateUpdateAcademicExperience.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (CreateUpdateAcademicExperienceResponse.class.equals(
              type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
                CreateUpdateAcademicExperienceResponse.Factory.parse(
                        reader);
        reader.close();
        return result;
      }

      if (CreateUpdateEvent.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
                CreateUpdateEvent.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (CreateUpdateEventResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
                CreateUpdateEventResponse.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (CreateUpdateMember.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
                CreateUpdateMember.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (CreateUpdateMemberResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
                CreateUpdateMemberResponse.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (CreateUpdateTransaction.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
                CreateUpdateTransaction.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (CreateUpdateTransactionResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
                CreateUpdateTransactionResponse.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (CreateUpdateUser.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
                CreateUpdateUser.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (CreateUpdateUserResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
                CreateUpdateUserResponse.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (CreateUpdateWorkExperience.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
                CreateUpdateWorkExperience.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (CreateUpdateWorkExperienceResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
                CreateUpdateWorkExperienceResponse.Factory.parse(
                        reader);
        reader.close();
        return result;
      }

    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
    return null;
  }
}
