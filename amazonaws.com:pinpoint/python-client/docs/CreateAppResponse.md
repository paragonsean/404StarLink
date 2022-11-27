# CreateAppResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application_response** | [**ApplicationResponse**](ApplicationResponse.md) |  | 

## Example

```python
from openapi_client.models.create_app_response import CreateAppResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CreateAppResponse from a JSON string
create_app_response_instance = CreateAppResponse.from_json(json)
# print the JSON string representation of the object
print(CreateAppResponse.to_json())

# convert the object into a dict
create_app_response_dict = create_app_response_instance.to_dict()
# create an instance of CreateAppResponse from a dict
create_app_response_from_dict = CreateAppResponse.from_dict(create_app_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


