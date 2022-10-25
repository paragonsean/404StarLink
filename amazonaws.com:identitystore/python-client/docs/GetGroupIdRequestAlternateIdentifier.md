# GetGroupIdRequestAlternateIdentifier


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**external_id** | [**AlternateIdentifierExternalId**](AlternateIdentifierExternalId.md) |  | [optional] 
**unique_attribute** | [**AlternateIdentifierUniqueAttribute**](AlternateIdentifierUniqueAttribute.md) |  | [optional] 

## Example

```python
from openapi_client.models.get_group_id_request_alternate_identifier import GetGroupIdRequestAlternateIdentifier

# TODO update the JSON string below
json = "{}"
# create an instance of GetGroupIdRequestAlternateIdentifier from a JSON string
get_group_id_request_alternate_identifier_instance = GetGroupIdRequestAlternateIdentifier.from_json(json)
# print the JSON string representation of the object
print(GetGroupIdRequestAlternateIdentifier.to_json())

# convert the object into a dict
get_group_id_request_alternate_identifier_dict = get_group_id_request_alternate_identifier_instance.to_dict()
# create an instance of GetGroupIdRequestAlternateIdentifier from a dict
get_group_id_request_alternate_identifier_from_dict = GetGroupIdRequestAlternateIdentifier.from_dict(get_group_id_request_alternate_identifier_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


