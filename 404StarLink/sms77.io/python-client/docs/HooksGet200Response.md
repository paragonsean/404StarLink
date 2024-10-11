# HooksGet200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hooks** | [**List[HooksGet200ResponseHooksInner]**](HooksGet200ResponseHooksInner.md) |  | [optional] 
**success** | **bool** |  | [optional] 

## Example

```python
from openapi_client.models.hooks_get200_response import HooksGet200Response

# TODO update the JSON string below
json = "{}"
# create an instance of HooksGet200Response from a JSON string
hooks_get200_response_instance = HooksGet200Response.from_json(json)
# print the JSON string representation of the object
print(HooksGet200Response.to_json())

# convert the object into a dict
hooks_get200_response_dict = hooks_get200_response_instance.to_dict()
# create an instance of HooksGet200Response from a dict
hooks_get200_response_from_dict = HooksGet200Response.from_dict(hooks_get200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


