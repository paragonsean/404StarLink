# AlternateIdentifier

A unique identifier for a user or group that is not the primary identifier. This value can be an identifier from an external identity provider (IdP) that is associated with the user, the group, or a unique attribute.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**external_id** | [**AlternateIdentifierExternalId**](AlternateIdentifierExternalId.md) |  | [optional] 
**unique_attribute** | [**AlternateIdentifierUniqueAttribute**](AlternateIdentifierUniqueAttribute.md) |  | [optional] 

## Example

```python
from openapi_client.models.alternate_identifier import AlternateIdentifier

# TODO update the JSON string below
json = "{}"
# create an instance of AlternateIdentifier from a JSON string
alternate_identifier_instance = AlternateIdentifier.from_json(json)
# print the JSON string representation of the object
print(AlternateIdentifier.to_json())

# convert the object into a dict
alternate_identifier_dict = alternate_identifier_instance.to_dict()
# create an instance of AlternateIdentifier from a dict
alternate_identifier_from_dict = AlternateIdentifier.from_dict(alternate_identifier_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


