# ClientStringTranslation


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | **str** |  | [optional] 
**last_changed** | **datetime** | the date-time notation as defined by RFC 3339, section 5.6, for example, 2017-07-21T17:32:28Z | [optional] 
**resource** | **str** |  | [optional] 
**resource_id** | **str** |  | [optional] 
**state** | **str** |  | [optional] 
**target_language** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.client_string_translation import ClientStringTranslation

# TODO update the JSON string below
json = "{}"
# create an instance of ClientStringTranslation from a JSON string
client_string_translation_instance = ClientStringTranslation.from_json(json)
# print the JSON string representation of the object
print(ClientStringTranslation.to_json())

# convert the object into a dict
client_string_translation_dict = client_string_translation_instance.to_dict()
# create an instance of ClientStringTranslation from a dict
client_string_translation_from_dict = ClientStringTranslation.from_dict(client_string_translation_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


