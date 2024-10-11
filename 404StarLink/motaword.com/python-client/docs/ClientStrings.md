# ClientStrings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**meta** | [**PagingMeta**](PagingMeta.md) |  | [optional] 
**strings** | [**List[ClientStringWithTranslations]**](ClientStringWithTranslations.md) |  | [optional] 

## Example

```python
from openapi_client.models.client_strings import ClientStrings

# TODO update the JSON string below
json = "{}"
# create an instance of ClientStrings from a JSON string
client_strings_instance = ClientStrings.from_json(json)
# print the JSON string representation of the object
print(ClientStrings.to_json())

# convert the object into a dict
client_strings_dict = client_strings_instance.to_dict()
# create an instance of ClientStrings from a dict
client_strings_from_dict = ClientStrings.from_dict(client_strings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


