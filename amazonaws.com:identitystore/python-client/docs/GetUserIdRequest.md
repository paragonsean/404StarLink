# GetUserIdRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identity_store_id** | **str** |  | 
**alternate_identifier** | [**GetUserIdRequestAlternateIdentifier**](GetUserIdRequestAlternateIdentifier.md) |  | 

## Example

```python
from openapi_client.models.get_user_id_request import GetUserIdRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GetUserIdRequest from a JSON string
get_user_id_request_instance = GetUserIdRequest.from_json(json)
# print the JSON string representation of the object
print(GetUserIdRequest.to_json())

# convert the object into a dict
get_user_id_request_dict = get_user_id_request_instance.to_dict()
# create an instance of GetUserIdRequest from a dict
get_user_id_request_from_dict = GetUserIdRequest.from_dict(get_user_id_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


