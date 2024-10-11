# UpdateAdmChannelRequestADMChannelRequest

Specifies the status and settings of the ADM (Amazon Device Messaging) channel for an application.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client_id** | **str** |  | [optional] 
**client_secret** | **str** |  | [optional] 
**enabled** | **bool** |  | [optional] 

## Example

```python
from openapi_client.models.update_adm_channel_request_adm_channel_request import UpdateAdmChannelRequestADMChannelRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateAdmChannelRequestADMChannelRequest from a JSON string
update_adm_channel_request_adm_channel_request_instance = UpdateAdmChannelRequestADMChannelRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateAdmChannelRequestADMChannelRequest.to_json())

# convert the object into a dict
update_adm_channel_request_adm_channel_request_dict = update_adm_channel_request_adm_channel_request_instance.to_dict()
# create an instance of UpdateAdmChannelRequestADMChannelRequest from a dict
update_adm_channel_request_adm_channel_request_from_dict = UpdateAdmChannelRequestADMChannelRequest.from_dict(update_adm_channel_request_adm_channel_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


