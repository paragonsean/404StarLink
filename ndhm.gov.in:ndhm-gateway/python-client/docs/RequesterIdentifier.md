# RequesterIdentifier


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**system** | **str** |  | [optional] 
**type** | **str** |  | [optional] 
**value** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.requester_identifier import RequesterIdentifier

# TODO update the JSON string below
json = "{}"
# create an instance of RequesterIdentifier from a JSON string
requester_identifier_instance = RequesterIdentifier.from_json(json)
# print the JSON string representation of the object
print(RequesterIdentifier.to_json())

# convert the object into a dict
requester_identifier_dict = requester_identifier_instance.to_dict()
# create an instance of RequesterIdentifier from a dict
requester_identifier_from_dict = RequesterIdentifier.from_dict(requester_identifier_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


