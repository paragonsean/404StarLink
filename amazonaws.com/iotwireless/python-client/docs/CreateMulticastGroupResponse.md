# CreateMulticastGroupResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arn** | **str** | The arn of the multicast group. | [optional] 
**id** | **str** | The ID of the multicast group. | [optional] 

## Example

```python
from openapi_client.models.create_multicast_group_response import CreateMulticastGroupResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CreateMulticastGroupResponse from a JSON string
create_multicast_group_response_instance = CreateMulticastGroupResponse.from_json(json)
# print the JSON string representation of the object
print(CreateMulticastGroupResponse.to_json())

# convert the object into a dict
create_multicast_group_response_dict = create_multicast_group_response_instance.to_dict()
# create an instance of CreateMulticastGroupResponse from a dict
create_multicast_group_response_from_dict = CreateMulticastGroupResponse.from_dict(create_multicast_group_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


