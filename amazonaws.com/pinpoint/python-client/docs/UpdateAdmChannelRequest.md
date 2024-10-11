# UpdateAdmChannelRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adm_channel_request** | [**UpdateAdmChannelRequestADMChannelRequest**](UpdateAdmChannelRequestADMChannelRequest.md) |  | 

## Example

```python
from openapi_client.models.update_adm_channel_request import UpdateAdmChannelRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateAdmChannelRequest from a JSON string
update_adm_channel_request_instance = UpdateAdmChannelRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateAdmChannelRequest.to_json())

# convert the object into a dict
update_adm_channel_request_dict = update_adm_channel_request_instance.to_dict()
# create an instance of UpdateAdmChannelRequest from a dict
update_adm_channel_request_from_dict = UpdateAdmChannelRequest.from_dict(update_adm_channel_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


