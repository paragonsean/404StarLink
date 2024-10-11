# ListMulticastGroupsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**next_token** | **str** |  | [optional] 
**multicast_group_list** | [**List[MulticastGroup]**](MulticastGroup.md) | List of multicast groups. | [optional] 

## Example

```python
from openapi_client.models.list_multicast_groups_response import ListMulticastGroupsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListMulticastGroupsResponse from a JSON string
list_multicast_groups_response_instance = ListMulticastGroupsResponse.from_json(json)
# print the JSON string representation of the object
print(ListMulticastGroupsResponse.to_json())

# convert the object into a dict
list_multicast_groups_response_dict = list_multicast_groups_response_instance.to_dict()
# create an instance of ListMulticastGroupsResponse from a dict
list_multicast_groups_response_from_dict = ListMulticastGroupsResponse.from_dict(list_multicast_groups_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


