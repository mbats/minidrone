/**
 * Copyright (c) 2016 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Obeo - initial API and implementation
 *
 */

#ifndef JSPILOTINGMINIMALCOMMANDS_H_
#define JSPILOTINGMINIMALCOMMANDS_H_

/*****************************************
 *
 *             include
 *
 *****************************************/
#include <stdlib.h>
#include <curses.h>
#include <string.h>
#include <unistd.h>

#include <ARDroneSDK_Unix/include/libARSAL/ARSAL.h>
#include <ARDroneSDK_Unix/include/libARController/ARController.h>
#include <ARDroneSDK_Unix/include/libARDiscovery/ARDiscovery.h>

/*****************************************
 *
 *             define :
 *
 *****************************************/
#define TAG_JS_CMD "JSPilotingMinCommands"
#define TAG_MAIN "Main"
#define JS_IP_ADDRESS "192.168.2.1"
#define JS_DISCOVERY_PORT 44444
#define JUMP_LONG 0
#define JUMP_HIGH 1
#define JUMP_MAX 2
ARSAL_Sem_t stateSem;

// called to create and init a discovery device; implies a JS discovery device creation with Wifi init
ARDISCOVERY_Device_t * createInitDiscoveryDevice();

// called to create a device controller
ARCONTROLLER_Device_t * createDeviceController(ARDISCOVERY_Device_t *discoveryDevice);

// called to add a state change callback to a device controller to be notified when the device controller starts, stops
int addStateChangeCallbackToDeviceController(ARCONTROLLER_Device_t *deviceController, ARCONTROLLER_Device_StateChangedCallback_t *stateChangedCallback);

// called to add a command reception callback to a device controller to be notified when a command has been received from JS
int addCommandReceivedCallbackToDeviceController(ARCONTROLLER_Device_t *deviceController, ARCONTROLLER_DICTIONARY_CALLBACK_t commandReceivedCallback);

// called to start the device controller implies a wifi connection between our system (Unix laptop) and the JS as result
int startDeviceController(ARCONTROLLER_Device_t *deviceController);

// called to stop the device controller implies a wifi disconnection between our system(Unix laptop) and the JS as result
void stopDeviceController(ARCONTROLLER_Device_t *deviceController);

// called to get the state of the JS
eARCONTROLLER_DEVICE_STATE getDeviceState(ARCONTROLLER_Device_t *deviceController,ARSAL_Sem_t stateSem, eARCONTROLLER_DEVICE_STATE deviceState );

// called when a command has been received from the drone
//void commandReceived (eARCONTROLLER_DICTIONARY_KEY commandKey, ARCONTROLLER_DICTIONARY_ELEMENT_t *elementDictionary, void *customData);

// called when the state of the device controller has changed
//void stateChanged (eARCONTROLLER_DEVICE_STATE newState, eARCONTROLLER_ERROR error, void *customData,ARSAL_Sem_t stateSem);

// called to send a jump command to the JS
int sendJumpCommand(ARCONTROLLER_Device_t *deviceController,int jumpType);

// called to send a forward command to the JS
int sendGoCommand(ARCONTROLLER_Device_t *deviceController,int distance);

// called to send a right roll command to the JS
int sendRightRollCommand(ARCONTROLLER_Device_t *deviceController,int angle);

#endif /* JSPILOTINGMINIMALCOMMANDS_H_ */
