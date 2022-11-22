# UpdateMulticastGroupRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The name of the multicast group. | [optional] 
**description** | **str** | The description of the new resource. | [optional] 
**lo_ra_wan** | [**CreateMulticastGroupRequestLoRaWAN**](CreateMulticastGroupRequestLoRaWAN.md) |  | [optional] 

## Example

```python
from openapi_client.models.update_multicast_group_request import UpdateMulticastGroupRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateMulticastGroupRequest from a JSON string
update_multicast_group_request_instance = UpdateMulticastGroupRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateMulticastGroupRequest.to_json())

# convert the object into a dict
update_multicast_group_request_dict = update_multicast_group_request_instance.to_dict()
# create an instance of UpdateMulticastGroupRequest from a dict
update_multicast_group_request_from_dict = UpdateMulticastGroupRequest.from_dict(update_multicast_group_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


