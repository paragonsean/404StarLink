# ClientStringWithTranslations


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | **str** |  | [optional] 
**language** | **str** |  | [optional] 
**last_changed** | **datetime** | the date-time notation as defined by RFC 3339, section 5.6, for example, 2017-07-21T17:32:28Z | [optional] 
**translations** | [**List[ClientStringTranslation]**](ClientStringTranslation.md) |  | [optional] 

## Example

```python
from openapi_client.models.client_string_with_translations import ClientStringWithTranslations

# TODO update the JSON string below
json = "{}"
# create an instance of ClientStringWithTranslations from a JSON string
client_string_with_translations_instance = ClientStringWithTranslations.from_json(json)
# print the JSON string representation of the object
print(ClientStringWithTranslations.to_json())

# convert the object into a dict
client_string_with_translations_dict = client_string_with_translations_instance.to_dict()
# create an instance of ClientStringWithTranslations from a dict
client_string_with_translations_from_dict = ClientStringWithTranslations.from_dict(client_string_with_translations_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


