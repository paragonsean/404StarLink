# RemoveAttributesRequestUpdateAttributesRequest

Specifies one or more attributes to remove from all the endpoints that are associated with an application.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blacklist** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.remove_attributes_request_update_attributes_request import RemoveAttributesRequestUpdateAttributesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of RemoveAttributesRequestUpdateAttributesRequest from a JSON string
remove_attributes_request_update_attributes_request_instance = RemoveAttributesRequestUpdateAttributesRequest.from_json(json)
# print the JSON string representation of the object
print(RemoveAttributesRequestUpdateAttributesRequest.to_json())

# convert the object into a dict
remove_attributes_request_update_attributes_request_dict = remove_attributes_request_update_attributes_request_instance.to_dict()
# create an instance of RemoveAttributesRequestUpdateAttributesRequest from a dict
remove_attributes_request_update_attributes_request_from_dict = RemoveAttributesRequestUpdateAttributesRequest.from_dict(remove_attributes_request_update_attributes_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


