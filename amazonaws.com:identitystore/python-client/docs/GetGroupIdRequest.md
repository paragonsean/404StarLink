# GetGroupIdRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identity_store_id** | **str** |  | 
**alternate_identifier** | [**GetGroupIdRequestAlternateIdentifier**](GetGroupIdRequestAlternateIdentifier.md) |  | 

## Example

```python
from openapi_client.models.get_group_id_request import GetGroupIdRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GetGroupIdRequest from a JSON string
get_group_id_request_instance = GetGroupIdRequest.from_json(json)
# print the JSON string representation of the object
print(GetGroupIdRequest.to_json())

# convert the object into a dict
get_group_id_request_dict = get_group_id_request_instance.to_dict()
# create an instance of GetGroupIdRequest from a dict
get_group_id_request_from_dict = GetGroupIdRequest.from_dict(get_group_id_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


