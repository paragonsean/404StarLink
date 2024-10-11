# ADMChannelRequest

Specifies the status and settings of the ADM (Amazon Device Messaging) channel for an application.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client_id** | **str** |  | 
**client_secret** | **str** |  | 
**enabled** | **bool** |  | [optional] 

## Example

```python
from openapi_client.models.adm_channel_request import ADMChannelRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ADMChannelRequest from a JSON string
adm_channel_request_instance = ADMChannelRequest.from_json(json)
# print the JSON string representation of the object
print(ADMChannelRequest.to_json())

# convert the object into a dict
adm_channel_request_dict = adm_channel_request_instance.to_dict()
# create an instance of ADMChannelRequest from a dict
adm_channel_request_from_dict = ADMChannelRequest.from_dict(adm_channel_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


