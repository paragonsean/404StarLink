# GetGroupIdResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**group_id** | **str** |  | 
**identity_store_id** | **str** |  | 

## Example

```python
from openapi_client.models.get_group_id_response import GetGroupIdResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetGroupIdResponse from a JSON string
get_group_id_response_instance = GetGroupIdResponse.from_json(json)
# print the JSON string representation of the object
print(GetGroupIdResponse.to_json())

# convert the object into a dict
get_group_id_response_dict = get_group_id_response_instance.to_dict()
# create an instance of GetGroupIdResponse from a dict
get_group_id_response_from_dict = GetGroupIdResponse.from_dict(get_group_id_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


