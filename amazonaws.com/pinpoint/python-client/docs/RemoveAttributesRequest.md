# RemoveAttributesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**update_attributes_request** | [**RemoveAttributesRequestUpdateAttributesRequest**](RemoveAttributesRequestUpdateAttributesRequest.md) |  | 

## Example

```python
from openapi_client.models.remove_attributes_request import RemoveAttributesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of RemoveAttributesRequest from a JSON string
remove_attributes_request_instance = RemoveAttributesRequest.from_json(json)
# print the JSON string representation of the object
print(RemoveAttributesRequest.to_json())

# convert the object into a dict
remove_attributes_request_dict = remove_attributes_request_instance.to_dict()
# create an instance of RemoveAttributesRequest from a dict
remove_attributes_request_from_dict = RemoveAttributesRequest.from_dict(remove_attributes_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


