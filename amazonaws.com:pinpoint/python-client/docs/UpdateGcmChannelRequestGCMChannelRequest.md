# UpdateGcmChannelRequestGCMChannelRequest

Specifies the status and settings of the GCM channel for an application. This channel enables Amazon Pinpoint to send push notifications through the Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), service.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**api_key** | **str** |  | [optional] 
**enabled** | **bool** |  | [optional] 

## Example

```python
from openapi_client.models.update_gcm_channel_request_gcm_channel_request import UpdateGcmChannelRequestGCMChannelRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateGcmChannelRequestGCMChannelRequest from a JSON string
update_gcm_channel_request_gcm_channel_request_instance = UpdateGcmChannelRequestGCMChannelRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateGcmChannelRequestGCMChannelRequest.to_json())

# convert the object into a dict
update_gcm_channel_request_gcm_channel_request_dict = update_gcm_channel_request_gcm_channel_request_instance.to_dict()
# create an instance of UpdateGcmChannelRequestGCMChannelRequest from a dict
update_gcm_channel_request_gcm_channel_request_from_dict = UpdateGcmChannelRequestGCMChannelRequest.from_dict(update_gcm_channel_request_gcm_channel_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


