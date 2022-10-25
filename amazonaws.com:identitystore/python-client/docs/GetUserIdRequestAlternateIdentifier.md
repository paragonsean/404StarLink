# GetUserIdRequestAlternateIdentifier


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**external_id** | [**AlternateIdentifierExternalId**](AlternateIdentifierExternalId.md) |  | [optional] 
**unique_attribute** | [**AlternateIdentifierUniqueAttribute**](AlternateIdentifierUniqueAttribute.md) |  | [optional] 

## Example

```python
from openapi_client.models.get_user_id_request_alternate_identifier import GetUserIdRequestAlternateIdentifier

# TODO update the JSON string below
json = "{}"
# create an instance of GetUserIdRequestAlternateIdentifier from a JSON string
get_user_id_request_alternate_identifier_instance = GetUserIdRequestAlternateIdentifier.from_json(json)
# print the JSON string representation of the object
print(GetUserIdRequestAlternateIdentifier.to_json())

# convert the object into a dict
get_user_id_request_alternate_identifier_dict = get_user_id_request_alternate_identifier_instance.to_dict()
# create an instance of GetUserIdRequestAlternateIdentifier from a dict
get_user_id_request_alternate_identifier_from_dict = GetUserIdRequestAlternateIdentifier.from_dict(get_user_id_request_alternate_identifier_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


