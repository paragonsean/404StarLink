# GetMulticastGroupSessionResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lo_ra_wan** | [**LoRaWANMulticastSession**](LoRaWANMulticastSession.md) |  | [optional] 

## Example

```python
from openapi_client.models.get_multicast_group_session_response import GetMulticastGroupSessionResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetMulticastGroupSessionResponse from a JSON string
get_multicast_group_session_response_instance = GetMulticastGroupSessionResponse.from_json(json)
# print the JSON string representation of the object
print(GetMulticastGroupSessionResponse.to_json())

# convert the object into a dict
get_multicast_group_session_response_dict = get_multicast_group_session_response_instance.to_dict()
# create an instance of GetMulticastGroupSessionResponse from a dict
get_multicast_group_session_response_from_dict = GetMulticastGroupSessionResponse.from_dict(get_multicast_group_session_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


