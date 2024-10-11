# UpdateAttributesRequest

Specifies one or more attributes to remove from all the endpoints that are associated with an application.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blacklist** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.update_attributes_request import UpdateAttributesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateAttributesRequest from a JSON string
update_attributes_request_instance = UpdateAttributesRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateAttributesRequest.to_json())

# convert the object into a dict
update_attributes_request_dict = update_attributes_request_instance.to_dict()
# create an instance of UpdateAttributesRequest from a dict
update_attributes_request_from_dict = UpdateAttributesRequest.from_dict(update_attributes_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


