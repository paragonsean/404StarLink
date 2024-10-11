# GetUserIdResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**user_id** | **str** |  | 
**identity_store_id** | **str** |  | 

## Example

```python
from openapi_client.models.get_user_id_response import GetUserIdResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetUserIdResponse from a JSON string
get_user_id_response_instance = GetUserIdResponse.from_json(json)
# print the JSON string representation of the object
print(GetUserIdResponse.to_json())

# convert the object into a dict
get_user_id_response_dict = get_user_id_response_instance.to_dict()
# create an instance of GetUserIdResponse from a dict
get_user_id_response_from_dict = GetUserIdResponse.from_dict(get_user_id_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


