# APNSVoipSandboxChannelResponse

Provides information about the status and settings of the APNs (Apple Push Notification service) VoIP sandbox channel for an application.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application_id** | **str** |  | [optional] 
**creation_date** | **str** |  | [optional] 
**default_authentication_method** | **str** |  | [optional] 
**enabled** | **bool** |  | [optional] 
**has_credential** | **bool** |  | [optional] 
**has_token_key** | **bool** |  | [optional] 
**id** | **str** |  | [optional] 
**is_archived** | **bool** |  | [optional] 
**last_modified_by** | **str** |  | [optional] 
**last_modified_date** | **str** |  | [optional] 
**platform** | **str** |  | 
**version** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.apns_voip_sandbox_channel_response import APNSVoipSandboxChannelResponse

# TODO update the JSON string below
json = "{}"
# create an instance of APNSVoipSandboxChannelResponse from a JSON string
apns_voip_sandbox_channel_response_instance = APNSVoipSandboxChannelResponse.from_json(json)
# print the JSON string representation of the object
print(APNSVoipSandboxChannelResponse.to_json())

# convert the object into a dict
apns_voip_sandbox_channel_response_dict = apns_voip_sandbox_channel_response_instance.to_dict()
# create an instance of APNSVoipSandboxChannelResponse from a dict
apns_voip_sandbox_channel_response_from_dict = APNSVoipSandboxChannelResponse.from_dict(apns_voip_sandbox_channel_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


