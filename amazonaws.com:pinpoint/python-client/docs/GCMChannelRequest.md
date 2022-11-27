# GCMChannelRequest

Specifies the status and settings of the GCM channel for an application. This channel enables Amazon Pinpoint to send push notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**api_key** | **str** |  | 
**enabled** | **bool** |  | [optional] 

## Example

```python
from openapi_client.models.gcm_channel_request import GCMChannelRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GCMChannelRequest from a JSON string
gcm_channel_request_instance = GCMChannelRequest.from_json(json)
# print the JSON string representation of the object
print(GCMChannelRequest.to_json())

# convert the object into a dict
gcm_channel_request_dict = gcm_channel_request_instance.to_dict()
# create an instance of GCMChannelRequest from a dict
gcm_channel_request_from_dict = GCMChannelRequest.from_dict(gcm_channel_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


