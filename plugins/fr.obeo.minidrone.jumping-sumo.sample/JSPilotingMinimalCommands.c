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

/*****************************************
 *
 *             include
 *
 *****************************************/
#include "JSPilotingMinimalCommands.h"


/*****************************************
 *
 *             private implementation
 *
 ****************************************/

ARDISCOVERY_Device_t * createInitDiscoveryDevice()
{
	eARDISCOVERY_ERROR errorDiscovery = ARDISCOVERY_OK;
	ARDISCOVERY_Device_t *discoveryDevice = NULL;

	discoveryDevice = ARDISCOVERY_Device_New(&errorDiscovery);

	if(errorDiscovery == ARDISCOVERY_OK)
	{
		//create a specific JS discovery device
		errorDiscovery = ARDISCOVERY_Device_InitWifi(discoveryDevice, ARDISCOVERY_PRODUCT_JS,"JS",JS_IP_ADDRESS,JS_DISCOVERY_PORT);

		if(errorDiscovery != ARDISCOVERY_OK)
		{
            ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG_JS_CMD, "Discovery error :%s", ARDISCOVERY_Error_ToString(errorDiscovery));
			return NULL;
		}
	}
	else
	{
		 ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG_JS_CMD, "Discovery error :%s", ARDISCOVERY_Error_ToString(errorDiscovery));
		 return NULL;
	}

	ARSAL_PRINT (ARSAL_PRINT_INFO, TAG_JS_CMD, "Creation of discovery device succeeded");
	return discoveryDevice;
}

ARCONTROLLER_Device_t * createDeviceController(ARDISCOVERY_Device_t *discoveryDevice)
{
    eARCONTROLLER_ERROR errorController = ARCONTROLLER_OK;
    ARCONTROLLER_Device_t *deviceController = NULL;

    deviceController = ARCONTROLLER_Device_New (discoveryDevice, &errorController);

    if(errorController != ARCONTROLLER_OK)
    {
        ARSAL_PRINT (ARSAL_PRINT_ERROR, TAG_JS_CMD, "Creation of device controller failed.");
    	return NULL;
    }
    ARSAL_PRINT (ARSAL_PRINT_INFO, TAG_JS_CMD, "Creation of device controller succeeded.");
    ARDISCOVERY_Device_Delete(&discoveryDevice);
    return deviceController;
}



int startDeviceController(ARCONTROLLER_Device_t *deviceController)
{
	int failed = 0;
	eARCONTROLLER_ERROR errorController = ARCONTROLLER_OK;
    ARSAL_PRINT(ARSAL_PRINT_INFO, TAG_JS_CMD, "Start device controller and try connecting...");
	errorController = ARCONTROLLER_Device_Start(deviceController);

	if(errorController != ARCONTROLLER_OK)
	{
        ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG_JS_CMD, " start device controller failed ...");
        failed = 1;
	}
	return failed;
}

void stopDeviceController(ARCONTROLLER_Device_t *deviceController)
{
	eARCONTROLLER_ERROR errorController = ARCONTROLLER_OK;
    ARSAL_PRINT(ARSAL_PRINT_INFO, TAG_JS_CMD, "disconnecting ...");
	errorController = ARCONTROLLER_Device_Start(deviceController);

	if(errorController != ARCONTROLLER_OK)
	{
		ARSAL_PRINT (ARSAL_PRINT_ERROR, TAG_JS_CMD, "add callback failed.");
	}
}

eARCONTROLLER_DEVICE_STATE getDeviceState(ARCONTROLLER_Device_t *deviceController,ARSAL_Sem_t stateSem, eARCONTROLLER_DEVICE_STATE deviceState )
{
	// wait state update update
	ARSAL_Sem_Wait (&(stateSem));

	eARCONTROLLER_ERROR errorController = ARCONTROLLER_OK;
	deviceState = ARCONTROLLER_Device_GetState(deviceController,&errorController);

	if ((errorController != ARCONTROLLER_OK) || (deviceState != ARCONTROLLER_DEVICE_STATE_RUNNING))
	{
		ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG_JS_CMD, "- deviceState :%d", deviceState);
		ARSAL_PRINT(ARSAL_PRINT_ERROR, TAG_JS_CMD, "- error :%s", ARCONTROLLER_Error_ToString(errorController));
	}
	return deviceState;
}

int sendJumpCommand(ARCONTROLLER_Device_t *deviceController,int jumpType)
{
	int failed = 0;
	eARCONTROLLER_ERROR errorController = ARCONTROLLER_OK;

	switch (jumpType) {
		case JUMP_HIGH:
			errorController = deviceController->jumpingSumo->sendAnimationsJump (deviceController->jumpingSumo,ARCOMMANDS_JUMPINGSUMO_ANIMATIONS_JUMP_TYPE_HIGH);
			break;
		case JUMP_LONG:
			errorController = deviceController->jumpingSumo->sendAnimationsJump (deviceController->jumpingSumo,ARCOMMANDS_JUMPINGSUMO_ANIMATIONS_JUMP_TYPE_LONG);
			break;
		case JUMP_MAX:
			errorController = deviceController->jumpingSumo->sendAnimationsJump (deviceController->jumpingSumo,ARCOMMANDS_JUMPINGSUMO_ANIMATIONS_JUMP_TYPE_MAX);
			break;
		default:
			break;
	}

	if(errorController != ARCONTROLLER_OK){
		ARSAL_PRINT (ARSAL_PRINT_ERROR, TAG_JS_CMD, "send jump command failed ...");
		failed = 1;
	}
	return failed;
}

int sendGoCommand(ARCONTROLLER_Device_t *deviceController,int distance)
{
	int failed = 0;
	eARCONTROLLER_ERROR errorController = ARCONTROLLER_OK;
	errorController = deviceController->jumpingSumo->setPilotingPCMDFlag (deviceController->jumpingSumo, 1);
	errorController = deviceController->jumpingSumo->setPilotingPCMDSpeed (deviceController->jumpingSumo, distance);

	if(errorController != ARCONTROLLER_OK){
		ARSAL_PRINT (ARSAL_PRINT_ERROR, TAG_JS_CMD, "send go command failed ...");
		failed = 1;
	}
	return failed;

}

int sendTurnCommand(ARCONTROLLER_Device_t *deviceController,int angle)
{
	int failed = 0;
	eARCONTROLLER_ERROR errorController = ARCONTROLLER_OK;
	 errorController = deviceController->jumpingSumo->setPilotingPCMDFlag (deviceController->jumpingSumo, 1);
	 errorController = deviceController->jumpingSumo->setPilotingPCMDTurn (deviceController->jumpingSumo, angle);

	if(errorController != ARCONTROLLER_OK){
		ARSAL_PRINT (ARSAL_PRINT_ERROR, TAG_JS_CMD, "send turn command failed");
		failed = 1;
	}
	return failed;
}
