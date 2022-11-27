# GCMChannelResponse

Provides information about the status and settings of the GCM channel for an application. The GCM channel enables Amazon Pinpoint to send push notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application_id** | **str** |  | [optional] 
**creation_date** | **str** |  | [optional] 
**credential** | **str** |  | 
**enabled** | **bool** |  | [optional] 
**has_credential** | **bool** |  | [optional] 
**id** | **str** |  | [optional] 
**is_archived** | **bool** |  | [optional] 
**last_modified_by** | **str** |  | [optional] 
**last_modified_date** | **str** |  | [optional] 
**platform** | **str** |  | 
**version** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.gcm_channel_response import GCMChannelResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GCMChannelResponse from a JSON string
gcm_channel_response_instance = GCMChannelResponse.from_json(json)
# print the JSON string representation of the object
print(GCMChannelResponse.to_json())

# convert the object into a dict
gcm_channel_response_dict = gcm_channel_response_instance.to_dict()
# create an instance of GCMChannelResponse from a dict
gcm_channel_response_from_dict = GCMChannelResponse.from_dict(gcm_channel_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


