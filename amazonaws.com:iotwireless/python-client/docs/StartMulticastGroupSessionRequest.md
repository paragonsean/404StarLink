# StartMulticastGroupSessionRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lo_ra_wan** | [**StartMulticastGroupSessionRequestLoRaWAN**](StartMulticastGroupSessionRequestLoRaWAN.md) |  | 

## Example

```python
from openapi_client.models.start_multicast_group_session_request import StartMulticastGroupSessionRequest

# TODO update the JSON string below
json = "{}"
# create an instance of StartMulticastGroupSessionRequest from a JSON string
start_multicast_group_session_request_instance = StartMulticastGroupSessionRequest.from_json(json)
# print the JSON string representation of the object
print(StartMulticastGroupSessionRequest.to_json())

# convert the object into a dict
start_multicast_group_session_request_dict = start_multicast_group_session_request_instance.to_dict()
# create an instance of StartMulticastGroupSessionRequest from a dict
start_multicast_group_session_request_from_dict = StartMulticastGroupSessionRequest.from_dict(start_multicast_group_session_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


