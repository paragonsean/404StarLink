# DeleteAppResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application_response** | [**ApplicationResponse**](ApplicationResponse.md) |  | 

## Example

```python
from openapi_client.models.delete_app_response import DeleteAppResponse

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteAppResponse from a JSON string
delete_app_response_instance = DeleteAppResponse.from_json(json)
# print the JSON string representation of the object
print(DeleteAppResponse.to_json())

# convert the object into a dict
delete_app_response_dict = delete_app_response_instance.to_dict()
# create an instance of DeleteAppResponse from a dict
delete_app_response_from_dict = DeleteAppResponse.from_dict(delete_app_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


