# APNSVoipChannelRequest

Specifies the status and settings of the APNs (Apple Push Notification service) VoIP channel for an application.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bundle_id** | **str** |  | [optional] 
**certificate** | **str** |  | [optional] 
**default_authentication_method** | **str** |  | [optional] 
**enabled** | **bool** |  | [optional] 
**private_key** | **str** |  | [optional] 
**team_id** | **str** |  | [optional] 
**token_key** | **str** |  | [optional] 
**token_key_id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.apns_voip_channel_request import APNSVoipChannelRequest

# TODO update the JSON string below
json = "{}"
# create an instance of APNSVoipChannelRequest from a JSON string
apns_voip_channel_request_instance = APNSVoipChannelRequest.from_json(json)
# print the JSON string representation of the object
print(APNSVoipChannelRequest.to_json())

# convert the object into a dict
apns_voip_channel_request_dict = apns_voip_channel_request_instance.to_dict()
# create an instance of APNSVoipChannelRequest from a dict
apns_voip_channel_request_from_dict = APNSVoipChannelRequest.from_dict(apns_voip_channel_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


