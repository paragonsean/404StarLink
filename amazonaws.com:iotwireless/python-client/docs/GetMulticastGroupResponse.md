# GetMulticastGroupResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arn** | **str** | The arn of the multicast group. | [optional] 
**id** | **str** | The ID of the multicast group. | [optional] 
**name** | **str** | The name of the multicast group. | [optional] 
**description** | **str** | The description of the new resource. | [optional] 
**status** | **str** | The status of the multicast group. | [optional] 
**lo_ra_wan** | [**LoRaWANMulticastGet**](LoRaWANMulticastGet.md) |  | [optional] 
**created_at** | **datetime** | Created at timestamp for the resource. | [optional] 

## Example

```python
from openapi_client.models.get_multicast_group_response import GetMulticastGroupResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetMulticastGroupResponse from a JSON string
get_multicast_group_response_instance = GetMulticastGroupResponse.from_json(json)
# print the JSON string representation of the object
print(GetMulticastGroupResponse.to_json())

# convert the object into a dict
get_multicast_group_response_dict = get_multicast_group_response_instance.to_dict()
# create an instance of GetMulticastGroupResponse from a dict
get_multicast_group_response_from_dict = GetMulticastGroupResponse.from_dict(get_multicast_group_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


