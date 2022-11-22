# MulticastGroup

A multicast group.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The ID of the multicast group. | [optional] 
**arn** | **str** | The arn of the multicast group. | [optional] 
**name** | **str** | The name of the multicast group. | [optional] 

## Example

```python
from openapi_client.models.multicast_group import MulticastGroup

# TODO update the JSON string below
json = "{}"
# create an instance of MulticastGroup from a JSON string
multicast_group_instance = MulticastGroup.from_json(json)
# print the JSON string representation of the object
print(MulticastGroup.to_json())

# convert the object into a dict
multicast_group_dict = multicast_group_instance.to_dict()
# create an instance of MulticastGroup from a dict
multicast_group_from_dict = MulticastGroup.from_dict(multicast_group_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


